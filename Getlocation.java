package com.example.user.biscuit;

import android.os.AsyncTask;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Getlocation extends AsyncTask<String,Void,String> {
    Weather context;

    TextView result1;
    EditText loc;
    StringBuffer sb;
    InputStreamReader isr;
    InputStream is;
    BufferedReader br;
    ProgressBar pb1;
    public Getlocation(Weather weather, EditText location, TextView result, ProgressBar pb) {
        this.context=weather;
        this.result1=result;
        this.loc=location;
        this.pb1=pb;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... strings) {
        String loc1=strings[0];

        String response;
        String url=" https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22"+loc1+"%2C%20ak%22)&format=json";

        try {
            URL urlobject=new URL(url);
            HttpURLConnection httpURLConnection= (HttpURLConnection) urlobject.openConnection();
            is=httpURLConnection.getInputStream();
            isr=new InputStreamReader(is);
            br=new BufferedReader(isr);
            sb=new StringBuffer();
            while ((response=br.readLine())!=null){
                sb.append(response);
            }
            return sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        String code=null;
        String date=null;
        String day=null;
        String high=null;
        String low=null;
        String text=null;
        try {
            JSONObject rootobject=new JSONObject(s);
            JSONObject queryobject=rootobject.getJSONObject("query");
            JSONObject results=queryobject.getJSONObject("results");
            JSONObject channel=results.getJSONObject("channel");
            JSONObject items=channel.getJSONObject("item");
            JSONObject conditions=items.getJSONObject("condition");

            JSONArray jsonArray=items.getJSONArray( "forecast");
            JSONObject jo=jsonArray.getJSONObject(0);
            for (int i=0;i<jsonArray.length();i++)
            {
                code=jo.getString( "code");
                date=jo.getString("date");
                day=jo.getString( "day");
                high=jo.getString("high");
                low=jo.getString("low");
                text=jo.getString( "text");
            }
            String date1=conditions.getString("date");
            String temp1=conditions.getString("temp");
            String text1=conditions.getString( "text");
            int t=Integer.parseInt(temp1);
            double ft=(t-32)*0.5559;
            int at=(int)ft;
            pb1.setVisibility(View.GONE);
            result1.setText(code+"\n"+date+"\n"+day+"\n"+high+""+low+"\n"+text+"\n"+date+"\n"+temp1+"\n"+text1);


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

package com.example.user.biscuit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Weather extends AppCompatActivity {




    EditText locationn;

    TextView Result;
    Getlocation getlocation;
    ProgressBar pb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        locationn=findViewById(R.id.loc_id);
        Result=findViewById(R.id.tv1);
        pb=findViewById(R.id.progressbar);

    }

    public void button(View view) {
        String loc=locationn.getText().toString();
        pb.setVisibility(view.VISIBLE);
        Getlocation getlocation=new Getlocation(Weather.this, locationn,Result,pb);
        getlocation.execute(loc);
    }
}
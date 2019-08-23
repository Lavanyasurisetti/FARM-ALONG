package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class V_Search extends AppCompatActivity {
    Button search;
//    ImageButton img;
    String[] spinlist = {"Anantapur" ,"Krishna",
            "Kurnool",
            "Prakasam",
            "Chittoor" ,
            "East Godavari",
            "Guntur","Srikakulam",
            "Sri Potti Sriramulu Nellore",
            "Visakhapatnam",
            "Vizianagaram",
            "West Godavari",
            "YSR District", "Kadapa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v__search);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, spinlist);
        MaterialBetterSpinner betterSpinner =(MaterialBetterSpinner)findViewById(R.id.loc);
        betterSpinner.setAdapter(arrayAdapter);
//        img =(ImageButton)findViewById(R.id.home);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(V_Search.this, DashboardActivity.class);
//                startActivity(i);
//
//            }
//        });
        search =(Button)findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(V_Search.this,Visakhaptanam.class);
                startActivity(i);
            }
        });
    }
}

package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class CentralSchemes extends AppCompatActivity {
    ImageButton cs1, cs2, cs3,img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_schemes);


        cs1 =(ImageButton)findViewById(R.id.cs1);
        cs2 =(ImageButton)findViewById(R.id.cs2);
        cs3 =(ImageButton)findViewById(R.id.cs3);
        img =(ImageButton)findViewById(R.id.home);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CentralSchemes.this, DashboardActivity.class);
                startActivity(i);

            }
        });

        cs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CentralSchemes.this,Cs1.class);
                startActivity(i);
            }
        });
        cs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CentralSchemes.this,Cs2.class);
                startActivity(i);
            }
        });
        cs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CentralSchemes.this,Cs3.class);
                startActivity(i);
            }
        });
    }
}

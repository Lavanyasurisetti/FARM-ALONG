package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Tips extends AppCompatActivity {

    ImageButton rice, wheat, banana, mango, sugarcane, cotton,img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);


        rice = findViewById(R.id.rice);
        wheat = findViewById(R.id.wheat);
        cotton = findViewById(R.id.cotton);
        sugarcane = findViewById(R.id.sugarcane);
        mango = findViewById(R.id.mango);
        banana = findViewById(R.id.banana);

        img =(ImageButton)findViewById(R.id.home);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this, DashboardActivity.class);
                startActivity(i);

            }
        });


        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this,Rice.class);
                startActivity(i);
            }
        });
        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this,Mango.class);
                startActivity(i);
            }
        });
        sugarcane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this,Sugarcane.class);
                startActivity(i);
            }
        });
        cotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this,Cotton.class);
                startActivity(i);
            }
        });
        wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this,Wheat.class);
                startActivity(i);
            }
        });
        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this,Banana.class);
                startActivity(i);
            }
        });
    }
}

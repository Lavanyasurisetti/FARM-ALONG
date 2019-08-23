package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class StateSchemes extends AppCompatActivity {

    ImageButton ss1, ss2, ss3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_schemes);


        ss1 =(ImageButton)findViewById(R.id.ss1);
        ss2 =(ImageButton)findViewById(R.id.ss2);
        ss3 =(ImageButton)findViewById(R.id.ss3);
//        img =(ImageButton)findViewById(R.id.home);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(StateSchemes.this, DashboardActivity.class);
//                startActivity(i);
//
//            }
//        });

        ss1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StateSchemes.this,Ss1.class);
                startActivity(i);
            }
        });
        ss2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StateSchemes.this,Ss2.class);
                startActivity(i);
            }
        });
        ss3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StateSchemes.this,Ss3.class);
                startActivity(i);
            }
        });
    }
}





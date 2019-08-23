package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class DashboardActivity extends AppCompatActivity {

    ImageButton emandi, mentors, weather, schemes, tips, volunteers,organic,transport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        emandi = findViewById(R.id.emandi);
        mentors = findViewById(R.id.mentors);
        schemes = findViewById(R.id.schemes);
        tips = findViewById(R.id.tips);
        volunteers = findViewById(R.id.volunteers);
        weather = findViewById(R.id.weather);
        organic = findViewById(R.id.organic);
        transport = findViewById(R.id.transport);
        emandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this,Emandi.class);
                startActivity(i);
            }
        });
        schemes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this,Schemes.class);
                startActivity(i);
            }
        });
        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this,Weather.class);
                startActivity(i);
            }
        });
        mentors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this,Mentors.class);
                startActivity(i);
            }
        });
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this,Tips.class);
                startActivity(i);
            }
        });
        volunteers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this,Volunteers.class);
                startActivity(i);
            }
        });
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this,TransportActivity.class);
                startActivity(i);
            }
        });
        organic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this,OrganicActivity.class);
                startActivity(i);
            }
        });

    }
}

package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Emandi extends AppCompatActivity {

    public Button button5,button6;
    ImageButton img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emandi);
        button5=findViewById(R.id.button5);
        img =(ImageButton)findViewById(R.id.home);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Emandi.this, DashboardActivity.class);
                startActivity(i);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search();
            }
        });
        button6=findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search1();
            }
        });
    }
    public void search()
    {
        Intent intent=new Intent(this, Buyer.class);
        startActivity(intent);
    }
    public void search1()
    {
        Intent intent=new Intent(this,Farmer.class);
        startActivity(intent);
    }
}

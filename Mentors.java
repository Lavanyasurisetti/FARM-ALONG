package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Mentors extends AppCompatActivity {


        public Button asc,as;
        ImageButton img;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mentors);
            asc=findViewById(R.id.asc);
            img =(ImageButton)findViewById(R.id.home);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Mentors.this, DashboardActivity.class);
                    startActivity(i);

                }
            });
            asc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    search();
                }
            });
            as=findViewById(R.id.as);
            as.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    search1();
                }
            });
        }
        public void search()
        {
            Intent intent=new Intent(this, Agriscientist.class);
            startActivity(intent);
        }
        public void search1()
        {
            Intent intent=new Intent(this,Agristudent.class);
            startActivity(intent);
        }
    }

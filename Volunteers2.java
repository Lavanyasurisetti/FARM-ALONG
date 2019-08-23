package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Volunteers2 extends AppCompatActivity {
    Button search, upload, generate;
//    ImageButton img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteers2);

        search =(Button)findViewById(R.id.search);
        upload =(Button)findViewById(R.id.upload);
        generate =(Button)findViewById(R.id.generate);
//        img =(ImageButton)findViewById(R.id.home);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Volunteers2.this, DashboardActivity.class);
//                startActivity(i);
//
//            }
//        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Volunteers2.this,V_Search.class);
                startActivity(i);


            }
        });
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Volunteers2.this,V_Upload.class);
                startActivity(i);


            }
        });
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Volunteers2.this,V_Generate.class);
                startActivity(i);

            }
        });
    }
}

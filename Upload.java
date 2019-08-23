package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Upload extends AppCompatActivity {
//    ImageButton img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
//        img =(ImageButton)findViewById(R.id.home);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Upload.this, DashboardActivity.class);
//                startActivity(i);
//
//            }
//        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Upload.this, Farmer.class));
                finish();
            }
        },3000);
    }
}

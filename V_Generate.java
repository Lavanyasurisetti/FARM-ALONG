package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class V_Generate extends AppCompatActivity {

    Button gc;
//    ImageButton img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v__generate);
        gc=(Button)findViewById(R.id.gc);
//        img =(ImageButton)findViewById(R.id.home);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(V_Generate.this, DashboardActivity.class);
//                startActivity(i);
//
//            }
//        });
        gc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(V_Generate.this,Certificate.class);
                startActivity(i);

            }
        });
    }
}

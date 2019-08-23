package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class New extends AppCompatActivity {
    String st,st1,st2,st3,st4,st5;
    TextView tv,tv1,tv2,tv3,tv4,tv5;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        b=findViewById(R.id.button);
        tv = findViewById(R.id.name);
        tv1=findViewById(R.id.crop);
        tv2 = findViewById(R.id.quant);
        tv3=findViewById(R.id.cost);
        tv4 = findViewById(R.id.mob);
        tv5=findViewById(R.id.addr);
        st = getIntent().getExtras().getString("Name");
        st1=getIntent().getExtras().getString("Crop");
        st2 = getIntent().getExtras().getString("Quant");
        st3=getIntent().getExtras().getString("Cost");
        st4 = getIntent().getExtras().getString("Mob");
        st5=getIntent().getExtras().getString("Addr");
        tv.setText(st);
        tv1.setText(st1);
        tv2.setText(st2);
        tv3.setText(st3);
        tv4.setText(st4);
        tv5.setText(st5);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(New.this,Farmer.class);
                startActivity(i);

            }
        });

    }
}



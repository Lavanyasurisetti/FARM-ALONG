package com.example.user.biscuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Farmer extends AppCompatActivity {


    public Button upload;
    EditText editText1, editText2, editText3, editText4, editText5, editText6;
    ImageButton img;
    String st,st1,st2,st3,st4,st5;
    DatabaseReference databaseCrop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer);

        databaseCrop = FirebaseDatabase.getInstance().getReference("Crops");
//        editText7 =(EditText)findViewById(R.id.editText7);
        editText1 =(EditText)findViewById(R.id.editText1);
        editText2 =(EditText)findViewById(R.id.editText2);
        editText3 =(EditText)findViewById(R.id.editText3);
        editText4 =(EditText)findViewById(R.id.editText4);
        editText5 =(EditText)findViewById(R.id.editText5);
        editText6 =(EditText)findViewById(R.id.editText6);

        img =(ImageButton)findViewById(R.id.home);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Farmer.this, DashboardActivity.class);
                startActivity(i);

            }
        });

        upload=findViewById(R.id.upload);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addCrop();
            }
        });

    }

    private void addCrop() {

//String adhaar = editText7.getText().toString().trim();
        String fname = editText1.getText().toString().trim();

        String pname = editText2.getText().toString().trim();
        String quant = editText3.getText().toString().trim();
        String cost = editText4.getText().toString().trim();
        String mob = editText5.getText().toString().trim();
        String addr = editText6.getText().toString().trim();


        if (!TextUtils.isEmpty(fname) && !TextUtils.isEmpty(pname) && !TextUtils.isEmpty(quant) &&!TextUtils.isEmpty(cost) &&
                !TextUtils.isEmpty(mob) && !TextUtils.isEmpty(addr)) {
            String id = databaseCrop.push().getKey();
            Crop crop = new Crop(id,fname, pname, quant, cost, mob, addr);
            databaseCrop.child(id).setValue(crop);
            Toast.makeText(this, "Crop added", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "You should enter name", Toast.LENGTH_SHORT).show();

        }
        upload();
    }
    public void upload()
    {
        Intent intent=new Intent(Farmer.this,New.class);
       st = editText1.getText().toString();
        st1=editText2.getText().toString();
        st2 = editText3.getText().toString();
        st3=editText4.getText().toString();
        st4= editText5.getText().toString();
        st5=editText6.getText().toString();
       intent.putExtra("Name",st);
        intent.putExtra("Crop",st1);
        intent.putExtra("Quant",st2);
        intent.putExtra("Cost",st3);
        intent.putExtra("Mob",st4);
        intent.putExtra("Addr",st5);
        startActivity(intent);

        finish();



    }

//
//    public void upload1()
//    {
//        Intent intent=new Intent(this,List.class);
//        st = editText1.getText().toString();
//        st1=editText2.getText().toString();
//        intent.putExtra("Name",st);
//        intent.putExtra("Crop",st1);
//        startActivity(intent);
//
//        finish();
//        upload1();
//
//    }


}

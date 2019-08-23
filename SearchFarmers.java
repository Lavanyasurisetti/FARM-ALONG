package com.example.user.biscuit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;

public class SearchFarmers extends AppCompatActivity {

    DatabaseReference databaseCrop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_farmers);




    }

    @Override
    protected void onStart() {
        super.onStart();


    }
}

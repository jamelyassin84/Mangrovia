package com.example.mangroveappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
    }
    public void launchPolicy(View v) {
        //launch a new activity
        Intent i = new Intent(this, Policy.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}
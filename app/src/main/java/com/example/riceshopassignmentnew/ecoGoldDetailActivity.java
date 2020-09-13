package com.example.riceshopassignmentnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ecoGoldDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_gold_detail);
    }

    public void back(View view) {
        Intent intent = new Intent(ecoGoldDetailActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
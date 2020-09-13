package com.example.riceshopassignmentnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AppleGoldDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple_gold_detail);
    }

    public void back(View view) {
        Intent intent = new Intent(AppleGoldDetailActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
package com.example.riceshopassignmentnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


    }

    public void back(View view) {
        Intent intent = new Intent(AboutActivity.this, HomePageActivity.class);
        startActivity(intent);
    }
}
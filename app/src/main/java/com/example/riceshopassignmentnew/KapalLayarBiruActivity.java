package com.example.riceshopassignmentnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KapalLayarBiruActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kapal_layar_biru);
    }

    public void back(View view) {
        Intent intent = new Intent(KapalLayarBiruActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
package com.example.riceshopassignmentnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout picJatiSuper;
    private LinearLayout picJatiRebus;
    private LinearLayout picKapalLayarBiru;
    private LinearLayout picCarnationAppleGold;
    private LinearLayout picecoBrownsGold;
    private LinearLayout picecoBrownsOriginal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picJatiSuper = (LinearLayout) findViewById(R.id.JatiSuperArea);
        picJatiRebus = (LinearLayout) findViewById(R.id.JatiRebusArea);
        picKapalLayarBiru = (LinearLayout) findViewById(R.id.KapalLayarBiruArea);
        picCarnationAppleGold = (LinearLayout) findViewById(R.id.AppleGoldArea);
        picecoBrownsGold = (LinearLayout) findViewById(R.id.eCoBrownGOLDArea);
        picecoBrownsOriginal = (LinearLayout) findViewById(R.id.ecoBrownOriginalArea);

        picJatiSuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, JatiSuperDetailActivity.class);
                startActivity(int1);
            }
        });

        picJatiRebus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(MainActivity.this, JatiRebusDetailActivity.class);
                startActivity(int2);
            }
        });

        picKapalLayarBiru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(MainActivity.this, KapalLayarBiruActivity.class);
                startActivity(int3);
            }
        });

        picCarnationAppleGold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(MainActivity.this, AppleGoldDetailActivity.class);
                startActivity(int4);
            }
        });

        picecoBrownsGold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5 = new Intent(MainActivity.this, ecoGoldDetailActivity.class);
                startActivity(int5);
            }
        });

        picecoBrownsOriginal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6 = new Intent(MainActivity.this, ecoOriginalDetailActivity.class);
                startActivity(int6);
            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
        startActivity(intent);
    }
}

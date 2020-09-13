package com.example.riceshopassignmentnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomePageActivity extends AppCompatActivity {

    private CardView picMenu;
    private CardView picOrder;
    private CardView picPayment;
    private CardView picAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        picMenu = (CardView) findViewById(R.id.cardView1);
        picOrder = (CardView) findViewById(R.id.cardView2);
        picPayment = (CardView) findViewById(R.id.cardView3);
        picAbout = (CardView) findViewById(R.id.cardView4);

        picMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(HomePageActivity.this, MainActivity.class);
                startActivity(int1);
            }
        });


        picAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(HomePageActivity.this, AboutActivity.class);
                startActivity(int4);
            }
        });

    }
}
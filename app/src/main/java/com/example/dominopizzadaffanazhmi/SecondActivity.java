package com.example.dominopizzadaffanazhmi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    public ImageView btnPindah;
    public ImageView btnPizza;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnPindah = findViewById(R.id.usepromo);
        btnPizza = findViewById(R.id.pizza);

        //        PINDAH HALAMAN
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(itn);
            }
        });

        btnPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itun = new Intent(getApplicationContext(), FiveActivity.class);
                startActivity(itun);
            }
        });
    }
}
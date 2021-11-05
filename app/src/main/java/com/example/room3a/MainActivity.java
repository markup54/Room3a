package com.example.room3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProduktDatabase db = ProduktDatabase
                .getInstance(getApplicationContext());
        Produkt p1 = new Produkt("komputer",3000);
        db.produktDao().wstawProdukt(p1);
        Produkt p2 = new Produkt("monitor",1000);
        db.produktDao().wstawProdukt(p2);
    }
}
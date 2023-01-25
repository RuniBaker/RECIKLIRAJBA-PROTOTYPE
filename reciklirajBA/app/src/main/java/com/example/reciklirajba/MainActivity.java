package com.example.reciklirajba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        try {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, kategorija_otpada.class);
                    startActivity(intent);
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Gorazde_map.class);
                    startActivity(intent);
                }
            });
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
        try {
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, oznake_na_ambalazama.class);
                    startActivity(intent);
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

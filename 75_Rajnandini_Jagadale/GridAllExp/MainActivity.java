package com.example.gridallexp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);

        btn1.setOnClickListener(v -> {
            Intent i = new Intent();
            i.setClassName("com.example.llvertical",
                    "com.example.llvertical.MainActivity");
            startActivity(i);
        });

        btn2.setOnClickListener(v -> {
            Intent i = new Intent();
            i.setClassName("com.example.llhorizontal",
                    "com.example.llhorizontal.MainActivity");
            startActivity(i);
        });

        btn3.setOnClickListener(v -> {
            Intent i = new Intent();
            i.setClassName("com.example.framel",
                    "com.example.framel.MainActivity");
            startActivity(i);
        });

        btn4.setOnClickListener(v -> {
            Intent i = new Intent();
            i.setClassName("com.example.relativel",
                    "com.example.relativel.MainActivity");
            startActivity(i);
        });

        btn5.setOnClickListener(v -> {
            Intent i = new Intent();
            i.setClassName("com.example.tablel",
                    "com.example.tablel.MainActivity");
            startActivity(i);
        });

        btn6.setOnClickListener(v -> {
            Intent i = new Intent();
            i.setClassName("com.example.constraintl",
                    "com.example.constraintl.MainActivity");
            startActivity(i);
        });

        btn7.setOnClickListener(v -> {
            Intent i = new Intent();
            i.setClassName("com.example.listlayout",
                    "com.example.listlayout.MainActivity");
            startActivity(i);
        });

        btn8.setOnClickListener(v -> {
            Intent i = new Intent();
            i.setClassName("com.example.gridlayout",
                    "com.example.gridlayout.MainActivity");
            startActivity(i);
        });
    }
}
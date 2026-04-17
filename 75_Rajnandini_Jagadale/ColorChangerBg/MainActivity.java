package com.example.colorchanger;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout rootLayout;
    Button btnRed, btnGreen, btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootLayout = findViewById(R.id.rootLayout);
        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnBlue = findViewById(R.id.btnBlue);

        btnRed.setOnClickListener(v ->
                rootLayout.setBackgroundColor(Color.RED)
        );

        btnGreen.setOnClickListener(v ->
                rootLayout.setBackgroundColor(Color.GREEN)
        );

        btnBlue.setOnClickListener(v ->
                rootLayout.setBackgroundColor(Color.BLUE)
        );
    }
}

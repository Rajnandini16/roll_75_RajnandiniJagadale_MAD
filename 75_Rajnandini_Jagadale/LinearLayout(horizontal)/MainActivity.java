package com.example.llhorizontal;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout leftPart, rightPart;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftPart = findViewById(R.id.leftPart);
        rightPart = findViewById(R.id.rightPart);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(v ->
                leftPart.setBackgroundColor(Color.parseColor("#C8E6C9"))
        );

        button2.setOnClickListener(v ->
                rightPart.setBackgroundColor(Color.parseColor("#FFE0B2"))
        );
    }
}

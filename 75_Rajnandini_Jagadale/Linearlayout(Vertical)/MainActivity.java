package com.example.llvertical;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout topPart, bottomPart;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topPart = findViewById(R.id.topPart);
        bottomPart = findViewById(R.id.bottomPart);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(v ->
                topPart.setBackgroundColor(Color.parseColor("#FFCDD2"))
        );

        button2.setOnClickListener(v ->
                bottomPart.setBackgroundColor(Color.parseColor("#BBDEFB"))
        );
    }
}

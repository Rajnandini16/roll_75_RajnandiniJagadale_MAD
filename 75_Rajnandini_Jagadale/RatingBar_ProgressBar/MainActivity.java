package com.example.ratingbar_progressbar;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    RatingBar ratingBar;
    Button btnStart, btnSubmit;
    TextView txtProgress;

    int progressStatus = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        ratingBar = findViewById(R.id.ratingBar);
        btnStart = findViewById(R.id.btnStart);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtProgress = findViewById(R.id.txtProgress);

        // Start ProgressBar
        btnStart.setOnClickListener(v -> {
            progressStatus = 0;

            new Thread(() -> {
                while (progressStatus < 100) {
                    progressStatus += 10;

                    handler.post(() -> {
                        progressBar.setProgress(progressStatus);
                        txtProgress.setText(progressStatus + "%");
                    });

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        });

        // RatingBar submit
        btnSubmit.setOnClickListener(v -> {
            float rating = ratingBar.getRating();
            Toast.makeText(MainActivity.this,
                    "Rating: " + rating,
                    Toast.LENGTH_SHORT).show();
        });
    }
}
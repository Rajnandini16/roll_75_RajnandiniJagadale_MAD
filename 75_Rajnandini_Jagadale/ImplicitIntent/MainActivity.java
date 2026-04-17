package com.example.implicitintent;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity {

    Button btnMyntra, btnMaps, btnCallSpecific, btnDialAny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMyntra = findViewById(R.id.btnMyntra);
        btnMaps = findViewById(R.id.btnMaps);
        btnCallSpecific = findViewById(R.id.btnCallSpecific);
        btnDialAny = findViewById(R.id.btnDialAny);

        // Open Myntra Website
        btnMyntra.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.myntra.com"));
            startActivity(intent);
        });

        // Open Google Maps
        btnMaps.setOnClickListener(view -> {
            Uri uri = Uri.parse("geo:0,0?q=restaurants");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
        });

        // Call Specific Number
        btnCallSpecific.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:8605099299"));
            ActivityCompat.requestPermissions(MainActivity.this,
                    new String[]{Manifest.permission.CALL_PHONE}, 1);
            startActivity(intent);
        });

        // Dial Any Number
        btnDialAny.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            startActivity(intent);
        });
    }
}

package com.example.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {
            if (username.getText().toString().equals("admin") &&
                    password.getText().toString().equals("1234")) {

                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);

            } else {
                Toast.makeText(MainActivity.this, "Invalid Login", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
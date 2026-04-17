package com.example.regisdetails;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText, emailEditText, phoneEditText, cityEditText;
    Button submitButton;


    @Override
    protected void onResume() {
        super.onResume();

        nameEditText.setText("");
        emailEditText.setText("");
        phoneEditText.setText("");
        cityEditText.setText("");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.editTextText);
        emailEditText = findViewById(R.id.editTextText2);
        phoneEditText = findViewById(R.id.editTextText3);
        cityEditText = findViewById(R.id.editTextText4);
        submitButton = findViewById(R.id.button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString().trim();
                String phone = phoneEditText.getText().toString().trim();


                Intent intent = new Intent();
                intent.setClassName("com.example.regismembers",
                        "com.example.regismembers.MainActivity");

                intent.putExtra("name", name);
                intent.putExtra("phone", phone);

                startActivity(intent);




            }
        });
    }
}
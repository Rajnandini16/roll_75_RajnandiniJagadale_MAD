package com.example.internalstorage;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView resultText;
    Button saveBtn, readBtn;

    String fileName = "myFile.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        resultText = findViewById(R.id.resultText);
        saveBtn = findViewById(R.id.saveBtn);
        readBtn = findViewById(R.id.readBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = editText.getText().toString();

                try {
                    FileOutputStream fos = openFileOutput(fileName, MODE_PRIVATE);
                    fos.write(text.getBytes());
                    fos.close();

                    Toast.makeText(MainActivity.this, "Data Saved", Toast.LENGTH_SHORT).show();
                    editText.setText("");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        readBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    FileInputStream fis = openFileInput(fileName);
                    int c;
                    String temp = "";

                    while ((c = fis.read()) != -1) {
                        temp = temp + (char) c;
                    }

                    fis.close();
                    resultText.setText(temp);

                } catch (Exception e) {
                    resultText.setText("No Data Found");
                }
            }
        });
    }
}
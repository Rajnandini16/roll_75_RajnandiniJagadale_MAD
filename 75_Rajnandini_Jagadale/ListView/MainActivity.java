package com.example.listlayout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] items = {
            "Apple",
            "Banana",
            "Mango",
            "Orange",
            "Grapes",
            "Pineapple",
            "Strawberry"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                items
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selected = items[position];
            Toast.makeText(MainActivity.this,
                    "You clicked: " + selected,
                    Toast.LENGTH_SHORT).show();
        });
    }
}
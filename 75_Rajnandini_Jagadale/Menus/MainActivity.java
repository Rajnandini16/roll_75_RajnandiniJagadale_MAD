package com.example.menus;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Create menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "Settings");
        menu.add(0, 2, 0, "About");
        menu.add(0, 3, 0, "Exit");
        return true;
    }

    // Handle menu clicks
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show();
                return true;

            case 2:
                Toast.makeText(this, "About Clicked", Toast.LENGTH_SHORT).show();
                return true;

            case 3:
                finish(); // closes app
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
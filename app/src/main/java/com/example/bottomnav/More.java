package com.example.bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class More extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("");
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.navigation_more);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.navigation_services:
                        startActivity(new Intent(getApplicationContext(), Services.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.navigation_explore:
                        startActivity(new Intent(getApplicationContext(),Explore.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.navigation_more:
                        return true;
                }
                return false;
            }
        });
    }
}
package com.example.bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Agricultural Services");
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.navigation_services);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.navigation_services:
                        return true;
                    case R.id.navigation_explore:
                        startActivity(new Intent(getApplicationContext(),Explore.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.navigation_more:
                        startActivity(new Intent(getApplicationContext(), More.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
package com.example.group8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Log_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        this.getSupportActionBar().hide();
    }
}
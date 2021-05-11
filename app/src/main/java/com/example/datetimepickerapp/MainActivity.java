package com.example.datetimepickerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openTimePicker(View view) {

        Intent timePickerIntent = new Intent(MainActivity.this, TimePickerActivity.class);
        startActivity(timePickerIntent);
    }

    public void openDatePicker(View view) {
        Intent datePickerIntent = new Intent(MainActivity.this, DatePickerActivity.class);
        startActivity(datePickerIntent);
    }
}
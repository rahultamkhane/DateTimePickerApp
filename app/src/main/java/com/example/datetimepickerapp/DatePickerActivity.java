package com.example.datetimepickerapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Date;

public class DatePickerActivity extends AppCompatActivity {

    private DatePicker datePicker;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        datePicker = findViewById(R.id.myDatePicker);
        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                Toast.makeText(getApplicationContext(), "Date changed: " + day + "/" + (month+1) + "/" + year, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showDate(View view) {
        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();
        int year = datePicker.getYear();
        StringBuffer sb = new StringBuffer();
        sb.append(day).append("/").append(month+1).append("/").append(year);
        Toast.makeText(getApplicationContext(), "Selected date is: " + sb, Toast.LENGTH_SHORT).show();
    }
}
package com.example.datetimepickerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerActivity extends AppCompatActivity {

    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        timePicker = findViewById(R.id.myTimePicker);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hr, int min) {
                Toast.makeText(getApplicationContext(), "Time changed : " + hr + ":"+min, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showTime(View view) {

        int hr = timePicker.getCurrentHour();
        int min = timePicker.getCurrentMinute();

        Toast.makeText(getApplicationContext(), "Selected Time is : " + hr + ":"+min, Toast.LENGTH_SHORT).show();
    }
}
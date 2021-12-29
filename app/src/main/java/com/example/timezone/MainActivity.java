package com.example.timezone;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    TextView tve1;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tve1 = (TextView) findViewById(R.id.tve1);
        String dzam = "GMT+0837";
        TimeZone tz = TimeZone.getTimeZone(dzam);
        tve1.setText(dzam);
        AlarmManager am = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
        am.setTimeZone(dzam);
    }
}
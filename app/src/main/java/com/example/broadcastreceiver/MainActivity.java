package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    BatteryReceiver batteryReceiver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.battery_level);

       batteryReceiver = new BatteryReceiver(textView);
       registerReceiver(batteryReceiver,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));


    }

    @Override
    protected void onStop() {
        super.onStop();

        unregisterReceiver(batteryReceiver);

    }
}
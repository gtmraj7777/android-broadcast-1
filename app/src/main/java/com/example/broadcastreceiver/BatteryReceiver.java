package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class BatteryReceiver extends BroadcastReceiver {

  TextView  textView;

    public BatteryReceiver(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

   int batteryPercentage = intent.getIntExtra("level",0);

       if(batteryPercentage != 0){
           textView.setText("Battery Level : "+batteryPercentage+"");

       }


    }
}

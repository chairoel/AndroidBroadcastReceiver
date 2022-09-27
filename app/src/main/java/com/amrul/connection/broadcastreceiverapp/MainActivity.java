package com.amrul.connection.broadcastreceiverapp;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ConnectionReceiver exampleBroadcastReceiver = new ConnectionReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter filter = new IntentFilter("com.amrul.connection.EXAMPLE_ACTION");
        registerReceiver(exampleBroadcastReceiver, filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(exampleBroadcastReceiver);
    }
}
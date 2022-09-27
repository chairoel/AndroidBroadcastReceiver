package com.amrul.connection.broadcastreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ConnectionReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if ("com.amrul.connection.EXAMPLE_ACTION".equals(intent.getAction())){
            String receivedText = intent.getStringExtra("com.amrul.connection.EXTRA_TEXT");
            Toast.makeText(context, receivedText, Toast.LENGTH_SHORT).show();
        }
//        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
//            boolean noConnectivity = intent.getBooleanExtra(
//                    ConnectivityManager.EXTRA_NO_CONNECTIVITY, false
//            );
//            if (noConnectivity) {
//                Toast.makeText(context, "Disconnected", Toast.LENGTH_SHORT).show();
//            } else {
//                Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
//            }
//        }
    }
}

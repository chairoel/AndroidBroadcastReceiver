package com.amrul.connection.testapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;
import android.widget.Toast;

public class ConnectionReceiver extends BroadcastReceiver {
    Context context;

    @Override
    public void onReceive(Context context, Intent intent) {
        final ConnectivityManager connMgr = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
//
        final android.net.NetworkInfo wifi = connMgr
                .getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        final android.net.NetworkInfo mobile = connMgr
                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);


        if (wifi.isAvailable() || mobile.isAvailable()) {
            // Do something
            Toast.makeText(context, "Network Available ", Toast.LENGTH_SHORT).show();

            Log.d("Network Available ", "Flag No 1");
        }
//        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
//            boolean noConnectivity = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false);
//            if (noConnectivity) {
//                Toast.makeText(context, "Disconnected", Toast.LENGTH_SHORT).show();
//            } else {
//                Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
//            }
//        }

    }

}

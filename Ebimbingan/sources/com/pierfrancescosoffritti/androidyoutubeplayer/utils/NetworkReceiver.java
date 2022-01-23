package com.pierfrancescosoffritti.androidyoutubeplayer.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NetworkReceiver extends BroadcastReceiver {
    private NetworkListener a;

    public interface NetworkListener {
        void onNetworkAvailable();

        void onNetworkUnavailable();
    }

    public NetworkReceiver(NetworkListener networkListener) {
        this.a = networkListener;
    }

    public void onReceive(Context context, Intent intent) {
        Intent intent2 = intent;
        if (Utils.isOnline(context)) {
            this.a.onNetworkAvailable();
        } else {
            this.a.onNetworkUnavailable();
        }
    }
}

package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

final class zzm implements zzn {
    private final PendingIntent zzav;
    private final Context zzl;

    zzm(Context context) {
        Intent intent;
        Context context2 = context;
        this.zzl = context2;
        new Intent();
        this.zzav = PendingIntent.getBroadcast(context2, 0, intent.setPackage("com.google.example.invalidpackage"), 0);
    }

    public final boolean zzd(Task task) {
        Bundle bundle;
        Intent zzh = zzh("SCHEDULE_TASK");
        new Bundle();
        Bundle bundle2 = bundle;
        task.toBundle(bundle2);
        Intent putExtras = zzh.putExtras(bundle2);
        this.zzl.sendBroadcast(zzh);
        return true;
    }

    public final boolean zzd(ComponentName componentName, String str) {
        Intent zzh = zzh("CANCEL_TASK");
        Intent intent = zzh;
        Intent putExtra = zzh.putExtra("component", componentName);
        Intent putExtra2 = intent.putExtra("tag", str);
        this.zzl.sendBroadcast(intent);
        return true;
    }

    public final boolean zzd(ComponentName componentName) {
        Intent zzh = zzh("CANCEL_ALL");
        Intent putExtra = zzh.putExtra("component", componentName);
        this.zzl.sendBroadcast(zzh);
        return true;
    }

    private final Intent zzh(String str) {
        Intent intent;
        new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        Intent intent2 = intent;
        Intent intent3 = intent2;
        Intent intent4 = intent2.setPackage("com.google.android.gms");
        Intent putExtra = intent3.putExtra("app", this.zzav);
        Intent putExtra2 = intent3.putExtra("source", 4);
        Intent putExtra3 = intent3.putExtra("source_version", 12451000);
        Intent putExtra4 = intent3.putExtra("scheduler_action", str);
        return intent3;
    }
}

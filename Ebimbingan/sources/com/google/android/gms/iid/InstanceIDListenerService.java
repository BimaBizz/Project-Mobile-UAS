package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

@Deprecated
public class InstanceIDListenerService extends zze {
    public InstanceIDListenerService() {
    }

    public void handleIntent(Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb;
        Bundle bundle;
        Intent intent2 = intent;
        if ("com.google.android.gms.iid.InstanceID".equals(intent2.getAction())) {
            Bundle bundle2 = null;
            String stringExtra = intent2.getStringExtra("subtype");
            String str5 = stringExtra;
            if (stringExtra != null) {
                new Bundle();
                Bundle bundle3 = bundle;
                bundle2 = bundle3;
                bundle3.putString("subtype", str5);
            }
            InstanceID instance = InstanceID.getInstance(this, bundle2);
            String stringExtra2 = intent2.getStringExtra("CMD");
            if (Log.isLoggable("InstanceID", 3)) {
                new StringBuilder(34 + String.valueOf(str5).length() + String.valueOf(stringExtra2).length());
                int d = Log.d("InstanceID", sb.append("Service command. subtype:").append(str5).append(" command:").append(stringExtra2).toString());
            }
            if ("RST".equals(stringExtra2)) {
                instance.zzo();
                onTokenRefresh();
            } else if ("RST_FULL".equals(stringExtra2)) {
                if (!InstanceID.zzp().isEmpty()) {
                    InstanceID.zzp().zzz();
                    onTokenRefresh();
                }
            } else if ("SYNC".equals(stringExtra2)) {
                String str6 = str5;
                zzak zzp = InstanceID.zzp();
                zzak zzak = zzp;
                zzak zzak2 = zzp;
                String valueOf = String.valueOf(str6);
                String valueOf2 = String.valueOf("|T|");
                String str7 = valueOf2;
                if (valueOf2.length() != 0) {
                    str2 = valueOf.concat(str7);
                } else {
                    String str8 = valueOf;
                    str2 = str;
                    new String(str8);
                }
                zzak.zzi(str2);
                zzak zzak3 = zzak2;
                String valueOf3 = String.valueOf(str6);
                String valueOf4 = String.valueOf("|T-timestamp|");
                String str9 = valueOf4;
                if (valueOf4.length() != 0) {
                    str4 = valueOf3.concat(str9);
                } else {
                    String str10 = valueOf3;
                    str4 = str3;
                    new String(str10);
                }
                zzak3.zzi(str4);
                onTokenRefresh();
            }
        }
    }

    static void zzd(Context context, zzak zzak) {
        Intent intent;
        Context context2 = context;
        zzak.zzz();
        new Intent("com.google.android.gms.iid.InstanceID");
        Intent intent2 = intent;
        Intent intent3 = intent2;
        Intent putExtra = intent2.putExtra("CMD", "RST");
        Intent className = intent3.setClassName(context2, "com.google.android.gms.gcm.GcmReceiver");
        context2.sendBroadcast(intent3);
    }

    public void onTokenRefresh() {
    }
}

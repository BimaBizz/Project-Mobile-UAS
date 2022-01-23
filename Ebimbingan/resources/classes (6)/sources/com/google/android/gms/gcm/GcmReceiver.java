package com.google.android.gms.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.iid.zzk;

@Deprecated
public class GcmReceiver extends WakefulBroadcastReceiver {
    private static boolean zzr = false;
    private static zzk zzs;
    private static zzk zzt;

    public GcmReceiver() {
    }

    public void onReceive(Context context, Intent intent) {
        int zze;
        int i;
        Context context2 = context;
        Intent intent2 = intent;
        if (Log.isLoggable("GcmReceiver", 3)) {
            int d = Log.d("GcmReceiver", "received new intent");
        }
        Intent component = intent2.setComponent((ComponentName) null);
        Intent intent3 = intent2.setPackage(context2.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent2.removeCategory(context2.getPackageName());
        }
        if ("google.com/iid".equals(intent2.getStringExtra("from"))) {
            Intent action = intent2.setAction("com.google.android.gms.iid.InstanceID");
        }
        String stringExtra = intent2.getStringExtra("gcm.rawData64");
        String str = stringExtra;
        if (stringExtra != null) {
            Intent putExtra = intent2.putExtra("rawData", Base64.decode(str, 0));
            intent2.removeExtra("gcm.rawData64");
        }
        if (isOrderedBroadcast()) {
            setResultCode(500);
        }
        Intent intent4 = intent2;
        Context context3 = context2;
        boolean z = PlatformVersion.isAtLeastO() && context3.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent4.getFlags() & 268435456) != 0;
        if (!z || z2) {
            if ("com.google.android.c2dm.intent.RECEIVE".equals(intent4.getAction())) {
                Context context4 = context3;
                Context context5 = context4;
                zze = zze(context4, intent4);
            } else {
                zze = zze(context3, intent4);
            }
            if (!PlatformVersion.isAtLeastO() || zze != 402) {
                i = zze;
            } else {
                int zzd = zzd(context3, intent4);
                i = 403;
            }
        } else {
            i = zzd(context3, intent4);
        }
        int i2 = i;
        if (isOrderedBroadcast()) {
            setResultCode(i2);
        }
    }

    private final int zzd(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (Log.isLoggable("GcmReceiver", 3)) {
            int d = Log.d("GcmReceiver", "Binding to service");
        }
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
        zzd(context2, intent2.getAction()).zzd(intent2, goAsync());
        return -1;
    }

    private final synchronized zzk zzd(Context context, String str) {
        zzk zzk;
        zzk zzk2;
        zzk zzk3;
        Context context2 = context;
        String str2 = str;
        synchronized (this) {
            if ("com.google.android.c2dm.intent.RECEIVE".equals(str2)) {
                if (zzt == null) {
                    new zzk(context2, str2);
                    zzt = zzk3;
                }
                zzk = zzt;
            } else {
                if (zzs == null) {
                    new zzk(context2, str2);
                    zzs = zzk2;
                }
                zzk = zzs;
            }
        }
        return zzk;
    }

    private static int zze(Context context, Intent intent) {
        StringBuilder sb;
        ComponentName startService;
        StringBuilder sb2;
        String str;
        String str2;
        String str3;
        String str4;
        Context context2 = context;
        Intent intent2 = intent;
        if (Log.isLoggable("GcmReceiver", 3)) {
            int d = Log.d("GcmReceiver", "Starting service");
        }
        Intent intent3 = intent2;
        Context context3 = context2;
        Context context4 = context3;
        ResolveInfo resolveService = context3.getPackageManager().resolveService(intent3, 0);
        ResolveInfo resolveInfo = resolveService;
        if (resolveService == null || resolveInfo.serviceInfo == null) {
            int e = Log.e("GcmReceiver", "Failed to resolve target intent service, skipping classname enforcement");
        } else {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (!context4.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
                String str5 = serviceInfo.packageName;
                String str6 = serviceInfo.name;
                new StringBuilder(94 + String.valueOf(str5).length() + String.valueOf(str6).length());
                int e2 = Log.e("GcmReceiver", sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append(str5).append("/").append(str6).toString());
            } else {
                String str7 = serviceInfo.name;
                String str8 = str7;
                if (str7.startsWith(".")) {
                    String valueOf = String.valueOf(context4.getPackageName());
                    String valueOf2 = String.valueOf(str8);
                    String str9 = valueOf2;
                    if (valueOf2.length() != 0) {
                        str = valueOf.concat(str9);
                    } else {
                        String str10 = valueOf;
                        str = str4;
                        new String(str10);
                    }
                } else {
                    str = str8;
                }
                String str11 = str;
                if (Log.isLoggable("GcmReceiver", 3)) {
                    String valueOf3 = String.valueOf(str11);
                    String str12 = valueOf3;
                    if (valueOf3.length() != 0) {
                        str3 = "Restricting intent to a specific service: ".concat(str12);
                    } else {
                        str3 = str2;
                        new String("Restricting intent to a specific service: ");
                    }
                    int d2 = Log.d("GcmReceiver", str3);
                }
                Intent className = intent3.setClassName(context4.getPackageName(), str11);
            }
        }
        try {
            if (context2.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                startService = startWakefulService(context2, intent2);
            } else {
                startService = context2.startService(intent2);
                int d3 = Log.d("GcmReceiver", "Missing wake lock permission, service start may be delayed");
            }
            if (startService != null) {
                return -1;
            }
            int e3 = Log.e("GcmReceiver", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e4) {
            int e5 = Log.e("GcmReceiver", "Error while delivering the message to the serviceIntent", e4);
            return 401;
        } catch (IllegalStateException e6) {
            String valueOf4 = String.valueOf(e6);
            new StringBuilder(45 + String.valueOf(valueOf4).length());
            int e7 = Log.e("GcmReceiver", sb.append("Failed to start service while in background: ").append(valueOf4).toString());
            return 402;
        }
    }
}

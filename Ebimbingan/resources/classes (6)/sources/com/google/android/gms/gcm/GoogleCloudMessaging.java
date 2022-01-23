package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import androidx.annotation.RequiresPermission;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.zzaf;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class GoogleCloudMessaging {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String INSTANCE_ID_SCOPE = "GCM";
    @Deprecated
    public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
    @Deprecated
    public static final String MESSAGE_TYPE_MESSAGE = "gcm";
    @Deprecated
    public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";
    @Deprecated
    public static final String MESSAGE_TYPE_SEND_EVENT = "send_event";
    private static GoogleCloudMessaging zzae;
    private static final AtomicInteger zzah;
    private PendingIntent zzaf;
    private final Map<String, Handler> zzag;
    /* access modifiers changed from: private */
    public final BlockingQueue<Intent> zzai;
    private final Messenger zzaj;
    /* access modifiers changed from: private */
    public Context zzl;

    @Deprecated
    public static synchronized GoogleCloudMessaging getInstance(Context context) {
        GoogleCloudMessaging googleCloudMessaging;
        GoogleCloudMessaging googleCloudMessaging2;
        Context context2 = context;
        synchronized (GoogleCloudMessaging.class) {
            if (zzae == null) {
                zze(context2);
                new GoogleCloudMessaging();
                GoogleCloudMessaging googleCloudMessaging3 = googleCloudMessaging2;
                zzae = googleCloudMessaging3;
                googleCloudMessaging3.zzl = context2.getApplicationContext();
            }
            googleCloudMessaging = zzae;
        }
        return googleCloudMessaging;
    }

    static void zze(Context context) {
        StringBuilder sb;
        String packageName = context.getPackageName();
        new StringBuilder(48 + String.valueOf(packageName).length());
        int w = Log.w("GCM", sb.append("GCM SDK is deprecated, ").append(packageName).append(" should update to use FCM").toString());
    }

    public GoogleCloudMessaging() {
        Map map;
        BlockingQueue<Intent> blockingQueue;
        Messenger messenger;
        Handler handler;
        new ArrayMap();
        this.zzag = Collections.synchronizedMap(map);
        new LinkedBlockingQueue();
        this.zzai = blockingQueue;
        new zzf(this, Looper.getMainLooper());
        new Messenger(handler);
        this.zzaj = messenger;
    }

    @Deprecated
    public void close() {
        zzae = null;
        zzd.zzk = null;
        zzh();
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    @Deprecated
    public void send(String str, String str2, Bundle bundle) throws IOException {
        send(str, str2, -1, bundle);
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    @Deprecated
    public void send(String str, String str2, long j, Bundle bundle) throws IOException {
        Intent intent;
        String str3;
        Bundle bundle2;
        String str4;
        String str5;
        Throwable th;
        Throwable th2;
        String str6 = str;
        String str7 = str2;
        long j2 = j;
        Bundle bundle3 = bundle;
        if (str6 == null) {
            Throwable th3 = th2;
            new IllegalArgumentException("Missing 'to'");
            throw th3;
        }
        String zzl2 = zzaf.zzl(this.zzl);
        String str8 = zzl2;
        if (zzl2 == null) {
            Throwable th4 = th;
            new IOException("SERVICE_NOT_AVAILABLE");
            throw th4;
        }
        new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = intent;
        if (bundle3 != null) {
            Intent putExtras = intent2.putExtras(bundle3);
        }
        zze(intent2);
        Intent intent3 = intent2.setPackage(str8);
        Intent putExtra = intent2.putExtra("google.to", str6);
        Intent putExtra2 = intent2.putExtra("google.message_id", str7);
        Intent putExtra3 = intent2.putExtra("google.ttl", Long.toString(j2));
        Intent intent4 = intent2;
        String str9 = str6;
        int indexOf = str9.indexOf(64);
        int i = indexOf;
        if (indexOf > 0) {
            str3 = str9.substring(0, i);
        } else {
            str3 = str9;
        }
        InstanceID instance = InstanceID.getInstance(this.zzl);
        Intent putExtra4 = intent4.putExtra("google.from", InstanceID.zzp().zzf("", str3, "GCM"));
        if (str8.contains(".gsf")) {
            new Bundle();
            Bundle bundle4 = bundle2;
            for (String str10 : bundle3.keySet()) {
                Object obj = bundle3.get(str10);
                Object obj2 = obj;
                if (obj instanceof String) {
                    Bundle bundle5 = bundle4;
                    String valueOf = String.valueOf(str10);
                    String str11 = valueOf;
                    if (valueOf.length() != 0) {
                        str5 = "gcm.".concat(str11);
                    } else {
                        str5 = str4;
                        new String("gcm.");
                    }
                    bundle5.putString(str5, (String) obj2);
                }
            }
            bundle4.putString("google.to", str6);
            bundle4.putString("google.message_id", str7);
            String zze = InstanceID.getInstance(this.zzl).zze("GCM", "upstream", bundle4);
            return;
        }
        this.zzl.sendOrderedBroadcast(intent2, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    /* access modifiers changed from: private */
    public final boolean zzd(Intent intent) {
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("In-Reply-To");
        String str = stringExtra;
        if (stringExtra == null && intent2.hasExtra("error")) {
            str = intent2.getStringExtra("google.message_id");
        }
        if (str != null) {
            Handler remove = this.zzag.remove(str);
            Handler handler = remove;
            if (remove != null) {
                Message obtain = Message.obtain();
                Message message = obtain;
                obtain.obj = intent2;
                return handler.sendMessage(message);
            }
        }
        return false;
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    @Deprecated
    public synchronized void unregister() throws IOException {
        Throwable th;
        synchronized (this) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                Throwable th2 = th;
                new IOException("MAIN_THREAD");
                throw th2;
            }
            InstanceID.getInstance(this.zzl).deleteInstanceID();
        }
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    @Deprecated
    public synchronized String register(String... strArr) throws IOException {
        String zzd;
        String[] strArr2 = strArr;
        synchronized (this) {
            zzd = zzd(zzaf.zzk(this.zzl), strArr2);
        }
        return zzd;
    }

    @ShowFirstParty
    @Deprecated
    @VisibleForTesting
    private final synchronized String zzd(boolean z, String... strArr) throws IOException {
        Throwable th;
        StringBuilder sb;
        Bundle bundle;
        Throwable th2;
        Throwable th3;
        String str;
        Throwable th4;
        Throwable th5;
        boolean z2 = z;
        String[] strArr2 = strArr;
        synchronized (this) {
            String zzl2 = zzaf.zzl(this.zzl);
            String str2 = zzl2;
            if (zzl2 == null) {
                Throwable th6 = th5;
                new IOException("SERVICE_NOT_AVAILABLE");
                throw th6;
            }
            String[] strArr3 = strArr2;
            String[] strArr4 = strArr3;
            if (strArr3 != null) {
                if (strArr4.length != 0) {
                    new StringBuilder(strArr4[0]);
                    StringBuilder sb2 = sb;
                    for (int i = 1; i < strArr4.length; i++) {
                        StringBuilder append = sb2.append(',').append(strArr4[i]);
                    }
                    String sb3 = sb2.toString();
                    new Bundle();
                    Bundle bundle2 = bundle;
                    if (str2.contains(".gsf")) {
                        bundle2.putString("legacy.sender", sb3);
                        str = InstanceID.getInstance(this.zzl).getToken(sb3, "GCM", bundle2);
                    } else {
                        bundle2.putString("sender", sb3);
                        String str3 = "registration_id";
                        Intent zzd = zzd(bundle2, z2);
                        Intent intent = zzd;
                        if (zzd == null) {
                            Throwable th7 = th4;
                            new IOException("SERVICE_NOT_AVAILABLE");
                            throw th7;
                        }
                        String stringExtra = intent.getStringExtra(str3);
                        String str4 = stringExtra;
                        if (stringExtra != null) {
                            str = str4;
                        } else {
                            String stringExtra2 = intent.getStringExtra("error");
                            String str5 = stringExtra2;
                            if (stringExtra2 != null) {
                                Throwable th8 = th3;
                                new IOException(str5);
                                throw th8;
                            }
                            Throwable th9 = th2;
                            new IOException("SERVICE_NOT_AVAILABLE");
                            throw th9;
                        }
                    }
                }
            }
            Throwable th10 = th;
            new IllegalArgumentException("No senderIds");
            throw th10;
        }
        return str;
    }

    @Deprecated
    private final Intent zzd(Bundle bundle, boolean z) throws IOException {
        StringBuilder sb;
        Throwable th;
        Throwable th2;
        Throwable th3;
        Bundle bundle2 = bundle;
        boolean z2 = z;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            Throwable th4 = th3;
            new IOException("MAIN_THREAD");
            throw th4;
        } else if (zzf(this.zzl) < 0) {
            Throwable th5 = th2;
            new IOException("Google Play Services missing");
            throw th5;
        } else {
            Intent intent = r11;
            Intent intent2 = new Intent(z2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
            Intent intent3 = intent;
            Intent intent4 = intent3;
            Intent intent5 = intent3.setPackage(zzaf.zzl(this.zzl));
            zze(intent4);
            int andIncrement = zzah.getAndIncrement();
            new StringBuilder(21);
            Intent putExtra = intent4.putExtra("google.message_id", sb.append("google.rpc").append(andIncrement).toString());
            Intent putExtras = intent4.putExtras(bundle2);
            Intent putExtra2 = intent4.putExtra("google.messenger", this.zzaj);
            if (z2) {
                this.zzl.sendBroadcast(intent4);
            } else {
                ComponentName startService = this.zzl.startService(intent4);
            }
            try {
                return this.zzai.poll(30000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                InterruptedException interruptedException = e;
                Throwable th6 = th;
                new IOException(interruptedException.getMessage());
                throw th6;
            }
        }
    }

    @Deprecated
    public String getMessageType(Intent intent) {
        Intent intent2 = intent;
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent2.getAction())) {
            return null;
        }
        String stringExtra = intent2.getStringExtra("message_type");
        return stringExtra != null ? stringExtra : MESSAGE_TYPE_MESSAGE;
    }

    private final synchronized void zze(Intent intent) {
        Intent intent2;
        Intent intent3 = intent;
        synchronized (this) {
            if (this.zzaf == null) {
                new Intent();
                Intent intent4 = intent2;
                Intent intent5 = intent4.setPackage("com.google.example.invalidpackage");
                this.zzaf = PendingIntent.getBroadcast(this.zzl, 0, intent4, 0);
            }
            Intent putExtra = intent3.putExtra("app", this.zzaf);
        }
    }

    private final synchronized void zzh() {
        synchronized (this) {
            if (this.zzaf != null) {
                this.zzaf.cancel();
                this.zzaf = null;
            }
        }
    }

    public static int zzf(Context context) {
        Context context2 = context;
        String zzl2 = zzaf.zzl(context2);
        String str = zzl2;
        if (zzl2 != null) {
            try {
                PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(str, 0);
                PackageInfo packageInfo2 = packageInfo;
                if (packageInfo != null) {
                    return packageInfo2.versionCode;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return -1;
    }

    static {
        AtomicInteger atomicInteger;
        new AtomicInteger(1);
        zzah = atomicInteger;
    }
}

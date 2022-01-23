package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.util.C0609PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.microsoft.appcenter.Constants;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@C0452ShowFirstParty
public class zzaf {
    private static int zzcp = 0;
    private static final zzaj<Boolean> zzct = zzai.zzy().zzd("gcm_iid_use_messenger_ipc", true);
    private static String zzcu = null;
    private static boolean zzcv = false;
    private static int zzcw = 0;
    private static int zzcx = 0;
    @GuardedBy("Rpc.class")
    private static BroadcastReceiver zzcy = null;
    private PendingIntent zzaf;
    private Messenger zzaj;
    private Map<String, Object> zzcz;
    private Messenger zzda;
    private MessengerCompat zzdb;
    private Context zzl;

    public zzaf(Context context) {
        Map<String, Object> map;
        new ArrayMap();
        this.zzcz = map;
        this.zzl = context;
    }

    @C0452ShowFirstParty
    public static boolean zzk(Context context) {
        Context context2 = context;
        if (zzcu != null) {
            String zzl2 = zzl(context2);
        }
        return zzcv;
    }

    @C0452ShowFirstParty
    public static String zzl(Context context) {
        Intent intent;
        boolean z;
        Intent intent2;
        boolean z2;
        Context context2 = context;
        if (zzcu != null) {
            return zzcu;
        }
        zzcw = Process.myUid();
        PackageManager packageManager = context2.getPackageManager();
        if (!C0609PlatformVersion.isAtLeastO()) {
            PackageManager packageManager2 = packageManager;
            PackageManager packageManager3 = packageManager2;
            new Intent("com.google.android.c2dm.intent.REGISTER");
            Iterator<ResolveInfo> it = packageManager2.queryIntentServices(intent2, 0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (zzd(packageManager3, it.next().serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                    zzcv = false;
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                return zzcu;
            }
        }
        PackageManager packageManager4 = packageManager;
        PackageManager packageManager5 = packageManager4;
        new Intent("com.google.iid.TOKEN_REQUEST");
        Iterator<ResolveInfo> it2 = packageManager4.queryBroadcastReceivers(intent, 0).iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            if (zzd(packageManager5, it2.next().activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                zzcv = true;
                z = true;
                break;
            }
        }
        if (z) {
            return zzcu;
        }
        int w = Log.w("InstanceID", "Failed to resolve IID implementation package, falling back");
        if (zzd(packageManager, "com.google.android.gms")) {
            zzcv = C0609PlatformVersion.isAtLeastO();
            return zzcu;
        } else if (C0609PlatformVersion.isAtLeastLollipop() || !zzd(packageManager, "com.google.android.gsf")) {
            int w2 = Log.w("InstanceID", "Google Play services is missing, unable to get tokens");
            return null;
        } else {
            zzcv = false;
            return zzcu;
        }
    }

    private static boolean zzd(PackageManager packageManager, String str, String str2) {
        StringBuilder sb;
        PackageManager packageManager2 = packageManager;
        String str3 = str;
        String str4 = str2;
        if (0 == packageManager2.checkPermission("com.google.android.c2dm.permission.SEND", str3)) {
            return zzd(packageManager2, str3);
        }
        new StringBuilder(56 + String.valueOf(str3).length() + String.valueOf(str4).length());
        int w = Log.w("InstanceID", sb.append("Possible malicious package ").append(str3).append(" declares ").append(str4).append(" without permission").toString());
        return false;
    }

    private static boolean zzd(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            zzcu = applicationInfo.packageName;
            zzcx = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    private static int zzm(Context context) {
        Context context2 = context;
        try {
            return context2.getPackageManager().getPackageInfo(zzl(context2), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    public final void zze(Message message) {
        Message message2 = message;
        if (message2 != null) {
            if (message2.obj instanceof Intent) {
                Intent intent = (Intent) message2.obj;
                Intent intent2 = intent;
                intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
                if (intent2.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("google.messenger");
                    Parcelable parcelable = parcelableExtra;
                    if (parcelableExtra instanceof MessengerCompat) {
                        this.zzdb = (MessengerCompat) parcelable;
                    }
                    if (parcelable instanceof Messenger) {
                        this.zzda = (Messenger) parcelable;
                    }
                }
                zzh((Intent) message2.obj);
                return;
            }
            int w = Log.w("InstanceID", "Dropping invalid message");
        }
    }

    private final synchronized void zzg(Intent intent) {
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

    static String zzi(Bundle bundle) throws IOException {
        StringBuilder sb;
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            Throwable th5 = th4;
            new IOException("SERVICE_NOT_AVAILABLE");
            throw th5;
        }
        String string = bundle2.getString("registration_id");
        String str = string;
        if (string == null) {
            str = bundle2.getString("unregistered");
        }
        if (str != null) {
            return str;
        }
        String string2 = bundle2.getString("error");
        String str2 = string2;
        if (string2 != null) {
            Throwable th6 = th3;
            new IOException(str2);
            throw th6;
        }
        String valueOf = String.valueOf(bundle2);
        new StringBuilder(29 + String.valueOf(valueOf).length());
        new Throwable();
        int w = Log.w("InstanceID", sb.append("Unexpected response from GCM ").append(valueOf).toString(), th);
        Throwable th7 = th2;
        new IOException("SERVICE_NOT_AVAILABLE");
        throw th7;
    }

    /* JADX INFO: finally extract failed */
    private final void zzd(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        Class<?> cls = getClass();
        Class<?> cls2 = cls;
        synchronized (cls) {
            try {
                Object obj3 = this.zzcz.get(str2);
                Object put = this.zzcz.put(str2, obj2);
                zzd(obj3, obj2);
            } catch (Throwable th) {
                Throwable th2 = th;
                Class<?> cls3 = cls2;
                throw th2;
            }
        }
    }

    private static void zzd(Object obj, Object obj2) {
        StringBuilder sb;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (obj3 instanceof ConditionVariable) {
            ((ConditionVariable) obj3).open();
        }
        if (obj3 instanceof Messenger) {
            Messenger messenger = (Messenger) obj3;
            Message obtain = Message.obtain();
            Message message = obtain;
            obtain.obj = obj4;
            try {
                messenger.send(message);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                new StringBuilder(24 + String.valueOf(valueOf).length());
                int w = Log.w("InstanceID", sb.append("Failed to send response ").append(valueOf).toString());
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void zzh(Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        StringBuilder sb;
        String str7;
        String str8;
        Intent intent2 = intent;
        if (intent2 != null) {
            String action = intent2.getAction();
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
                String stringExtra = intent2.getStringExtra("registration_id");
                String str9 = stringExtra;
                if (stringExtra == null) {
                    str9 = intent2.getStringExtra("unregistered");
                }
                if (str9 == null) {
                    Intent intent3 = intent2;
                    String stringExtra2 = intent3.getStringExtra("error");
                    String str10 = stringExtra2;
                    if (stringExtra2 == null) {
                        String valueOf = String.valueOf(intent3.getExtras());
                        new StringBuilder(49 + String.valueOf(valueOf).length());
                        int w = Log.w("InstanceID", sb.append("Unexpected response, no error or registration id ").append(valueOf).toString());
                        return;
                    }
                    if (Log.isLoggable("InstanceID", 3)) {
                        String valueOf2 = String.valueOf(str10);
                        String str11 = valueOf2;
                        if (valueOf2.length() != 0) {
                            str6 = "Received InstanceID error ".concat(str11);
                        } else {
                            str6 = str5;
                            new String("Received InstanceID error ");
                        }
                        int d = Log.d("InstanceID", str6);
                    }
                    String str12 = null;
                    if (str10.startsWith("|")) {
                        String[] split = str10.split("\\|");
                        if (!"ID".equals(split[1])) {
                            String valueOf3 = String.valueOf(str10);
                            String str13 = valueOf3;
                            if (valueOf3.length() != 0) {
                                str4 = "Unexpected structured response ".concat(str13);
                            } else {
                                str4 = str3;
                                new String("Unexpected structured response ");
                            }
                            int w2 = Log.w("InstanceID", str4);
                        }
                        if (split.length > 2) {
                            str12 = split[2];
                            String str14 = split[3];
                            str10 = str14;
                            if (str14.startsWith(Constants.COMMON_SCHEMA_PREFIX_SEPARATOR)) {
                                str10 = str10.substring(1);
                            }
                        } else {
                            str10 = "UNKNOWN";
                        }
                        Intent putExtra = intent3.putExtra("error", str10);
                    }
                    if (str12 == null) {
                        String str15 = str10;
                        Class<?> cls = getClass();
                        Class<?> cls2 = cls;
                        synchronized (cls) {
                            try {
                                for (String next : this.zzcz.keySet()) {
                                    Object obj = this.zzcz.get(next);
                                    Object put = this.zzcz.put(next, str15);
                                    zzd(obj, (Object) str15);
                                }
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                Class<?> cls3 = cls2;
                                throw th2;
                            }
                        }
                    } else {
                        zzd(str12, (Object) str10);
                    }
                } else {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(str9);
                    Matcher matcher2 = matcher;
                    if (matcher.matches()) {
                        String group = matcher2.group(1);
                        String group2 = matcher2.group(2);
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        zzd(group, (Object) extras);
                    } else if (Log.isLoggable("InstanceID", 3)) {
                        String valueOf4 = String.valueOf(str9);
                        String str16 = valueOf4;
                        if (valueOf4.length() != 0) {
                            str2 = "Unexpected response string: ".concat(str16);
                        } else {
                            str2 = str;
                            new String("Unexpected response string: ");
                        }
                        int d2 = Log.d("InstanceID", str2);
                    }
                }
            } else if (Log.isLoggable("InstanceID", 3)) {
                String valueOf5 = String.valueOf(intent2.getAction());
                String str17 = valueOf5;
                if (valueOf5.length() != 0) {
                    str8 = "Unexpected response ".concat(str17);
                } else {
                    str8 = str7;
                    new String("Unexpected response ");
                }
                int d3 = Log.d("InstanceID", str8);
            }
        } else if (Log.isLoggable("InstanceID", 3)) {
            int d4 = Log.d("InstanceID", "Unexpected response: null");
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzd(Bundle bundle, KeyPair keyPair) throws IOException {
        zzr zzr;
        StringBuilder sb;
        Bundle bundle2 = bundle;
        int zzm = zzm(this.zzl);
        Bundle bundle3 = bundle2;
        bundle3.putString("gmsv", Integer.toString(zzm));
        bundle3.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle3.putString("app_ver", Integer.toString(InstanceID.zzg(this.zzl)));
        bundle3.putString("app_ver_name", InstanceID.zzh(this.zzl));
        bundle3.putString("cliv", "iid-12451000");
        bundle3.putString("appid", InstanceID.zzd(keyPair));
        if (zzm < 12000000 || !zzct.get().booleanValue()) {
            return zzj(bundle2);
        }
        new zzr(this.zzl);
        try {
            return (Bundle) Tasks.await(zzr.zzd(1, bundle2));
        } catch (InterruptedException | ExecutionException e) {
            Exception exc = e;
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(exc);
                new StringBuilder(22 + String.valueOf(valueOf).length());
                int d = Log.d("InstanceID", sb.append("Error making request: ").append(valueOf).toString());
            }
            if (!(exc.getCause() instanceof zzaa) || ((zzaa) exc.getCause()).getErrorCode() != 4) {
                return null;
            }
            return zzj(bundle2);
        }
    }

    private final Bundle zzj(Bundle bundle) throws IOException {
        Bundle bundle2 = bundle;
        Bundle zzk = zzk(bundle2);
        Bundle bundle3 = zzk;
        if (zzk != null && bundle3.containsKey("google.messenger")) {
            Bundle zzk2 = zzk(bundle2);
            bundle3 = zzk2;
            if (zzk2 != null && bundle3.containsKey("google.messenger")) {
                bundle3 = null;
            }
        }
        return bundle3;
    }

    private static synchronized String zzx() {
        String num;
        synchronized (zzaf.class) {
            int i = zzcp;
            zzcp = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x023e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle zzk(android.os.Bundle r35) throws java.io.IOException {
        /*
            r34 = this;
            r3 = r34
            r4 = r35
            android.os.ConditionVariable r25 = new android.os.ConditionVariable
            r32 = r25
            r25 = r32
            r26 = r32
            r26.<init>()
            r5 = r25
            java.lang.String r25 = zzx()
            r6 = r25
            r25 = r3
            java.lang.Class r25 = r25.getClass()
            r32 = r25
            r25 = r32
            r26 = r32
            r7 = r26
            monitor-enter(r25)
            r25 = r3
            r0 = r25
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.zzcz     // Catch:{ all -> 0x009e }
            r25 = r0
            r26 = r6
            r27 = r5
            java.lang.Object r25 = r25.put(r26, r27)     // Catch:{ all -> 0x009e }
            r25 = r7
            monitor-exit(r25)     // Catch:{ all -> 0x009e }
            r25 = r3
            r26 = r4
            r27 = r6
            r13 = r27
            r12 = r26
            r32 = r25
            r25 = r32
            r26 = r32
            r11 = r26
            r32 = r25
            r25 = r32
            r26 = r32
            r15 = r26
            r0 = r25
            android.os.Messenger r0 = r0.zzaj
            r25 = r0
            if (r25 != 0) goto L_0x008b
            r25 = r15
            r0 = r25
            android.content.Context r0 = r0.zzl
            r25 = r0
            java.lang.String r25 = zzl(r25)
            r25 = r15
            android.os.Messenger r26 = new android.os.Messenger
            r32 = r26
            r26 = r32
            r27 = r32
            com.google.android.gms.iid.zzag r28 = new com.google.android.gms.iid.zzag
            r32 = r28
            r28 = r32
            r29 = r32
            r30 = r15
            android.os.Looper r31 = android.os.Looper.getMainLooper()
            r29.<init>(r30, r31)
            r27.<init>(r28)
            r0 = r26
            r1 = r25
            r1.zzaj = r0
        L_0x008b:
            java.lang.String r25 = zzcu
            if (r25 != 0) goto L_0x00a7
            java.io.IOException r25 = new java.io.IOException
            r32 = r25
            r25 = r32
            r26 = r32
            java.lang.String r27 = "MISSING_INSTANCEID_SERVICE"
            r26.<init>(r27)
            throw r25
        L_0x009e:
            r25 = move-exception
            r8 = r25
            r25 = r7
            monitor-exit(r25)     // Catch:{ all -> 0x009e }
            r25 = r8
            throw r25
        L_0x00a7:
            android.content.Intent r25 = new android.content.Intent
            r32 = r25
            r25 = r32
            r26 = r32
            boolean r27 = zzcv
            if (r27 == 0) goto L_0x0266
            java.lang.String r27 = "com.google.iid.TOKEN_REQUEST"
        L_0x00b6:
            r26.<init>(r27)
            r32 = r25
            r25 = r32
            r26 = r32
            r14 = r26
            java.lang.String r26 = zzcu
            android.content.Intent r25 = r25.setPackage(r26)
            r25 = r14
            r26 = r12
            android.content.Intent r25 = r25.putExtras(r26)
            r25 = r11
            r26 = r14
            r25.zzg(r26)
            r25 = r11
            r26 = r14
            r27 = r13
            r17 = r27
            r16 = r26
            r15 = r25
            r25 = r16
            java.lang.String r26 = "kid"
            r27 = 5
            r28 = r17
            java.lang.String r28 = java.lang.String.valueOf(r28)
            int r28 = r28.length()
            int r27 = r27 + r28
            java.lang.StringBuilder r28 = new java.lang.StringBuilder
            r32 = r27
            r33 = r28
            r27 = r33
            r28 = r32
            r29 = r33
            r32 = r28
            r33 = r29
            r28 = r33
            r29 = r32
            r28.<init>(r29)
            java.lang.String r28 = "|ID|"
            java.lang.StringBuilder r27 = r27.append(r28)
            r28 = r17
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = "|"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            android.content.Intent r25 = r25.putExtra(r26, r27)
            r25 = r16
            java.lang.String r26 = "X-kid"
            r27 = 5
            r28 = r17
            java.lang.String r28 = java.lang.String.valueOf(r28)
            int r28 = r28.length()
            int r27 = r27 + r28
            java.lang.StringBuilder r28 = new java.lang.StringBuilder
            r32 = r27
            r33 = r28
            r27 = r33
            r28 = r32
            r29 = r33
            r32 = r28
            r33 = r29
            r28 = r33
            r29 = r32
            r28.<init>(r29)
            java.lang.String r28 = "|ID|"
            java.lang.StringBuilder r27 = r27.append(r28)
            r28 = r17
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r28 = "|"
            java.lang.StringBuilder r27 = r27.append(r28)
            java.lang.String r27 = r27.toString()
            android.content.Intent r25 = r25.putExtra(r26, r27)
            java.lang.String r25 = "com.google.android.gsf"
            java.lang.String r26 = zzcu
            boolean r25 = r25.equals(r26)
            r18 = r25
            r25 = r16
            java.lang.String r26 = "useGsf"
            java.lang.String r25 = r25.getStringExtra(r26)
            r32 = r25
            r25 = r32
            r26 = r32
            r19 = r26
            if (r25 == 0) goto L_0x0197
            java.lang.String r25 = "1"
            r26 = r19
            boolean r25 = r25.equals(r26)
            r18 = r25
        L_0x0197:
            java.lang.String r25 = "InstanceID"
            r26 = 3
            boolean r25 = android.util.Log.isLoggable(r25, r26)
            if (r25 == 0) goto L_0x01eb
            java.lang.String r25 = "InstanceID"
            r26 = r16
            android.os.Bundle r26 = r26.getExtras()
            java.lang.String r26 = java.lang.String.valueOf(r26)
            r20 = r26
            r26 = 8
            r27 = r20
            java.lang.String r27 = java.lang.String.valueOf(r27)
            int r27 = r27.length()
            int r26 = r26 + r27
            java.lang.StringBuilder r27 = new java.lang.StringBuilder
            r32 = r26
            r33 = r27
            r26 = r33
            r27 = r32
            r28 = r33
            r32 = r27
            r33 = r28
            r27 = r33
            r28 = r32
            r27.<init>(r28)
            java.lang.String r27 = "Sending "
            java.lang.StringBuilder r26 = r26.append(r27)
            r27 = r20
            java.lang.StringBuilder r26 = r26.append(r27)
            java.lang.String r26 = r26.toString()
            int r25 = android.util.Log.d(r25, r26)
        L_0x01eb:
            r25 = r15
            r0 = r25
            android.os.Messenger r0 = r0.zzda
            r25 = r0
            if (r25 == 0) goto L_0x0281
            r25 = r16
            java.lang.String r26 = "google.messenger"
            r27 = r15
            r0 = r27
            android.os.Messenger r0 = r0.zzaj
            r27 = r0
            android.content.Intent r25 = r25.putExtra(r26, r27)
            android.os.Message r25 = android.os.Message.obtain()
            r32 = r25
            r25 = r32
            r26 = r32
            r20 = r26
            r26 = r16
            r0 = r26
            r1 = r25
            r1.obj = r0
            r25 = r15
            r0 = r25
            android.os.Messenger r0 = r0.zzda     // Catch:{ RemoteException -> 0x026b }
            r25 = r0
            r26 = r20
            r25.send(r26)     // Catch:{ RemoteException -> 0x026b }
        L_0x0227:
            r25 = r5
            r26 = 30000(0x7530, double:1.4822E-319)
            boolean r25 = r25.block(r26)
            r25 = r3
            java.lang.Class r25 = r25.getClass()
            r32 = r25
            r25 = r32
            r26 = r32
            r7 = r26
            monitor-enter(r25)
            r25 = r3
            r0 = r25
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.zzcz     // Catch:{ all -> 0x03ae }
            r25 = r0
            r26 = r6
            java.lang.Object r25 = r25.remove(r26)     // Catch:{ all -> 0x03ae }
            r32 = r25
            r25 = r32
            r26 = r32
            r8 = r26
            r0 = r25
            boolean r0 = r0 instanceof android.os.Bundle     // Catch:{ all -> 0x03ae }
            r25 = r0
            if (r25 == 0) goto L_0x0394
            r25 = r8
            android.os.Bundle r25 = (android.os.Bundle) r25     // Catch:{ all -> 0x03ae }
            r26 = r7
            monitor-exit(r26)     // Catch:{ all -> 0x03ae }
            r3 = r25
            return r3
        L_0x0266:
            java.lang.String r27 = "com.google.android.c2dm.intent.REGISTER"
            goto L_0x00b6
        L_0x026b:
            r25 = move-exception
            java.lang.String r25 = "InstanceID"
            r26 = 3
            boolean r25 = android.util.Log.isLoggable(r25, r26)
            if (r25 == 0) goto L_0x0281
            java.lang.String r25 = "InstanceID"
            java.lang.String r26 = "Messenger failed, fallback to startService"
            int r25 = android.util.Log.d(r25, r26)
        L_0x0281:
            r25 = r18
            if (r25 == 0) goto L_0x0311
            r25 = r15
            r21 = r25
            java.lang.Class<com.google.android.gms.iid.zzaf> r25 = com.google.android.gms.iid.zzaf.class
            r32 = r25
            r25 = r32
            r26 = r32
            r22 = r26
            monitor-enter(r25)
            android.content.BroadcastReceiver r25 = zzcy     // Catch:{ all -> 0x0308 }
            if (r25 != 0) goto L_0x02f6
            com.google.android.gms.iid.zzah r25 = new com.google.android.gms.iid.zzah     // Catch:{ all -> 0x0308 }
            r32 = r25
            r25 = r32
            r26 = r32
            r27 = r21
            r26.<init>(r27)     // Catch:{ all -> 0x0308 }
            zzcy = r25     // Catch:{ all -> 0x0308 }
            java.lang.String r25 = "InstanceID"
            r26 = 3
            boolean r25 = android.util.Log.isLoggable(r25, r26)     // Catch:{ all -> 0x0308 }
            if (r25 == 0) goto L_0x02bc
            java.lang.String r25 = "InstanceID"
            java.lang.String r26 = "Registered GSF callback receiver"
            int r25 = android.util.Log.d(r25, r26)     // Catch:{ all -> 0x0308 }
        L_0x02bc:
            android.content.IntentFilter r25 = new android.content.IntentFilter     // Catch:{ all -> 0x0308 }
            r32 = r25
            r25 = r32
            r26 = r32
            java.lang.String r27 = "com.google.android.c2dm.intent.REGISTRATION"
            r26.<init>(r27)     // Catch:{ all -> 0x0308 }
            r32 = r25
            r25 = r32
            r26 = r32
            r23 = r26
            r26 = r21
            r0 = r26
            android.content.Context r0 = r0.zzl     // Catch:{ all -> 0x0308 }
            r26 = r0
            java.lang.String r26 = r26.getPackageName()     // Catch:{ all -> 0x0308 }
            r25.addCategory(r26)     // Catch:{ all -> 0x0308 }
            r25 = r21
            r0 = r25
            android.content.Context r0 = r0.zzl     // Catch:{ all -> 0x0308 }
            r25 = r0
            android.content.BroadcastReceiver r26 = zzcy     // Catch:{ all -> 0x0308 }
            r27 = r23
            java.lang.String r28 = "com.google.android.c2dm.permission.SEND"
            r29 = 0
            android.content.Intent r25 = r25.registerReceiver(r26, r27, r28, r29)     // Catch:{ all -> 0x0308 }
        L_0x02f6:
            r25 = r22
            monitor-exit(r25)     // Catch:{ all -> 0x0308 }
            r25 = r15
            r0 = r25
            android.content.Context r0 = r0.zzl
            r25 = r0
            r26 = r16
            r25.sendBroadcast(r26)
            goto L_0x0227
        L_0x0308:
            r25 = move-exception
            r24 = r25
            r25 = r22
            monitor-exit(r25)     // Catch:{ all -> 0x0308 }
            r25 = r24
            throw r25
        L_0x0311:
            r25 = r16
            java.lang.String r26 = "google.messenger"
            r27 = r15
            r0 = r27
            android.os.Messenger r0 = r0.zzaj
            r27 = r0
            android.content.Intent r25 = r25.putExtra(r26, r27)
            r25 = r16
            java.lang.String r26 = "messenger2"
            java.lang.String r27 = "1"
            android.content.Intent r25 = r25.putExtra(r26, r27)
            r25 = r15
            r0 = r25
            com.google.android.gms.iid.MessengerCompat r0 = r0.zzdb
            r25 = r0
            if (r25 == 0) goto L_0x0371
            android.os.Message r25 = android.os.Message.obtain()
            r32 = r25
            r25 = r32
            r26 = r32
            r20 = r26
            r26 = r16
            r0 = r26
            r1 = r25
            r1.obj = r0
            r25 = r15
            r0 = r25
            com.google.android.gms.iid.MessengerCompat r0 = r0.zzdb     // Catch:{ RemoteException -> 0x035b }
            r25 = r0
            r26 = r20
            r25.send(r26)     // Catch:{ RemoteException -> 0x035b }
            goto L_0x0227
        L_0x035b:
            r25 = move-exception
            java.lang.String r25 = "InstanceID"
            r26 = 3
            boolean r25 = android.util.Log.isLoggable(r25, r26)
            if (r25 == 0) goto L_0x0371
            java.lang.String r25 = "InstanceID"
            java.lang.String r26 = "Messenger failed, fallback to startService"
            int r25 = android.util.Log.d(r25, r26)
        L_0x0371:
            boolean r25 = zzcv
            if (r25 == 0) goto L_0x0384
            r25 = r15
            r0 = r25
            android.content.Context r0 = r0.zzl
            r25 = r0
            r26 = r16
            r25.sendBroadcast(r26)
            goto L_0x0227
        L_0x0384:
            r25 = r15
            r0 = r25
            android.content.Context r0 = r0.zzl
            r25 = r0
            r26 = r16
            android.content.ComponentName r25 = r25.startService(r26)
            goto L_0x0227
        L_0x0394:
            r25 = r8
            r0 = r25
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ all -> 0x03ae }
            r25 = r0
            if (r25 == 0) goto L_0x03b7
            java.io.IOException r25 = new java.io.IOException     // Catch:{ all -> 0x03ae }
            r32 = r25
            r25 = r32
            r26 = r32
            r27 = r8
            java.lang.String r27 = (java.lang.String) r27     // Catch:{ all -> 0x03ae }
            r26.<init>(r27)     // Catch:{ all -> 0x03ae }
            throw r25     // Catch:{ all -> 0x03ae }
        L_0x03ae:
            r25 = move-exception
            r10 = r25
            r25 = r7
            monitor-exit(r25)     // Catch:{ all -> 0x03ae }
            r25 = r10
            throw r25
        L_0x03b7:
            java.lang.String r25 = "InstanceID"
            r26 = r8
            java.lang.String r26 = java.lang.String.valueOf(r26)     // Catch:{ all -> 0x03ae }
            r9 = r26
            r26 = 12
            r27 = r9
            java.lang.String r27 = java.lang.String.valueOf(r27)     // Catch:{ all -> 0x03ae }
            int r27 = r27.length()     // Catch:{ all -> 0x03ae }
            int r26 = r26 + r27
            java.lang.StringBuilder r27 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ae }
            r32 = r26
            r33 = r27
            r26 = r33
            r27 = r32
            r28 = r33
            r32 = r27
            r33 = r28
            r27 = r33
            r28 = r32
            r27.<init>(r28)     // Catch:{ all -> 0x03ae }
            java.lang.String r27 = "No response "
            java.lang.StringBuilder r26 = r26.append(r27)     // Catch:{ all -> 0x03ae }
            r27 = r9
            java.lang.StringBuilder r26 = r26.append(r27)     // Catch:{ all -> 0x03ae }
            java.lang.String r26 = r26.toString()     // Catch:{ all -> 0x03ae }
            int r25 = android.util.Log.w(r25, r26)     // Catch:{ all -> 0x03ae }
            java.io.IOException r25 = new java.io.IOException     // Catch:{ all -> 0x03ae }
            r32 = r25
            r25 = r32
            r26 = r32
            java.lang.String r27 = "TIMEOUT"
            r26.<init>(r27)     // Catch:{ all -> 0x03ae }
            throw r25     // Catch:{ all -> 0x03ae }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzaf.zzk(android.os.Bundle):android.os.Bundle");
    }
}

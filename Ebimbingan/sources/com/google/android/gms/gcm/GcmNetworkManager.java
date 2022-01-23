package com.google.android.gms.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0594CollectionUtils;
import com.google.android.gms.internal.gcm.zzq;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

public class GcmNetworkManager {
    public static final int RESULT_FAILURE = 2;
    public static final int RESULT_RESCHEDULE = 1;
    public static final int RESULT_SUCCESS = 0;
    @GuardedBy("GcmNetworkManager.class")
    private static GcmNetworkManager zzh;
    private final Context zzi;
    @GuardedBy("this")
    private final Map<String, Map<String, Boolean>> zzj;

    public static GcmNetworkManager getInstance(Context context) {
        GcmNetworkManager gcmNetworkManager;
        Context context2 = context;
        Class<GcmNetworkManager> cls = GcmNetworkManager.class;
        Class<GcmNetworkManager> cls2 = cls;
        synchronized (cls) {
            try {
                if (zzh == null) {
                    new GcmNetworkManager(context2.getApplicationContext());
                    zzh = gcmNetworkManager;
                }
                GcmNetworkManager gcmNetworkManager2 = zzh;
                return gcmNetworkManager2;
            } catch (Throwable th) {
                Throwable th2 = th;
                Class<GcmNetworkManager> cls3 = cls2;
                throw th2;
            }
        }
    }

    private GcmNetworkManager(Context context) {
        Map<String, Map<String, Boolean>> map;
        new ArrayMap();
        this.zzj = map;
        this.zzi = context;
    }

    @NonNull
    private final zzn zze() {
        zzn zzn;
        zzn zzn2;
        if (GoogleCloudMessaging.zzf(this.zzi) < 5000000) {
            int e = Log.e("GcmNetworkManager", "Google Play services is not available, dropping all GcmNetworkManager requests");
            new zzo();
            return zzn2;
        }
        new zzm(this.zzi);
        return zzn;
    }

    @WorkerThread
    public synchronized void schedule(Task task) {
        zzp zzp;
        String str;
        String str2;
        Throwable th;
        Task task2 = task;
        synchronized (this) {
            zzp zzp2 = zzp;
            String valueOf = String.valueOf("nts:client:schedule:");
            String valueOf2 = String.valueOf(task2.getTag());
            String str3 = valueOf2;
            if (valueOf2.length() != 0) {
                str2 = valueOf.concat(str3);
            } else {
                String str4 = valueOf;
                str2 = str;
                new String(str4);
            }
            new zzp(str2);
            zzp zzp3 = zzp2;
            try {
                boolean zze = zze(task2.getServiceName());
                if (zze().zzd(task2)) {
                    Map map = this.zzj.get(task2.getServiceName());
                    Map map2 = map;
                    if (map != null && map2.containsKey(task2.getTag())) {
                        Object put = map2.put(task2.getTag(), true);
                    }
                }
                zzd((Throwable) null, zzp3);
            } catch (Throwable th2) {
                Throwable th3 = th2;
                zzd(th, zzp3);
                throw th3;
            }
        }
    }

    @WorkerThread
    public void cancelTask(String str, Class<? extends GcmTaskService> cls) {
        ComponentName componentName;
        String str2;
        String str3;
        Throwable th;
        new ComponentName(this.zzi, cls);
        ComponentName componentName2 = componentName;
        String str4 = str;
        zzp zzp = r20;
        String valueOf = String.valueOf("nts:client:cancel:");
        String valueOf2 = String.valueOf(str4);
        String str5 = valueOf2;
        if (valueOf2.length() != 0) {
            str3 = valueOf.concat(str5);
        } else {
            String str6 = valueOf;
            str3 = str2;
            new String(str6);
        }
        zzp zzp2 = new zzp(str3);
        zzp zzp3 = zzp;
        try {
            zzd(str4);
            boolean zze = zze(componentName2.getClassName());
            boolean zzd = zze().zzd(componentName2, str4);
            zzd((Throwable) null, zzp3);
        } catch (Throwable th2) {
            Throwable th3 = th2;
            zzd(th, zzp3);
            throw th3;
        }
    }

    @WorkerThread
    public void cancelAllTasks(Class<? extends GcmTaskService> cls) {
        ComponentName componentName;
        zzp zzp;
        Throwable th;
        new ComponentName(this.zzi, cls);
        ComponentName componentName2 = componentName;
        new zzp("nts:client:cancelAll");
        zzp zzp2 = zzp;
        try {
            boolean zze = zze(componentName2.getClassName());
            boolean zzd = zze().zzd(componentName2);
            zzd((Throwable) null, zzp2);
        } catch (Throwable th2) {
            Throwable th3 = th2;
            zzd(th, zzp2);
            throw th3;
        }
    }

    static void zzd(String str) {
        Throwable th;
        Throwable th2;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            Throwable th3 = th2;
            new IllegalArgumentException("Must provide a valid tag.");
            throw th3;
        } else if (100 < str2.length()) {
            Throwable th4 = th;
            new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
            throw th4;
        }
    }

    private final boolean zze(String str) {
        Intent intent;
        Intent intent2;
        List<ResolveInfo> queryIntentServices;
        Intent intent3;
        Throwable th;
        StringBuilder sb;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(str2, "GcmTaskService must not be null.");
        String str3 = str2;
        PackageManager packageManager = this.zzi.getPackageManager();
        PackageManager packageManager2 = packageManager;
        if (packageManager == null) {
            queryIntentServices = Collections.emptyList();
        } else {
            PackageManager packageManager3 = packageManager2;
            String str4 = str3;
            if (str4 != null) {
                new Intent(GcmTaskService.SERVICE_ACTION_EXECUTE_TASK);
                intent2 = intent3.setClassName(this.zzi, str4);
            } else {
                new Intent(GcmTaskService.SERVICE_ACTION_EXECUTE_TASK);
                intent2 = intent.setPackage(this.zzi.getPackageName());
            }
            queryIntentServices = packageManager3.queryIntentServices(intent2, 0);
        }
        List<ResolveInfo> list = queryIntentServices;
        List<ResolveInfo> list2 = list;
        if (C0594CollectionUtils.isEmpty(list)) {
            int e = Log.e("GcmNetworkManager", String.valueOf(str2).concat(" is not available. This may cause the task to be lost."));
            return true;
        }
        for (ResolveInfo next : list2) {
            ResolveInfo resolveInfo = next;
            if (next.serviceInfo != null && resolveInfo.serviceInfo.enabled) {
                return true;
            }
        }
        Throwable th2 = th;
        new StringBuilder(118 + String.valueOf(str2).length());
        new IllegalArgumentException(sb.append("The GcmTaskService class you provided ").append(str2).append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY").toString());
        throw th2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean zzd(String str, String str2) {
        boolean z;
        Map map;
        String str3 = str;
        String str4 = str2;
        synchronized (this) {
            Map map2 = this.zzj.get(str4);
            Map map3 = map2;
            if (map2 == null) {
                new ArrayMap();
                map3 = map;
                Map<String, Boolean> put = this.zzj.put(str4, map3);
            }
            z = map3.put(str3, false) == null;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zze(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        synchronized (this) {
            Map map = this.zzj.get(str4);
            Map map2 = map;
            if (map != null) {
                if ((map2.remove(str3) != null) && map2.isEmpty()) {
                    Map<String, Boolean> remove = this.zzj.remove(str4);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean zzf(String str, String str2) {
        boolean z;
        String str3 = str;
        String str4 = str2;
        synchronized (this) {
            Map map = this.zzj.get(str4);
            Map map2 = map;
            if (map != null) {
                Boolean bool = (Boolean) map2.get(str3);
                z = bool == null ? false : bool.booleanValue();
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean zzf(String str) {
        boolean containsKey;
        String str2 = str;
        synchronized (this) {
            containsKey = this.zzj.containsKey(str2);
        }
        return containsKey;
    }

    private static /* synthetic */ void zzd(Throwable th, zzp zzp) {
        Throwable th2 = th;
        zzp zzp2 = zzp;
        if (th2 != null) {
            try {
                zzp2.close();
            } catch (Throwable th3) {
                zzq.zzd(th2, th3);
            }
        } else {
            zzp2.close();
        }
    }
}

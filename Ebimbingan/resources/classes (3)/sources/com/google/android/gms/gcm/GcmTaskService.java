package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gcm.zzg;
import com.google.android.gms.internal.gcm.zzj;
import com.google.android.gms.internal.gcm.zzl;
import com.google.android.gms.internal.gcm.zzm;
import com.google.android.gms.internal.gcm.zzq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import javax.annotation.concurrent.GuardedBy;

public abstract class GcmTaskService extends Service {
    public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    /* access modifiers changed from: private */
    public ComponentName componentName;
    /* access modifiers changed from: private */
    public final Object lock;
    /* access modifiers changed from: private */
    public zzl zzg;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public int zzu;
    private ExecutorService zzv;
    private Messenger zzw;
    /* access modifiers changed from: private */
    public GcmNetworkManager zzx;

    public GcmTaskService() {
        Object obj;
        new Object();
        this.lock = obj;
    }

    public abstract int onRunTask(TaskParams taskParams);

    @TargetApi(21)
    @VisibleForTesting
    class zzd extends zzj {
        private final /* synthetic */ GcmTaskService zzz;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zzd(GcmTaskService gcmTaskService, Looper looper) {
            super(looper);
            this.zzz = gcmTaskService;
        }

        public final void handleMessage(Message message) {
            StringBuilder sb;
            zze zze;
            StringBuilder sb2;
            Message message2 = message;
            if (!UidVerifier.uidHasPackageName(this.zzz, message2.sendingUid, "com.google.android.gms")) {
                int e = Log.e("GcmTaskService", "unable to verify presence of Google Play Services");
                return;
            }
            switch (message2.what) {
                case 1:
                    Message message3 = message2;
                    Bundle data = message3.getData();
                    Bundle bundle = data;
                    if (!data.isEmpty()) {
                        Messenger messenger = message3.replyTo;
                        Messenger messenger2 = messenger;
                        if (messenger != null) {
                            String string = bundle.getString("tag");
                            ArrayList parcelableArrayList = bundle.getParcelableArrayList("triggered_uris");
                            long j = bundle.getLong("max_exec_duration", 180);
                            if (!this.zzz.zzg(string)) {
                                new zze(this.zzz, string, messenger2, bundle.getBundle("extras"), j, (List<Uri>) parcelableArrayList);
                                this.zzz.zzd(zze);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                    Message message4 = message2;
                    if (Log.isLoggable("GcmTaskService", 3)) {
                        String valueOf = String.valueOf(message4);
                        new StringBuilder(45 + String.valueOf(valueOf).length());
                        int d = Log.d("GcmTaskService", sb.append("ignoring unimplemented stop message for now: ").append(valueOf).toString());
                        return;
                    }
                    return;
                case 4:
                    this.zzz.onInitializeTasks();
                    return;
                default:
                    String valueOf2 = String.valueOf(message2);
                    new StringBuilder(31 + String.valueOf(valueOf2).length());
                    int e2 = Log.e("GcmTaskService", sb2.append("Unrecognized message received: ").append(valueOf2).toString());
                    return;
            }
        }
    }

    @CallSuper
    public void onCreate() {
        ThreadFactory threadFactory;
        Messenger messenger;
        Handler handler;
        ComponentName componentName2;
        super.onCreate();
        this.zzx = GcmNetworkManager.getInstance(this);
        new zze(this);
        this.zzv = zzg.zzaa().zzd(10, threadFactory, 10);
        new zzd(this, Looper.getMainLooper());
        new Messenger(handler);
        this.zzw = messenger;
        new ComponentName(this, getClass());
        this.componentName = componentName2;
        zzm zzab = zzm.zzab();
        Class<?> cls = getClass();
        this.zzg = zzm.zzdk;
    }

    class zze implements Runnable {
        private final Bundle extras;
        private final String tag;
        private final List<Uri> zzaa;
        private final long zzab;
        @Nullable
        private final zzg zzac;
        @Nullable
        private final Messenger zzad;
        private final /* synthetic */ GcmTaskService zzz;

        zze(GcmTaskService gcmTaskService, @NonNull String str, IBinder iBinder, Bundle bundle, long j, List<Uri> list) {
            zzg zzg;
            zzg zzg2;
            Bundle bundle2 = bundle;
            long j2 = j;
            List<Uri> list2 = list;
            this.zzz = gcmTaskService;
            this.tag = str;
            IBinder iBinder2 = iBinder;
            IBinder iBinder3 = iBinder2;
            if (iBinder2 == null) {
                zzg2 = null;
            } else {
                IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                IInterface iInterface = queryLocalInterface;
                if (queryLocalInterface instanceof zzg) {
                    zzg2 = (zzg) iInterface;
                } else {
                    zzg2 = zzg;
                    new zzh(iBinder3);
                }
            }
            this.zzac = zzg2;
            this.extras = bundle2;
            this.zzab = j2;
            this.zzaa = list2;
            this.zzad = null;
        }

        zze(GcmTaskService gcmTaskService, @NonNull String str, Messenger messenger, Bundle bundle, long j, List<Uri> list) {
            this.zzz = gcmTaskService;
            this.tag = str;
            this.zzad = messenger;
            this.extras = bundle;
            this.zzab = j;
            this.zzaa = list;
            this.zzac = null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            throw r8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r17 = this;
                r1 = r17
                com.google.android.gms.gcm.zzp r8 = new com.google.android.gms.gcm.zzp
                r15 = r8
                r8 = r15
                r9 = r15
                java.lang.String r10 = "nts:client:onRunTask:"
                java.lang.String r10 = java.lang.String.valueOf(r10)
                r11 = r1
                java.lang.String r11 = r11.tag
                java.lang.String r11 = java.lang.String.valueOf(r11)
                r15 = r11
                r11 = r15
                r12 = r15
                int r12 = r12.length()
                if (r12 == 0) goto L_0x0061
                java.lang.String r10 = r10.concat(r11)
            L_0x0022:
                r9.<init>(r10)
                r2 = r8
                r8 = 0
                r3 = r8
                com.google.android.gms.gcm.TaskParams r8 = new com.google.android.gms.gcm.TaskParams     // Catch:{ Throwable -> 0x007b }
                r15 = r8
                r8 = r15
                r9 = r15
                r10 = r1
                java.lang.String r10 = r10.tag     // Catch:{ Throwable -> 0x007b }
                r11 = r1
                android.os.Bundle r11 = r11.extras     // Catch:{ Throwable -> 0x007b }
                r12 = r1
                long r12 = r12.zzab     // Catch:{ Throwable -> 0x007b }
                r14 = r1
                java.util.List<android.net.Uri> r14 = r14.zzaa     // Catch:{ Throwable -> 0x007b }
                r9.<init>(r10, r11, r12, r14)     // Catch:{ Throwable -> 0x007b }
                r4 = r8
                r8 = r1
                com.google.android.gms.gcm.GcmTaskService r8 = r8.zzz     // Catch:{ Throwable -> 0x007b }
                com.google.android.gms.internal.gcm.zzl r8 = r8.zzg     // Catch:{ Throwable -> 0x007b }
                java.lang.String r9 = "onRunTask"
                int r10 = com.google.android.gms.internal.gcm.zzp.zzdo     // Catch:{ Throwable -> 0x007b }
                com.google.android.gms.internal.gcm.zzo r8 = r8.zzd(r9, r10)     // Catch:{ Throwable -> 0x007b }
                r8 = r1
                com.google.android.gms.gcm.GcmTaskService r8 = r8.zzz     // Catch:{ Throwable -> 0x0075 }
                r9 = r4
                int r8 = r8.onRunTask(r9)     // Catch:{ Throwable -> 0x0075 }
                r5 = r8
                r8 = r1
                r9 = r5
                r8.zze(r9)     // Catch:{ Throwable -> 0x007b }
                r8 = 0
                r9 = r2
                zzd((java.lang.Throwable) r8, (com.google.android.gms.gcm.zzp) r9)
                return
            L_0x0061:
                java.lang.String r11 = new java.lang.String
                r15 = r10
                r16 = r11
                r10 = r16
                r11 = r15
                r12 = r16
                r15 = r11
                r16 = r12
                r11 = r16
                r12 = r15
                r11.<init>(r12)
                goto L_0x0022
            L_0x0075:
                r8 = move-exception
                throw r8     // Catch:{ all -> 0x0077 }
            L_0x0077:
                r8 = move-exception
                r6 = r8
                r8 = r6
                throw r8     // Catch:{ Throwable -> 0x007b }
            L_0x007b:
                r8 = move-exception
                r15 = r8
                r8 = r15
                r9 = r15
                r4 = r9
                r3 = r8
                r8 = r4
                throw r8     // Catch:{ all -> 0x0083 }
            L_0x0083:
                r8 = move-exception
                r7 = r8
                r8 = r3
                r9 = r2
                zzd((java.lang.Throwable) r8, (com.google.android.gms.gcm.zzp) r9)
                r8 = r7
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmTaskService.zze.run():void");
        }

        private final void zze(int i) {
            String str;
            String str2;
            Bundle bundle;
            int i2 = i;
            Object zze = this.zzz.lock;
            Object obj = zze;
            synchronized (zze) {
                try {
                    if (this.zzz.zzx.zzf(this.tag, this.zzz.componentName.getClassName())) {
                        this.zzz.zzx.zze(this.tag, this.zzz.componentName.getClassName());
                        if (!zzg() && !this.zzz.zzx.zzf(this.zzz.componentName.getClassName())) {
                            this.zzz.stopSelf(this.zzz.zzu);
                        }
                        return;
                    }
                    if (zzg()) {
                        Messenger messenger = this.zzad;
                        Message obtain = Message.obtain();
                        Message message = obtain;
                        obtain.what = 3;
                        message.arg1 = i2;
                        new Bundle();
                        Bundle bundle2 = bundle;
                        Bundle bundle3 = bundle2;
                        bundle2.putParcelable("component", this.zzz.componentName);
                        bundle3.putString("tag", this.tag);
                        message.setData(bundle3);
                        messenger.send(message);
                    } else {
                        this.zzac.zzf(i2);
                    }
                    this.zzz.zzx.zze(this.tag, this.zzz.componentName.getClassName());
                    if (!zzg() && !this.zzz.zzx.zzf(this.zzz.componentName.getClassName())) {
                        this.zzz.stopSelf(this.zzz.zzu);
                    }
                } catch (RemoteException e) {
                    String valueOf = String.valueOf(this.tag);
                    String str3 = valueOf;
                    if (valueOf.length() != 0) {
                        str2 = "Error reporting result of operation to scheduler for ".concat(str3);
                    } else {
                        str2 = str;
                        new String("Error reporting result of operation to scheduler for ");
                    }
                    int e2 = Log.e("GcmTaskService", str2);
                    this.zzz.zzx.zze(this.tag, this.zzz.componentName.getClassName());
                    if (!zzg() && !this.zzz.zzx.zzf(this.zzz.componentName.getClassName())) {
                        this.zzz.stopSelf(this.zzz.zzu);
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj2 = obj;
                    throw th2;
                }
            }
        }

        private final boolean zzg() {
            return this.zzad != null;
        }

        static /* synthetic */ void zzd(zze zze, int i) {
            int i2 = i;
            zze.zze(1);
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

    @CallSuper
    public void onDestroy() {
        StringBuilder sb;
        super.onDestroy();
        List<Runnable> shutdownNow = this.zzv.shutdownNow();
        List<Runnable> list = shutdownNow;
        if (!shutdownNow.isEmpty()) {
            int size = list.size();
            new StringBuilder(79);
            int e = Log.e("GcmTaskService", sb.append("Shutting down, but not all tasks are finished executing. Remaining: ").append(size).toString());
        }
    }

    @CallSuper
    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb;
        zze zze2;
        StringBuilder sb2;
        Intent intent2 = intent;
        int i3 = i;
        int i4 = i2;
        if (intent2 == null) {
            zzd(i4);
            return 2;
        }
        try {
            intent2.setExtrasClassLoader(PendingCallback.class.getClassLoader());
            String action = intent2.getAction();
            if (SERVICE_ACTION_EXECUTE_TASK.equals(action)) {
                String stringExtra = intent2.getStringExtra("tag");
                Parcelable parcelableExtra = intent2.getParcelableExtra("callback");
                Bundle bundleExtra = intent2.getBundleExtra("extras");
                ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("triggered_uris");
                long longExtra = intent2.getLongExtra("max_exec_duration", 180);
                if (!(parcelableExtra instanceof PendingCallback)) {
                    String packageName = getPackageName();
                    new StringBuilder(47 + String.valueOf(packageName).length() + String.valueOf(stringExtra).length());
                    int e = Log.e("GcmTaskService", sb2.append(packageName).append(" ").append(stringExtra).append(": Could not process request, invalid callback.").toString());
                    zzd(i4);
                    return 2;
                } else if (zzg(stringExtra)) {
                    zzd(i4);
                    return 2;
                } else {
                    new zze(this, stringExtra, ((PendingCallback) parcelableExtra).zzan, bundleExtra, longExtra, (List<Uri>) parcelableArrayListExtra);
                    zzd(zze2);
                }
            } else if (SERVICE_ACTION_INITIALIZE.equals(action)) {
                onInitializeTasks();
            } else {
                new StringBuilder(37 + String.valueOf(action).length());
                int e2 = Log.e("GcmTaskService", sb.append("Unknown action received ").append(action).append(", terminating").toString());
            }
            zzd(i4);
            return 2;
        } catch (Throwable th) {
            Throwable th2 = th;
            zzd(i4);
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public final boolean zzg(String str) {
        StringBuilder sb;
        String str2 = str;
        Object obj = this.lock;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                boolean z = !this.zzx.zzd(str2, this.componentName.getClassName());
                boolean z2 = z;
                if (z) {
                    String packageName = getPackageName();
                    new StringBuilder(44 + String.valueOf(packageName).length() + String.valueOf(str2).length());
                    int w = Log.w("GcmTaskService", sb.append(packageName).append(" ").append(str2).append(": Task already running, won't start another").toString());
                }
                boolean z3 = z2;
                return z3;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final void zzd(int i) {
        int i2 = i;
        Object obj = this.lock;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                this.zzu = i2;
                if (!this.zzx.zzf(this.componentName.getClassName())) {
                    stopSelf(this.zzu);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    @CallSuper
    public IBinder onBind(Intent intent) {
        Intent intent2 = intent;
        if (intent2 == null || !PlatformVersion.isAtLeastLollipop() || !SERVICE_ACTION_EXECUTE_TASK.equals(intent2.getAction())) {
            return null;
        }
        return this.zzw.getBinder();
    }

    /* access modifiers changed from: private */
    public final void zzd(zze zze2) {
        zze zze3 = zze2;
        try {
            this.zzv.execute(zze3);
        } catch (RejectedExecutionException e) {
            int e2 = Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
            zze.zzd(zze3, 1);
        }
    }

    public void onInitializeTasks() {
    }
}

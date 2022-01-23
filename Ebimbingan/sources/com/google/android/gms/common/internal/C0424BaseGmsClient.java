package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.C0190GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0218CommonStatusCodes;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.shaded.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import gnu.kawa.functions.GetNamedPart;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.BaseGmsClient */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C0424BaseGmsClient<T extends IInterface> {
    @C0206KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;
    @C0206KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    @C0206KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final C0186Feature[] zze = new C0186Feature[0];
    @Nullable
    private volatile String zzA;
    /* access modifiers changed from: private */
    @Nullable
    public C0184ConnectionResult zzB;
    /* access modifiers changed from: private */
    public boolean zzC;
    @Nullable
    private volatile C0529zzi zzD;
    @C0617VisibleForTesting
    C0540zzt zza;
    final Handler zzb;
    @RecentlyNonNull
    @C0617VisibleForTesting
    protected ConnectionProgressReportCallbacks zzc;
    @RecentlyNonNull
    @C0617VisibleForTesting
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    @Nullable
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final C0434GmsClientSupervisor zzn;
    private final C0190GoogleApiAvailabilityLight zzo;
    private final Object zzp;
    /* access modifiers changed from: private */
    public final Object zzq;
    @GuardedBy("mServiceBrokerLock")
    @Nullable
    private C0440IGmsServiceBroker zzr;
    @GuardedBy("mLock")
    @Nullable
    private T zzs;
    /* access modifiers changed from: private */
    public final ArrayList<C0523zzc<?>> zzt;
    @GuardedBy("mLock")
    @Nullable
    private C0525zze zzu;
    @GuardedBy("mLock")
    private int zzv;
    /* access modifiers changed from: private */
    @Nullable
    public final BaseConnectionCallbacks zzw;
    /* access modifiers changed from: private */
    @Nullable
    public final BaseOnConnectionFailedListener zzx;
    private final int zzy;
    @Nullable
    private final String zzz;

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface BaseConnectionCallbacks {
        @C0206KeepForSdk
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
        @C0206KeepForSdk
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        @C0206KeepForSdk
        void onConnected(@Nullable Bundle bundle);

        @C0206KeepForSdk
        void onConnectionSuspended(int i);
    }

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface BaseOnConnectionFailedListener {
        @C0206KeepForSdk
        void onConnectionFailed(@RecentlyNonNull C0184ConnectionResult connectionResult);
    }

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface ConnectionProgressReportCallbacks {
        @C0206KeepForSdk
        void onReportServiceBinding(@RecentlyNonNull C0184ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    protected class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        final /* synthetic */ C0424BaseGmsClient zza;

        @C0206KeepForSdk
        public LegacyClientCallbackAdapter(C0424BaseGmsClient baseGmsClient) {
            this.zza = baseGmsClient;
        }

        public final void onReportServiceBinding(@RecentlyNonNull C0184ConnectionResult connectionResult) {
            C0184ConnectionResult connectionResult2 = connectionResult;
            if (connectionResult2.isSuccess()) {
                C0424BaseGmsClient baseGmsClient = this.zza;
                baseGmsClient.getRemoteService((C0437IAccountAccessor) null, baseGmsClient.getScopes());
            } else if (this.zza.zzx != null) {
                this.zza.zzx.onConnectionFailed(connectionResult2);
            }
        }
    }

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface SignOutCallbacks {
        @C0206KeepForSdk
        void onSignOutComplete();
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    @com.google.android.gms.common.util.C0617VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0424BaseGmsClient(@androidx.annotation.RecentlyNonNull android.content.Context r12, @androidx.annotation.RecentlyNonNull android.os.Handler r13, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.C0434GmsClientSupervisor r14, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.C0190GoogleApiAvailabilityLight r15, int r16, @androidx.annotation.Nullable com.google.android.gms.common.internal.C0424BaseGmsClient.BaseConnectionCallbacks r17, @androidx.annotation.Nullable com.google.android.gms.common.internal.C0424BaseGmsClient.BaseOnConnectionFailedListener r18) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r0
            r9.<init>()
            r9 = r0
            r10 = 0
            r9.zzk = r10
            java.lang.Object r9 = new java.lang.Object
            r8 = r9
            r9 = r8
            r9.<init>()
            r9 = r0
            r10 = r8
            r9.zzp = r10
            java.lang.Object r9 = new java.lang.Object
            r8 = r9
            r9 = r8
            r9.<init>()
            r9 = r0
            r10 = r8
            r9.zzq = r10
            java.util.ArrayList r9 = new java.util.ArrayList
            r8 = r9
            r9 = r8
            r9.<init>()
            r9 = r0
            r10 = r8
            r9.zzt = r10
            r9 = r0
            r10 = 1
            r9.zzv = r10
            r9 = r0
            r10 = 0
            r9.zzB = r10
            r9 = r0
            r10 = 0
            r9.zzC = r10
            r9 = r0
            r10 = 0
            r9.zzD = r10
            java.util.concurrent.atomic.AtomicInteger r9 = new java.util.concurrent.atomic.AtomicInteger
            r8 = r9
            r9 = r8
            r10 = 0
            r9.<init>(r10)
            r9 = r0
            r10 = r8
            r9.zzd = r10
            r9 = r1
            java.lang.String r10 = "Context must not be null"
            java.lang.Object r9 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r9, r10)
            r9 = r0
            r10 = r1
            r9.zzl = r10
            r9 = r2
            java.lang.String r10 = "Handler must not be null"
            java.lang.Object r9 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r9, r10)
            r9 = r0
            r10 = r2
            r9.zzb = r10
            r9 = r0
            r10 = r2
            android.os.Looper r10 = r10.getLooper()
            r9.zzm = r10
            r9 = r3
            java.lang.String r10 = "Supervisor must not be null"
            java.lang.Object r9 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r9, r10)
            r9 = r0
            r10 = r3
            r9.zzn = r10
            r9 = r4
            java.lang.String r10 = "API availability must not be null"
            java.lang.Object r9 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r9, r10)
            r9 = r0
            r10 = r4
            r9.zzo = r10
            r9 = r0
            r10 = r5
            r9.zzy = r10
            r9 = r0
            r10 = r6
            r9.zzw = r10
            r9 = r0
            r10 = r7
            r9.zzx = r10
            r9 = r0
            r10 = 0
            r9.zzz = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0424BaseGmsClient.<init>(android.content.Context, android.os.Handler, com.google.android.gms.common.internal.GmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener):void");
    }

    /* JADX INFO: finally extract failed */
    static /* synthetic */ void zzc(C0424BaseGmsClient baseGmsClient, int i) {
        int i2;
        int i3;
        C0424BaseGmsClient baseGmsClient2 = baseGmsClient;
        int i4 = i;
        Object obj = baseGmsClient2.zzp;
        synchronized (obj) {
            try {
                i2 = baseGmsClient2.zzv;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj2 = obj;
                    throw th2;
                }
            }
        }
        if (i2 == 3) {
            baseGmsClient2.zzC = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = baseGmsClient2.zzb;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(i3, baseGmsClient2.zzd.get(), 16));
    }

    static /* synthetic */ C0440IGmsServiceBroker zze(C0424BaseGmsClient baseGmsClient, C0440IGmsServiceBroker iGmsServiceBroker) {
        C0440IGmsServiceBroker iGmsServiceBroker2 = iGmsServiceBroker;
        baseGmsClient.zzr = iGmsServiceBroker2;
        return iGmsServiceBroker2;
    }

    static /* synthetic */ C0184ConnectionResult zzf(C0424BaseGmsClient baseGmsClient, C0184ConnectionResult connectionResult) {
        C0184ConnectionResult connectionResult2 = connectionResult;
        baseGmsClient.zzB = connectionResult2;
        return connectionResult2;
    }

    static /* synthetic */ boolean zzg(C0424BaseGmsClient baseGmsClient) {
        boolean z;
        C0424BaseGmsClient baseGmsClient2 = baseGmsClient;
        if (baseGmsClient2.zzC) {
            z = false;
        } else if (TextUtils.isEmpty(baseGmsClient2.getServiceDescriptor())) {
            z = false;
        } else if (TextUtils.isEmpty(baseGmsClient2.getLocalStartServiceAction())) {
            z = false;
        } else {
            try {
                Class<?> cls = Class.forName(baseGmsClient2.getServiceDescriptor());
                z = true;
            } catch (ClassNotFoundException e) {
                z = false;
            }
        }
        return z;
    }

    static /* synthetic */ void zzi(C0424BaseGmsClient baseGmsClient, int i, IInterface iInterface) {
        IInterface iInterface2 = iInterface;
        baseGmsClient.zzp(i, (IInterface) null);
    }

    /* JADX INFO: finally extract failed */
    static /* synthetic */ boolean zzl(C0424BaseGmsClient baseGmsClient, int i, int i2, IInterface iInterface) {
        boolean z;
        C0424BaseGmsClient baseGmsClient2 = baseGmsClient;
        int i3 = i;
        int i4 = i2;
        IInterface iInterface2 = iInterface;
        Object obj = baseGmsClient2.zzp;
        synchronized (obj) {
            try {
                if (baseGmsClient2.zzv != i3) {
                    z = false;
                } else {
                    baseGmsClient2.zzp(i4, iInterface2);
                    z = true;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return z;
    }

    static /* synthetic */ void zzo(C0424BaseGmsClient baseGmsClient, C0529zzi zzi2) {
        C0424BaseGmsClient baseGmsClient2 = baseGmsClient;
        C0529zzi zzi3 = zzi2;
        baseGmsClient2.zzD = zzi3;
        if (baseGmsClient2.usesClientTelemetry()) {
            C0428ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzi3.zzd;
            C0449RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.getRootTelemetryConfiguration());
        }
    }

    /* JADX INFO: finally extract failed */
    private final void zzp(int i, @Nullable T t) {
        boolean z;
        boolean z2;
        boolean z3;
        C0525zze zze2;
        C0540zzt zzt2;
        C0533zzm zzm2;
        StringBuilder sb;
        Throwable th;
        String str;
        C0540zzt zzt3;
        StringBuilder sb2;
        int i2 = i;
        T t2 = t;
        if (i2 != 4) {
            z = false;
        } else {
            z = true;
        }
        if (t2 == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0446Preconditions.checkArgument(z3);
        Object obj = this.zzp;
        synchronized (obj) {
            try {
                this.zzv = i2;
                this.zzs = t2;
                switch (i2) {
                    case 1:
                        C0525zze zze3 = this.zzu;
                        if (zze3 != null) {
                            C0434GmsClientSupervisor gmsClientSupervisor = this.zzn;
                            String zza2 = this.zza.zza();
                            Object checkNotNull = C0446Preconditions.checkNotNull(zza2);
                            gmsClientSupervisor.zza(zza2, this.zza.zzb(), this.zza.zzc(), zze3, zza(), this.zza.zzd());
                            this.zzu = null;
                            break;
                        }
                        break;
                    case 2:
                    case 3:
                        C0525zze zze4 = this.zzu;
                        if (!(zze4 == null || (zzt3 = this.zza) == null)) {
                            String zza3 = zzt3.zza();
                            String zzb2 = this.zza.zzb();
                            new StringBuilder(String.valueOf(zza3).length() + 70 + String.valueOf(zzb2).length());
                            StringBuilder append = sb2.append("Calling connect() while still connected, missing disconnect() for ");
                            StringBuilder append2 = sb2.append(zza3);
                            StringBuilder append3 = sb2.append(" on ");
                            StringBuilder append4 = sb2.append(zzb2);
                            int e = Log.e("GmsClient", sb2.toString());
                            C0434GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                            String zza4 = this.zza.zza();
                            Object checkNotNull2 = C0446Preconditions.checkNotNull(zza4);
                            gmsClientSupervisor2.zza(zza4, this.zza.zzb(), this.zza.zzc(), zze4, zza(), this.zza.zzd());
                            int incrementAndGet = this.zzd.incrementAndGet();
                        }
                        new C0525zze(this, this.zzd.get());
                        this.zzu = zze2;
                        if (this.zzv != 3 || getLocalStartServiceAction() == null) {
                            new C0540zzt(getStartServicePackage(), getStartServiceAction(), false, C0434GmsClientSupervisor.getDefaultBindFlags(), getUseDynamicLookup());
                        } else {
                            new C0540zzt(getContext().getPackageName(), getLocalStartServiceAction(), true, C0434GmsClientSupervisor.getDefaultBindFlags(), false);
                        }
                        this.zza = zzt2;
                        if (!this.zza.zzd() || getMinApkVersion() >= 17895000) {
                            C0434GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                            String zza5 = this.zza.zza();
                            Object checkNotNull3 = C0446Preconditions.checkNotNull(zza5);
                            String zzb3 = this.zza.zzb();
                            int zzc2 = this.zza.zzc();
                            String zza6 = zza();
                            new C0533zzm(zza5, zzb3, zzc2, this.zza.zzd());
                            if (!gmsClientSupervisor3.zzb(zzm2, zze2, zza6)) {
                                String zza7 = this.zza.zza();
                                String zzb4 = this.zza.zzb();
                                new StringBuilder(String.valueOf(zza7).length() + 34 + String.valueOf(zzb4).length());
                                StringBuilder append5 = sb.append("unable to connect to service: ");
                                StringBuilder append6 = sb.append(zza7);
                                StringBuilder append7 = sb.append(" on ");
                                StringBuilder append8 = sb.append(zzb4);
                                int e2 = Log.e("GmsClient", sb.toString());
                                zzb(16, (Bundle) null, this.zzd.get());
                                break;
                            }
                        } else {
                            String str2 = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ";
                            String valueOf = String.valueOf(this.zza.zza());
                            if (valueOf.length() != 0) {
                                str = str2.concat(valueOf);
                            } else {
                                new String(str2);
                            }
                            new IllegalStateException(str);
                            throw th;
                        }
                        break;
                    case 4:
                        Object checkNotNull4 = C0446Preconditions.checkNotNull(t2);
                        onConnectedLocked(t2);
                        break;
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                Object obj2 = obj;
                throw th3;
            }
        }
    }

    @C0206KeepForSdk
    public void checkAvailabilityAndConnect() {
        ConnectionProgressReportCallbacks connectionProgressReportCallbacks;
        ConnectionProgressReportCallbacks connectionProgressReportCallbacks2;
        int isGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
        if (isGooglePlayServicesAvailable != 0) {
            zzp(1, (IInterface) null);
            new LegacyClientCallbackAdapter(this);
            triggerNotAvailable(connectionProgressReportCallbacks2, isGooglePlayServicesAvailable, (PendingIntent) null);
            return;
        }
        new LegacyClientCallbackAdapter(this);
        connect(connectionProgressReportCallbacks);
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public final void checkConnected() {
        Throwable th;
        if (!isConnected()) {
            new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            throw th;
        }
    }

    @C0206KeepForSdk
    public void connect(@RecentlyNonNull ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        ConnectionProgressReportCallbacks connectionProgressReportCallbacks2 = connectionProgressReportCallbacks;
        Object checkNotNull = C0446Preconditions.checkNotNull(connectionProgressReportCallbacks2, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks2;
        zzp(2, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    @RecentlyNullable
    public abstract T createServiceInterface(@RecentlyNonNull IBinder iBinder);

    @C0206KeepForSdk
    public void disconnect() {
        Throwable th;
        int incrementAndGet = this.zzd.incrementAndGet();
        Object obj = this.zzt;
        synchronized (obj) {
            try {
                int size = this.zzt.size();
                for (int i = 0; i < size; i++) {
                    this.zzt.get(i).zzg();
                }
                this.zzt.clear();
            } finally {
                while (true) {
                    th = th;
                    Object obj2 = obj;
                    Throwable th2 = th;
                }
            }
        }
        obj = this.zzq;
        synchronized (obj) {
            try {
                this.zzr = null;
            } catch (Throwable th3) {
                while (true) {
                    throw th;
                }
            }
        }
        zzp(1, (IInterface) null);
    }

    /* JADX INFO: finally extract failed */
    @C0206KeepForSdk
    public void dump(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr) {
        int i;
        T t;
        C0440IGmsServiceBroker iGmsServiceBroker;
        SimpleDateFormat simpleDateFormat;
        Date date;
        StringBuilder sb;
        Date date2;
        StringBuilder sb2;
        Date date3;
        StringBuilder sb3;
        String str2 = str;
        FileDescriptor fileDescriptor2 = fileDescriptor;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        Object obj = this.zzp;
        synchronized (obj) {
            try {
                i = this.zzv;
                t = this.zzs;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj2 = obj;
                    throw th2;
                }
            }
        }
        Object obj3 = this.zzq;
        synchronized (obj3) {
            try {
                iGmsServiceBroker = this.zzr;
            } catch (Throwable th3) {
                while (true) {
                    Throwable th4 = th3;
                    Object obj4 = obj3;
                    throw th4;
                }
            }
        }
        PrintWriter append = printWriter2.append(str2).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter2.print("DISCONNECTED");
                break;
            case 2:
                printWriter2.print("REMOTE_CONNECTING");
                break;
            case 3:
                printWriter2.print("LOCAL_CONNECTING");
                break;
            case 4:
                printWriter2.print("CONNECTED");
                break;
            case 5:
                printWriter2.print("DISCONNECTING");
                break;
            default:
                printWriter2.print("UNKNOWN");
                break;
        }
        PrintWriter append2 = printWriter2.append(" mService=");
        if (t == null) {
            PrintWriter append3 = printWriter2.append("null");
        } else {
            PrintWriter append4 = printWriter2.append(getServiceDescriptor()).append(GetNamedPart.CAST_METHOD_NAME).append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        PrintWriter append5 = printWriter2.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter2.println("null");
        } else {
            printWriter2.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append6 = printWriter2.append(str2).append("lastConnectedTime=");
            long j = this.zzh;
            new Date(j);
            String format = simpleDateFormat.format(date3);
            new StringBuilder(String.valueOf(format).length() + 21);
            StringBuilder append7 = sb3.append(j);
            StringBuilder append8 = sb3.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            StringBuilder append9 = sb3.append(format);
            append6.println(sb3.toString());
        }
        if (this.zzg > 0) {
            PrintWriter append10 = printWriter2.append(str2).append("lastSuspendedCause=");
            int i2 = this.zzf;
            switch (i2) {
                case 1:
                    PrintWriter append11 = printWriter2.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    PrintWriter append12 = printWriter2.append("CAUSE_NETWORK_LOST");
                    break;
                case 3:
                    PrintWriter append13 = printWriter2.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    break;
                default:
                    PrintWriter append14 = printWriter2.append(String.valueOf(i2));
                    break;
            }
            PrintWriter append15 = printWriter2.append(" lastSuspendedTime=");
            long j2 = this.zzg;
            new Date(j2);
            String format2 = simpleDateFormat.format(date2);
            new StringBuilder(String.valueOf(format2).length() + 21);
            StringBuilder append16 = sb2.append(j2);
            StringBuilder append17 = sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            StringBuilder append18 = sb2.append(format2);
            append15.println(sb2.toString());
        }
        if (this.zzj > 0) {
            PrintWriter append19 = printWriter2.append(str2).append("lastFailedStatus=").append(C0218CommonStatusCodes.getStatusCodeString(this.zzi));
            PrintWriter append20 = printWriter2.append(" lastFailedTime=");
            long j3 = this.zzj;
            new Date(j3);
            String format3 = simpleDateFormat.format(date);
            new StringBuilder(String.valueOf(format3).length() + 21);
            StringBuilder append21 = sb.append(j3);
            StringBuilder append22 = sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            StringBuilder append23 = sb.append(format3);
            append20.println(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public boolean enableLocalFallback() {
        return false;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public Account getAccount() {
        return null;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public C0186Feature[] getApiFeatures() {
        return zze;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public final C0186Feature[] getAvailableFeatures() {
        C0529zzi zzi2 = this.zzD;
        if (zzi2 == null) {
            return null;
        }
        return zzi2.zzb;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public Bundle getConnectionHint() {
        return null;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public final Context getContext() {
        return this.zzl;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public String getEndpointPackageName() {
        Throwable th;
        C0540zzt zzt2;
        if (isConnected() && (zzt2 = this.zza) != null) {
            return zzt2.zzb();
        }
        new RuntimeException("Failed to connect when checking package");
        throw th;
    }

    @C0206KeepForSdk
    public int getGCoreServiceId() {
        return this.zzy;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @C0206KeepForSdk
    public Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle;
        new Bundle();
        return bundle;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    @RecentlyNullable
    public String getLocalStartServiceAction() {
        return null;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public final Looper getLooper() {
        return this.zzm;
    }

    @C0206KeepForSdk
    public int getMinApkVersion() {
        return C0190GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @WorkerThread
    @C0206KeepForSdk
    public void getRemoteService(@Nullable C0437IAccountAccessor iAccountAccessor, @RecentlyNonNull Set<C0235Scope> set) {
        C0432GetServiceRequest getServiceRequest;
        Object obj;
        Throwable th;
        C0439IGmsCallbacks iGmsCallbacks;
        C0437IAccountAccessor iAccountAccessor2 = iAccountAccessor;
        Set<C0235Scope> set2 = set;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        new C0432GetServiceRequest(this.zzy, this.zzA);
        getServiceRequest.zzd = this.zzl.getPackageName();
        getServiceRequest.zzg = getServiceRequestExtraArgs;
        if (set2 != null) {
            getServiceRequest.zzf = (C0235Scope[]) set2.toArray(new C0235Scope[set2.size()]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                new Account("<<default account>>", "com.google");
            }
            getServiceRequest.zzh = account;
            if (iAccountAccessor2 != null) {
                getServiceRequest.zze = iAccountAccessor2.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.zzh = getAccount();
        }
        getServiceRequest.zzi = zze;
        getServiceRequest.zzj = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.zzm = true;
        }
        try {
            obj = this.zzq;
            synchronized (obj) {
                C0440IGmsServiceBroker iGmsServiceBroker = this.zzr;
                if (iGmsServiceBroker != null) {
                    new C0524zzd(this, this.zzd.get());
                    iGmsServiceBroker.getService(iGmsCallbacks, getServiceRequest);
                } else {
                    int w = Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            int w2 = Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            int w3 = Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            onPostInitHandler(8, (IBinder) null, (Bundle) null, this.zzd.get());
        } catch (Throwable th2) {
            while (true) {
                th = th2;
                Object obj2 = obj;
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @C0206KeepForSdk
    public Set<C0235Scope> getScopes() {
        return Collections.emptySet();
    }

    /* JADX INFO: finally extract failed */
    @RecentlyNonNull
    @C0206KeepForSdk
    public final T getService() throws DeadObjectException {
        T t;
        Throwable th;
        Object obj = this.zzp;
        synchronized (obj) {
            try {
                if (this.zzv == 5) {
                    new DeadObjectException();
                    throw th;
                }
                checkConnected();
                t = this.zzs;
                Object checkNotNull = C0446Preconditions.checkNotNull(t, "Client is connected but service is null");
            } catch (Throwable th2) {
                Throwable th3 = th2;
                Object obj2 = obj;
                throw th3;
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @C0206KeepForSdk
    public abstract String getServiceDescriptor();

    @RecentlyNonNull
    @C0206KeepForSdk
    public Intent getSignInIntent() {
        Throwable th;
        new UnsupportedOperationException("Not a sign in API");
        throw th;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @C0206KeepForSdk
    public abstract String getStartServiceAction();

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @C0206KeepForSdk
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public C0428ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        C0529zzi zzi2 = this.zzD;
        if (zzi2 == null) {
            return null;
        }
        return zzi2.zzd;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public boolean getUseDynamicLookup() {
        return false;
    }

    @C0206KeepForSdk
    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    /* JADX INFO: finally extract failed */
    @C0206KeepForSdk
    public boolean isConnected() {
        boolean z;
        Object obj = this.zzp;
        synchronized (obj) {
            try {
                z = this.zzv == 4;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    @C0206KeepForSdk
    public boolean isConnecting() {
        boolean z;
        Object obj = this.zzp;
        synchronized (obj) {
            try {
                int i = this.zzv;
                z = i != 2 ? i == 3 : true;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    @C0206KeepForSdk
    public void onConnectedLocked(@RecentlyNonNull T t) {
        T t2 = t;
        long currentTimeMillis = System.currentTimeMillis();
        this.zzh = currentTimeMillis;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    @C0206KeepForSdk
    public void onConnectionFailed(@RecentlyNonNull C0184ConnectionResult connectionResult) {
        this.zzi = connectionResult.getErrorCode();
        this.zzj = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    @C0206KeepForSdk
    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public void onPostInitHandler(int i, @Nullable IBinder iBinder, @Nullable Bundle bundle, int i2) {
        Object obj;
        Handler handler = this.zzb;
        new C0526zzf(this, i, iBinder, bundle);
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(1, i2, -1, obj));
    }

    @C0206KeepForSdk
    public void onUserSignOut(@RecentlyNonNull SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
    }

    @C0206KeepForSdk
    public boolean providesSignIn() {
        return false;
    }

    @C0206KeepForSdk
    public boolean requiresAccount() {
        return false;
    }

    @C0206KeepForSdk
    public boolean requiresGooglePlayServices() {
        return true;
    }

    @C0206KeepForSdk
    public boolean requiresSignIn() {
        return false;
    }

    @C0206KeepForSdk
    public void setAttributionTag(@RecentlyNonNull String str) {
        String str2 = str;
        this.zzA = str2;
    }

    @C0206KeepForSdk
    public void triggerConnectionSuspended(int i) {
        Handler handler = this.zzb;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i));
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    @C0617VisibleForTesting
    public void triggerNotAvailable(@RecentlyNonNull ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, @Nullable PendingIntent pendingIntent) {
        ConnectionProgressReportCallbacks connectionProgressReportCallbacks2 = connectionProgressReportCallbacks;
        Object checkNotNull = C0446Preconditions.checkNotNull(connectionProgressReportCallbacks2, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks2;
        Handler handler = this.zzb;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i, pendingIntent));
    }

    @C0206KeepForSdk
    public boolean usesClientTelemetry() {
        return false;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    /* access modifiers changed from: protected */
    public final void zzb(int i, @Nullable Bundle bundle, int i2) {
        Object obj;
        Bundle bundle2 = bundle;
        Handler handler = this.zzb;
        new C0527zzg(this, i, (Bundle) null);
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(7, i2, -1, obj));
    }

    /* JADX INFO: finally extract failed */
    @C0206KeepForSdk
    @RecentlyNullable
    public IBinder getServiceBrokerBinder() {
        Object obj = this.zzq;
        synchronized (obj) {
            try {
                C0440IGmsServiceBroker iGmsServiceBroker = this.zzr;
                if (iGmsServiceBroker == null) {
                    return null;
                }
                IBinder asBinder = iGmsServiceBroker.asBinder();
                return asBinder;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0424BaseGmsClient(@androidx.annotation.RecentlyNonNull android.content.Context r19, @androidx.annotation.RecentlyNonNull android.os.Looper r20, int r21, @androidx.annotation.Nullable com.google.android.gms.common.internal.C0424BaseGmsClient.BaseConnectionCallbacks r22, @androidx.annotation.Nullable com.google.android.gms.common.internal.C0424BaseGmsClient.BaseOnConnectionFailedListener r23, @androidx.annotation.Nullable java.lang.String r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r9 = r1
            com.google.android.gms.common.internal.GmsClientSupervisor r9 = com.google.android.gms.common.internal.C0434GmsClientSupervisor.getInstance(r9)
            r7 = r9
            com.google.android.gms.common.GoogleApiAvailabilityLight r9 = com.google.android.gms.common.C0190GoogleApiAvailabilityLight.getInstance()
            r8 = r9
            r9 = r4
            java.lang.Object r9 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r9)
            r9 = r5
            java.lang.Object r9 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r9)
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r7
            r13 = r8
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0424BaseGmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, java.lang.String):void");
    }

    @C0206KeepForSdk
    public void disconnect(@RecentlyNonNull String str) {
        this.zzk = str;
        disconnect();
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    @com.google.android.gms.common.util.C0617VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0424BaseGmsClient(@androidx.annotation.RecentlyNonNull android.content.Context r14, @androidx.annotation.RecentlyNonNull android.os.Looper r15, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.internal.C0434GmsClientSupervisor r16, @androidx.annotation.RecentlyNonNull com.google.android.gms.common.C0190GoogleApiAvailabilityLight r17, int r18, @androidx.annotation.Nullable com.google.android.gms.common.internal.C0424BaseGmsClient.BaseConnectionCallbacks r19, @androidx.annotation.Nullable com.google.android.gms.common.internal.C0424BaseGmsClient.BaseOnConnectionFailedListener r20, @androidx.annotation.Nullable java.lang.String r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r10 = r0
            r10.<init>()
            r10 = r0
            r11 = 0
            r10.zzk = r11
            java.lang.Object r10 = new java.lang.Object
            r9 = r10
            r10 = r9
            r10.<init>()
            r10 = r0
            r11 = r9
            r10.zzp = r11
            java.lang.Object r10 = new java.lang.Object
            r9 = r10
            r10 = r9
            r10.<init>()
            r10 = r0
            r11 = r9
            r10.zzq = r11
            java.util.ArrayList r10 = new java.util.ArrayList
            r9 = r10
            r10 = r9
            r10.<init>()
            r10 = r0
            r11 = r9
            r10.zzt = r11
            r10 = r0
            r11 = 1
            r10.zzv = r11
            r10 = r0
            r11 = 0
            r10.zzB = r11
            r10 = r0
            r11 = 0
            r10.zzC = r11
            r10 = r0
            r11 = 0
            r10.zzD = r11
            java.util.concurrent.atomic.AtomicInteger r10 = new java.util.concurrent.atomic.AtomicInteger
            r9 = r10
            r10 = r9
            r11 = 0
            r10.<init>(r11)
            r10 = r0
            r11 = r9
            r10.zzd = r11
            r10 = r1
            java.lang.String r11 = "Context must not be null"
            java.lang.Object r10 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r10, r11)
            r10 = r0
            r11 = r1
            r10.zzl = r11
            r10 = r2
            java.lang.String r11 = "Looper must not be null"
            java.lang.Object r10 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r10, r11)
            r10 = r0
            r11 = r2
            r10.zzm = r11
            r10 = r3
            java.lang.String r11 = "Supervisor must not be null"
            java.lang.Object r10 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r10, r11)
            r10 = r0
            r11 = r3
            r10.zzn = r11
            r10 = r4
            java.lang.String r11 = "API availability must not be null"
            java.lang.Object r10 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r10, r11)
            r10 = r0
            r11 = r4
            r10.zzo = r11
            com.google.android.gms.common.internal.zzb r10 = new com.google.android.gms.common.internal.zzb
            r1 = r10
            r10 = r1
            r11 = r0
            r12 = r2
            r10.<init>(r11, r12)
            r10 = r0
            r11 = r1
            r10.zzb = r11
            r10 = r0
            r11 = r5
            r10.zzy = r11
            r10 = r0
            r11 = r6
            r10.zzw = r11
            r10 = r0
            r11 = r7
            r10.zzx = r11
            r10 = r0
            r11 = r8
            r10.zzz = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0424BaseGmsClient.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.GmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, java.lang.String):void");
    }
}

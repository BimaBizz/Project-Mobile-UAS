package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zak implements Handler.Callback {
    @VisibleForTesting
    final ArrayList<GoogleApiClient.ConnectionCallbacks> zaa;
    @NotOnlyInitialized
    private final zaj zab;
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> zac;
    private final ArrayList<GoogleApiClient.OnConnectionFailedListener> zad;
    private volatile boolean zae = false;
    private final AtomicInteger zaf;
    private boolean zag;
    private final Handler zah;
    private final Object zai;

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zak(android.os.Looper r8, com.google.android.gms.common.internal.zaj r9) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r0
            r4.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r3 = r4
            r4 = r3
            r4.<init>()
            r4 = r0
            r5 = r3
            r4.zac = r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r3 = r4
            r4 = r3
            r4.<init>()
            r4 = r0
            r5 = r3
            r4.zaa = r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r3 = r4
            r4 = r3
            r4.<init>()
            r4 = r0
            r5 = r3
            r4.zad = r5
            r4 = r0
            r5 = 0
            r4.zae = r5
            java.util.concurrent.atomic.AtomicInteger r4 = new java.util.concurrent.atomic.AtomicInteger
            r3 = r4
            r4 = r3
            r5 = 0
            r4.<init>(r5)
            r4 = r0
            r5 = r3
            r4.zaf = r5
            r4 = r0
            r5 = 0
            r4.zag = r5
            java.lang.Object r4 = new java.lang.Object
            r3 = r4
            r4 = r3
            r4.<init>()
            r4 = r0
            r5 = r3
            r4.zai = r5
            r4 = r0
            r5 = r2
            r4.zab = r5
            com.google.android.gms.internal.base.zap r4 = new com.google.android.gms.internal.base.zap
            r2 = r4
            r4 = r2
            r5 = r1
            r6 = r0
            r4.<init>(r5, r6)
            r4 = r0
            r5 = r2
            r4.zah = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zak.<init>(android.os.Looper, com.google.android.gms.common.internal.zaj):void");
    }

    public final boolean handleMessage(Message message) {
        StringBuilder sb;
        Throwable th;
        Message message2 = message;
        if (message2.what == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message2.obj;
            Object obj = this.zai;
            synchronized (obj) {
                try {
                    if (this.zae && this.zab.isConnected() && this.zac.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnected((Bundle) null);
                    }
                } catch (Throwable th2) {
                    while (true) {
                        Throwable th3 = th2;
                        Object obj2 = obj;
                        throw th3;
                    }
                }
            }
            return true;
        }
        int i = message2.what;
        new StringBuilder(45);
        StringBuilder append = sb.append("Don't know how to handle message: ");
        StringBuilder append2 = sb.append(i);
        String sb2 = sb.toString();
        new Exception();
        int wtf = Log.wtf("GmsClientEvents", sb2, th);
        return false;
    }

    public final void zaa() {
        this.zae = false;
        int incrementAndGet = this.zaf.incrementAndGet();
    }

    public final void zab() {
        this.zae = true;
    }

    /* JADX INFO: finally extract failed */
    @VisibleForTesting
    public final void zac(@Nullable Bundle bundle) {
        boolean z;
        ArrayList arrayList;
        Bundle bundle2 = bundle;
        Preconditions.checkHandlerThread(this.zah, "onConnectionSuccess must only be called on the Handler thread");
        Object obj = this.zai;
        synchronized (obj) {
            try {
                Preconditions.checkState(!this.zag);
                this.zah.removeMessages(1);
                this.zag = true;
                if (this.zaa.size() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z);
                new ArrayList(this.zac);
                int i = this.zaf.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                    if (!this.zae || !this.zab.isConnected() || this.zaf.get() != i) {
                        break;
                    } else if (!this.zaa.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnected(bundle2);
                    }
                }
                this.zaa.clear();
                this.zag = false;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @VisibleForTesting
    public final void zad(int i) {
        ArrayList arrayList;
        int i2 = i;
        Preconditions.checkHandlerThread(this.zah, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.zah.removeMessages(1);
        Object obj = this.zai;
        synchronized (obj) {
            try {
                this.zag = true;
                new ArrayList(this.zac);
                int i3 = this.zaf.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                    if (!this.zae || this.zaf.get() != i3) {
                        break;
                    } else if (this.zac.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnectionSuspended(i2);
                    }
                }
                this.zaa.clear();
                this.zag = false;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @VisibleForTesting
    public final void zae(ConnectionResult connectionResult) {
        ArrayList arrayList;
        ConnectionResult connectionResult2 = connectionResult;
        Preconditions.checkHandlerThread(this.zah, "onConnectionFailure must only be called on the Handler thread");
        this.zah.removeMessages(1);
        Object obj = this.zai;
        synchronized (obj) {
            try {
                new ArrayList(this.zad);
                int i = this.zaf.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) it.next();
                    if (this.zae && this.zaf.get() == i) {
                        if (this.zad.contains(onConnectionFailedListener)) {
                            onConnectionFailedListener.onConnectionFailed(connectionResult2);
                        }
                    } else {
                        return;
                    }
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void zaf(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        StringBuilder sb;
        GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        Object checkNotNull = Preconditions.checkNotNull(connectionCallbacks2);
        Object obj = this.zai;
        synchronized (obj) {
            try {
                if (this.zac.contains(connectionCallbacks2)) {
                    String valueOf = String.valueOf(connectionCallbacks2);
                    new StringBuilder(String.valueOf(valueOf).length() + 62);
                    StringBuilder append = sb.append("registerConnectionCallbacks(): listener ");
                    StringBuilder append2 = sb.append(valueOf);
                    StringBuilder append3 = sb.append(" is already registered");
                    int w = Log.w("GmsClientEvents", sb.toString());
                } else {
                    boolean add = this.zac.add(connectionCallbacks2);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        if (this.zab.isConnected()) {
            Handler handler = this.zah;
            boolean sendMessage = handler.sendMessage(handler.obtainMessage(1, connectionCallbacks2));
        }
    }

    public final boolean zag(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean contains;
        GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        Object checkNotNull = Preconditions.checkNotNull(connectionCallbacks2);
        Object obj = this.zai;
        synchronized (obj) {
            try {
                contains = this.zac.contains(connectionCallbacks2);
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return contains;
    }

    /* JADX INFO: finally extract failed */
    public final void zah(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        StringBuilder sb;
        GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        Object checkNotNull = Preconditions.checkNotNull(connectionCallbacks2);
        Object obj = this.zai;
        synchronized (obj) {
            try {
                if (!this.zac.remove(connectionCallbacks2)) {
                    String valueOf = String.valueOf(connectionCallbacks2);
                    new StringBuilder(String.valueOf(valueOf).length() + 52);
                    StringBuilder append = sb.append("unregisterConnectionCallbacks(): listener ");
                    StringBuilder append2 = sb.append(valueOf);
                    StringBuilder append3 = sb.append(" not found");
                    int w = Log.w("GmsClientEvents", sb.toString());
                } else if (this.zag) {
                    boolean add = this.zaa.add(connectionCallbacks2);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void zai(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        StringBuilder sb;
        GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
        Object checkNotNull = Preconditions.checkNotNull(onConnectionFailedListener2);
        Object obj = this.zai;
        synchronized (obj) {
            try {
                if (this.zad.contains(onConnectionFailedListener2)) {
                    String valueOf = String.valueOf(onConnectionFailedListener2);
                    new StringBuilder(String.valueOf(valueOf).length() + 67);
                    StringBuilder append = sb.append("registerConnectionFailedListener(): listener ");
                    StringBuilder append2 = sb.append(valueOf);
                    StringBuilder append3 = sb.append(" is already registered");
                    int w = Log.w("GmsClientEvents", sb.toString());
                } else {
                    boolean add = this.zad.add(onConnectionFailedListener2);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    public final boolean zaj(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean contains;
        GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
        Object checkNotNull = Preconditions.checkNotNull(onConnectionFailedListener2);
        Object obj = this.zai;
        synchronized (obj) {
            try {
                contains = this.zad.contains(onConnectionFailedListener2);
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return contains;
    }

    /* JADX INFO: finally extract failed */
    public final void zak(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        StringBuilder sb;
        GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
        Object checkNotNull = Preconditions.checkNotNull(onConnectionFailedListener2);
        Object obj = this.zai;
        synchronized (obj) {
            try {
                if (!this.zad.remove(onConnectionFailedListener2)) {
                    String valueOf = String.valueOf(onConnectionFailedListener2);
                    new StringBuilder(String.valueOf(valueOf).length() + 57);
                    StringBuilder append = sb.append("unregisterConnectionFailedListener(): listener ");
                    StringBuilder append2 = sb.append(valueOf);
                    StringBuilder append3 = sb.append(" not found");
                    int w = Log.w("GmsClientEvents", sb.toString());
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }
}

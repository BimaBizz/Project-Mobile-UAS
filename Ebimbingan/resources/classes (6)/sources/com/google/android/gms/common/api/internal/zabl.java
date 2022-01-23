package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.zap;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zabl<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zat {
    final /* synthetic */ GoogleApiManager zaa;
    private final Queue<zai> zab;
    /* access modifiers changed from: private */
    @NotOnlyInitialized
    public final Api.Client zac;
    /* access modifiers changed from: private */
    public final ApiKey<O> zad;
    private final zaaa zae;
    private final Set<zal> zaf;
    private final Map<ListenerHolder.ListenerKey<?>, zacc> zag;
    private final int zah;
    @Nullable
    private final zaco zai;
    private boolean zaj;
    private final List<zabm> zak;
    @Nullable
    private ConnectionResult zal = null;
    private int zam = 0;

    @WorkerThread
    public zabl(GoogleApiManager googleApiManager, GoogleApi<O> googleApi) {
        Queue<zai> queue;
        Set<zal> set;
        Map<ListenerHolder.ListenerKey<?>, zacc> map;
        List<zabm> list;
        zaaa zaaa;
        GoogleApiManager googleApiManager2 = googleApiManager;
        GoogleApi<O> googleApi2 = googleApi;
        this.zaa = googleApiManager2;
        new LinkedList();
        this.zab = queue;
        new HashSet();
        this.zaf = set;
        new HashMap();
        this.zag = map;
        new ArrayList();
        this.zak = list;
        this.zac = googleApi2.zaa(googleApiManager2.zat.getLooper(), this);
        this.zad = googleApi2.getApiKey();
        new zaaa();
        this.zae = zaaa;
        this.zah = googleApi2.zab();
        if (this.zac.requiresSignIn()) {
            this.zai = googleApi2.zac(googleApiManager2.zak, googleApiManager2.zat);
            return;
        }
        this.zai = null;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zaB() {
        TaskCompletionSource taskCompletionSource;
        zah();
        zaM(ConnectionResult.RESULT_SUCCESS);
        zaJ();
        Iterator<zacc> it = this.zag.values().iterator();
        while (it.hasNext()) {
            zacc next = it.next();
            if (zaN(next.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod = next.zaa;
                    Api.Client client = this.zac;
                    new TaskCompletionSource();
                    registerListenerMethod.registerListener(client, taskCompletionSource);
                } catch (DeadObjectException e) {
                    onConnectionSuspended(3);
                    this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e2) {
                    it.remove();
                }
            }
        }
        zaE();
        zaK();
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zaC(int i) {
        zah();
        this.zaj = true;
        this.zae.zae(i, this.zac.getLastDisconnectMessage());
        boolean sendMessageDelayed = this.zaa.zat.sendMessageDelayed(Message.obtain(this.zaa.zat, 9, this.zad), this.zaa.zac);
        boolean sendMessageDelayed2 = this.zaa.zat.sendMessageDelayed(Message.obtain(this.zaa.zat, 11, this.zad), this.zaa.zad);
        this.zaa.zam.zac();
        for (zacc zacc : this.zag.values()) {
            zacc.zac.run();
        }
    }

    /* JADX INFO: finally extract failed */
    @WorkerThread
    private final boolean zaD(@NonNull ConnectionResult connectionResult) {
        ConnectionResult connectionResult2 = connectionResult;
        Object zax = GoogleApiManager.zag;
        synchronized (zax) {
            try {
                if (this.zaa.zaq == null || !this.zaa.zar.contains(this.zad)) {
                    return false;
                }
                this.zaa.zaq.zaf(connectionResult2, this.zah);
                return true;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj = zax;
                throw th2;
            }
        }
    }

    @WorkerThread
    private final void zaE() {
        List list;
        new ArrayList(this.zab);
        int size = list.size();
        int i = 0;
        while (i < size) {
            zai zai2 = (zai) list.get(i);
            if (this.zac.isConnected()) {
                if (zaF(zai2)) {
                    boolean remove = this.zab.remove(zai2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @WorkerThread
    private final boolean zaF(zai zai2) {
        StringBuilder sb;
        Exception exc;
        Object obj;
        ConnectionResult connectionResult;
        zai zai3 = zai2;
        if (!(zai3 instanceof zac)) {
            zaG(zai3);
            return true;
        }
        zac zac2 = (zac) zai3;
        Feature zaN = zaN(zac2.zaa(this));
        if (zaN == null) {
            zaG(zai3);
            return true;
        }
        String name = this.zac.getClass().getName();
        String name2 = zaN.getName();
        long version = zaN.getVersion();
        new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(name2).length());
        StringBuilder append = sb.append(name);
        StringBuilder append2 = sb.append(" could not execute call because it requires feature (");
        StringBuilder append3 = sb.append(name2);
        StringBuilder append4 = sb.append(", ");
        StringBuilder append5 = sb.append(version);
        StringBuilder append6 = sb.append(").");
        int w = Log.w("GoogleApiManager", sb.toString());
        if (!this.zaa.zau || !zac2.zab(this)) {
            new UnsupportedApiCallException(zaN);
            zac2.zad(exc);
            return true;
        }
        new zabm(this.zad, zaN, (zabg) null);
        int indexOf = this.zak.indexOf(obj);
        if (indexOf >= 0) {
            zabm zabm = this.zak.get(indexOf);
            this.zaa.zat.removeMessages(15, zabm);
            boolean sendMessageDelayed = this.zaa.zat.sendMessageDelayed(Message.obtain(this.zaa.zat, 15, zabm), this.zaa.zac);
        } else {
            boolean add = this.zak.add(obj);
            boolean sendMessageDelayed2 = this.zaa.zat.sendMessageDelayed(Message.obtain(this.zaa.zat, 15, obj), this.zaa.zac);
            boolean sendMessageDelayed3 = this.zaa.zat.sendMessageDelayed(Message.obtain(this.zaa.zat, 16, obj), this.zaa.zad);
            new ConnectionResult(2, (PendingIntent) null);
            if (!zaD(connectionResult)) {
                boolean zap = this.zaa.zap(connectionResult, this.zah);
            }
        }
        return false;
    }

    @WorkerThread
    private final void zaG(zai zai2) {
        Throwable th;
        zai zai3 = zai2;
        zai3.zae(this.zae, zap());
        try {
            zai3.zaf(this);
        } catch (DeadObjectException e) {
            onConnectionSuspended(1);
            this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        } catch (Throwable th2) {
            new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", new Object[]{this.zac.getClass().getName()}), th2);
            throw th;
        }
    }

    @WorkerThread
    private final void zaH(@Nullable Status status, @Nullable Exception exc, boolean z) {
        boolean z2;
        boolean z3;
        Throwable th;
        Status status2 = status;
        Exception exc2 = exc;
        boolean z4 = z;
        Preconditions.checkHandlerThread(this.zaa.zat);
        if (status2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc2 != null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 == z3) {
            new IllegalArgumentException("Status XOR exception should be null");
            throw th;
        }
        Iterator it = this.zab.iterator();
        while (it.hasNext()) {
            zai zai2 = (zai) it.next();
            if (!z4 || zai2.zac == 2) {
                if (status2 != null) {
                    zai2.zac(status2);
                } else {
                    zai2.zad(exc2);
                }
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zaI(Status status) {
        Preconditions.checkHandlerThread(this.zaa.zat);
        zaH(status, (Exception) null, false);
    }

    @WorkerThread
    private final void zaJ() {
        if (this.zaj) {
            this.zaa.zat.removeMessages(11, this.zad);
            this.zaa.zat.removeMessages(9, this.zad);
            this.zaj = false;
        }
    }

    private final void zaK() {
        this.zaa.zat.removeMessages(12, this.zad);
        boolean sendMessageDelayed = this.zaa.zat.sendMessageDelayed(this.zaa.zat.obtainMessage(12, this.zad), this.zaa.zae);
    }

    @WorkerThread
    private final boolean zaL(boolean z) {
        boolean z2 = z;
        Preconditions.checkHandlerThread(this.zaa.zat);
        if (!this.zac.isConnected() || this.zag.size() != 0) {
            return false;
        }
        if (this.zae.zac()) {
            if (z2) {
                zaK();
            }
            return false;
        }
        this.zac.disconnect("Timing out service connection.");
        return true;
    }

    @WorkerThread
    private final void zaM(ConnectionResult connectionResult) {
        String str;
        ConnectionResult connectionResult2 = connectionResult;
        for (zal next : this.zaf) {
            if (Objects.equal(connectionResult2, ConnectionResult.RESULT_SUCCESS)) {
                str = this.zac.getEndpointPackageName();
            } else {
                str = null;
            }
            next.zac(this.zad, connectionResult2, str);
        }
        this.zaf.clear();
    }

    static /* synthetic */ boolean zat(zabl zabl, boolean z) {
        boolean z2 = z;
        return zabl.zaL(false);
    }

    static /* synthetic */ void zau(zabl zabl, zabm zabm) {
        zabl zabl2 = zabl;
        if (!zabl2.zak.contains(zabm) || zabl2.zaj) {
            return;
        }
        if (!zabl2.zac.isConnected()) {
            zabl2.zam();
        } else {
            zabl2.zaE();
        }
    }

    static /* synthetic */ void zav(zabl zabl, zabm zabm) {
        ArrayList arrayList;
        Exception exc;
        Feature[] zaa2;
        zabl zabl2 = zabl;
        zabm zabm2 = zabm;
        if (zabl2.zak.remove(zabm2)) {
            zabl2.zaa.zat.removeMessages(15, zabm2);
            zabl2.zaa.zat.removeMessages(16, zabm2);
            Feature zab2 = zabm2.zab;
            new ArrayList(zabl2.zab.size());
            for (zai zai2 : zabl2.zab) {
                if ((zai2 instanceof zac) && (zaa2 = ((zac) zai2).zaa(zabl2)) != null && ArrayUtils.contains((T[]) zaa2, zab2)) {
                    boolean add = arrayList.add(zai2);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zai zai3 = (zai) arrayList.get(i);
                boolean remove = zabl2.zab.remove(zai3);
                new UnsupportedApiCallException(zab2);
                zai3.zad(exc);
            }
        }
    }

    public final void onConnected(@Nullable Bundle bundle) {
        Runnable runnable;
        Bundle bundle2 = bundle;
        if (Looper.myLooper() == this.zaa.zat.getLooper()) {
            zaB();
            return;
        }
        Handler zas = this.zaa.zat;
        new zabh(this);
        boolean post = zas.post(runnable);
    }

    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zac(connectionResult, (Exception) null);
    }

    public final void onConnectionSuspended(int i) {
        Runnable runnable;
        int i2 = i;
        if (Looper.myLooper() == this.zaa.zat.getLooper()) {
            zaC(i2);
            return;
        }
        Handler zas = this.zaa.zat;
        new zabi(this, i2);
        boolean post = zas.post(runnable);
    }

    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
        ConnectionResult connectionResult2 = connectionResult;
        Api<?> api2 = api;
        boolean z2 = z;
        throw null;
    }

    @WorkerThread
    public final void zab(@NonNull ConnectionResult connectionResult) {
        StringBuilder sb;
        ConnectionResult connectionResult2 = connectionResult;
        Preconditions.checkHandlerThread(this.zaa.zat);
        Api.Client client = this.zac;
        String name = client.getClass().getName();
        String valueOf = String.valueOf(connectionResult2);
        new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(valueOf).length());
        StringBuilder append = sb.append("onSignInFailed for ");
        StringBuilder append2 = sb.append(name);
        StringBuilder append3 = sb.append(" with ");
        StringBuilder append4 = sb.append(valueOf);
        client.disconnect(sb.toString());
        zac(connectionResult2, (Exception) null);
    }

    @WorkerThread
    public final void zac(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        ConnectionResult connectionResult2 = connectionResult;
        Exception exc2 = exc;
        Preconditions.checkHandlerThread(this.zaa.zat);
        zaco zaco = this.zai;
        if (zaco != null) {
            zaco.zad();
        }
        zah();
        this.zaa.zam.zac();
        zaM(connectionResult2);
        if ((this.zac instanceof zap) && connectionResult2.getErrorCode() != 24) {
            boolean zaA = GoogleApiManager.zaA(this.zaa, true);
            boolean sendMessageDelayed = this.zaa.zat.sendMessageDelayed(this.zaa.zat.obtainMessage(19), 300000);
        }
        if (connectionResult2.getErrorCode() == 4) {
            zaI(GoogleApiManager.zab);
        } else if (this.zab.isEmpty()) {
            this.zal = connectionResult2;
        } else if (exc2 != null) {
            Preconditions.checkHandlerThread(this.zaa.zat);
            zaH((Status) null, exc2, false);
        } else if (this.zaa.zau) {
            zaH(GoogleApiManager.zaJ(this.zad, connectionResult2), (Exception) null, true);
            if (!this.zab.isEmpty() && !zaD(connectionResult2) && !this.zaa.zap(connectionResult2, this.zah)) {
                if (connectionResult2.getErrorCode() == 18) {
                    this.zaj = true;
                }
                if (this.zaj) {
                    boolean sendMessageDelayed2 = this.zaa.zat.sendMessageDelayed(Message.obtain(this.zaa.zat, 9, this.zad), this.zaa.zac);
                } else {
                    zaI(GoogleApiManager.zaJ(this.zad, connectionResult2));
                }
            }
        } else {
            zaI(GoogleApiManager.zaJ(this.zad, connectionResult2));
        }
    }

    @WorkerThread
    public final void zad(zai zai2) {
        zai zai3 = zai2;
        Preconditions.checkHandlerThread(this.zaa.zat);
        if (!this.zac.isConnected()) {
            boolean add = this.zab.add(zai3);
            ConnectionResult connectionResult = this.zal;
            if (connectionResult == null || !connectionResult.hasResolution()) {
                zam();
            } else {
                zac(this.zal, (Exception) null);
            }
        } else if (zaF(zai3)) {
            zaK();
        } else {
            boolean add2 = this.zab.add(zai3);
        }
    }

    @WorkerThread
    public final void zae() {
        ConnectionResult connectionResult;
        BaseGmsClient.SignOutCallbacks signOutCallbacks;
        zai zai2;
        TaskCompletionSource taskCompletionSource;
        Preconditions.checkHandlerThread(this.zaa.zat);
        zaI(GoogleApiManager.zaa);
        this.zae.zad();
        ListenerHolder.ListenerKey[] listenerKeyArr = (ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new ListenerHolder.ListenerKey[0]);
        int length = listenerKeyArr.length;
        for (int i = 0; i < length; i++) {
            ListenerHolder.ListenerKey listenerKey = listenerKeyArr[i];
            new TaskCompletionSource();
            new zah(listenerKey, taskCompletionSource);
            zad(zai2);
        }
        new ConnectionResult(4);
        zaM(connectionResult);
        if (this.zac.isConnected()) {
            Api.Client client = this.zac;
            new zabk(this);
            client.onUserSignOut(signOutCallbacks);
        }
    }

    public final Api.Client zaf() {
        return this.zac;
    }

    public final Map<ListenerHolder.ListenerKey<?>, zacc> zag() {
        return this.zag;
    }

    @WorkerThread
    public final void zah() {
        Preconditions.checkHandlerThread(this.zaa.zat);
        this.zal = null;
    }

    @WorkerThread
    @Nullable
    public final ConnectionResult zai() {
        Preconditions.checkHandlerThread(this.zaa.zat);
        return this.zal;
    }

    @WorkerThread
    public final void zaj() {
        Preconditions.checkHandlerThread(this.zaa.zat);
        if (this.zaj) {
            zam();
        }
    }

    @WorkerThread
    public final void zak() {
        Status status;
        Preconditions.checkHandlerThread(this.zaa.zat);
        if (this.zaj) {
            zaJ();
            if (this.zaa.zal.isGooglePlayServicesAvailable(this.zaa.zak) == 18) {
                new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            zaI(status);
            this.zac.disconnect("Timing out connection while resuming.");
        }
    }

    @WorkerThread
    public final boolean zal() {
        return zaL(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: com.google.android.gms.common.ConnectionResult} */
    /* JADX WARNING: type inference failed for: r8v10, types: [com.google.android.gms.common.api.internal.zacn] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zam() {
        /*
            r11 = this;
            r0 = r11
            r7 = r0
            com.google.android.gms.common.api.internal.GoogleApiManager r7 = r7.zaa
            android.os.Handler r7 = r7.zat
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r7)
            r7 = r0
            com.google.android.gms.common.api.Api$Client r7 = r7.zac
            boolean r7 = r7.isConnected()
            if (r7 != 0) goto L_0x001d
            r7 = r0
            com.google.android.gms.common.api.Api$Client r7 = r7.zac
            boolean r7 = r7.isConnecting()
            if (r7 == 0) goto L_0x001e
        L_0x001d:
            return
        L_0x001e:
            r7 = r0
            com.google.android.gms.common.api.internal.GoogleApiManager r7 = r7.zaa     // Catch:{ IllegalStateException -> 0x00d5 }
            com.google.android.gms.common.internal.zal r7 = r7.zam     // Catch:{ IllegalStateException -> 0x00d5 }
            r8 = r0
            com.google.android.gms.common.api.internal.GoogleApiManager r8 = r8.zaa     // Catch:{ IllegalStateException -> 0x00d5 }
            android.content.Context r8 = r8.zak     // Catch:{ IllegalStateException -> 0x00d5 }
            r9 = r0
            com.google.android.gms.common.api.Api$Client r9 = r9.zac     // Catch:{ IllegalStateException -> 0x00d5 }
            int r7 = r7.zaa(r8, r9)     // Catch:{ IllegalStateException -> 0x00d5 }
            r1 = r7
            r7 = r1
            if (r7 == 0) goto L_0x00a6
            com.google.android.gms.common.ConnectionResult r7 = new com.google.android.gms.common.ConnectionResult     // Catch:{ IllegalStateException -> 0x00d5 }
            r2 = r7
            r7 = r2
            r8 = r1
            r9 = 0
            r7.<init>(r8, r9)     // Catch:{ IllegalStateException -> 0x00d5 }
            java.lang.String r7 = "GoogleApiManager"
            r1 = r7
            r7 = r0
            com.google.android.gms.common.api.Api$Client r7 = r7.zac     // Catch:{ IllegalStateException -> 0x00d5 }
            java.lang.Class r7 = r7.getClass()     // Catch:{ IllegalStateException -> 0x00d5 }
            java.lang.String r7 = r7.getName()     // Catch:{ IllegalStateException -> 0x00d5 }
            r3 = r7
            r7 = r2
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IllegalStateException -> 0x00d5 }
            r4 = r7
            r7 = r3
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IllegalStateException -> 0x00d5 }
            int r7 = r7.length()     // Catch:{ IllegalStateException -> 0x00d5 }
            r5 = r7
            int r5 = r5 + 35
            r7 = r4
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IllegalStateException -> 0x00d5 }
            int r7 = r7.length()     // Catch:{ IllegalStateException -> 0x00d5 }
            r6 = r7
            r7 = r5
            r8 = r6
            int r7 = r7 + r8
            r5 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x00d5 }
            r6 = r7
            r7 = r6
            r8 = r5
            r7.<init>(r8)     // Catch:{ IllegalStateException -> 0x00d5 }
            r7 = r6
            java.lang.String r8 = "The service for "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch:{ IllegalStateException -> 0x00d5 }
            r7 = r6
            r8 = r3
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch:{ IllegalStateException -> 0x00d5 }
            r7 = r6
            java.lang.String r8 = " is not available: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch:{ IllegalStateException -> 0x00d5 }
            r7 = r6
            r8 = r4
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch:{ IllegalStateException -> 0x00d5 }
            r7 = r1
            r8 = r6
            java.lang.String r8 = r8.toString()     // Catch:{ IllegalStateException -> 0x00d5 }
            int r7 = android.util.Log.w(r7, r8)     // Catch:{ IllegalStateException -> 0x00d5 }
            r7 = r0
            r8 = r2
            r9 = 0
            r7.zac(r8, r9)     // Catch:{ IllegalStateException -> 0x00d5 }
            goto L_0x001d
        L_0x00a6:
            com.google.android.gms.common.api.internal.zabo r7 = new com.google.android.gms.common.api.internal.zabo
            r1 = r7
            r7 = r1
            r8 = r0
            com.google.android.gms.common.api.internal.GoogleApiManager r8 = r8.zaa
            r9 = r0
            com.google.android.gms.common.api.Api$Client r9 = r9.zac
            r10 = r0
            com.google.android.gms.common.api.internal.ApiKey<O> r10 = r10.zad
            r7.<init>(r8, r9, r10)
            r7 = r0
            com.google.android.gms.common.api.Api$Client r7 = r7.zac
            boolean r7 = r7.requiresSignIn()
            if (r7 == 0) goto L_0x00cc
            r7 = r0
            com.google.android.gms.common.api.internal.zaco r7 = r7.zai
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            com.google.android.gms.common.api.internal.zaco r7 = (com.google.android.gms.common.api.internal.zaco) r7
            r8 = r1
            r7.zac(r8)
        L_0x00cc:
            r7 = r0
            com.google.android.gms.common.api.Api$Client r7 = r7.zac     // Catch:{ SecurityException -> 0x00e8 }
            r8 = r1
            r7.connect(r8)     // Catch:{ SecurityException -> 0x00e8 }
            goto L_0x001d
        L_0x00d5:
            r7 = move-exception
            r1 = r7
            com.google.android.gms.common.ConnectionResult r7 = new com.google.android.gms.common.ConnectionResult
            r2 = r7
            r7 = r2
            r8 = 10
            r7.<init>(r8)
            r7 = r0
            r8 = r2
            r9 = r1
            r7.zac(r8, r9)
            goto L_0x001d
        L_0x00e8:
            r7 = move-exception
            r1 = r7
            com.google.android.gms.common.ConnectionResult r7 = new com.google.android.gms.common.ConnectionResult
            r2 = r7
            r7 = r2
            r8 = 10
            r7.<init>(r8)
            r7 = r0
            r8 = r2
            r9 = r1
            r7.zac(r8, r9)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabl.zam():void");
    }

    @WorkerThread
    public final void zan(zal zal2) {
        Preconditions.checkHandlerThread(this.zaa.zat);
        boolean add = this.zaf.add(zal2);
    }

    /* access modifiers changed from: package-private */
    public final boolean zao() {
        return this.zac.isConnected();
    }

    public final boolean zap() {
        return this.zac.requiresSignIn();
    }

    public final int zaq() {
        return this.zah;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final int zar() {
        return this.zam;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zas() {
        this.zam++;
    }

    @WorkerThread
    @Nullable
    private final Feature zaN(@Nullable Feature[] featureArr) {
        Map map;
        Feature[] featureArr2 = featureArr;
        if (featureArr2 == null || featureArr2.length == 0) {
            return null;
        }
        Feature[] availableFeatures = this.zac.getAvailableFeatures();
        if (availableFeatures == null) {
            availableFeatures = new Feature[0];
        }
        int length = availableFeatures.length;
        new ArrayMap(length);
        for (int i = 0; i < length; i++) {
            Feature feature = availableFeatures[i];
            Object put = map.put(feature.getName(), Long.valueOf(feature.getVersion()));
        }
        int length2 = featureArr2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            Feature feature2 = featureArr2[i2];
            Long l = (Long) map.get(feature2.getName());
            if (l == null || l.longValue() < feature2.getVersion()) {
                return feature2;
            }
        }
        return null;
    }
}

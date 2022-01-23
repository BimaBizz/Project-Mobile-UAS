package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaab extends zap {
    private final ArraySet<ApiKey<?>> zad;
    private final GoogleApiManager zae;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zaab(com.google.android.gms.common.api.internal.LifecycleFragment r8, com.google.android.gms.common.api.internal.GoogleApiManager r9, com.google.android.gms.common.GoogleApiAvailability r10) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r0
            r5 = r1
            r6 = r3
            r4.<init>(r5, r6)
            androidx.collection.ArraySet r4 = new androidx.collection.ArraySet
            r1 = r4
            r4 = r1
            r4.<init>()
            r4 = r0
            r5 = r1
            r4.zad = r5
            r4 = r0
            r5 = r2
            r4.zae = r5
            r4 = r0
            com.google.android.gms.common.api.internal.LifecycleFragment r4 = r4.mLifecycleFragment
            java.lang.String r5 = "ConnectionlessLifecycleHelper"
            r6 = r0
            r4.addCallback(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaab.<init>(com.google.android.gms.common.api.internal.LifecycleFragment, com.google.android.gms.common.api.internal.GoogleApiManager, com.google.android.gms.common.GoogleApiAvailability):void");
    }

    @MainThread
    public static void zaa(Activity activity, GoogleApiManager googleApiManager, ApiKey<?> apiKey) {
        zaab zaab;
        zaab zaab2;
        GoogleApiManager googleApiManager2 = googleApiManager;
        ApiKey<?> apiKey2 = apiKey;
        LifecycleFragment fragment = getFragment(activity);
        zaab zaab3 = (zaab) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zaab.class);
        if (zaab3 == null) {
            new zaab(fragment, googleApiManager2, GoogleApiAvailability.getInstance());
            zaab = zaab2;
        } else {
            zaab = zaab3;
        }
        Object checkNotNull = Preconditions.checkNotNull(apiKey2, "ApiKey cannot be null");
        boolean add = zaab.zad.add(apiKey2);
        googleApiManager2.zae(zaab);
    }

    private final void zac() {
        if (!this.zad.isEmpty()) {
            this.zae.zae(this);
        }
    }

    public final void onResume() {
        super.onResume();
        zac();
    }

    public final void onStart() {
        super.onStart();
        zac();
    }

    public final void onStop() {
        super.onStop();
        this.zae.zaf(this);
    }

    /* access modifiers changed from: package-private */
    public final ArraySet<ApiKey<?>> zab() {
        return this.zad;
    }

    /* access modifiers changed from: protected */
    public final void zad(ConnectionResult connectionResult, int i) {
        this.zae.zaq(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    public final void zae() {
        this.zae.zai();
    }
}

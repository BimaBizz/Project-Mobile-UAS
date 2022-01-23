package com.google.firebase.auth.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.DefaultClock;

@KeepName
public class FederatedSignInActivity extends FragmentActivity {
    private static Handler handler;
    private static final zzak zziu = zzak.zzfn();
    private static long zzuj = 0;
    private static Runnable zzul;
    private boolean zzuk = false;

    public FederatedSignInActivity() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        Bundle bundle2 = bundle;
        FederatedSignInActivity.super.onCreate(bundle2);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.SIGN_IN".equals(action) || "com.google.firebase.auth.internal.LINK".equals(action) || "com.google.firebase.auth.internal.REAUTHENTICATE".equals(action)) {
            long currentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
            long j = currentTimeMillis;
            if (currentTimeMillis - zzuj < 30000) {
                int e = Log.e("IdpSignInActivity", "Could not start operation - already in progress");
                return;
            }
            zzuj = j;
            if (bundle2 != null) {
                Bundle bundle3 = bundle2;
                Bundle bundle4 = bundle3;
                this.zzuk = bundle3.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        String valueOf = String.valueOf(action);
        String str3 = valueOf;
        if (valueOf.length() != 0) {
            str2 = "Could not do operation - unknown action: ".concat(str3);
        } else {
            str2 = str;
            new String("Could not do operation - unknown action: ");
        }
        int e2 = Log.e("IdpSignInActivity", str2);
        zzfm();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        FederatedSignInActivity.super.onSaveInstanceState(bundle2);
        bundle2.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.zzuk);
    }

    /* JADX WARNING: type inference failed for: r18v31, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r19v18, types: [android.content.Context] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r23 = this;
            r2 = r23
            r18 = r2
            com.google.firebase.auth.internal.FederatedSignInActivity.super.onResume()
            r18 = r2
            r19 = r2
            android.content.Intent r19 = r19.getIntent()
            r4 = r19
            r3 = r18
            java.lang.String r18 = "com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED"
            r19 = r4
            java.lang.String r19 = r19.getAction()
            boolean r18 = r18.equals(r19)
            if (r18 == 0) goto L_0x004e
            java.lang.String r18 = "IdpSignInActivity"
            java.lang.String r19 = "Web sign-in failed, finishing"
            int r18 = android.util.Log.e(r18, r19)
            r18 = 1
            r5 = r18
            r18 = r4
            boolean r18 = com.google.firebase.auth.internal.zzaw.zzb(r18)
            if (r18 == 0) goto L_0x0048
            r18 = r3
            r19 = r4
            com.google.android.gms.common.api.Status r19 = com.google.firebase.auth.internal.zzaw.zzc(r19)
            r18.zze(r19)
        L_0x0043:
            r18 = r5
            if (r18 == 0) goto L_0x014b
        L_0x0047:
            return
        L_0x0048:
            r18 = r3
            r18.zzfm()
            goto L_0x0043
        L_0x004e:
            r18 = r4
            java.lang.String r19 = "com.google.firebase.auth.internal.OPERATION"
            boolean r18 = r18.hasExtra(r19)
            if (r18 == 0) goto L_0x0145
            r18 = r4
            java.lang.String r19 = "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST"
            boolean r18 = r18.hasExtra(r19)
            if (r18 == 0) goto L_0x0145
            r18 = r4
            java.lang.String r19 = "com.google.firebase.auth.internal.OPERATION"
            java.lang.String r18 = r18.getStringExtra(r19)
            r6 = r18
            java.lang.String r18 = "com.google.firebase.auth.internal.SIGN_IN"
            r19 = r6
            boolean r18 = r18.equals(r19)
            if (r18 != 0) goto L_0x0090
            java.lang.String r18 = "com.google.firebase.auth.internal.LINK"
            r19 = r6
            boolean r18 = r18.equals(r19)
            if (r18 != 0) goto L_0x0090
            java.lang.String r18 = "com.google.firebase.auth.internal.REAUTHENTICATE"
            r19 = r6
            boolean r18 = r18.equals(r19)
            if (r18 == 0) goto L_0x013f
        L_0x0090:
            r18 = 1
            r5 = r18
            r18 = r4
            java.lang.String r19 = "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST"
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase_auth.zzfm> r20 = com.google.android.gms.internal.firebase_auth.zzfm.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r18 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(r18, r19, r20)
            com.google.android.gms.internal.firebase_auth.zzfm r18 = (com.google.android.gms.internal.firebase_auth.zzfm) r18
            r7 = r18
            r18 = r4
            java.lang.String r19 = "com.google.firebase.auth.internal.EXTRA_TENANT_ID"
            java.lang.String r18 = r18.getStringExtra(r19)
            r8 = r18
            r18 = r7
            r19 = r8
            com.google.android.gms.internal.firebase_auth.zzfm r18 = r18.zzcz(r19)
            r18 = r3
            r19 = r6
            r20 = r7
            r21 = r8
            r12 = r21
            r11 = r20
            r10 = r19
            r9 = r18
            r18 = 0
            zzuj = r18
            r18 = r9
            r19 = 0
            r0 = r19
            r1 = r18
            r1.zzuk = r0
            android.content.Intent r18 = new android.content.Intent
            r22 = r18
            r18 = r22
            r19 = r22
            r19.<init>()
            r13 = r18
            r18 = r11
            r19 = r13
            java.lang.String r20 = "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST"
            com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(r18, r19, r20)
            r18 = r13
            java.lang.String r19 = "com.google.firebase.auth.internal.OPERATION"
            r20 = r10
            android.content.Intent r18 = r18.putExtra(r19, r20)
            r18 = r13
            java.lang.String r19 = "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"
            android.content.Intent r18 = r18.setAction(r19)
            r18 = r9
            androidx.localbroadcastmanager.content.LocalBroadcastManager r18 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r18)
            r19 = r13
            boolean r18 = r18.sendBroadcast(r19)
            if (r18 != 0) goto L_0x0137
            r18 = r9
            android.content.Context r18 = r18.getApplicationContext()
            r19 = r11
            r20 = r10
            r21 = r12
            r17 = r21
            r16 = r20
            r15 = r19
            r22 = r18
            r18 = r22
            r19 = r22
            r14 = r19
            r19 = r15
            r20 = r16
            r21 = r17
            com.google.firebase.auth.internal.zzaq.zza(r18, r19, r20, r21)
        L_0x0130:
            r18 = r9
            r18.finish()
            goto L_0x0043
        L_0x0137:
            com.google.firebase.auth.internal.zzak r18 = zziu
            r19 = r9
            r18.zza(r19)
            goto L_0x0130
        L_0x013f:
            r18 = 0
            r5 = r18
            goto L_0x0043
        L_0x0145:
            r18 = 0
            r5 = r18
            goto L_0x0043
        L_0x014b:
            r18 = r2
            r0 = r18
            boolean r0 = r0.zzuk
            r18 = r0
            if (r18 != 0) goto L_0x01d7
            r18 = r2
            r3 = r18
            android.content.Intent r18 = new android.content.Intent
            r22 = r18
            r18 = r22
            r19 = r22
            java.lang.String r20 = "com.google.firebase.auth.api.gms.ui.START_WEB_SIGN_IN"
            r19.<init>(r20)
            r22 = r18
            r18 = r22
            r19 = r22
            r4 = r19
            java.lang.String r19 = "com.google.android.gms"
            android.content.Intent r18 = r18.setPackage(r19)
            r18 = r4
            r19 = r3
            android.content.Intent r19 = r19.getIntent()
            android.os.Bundle r19 = r19.getExtras()
            android.content.Intent r18 = r18.putExtras(r19)
            r18 = r4
            java.lang.String r19 = "com.google.firebase.auth.internal.OPERATION"
            r20 = r3
            android.content.Intent r20 = r20.getIntent()
            java.lang.String r20 = r20.getAction()
            android.content.Intent r18 = r18.putExtra(r19, r20)
            r18 = r3
            r19 = r4
            r20 = 40963(0xa003, float:5.7401E-41)
            r18.startActivityForResult(r19, r20)     // Catch:{ ActivityNotFoundException -> 0x01af }
        L_0x01a3:
            r18 = r2
            r19 = 1
            r0 = r19
            r1 = r18
            r1.zzuk = r0
            goto L_0x0047
        L_0x01af:
            r18 = move-exception
            java.lang.String r18 = "Could not launch web sign-in Intent. Google Play service is unavailable"
            r6 = r18
            java.lang.String r18 = "IdpSignInActivity"
            r19 = r6
            int r18 = android.util.Log.w(r18, r19)
            com.google.android.gms.common.api.Status r18 = new com.google.android.gms.common.api.Status
            r22 = r18
            r18 = r22
            r19 = r22
            r20 = 17499(0x445b, float:2.4521E-41)
            r21 = r6
            r19.<init>(r20, r21)
            r7 = r18
            r18 = r3
            r19 = r7
            r18.zze(r19)
            goto L_0x01a3
        L_0x01d7:
            r18 = r2
            r3 = r18
            com.google.firebase.auth.internal.zzaj r18 = new com.google.firebase.auth.internal.zzaj
            r22 = r18
            r18 = r22
            r19 = r22
            r20 = r3
            r19.<init>(r20)
            zzul = r18
            android.os.Handler r18 = handler
            if (r18 != 0) goto L_0x01fb
            com.google.android.gms.internal.firebase_auth.zzj r18 = new com.google.android.gms.internal.firebase_auth.zzj
            r22 = r18
            r18 = r22
            r19 = r22
            r19.<init>()
            handler = r18
        L_0x01fb:
            android.os.Handler r18 = handler
            java.lang.Runnable r19 = zzul
            r20 = 800(0x320, double:3.953E-321)
            boolean r18 = r18.postDelayed(r19, r20)
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.FederatedSignInActivity.onResume():void");
    }

    public void onNewIntent(Intent intent) {
        Intent intent2 = intent;
        FederatedSignInActivity.super.onNewIntent(intent2);
        if (!(handler == null || zzul == null)) {
            handler.removeCallbacks(zzul);
            zzul = null;
        }
        setIntent(intent2);
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r5v6, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r4v14, types: [android.content.Context] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzfm() {
        /*
            r8 = this;
            r0 = r8
            r4 = 0
            zzuj = r4
            r4 = r0
            r5 = 0
            r4.zzuk = r5
            android.content.Intent r4 = new android.content.Intent
            r7 = r4
            r4 = r7
            r5 = r7
            r5.<init>()
            r7 = r4
            r4 = r7
            r5 = r7
            r1 = r5
            java.lang.String r5 = "com.google.firebase.auth.internal.EXTRA_CANCELED"
            r6 = 1
            android.content.Intent r4 = r4.putExtra(r5, r6)
            r4 = r1
            java.lang.String r5 = "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"
            android.content.Intent r4 = r4.setAction(r5)
            r4 = r0
            androidx.localbroadcastmanager.content.LocalBroadcastManager r4 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r4)
            r5 = r1
            boolean r4 = r4.sendBroadcast(r5)
            if (r4 != 0) goto L_0x0047
            r4 = r0
            java.lang.String r5 = "WEB_CONTEXT_CANCELED"
            com.google.android.gms.common.api.Status r5 = com.google.firebase.auth.internal.zzt.zzdc(r5)
            r3 = r5
            r7 = r4
            r4 = r7
            r5 = r7
            r2 = r5
            r5 = r3
            com.google.firebase.auth.internal.zzaq.zza((android.content.Context) r4, (com.google.android.gms.common.api.Status) r5)
        L_0x0042:
            r4 = r0
            r4.finish()
            return
        L_0x0047:
            com.google.firebase.auth.internal.zzak r4 = zziu
            r5 = r0
            r4.zza(r5)
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.FederatedSignInActivity.zzfm():void");
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r7v6, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zze(com.google.android.gms.common.api.Status r10) {
        /*
            r9 = this;
            r1 = r9
            r2 = r10
            r6 = 0
            zzuj = r6
            r6 = r1
            r7 = 0
            r6.zzuk = r7
            android.content.Intent r6 = new android.content.Intent
            r8 = r6
            r6 = r8
            r7 = r8
            r7.<init>()
            r8 = r6
            r6 = r8
            r7 = r8
            r3 = r7
            r7 = r2
            com.google.firebase.auth.internal.zzaw.zza(r6, r7)
            r6 = r3
            java.lang.String r7 = "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"
            android.content.Intent r6 = r6.setAction(r7)
            r6 = r1
            androidx.localbroadcastmanager.content.LocalBroadcastManager r6 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r6)
            r7 = r3
            boolean r6 = r6.sendBroadcast(r7)
            if (r6 != 0) goto L_0x0042
            r6 = r1
            android.content.Context r6 = r6.getApplicationContext()
            r7 = r2
            r5 = r7
            r8 = r6
            r6 = r8
            r7 = r8
            r4 = r7
            r7 = r5
            com.google.firebase.auth.internal.zzaq.zza((android.content.Context) r6, (com.google.android.gms.common.api.Status) r7)
        L_0x003d:
            r6 = r1
            r6.finish()
            return
        L_0x0042:
            com.google.firebase.auth.internal.zzak r6 = zziu
            r7 = r1
            r6.zza(r7)
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.FederatedSignInActivity.zze(com.google.android.gms.common.api.Status):void");
    }

    static /* synthetic */ Runnable zza(Runnable runnable) {
        Runnable runnable2 = runnable;
        zzul = null;
        return null;
    }
}

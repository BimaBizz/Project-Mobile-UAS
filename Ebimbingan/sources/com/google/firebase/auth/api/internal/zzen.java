package com.google.firebase.auth.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0252LifecycleCallback;
import com.google.android.gms.common.api.internal.C0253LifecycleFragment;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzeb;
import com.google.android.gms.internal.firebase_auth.zzec;
import com.google.android.gms.internal.firebase_auth.zzem;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfd;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

abstract class zzen<ResultT, CallbackT> implements zzan<zzdp, ResultT> {
    protected FirebaseApp zzik;
    protected String zzjl;
    protected final int zzpp;
    @C0617VisibleForTesting
    final zzep zzpq;
    protected FirebaseUser zzpr;
    protected CallbackT zzps;
    protected zzz zzpt;
    protected zzel<ResultT> zzpu;
    protected final List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> zzpv;
    private Activity zzpw;
    protected Executor zzpx;
    protected zzes zzpy;
    protected zzem zzpz;
    protected zzec zzqa;
    protected zzfd zzqb;
    protected String zzqc;
    protected AuthCredential zzqd;
    protected String zzqe;
    protected String zzqf;
    protected zzeb zzqg;
    protected boolean zzqh;
    private boolean zzqi;
    @C0617VisibleForTesting
    boolean zzqj;
    @C0617VisibleForTesting
    private ResultT zzqk;
    @C0617VisibleForTesting
    private C0236Status zzql;

    public zzen(int i) {
        zzep zzep;
        List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list;
        new zzep(this);
        this.zzpq = zzep;
        new ArrayList();
        this.zzpv = list;
        this.zzpp = i;
    }

    public abstract void zzdx();

    static class zza extends C0252LifecycleCallback {
        private final List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> zzpo;

        public static void zza(Activity activity, List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list) {
            List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list2 = list;
            C0253LifecycleFragment fragment = getFragment(activity);
            C0253LifecycleFragment lifecycleFragment = fragment;
            if (((zza) fragment.getCallbackOrNull("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(lifecycleFragment, list2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private zza(C0253LifecycleFragment lifecycleFragment, List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("PhoneAuthActivityStopCallback", this);
            this.zzpo = list;
        }

        @MainThread
        public void onStop() {
            List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list = this.zzpo;
            List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list2 = list;
            synchronized (list) {
                try {
                    this.zzpo.clear();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list3 = list2;
                    throw th2;
                }
            }
        }
    }

    public final zzen<ResultT, CallbackT> zza(FirebaseApp firebaseApp) {
        this.zzik = (FirebaseApp) C0446Preconditions.checkNotNull(firebaseApp, "firebaseApp cannot be null");
        return this;
    }

    public final zzen<ResultT, CallbackT> zzf(FirebaseUser firebaseUser) {
        this.zzpr = (FirebaseUser) C0446Preconditions.checkNotNull(firebaseUser, "firebaseUser cannot be null");
        return this;
    }

    public final zzen<ResultT, CallbackT> zzb(CallbackT callbackt) {
        this.zzps = C0446Preconditions.checkNotNull(callbackt, "external callback cannot be null");
        return this;
    }

    public final zzen<ResultT, CallbackT> zza(zzz zzz) {
        this.zzpt = (zzz) C0446Preconditions.checkNotNull(zzz, "external failure callback cannot be null");
        return this;
    }

    /* JADX INFO: finally extract failed */
    public final zzen<ResultT, CallbackT> zza(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks2 = onVerificationStateChangedCallbacks;
        Activity activity2 = activity;
        Executor executor2 = executor;
        List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list = this.zzpv;
        List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list2 = list;
        synchronized (list) {
            try {
                boolean add = this.zzpv.add((PhoneAuthProvider.OnVerificationStateChangedCallbacks) C0446Preconditions.checkNotNull(onVerificationStateChangedCallbacks2));
                this.zzpw = activity2;
                if (this.zzpw != null) {
                    zza.zza(activity2, this.zzpv);
                }
                this.zzpx = (Executor) C0446Preconditions.checkNotNull(executor2);
                return this;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list3 = list2;
                    throw th2;
                }
            }
        }
    }

    public final zzan<zzdp, ResultT> zzdw() {
        this.zzqh = true;
        return this;
    }

    public final void zzc(ResultT resultt) {
        ResultT resultt2 = resultt;
        this.zzqi = true;
        this.zzqj = true;
        this.zzqk = resultt2;
        this.zzpu.zza(resultt2, (C0236Status) null);
    }

    public final void zzc(C0236Status status) {
        C0236Status status2 = status;
        this.zzqi = true;
        this.zzqj = false;
        this.zzql = status2;
        this.zzpu.zza(null, status2);
    }

    /* access modifiers changed from: private */
    public final void zzen() {
        zzdx();
        C0446Preconditions.checkState(this.zzqi, "no success or failure set on method implementation");
    }

    /* access modifiers changed from: private */
    public final void zzd(C0236Status status) {
        C0236Status status2 = status;
        if (this.zzpt != null) {
            this.zzpt.zza(status2);
        }
    }

    static /* synthetic */ boolean zza(zzen zzen, boolean z) {
        boolean z2 = z;
        zzen.zzqi = true;
        return true;
    }
}

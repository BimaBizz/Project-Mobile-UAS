package com.google.firebase.auth;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfe;
import com.google.android.gms.internal.firebase_auth.zzfw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.api.internal.zzap;
import com.google.firebase.auth.api.internal.zzdr;
import com.google.firebase.auth.api.internal.zzem;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.auth.internal.zzaa;
import com.google.firebase.auth.internal.zzak;
import com.google.firebase.auth.internal.zzan;
import com.google.firebase.auth.internal.zzaq;
import com.google.firebase.auth.internal.zzas;
import com.google.firebase.auth.internal.zzat;
import com.google.firebase.auth.internal.zzau;
import com.google.firebase.auth.internal.zzax;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzj;
import com.google.firebase.auth.internal.zzm;
import com.google.firebase.auth.internal.zzz;
import com.google.firebase.internal.InternalTokenResult;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class FirebaseAuth implements InternalAuthProvider {
    private String zzhx;
    private String zzhy;
    private FirebaseApp zzik;
    /* access modifiers changed from: private */
    public final List<IdTokenListener> zzil;
    /* access modifiers changed from: private */
    public final List<com.google.firebase.auth.internal.IdTokenListener> zzim;
    /* access modifiers changed from: private */
    public List<AuthStateListener> zzin;
    private zzap zzio;
    /* access modifiers changed from: private */
    public FirebaseUser zzip;
    /* access modifiers changed from: private */
    public zzj zziq;
    private final Object zzir;
    private final Object zzis;
    private final zzat zzit;
    private final zzak zziu;
    private zzas zziv;
    private zzau zziw;

    public interface AuthStateListener {
        void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth);
    }

    public interface IdTokenListener {
        void onIdTokenChanged(@NonNull FirebaseAuth firebaseAuth);
    }

    @C0617VisibleForTesting
    class zza extends zzb implements com.google.firebase.auth.internal.zza, zzz {
        private final /* synthetic */ FirebaseAuth zziy;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zza(com.google.firebase.auth.FirebaseAuth r5) {
            /*
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r0
                r3 = r1
                r2.zziy = r3
                r2 = r0
                r3 = r1
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.zza.<init>(com.google.firebase.auth.FirebaseAuth):void");
        }

        public final void zza(C0236Status status) {
            C0236Status status2 = status;
            if (status2.getStatusCode() == 17011 || status2.getStatusCode() == 17021 || status2.getStatusCode() == 17005) {
                this.zziy.signOut();
            }
        }
    }

    @C0617VisibleForTesting
    class zzb implements com.google.firebase.auth.internal.zza {
        private final /* synthetic */ FirebaseAuth zziy;

        zzb(FirebaseAuth firebaseAuth) {
            this.zziy = firebaseAuth;
        }

        public final void zza(@NonNull zzes zzes, @NonNull FirebaseUser firebaseUser) {
            zzes zzes2 = zzes;
            FirebaseUser firebaseUser2 = firebaseUser;
            Object checkNotNull = C0446Preconditions.checkNotNull(zzes2);
            Object checkNotNull2 = C0446Preconditions.checkNotNull(firebaseUser2);
            firebaseUser2.zza(zzes2);
            this.zziy.zza(firebaseUser2, zzes2, true);
        }
    }

    class zzc extends zzb implements com.google.firebase.auth.internal.zza, zzz {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zzc(FirebaseAuth firebaseAuth) {
            super(firebaseAuth);
        }

        public final void zza(C0236Status status) {
        }
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) FirebaseApp.getInstance().get(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(@NonNull FirebaseApp firebaseApp) {
        return (FirebaseAuth) firebaseApp.get(FirebaseAuth.class);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseAuth(com.google.firebase.FirebaseApp r13) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r4 = r0
            r5 = r1
            r6 = r1
            r2 = r6
            com.google.firebase.auth.api.internal.zzed r6 = new com.google.firebase.auth.api.internal.zzed
            r11 = r6
            r6 = r11
            r7 = r11
            r8 = r2
            com.google.firebase.FirebaseOptions r8 = r8.getOptions()
            java.lang.String r8 = r8.getApiKey()
            r7.<init>(r8)
            com.google.firebase.auth.api.internal.zzee r6 = r6.zzef()
            r3 = r6
            r6 = r2
            android.content.Context r6 = r6.getApplicationContext()
            r7 = r3
            com.google.firebase.auth.api.internal.zzap r6 = com.google.firebase.auth.api.internal.zzec.zza(r6, r7)
            com.google.firebase.auth.internal.zzat r7 = new com.google.firebase.auth.internal.zzat
            r11 = r7
            r7 = r11
            r8 = r11
            r9 = r1
            android.content.Context r9 = r9.getApplicationContext()
            r10 = r1
            java.lang.String r10 = r10.getPersistenceKey()
            r8.<init>(r9, r10)
            com.google.firebase.auth.internal.zzak r8 = com.google.firebase.auth.internal.zzak.zzfn()
            r4.<init>(r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(com.google.firebase.FirebaseApp):void");
    }

    @C0617VisibleForTesting
    private FirebaseAuth(FirebaseApp firebaseApp, zzap zzap, zzat zzat, zzak zzak) {
        Object obj;
        Object obj2;
        zzj zzj;
        List<IdTokenListener> list;
        List<com.google.firebase.auth.internal.IdTokenListener> list2;
        List<AuthStateListener> list3;
        new Object();
        this.zzir = obj;
        new Object();
        this.zzis = obj2;
        this.zzik = (FirebaseApp) C0446Preconditions.checkNotNull(firebaseApp);
        this.zzio = (zzap) C0446Preconditions.checkNotNull(zzap);
        this.zzit = (zzat) C0446Preconditions.checkNotNull(zzat);
        new zzj();
        this.zziq = zzj;
        this.zziu = (zzak) C0446Preconditions.checkNotNull(zzak);
        new CopyOnWriteArrayList();
        this.zzil = list;
        new CopyOnWriteArrayList();
        this.zzim = list2;
        new CopyOnWriteArrayList();
        this.zzin = list3;
        this.zziw = zzau.zzfs();
        this.zzip = this.zzit.zzfr();
        if (this.zzip != null) {
            zzes zzh = this.zzit.zzh(this.zzip);
            zzes zzes = zzh;
            if (zzh != null) {
                zza(this.zzip, zzes, false);
            }
        }
        this.zziu.zzf(this);
    }

    @Nullable
    public FirebaseUser getCurrentUser() {
        return this.zzip;
    }

    @Nullable
    public String getUid() {
        if (this.zzip == null) {
            return null;
        }
        return this.zzip.getUid();
    }

    public final void zza(@NonNull FirebaseUser firebaseUser, @NonNull zzes zzes, boolean z) {
        boolean z2;
        boolean z3;
        FirebaseUser firebaseUser2 = firebaseUser;
        zzes zzes2 = zzes;
        boolean z4 = z;
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(zzes2);
        if (this.zzip == null) {
            z2 = true;
            z3 = true;
        } else {
            boolean z5 = !this.zzip.zzcy().getAccessToken().equals(zzes2.getAccessToken());
            boolean equals = this.zzip.getUid().equals(firebaseUser2.getUid());
            boolean z6 = equals;
            if (!equals || z5) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z6) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        boolean z7 = z3;
        boolean z8 = z4;
        FirebaseUser firebaseUser3 = firebaseUser2;
        Object checkNotNull3 = C0446Preconditions.checkNotNull(firebaseUser3);
        if (this.zzip == null) {
            this.zzip = firebaseUser3;
        } else {
            FirebaseUser zza2 = this.zzip.zza(firebaseUser3.getProviderData());
            if (!firebaseUser3.isAnonymous()) {
                FirebaseUser zzcx = this.zzip.zzcx();
            }
            this.zzip.zzb(firebaseUser3.zzdb().zzdc());
        }
        if (z8) {
            this.zzit.zzg(this.zzip);
        }
        if (z2) {
            if (this.zzip != null) {
                this.zzip.zza(zzes2);
            }
            zzb(this.zzip);
        }
        if (z7) {
            zzc(this.zzip);
        }
        if (z4) {
            this.zzit.zza(firebaseUser2, zzes2);
        }
        zzct().zzc(this.zzip.zzcy());
    }

    public final void zzcs() {
        if (this.zzip != null) {
            zzat zzat = this.zzit;
            FirebaseUser firebaseUser = this.zzip;
            zzat zzat2 = zzat;
            Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser);
            zzat2.clear(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.getUid()}));
            this.zzip = null;
        }
        this.zzit.clear("com.google.firebase.auth.FIREBASE_USER");
        zzb((FirebaseUser) null);
        zzc((FirebaseUser) null);
    }

    @C0617VisibleForTesting
    private final synchronized void zza(zzas zzas) {
        zzas zzas2 = zzas;
        synchronized (this) {
            this.zziv = zzas2;
        }
    }

    @C0617VisibleForTesting
    private final synchronized zzas zzct() {
        zzas zzas;
        zzas zzas2;
        synchronized (this) {
            if (this.zziv == null) {
                new zzas(this.zzik);
                zza(zzas2);
            }
            zzas = this.zziv;
        }
        return zzas;
    }

    public FirebaseApp getApp() {
        return this.zzik;
    }

    public final FirebaseApp zzcu() {
        return this.zzik;
    }

    public void addIdTokenListener(@NonNull IdTokenListener idTokenListener) {
        Runnable runnable;
        IdTokenListener idTokenListener2 = idTokenListener;
        boolean add = this.zzil.add(idTokenListener2);
        new zzj(this, idTokenListener2);
        this.zziw.execute(runnable);
    }

    @C0206KeepForSdk
    public void addIdTokenListener(@NonNull com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        com.google.firebase.auth.internal.IdTokenListener idTokenListener2 = idTokenListener;
        Object checkNotNull = C0446Preconditions.checkNotNull(idTokenListener2);
        boolean add = this.zzim.add(idTokenListener2);
        zzct().zzj(this.zzim.size());
    }

    public void removeIdTokenListener(@NonNull IdTokenListener idTokenListener) {
        boolean remove = this.zzil.remove(idTokenListener);
    }

    @C0206KeepForSdk
    public void removeIdTokenListener(@NonNull com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        com.google.firebase.auth.internal.IdTokenListener idTokenListener2 = idTokenListener;
        Object checkNotNull = C0446Preconditions.checkNotNull(idTokenListener2);
        boolean remove = this.zzim.remove(idTokenListener2);
        zzct().zzj(this.zzim.size());
    }

    public void addAuthStateListener(@NonNull AuthStateListener authStateListener) {
        Runnable runnable;
        AuthStateListener authStateListener2 = authStateListener;
        boolean add = this.zzin.add(authStateListener2);
        new zzi(this, authStateListener2);
        this.zziw.execute(runnable);
    }

    public void removeAuthStateListener(@NonNull AuthStateListener authStateListener) {
        boolean remove = this.zzin.remove(authStateListener);
    }

    private final void zzb(@Nullable FirebaseUser firebaseUser) {
        InternalTokenResult internalTokenResult;
        Runnable runnable;
        StringBuilder sb;
        FirebaseUser firebaseUser2 = firebaseUser;
        if (firebaseUser2 != null) {
            String uid = firebaseUser2.getUid();
            new StringBuilder(45 + String.valueOf(uid).length());
            int d = Log.d("FirebaseAuth", sb.append("Notifying id token listeners about user ( ").append(uid).append(" ).").toString());
        } else {
            int d2 = Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        new InternalTokenResult(firebaseUser2 != null ? firebaseUser2.zzda() : null);
        new zzl(this, internalTokenResult);
        this.zziw.execute(runnable);
    }

    private final void zzc(@Nullable FirebaseUser firebaseUser) {
        Runnable runnable;
        StringBuilder sb;
        FirebaseUser firebaseUser2 = firebaseUser;
        if (firebaseUser2 != null) {
            String uid = firebaseUser2.getUid();
            new StringBuilder(47 + String.valueOf(uid).length());
            int d = Log.d("FirebaseAuth", sb.append("Notifying auth state listeners about user ( ").append(uid).append(" ).").toString());
        } else {
            int d2 = Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        new zzk(this);
        this.zziw.execute(runnable);
    }

    @NonNull
    public Task<GetTokenResult> getAccessToken(boolean z) {
        return zza(this.zzip, z);
    }

    @NonNull
    public final Task<GetTokenResult> zza(@Nullable FirebaseUser firebaseUser, boolean z) {
        zzax zzax;
        C0236Status status;
        FirebaseUser firebaseUser2 = firebaseUser;
        boolean z2 = z;
        if (firebaseUser2 == null) {
            new C0236Status(FirebaseError.ERROR_NO_SIGNED_IN_USER);
            return Tasks.forException(zzdr.zzb(status));
        }
        zzes zzcy = firebaseUser2.zzcy();
        zzes zzes = zzcy;
        if (zzcy.isValid() && !z2) {
            return Tasks.forResult(zzan.zzdf(zzes.getAccessToken()));
        }
        new zzn(this);
        return this.zzio.zza(this.zzik, firebaseUser2, zzes.zzs(), zzax);
    }

    @NonNull
    public Task<AuthResult> signInWithCredential(@NonNull AuthCredential authCredential) {
        com.google.firebase.auth.internal.zza zza2;
        com.google.firebase.auth.internal.zza zza3;
        com.google.firebase.auth.internal.zza zza4;
        C0236Status status;
        com.google.firebase.auth.internal.zza zza5;
        AuthCredential authCredential2 = authCredential;
        Object checkNotNull = C0446Preconditions.checkNotNull(authCredential2);
        if (authCredential2 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential2;
            EmailAuthCredential emailAuthCredential2 = emailAuthCredential;
            if (!emailAuthCredential.zzcr()) {
                new zzb(this);
                return this.zzio.zzb(this.zzik, emailAuthCredential2.getEmail(), emailAuthCredential2.getPassword(), this.zzhy, zza5);
            } else if (zzbs(emailAuthCredential2.zzco())) {
                new C0236Status(17072);
                return Tasks.forException(zzdr.zzb(status));
            } else {
                new zzb(this);
                return this.zzio.zza(this.zzik, emailAuthCredential2, zza4);
            }
        } else if (authCredential2 instanceof PhoneAuthCredential) {
            PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) authCredential2;
            new zzb(this);
            return this.zzio.zza(this.zzik, phoneAuthCredential, this.zzhy, zza3);
        } else {
            new zzb(this);
            return this.zzio.zza(this.zzik, authCredential2, this.zzhy, zza2);
        }
    }

    @NonNull
    public final Task<Void> zza(@NonNull FirebaseUser firebaseUser, @NonNull AuthCredential authCredential) {
        zzax zzax;
        zzax zzax2;
        zzax zzax3;
        C0236Status status;
        zzax zzax4;
        FirebaseUser firebaseUser2 = firebaseUser;
        AuthCredential authCredential2 = authCredential;
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(authCredential2);
        if (EmailAuthCredential.class.isAssignableFrom(authCredential2.getClass())) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential2;
            if ("password".equals(emailAuthCredential.getSignInMethod())) {
                new zza(this);
                return this.zzio.zza(this.zzik, firebaseUser2, emailAuthCredential.getEmail(), emailAuthCredential.getPassword(), firebaseUser2.zzba(), zzax4);
            } else if (zzbs(emailAuthCredential.zzco())) {
                new C0236Status(17072);
                return Tasks.forException(zzdr.zzb(status));
            } else {
                new zza(this);
                return this.zzio.zza(this.zzik, firebaseUser2, emailAuthCredential, zzax3);
            }
        } else if (authCredential2 instanceof PhoneAuthCredential) {
            new zza(this);
            return this.zzio.zza(this.zzik, firebaseUser2, (PhoneAuthCredential) authCredential2, this.zzhy, zzax2);
        } else {
            new zza(this);
            return this.zzio.zza(this.zzik, firebaseUser2, authCredential2, firebaseUser2.zzba(), zzax);
        }
    }

    public final Task<AuthResult> zzb(@NonNull FirebaseUser firebaseUser, @NonNull AuthCredential authCredential) {
        zzax zzax;
        zzax zzax2;
        zzax zzax3;
        C0236Status status;
        zzax zzax4;
        FirebaseUser firebaseUser2 = firebaseUser;
        AuthCredential authCredential2 = authCredential;
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(authCredential2);
        if (EmailAuthCredential.class.isAssignableFrom(authCredential2.getClass())) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential2;
            if ("password".equals(emailAuthCredential.getSignInMethod())) {
                new zza(this);
                return this.zzio.zzb(this.zzik, firebaseUser2, emailAuthCredential.getEmail(), emailAuthCredential.getPassword(), firebaseUser2.zzba(), zzax4);
            } else if (zzbs(emailAuthCredential.zzco())) {
                new C0236Status(17072);
                return Tasks.forException(zzdr.zzb(status));
            } else {
                new zza(this);
                return this.zzio.zzb(this.zzik, firebaseUser2, emailAuthCredential, zzax3);
            }
        } else if (authCredential2 instanceof PhoneAuthCredential) {
            new zza(this);
            return this.zzio.zzb(this.zzik, firebaseUser2, (PhoneAuthCredential) authCredential2, this.zzhy, zzax2);
        } else {
            new zza(this);
            return this.zzio.zzb(this.zzik, firebaseUser2, authCredential2, firebaseUser2.zzba(), zzax);
        }
    }

    @NonNull
    public Task<AuthResult> signInWithCustomToken(@NonNull String str) {
        com.google.firebase.auth.internal.zza zza2;
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        new zzb(this);
        return this.zzio.zza(this.zzik, str2, this.zzhy, zza2);
    }

    @NonNull
    public Task<AuthResult> signInWithEmailAndPassword(@NonNull String str, @NonNull String str2) {
        com.google.firebase.auth.internal.zza zza2;
        String str3 = str;
        String str4 = str2;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str3);
        String checkNotEmpty2 = C0446Preconditions.checkNotEmpty(str4);
        new zzb(this);
        return this.zzio.zzb(this.zzik, str3, str4, this.zzhy, zza2);
    }

    @NonNull
    public Task<AuthResult> signInWithEmailLink(@NonNull String str, @NonNull String str2) {
        return signInWithCredential(EmailAuthProvider.getCredentialWithLink(str, str2));
    }

    @NonNull
    public Task<AuthResult> signInAnonymously() {
        com.google.firebase.auth.internal.zza zza2;
        Object obj;
        if (this.zzip == null || !this.zzip.isAnonymous()) {
            new zzb(this);
            return this.zzio.zza(this.zzik, zza2, this.zzhy);
        }
        zzm zzm = (zzm) this.zzip;
        zzm.zzs(false);
        new zzg(zzm);
        return Tasks.forResult(obj);
    }

    public final void zza(@NonNull String str, long j, TimeUnit timeUnit, @NonNull PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable Activity activity, @NonNull Executor executor, boolean z) {
        Throwable th;
        zzfe zzfe;
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks2;
        String str2 = str;
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks3 = onVerificationStateChangedCallbacks;
        Activity activity2 = activity;
        Executor executor2 = executor;
        boolean z2 = z;
        long convert = TimeUnit.SECONDS.convert(j, timeUnit);
        long j2 = convert;
        if (convert < 0 || j2 > 120) {
            Throwable th2 = th;
            new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            throw th2;
        }
        new zzfe(str2, j2, z2, this.zzhx, this.zzhy);
        zzfe zzfe2 = zzfe;
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks4 = onVerificationStateChangedCallbacks3;
        String str3 = str2;
        if (this.zziq.zzfe()) {
            if (str3.equals(this.zziq.getPhoneNumber())) {
                new zzm(this, onVerificationStateChangedCallbacks4);
                onVerificationStateChangedCallbacks4 = onVerificationStateChangedCallbacks2;
            }
        }
        this.zzio.zza(this.zzik, zzfe2, onVerificationStateChangedCallbacks4, activity2, executor2);
    }

    public Task<Void> updateCurrentUser(@NonNull FirebaseUser firebaseUser) {
        C0236Status status;
        zzax zzax;
        Throwable th;
        FirebaseUser firebaseUser2 = firebaseUser;
        if (firebaseUser2 == null) {
            Throwable th2 = th;
            new IllegalArgumentException("Cannot update current user with null user!");
            throw th2;
        } else if ((firebaseUser2.zzba() == null || firebaseUser2.zzba().equals(this.zzhy)) && (this.zzhy == null || this.zzhy.equals(firebaseUser2.zzba()))) {
            String apiKey = firebaseUser2.zzcu().getOptions().getApiKey();
            String apiKey2 = this.zzik.getOptions().getApiKey();
            if (!firebaseUser2.zzcy().isValid() || !apiKey2.equals(apiKey)) {
                new zzc(this);
                return zza(firebaseUser2, zzax);
            }
            zza(zzm.zza(this.zzik, firebaseUser2), firebaseUser2.zzcy(), true);
            return Tasks.forResult(null);
        } else {
            new C0236Status(17072);
            return Tasks.forException(zzdr.zzb(status));
        }
    }

    public final Task<Void> zzd(@NonNull FirebaseUser firebaseUser) {
        zzax zzax;
        new zza(this);
        return zza(firebaseUser, zzax);
    }

    @NonNull
    private final Task<Void> zza(@NonNull FirebaseUser firebaseUser, zzax zzax) {
        FirebaseUser firebaseUser2 = firebaseUser;
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        return this.zzio.zza(this.zzik, firebaseUser2, zzax);
    }

    @NonNull
    public final Task<AuthResult> zzc(@NonNull FirebaseUser firebaseUser, @NonNull AuthCredential authCredential) {
        zzax zzax;
        FirebaseUser firebaseUser2 = firebaseUser;
        AuthCredential authCredential2 = authCredential;
        Object checkNotNull = C0446Preconditions.checkNotNull(authCredential2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(firebaseUser2);
        new zza(this);
        return this.zzio.zza(this.zzik, firebaseUser2, authCredential2, zzax);
    }

    @NonNull
    public final Task<AuthResult> zza(@NonNull FirebaseUser firebaseUser, @NonNull String str) {
        zzax zzax;
        FirebaseUser firebaseUser2 = firebaseUser;
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        new zza(this);
        return this.zzio.zzd(this.zzik, firebaseUser2, str2, zzax);
    }

    @NonNull
    public Task<AuthResult> createUserWithEmailAndPassword(@NonNull String str, @NonNull String str2) {
        com.google.firebase.auth.internal.zza zza2;
        String str3 = str;
        String str4 = str2;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str3);
        String checkNotEmpty2 = C0446Preconditions.checkNotEmpty(str4);
        new zzb(this);
        return this.zzio.zza(this.zzik, str3, str4, this.zzhy, zza2);
    }

    @NonNull
    public Task<SignInMethodQueryResult> fetchSignInMethodsForEmail(@NonNull String str) {
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        return this.zzio.zza(this.zzik, str2, this.zzhy);
    }

    @NonNull
    public final Task<Void> zza(@NonNull FirebaseUser firebaseUser, @NonNull UserProfileChangeRequest userProfileChangeRequest) {
        zzax zzax;
        FirebaseUser firebaseUser2 = firebaseUser;
        UserProfileChangeRequest userProfileChangeRequest2 = userProfileChangeRequest;
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(userProfileChangeRequest2);
        new zza(this);
        return this.zzio.zza(this.zzik, firebaseUser2, userProfileChangeRequest2, zzax);
    }

    @NonNull
    public final Task<Void> zzb(@NonNull FirebaseUser firebaseUser, @NonNull String str) {
        zzax zzax;
        FirebaseUser firebaseUser2 = firebaseUser;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        new zza(this);
        return this.zzio.zzb(this.zzik, firebaseUser2, str2, zzax);
    }

    @NonNull
    public final Task<Void> zza(@NonNull FirebaseUser firebaseUser, @NonNull PhoneAuthCredential phoneAuthCredential) {
        zzax zzax;
        FirebaseUser firebaseUser2 = firebaseUser;
        PhoneAuthCredential phoneAuthCredential2 = phoneAuthCredential;
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(phoneAuthCredential2);
        new zza(this);
        return this.zzio.zza(this.zzik, firebaseUser2, phoneAuthCredential2, zzax);
    }

    @NonNull
    public final Task<Void> zzc(@NonNull FirebaseUser firebaseUser, @NonNull String str) {
        zzax zzax;
        FirebaseUser firebaseUser2 = firebaseUser;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        new zza(this);
        return this.zzio.zzc(this.zzik, firebaseUser2, str2, zzax);
    }

    @NonNull
    public Task<Void> sendPasswordResetEmail(@NonNull String str) {
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        return sendPasswordResetEmail(str2, (ActionCodeSettings) null);
    }

    @NonNull
    public Task<Void> sendPasswordResetEmail(@NonNull String str, @Nullable ActionCodeSettings actionCodeSettings) {
        String str2 = str;
        ActionCodeSettings actionCodeSettings2 = actionCodeSettings;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        if (actionCodeSettings2 == null) {
            actionCodeSettings2 = ActionCodeSettings.zzcj();
        }
        if (this.zzhx != null) {
            actionCodeSettings2.zzbq(this.zzhx);
        }
        actionCodeSettings2.zzb(zzfw.zzve);
        return this.zzio.zza(this.zzik, str2, actionCodeSettings2, this.zzhy);
    }

    public Task<Void> sendSignInLinkToEmail(@NonNull String str, @NonNull ActionCodeSettings actionCodeSettings) {
        Throwable th;
        String str2 = str;
        ActionCodeSettings actionCodeSettings2 = actionCodeSettings;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        Object checkNotNull = C0446Preconditions.checkNotNull(actionCodeSettings2);
        if (!actionCodeSettings2.canHandleCodeInApp()) {
            Throwable th2 = th;
            new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
            throw th2;
        }
        if (this.zzhx != null) {
            actionCodeSettings2.zzbq(this.zzhx);
        }
        return this.zzio.zzb(this.zzik, str2, actionCodeSettings2, this.zzhy);
    }

    public boolean isSignInWithEmailLink(@NonNull String str) {
        return EmailAuthCredential.isSignInWithEmailLink(str);
    }

    @NonNull
    public final Task<Void> zza(@Nullable ActionCodeSettings actionCodeSettings, @NonNull String str) {
        ActionCodeSettings actionCodeSettings2 = actionCodeSettings;
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        if (this.zzhx != null) {
            if (actionCodeSettings2 == null) {
                actionCodeSettings2 = ActionCodeSettings.zzcj();
            }
            actionCodeSettings2.zzbq(this.zzhx);
        }
        return this.zzio.zza(this.zzik, actionCodeSettings2, str2);
    }

    @NonNull
    public Task<ActionCodeResult> checkActionCode(@NonNull String str) {
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        return this.zzio.zzb(this.zzik, str2, this.zzhy);
    }

    @NonNull
    public Task<Void> applyActionCode(@NonNull String str) {
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        return this.zzio.zzc(this.zzik, str2, this.zzhy);
    }

    @NonNull
    public Task<String> verifyPasswordResetCode(@NonNull String str) {
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        return this.zzio.zzd(this.zzik, str2, this.zzhy);
    }

    @NonNull
    public Task<Void> confirmPasswordReset(@NonNull String str, @NonNull String str2) {
        String str3 = str;
        String str4 = str2;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str3);
        String checkNotEmpty2 = C0446Preconditions.checkNotEmpty(str4);
        return this.zzio.zza(this.zzik, str3, str4, this.zzhy);
    }

    public Task<AuthResult> startActivityForSignInWithProvider(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider) {
        TaskCompletionSource taskCompletionSource;
        C0236Status status;
        Activity activity2 = activity;
        FederatedAuthProvider federatedAuthProvider2 = federatedAuthProvider;
        Object checkNotNull = C0446Preconditions.checkNotNull(federatedAuthProvider2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(activity2);
        new TaskCompletionSource();
        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
        if (!this.zziu.zza(activity2, taskCompletionSource2, this)) {
            new C0236Status(17057);
            return Tasks.forException(zzdr.zzb(status));
        }
        Context applicationContext = activity2.getApplicationContext();
        Context context = applicationContext;
        zzaq.zza(applicationContext, this);
        federatedAuthProvider2.zza(activity2);
        return taskCompletionSource2.getTask();
    }

    public final Task<AuthResult> zza(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider, @NonNull FirebaseUser firebaseUser) {
        TaskCompletionSource taskCompletionSource;
        C0236Status status;
        Activity activity2 = activity;
        FederatedAuthProvider federatedAuthProvider2 = federatedAuthProvider;
        FirebaseUser firebaseUser2 = firebaseUser;
        Object checkNotNull = C0446Preconditions.checkNotNull(activity2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(federatedAuthProvider2);
        Object checkNotNull3 = C0446Preconditions.checkNotNull(firebaseUser2);
        new TaskCompletionSource();
        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
        if (!this.zziu.zza(activity2, taskCompletionSource2, this, firebaseUser2)) {
            new C0236Status(17057);
            return Tasks.forException(zzdr.zzb(status));
        }
        Context applicationContext = activity2.getApplicationContext();
        Context context = applicationContext;
        zzaq.zza(applicationContext, this, firebaseUser2);
        federatedAuthProvider2.zzb(activity2);
        return taskCompletionSource2.getTask();
    }

    public final Task<AuthResult> zzb(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider, @NonNull FirebaseUser firebaseUser) {
        TaskCompletionSource taskCompletionSource;
        C0236Status status;
        Activity activity2 = activity;
        FederatedAuthProvider federatedAuthProvider2 = federatedAuthProvider;
        FirebaseUser firebaseUser2 = firebaseUser;
        Object checkNotNull = C0446Preconditions.checkNotNull(activity2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(federatedAuthProvider2);
        Object checkNotNull3 = C0446Preconditions.checkNotNull(firebaseUser2);
        new TaskCompletionSource();
        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
        if (!this.zziu.zza(activity2, taskCompletionSource2, this, firebaseUser2)) {
            new C0236Status(17057);
            return Tasks.forException(zzdr.zzb(status));
        }
        Context applicationContext = activity2.getApplicationContext();
        Context context = applicationContext;
        zzaq.zza(applicationContext, this, firebaseUser2);
        federatedAuthProvider2.zzc(activity2);
        return taskCompletionSource2.getTask();
    }

    @Nullable
    public Task<AuthResult> getPendingAuthResult() {
        return this.zziu.zzfo();
    }

    @NonNull
    public final Task<Void> zze(@NonNull FirebaseUser firebaseUser) {
        zzaa zzaa;
        FirebaseUser firebaseUser2 = firebaseUser;
        Object checkNotNull = C0446Preconditions.checkNotNull(firebaseUser2);
        new zzo(this, firebaseUser2);
        return this.zzio.zza(firebaseUser2, zzaa);
    }

    public void signOut() {
        zzcs();
        if (this.zziv != null) {
            this.zziv.cancel();
        }
    }

    public void setLanguageCode(@NonNull String str) {
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        Object obj = this.zzir;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                this.zzhx = str2;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    @Nullable
    public String getLanguageCode() {
        Object obj = this.zzir;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                String str = this.zzhx;
                return str;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    public final void zzf(@NonNull String str) {
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        Object obj = this.zzis;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                this.zzhy = str2;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    @Nullable
    public final String zzba() {
        Object obj = this.zzis;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                String str = this.zzhy;
                return str;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    public void useAppLanguage() {
        Object obj = this.zzir;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                this.zzhx = zzem.zzem();
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    public FirebaseAuthSettings getFirebaseAuthSettings() {
        return this.zziq;
    }

    public Task<Void> setFirebaseUIVersion(@Nullable String str) {
        return this.zzio.setFirebaseUIVersion(str);
    }

    private final boolean zzbs(String str) {
        zzb zzbr = zzb.zzbr(str);
        return zzbr != null && !TextUtils.equals(this.zzhy, zzbr.zzba());
    }
}

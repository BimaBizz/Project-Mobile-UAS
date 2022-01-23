package com.google.firebase.auth.api.internal;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzem;
import com.google.android.gms.internal.firebase_auth.zzew;
import com.google.android.gms.internal.firebase_auth.zzf;
import com.google.android.gms.internal.firebase_auth.zzfe;
import com.google.android.gms.internal.firebase_auth.zzfw;
import com.google.android.gms.internal.firebase_auth.zzk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.ActionCodeResult;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzaa;
import com.google.firebase.auth.internal.zzax;
import com.google.firebase.auth.internal.zzi;
import com.google.firebase.auth.internal.zzm;
import com.google.firebase.auth.internal.zzo;
import com.google.firebase.auth.internal.zzz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class zzap extends zzag {
    private final Context zzml;
    private final zzee zzmm;
    private final Future<zzaj<zzee>> zzmn = zzdq();

    zzap(Context context, zzee zzee) {
        this.zzml = context;
        this.zzmm = zzee;
    }

    /* access modifiers changed from: package-private */
    public final Future<zzaj<zzee>> zzdq() {
        Callable callable;
        if (this.zzmn != null) {
            return this.zzmn;
        }
        new zzdn(this.zzmm, this.zzml);
        return zzf.zzb().zza(zzk.zzm).submit(callable);
    }

    public final Task<GetTokenResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzbd(str);
        zzbd zzbd = (zzbd) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zza(zzbd), zzbd);
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, String str, @Nullable String str2, zza zza) {
        zzen zzen;
        new zzcp(str, str2);
        zzcp zzcp = (zzcp) zzen.zza(firebaseApp).zzb(zza);
        return zza(zzb(zzcp), zzcp);
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, AuthCredential authCredential, @Nullable String str, zza zza) {
        zzen zzen;
        new zzcn(authCredential, str);
        zzcn zzcn = (zzcn) zzen.zza(firebaseApp).zzb(zza);
        return zza(zzb(zzcn), zzcn);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzbn(authCredential, str);
        zzbn zzbn = (zzbn) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zzb(zzbn), zzbn);
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzbp(authCredential, str);
        zzbp zzbp = (zzbp) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zzb(zzbp), zzbp);
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, zza zza, @Nullable String str) {
        zzen zzen;
        new zzcl(str);
        zzcl zzcl = (zzcl) zzen.zza(firebaseApp).zzb(zza);
        return zza(zzb(zzcl), zzcl);
    }

    public final void zza(FirebaseApp firebaseApp, zzfe zzfe, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable Activity activity, Executor executor) {
        zzen zzen;
        new zzdl(zzfe);
        zzdl zzdl = (zzdl) zzen.zza(firebaseApp).zza(onVerificationStateChangedCallbacks, activity, executor);
        Task zza = zza(zzb(zzdl), zzdl);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzdh(userProfileChangeRequest);
        zzdh zzdh = (zzdh) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zzb(zzdh), zzdh);
    }

    public final Task<Void> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzdb(str);
        zzdb zzdb = (zzdb) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zzb(zzdb), zzdb);
    }

    public final Task<Void> zzc(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzdd(str);
        zzdd zzdd = (zzdd) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zzb(zzdd), zzdd);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzdf(phoneAuthCredential);
        zzdf zzdf = (zzdf) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zzb(zzdf), zzdf);
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, String str, String str2, String str3, zza zza) {
        zzen zzen;
        new zzax(str, str2, str3);
        zzax zzax = (zzax) zzen.zza(firebaseApp).zzb(zza);
        return zza(zzb(zzax), zzax);
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, String str, String str2, @Nullable String str3, zza zza) {
        zzen zzen;
        new zzcr(str, str2, str3);
        zzcr zzcr = (zzcr) zzen.zza(firebaseApp).zzb(zza);
        return zza(zzb(zzcr), zzcr);
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, EmailAuthCredential emailAuthCredential, zza zza) {
        zzen zzen;
        new zzct(emailAuthCredential);
        zzct zzct = (zzct) zzen.zza(firebaseApp).zzb(zza);
        return zza(zzb(zzct), zzct);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, @Nullable String str3, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzbv(str, str2, str3);
        zzbv zzbv = (zzbv) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zzb(zzbv), zzbv);
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, String str3, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzbx(str, str2, str3);
        zzbx zzbx = (zzbx) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zzb(zzbx), zzbx);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzbr(emailAuthCredential);
        zzbr zzbr = (zzbr) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zzb(zzbr), zzbr);
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzbt(emailAuthCredential);
        zzbt zzbt = (zzbt) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zzb(zzbt), zzbt);
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zza zza) {
        zzen zzen;
        new zzcv(phoneAuthCredential, str);
        zzcv zzcv = (zzcv) zzen.zza(firebaseApp).zzb(zza);
        return zza(zzb(zzcv), zzcv);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzbz(phoneAuthCredential, str);
        zzbz zzbz = (zzbz) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zzb(zzbz), zzbz);
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzcb(phoneAuthCredential, str);
        zzcb zzcb = (zzcb) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zzb(zzcb), zzcb);
    }

    public final Task<SignInMethodQueryResult> zza(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        zzen zzen;
        new zzbb(str, str2);
        zzbb zzbb = (zzbb) zzen.zza(firebaseApp);
        return zza(zza(zzbb), zzbb);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, @Nullable String str2) {
        zzen zzen;
        ActionCodeSettings actionCodeSettings2 = actionCodeSettings;
        actionCodeSettings2.zzb(zzfw.zzve);
        new zzch(str, actionCodeSettings2, str2, "sendPasswordResetEmail");
        zzch zzch = (zzch) zzen.zza(firebaseApp);
        return zza(zzb(zzch), zzch);
    }

    public final Task<Void> zzb(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, @Nullable String str2) {
        zzen zzen;
        ActionCodeSettings actionCodeSettings2 = actionCodeSettings;
        actionCodeSettings2.zzb(zzfw.zzvj);
        new zzch(str, actionCodeSettings2, str2, "sendSignInLinkToEmail");
        zzch zzch = (zzch) zzen.zza(firebaseApp);
        return zza(zzb(zzch), zzch);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, @Nullable ActionCodeSettings actionCodeSettings, String str) {
        zzen zzen;
        new zzcf(str, actionCodeSettings);
        zzcf zzcf = (zzcf) zzen.zza(firebaseApp);
        return zza(zzb(zzcf), zzcf);
    }

    public final Task<ActionCodeResult> zzb(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        zzen zzen;
        new zzat(str, str2);
        zzat zzat = (zzat) zzen.zza(firebaseApp);
        return zza(zzb(zzat), zzat);
    }

    public final Task<Void> zzc(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        zzen zzen;
        new zzar(str, str2);
        zzar zzar = (zzar) zzen.zza(firebaseApp);
        return zza(zzb(zzar), zzar);
    }

    public final Task<String> zzd(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        zzen zzen;
        new zzdj(str, str2);
        zzdj zzdj = (zzdj) zzen.zza(firebaseApp);
        return zza(zzb(zzdj), zzdj);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, String str, String str2, @Nullable String str3) {
        zzen zzen;
        new zzav(str, str2, str3);
        zzav zzav = (zzav) zzen.zza(firebaseApp);
        return zza(zzb(zzav), zzav);
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, zzax zzax) {
        zzen zzen;
        zzen zzen2;
        zzen zzen3;
        zzen zzen4;
        Status status;
        FirebaseApp firebaseApp2 = firebaseApp;
        FirebaseUser firebaseUser2 = firebaseUser;
        AuthCredential authCredential2 = authCredential;
        zzax zzax2 = zzax;
        Object checkNotNull = Preconditions.checkNotNull(firebaseApp2);
        Object checkNotNull2 = Preconditions.checkNotNull(authCredential2);
        Object checkNotNull3 = Preconditions.checkNotNull(firebaseUser2);
        Object checkNotNull4 = Preconditions.checkNotNull(zzax2);
        List<String> zzcw = firebaseUser2.zzcw();
        List<String> list = zzcw;
        if (zzcw != null && list.contains(authCredential2.getProvider())) {
            new Status(FirebaseError.ERROR_PROVIDER_ALREADY_LINKED);
            return Tasks.forException(zzdr.zzb(status));
        } else if (authCredential2 instanceof EmailAuthCredential) {
            if (!((EmailAuthCredential) authCredential2).zzcr()) {
                zzax zzax3 = zzax2;
                new zzbf((EmailAuthCredential) authCredential2);
                zzbf zzbf = (zzbf) zzen4.zza(firebaseApp2).zzf(firebaseUser2).zzb(zzax3).zza((zzz) zzax3);
                return zza(zzb(zzbf), zzbf);
            }
            zzax zzax4 = zzax2;
            new zzbl((EmailAuthCredential) authCredential2);
            zzbl zzbl = (zzbl) zzen3.zza(firebaseApp2).zzf(firebaseUser2).zzb(zzax4).zza((zzz) zzax4);
            return zza(zzb(zzbl), zzbl);
        } else if (authCredential2 instanceof PhoneAuthCredential) {
            zzax zzax5 = zzax2;
            new zzbj((PhoneAuthCredential) authCredential2);
            zzbj zzbj = (zzbj) zzen2.zza(firebaseApp2).zzf(firebaseUser2).zzb(zzax5).zza((zzz) zzax5);
            return zza(zzb(zzbj), zzbj);
        } else {
            zzax zzax6 = zzax2;
            FirebaseUser firebaseUser3 = firebaseUser2;
            AuthCredential authCredential3 = authCredential2;
            FirebaseApp firebaseApp3 = firebaseApp2;
            Object checkNotNull5 = Preconditions.checkNotNull(firebaseApp3);
            Object checkNotNull6 = Preconditions.checkNotNull(authCredential3);
            Object checkNotNull7 = Preconditions.checkNotNull(firebaseUser3);
            Object checkNotNull8 = Preconditions.checkNotNull(zzax6);
            new zzbh(authCredential3);
            zzbh zzbh = (zzbh) zzen.zza(firebaseApp3).zzf(firebaseUser3).zzb(zzax6).zza((zzz) zzax6);
            return zza(zzb(zzbh), zzbh);
        }
    }

    public final Task<AuthResult> zzd(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzax zzax) {
        Status status;
        zzen zzen;
        zzen zzen2;
        FirebaseApp firebaseApp2 = firebaseApp;
        FirebaseUser firebaseUser2 = firebaseUser;
        String str2 = str;
        zzax zzax2 = zzax;
        Object checkNotNull = Preconditions.checkNotNull(firebaseApp2);
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        Object checkNotNull2 = Preconditions.checkNotNull(firebaseUser2);
        Object checkNotNull3 = Preconditions.checkNotNull(zzax2);
        List<String> zzcw = firebaseUser2.zzcw();
        List<String> list = zzcw;
        if ((zzcw == null || list.contains(str2)) && !firebaseUser2.isAnonymous()) {
            String str3 = str2;
            boolean z = true;
            switch (str3.hashCode()) {
                case 1216985755:
                    if (str3.equals("password")) {
                        z = false;
                        break;
                    }
                    break;
            }
            switch (z) {
                case false:
                    zzax zzax3 = zzax2;
                    new zzcx();
                    zzcx zzcx = (zzcx) zzen.zza(firebaseApp2).zzf(firebaseUser2).zzb(zzax3).zza((zzz) zzax3);
                    return zza(zzb(zzcx), zzcx);
                default:
                    zzax zzax4 = zzax2;
                    new zzcz(str2);
                    zzcz zzcz = (zzcz) zzen2.zza(firebaseApp2).zzf(firebaseUser2).zzb(zzax4).zza((zzz) zzax4);
                    return zza(zzb(zzcz), zzcz);
            }
        } else {
            new Status(FirebaseError.ERROR_NO_SUCH_PROVIDER, str2);
            return Tasks.forException(zzdr.zzb(status));
        }
    }

    @NonNull
    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, zzax zzax) {
        zzen zzen;
        zzax zzax2 = zzax;
        new zzcd();
        zzcd zzcd = (zzcd) zzen.zza(firebaseApp).zzf(firebaseUser).zzb(zzax2).zza((zzz) zzax2);
        return zza(zza(zzcd), zzcd);
    }

    @NonNull
    public final Task<Void> zza(FirebaseUser firebaseUser, zzaa zzaa) {
        zzen zzen;
        zzaa zzaa2 = zzaa;
        new zzaz();
        zzaz zzaz = (zzaz) zzen.zzf(firebaseUser).zzb(zzaa2).zza((zzz) zzaa2);
        return zza(zzb(zzaz), zzaz);
    }

    @NonNull
    public final Task<Void> setFirebaseUIVersion(String str) {
        zzan zzan;
        new zzcj(str);
        zzan zzan2 = zzan;
        return zza(zzb(zzan2), zzan2);
    }

    @NonNull
    @VisibleForTesting
    static zzm zza(FirebaseApp firebaseApp, zzem zzem) {
        List list;
        Object obj;
        zzm zzm;
        zzo zzo;
        Object obj2;
        FirebaseApp firebaseApp2 = firebaseApp;
        zzem zzem2 = zzem;
        Object checkNotNull = Preconditions.checkNotNull(firebaseApp2);
        Object checkNotNull2 = Preconditions.checkNotNull(zzem2);
        new ArrayList();
        List list2 = list;
        new zzi(zzem2, FirebaseAuthProvider.PROVIDER_ID);
        boolean add = list2.add(obj);
        List<zzew> zzes = zzem2.zzes();
        List<zzew> list3 = zzes;
        if (zzes != null && !list3.isEmpty()) {
            for (int i = 0; i < list3.size(); i++) {
                new zzi(list3.get(i));
                boolean add2 = list2.add(obj2);
            }
        }
        new zzm(firebaseApp2, list2);
        zzm zzm2 = zzm;
        new zzo(zzem2.getLastSignInTimestamp(), zzem2.getCreationTimestamp());
        zzm2.zza(zzo);
        zzm2.zzs(zzem2.isNewUser());
        zzm2.zzb(zzem2.zzdo());
        zzm2.zzb(com.google.firebase.auth.internal.zzap.zzg(zzem2.zzbc()));
        return zzm2;
    }

    @NonNull
    @VisibleForTesting
    private final <ResultT> Task<ResultT> zza(Task<ResultT> task, zzan<zzdp, ResultT> zzan) {
        Continuation continuation;
        new zzao(this, zzan);
        return task.continueWithTask(continuation);
    }
}

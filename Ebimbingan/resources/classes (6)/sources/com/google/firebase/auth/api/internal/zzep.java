package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzdz;
import com.google.android.gms.internal.firebase_auth.zzeb;
import com.google.android.gms.internal.firebase_auth.zzec;
import com.google.android.gms.internal.firebase_auth.zzem;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfd;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzt;

@VisibleForTesting
final class zzep extends zzdx {
    final /* synthetic */ zzen zzqn;

    zzep(zzen zzen) {
        this.zzqn = zzen;
    }

    public final void zzb(zzes zzes) throws RemoteException {
        StringBuilder sb;
        zzes zzes2 = zzes;
        boolean z = this.zzqn.zzpp == 1;
        int i = this.zzqn.zzpp;
        new StringBuilder(37);
        Preconditions.checkState(z, sb.append("Unexpected response type: ").append(i).toString());
        this.zzqn.zzpy = zzes2;
        this.zzqn.zzen();
    }

    public final void zza(zzes zzes, zzem zzem) throws RemoteException {
        StringBuilder sb;
        zzes zzes2 = zzes;
        zzem zzem2 = zzem;
        boolean z = this.zzqn.zzpp == 2;
        int i = this.zzqn.zzpp;
        new StringBuilder(37);
        Preconditions.checkState(z, sb.append("Unexpected response type: ").append(i).toString());
        this.zzqn.zzpy = zzes2;
        this.zzqn.zzpz = zzem2;
        this.zzqn.zzen();
    }

    public final void zza(zzec zzec) throws RemoteException {
        StringBuilder sb;
        zzec zzec2 = zzec;
        boolean z = this.zzqn.zzpp == 3;
        int i = this.zzqn.zzpp;
        new StringBuilder(36);
        Preconditions.checkState(z, sb.append("Unexpected response type ").append(i).toString());
        this.zzqn.zzqa = zzec2;
        this.zzqn.zzen();
    }

    public final void zza(@Nullable zzfd zzfd) throws RemoteException {
        StringBuilder sb;
        zzfd zzfd2 = zzfd;
        boolean z = this.zzqn.zzpp == 4;
        int i = this.zzqn.zzpp;
        new StringBuilder(36);
        Preconditions.checkState(z, sb.append("Unexpected response type ").append(i).toString());
        this.zzqn.zzqb = zzfd2;
        this.zzqn.zzen();
    }

    public final void zzdy() throws RemoteException {
        StringBuilder sb;
        boolean z = this.zzqn.zzpp == 5;
        int i = this.zzqn.zzpp;
        new StringBuilder(36);
        Preconditions.checkState(z, sb.append("Unexpected response type ").append(i).toString());
        this.zzqn.zzen();
    }

    public final void zzdz() throws RemoteException {
        StringBuilder sb;
        boolean z = this.zzqn.zzpp == 6;
        int i = this.zzqn.zzpp;
        new StringBuilder(36);
        Preconditions.checkState(z, sb.append("Unexpected response type ").append(i).toString());
        this.zzqn.zzen();
    }

    public final void zzby(String str) throws RemoteException {
        StringBuilder sb;
        String str2 = str;
        boolean z = this.zzqn.zzpp == 7;
        int i = this.zzqn.zzpp;
        new StringBuilder(36);
        Preconditions.checkState(z, sb.append("Unexpected response type ").append(i).toString());
        this.zzqn.zzqc = str2;
        this.zzqn.zzen();
    }

    public final void zzbz(String str) throws RemoteException {
        StringBuilder sb;
        zzev zzev;
        String str2 = str;
        boolean z = this.zzqn.zzpp == 8;
        int i = this.zzqn.zzpp;
        new StringBuilder(36);
        Preconditions.checkState(z, sb.append("Unexpected response type ").append(i).toString());
        this.zzqn.zzjl = str2;
        new zzeo(this, str2);
        zza(zzev);
    }

    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        StringBuilder sb;
        zzev zzev;
        PhoneAuthCredential phoneAuthCredential2 = phoneAuthCredential;
        boolean z = this.zzqn.zzpp == 8;
        int i = this.zzqn.zzpp;
        new StringBuilder(36);
        Preconditions.checkState(z, sb.append("Unexpected response type ").append(i).toString());
        boolean zza = zzen.zza(this.zzqn, true);
        this.zzqn.zzqj = true;
        new zzer(this, phoneAuthCredential2);
        zza(zzev);
    }

    public final void zzca(String str) throws RemoteException {
        StringBuilder sb;
        zzev zzev;
        String str2 = str;
        boolean z = this.zzqn.zzpp == 8;
        int i = this.zzqn.zzpp;
        new StringBuilder(36);
        Preconditions.checkState(z, sb.append("Unexpected response type ").append(i).toString());
        this.zzqn.zzjl = str2;
        boolean zza = zzen.zza(this.zzqn, true);
        this.zzqn.zzqj = true;
        new zzeq(this, str2);
        zza(zzev);
    }

    public final void onFailure(Status status) throws RemoteException {
        zzev zzev;
        Status status2 = status;
        if (this.zzqn.zzpp == 8) {
            boolean zza = zzen.zza(this.zzqn, true);
            this.zzqn.zzqj = false;
            new zzet(this, status2);
            zza(zzev);
            return;
        }
        this.zzqn.zzd(status2);
        this.zzqn.zzc(status2);
    }

    public final void zza(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        StringBuilder sb;
        Status status2 = status;
        PhoneAuthCredential phoneAuthCredential2 = phoneAuthCredential;
        boolean z = this.zzqn.zzpp == 2;
        int i = this.zzqn.zzpp;
        new StringBuilder(36);
        Preconditions.checkState(z, sb.append("Unexpected response type ").append(i).toString());
        Status status3 = status2;
        Status status4 = status3;
        zzb(status3, phoneAuthCredential2, (String) null, (String) null);
    }

    public final void zza(zzdz zzdz) {
        zzdz zzdz2 = zzdz;
        zzb(zzdz2.getStatus(), zzdz2.zzdo(), zzdz2.getEmail(), zzdz2.zzba());
    }

    public final void zza(zzeb zzeb) {
        this.zzqn.zzqg = zzeb;
        this.zzqn.zzc(zzt.zzdc("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    private final void zzb(Status status, AuthCredential authCredential, @Nullable String str, @Nullable String str2) {
        Status status2 = status;
        this.zzqn.zzd(status2);
        this.zzqn.zzqd = authCredential;
        this.zzqn.zzqe = str;
        this.zzqn.zzqf = str2;
        if (this.zzqn.zzpt != null) {
            this.zzqn.zzpt.zza(status2);
        }
        this.zzqn.zzc(status2);
    }

    public final void zzea() throws RemoteException {
        StringBuilder sb;
        boolean z = this.zzqn.zzpp == 9;
        int i = this.zzqn.zzpp;
        new StringBuilder(36);
        Preconditions.checkState(z, sb.append("Unexpected response type ").append(i).toString());
        this.zzqn.zzen();
    }

    private final void zza(zzev zzev) {
        Runnable runnable;
        new zzes(this, zzev);
        this.zzqn.zzpx.execute(runnable);
    }
}

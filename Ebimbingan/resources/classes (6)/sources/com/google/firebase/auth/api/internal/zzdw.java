package com.google.firebase.auth.api.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.zzb;
import com.google.android.gms.internal.firebase_auth.zzd;

public final class zzdw extends zzb implements zzdu {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdw(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(com.google.android.gms.internal.firebase_auth.zzes r8) throws android.os.RemoteException {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r3 = r0
            android.os.Parcel r3 = r3.zza()
            r6 = r3
            r3 = r6
            r4 = r6
            r2 = r4
            r4 = r1
            com.google.android.gms.internal.firebase_auth.zzd.zza((android.os.Parcel) r3, (android.os.Parcelable) r4)
            r3 = r0
            r4 = 1
            r5 = r2
            r3.zzb(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzdw.zzb(com.google.android.gms.internal.firebase_auth.zzes):void");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.firebase_auth.zzes r9, com.google.android.gms.internal.firebase_auth.zzem r10) throws android.os.RemoteException {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r0
            android.os.Parcel r4 = r4.zza()
            r7 = r4
            r4 = r7
            r5 = r7
            r3 = r5
            r5 = r1
            com.google.android.gms.internal.firebase_auth.zzd.zza((android.os.Parcel) r4, (android.os.Parcelable) r5)
            r4 = r3
            r5 = r2
            com.google.android.gms.internal.firebase_auth.zzd.zza((android.os.Parcel) r4, (android.os.Parcelable) r5)
            r4 = r0
            r5 = 2
            r6 = r3
            r4.zzb(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzdw.zza(com.google.android.gms.internal.firebase_auth.zzes, com.google.android.gms.internal.firebase_auth.zzem):void");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.firebase_auth.zzec r8) throws android.os.RemoteException {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r3 = r0
            android.os.Parcel r3 = r3.zza()
            r6 = r3
            r3 = r6
            r4 = r6
            r2 = r4
            r4 = r1
            com.google.android.gms.internal.firebase_auth.zzd.zza((android.os.Parcel) r3, (android.os.Parcelable) r4)
            r3 = r0
            r4 = 3
            r5 = r2
            r3.zzb(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzdw.zza(com.google.android.gms.internal.firebase_auth.zzec):void");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.firebase_auth.zzfd r8) throws android.os.RemoteException {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r3 = r0
            android.os.Parcel r3 = r3.zza()
            r6 = r3
            r3 = r6
            r4 = r6
            r2 = r4
            r4 = r1
            com.google.android.gms.internal.firebase_auth.zzd.zza((android.os.Parcel) r3, (android.os.Parcelable) r4)
            r3 = r0
            r4 = 4
            r5 = r2
            r3.zzb(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzdw.zza(com.google.android.gms.internal.firebase_auth.zzfd):void");
    }

    public final void onFailure(Status status) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, (Parcelable) status);
        zzb(5, zza);
    }

    public final void zzdy() throws RemoteException {
        zzb(6, zza());
    }

    public final void zzdz() throws RemoteException {
        zzb(7, zza());
    }

    public final void zzby(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzb(8, zza);
    }

    public final void zzbz(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzb(9, zza);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onVerificationCompleted(com.google.firebase.auth.PhoneAuthCredential r8) throws android.os.RemoteException {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r3 = r0
            android.os.Parcel r3 = r3.zza()
            r6 = r3
            r3 = r6
            r4 = r6
            r2 = r4
            r4 = r1
            com.google.android.gms.internal.firebase_auth.zzd.zza((android.os.Parcel) r3, (android.os.Parcelable) r4)
            r3 = r0
            r4 = 10
            r5 = r2
            r3.zzb(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzdw.onVerificationCompleted(com.google.firebase.auth.PhoneAuthCredential):void");
    }

    public final void zzca(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzb(11, zza);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.common.api.Status r9, com.google.firebase.auth.PhoneAuthCredential r10) throws android.os.RemoteException {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r0
            android.os.Parcel r4 = r4.zza()
            r7 = r4
            r4 = r7
            r5 = r7
            r3 = r5
            r5 = r1
            com.google.android.gms.internal.firebase_auth.zzd.zza((android.os.Parcel) r4, (android.os.Parcelable) r5)
            r4 = r3
            r5 = r2
            com.google.android.gms.internal.firebase_auth.zzd.zza((android.os.Parcel) r4, (android.os.Parcelable) r5)
            r4 = r0
            r5 = 12
            r6 = r3
            r4.zzb(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzdw.zza(com.google.android.gms.common.api.Status, com.google.firebase.auth.PhoneAuthCredential):void");
    }

    public final void zzea() throws RemoteException {
        zzb(13, zza());
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.firebase_auth.zzdz r8) throws android.os.RemoteException {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r3 = r0
            android.os.Parcel r3 = r3.zza()
            r6 = r3
            r3 = r6
            r4 = r6
            r2 = r4
            r4 = r1
            com.google.android.gms.internal.firebase_auth.zzd.zza((android.os.Parcel) r3, (android.os.Parcelable) r4)
            r3 = r0
            r4 = 14
            r5 = r2
            r3.zzb(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzdw.zza(com.google.android.gms.internal.firebase_auth.zzdz):void");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.firebase_auth.zzeb r8) throws android.os.RemoteException {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r3 = r0
            android.os.Parcel r3 = r3.zza()
            r6 = r3
            r3 = r6
            r4 = r6
            r2 = r4
            r4 = r1
            com.google.android.gms.internal.firebase_auth.zzd.zza((android.os.Parcel) r3, (android.os.Parcelable) r4)
            r3 = r0
            r4 = 15
            r5 = r2
            r3.zzb(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzdw.zza(com.google.android.gms.internal.firebase_auth.zzeb):void");
    }
}

package com.google.firebase.auth.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.firebase_auth.zzb;
import com.google.android.gms.internal.firebase_auth.zzbn;
import com.google.android.gms.internal.firebase_auth.zzbp;
import com.google.android.gms.internal.firebase_auth.zzbr;
import com.google.android.gms.internal.firebase_auth.zzbt;
import com.google.android.gms.internal.firebase_auth.zzbv;
import com.google.android.gms.internal.firebase_auth.zzbx;
import com.google.android.gms.internal.firebase_auth.zzbz;
import com.google.android.gms.internal.firebase_auth.zzcb;
import com.google.android.gms.internal.firebase_auth.zzcd;
import com.google.android.gms.internal.firebase_auth.zzcf;
import com.google.android.gms.internal.firebase_auth.zzch;
import com.google.android.gms.internal.firebase_auth.zzcj;
import com.google.android.gms.internal.firebase_auth.zzcl;
import com.google.android.gms.internal.firebase_auth.zzcn;
import com.google.android.gms.internal.firebase_auth.zzcp;
import com.google.android.gms.internal.firebase_auth.zzcr;
import com.google.android.gms.internal.firebase_auth.zzct;
import com.google.android.gms.internal.firebase_auth.zzcv;
import com.google.android.gms.internal.firebase_auth.zzcx;
import com.google.android.gms.internal.firebase_auth.zzcz;
import com.google.android.gms.internal.firebase_auth.zzd;
import com.google.android.gms.internal.firebase_auth.zzdb;
import com.google.android.gms.internal.firebase_auth.zzdd;
import com.google.android.gms.internal.firebase_auth.zzdf;
import com.google.android.gms.internal.firebase_auth.zzdh;
import com.google.android.gms.internal.firebase_auth.zzdj;
import com.google.android.gms.internal.firebase_auth.zzdl;
import com.google.android.gms.internal.firebase_auth.zzdn;
import com.google.android.gms.internal.firebase_auth.zzdp;
import com.google.android.gms.internal.firebase_auth.zzdr;
import com.google.android.gms.internal.firebase_auth.zzdt;
import com.google.android.gms.internal.firebase_auth.zzdv;
import com.google.android.gms.internal.firebase_auth.zzdx;
import com.google.android.gms.internal.firebase_auth.zzfe;
import com.google.android.gms.internal.firebase_auth.zzfm;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;

public final class zzea extends zzb implements zzdz {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzea(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthService");
    }

    public final void zza(String str, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(1, parcel);
    }

    public final void zzb(String str, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(2, parcel);
    }

    public final void zza(zzfm zzfm, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzfm);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(3, parcel);
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (Parcelable) userProfileChangeRequest);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(4, parcel);
    }

    public final void zza(String str, String str2, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        parcel.writeString(str2);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(5, parcel);
    }

    public final void zzb(String str, String str2, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        parcel.writeString(str2);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(6, parcel);
    }

    public final void zzc(String str, String str2, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        parcel.writeString(str2);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(7, parcel);
    }

    public final void zzd(String str, String str2, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        parcel.writeString(str2);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(8, parcel);
    }

    public final void zzc(String str, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(9, parcel);
    }

    public final void zzd(String str, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(10, parcel);
    }

    public final void zza(String str, String str2, String str3, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        parcel.writeString(str2);
        parcel.writeString(str3);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(11, parcel);
    }

    public final void zza(String str, zzfm zzfm, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (Parcelable) zzfm);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(12, parcel);
    }

    public final void zze(String str, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(13, parcel);
    }

    public final void zze(String str, String str2, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        parcel.writeString(str2);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(14, parcel);
    }

    public final void zzf(String str, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(15, parcel);
    }

    public final void zza(zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, (IInterface) zzdu);
        zza(16, zza);
    }

    public final void zzg(String str, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(17, parcel);
    }

    public final void zzh(String str, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(18, parcel);
    }

    public final void zzi(String str, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(19, parcel);
    }

    public final void zzj(String str, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(20, parcel);
    }

    public final void zzf(String str, String str2, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        parcel.writeString(str2);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(21, parcel);
    }

    public final void zza(zzfe zzfe, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzfe);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(22, parcel);
    }

    public final void zza(PhoneAuthCredential phoneAuthCredential, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) phoneAuthCredential);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(23, parcel);
    }

    public final void zza(String str, PhoneAuthCredential phoneAuthCredential, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (Parcelable) phoneAuthCredential);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(24, parcel);
    }

    public final void zza(String str, ActionCodeSettings actionCodeSettings, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (Parcelable) actionCodeSettings);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(25, parcel);
    }

    public final void zzb(String str, ActionCodeSettings actionCodeSettings, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (Parcelable) actionCodeSettings);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(26, parcel);
    }

    public final void zzk(String str, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(27, parcel);
    }

    public final void zzc(String str, ActionCodeSettings actionCodeSettings, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (Parcelable) actionCodeSettings);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(28, parcel);
    }

    public final void zza(EmailAuthCredential emailAuthCredential, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) emailAuthCredential);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(29, parcel);
    }

    public final void zza(zzcf zzcf, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzcf);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(101, parcel);
    }

    public final void zza(zzdd zzdd, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzdd);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(102, parcel);
    }

    public final void zza(zzdb zzdb, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzdb);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(103, parcel);
    }

    public final void zza(zzdv zzdv, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzdv);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(104, parcel);
    }

    public final void zza(zzbp zzbp, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzbp);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(105, parcel);
    }

    public final void zza(zzbr zzbr, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzbr);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(106, parcel);
    }

    public final void zza(zzbx zzbx, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzbx);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(107, parcel);
    }

    public final void zza(zzdf zzdf, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzdf);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(108, parcel);
    }

    public final void zza(zzch zzch, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzch);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(109, parcel);
    }

    public final void zza(zzcj zzcj, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzcj);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(111, parcel);
    }

    public final void zza(zzcl zzcl, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzcl);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(112, parcel);
    }

    public final void zza(zzdr zzdr, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzdr);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(113, parcel);
    }

    public final void zza(zzdt zzdt, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzdt);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(114, parcel);
    }

    public final void zza(zzcp zzcp, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzcp);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(115, parcel);
    }

    public final void zza(zzcz zzcz, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzcz);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(116, parcel);
    }

    public final void zza(zzbz zzbz, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzbz);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(117, parcel);
    }

    public final void zza(zzbt zzbt, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzbt);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(119, parcel);
    }

    public final void zza(zzbn zzbn, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzbn);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(120, parcel);
    }

    public final void zza(zzbv zzbv, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzbv);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(121, parcel);
    }

    public final void zza(zzcv zzcv, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzcv);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(122, parcel);
    }

    public final void zza(zzdj zzdj, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzdj);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(123, parcel);
    }

    public final void zza(zzcn zzcn, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzcn);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(124, parcel);
    }

    public final void zza(zzcr zzcr, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzcr);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(126, parcel);
    }

    public final void zza(zzcx zzcx, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzcx);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(127, parcel);
    }

    public final void zza(zzct zzct, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzct);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(128, parcel);
    }

    public final void zza(zzdh zzdh, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzdh);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(129, parcel);
    }

    public final void zza(zzdl zzdl, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzdl);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(130, parcel);
    }

    public final void zza(zzdp zzdp, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzdp);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(131, parcel);
    }

    public final void zza(zzcb zzcb, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzcb);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(132, parcel);
    }

    public final void zza(zzdn zzdn, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzdn);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(133, parcel);
    }

    public final void zza(zzcd zzcd, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzcd);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(134, parcel);
    }

    public final void zza(zzdx zzdx, zzdu zzdu) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) zzdx);
        zzd.zza(parcel, (IInterface) zzdu);
        zza(135, parcel);
    }
}

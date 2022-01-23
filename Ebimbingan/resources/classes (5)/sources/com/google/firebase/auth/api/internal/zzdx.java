package com.google.firebase.auth.api.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.firebase.client.utilities.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.zza;
import com.google.android.gms.internal.firebase_auth.zzd;
import com.google.android.gms.internal.firebase_auth.zzdz;
import com.google.android.gms.internal.firebase_auth.zzeb;
import com.google.android.gms.internal.firebase_auth.zzec;
import com.google.android.gms.internal.firebase_auth.zzem;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfd;
import com.google.firebase.auth.PhoneAuthCredential;
import org.shaded.apache.commons.logging.impl.SimpleLog;
import org.shaded.apache.http.protocol.HTTP;

public abstract class zzdx extends zza implements zzdu {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdx() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                zzb((zzes) zzd.zza(parcel3, zzes.CREATOR));
                break;
            case 2:
                zza((zzes) zzd.zza(parcel3, zzes.CREATOR), (zzem) zzd.zza(parcel3, zzem.CREATOR));
                break;
            case 3:
                zza((zzec) zzd.zza(parcel3, zzec.CREATOR));
                break;
            case 4:
                zza((zzfd) zzd.zza(parcel3, zzfd.CREATOR));
                break;
            case 5:
                onFailure(zzd.zza(parcel3, Status.CREATOR));
                break;
            case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                zzdy();
                break;
            case SimpleLog.LOG_LEVEL_OFF /*7*/:
                zzdz();
                break;
            case Base64.DO_BREAK_LINES:
                zzby(parcel3.readString());
                break;
            case HTTP.HT /*9*/:
                zzbz(parcel3.readString());
                break;
            case HTTP.LF /*10*/:
                onVerificationCompleted((PhoneAuthCredential) zzd.zza(parcel3, PhoneAuthCredential.CREATOR));
                break;
            case 11:
                zzca(parcel3.readString());
                break;
            case 12:
                zza(zzd.zza(parcel3, Status.CREATOR), (PhoneAuthCredential) zzd.zza(parcel3, PhoneAuthCredential.CREATOR));
                break;
            case HTTP.CR /*13*/:
                zzea();
                break;
            case 14:
                zza((zzdz) zzd.zza(parcel3, zzdz.CREATOR));
                break;
            case 15:
                zza((zzeb) zzd.zza(parcel3, zzeb.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}

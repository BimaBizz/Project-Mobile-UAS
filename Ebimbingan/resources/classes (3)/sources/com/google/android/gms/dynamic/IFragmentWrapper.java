package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface IFragmentWrapper extends IInterface {
    void zzA(@RecentlyNonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    @RecentlyNonNull
    IObjectWrapper zzb() throws RemoteException;

    @RecentlyNonNull
    Bundle zzc() throws RemoteException;

    int zzd() throws RemoteException;

    @RecentlyNullable
    IFragmentWrapper zze() throws RemoteException;

    @RecentlyNonNull
    IObjectWrapper zzf() throws RemoteException;

    boolean zzg() throws RemoteException;

    @RecentlyNullable
    String zzh() throws RemoteException;

    @RecentlyNullable
    IFragmentWrapper zzi() throws RemoteException;

    int zzj() throws RemoteException;

    boolean zzk() throws RemoteException;

    @RecentlyNonNull
    IObjectWrapper zzl() throws RemoteException;

    boolean zzm() throws RemoteException;

    boolean zzn() throws RemoteException;

    boolean zzo() throws RemoteException;

    boolean zzp() throws RemoteException;

    boolean zzq() throws RemoteException;

    boolean zzr() throws RemoteException;

    boolean zzs() throws RemoteException;

    void zzt(@RecentlyNonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzu(boolean z) throws RemoteException;

    void zzv(boolean z) throws RemoteException;

    void zzw(boolean z) throws RemoteException;

    void zzx(boolean z) throws RemoteException;

    void zzy(@RecentlyNonNull Intent intent) throws RemoteException;

    void zzz(@RecentlyNonNull Intent intent, int i) throws RemoteException;

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static abstract class Stub extends zzb implements IFragmentWrapper {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @RecentlyNonNull
        public static IFragmentWrapper asInterface(@RecentlyNonNull IBinder iBinder) {
            IFragmentWrapper iFragmentWrapper;
            IBinder iBinder2 = iBinder;
            if (iBinder2 == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (queryLocalInterface instanceof IFragmentWrapper) {
                return (IFragmentWrapper) queryLocalInterface;
            }
            new zza(iBinder2);
            return iFragmentWrapper;
        }

        /* access modifiers changed from: protected */
        public final boolean zza(int i, @RecentlyNonNull Parcel parcel, @RecentlyNonNull Parcel parcel2, int i2) throws RemoteException {
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            int i3 = i2;
            switch (i) {
                case 2:
                    IObjectWrapper zzb = zzb();
                    parcel4.writeNoException();
                    zzc.zzf(parcel4, zzb);
                    break;
                case 3:
                    Bundle zzc = zzc();
                    parcel4.writeNoException();
                    zzc.zze(parcel4, zzc);
                    break;
                case 4:
                    int zzd = zzd();
                    parcel4.writeNoException();
                    parcel4.writeInt(zzd);
                    break;
                case 5:
                    IFragmentWrapper zze = zze();
                    parcel4.writeNoException();
                    zzc.zzf(parcel4, zze);
                    break;
                case 6:
                    IObjectWrapper zzf = zzf();
                    parcel4.writeNoException();
                    zzc.zzf(parcel4, zzf);
                    break;
                case 7:
                    boolean zzg = zzg();
                    parcel4.writeNoException();
                    zzc.zzb(parcel4, zzg);
                    break;
                case 8:
                    String zzh = zzh();
                    parcel4.writeNoException();
                    parcel4.writeString(zzh);
                    break;
                case ConnectionResult.SERVICE_INVALID:
                    IFragmentWrapper zzi = zzi();
                    parcel4.writeNoException();
                    zzc.zzf(parcel4, zzi);
                    break;
                case 10:
                    int zzj = zzj();
                    parcel4.writeNoException();
                    parcel4.writeInt(zzj);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED:
                    boolean zzk = zzk();
                    parcel4.writeNoException();
                    zzc.zzb(parcel4, zzk);
                    break;
                case 12:
                    IObjectWrapper zzl = zzl();
                    parcel4.writeNoException();
                    zzc.zzf(parcel4, zzl);
                    break;
                case 13:
                    boolean zzm = zzm();
                    parcel4.writeNoException();
                    zzc.zzb(parcel4, zzm);
                    break;
                case 14:
                    boolean zzn = zzn();
                    parcel4.writeNoException();
                    zzc.zzb(parcel4, zzn);
                    break;
                case 15:
                    boolean zzo = zzo();
                    parcel4.writeNoException();
                    zzc.zzb(parcel4, zzo);
                    break;
                case 16:
                    boolean zzp = zzp();
                    parcel4.writeNoException();
                    zzc.zzb(parcel4, zzp);
                    break;
                case 17:
                    boolean zzq = zzq();
                    parcel4.writeNoException();
                    zzc.zzb(parcel4, zzq);
                    break;
                case ConnectionResult.SERVICE_UPDATING:
                    boolean zzr = zzr();
                    parcel4.writeNoException();
                    zzc.zzb(parcel4, zzr);
                    break;
                case 19:
                    boolean zzs = zzs();
                    parcel4.writeNoException();
                    zzc.zzb(parcel4, zzs);
                    break;
                case 20:
                    zzt(IObjectWrapper.Stub.asInterface(parcel3.readStrongBinder()));
                    parcel4.writeNoException();
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    zzu(zzc.zza(parcel3));
                    parcel4.writeNoException();
                    break;
                case 22:
                    zzv(zzc.zza(parcel3));
                    parcel4.writeNoException();
                    break;
                case ConnectionResult.API_DISABLED:
                    zzw(zzc.zza(parcel3));
                    parcel4.writeNoException();
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION:
                    zzx(zzc.zza(parcel3));
                    parcel4.writeNoException();
                    break;
                case 25:
                    zzy((Intent) zzc.zzc(parcel3, Intent.CREATOR));
                    parcel4.writeNoException();
                    break;
                case 26:
                    zzz((Intent) zzc.zzc(parcel3, Intent.CREATOR), parcel3.readInt());
                    parcel4.writeNoException();
                    break;
                case 27:
                    zzA(IObjectWrapper.Stub.asInterface(parcel3.readStrongBinder()));
                    parcel4.writeNoException();
                    break;
                default:
                    return false;
            }
            return true;
        }
    }
}

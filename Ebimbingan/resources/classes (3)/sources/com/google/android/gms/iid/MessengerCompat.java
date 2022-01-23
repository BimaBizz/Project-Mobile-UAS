package com.google.android.gms.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class MessengerCompat implements ReflectedParcelable {
    public static final Parcelable.Creator<MessengerCompat> CREATOR;
    private Messenger zzad;
    private zzl zzcd;

    public MessengerCompat(IBinder iBinder) {
        zzl zzl;
        zzl zzl2;
        Messenger messenger;
        IBinder iBinder2 = iBinder;
        if (Build.VERSION.SDK_INT >= 21) {
            new Messenger(iBinder2);
            this.zzad = messenger;
            return;
        }
        IBinder iBinder3 = iBinder2;
        IBinder iBinder4 = iBinder3;
        if (iBinder3 == null) {
            zzl2 = null;
        } else {
            IInterface queryLocalInterface = iBinder4.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            IInterface iInterface = queryLocalInterface;
            if (queryLocalInterface instanceof zzl) {
                zzl2 = (zzl) iInterface;
            } else {
                zzl2 = zzl;
                new zzm(iBinder4);
            }
        }
        this.zzcd = zzl2;
    }

    public final void send(Message message) throws RemoteException {
        Message message2 = message;
        if (this.zzad != null) {
            this.zzad.send(message2);
        } else {
            this.zzcd.send(message2);
        }
    }

    private final IBinder getBinder() {
        return this.zzad != null ? this.zzad.getBinder() : this.zzcd.asBinder();
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        try {
            return getBinder().equals(((MessengerCompat) obj2).getBinder());
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        return getBinder().hashCode();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        if (this.zzad != null) {
            parcel2.writeStrongBinder(this.zzad.getBinder());
        } else {
            parcel2.writeStrongBinder(this.zzcd.asBinder());
        }
    }

    static {
        Parcelable.Creator<MessengerCompat> creator;
        new zzq();
        CREATOR = creator;
    }
}

package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

final class zzy {
    final Messenger zzad;
    final MessengerCompat zzco;

    zzy(IBinder iBinder) throws RemoteException {
        String str;
        String str2;
        Throwable th;
        MessengerCompat messengerCompat;
        Messenger messenger;
        IBinder iBinder2 = iBinder;
        String interfaceDescriptor = iBinder2.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            new Messenger(iBinder2);
            this.zzad = messenger;
            this.zzco = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            new MessengerCompat(iBinder2);
            this.zzco = messengerCompat;
            this.zzad = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            String str3 = valueOf;
            if (valueOf.length() != 0) {
                str2 = "Invalid interface descriptor: ".concat(str3);
            } else {
                str2 = str;
                new String("Invalid interface descriptor: ");
            }
            int w = Log.w("MessengerIpcClient", str2);
            Throwable th2 = th;
            new RemoteException();
            throw th2;
        }
    }
}

package com.google.android.gms.iid;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final /* synthetic */ class zzw implements Runnable {
    private final zzt zzcm;

    zzw(zzt zzt) {
        this.zzcm = zzt;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        Runnable runnable;
        Bundle bundle;
        Throwable th;
        StringBuilder sb;
        zzt zzt = this.zzcm;
        while (true) {
            zzt zzt2 = zzt;
            zzt zzt3 = zzt2;
            synchronized (zzt2) {
                try {
                    if (zzt.state != 2) {
                        return;
                    } else if (zzt.zzcj.isEmpty()) {
                        zzt.zzu();
                        return;
                    } else {
                        zzz poll = zzt.zzcj.poll();
                        zzt.zzck.put(poll.zzcp, poll);
                        new zzx(zzt, poll);
                        ScheduledFuture<?> schedule = zzt.zzcl.zzce.schedule(runnable, 30, TimeUnit.SECONDS);
                        zzz zzz = poll;
                        zzt zzt4 = zzt;
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            String valueOf = String.valueOf(zzz);
                            new StringBuilder(8 + String.valueOf(valueOf).length());
                            int d = Log.d("MessengerIpcClient", sb.append("Sending ").append(valueOf).toString());
                        }
                        Context zzd = zzt4.zzcl.zzl;
                        zzz zzz2 = zzz;
                        Message obtain = Message.obtain();
                        Message message = obtain;
                        obtain.what = zzz2.what;
                        message.arg1 = zzz2.zzcp;
                        message.replyTo = zzt4.zzch;
                        new Bundle();
                        Bundle bundle2 = bundle;
                        Bundle bundle3 = bundle2;
                        bundle2.putBoolean("oneWay", zzz2.zzw());
                        bundle3.putString("pkg", zzd.getPackageName());
                        bundle3.putBundle("data", zzz2.zzcr);
                        message.setData(bundle3);
                        try {
                            Message message2 = message;
                            zzy zzy = zzt4.zzci;
                            zzy zzy2 = zzy;
                            if (zzy.zzad != null) {
                                zzy2.zzad.send(message2);
                            } else if (zzy2.zzco != null) {
                                zzy2.zzco.send(message2);
                            } else {
                                Throwable th2 = th;
                                new IllegalStateException("Both messengers are null");
                                throw th2;
                            }
                        } catch (RemoteException e) {
                            zzt4.zzd(2, e.getMessage());
                        }
                    }
                } catch (Throwable th3) {
                    while (true) {
                        Throwable th4 = th3;
                        zzt zzt5 = zzt3;
                        throw th4;
                    }
                }
            }
        }
    }
}

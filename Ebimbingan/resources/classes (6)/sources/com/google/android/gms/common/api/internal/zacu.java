package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zacu extends zap {
    final /* synthetic */ zacv zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zacu(zacv zacv, Looper looper) {
        super(looper);
        this.zaa = zacv;
    }

    /* JADX INFO: finally extract failed */
    public final void handleMessage(Message message) {
        Status status;
        String str;
        StringBuilder sb;
        Message message2 = message;
        switch (message2.what) {
            case 0:
                PendingResult pendingResult = (PendingResult) message2.obj;
                Object zag = this.zaa.zae;
                synchronized (zag) {
                    try {
                        zacv zacv = (zacv) Preconditions.checkNotNull(this.zaa.zab);
                        if (pendingResult == null) {
                            new Status(13, "Transform returned null");
                            zacv.zak(status);
                        } else if (pendingResult instanceof zack) {
                            zacv.zak(((zack) pendingResult).zaa());
                        } else {
                            zacv.zaa(pendingResult);
                        }
                    } catch (Throwable th) {
                        while (true) {
                            Throwable th2 = th;
                            Object obj = zag;
                            throw th2;
                            break;
                        }
                    }
                }
                return;
            case 1:
                RuntimeException runtimeException = (RuntimeException) message2.obj;
                String valueOf = String.valueOf(runtimeException.getMessage());
                String str2 = "Runtime exception on the transformation worker thread: ";
                if (valueOf.length() != 0) {
                    str = str2.concat(valueOf);
                } else {
                    new String(str2);
                }
                int e = Log.e("TransformedResultImpl", str);
                throw runtimeException;
            default:
                int i = message2.what;
                new StringBuilder(70);
                StringBuilder append = sb.append("TransformationResultHandler received unknown message type: ");
                StringBuilder append2 = sb.append(i);
                int e2 = Log.e("TransformedResultImpl", sb.toString());
                return;
        }
    }
}

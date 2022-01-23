package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.internal.base.C1106zap;

/* renamed from: com.google.android.gms.common.api.internal.zacu */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0345zacu extends C1106zap {
    final /* synthetic */ C0346zacv zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0345zacu(C0346zacv zacv, Looper looper) {
        super(looper);
        this.zaa = zacv;
    }

    /* JADX INFO: finally extract failed */
    public final void handleMessage(Message message) {
        C0236Status status;
        String str;
        StringBuilder sb;
        Message message2 = message;
        switch (message2.what) {
            case 0:
                C0225PendingResult pendingResult = (C0225PendingResult) message2.obj;
                Object zag = this.zaa.zae;
                synchronized (zag) {
                    try {
                        C0346zacv zacv = (C0346zacv) C0446Preconditions.checkNotNull(this.zaa.zab);
                        if (pendingResult == null) {
                            new C0236Status(13, "Transform returned null");
                            zacv.zak(status);
                        } else if (pendingResult instanceof C0335zack) {
                            zacv.zak(((C0335zack) pendingResult).zaa());
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

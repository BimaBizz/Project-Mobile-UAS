package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.common.C1108zzb;

/* renamed from: com.google.android.gms.dynamic.IObjectWrapper */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface C0661IObjectWrapper extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.IObjectWrapper$Stub */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static abstract class Stub extends C1108zzb implements C0661IObjectWrapper {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @RecentlyNonNull
        public static C0661IObjectWrapper asInterface(@RecentlyNonNull IBinder iBinder) {
            C0661IObjectWrapper iObjectWrapper;
            IBinder iBinder2 = iBinder;
            if (iBinder2 == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C0661IObjectWrapper) {
                return (C0661IObjectWrapper) queryLocalInterface;
            }
            new C0676zzb(iBinder2);
            return iObjectWrapper;
        }
    }
}

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaz extends RemoteCreator<zam> {
    private static final zaz zaa;

    static {
        zaz zaz;
        new zaz();
        zaa = zaz;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        Throwable th;
        StringBuilder sb;
        zax zax;
        Context context2 = context;
        int i3 = i;
        int i4 = i2;
        zaz zaz = zaa;
        try {
            new zax(1, i3, i4, (Scope[]) null);
            return (View) ObjectWrapper.unwrap(((zam) zaz.getRemoteCreatorInstance(context2)).zae(ObjectWrapper.wrap(context2), zax));
        } catch (Exception e) {
            Exception exc = e;
            new StringBuilder(64);
            StringBuilder append = sb.append("Could not get button with size ");
            StringBuilder append2 = sb.append(i3);
            StringBuilder append3 = sb.append(" and color ");
            StringBuilder append4 = sb.append(i4);
            new RemoteCreator.RemoteCreatorException(sb.toString(), exc);
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        zam zam;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            zam = null;
        } else {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            if (queryLocalInterface instanceof zam) {
                zam = (zam) queryLocalInterface;
            } else {
                new zam(iBinder2);
            }
        }
        return zam;
    }
}

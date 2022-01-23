package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.dynamic.C0663ObjectWrapper;
import com.google.android.gms.dynamic.C0665RemoteCreator;

/* renamed from: com.google.android.gms.common.internal.zaz */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0510zaz extends C0665RemoteCreator<C0497zam> {
    private static final C0510zaz zaa;

    static {
        C0510zaz zaz;
        new C0510zaz();
        zaa = zaz;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C0510zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i, int i2) throws C0665RemoteCreator.RemoteCreatorException {
        Throwable th;
        StringBuilder sb;
        C0508zax zax;
        Context context2 = context;
        int i3 = i;
        int i4 = i2;
        C0510zaz zaz = zaa;
        try {
            new C0508zax(1, i3, i4, (C0235Scope[]) null);
            return (View) C0663ObjectWrapper.unwrap(((C0497zam) zaz.getRemoteCreatorInstance(context2)).zae(C0663ObjectWrapper.wrap(context2), zax));
        } catch (Exception e) {
            Exception exc = e;
            new StringBuilder(64);
            StringBuilder append = sb.append("Could not get button with size ");
            StringBuilder append2 = sb.append(i3);
            StringBuilder append3 = sb.append(" and color ");
            StringBuilder append4 = sb.append(i4);
            new C0665RemoteCreator.RemoteCreatorException(sb.toString(), exc);
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        C0497zam zam;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            zam = null;
        } else {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            if (queryLocalInterface instanceof C0497zam) {
                zam = (C0497zam) queryLocalInterface;
            } else {
                new C0497zam(iBinder2);
            }
        }
        return zam;
    }
}

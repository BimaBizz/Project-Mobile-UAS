package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.internal.zzh */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0528zzh implements Parcelable.Creator<C0425BinderWrapper> {
    C0528zzh() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        new C0425BinderWrapper(parcel, (C0528zzh) null);
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0425BinderWrapper[i];
    }
}

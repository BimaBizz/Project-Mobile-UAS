package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class zzh implements Parcelable.Creator<BinderWrapper> {
    zzh() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        new BinderWrapper(parcel, (zzh) null);
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}

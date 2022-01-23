package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.data.C0400DataHolder;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.data.DataBufferSafeParcelable */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0398DataBufferSafeParcelable<T extends C0463SafeParcelable> extends C0391AbstractDataBuffer<T> {
    private static final String[] zaa = {"data"};
    private final Parcelable.Creator<T> zab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    public C0398DataBufferSafeParcelable(@RecentlyNonNull C0400DataHolder dataHolder, @RecentlyNonNull Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zab = creator;
    }

    @C0206KeepForSdk
    public static <T extends C0463SafeParcelable> void addValue(@RecentlyNonNull C0400DataHolder.Builder builder, @RecentlyNonNull T t) {
        ContentValues contentValues;
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        new ContentValues();
        contentValues.put("data", obtain.marshall());
        C0400DataHolder.Builder withRow = builder.withRow(contentValues);
        obtain.recycle();
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0400DataHolder.Builder buildDataHolder() {
        return C0400DataHolder.builder(zaa);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public T get(int i) {
        int i2 = i;
        C0400DataHolder dataHolder = (C0400DataHolder) C0446Preconditions.checkNotNull(this.mDataHolder);
        byte[] byteArray = dataHolder.getByteArray("data", i2, dataHolder.getWindowIndex(i2));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        T t = (C0463SafeParcelable) this.zab.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }
}

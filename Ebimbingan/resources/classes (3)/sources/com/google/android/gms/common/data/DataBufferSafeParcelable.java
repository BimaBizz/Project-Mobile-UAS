package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {
    private static final String[] zaa = {"data"};
    private final Parcelable.Creator<T> zab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public DataBufferSafeParcelable(@RecentlyNonNull DataHolder dataHolder, @RecentlyNonNull Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zab = creator;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void addValue(@RecentlyNonNull DataHolder.Builder builder, @RecentlyNonNull T t) {
        ContentValues contentValues;
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        new ContentValues();
        contentValues.put("data", obtain.marshall());
        DataHolder.Builder withRow = builder.withRow(contentValues);
        obtain.recycle();
    }

    @RecentlyNonNull
    @KeepForSdk
    public static DataHolder.Builder buildDataHolder() {
        return DataHolder.builder(zaa);
    }

    @RecentlyNonNull
    @KeepForSdk
    public T get(int i) {
        int i2 = i;
        DataHolder dataHolder = (DataHolder) Preconditions.checkNotNull(this.mDataHolder);
        byte[] byteArray = dataHolder.getByteArray("data", i2, dataHolder.getWindowIndex(i2));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) this.zab.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }
}

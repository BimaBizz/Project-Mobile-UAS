package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class DataBufferRef {
    @RecentlyNonNull
    @KeepForSdk
    protected final DataHolder mDataHolder;
    @KeepForSdk
    protected int mDataRow;
    private int zaa;

    @KeepForSdk
    public DataBufferRef(@RecentlyNonNull DataHolder dataHolder, int i) {
        this.mDataHolder = (DataHolder) Preconditions.checkNotNull(dataHolder);
        zaa(i);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void copyToBuffer(@RecentlyNonNull String str, @RecentlyNonNull CharArrayBuffer charArrayBuffer) {
        this.mDataHolder.zad(str, this.mDataRow, this.zaa, charArrayBuffer);
    }

    @KeepForSdk
    public boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof DataBufferRef)) {
            return false;
        }
        DataBufferRef dataBufferRef = (DataBufferRef) obj2;
        return Objects.equal(Integer.valueOf(dataBufferRef.mDataRow), Integer.valueOf(this.mDataRow)) && Objects.equal(Integer.valueOf(dataBufferRef.zaa), Integer.valueOf(this.zaa)) && dataBufferRef.mDataHolder == this.mDataHolder;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public boolean getBoolean(@RecentlyNonNull String str) {
        return this.mDataHolder.getBoolean(str, this.mDataRow, this.zaa);
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @KeepForSdk
    public byte[] getByteArray(@RecentlyNonNull String str) {
        return this.mDataHolder.getByteArray(str, this.mDataRow, this.zaa);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public int getDataRow() {
        return this.mDataRow;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public double getDouble(@RecentlyNonNull String str) {
        return this.mDataHolder.zac(str, this.mDataRow, this.zaa);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public float getFloat(@RecentlyNonNull String str) {
        return this.mDataHolder.zab(str, this.mDataRow, this.zaa);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public int getInteger(@RecentlyNonNull String str) {
        return this.mDataHolder.getInteger(str, this.mDataRow, this.zaa);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public long getLong(@RecentlyNonNull String str) {
        return this.mDataHolder.getLong(str, this.mDataRow, this.zaa);
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @KeepForSdk
    public String getString(@RecentlyNonNull String str) {
        return this.mDataHolder.getString(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public boolean hasColumn(@RecentlyNonNull String str) {
        return this.mDataHolder.hasColumn(str);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public boolean hasNull(@RecentlyNonNull String str) {
        return this.mDataHolder.hasNull(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.mDataRow), Integer.valueOf(this.zaa), this.mDataHolder);
    }

    @KeepForSdk
    public boolean isDataValid() {
        return !this.mDataHolder.isClosed();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @RecentlyNullable
    public Uri parseUri(@RecentlyNonNull String str) {
        String string = this.mDataHolder.getString(str, this.mDataRow, this.zaa);
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    /* access modifiers changed from: protected */
    public final void zaa(int i) {
        boolean z;
        int i2 = i;
        if (i2 >= 0) {
            z = i2 < this.mDataHolder.getCount();
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        this.mDataRow = i2;
        this.zaa = this.mDataHolder.getWindowIndex(i2);
    }
}

package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;
import java.util.ArrayList;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.data.EntityBuffer */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0401EntityBuffer<T> extends C0391AbstractDataBuffer<T> {
    private boolean zaa = false;
    private ArrayList<Integer> zab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    protected C0401EntityBuffer(@RecentlyNonNull C0400DataHolder dataHolder) {
        super(dataHolder);
    }

    /* JADX INFO: finally extract failed */
    private final void zab() {
        ArrayList<Integer> arrayList;
        Throwable th;
        StringBuilder sb;
        synchronized (this) {
            try {
                if (!this.zaa) {
                    int count = ((C0400DataHolder) C0446Preconditions.checkNotNull(this.mDataHolder)).getCount();
                    new ArrayList();
                    this.zab = arrayList;
                    if (count > 0) {
                        boolean add = this.zab.add(0);
                        String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                        String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                        for (int i = 1; i < count; i++) {
                            int windowIndex = this.mDataHolder.getWindowIndex(i);
                            String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i, windowIndex);
                            if (string2 == null) {
                                new StringBuilder(String.valueOf(primaryDataMarkerColumn).length() + 78);
                                StringBuilder append = sb.append("Missing value for markerColumn: ");
                                StringBuilder append2 = sb.append(primaryDataMarkerColumn);
                                StringBuilder append3 = sb.append(", at row: ");
                                StringBuilder append4 = sb.append(i);
                                StringBuilder append5 = sb.append(", for window: ");
                                StringBuilder append6 = sb.append(windowIndex);
                                new NullPointerException(sb.toString());
                                throw th;
                            }
                            if (!string2.equals(string)) {
                                boolean add2 = this.zab.add(Integer.valueOf(i));
                                string = string2;
                            }
                        }
                    }
                    this.zaa = true;
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                throw th3;
            }
        }
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public final T get(int i) {
        int i2;
        int intValue;
        int i3 = i;
        zab();
        int zaa2 = zaa(i3);
        if (i3 < 0) {
            i2 = 0;
        } else if (i3 == this.zab.size()) {
            i2 = 0;
        } else {
            if (i3 == this.zab.size() - 1) {
                intValue = ((C0400DataHolder) C0446Preconditions.checkNotNull(this.mDataHolder)).getCount() - this.zab.get(i3).intValue();
            } else {
                intValue = this.zab.get(i3 + 1).intValue() - this.zab.get(i3).intValue();
            }
            if (intValue == 1) {
                int zaa3 = zaa(i3);
                int windowIndex = ((C0400DataHolder) C0446Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(zaa3);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                i2 = childDataMarkerColumn != null ? this.mDataHolder.getString(childDataMarkerColumn, zaa3, windowIndex) == null ? 0 : 1 : 1;
            } else {
                i2 = intValue;
            }
        }
        return getEntry(zaa2, i2);
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    @RecentlyNullable
    public String getChildDataMarkerColumn() {
        return null;
    }

    @C0206KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @C0206KeepForSdk
    public abstract T getEntry(int i, int i2);

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @C0206KeepForSdk
    public abstract String getPrimaryDataMarkerColumn();

    /* access modifiers changed from: package-private */
    public final int zaa(int i) {
        Throwable th;
        StringBuilder sb;
        int i2 = i;
        if (i2 >= 0 && i2 < this.zab.size()) {
            return this.zab.get(i2).intValue();
        }
        new StringBuilder(53);
        StringBuilder append = sb.append("Position ");
        StringBuilder append2 = sb.append(i2);
        StringBuilder append3 = sb.append(" is out of bounds for this buffer");
        new IllegalArgumentException(sb.toString());
        throw th;
    }
}

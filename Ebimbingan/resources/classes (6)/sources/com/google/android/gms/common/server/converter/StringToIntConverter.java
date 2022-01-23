package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@SafeParcelable.Class(creator = "StringToIntConverterCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    @RecentlyNonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    private final HashMap<String, Integer> zab;
    private final SparseArray<String> zac;

    static {
        Parcelable.Creator<StringToIntConverter> creator;
        new zad();
        CREATOR = creator;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StringToIntConverter() {
        /*
            r4 = this;
            r0 = r4
            r2 = r0
            r2.<init>()
            r2 = r0
            r3 = 1
            r2.zaa = r3
            java.util.HashMap r2 = new java.util.HashMap
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zab = r3
            android.util.SparseArray r2 = new android.util.SparseArray
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zac = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.converter.StringToIntConverter.<init>():void");
    }

    @RecentlyNonNull
    @KeepForSdk
    public StringToIntConverter add(@RecentlyNonNull String str, int i) {
        String str2 = str;
        int i2 = i;
        Integer put = this.zab.put(str2, Integer.valueOf(i2));
        this.zac.put(i2, str2);
        return this;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        ArrayList arrayList;
        Object obj;
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        new ArrayList();
        for (String next : this.zab.keySet()) {
            new zac(next, this.zab.get(next).intValue());
            boolean add = arrayList.add(obj);
        }
        SafeParcelWriter.writeTypedList(parcel2, 2, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final int zaa() {
        return 7;
    }

    public final int zab() {
        return 0;
    }

    @RecentlyNonNull
    public final /* bridge */ /* synthetic */ Object zac(@RecentlyNonNull Object obj) {
        String str = this.zac.get(((Integer) obj).intValue());
        return (str != null || !this.zab.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    @RecentlyNullable
    public final /* bridge */ /* synthetic */ Object zad(@RecentlyNonNull Object obj) {
        Integer num = this.zab.get((String) obj);
        return num == null ? this.zab.get("gms_unknown") : num;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    StringToIntConverter(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.ArrayList<com.google.android.gms.common.server.converter.zac> r10) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r0
            r5.<init>()
            r5 = r0
            r6 = r1
            r5.zaa = r6
            java.util.HashMap r5 = new java.util.HashMap
            r1 = r5
            r5 = r1
            r5.<init>()
            r5 = r0
            r6 = r1
            r5.zab = r6
            android.util.SparseArray r5 = new android.util.SparseArray
            r1 = r5
            r5 = r1
            r5.<init>()
            r5 = r0
            r6 = r1
            r5.zac = r6
            r5 = r2
            int r5 = r5.size()
            r3 = r5
            r5 = 0
            r1 = r5
        L_0x0029:
            r5 = r1
            r6 = r3
            if (r5 >= r6) goto L_0x0044
            r5 = r2
            r6 = r1
            java.lang.Object r5 = r5.get(r6)
            com.google.android.gms.common.server.converter.zac r5 = (com.google.android.gms.common.server.converter.zac) r5
            r4 = r5
            r5 = r0
            r6 = r4
            java.lang.String r6 = r6.zab
            r7 = r4
            int r7 = r7.zac
            com.google.android.gms.common.server.converter.StringToIntConverter r5 = r5.add(r6, r7)
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.converter.StringToIntConverter.<init>(int, java.util.ArrayList):void");
    }
}

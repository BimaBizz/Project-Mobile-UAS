package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> zab;
    @SafeParcelable.Field(getter = "getRootClassName", id = 3)
    private final String zac;

    static {
        Parcelable.Creator<zan> creator;
        new zao();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    zan(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zal> arrayList, @SafeParcelable.Param(id = 3) String str) {
        HashMap hashMap;
        HashMap hashMap2;
        ArrayList<zal> arrayList2 = arrayList;
        String str2 = str;
        this.zaa = i;
        new HashMap<>();
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = arrayList2.get(i2);
            String str3 = zal.zab;
            new HashMap();
            int size2 = ((ArrayList) Preconditions.checkNotNull(zal.zac)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = zal.zac.get(i3);
                Object put = hashMap2.put(zam.zab, zam.zac);
            }
            Object put2 = hashMap.put(str3, hashMap2);
        }
        this.zab = hashMap;
        this.zac = (String) Preconditions.checkNotNull(str2);
        zaa();
    }

    public final String toString() {
        StringBuilder sb;
        new StringBuilder();
        for (String next : this.zab.keySet()) {
            StringBuilder append = sb.append(next);
            StringBuilder append2 = sb.append(":\n");
            Map map = this.zab.get(next);
            for (String str : map.keySet()) {
                StringBuilder append3 = sb.append("  ");
                StringBuilder append4 = sb.append(str);
                StringBuilder append5 = sb.append(": ");
                StringBuilder append6 = sb.append(map.get(str));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList;
        Object obj;
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        new ArrayList();
        for (String next : this.zab.keySet()) {
            new zal(next, this.zab.get(next));
            boolean add = arrayList.add(obj);
        }
        SafeParcelWriter.writeTypedList(parcel2, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zac, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final void zaa() {
        for (String str : this.zab.keySet()) {
            Map map = this.zab.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).zad(this);
            }
        }
    }

    public final void zab() {
        HashMap hashMap;
        for (String next : this.zab.keySet()) {
            Map map = this.zab.get(next);
            new HashMap();
            for (String str : map.keySet()) {
                Object put = hashMap.put(str, ((FastJsonResponse.Field) map.get(str)).zaa());
            }
            Map<String, FastJsonResponse.Field<?, ?>> put2 = this.zab.put(next, hashMap);
        }
    }

    public final void zac(Class<? extends FastJsonResponse> cls, Map<String, FastJsonResponse.Field<?, ?>> map) {
        Map<String, FastJsonResponse.Field<?, ?>> put = this.zab.put((String) Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    @Nullable
    public final Map<String, FastJsonResponse.Field<?, ?>> zad(String str) {
        return this.zab.get(str);
    }

    public final boolean zae(Class<? extends FastJsonResponse> cls) {
        return this.zab.containsKey(Preconditions.checkNotNull(cls.getCanonicalName()));
    }

    public final String zaf() {
        return this.zac;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zan(java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r3 = r0
            r3.<init>()
            r3 = r0
            r4 = 1
            r3.zaa = r4
            java.util.HashMap r3 = new java.util.HashMap
            r2 = r3
            r3 = r2
            r3.<init>()
            r3 = r0
            r4 = r2
            r3.zab = r4
            r3 = r0
            r4 = r1
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String r4 = (java.lang.String) r4
            r3.zac = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.zan.<init>(java.lang.Class):void");
    }
}

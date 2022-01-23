package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.server.response.C0557FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@C0452ShowFirstParty
@C0463SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
/* renamed from: com.google.android.gms.common.server.response.zan */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0574zan extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0574zan> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    private final HashMap<String, Map<String, C0557FastJsonResponse.Field<?, ?>>> zab;
    @C0463SafeParcelable.Field(getter = "getRootClassName", id = 3)
    private final String zac;

    static {
        Parcelable.Creator<C0574zan> creator;
        new C0575zao();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0574zan(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) ArrayList<C0572zal> arrayList, @C0463SafeParcelable.Param(id = 3) String str) {
        HashMap hashMap;
        HashMap hashMap2;
        ArrayList<C0572zal> arrayList2 = arrayList;
        String str2 = str;
        this.zaa = i;
        new HashMap<>();
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0572zal zal = arrayList2.get(i2);
            String str3 = zal.zab;
            new HashMap();
            int size2 = ((ArrayList) C0446Preconditions.checkNotNull(zal.zac)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                C0573zam zam = zal.zac.get(i3);
                Object put = hashMap2.put(zam.zab, zam.zac);
            }
            Object put2 = hashMap.put(str3, hashMap2);
        }
        this.zab = hashMap;
        this.zac = (String) C0446Preconditions.checkNotNull(str2);
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
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        new ArrayList();
        for (String next : this.zab.keySet()) {
            new C0572zal(next, this.zab.get(next));
            boolean add = arrayList.add(obj);
        }
        C0462SafeParcelWriter.writeTypedList(parcel2, 2, arrayList, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zac, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final void zaa() {
        for (String str : this.zab.keySet()) {
            Map map = this.zab.get(str);
            for (String str2 : map.keySet()) {
                ((C0557FastJsonResponse.Field) map.get(str2)).zad(this);
            }
        }
    }

    public final void zab() {
        HashMap hashMap;
        for (String next : this.zab.keySet()) {
            Map map = this.zab.get(next);
            new HashMap();
            for (String str : map.keySet()) {
                Object put = hashMap.put(str, ((C0557FastJsonResponse.Field) map.get(str)).zaa());
            }
            Map<String, C0557FastJsonResponse.Field<?, ?>> put2 = this.zab.put(next, hashMap);
        }
    }

    public final void zac(Class<? extends C0557FastJsonResponse> cls, Map<String, C0557FastJsonResponse.Field<?, ?>> map) {
        Map<String, C0557FastJsonResponse.Field<?, ?>> put = this.zab.put((String) C0446Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    @Nullable
    public final Map<String, C0557FastJsonResponse.Field<?, ?>> zad(String str) {
        return this.zab.get(str);
    }

    public final boolean zae(Class<? extends C0557FastJsonResponse> cls) {
        return this.zab.containsKey(C0446Preconditions.checkNotNull(cls.getCanonicalName()));
    }

    public final String zaf() {
        return this.zac;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0574zan(java.lang.Class<? extends com.google.android.gms.common.server.response.C0557FastJsonResponse> r6) {
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
            java.lang.Object r4 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r4)
            java.lang.String r4 = (java.lang.String) r4
            r3.zac = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0574zan.<init>(java.lang.Class):void");
    }
}

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.server.response.C0557FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

@C0452ShowFirstParty
@C0463SafeParcelable.Class(creator = "FieldMappingDictionaryEntryCreator")
/* renamed from: com.google.android.gms.common.server.response.zal */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0572zal extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0572zal> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @C0463SafeParcelable.Field(id = 2)
    final String zab;
    @C0463SafeParcelable.Field(id = 3)
    @Nullable
    final ArrayList<C0573zam> zac;

    static {
        Parcelable.Creator<C0572zal> creator;
        new C0576zap();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0572zal(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) ArrayList<C0573zam> arrayList) {
        this.zaa = i;
        this.zab = str;
        this.zac = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zab, false);
        C0462SafeParcelWriter.writeTypedList(parcel2, 3, this.zac, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    C0572zal(String str, Map<String, C0557FastJsonResponse.Field<?, ?>> map) {
        ArrayList arrayList;
        Object obj;
        Map<String, C0557FastJsonResponse.Field<?, ?>> map2 = map;
        this.zaa = 1;
        this.zab = str;
        if (map2 == null) {
            arrayList = null;
        } else {
            new ArrayList();
            for (String next : map2.keySet()) {
                new C0573zam(next, map2.get(next));
                boolean add = arrayList.add(obj);
            }
        }
        this.zac = arrayList;
    }
}

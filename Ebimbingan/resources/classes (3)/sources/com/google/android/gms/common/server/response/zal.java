package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryEntryCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    @SafeParcelable.Field(id = 2)
    final String zab;
    @SafeParcelable.Field(id = 3)
    @Nullable
    final ArrayList<zam> zac;

    static {
        Parcelable.Creator<zal> creator;
        new zap();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    zal(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) ArrayList<zam> arrayList) {
        this.zaa = i;
        this.zab = str;
        this.zac = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeString(parcel2, 2, this.zab, false);
        SafeParcelWriter.writeTypedList(parcel2, 3, this.zac, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList arrayList;
        Object obj;
        Map<String, FastJsonResponse.Field<?, ?>> map2 = map;
        this.zaa = 1;
        this.zab = str;
        if (map2 == null) {
            arrayList = null;
        } else {
            new ArrayList();
            for (String next : map2.keySet()) {
                new zam(next, map2.get(next));
                boolean add = arrayList.add(obj);
            }
        }
        this.zac = arrayList;
    }
}

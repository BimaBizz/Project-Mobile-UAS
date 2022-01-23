package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzcc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class(creator = "AccountTransferMsgCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzl extends zzcc {
    public static final Parcelable.Creator<zzl> CREATOR;
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> zza;
    @SafeParcelable.Indicator
    private final Set<Integer> zzb;
    @SafeParcelable.VersionField(id = 1)
    private final int zzc;
    @SafeParcelable.Field(getter = "getAuthenticatorDatas", id = 2)
    private ArrayList<zzs> zzd;
    @SafeParcelable.Field(getter = "getRequestType", id = 3)
    private int zze;
    @SafeParcelable.Field(getter = "getProgress", id = 4)
    private zzp zzf;

    @SafeParcelable.Constructor
    zzl(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zzs> arrayList, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) zzp zzp) {
        this.zzb = set;
        this.zzc = i;
        this.zzd = arrayList;
        this.zze = i2;
        this.zzf = zzp;
    }

    public zzl() {
        Set<Integer> set;
        new HashSet(1);
        this.zzb = set;
        this.zzc = 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        Set<Integer> set = this.zzb;
        Set<Integer> set2 = set;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel2, 1, this.zzc);
        }
        if (set2.contains(2)) {
            SafeParcelWriter.writeTypedList(parcel2, 2, this.zzd, true);
        }
        if (set2.contains(3)) {
            SafeParcelWriter.writeInt(parcel2, 3, this.zze);
        }
        if (set2.contains(4)) {
            SafeParcelWriter.writeParcelable(parcel2, 4, this.zzf, i2, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* access modifiers changed from: protected */
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.zzb.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    /* access modifiers changed from: protected */
    public final Object getFieldValue(FastJsonResponse.Field field) {
        Throwable th;
        StringBuilder sb;
        FastJsonResponse.Field field2 = field;
        switch (field2.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zzc);
            case 2:
                return this.zzd;
            case 4:
                return this.zzf;
            default:
                Throwable th2 = th;
                int safeParcelableFieldId = field2.getSafeParcelableFieldId();
                new StringBuilder(37);
                new IllegalStateException(sb.append("Unknown SafeParcelable id=").append(safeParcelableFieldId).toString());
                throw th2;
        }
    }

    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<T> arrayList) {
        Throwable th;
        String str2 = str;
        ArrayList<T> arrayList2 = arrayList;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        int i = safeParcelableFieldId;
        switch (safeParcelableFieldId) {
            case 2:
                this.zzd = arrayList2;
                boolean add = this.zzb.add(Integer.valueOf(i));
                return;
            default:
                Throwable th2 = th;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i);
                Object[] objArr2 = objArr;
                objArr2[1] = arrayList2.getClass().getCanonicalName();
                new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", objArr2));
                throw th2;
        }
    }

    public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> field, String str, T t) {
        Throwable th;
        String str2 = str;
        T t2 = t;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        int i = safeParcelableFieldId;
        switch (safeParcelableFieldId) {
            case 4:
                this.zzf = (zzp) t2;
                boolean add = this.zzb.add(Integer.valueOf(i));
                return;
            default:
                Throwable th2 = th;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i);
                Object[] objArr2 = objArr;
                objArr2[1] = t2.getClass().getCanonicalName();
                new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", objArr2));
                throw th2;
        }
    }

    public final /* synthetic */ Map getFieldMappings() {
        return zza;
    }

    static {
        Parcelable.Creator<zzl> creator;
        HashMap hashMap;
        new zzn();
        CREATOR = creator;
        new HashMap();
        HashMap hashMap2 = hashMap;
        zza = hashMap2;
        Object put = hashMap2.put("authenticatorData", FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, zzs.class));
        FastJsonResponse.Field<?, ?> put2 = zza.put("progress", FastJsonResponse.Field.forConcreteType("progress", 4, zzp.class));
    }
}

package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzcc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class zzp extends zzcc {
    public static final Parcelable.Creator<zzp> CREATOR;
    private static final ArrayMap<String, FastJsonResponse.Field<?, ?>> zza;
    @SafeParcelable.VersionField(id = 1)
    private final int zzb;
    @SafeParcelable.Field(getter = "getRegisteredAccountTypes", id = 2)
    private List<String> zzc;
    @SafeParcelable.Field(getter = "getInProgressAccountTypes", id = 3)
    private List<String> zzd;
    @SafeParcelable.Field(getter = "getSuccessAccountTypes", id = 4)
    private List<String> zze;
    @SafeParcelable.Field(getter = "getFailedAccountTypes", id = 5)
    private List<String> zzf;
    @SafeParcelable.Field(getter = "getEscrowedAccountTypes", id = 6)
    private List<String> zzg;

    public zzp() {
        this.zzb = 1;
    }

    @SafeParcelable.Constructor
    zzp(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) @Nullable List<String> list, @SafeParcelable.Param(id = 3) @Nullable List<String> list2, @SafeParcelable.Param(id = 4) @Nullable List<String> list3, @SafeParcelable.Param(id = 5) @Nullable List<String> list4, @SafeParcelable.Param(id = 6) @Nullable List<String> list5) {
        this.zzb = i;
        this.zzc = list;
        this.zzd = list2;
        this.zze = list3;
        this.zzf = list4;
        this.zzg = list5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zzb);
        SafeParcelWriter.writeStringList(parcel2, 2, this.zzc, false);
        SafeParcelWriter.writeStringList(parcel2, 3, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel2, 4, this.zze, false);
        SafeParcelWriter.writeStringList(parcel2, 5, this.zzf, false);
        SafeParcelWriter.writeStringList(parcel2, 6, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        return zza;
    }

    /* access modifiers changed from: protected */
    public boolean isFieldSet(FastJsonResponse.Field field) {
        FastJsonResponse.Field field2 = field;
        return true;
    }

    /* access modifiers changed from: protected */
    public Object getFieldValue(FastJsonResponse.Field field) {
        Throwable th;
        StringBuilder sb;
        FastJsonResponse.Field field2 = field;
        switch (field2.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zzb);
            case 2:
                return this.zzc;
            case 3:
                return this.zzd;
            case 4:
                return this.zze;
            case 5:
                return this.zzf;
            case 6:
                return this.zzg;
            default:
                Throwable th2 = th;
                int safeParcelableFieldId = field2.getSafeParcelableFieldId();
                new StringBuilder(37);
                new IllegalStateException(sb.append("Unknown SafeParcelable id=").append(safeParcelableFieldId).toString());
                throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        Throwable th;
        String str2 = str;
        ArrayList<String> arrayList2 = arrayList;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        int i = safeParcelableFieldId;
        switch (safeParcelableFieldId) {
            case 2:
                this.zzc = arrayList2;
                return;
            case 3:
                this.zzd = arrayList2;
                return;
            case 4:
                this.zze = arrayList2;
                return;
            case 5:
                this.zzf = arrayList2;
                return;
            case 6:
                this.zzg = arrayList2;
                return;
            default:
                Throwable th2 = th;
                new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(i)}));
                throw th2;
        }
    }

    static {
        Parcelable.Creator<zzp> creator;
        ArrayMap arrayMap;
        new zzo();
        CREATOR = creator;
        new ArrayMap();
        ArrayMap arrayMap2 = arrayMap;
        zza = arrayMap2;
        Object put = arrayMap2.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        Object put2 = zza.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        Object put3 = zza.put("success", FastJsonResponse.Field.forStrings("success", 4));
        Object put4 = zza.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
        Object put5 = zza.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }
}

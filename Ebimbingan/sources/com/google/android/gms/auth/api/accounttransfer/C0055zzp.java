package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.server.response.C0557FastJsonResponse;
import com.google.android.gms.internal.auth.C0833zzcc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@C0463SafeParcelable.Class(creator = "AccountTransferProgressCreator")
/* renamed from: com.google.android.gms.auth.api.accounttransfer.zzp */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0055zzp extends C0833zzcc {
    public static final Parcelable.Creator<C0055zzp> CREATOR;
    private static final ArrayMap<String, C0557FastJsonResponse.Field<?, ?>> zza;
    @C0463SafeParcelable.VersionField(id = 1)
    private final int zzb;
    @C0463SafeParcelable.Field(getter = "getRegisteredAccountTypes", id = 2)
    private List<String> zzc;
    @C0463SafeParcelable.Field(getter = "getInProgressAccountTypes", id = 3)
    private List<String> zzd;
    @C0463SafeParcelable.Field(getter = "getSuccessAccountTypes", id = 4)
    private List<String> zze;
    @C0463SafeParcelable.Field(getter = "getFailedAccountTypes", id = 5)
    private List<String> zzf;
    @C0463SafeParcelable.Field(getter = "getEscrowedAccountTypes", id = 6)
    private List<String> zzg;

    public C0055zzp() {
        this.zzb = 1;
    }

    @C0463SafeParcelable.Constructor
    C0055zzp(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) @Nullable List<String> list, @C0463SafeParcelable.Param(id = 3) @Nullable List<String> list2, @C0463SafeParcelable.Param(id = 4) @Nullable List<String> list3, @C0463SafeParcelable.Param(id = 5) @Nullable List<String> list4, @C0463SafeParcelable.Param(id = 6) @Nullable List<String> list5) {
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
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zzb);
        C0462SafeParcelWriter.writeStringList(parcel2, 2, this.zzc, false);
        C0462SafeParcelWriter.writeStringList(parcel2, 3, this.zzd, false);
        C0462SafeParcelWriter.writeStringList(parcel2, 4, this.zze, false);
        C0462SafeParcelWriter.writeStringList(parcel2, 5, this.zzf, false);
        C0462SafeParcelWriter.writeStringList(parcel2, 6, this.zzg, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public Map<String, C0557FastJsonResponse.Field<?, ?>> getFieldMappings() {
        return zza;
    }

    /* access modifiers changed from: protected */
    public boolean isFieldSet(C0557FastJsonResponse.Field field) {
        C0557FastJsonResponse.Field field2 = field;
        return true;
    }

    /* access modifiers changed from: protected */
    public Object getFieldValue(C0557FastJsonResponse.Field field) {
        Throwable th;
        StringBuilder sb;
        C0557FastJsonResponse.Field field2 = field;
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
    public void setStringsInternal(C0557FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
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
        Parcelable.Creator<C0055zzp> creator;
        ArrayMap arrayMap;
        new C0054zzo();
        CREATOR = creator;
        new ArrayMap();
        ArrayMap arrayMap2 = arrayMap;
        zza = arrayMap2;
        Object put = arrayMap2.put("registered", C0557FastJsonResponse.Field.forStrings("registered", 2));
        C0557FastJsonResponse.Field<?, ?> put2 = zza.put("in_progress", C0557FastJsonResponse.Field.forStrings("in_progress", 3));
        C0557FastJsonResponse.Field<?, ?> put3 = zza.put("success", C0557FastJsonResponse.Field.forStrings("success", 4));
        C0557FastJsonResponse.Field<?, ?> put4 = zza.put("failed", C0557FastJsonResponse.Field.forStrings("failed", 5));
        C0557FastJsonResponse.Field<?, ?> put5 = zza.put("escrowed", C0557FastJsonResponse.Field.forStrings("escrowed", 6));
    }
}

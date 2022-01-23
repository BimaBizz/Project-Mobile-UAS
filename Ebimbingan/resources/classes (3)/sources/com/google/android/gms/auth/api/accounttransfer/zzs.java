package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzcc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class(creator = "AuthenticatorAnnotatedDataCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class zzs extends zzcc {
    public static final Parcelable.Creator<zzs> CREATOR;
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> zza;
    @SafeParcelable.Indicator
    private final Set<Integer> zzb;
    @SafeParcelable.VersionField(id = 1)
    private final int zzc;
    @SafeParcelable.Field(getter = "getInfo", id = 2)
    private zzt zzd;
    @SafeParcelable.Field(getter = "getSignature", id = 3)
    private String zze;
    @SafeParcelable.Field(getter = "getPackageName", id = 4)
    private String zzf;
    @SafeParcelable.Field(getter = "getId", id = 5)
    private String zzg;

    public zzs() {
        Set<Integer> set;
        new HashSet(3);
        this.zzb = set;
        this.zzc = 1;
    }

    @SafeParcelable.Constructor
    zzs(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zzt zzt, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3) {
        this.zzb = set;
        this.zzc = i;
        this.zzd = zzt;
        this.zze = str;
        this.zzf = str2;
        this.zzg = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        Set<Integer> set = this.zzb;
        Set<Integer> set2 = set;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel2, 1, this.zzc);
        }
        if (set2.contains(2)) {
            SafeParcelWriter.writeParcelable(parcel2, 2, this.zzd, i2, true);
        }
        if (set2.contains(3)) {
            SafeParcelWriter.writeString(parcel2, 3, this.zze, true);
        }
        if (set2.contains(4)) {
            SafeParcelWriter.writeString(parcel2, 4, this.zzf, true);
        }
        if (set2.contains(5)) {
            SafeParcelWriter.writeString(parcel2, 5, this.zzg, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* access modifiers changed from: protected */
    public boolean isFieldSet(FastJsonResponse.Field field) {
        return this.zzb.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    /* access modifiers changed from: protected */
    public Object getFieldValue(FastJsonResponse.Field field) {
        Throwable th;
        StringBuilder sb;
        FastJsonResponse.Field field2 = field;
        switch (field2.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zzc);
            case 2:
                return this.zzd;
            case 3:
                return this.zze;
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

    /* access modifiers changed from: protected */
    public void setStringInternal(FastJsonResponse.Field<?, ?> field, String str, String str2) {
        Throwable th;
        String str3 = str;
        String str4 = str2;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        int i = safeParcelableFieldId;
        switch (safeParcelableFieldId) {
            case 3:
                this.zze = str4;
                break;
            case 4:
                this.zzf = str4;
                break;
            default:
                Throwable th2 = th;
                new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i)}));
                throw th2;
        }
        boolean add = this.zzb.add(Integer.valueOf(i));
    }

    public <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> field, String str, T t) {
        Throwable th;
        String str2 = str;
        T t2 = t;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        int i = safeParcelableFieldId;
        switch (safeParcelableFieldId) {
            case 2:
                this.zzd = (zzt) t2;
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

    public /* synthetic */ Map getFieldMappings() {
        return zza;
    }

    static {
        Parcelable.Creator<zzs> creator;
        HashMap hashMap;
        new zzr();
        CREATOR = creator;
        new HashMap();
        HashMap hashMap2 = hashMap;
        zza = hashMap2;
        Object put = hashMap2.put("authenticatorInfo", FastJsonResponse.Field.forConcreteType("authenticatorInfo", 2, zzt.class));
        FastJsonResponse.Field<?, ?> put2 = zza.put("signature", FastJsonResponse.Field.forString("signature", 3));
        FastJsonResponse.Field<?, ?> put3 = zza.put("package", FastJsonResponse.Field.forString("package", 4));
    }
}

package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzcc;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class(creator = "AuthenticatorTransferInfoCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class zzt extends zzcc {
    public static final Parcelable.Creator<zzt> CREATOR;
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> zza;
    @SafeParcelable.Indicator
    private final Set<Integer> zzb;
    @SafeParcelable.VersionField(id = 1)
    private final int zzc;
    @SafeParcelable.Field(getter = "getAccountType", id = 2)
    private String zzd;
    @SafeParcelable.Field(getter = "getStatus", id = 3)
    private int zze;
    @SafeParcelable.Field(getter = "getTransferBytes", id = 4)
    private byte[] zzf;
    @SafeParcelable.Field(getter = "getPendingIntent", id = 5)
    private PendingIntent zzg;
    @SafeParcelable.Field(getter = "getDeviceMetaData", id = 6)
    private DeviceMetaData zzh;

    @SafeParcelable.Constructor
    zzt(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) PendingIntent pendingIntent, @SafeParcelable.Param(id = 6) DeviceMetaData deviceMetaData) {
        this.zzb = set;
        this.zzc = i;
        this.zzd = str;
        this.zze = i2;
        this.zzf = bArr;
        this.zzg = pendingIntent;
        this.zzh = deviceMetaData;
    }

    public zzt() {
        Set<Integer> set;
        new ArraySet(3);
        this.zzb = set;
        this.zzc = 1;
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
            SafeParcelWriter.writeString(parcel2, 2, this.zzd, true);
        }
        if (set2.contains(3)) {
            SafeParcelWriter.writeInt(parcel2, 3, this.zze);
        }
        if (set2.contains(4)) {
            SafeParcelWriter.writeByteArray(parcel2, 4, this.zzf, true);
        }
        if (set2.contains(5)) {
            SafeParcelWriter.writeParcelable(parcel2, 5, this.zzg, i2, true);
        }
        if (set2.contains(6)) {
            SafeParcelWriter.writeParcelable(parcel2, 6, this.zzh, i2, true);
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
                return Integer.valueOf(this.zze);
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
            case 2:
                this.zzd = str4;
                boolean add = this.zzb.add(Integer.valueOf(i));
                return;
            default:
                Throwable th2 = th;
                new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i)}));
                throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public void setIntegerInternal(FastJsonResponse.Field<?, ?> field, String str, int i) {
        Throwable th;
        StringBuilder sb;
        String str2 = str;
        int i2 = i;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        int i3 = safeParcelableFieldId;
        switch (safeParcelableFieldId) {
            case 3:
                this.zze = i2;
                boolean add = this.zzb.add(Integer.valueOf(i3));
                return;
            default:
                Throwable th2 = th;
                new StringBuilder(52);
                new IllegalArgumentException(sb.append("Field with id=").append(i3).append(" is not known to be an int.").toString());
                throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> field, String str, byte[] bArr) {
        Throwable th;
        StringBuilder sb;
        String str2 = str;
        byte[] bArr2 = bArr;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        int i = safeParcelableFieldId;
        switch (safeParcelableFieldId) {
            case 4:
                this.zzf = bArr2;
                boolean add = this.zzb.add(Integer.valueOf(i));
                return;
            default:
                Throwable th2 = th;
                new StringBuilder(59);
                new IllegalArgumentException(sb.append("Field with id=").append(i).append(" is not known to be an byte array.").toString());
                throw th2;
        }
    }

    public /* synthetic */ Map getFieldMappings() {
        return zza;
    }

    static {
        Parcelable.Creator<zzt> creator;
        HashMap hashMap;
        new zzu();
        CREATOR = creator;
        new HashMap();
        HashMap hashMap2 = hashMap;
        zza = hashMap2;
        Object put = hashMap2.put("accountType", FastJsonResponse.Field.forString("accountType", 2));
        FastJsonResponse.Field<?, ?> put2 = zza.put("status", FastJsonResponse.Field.forInteger("status", 3));
        FastJsonResponse.Field<?, ?> put3 = zza.put("transferBytes", FastJsonResponse.Field.forBase64("transferBytes", 4));
    }
}

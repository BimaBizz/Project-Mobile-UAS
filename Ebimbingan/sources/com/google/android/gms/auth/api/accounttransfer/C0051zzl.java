package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.server.response.C0557FastJsonResponse;
import com.google.android.gms.internal.auth.C0833zzcc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@C0463SafeParcelable.Class(creator = "AccountTransferMsgCreator")
/* renamed from: com.google.android.gms.auth.api.accounttransfer.zzl */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0051zzl extends C0833zzcc {
    public static final Parcelable.Creator<C0051zzl> CREATOR;
    private static final HashMap<String, C0557FastJsonResponse.Field<?, ?>> zza;
    @C0463SafeParcelable.Indicator
    private final Set<Integer> zzb;
    @C0463SafeParcelable.VersionField(id = 1)
    private final int zzc;
    @C0463SafeParcelable.Field(getter = "getAuthenticatorDatas", id = 2)
    private ArrayList<C0058zzs> zzd;
    @C0463SafeParcelable.Field(getter = "getRequestType", id = 3)
    private int zze;
    @C0463SafeParcelable.Field(getter = "getProgress", id = 4)
    private C0055zzp zzf;

    @C0463SafeParcelable.Constructor
    C0051zzl(@C0463SafeParcelable.Indicator Set<Integer> set, @C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) ArrayList<C0058zzs> arrayList, @C0463SafeParcelable.Param(id = 3) int i2, @C0463SafeParcelable.Param(id = 4) C0055zzp zzp) {
        this.zzb = set;
        this.zzc = i;
        this.zzd = arrayList;
        this.zze = i2;
        this.zzf = zzp;
    }

    public C0051zzl() {
        Set<Integer> set;
        new HashSet(1);
        this.zzb = set;
        this.zzc = 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        Set<Integer> set = this.zzb;
        Set<Integer> set2 = set;
        if (set.contains(1)) {
            C0462SafeParcelWriter.writeInt(parcel2, 1, this.zzc);
        }
        if (set2.contains(2)) {
            C0462SafeParcelWriter.writeTypedList(parcel2, 2, this.zzd, true);
        }
        if (set2.contains(3)) {
            C0462SafeParcelWriter.writeInt(parcel2, 3, this.zze);
        }
        if (set2.contains(4)) {
            C0462SafeParcelWriter.writeParcelable(parcel2, 4, this.zzf, i2, true);
        }
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* access modifiers changed from: protected */
    public final boolean isFieldSet(C0557FastJsonResponse.Field field) {
        return this.zzb.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    /* access modifiers changed from: protected */
    public final Object getFieldValue(C0557FastJsonResponse.Field field) {
        Throwable th;
        StringBuilder sb;
        C0557FastJsonResponse.Field field2 = field;
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

    public final <T extends C0557FastJsonResponse> void addConcreteTypeArrayInternal(C0557FastJsonResponse.Field<?, ?> field, String str, ArrayList<T> arrayList) {
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

    public final <T extends C0557FastJsonResponse> void addConcreteTypeInternal(C0557FastJsonResponse.Field<?, ?> field, String str, T t) {
        Throwable th;
        String str2 = str;
        T t2 = t;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        int i = safeParcelableFieldId;
        switch (safeParcelableFieldId) {
            case 4:
                this.zzf = (C0055zzp) t2;
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
        Parcelable.Creator<C0051zzl> creator;
        HashMap hashMap;
        new C0053zzn();
        CREATOR = creator;
        new HashMap();
        HashMap hashMap2 = hashMap;
        zza = hashMap2;
        Object put = hashMap2.put("authenticatorData", C0557FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, C0058zzs.class));
        C0557FastJsonResponse.Field<?, ?> put2 = zza.put(NotificationCompat.CATEGORY_PROGRESS, C0557FastJsonResponse.Field.forConcreteType(NotificationCompat.CATEGORY_PROGRESS, 4, C0055zzp.class));
    }
}

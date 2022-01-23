package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.C0208KeepForSdkWithMembers;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@C0208KeepForSdkWithMembers
@C0452ShowFirstParty
@C0463SafeParcelable.Class(creator = "ProxyResponseCreator")
/* renamed from: com.google.android.gms.auth.api.proxy.ProxyResponse */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0118ProxyResponse extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0118ProxyResponse> CREATOR;
    public static final int STATUS_CODE_NO_CONNECTION = -1;
    @C0463SafeParcelable.Field(id = 5)
    public final byte[] body;
    @C0463SafeParcelable.Field(id = 1)
    public final int googlePlayServicesStatusCode;
    @C0463SafeParcelable.Field(id = 2)
    public final PendingIntent recoveryAction;
    @C0463SafeParcelable.Field(id = 3)
    public final int statusCode;
    @C0463SafeParcelable.VersionField(id = 1000)
    private final int zza;
    @C0463SafeParcelable.Field(id = 4)
    private final Bundle zzb;

    public static C0118ProxyResponse createErrorProxyResponse(int i, PendingIntent pendingIntent, int i2, Map<String, String> map, byte[] bArr) {
        C0118ProxyResponse proxyResponse;
        new C0118ProxyResponse(1, i, pendingIntent, i2, zza(map), bArr);
        return proxyResponse;
    }

    private static Bundle zza(Map<String, String> map) {
        Bundle bundle;
        Map<String, String> map2 = map;
        new Bundle();
        Bundle bundle2 = bundle;
        if (map2 == null) {
            return bundle2;
        }
        for (Map.Entry next : map2.entrySet()) {
            bundle2.putString((String) next.getKey(), (String) next.getValue());
        }
        return bundle2;
    }

    @C0463SafeParcelable.Constructor
    C0118ProxyResponse(@C0463SafeParcelable.Param(id = 1000) int i, @C0463SafeParcelable.Param(id = 1) int i2, @C0463SafeParcelable.Param(id = 2) PendingIntent pendingIntent, @C0463SafeParcelable.Param(id = 3) int i3, @C0463SafeParcelable.Param(id = 4) Bundle bundle, @C0463SafeParcelable.Param(id = 5) byte[] bArr) {
        this.zza = i;
        this.googlePlayServicesStatusCode = i2;
        this.statusCode = i3;
        this.zzb = bundle;
        this.body = bArr;
        this.recoveryAction = pendingIntent;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0118ProxyResponse(int i, PendingIntent pendingIntent, int i2, Bundle bundle, byte[] bArr) {
        this(1, i, pendingIntent, i2, bundle, bArr);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C0118ProxyResponse(int i, Bundle bundle, byte[] bArr) {
        this(1, 0, (PendingIntent) null, i, bundle, bArr);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0118ProxyResponse(int i, Map<String, String> map, byte[] bArr) {
        this(i, zza(map), bArr);
    }

    public Map<String, String> getHeaders() {
        Map<String, String> map;
        if (this.zzb == null) {
            return Collections.emptyMap();
        }
        new HashMap();
        Map<String, String> map2 = map;
        for (String str : this.zzb.keySet()) {
            String put = map2.put(str, this.zzb.getString(str));
        }
        return map2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.googlePlayServicesStatusCode);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.recoveryAction, i, false);
        C0462SafeParcelWriter.writeInt(parcel2, 3, this.statusCode);
        C0462SafeParcelWriter.writeBundle(parcel2, 4, this.zzb, false);
        C0462SafeParcelWriter.writeByteArray(parcel2, 5, this.body, false);
        C0462SafeParcelWriter.writeInt(parcel2, 1000, this.zza);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0118ProxyResponse> creator;
        new C0120zzb();
        CREATOR = creator;
    }
}

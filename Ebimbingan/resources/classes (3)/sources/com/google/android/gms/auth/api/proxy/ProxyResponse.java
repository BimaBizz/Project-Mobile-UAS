package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@KeepForSdkWithMembers
@ShowFirstParty
@SafeParcelable.Class(creator = "ProxyResponseCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR;
    public static final int STATUS_CODE_NO_CONNECTION = -1;
    @SafeParcelable.Field(id = 5)
    public final byte[] body;
    @SafeParcelable.Field(id = 1)
    public final int googlePlayServicesStatusCode;
    @SafeParcelable.Field(id = 2)
    public final PendingIntent recoveryAction;
    @SafeParcelable.Field(id = 3)
    public final int statusCode;
    @SafeParcelable.VersionField(id = 1000)
    private final int zza;
    @SafeParcelable.Field(id = 4)
    private final Bundle zzb;

    public static ProxyResponse createErrorProxyResponse(int i, PendingIntent pendingIntent, int i2, Map<String, String> map, byte[] bArr) {
        ProxyResponse proxyResponse;
        new ProxyResponse(1, i, pendingIntent, i2, zza(map), bArr);
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

    @SafeParcelable.Constructor
    ProxyResponse(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) Bundle bundle, @SafeParcelable.Param(id = 5) byte[] bArr) {
        this.zza = i;
        this.googlePlayServicesStatusCode = i2;
        this.statusCode = i3;
        this.zzb = bundle;
        this.body = bArr;
        this.recoveryAction = pendingIntent;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProxyResponse(int i, PendingIntent pendingIntent, int i2, Bundle bundle, byte[] bArr) {
        this(1, i, pendingIntent, i2, bundle, bArr);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private ProxyResponse(int i, Bundle bundle, byte[] bArr) {
        this(1, 0, (PendingIntent) null, i, bundle, bArr);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProxyResponse(int i, Map<String, String> map, byte[] bArr) {
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
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.googlePlayServicesStatusCode);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.recoveryAction, i, false);
        SafeParcelWriter.writeInt(parcel2, 3, this.statusCode);
        SafeParcelWriter.writeBundle(parcel2, 4, this.zzb, false);
        SafeParcelWriter.writeByteArray(parcel2, 5, this.body, false);
        SafeParcelWriter.writeInt(parcel2, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<ProxyResponse> creator;
        new zzb();
        CREATOR = creator;
    }
}

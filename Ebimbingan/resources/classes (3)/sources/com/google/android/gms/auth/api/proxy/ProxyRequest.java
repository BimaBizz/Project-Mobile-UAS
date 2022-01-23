package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@KeepForSdkWithMembers
@ShowFirstParty
@SafeParcelable.Class(creator = "ProxyRequestCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR;
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int LAST_CODE = 7;
    public static final int VERSION_CODE = 2;
    @SafeParcelable.Field(id = 4)
    public final byte[] body;
    @SafeParcelable.Field(id = 2)
    public final int httpMethod;
    @SafeParcelable.Field(id = 3)
    public final long timeoutMillis;
    @SafeParcelable.Field(id = 1)
    public final String url;
    @SafeParcelable.VersionField(id = 1000)
    private final int zza;
    @SafeParcelable.Field(id = 5)
    private Bundle zzb;

    @SafeParcelable.Constructor
    ProxyRequest(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) Bundle bundle) {
        this.zza = i;
        this.url = str;
        this.httpMethod = i2;
        this.timeoutMillis = j;
        this.body = bArr;
        this.zzb = bundle;
    }

    @KeepForSdkWithMembers
    @ShowFirstParty
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public static class Builder {
        private String zza;
        private int zzb = ProxyRequest.HTTP_METHOD_GET;
        private long zzc = 3000;
        private byte[] zzd = null;
        private Bundle zze;

        public Builder(String str) {
            Bundle bundle;
            Throwable th;
            StringBuilder sb;
            String str2 = str;
            new Bundle();
            this.zze = bundle;
            String checkNotEmpty = Preconditions.checkNotEmpty(str2);
            if (Patterns.WEB_URL.matcher(str2).matches()) {
                this.zza = str2;
                return;
            }
            Throwable th2 = th;
            new StringBuilder(51 + String.valueOf(str2).length());
            new IllegalArgumentException(sb.append("The supplied url [ ").append(str2).append("] is not match Patterns.WEB_URL!").toString());
            throw th2;
        }

        public Builder setHttpMethod(int i) {
            int i2 = i;
            Preconditions.checkArgument(i2 >= 0 && i2 <= ProxyRequest.LAST_CODE, "Unrecognized http method code.");
            this.zzb = i2;
            return this;
        }

        public Builder setTimeoutMillis(long j) {
            long j2 = j;
            Preconditions.checkArgument(j2 >= 0, "The specified timeout must be non-negative.");
            this.zzc = j2;
            return this;
        }

        public Builder putHeader(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            String checkNotEmpty = Preconditions.checkNotEmpty(str3, "Header name cannot be null or empty!");
            this.zze.putString(str3, str4 == null ? "" : str4);
            return this;
        }

        public Builder setBody(byte[] bArr) {
            this.zzd = bArr;
            return this;
        }

        public ProxyRequest build() {
            ProxyRequest proxyRequest;
            if (this.zzd == null) {
                this.zzd = new byte[0];
            }
            new ProxyRequest(2, this.zza, this.zzb, this.zzc, this.zzd, this.zze);
            return proxyRequest;
        }
    }

    public Map<String, String> getHeaderMap() {
        Map map;
        new LinkedHashMap(this.zzb.size());
        Map map2 = map;
        for (String str : this.zzb.keySet()) {
            Object put = map2.put(str, this.zzb.getString(str));
        }
        return Collections.unmodifiableMap(map2);
    }

    public String toString() {
        StringBuilder sb;
        String str = this.url;
        int i = this.httpMethod;
        new StringBuilder(42 + String.valueOf(str).length());
        return sb.append("ProxyRequest[ url: ").append(str).append(", method: ").append(i).append(" ]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.url, false);
        SafeParcelWriter.writeInt(parcel2, 2, this.httpMethod);
        SafeParcelWriter.writeLong(parcel2, 3, this.timeoutMillis);
        SafeParcelWriter.writeByteArray(parcel2, 4, this.body, false);
        SafeParcelWriter.writeBundle(parcel2, 5, this.zzb, false);
        SafeParcelWriter.writeInt(parcel2, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<ProxyRequest> creator;
        new zza();
        CREATOR = creator;
    }
}

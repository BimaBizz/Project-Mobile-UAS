package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.firebase_auth.zzlg;
import com.google.firebase.auth.api.internal.zzdv;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "GetTokenResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzes extends AbstractSafeParcelable implements zzdv<zzes, zzlg.zzb> {
    public static final Parcelable.Creator<zzes> CREATOR;
    @SafeParcelable.Field(getter = "getAccessToken", id = 3)
    private String zzic;
    @SafeParcelable.Field(getter = "getRefreshToken", id = 2)
    private String zzkh;
    @SafeParcelable.Field(getter = "getExpiresIn", id = 4)
    private Long zzrv;
    @SafeParcelable.Field(getter = "getTokenType", id = 5)
    private String zzrw;
    @SafeParcelable.Field(getter = "getIssuedAt", id = 6)
    private Long zzrx;

    public zzes() {
        this.zzrx = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzes(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, Long.valueOf(System.currentTimeMillis()));
    }

    @SafeParcelable.Constructor
    zzes(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) Long l, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) Long l2) {
        this.zzkh = str;
        this.zzic = str2;
        this.zzrv = l;
        this.zzrw = str3;
        this.zzrx = l2;
    }

    public final boolean isValid() {
        return DefaultClock.getInstance().currentTimeMillis() + 300000 < this.zzrx.longValue() + (this.zzrv.longValue() * 1000);
    }

    public final void zzcm(String str) {
        String checkNotEmpty = Preconditions.checkNotEmpty(str);
        this.zzkh = checkNotEmpty;
    }

    public final String zzs() {
        return this.zzkh;
    }

    public final String getAccessToken() {
        return this.zzic;
    }

    public final long zzt() {
        if (this.zzrv == null) {
            return 0;
        }
        return this.zzrv.longValue();
    }

    @Nullable
    public final String zzeu() {
        return this.zzrw;
    }

    public final long zzev() {
        return this.zzrx.longValue();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 2, this.zzkh, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zzic, false);
        SafeParcelWriter.writeLongObject(parcel2, 4, Long.valueOf(zzt()), false);
        SafeParcelWriter.writeString(parcel2, 5, this.zzrw, false);
        SafeParcelWriter.writeLongObject(parcel2, 6, Long.valueOf(this.zzrx.longValue()), false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final zzjm<zzlg.zzb> zzee() {
        return zzlg.zzb.zzm();
    }

    public final String zzew() {
        JSONObject jSONObject;
        Throwable th;
        new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        try {
            JSONObject put = jSONObject2.put("refresh_token", this.zzkh);
            JSONObject put2 = jSONObject2.put("access_token", this.zzic);
            JSONObject put3 = jSONObject2.put("expires_in", this.zzrv);
            JSONObject put4 = jSONObject2.put("token_type", this.zzrw);
            JSONObject put5 = jSONObject2.put("issued_at", this.zzrx);
            return jSONObject2.toString();
        } catch (JSONException e) {
            JSONException jSONException = e;
            int d = Log.d("GetTokenResponse", "Failed to convert GetTokenResponse to JSON");
            Throwable th2 = th;
            new zzbl((Throwable) jSONException);
            throw th2;
        }
    }

    public static zzes zzcn(String str) {
        Throwable th;
        JSONObject jSONObject;
        zzes zzes;
        try {
            new JSONObject(str);
            JSONObject jSONObject2 = jSONObject;
            new zzes();
            zzes zzes2 = zzes;
            zzes zzes3 = zzes2;
            zzes2.zzkh = jSONObject2.optString("refresh_token", (String) null);
            zzes3.zzic = jSONObject2.optString("access_token", (String) null);
            zzes3.zzrv = Long.valueOf(jSONObject2.optLong("expires_in"));
            zzes3.zzrw = jSONObject2.optString("token_type", (String) null);
            zzes3.zzrx = Long.valueOf(jSONObject2.optLong("issued_at"));
            return zzes3;
        } catch (JSONException e) {
            JSONException jSONException = e;
            int d = Log.d("GetTokenResponse", "Failed to read GetTokenResponse from JSONObject");
            Throwable th2 = th;
            new zzbl((Throwable) jSONException);
            throw th2;
        }
    }

    public final /* synthetic */ zzdv zza(zzjc zzjc) {
        Throwable th;
        zzjc zzjc2 = zzjc;
        if (!(zzjc2 instanceof zzlg.zzb)) {
            Throwable th2 = th;
            new IllegalArgumentException("The passed proto must be an instance of GrantTokenResponse.");
            throw th2;
        }
        zzlg.zzb zzb = (zzlg.zzb) zzjc2;
        this.zzkh = Strings.emptyToNull(zzb.zzs());
        this.zzic = Strings.emptyToNull(zzb.getAccessToken());
        this.zzrv = Long.valueOf(zzb.zzt());
        this.zzrw = Strings.emptyToNull(zzb.zzeu());
        this.zzrx = Long.valueOf(System.currentTimeMillis());
        return this;
    }

    static {
        Parcelable.Creator<zzes> creator;
        new zzev();
        CREATOR = creator;
    }
}

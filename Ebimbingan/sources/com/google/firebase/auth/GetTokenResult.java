package com.google.firebase.auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.firebase.annotations.PublicApi;
import java.util.Map;
import org.jose4j.jwt.ReservedClaimNames;

@PublicApi
public class GetTokenResult {
    private String zza;
    private Map<String, Object> zzb;

    @C0206KeepForSdk
    public GetTokenResult(String str, Map<String, Object> map) {
        this.zza = str;
        this.zzb = map;
    }

    @PublicApi
    @Nullable
    public String getToken() {
        return this.zza;
    }

    @PublicApi
    public long getExpirationTimestamp() {
        return zza(ReservedClaimNames.EXPIRATION_TIME);
    }

    @PublicApi
    public long getAuthTimestamp() {
        return zza("auth_time");
    }

    @PublicApi
    public long getIssuedAtTimestamp() {
        return zza(ReservedClaimNames.ISSUED_AT);
    }

    @PublicApi
    @Nullable
    public String getSignInProvider() {
        Map map = (Map) this.zzb.get(FirebaseAuthProvider.PROVIDER_ID);
        Map map2 = map;
        if (map != null) {
            return (String) map2.get("sign_in_provider");
        }
        return null;
    }

    @PublicApi
    public Map<String, Object> getClaims() {
        return this.zzb;
    }

    private final long zza(String str) {
        Integer num = (Integer) this.zzb.get(str);
        Integer num2 = num;
        if (num == null) {
            return 0;
        }
        return num2.longValue();
    }
}

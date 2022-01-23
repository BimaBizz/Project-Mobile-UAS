package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class AvailabilityException extends Exception {
    private final ArrayMap<ApiKey<?>, ConnectionResult> zaa;

    public AvailabilityException(@RecentlyNonNull ArrayMap<ApiKey<?>, ConnectionResult> arrayMap) {
        this.zaa = arrayMap;
    }

    @NonNull
    public ConnectionResult getConnectionResult(@RecentlyNonNull GoogleApi<? extends Api.ApiOptions> googleApi) {
        boolean z;
        StringBuilder sb;
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        if (this.zaa.get(apiKey) != null) {
            z = true;
        } else {
            z = false;
        }
        String zab = apiKey.zab();
        new StringBuilder(String.valueOf(zab).length() + 58);
        StringBuilder append = sb.append("The given API (");
        StringBuilder append2 = sb.append(zab);
        StringBuilder append3 = sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    @NonNull
    public String getMessage() {
        List list;
        StringBuilder sb;
        StringBuilder sb2;
        new ArrayList();
        boolean z = true;
        for (ApiKey apiKey : this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
            z = (!connectionResult.isSuccess()) & z;
            String zab = apiKey.zab();
            String valueOf = String.valueOf(connectionResult);
            new StringBuilder(String.valueOf(zab).length() + 2 + String.valueOf(valueOf).length());
            StringBuilder append = sb2.append(zab);
            StringBuilder append2 = sb2.append(": ");
            StringBuilder append3 = sb2.append(valueOf);
            boolean add = list.add(sb2.toString());
        }
        new StringBuilder();
        if (z) {
            StringBuilder append4 = sb.append("None of the queried APIs are available. ");
        } else {
            StringBuilder append5 = sb.append("Some of the queried APIs are unavailable. ");
        }
        StringBuilder append6 = sb.append(TextUtils.join("; ", list));
        return sb.toString();
    }

    @NonNull
    public ConnectionResult getConnectionResult(@RecentlyNonNull HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        boolean z;
        StringBuilder sb;
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        if (this.zaa.get(apiKey) != null) {
            z = true;
        } else {
            z = false;
        }
        String zab = apiKey.zab();
        new StringBuilder(String.valueOf(zab).length() + 58);
        StringBuilder append = sb.append("The given API (");
        StringBuilder append2 = sb.append(zab);
        StringBuilder append3 = sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }
}

package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0241ApiKey;
import com.google.android.gms.common.internal.C0446Preconditions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.api.AvailabilityException */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0213AvailabilityException extends Exception {
    private final ArrayMap<C0241ApiKey<?>, C0184ConnectionResult> zaa;

    public C0213AvailabilityException(@RecentlyNonNull ArrayMap<C0241ApiKey<?>, C0184ConnectionResult> arrayMap) {
        this.zaa = arrayMap;
    }

    @NonNull
    public C0184ConnectionResult getConnectionResult(@RecentlyNonNull C0220GoogleApi<? extends C0211Api.ApiOptions> googleApi) {
        boolean z;
        StringBuilder sb;
        C0241ApiKey<? extends C0211Api.ApiOptions> apiKey = googleApi.getApiKey();
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
        C0446Preconditions.checkArgument(z, sb.toString());
        return (C0184ConnectionResult) C0446Preconditions.checkNotNull(this.zaa.get(apiKey));
    }

    @NonNull
    public String getMessage() {
        List list;
        StringBuilder sb;
        StringBuilder sb2;
        new ArrayList();
        boolean z = true;
        for (C0241ApiKey next : this.zaa.keySet()) {
            C0184ConnectionResult connectionResult = (C0184ConnectionResult) C0446Preconditions.checkNotNull(this.zaa.get(next));
            z = (!connectionResult.isSuccess()) & z;
            String zab = next.zab();
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
    public C0184ConnectionResult getConnectionResult(@RecentlyNonNull C0223HasApiKey<? extends C0211Api.ApiOptions> hasApiKey) {
        boolean z;
        StringBuilder sb;
        C0241ApiKey<? extends C0211Api.ApiOptions> apiKey = hasApiKey.getApiKey();
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
        C0446Preconditions.checkArgument(z, sb.toString());
        return (C0184ConnectionResult) C0446Preconditions.checkNotNull(this.zaa.get(apiKey));
    }
}

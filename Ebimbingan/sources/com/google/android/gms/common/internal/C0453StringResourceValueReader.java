package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.StringResourceValueReader */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0453StringResourceValueReader {
    private final Resources zza;
    private final String zzb = this.zza.getResourcePackageName(R.string.common_google_play_services_unknown_issue);

    public C0453StringResourceValueReader(@RecentlyNonNull Context context) {
        Context context2 = context;
        Object checkNotNull = C0446Preconditions.checkNotNull(context2);
        this.zza = context2.getResources();
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public String getString(@RecentlyNonNull String str) {
        int identifier = this.zza.getIdentifier(str, "string", this.zzb);
        if (identifier == 0) {
            return null;
        }
        return this.zza.getString(identifier);
    }
}

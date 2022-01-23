package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class GoogleServices {
    private static final Object zza;
    @GuardedBy("sLock")
    @Nullable
    private static GoogleServices zzb;
    @Nullable
    private final String zzc;
    private final Status zzd;
    private final boolean zze;
    private final boolean zzf;

    static {
        Object obj;
        new Object();
        zza = obj;
    }

    @KeepForSdk
    @VisibleForTesting
    GoogleServices(Context context) {
        boolean z;
        String str;
        Status status;
        StringResourceValueReader stringResourceValueReader;
        boolean z2;
        boolean z3;
        Context context2 = context;
        Resources resources = context2.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            if (integer != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (integer != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.zzf = z2;
            z = z3;
        } else {
            this.zzf = false;
            z = true;
        }
        this.zze = z;
        String zza2 = zzaf.zza(context2);
        if (zza2 == null) {
            new StringResourceValueReader(context2);
            str = stringResourceValueReader.getString("google_app_id");
        } else {
            str = zza2;
        }
        if (TextUtils.isEmpty(str)) {
            new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzd = status;
            this.zzc = null;
            return;
        }
        this.zzc = str;
        this.zzd = Status.RESULT_SUCCESS;
    }

    @KeepForSdk
    @VisibleForTesting
    GoogleServices(String str, boolean z) {
        boolean z2 = z;
        this.zzc = str;
        this.zzd = Status.RESULT_SUCCESS;
        this.zze = z2;
        this.zzf = !z2;
    }

    /* JADX INFO: finally extract failed */
    @KeepForSdk
    private static GoogleServices checkInitialized(String str) {
        GoogleServices googleServices;
        Throwable th;
        StringBuilder sb;
        String str2 = str;
        Object obj = zza;
        synchronized (obj) {
            try {
                if (zzb == null) {
                    new StringBuilder(String.valueOf(str2).length() + 34);
                    StringBuilder append = sb.append("Initialize must be called before ");
                    StringBuilder append2 = sb.append(str2);
                    StringBuilder append3 = sb.append(".");
                    new IllegalStateException(sb.toString());
                    throw th;
                }
                googleServices = zzb;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                Object obj2 = obj;
                throw th3;
            }
        }
        return googleServices;
    }

    @KeepForSdk
    @VisibleForTesting
    static void clearInstanceForTest() {
        Object obj = zza;
        synchronized (obj) {
            try {
                zzb = null;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    @KeepForSdk
    @RecentlyNullable
    public static String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").zzc;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static Status initialize(@RecentlyNonNull Context context) {
        Status status;
        GoogleServices googleServices;
        Context context2 = context;
        Object checkNotNull = Preconditions.checkNotNull(context2, "Context must not be null.");
        Object obj = zza;
        synchronized (obj) {
            try {
                if (zzb == null) {
                    new GoogleServices(context2);
                    zzb = googleServices;
                }
                status = zzb.zzd;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return status;
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
        GoogleServices checkInitialized = checkInitialized("isMeasurementEnabled");
        return checkInitialized.zzd.isSuccess() && checkInitialized.zze;
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").zzf;
    }

    /* access modifiers changed from: package-private */
    @KeepForSdk
    @VisibleForTesting
    public Status checkGoogleAppId(String str) {
        Status status;
        StringBuilder sb;
        String str2 = str;
        String str3 = this.zzc;
        if (str3 == null || str3.equals(str2)) {
            return Status.RESULT_SUCCESS;
        }
        String str4 = this.zzc;
        new StringBuilder(String.valueOf(str4).length() + 97);
        StringBuilder append = sb.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
        StringBuilder append2 = sb.append(str4);
        StringBuilder append3 = sb.append("'.");
        new Status(10, sb.toString());
        return status;
    }

    /* JADX INFO: finally extract failed */
    @RecentlyNonNull
    @KeepForSdk
    public static Status initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str, boolean z) {
        GoogleServices googleServices;
        String str2 = str;
        boolean z2 = z;
        Object checkNotNull = Preconditions.checkNotNull(context, "Context must not be null.");
        String checkNotEmpty = Preconditions.checkNotEmpty(str2, "App ID must be nonempty.");
        Object obj = zza;
        synchronized (obj) {
            try {
                if (zzb != null) {
                    Status checkGoogleAppId = zzb.checkGoogleAppId(str2);
                    return checkGoogleAppId;
                }
                new GoogleServices(str2, z2);
                zzb = googleServices;
                Status status = zzb.zzd;
                return status;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }
}

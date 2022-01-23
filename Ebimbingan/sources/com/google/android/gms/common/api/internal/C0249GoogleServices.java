package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0453StringResourceValueReader;
import com.google.android.gms.common.internal.C0517zzaf;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.appinventor.components.common.PropertyTypeConstants;
import javax.annotation.concurrent.GuardedBy;

@C0206KeepForSdk
@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.GoogleServices */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0249GoogleServices {
    private static final Object zza;
    @GuardedBy("sLock")
    @Nullable
    private static C0249GoogleServices zzb;
    @Nullable
    private final String zzc;
    private final C0236Status zzd;
    private final boolean zze;
    private final boolean zzf;

    static {
        Object obj;
        new Object();
        zza = obj;
    }

    @C0206KeepForSdk
    @C0617VisibleForTesting
    C0249GoogleServices(Context context) {
        boolean z;
        String str;
        C0236Status status;
        C0453StringResourceValueReader stringResourceValueReader;
        boolean z2;
        boolean z3;
        Context context2 = context;
        Resources resources = context2.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", PropertyTypeConstants.PROPERTY_TYPE_INTEGER, resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
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
        String zza2 = C0517zzaf.zza(context2);
        if (zza2 == null) {
            new C0453StringResourceValueReader(context2);
            str = stringResourceValueReader.getString("google_app_id");
        } else {
            str = zza2;
        }
        if (TextUtils.isEmpty(str)) {
            new C0236Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzd = status;
            this.zzc = null;
            return;
        }
        this.zzc = str;
        this.zzd = C0236Status.RESULT_SUCCESS;
    }

    @C0206KeepForSdk
    @C0617VisibleForTesting
    C0249GoogleServices(String str, boolean z) {
        boolean z2 = z;
        this.zzc = str;
        this.zzd = C0236Status.RESULT_SUCCESS;
        this.zze = z2;
        this.zzf = !z2;
    }

    /* JADX INFO: finally extract failed */
    @C0206KeepForSdk
    private static C0249GoogleServices checkInitialized(String str) {
        C0249GoogleServices googleServices;
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

    @C0206KeepForSdk
    @C0617VisibleForTesting
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

    @C0206KeepForSdk
    @RecentlyNullable
    public static String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").zzc;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0236Status initialize(@RecentlyNonNull Context context) {
        C0236Status status;
        C0249GoogleServices googleServices;
        Context context2 = context;
        Object checkNotNull = C0446Preconditions.checkNotNull(context2, "Context must not be null.");
        Object obj = zza;
        synchronized (obj) {
            try {
                if (zzb == null) {
                    new C0249GoogleServices(context2);
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

    @C0206KeepForSdk
    public static boolean isMeasurementEnabled() {
        C0249GoogleServices checkInitialized = checkInitialized("isMeasurementEnabled");
        return checkInitialized.zzd.isSuccess() && checkInitialized.zze;
    }

    @C0206KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").zzf;
    }

    /* access modifiers changed from: package-private */
    @C0206KeepForSdk
    @C0617VisibleForTesting
    public C0236Status checkGoogleAppId(String str) {
        C0236Status status;
        StringBuilder sb;
        String str2 = str;
        String str3 = this.zzc;
        if (str3 == null || str3.equals(str2)) {
            return C0236Status.RESULT_SUCCESS;
        }
        String str4 = this.zzc;
        new StringBuilder(String.valueOf(str4).length() + 97);
        StringBuilder append = sb.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
        StringBuilder append2 = sb.append(str4);
        StringBuilder append3 = sb.append("'.");
        new C0236Status(10, sb.toString());
        return status;
    }

    /* JADX INFO: finally extract failed */
    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0236Status initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str, boolean z) {
        C0249GoogleServices googleServices;
        String str2 = str;
        boolean z2 = z;
        Object checkNotNull = C0446Preconditions.checkNotNull(context, "Context must not be null.");
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2, "App ID must be nonempty.");
        Object obj = zza;
        synchronized (obj) {
            try {
                if (zzb != null) {
                    C0236Status checkGoogleAppId = zzb.checkGoogleAppId(str2);
                    return checkGoogleAppId;
                }
                new C0249GoogleServices(str2, z2);
                zzb = googleServices;
                C0236Status status = zzb.zzd;
                return status;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }
}

package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.microsoft.appcenter.Constants;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.auth.api.signin.internal.Storage */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0135Storage {
    private static final Lock zaa;
    @GuardedBy("sLk")
    @Nullable
    private static C0135Storage zab;
    private final Lock zac;
    @GuardedBy("mLk")
    private final SharedPreferences zad;

    static {
        Lock lock;
        new ReentrantLock();
        zaa = lock;
    }

    @C0617VisibleForTesting
    C0135Storage(Context context) {
        Lock lock;
        new ReentrantLock();
        this.zac = lock;
        this.zad = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX INFO: finally extract failed */
    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0135Storage getInstance(@RecentlyNonNull Context context) {
        C0135Storage storage;
        Context context2 = context;
        Object checkNotNull = C0446Preconditions.checkNotNull(context2);
        zaa.lock();
        try {
            if (zab == null) {
                new C0135Storage(context2.getApplicationContext());
                zab = storage;
            }
            C0135Storage storage2 = zab;
            zaa.unlock();
            return storage2;
        } catch (Throwable th) {
            Throwable th2 = th;
            zaa.unlock();
            throw th2;
        }
    }

    private static final String zae(String str, String str2) {
        StringBuilder sb;
        String str3 = str;
        String str4 = str2;
        new StringBuilder(str3.length() + 1 + String.valueOf(str4).length());
        StringBuilder append = sb.append(str3);
        StringBuilder append2 = sb.append(Constants.COMMON_SCHEMA_PREFIX_SEPARATOR);
        StringBuilder append3 = sb.append(str4);
        return sb.toString();
    }

    @C0206KeepForSdk
    public void clear() {
        this.zac.lock();
        try {
            this.zad.edit().clear().apply();
            this.zac.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zac.unlock();
            throw th2;
        }
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public C0122GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        C0122GoogleSignInAccount googleSignInAccount;
        String zab2 = zab("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(zab2)) {
            googleSignInAccount = null;
        } else {
            String zab3 = zab(zae("googleSignInAccount", zab2));
            if (zab3 != null) {
                try {
                    googleSignInAccount = C0122GoogleSignInAccount.zaa(zab3);
                } catch (JSONException e) {
                    googleSignInAccount = null;
                }
            } else {
                googleSignInAccount = null;
            }
        }
        return googleSignInAccount;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public C0125GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        C0125GoogleSignInOptions googleSignInOptions;
        String zab2 = zab("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(zab2)) {
            googleSignInOptions = null;
        } else {
            String zab3 = zab(zae("googleSignInOptions", zab2));
            if (zab3 != null) {
                try {
                    googleSignInOptions = C0125GoogleSignInOptions.zaa(zab3);
                } catch (JSONException e) {
                    googleSignInOptions = null;
                }
            } else {
                googleSignInOptions = null;
            }
        }
        return googleSignInOptions;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public String getSavedRefreshToken() {
        return zab("refreshToken");
    }

    @C0206KeepForSdk
    public void saveDefaultGoogleSignInAccount(@RecentlyNonNull C0122GoogleSignInAccount googleSignInAccount, @RecentlyNonNull C0125GoogleSignInOptions googleSignInOptions) {
        C0122GoogleSignInAccount googleSignInAccount2 = googleSignInAccount;
        C0125GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
        Object checkNotNull = C0446Preconditions.checkNotNull(googleSignInAccount2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(googleSignInOptions2);
        zaa("defaultGoogleSignInAccount", googleSignInAccount2.zac());
        Object checkNotNull3 = C0446Preconditions.checkNotNull(googleSignInAccount2);
        Object checkNotNull4 = C0446Preconditions.checkNotNull(googleSignInOptions2);
        String zac2 = googleSignInAccount2.zac();
        zaa(zae("googleSignInAccount", zac2), googleSignInAccount2.zad());
        zaa(zae("googleSignInOptions", zac2), googleSignInOptions2.zab());
    }

    /* access modifiers changed from: protected */
    public final void zaa(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        String str3 = str;
        String str4 = str2;
        this.zac.lock();
        try {
            this.zad.edit().putString(str3, str4).apply();
            this.zac.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zac.unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    @RecentlyNullable
    public final String zab(@RecentlyNonNull String str) {
        String str2 = str;
        this.zac.lock();
        try {
            String string = this.zad.getString(str2, (String) null);
            this.zac.unlock();
            return string;
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zac.unlock();
            throw th2;
        }
    }

    public final void zac() {
        String zab2 = zab("defaultGoogleSignInAccount");
        zad("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(zab2)) {
            zad(zae("googleSignInAccount", zab2));
            zad(zae("googleSignInOptions", zab2));
        }
    }

    /* access modifiers changed from: protected */
    public final void zad(@RecentlyNonNull String str) {
        String str2 = str;
        this.zac.lock();
        try {
            this.zad.edit().remove(str2).apply();
            this.zac.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zac.unlock();
            throw th2;
        }
    }
}

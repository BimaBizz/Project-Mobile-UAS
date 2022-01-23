package com.google.android.gms.auth;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.C0196GooglePlayServicesUtil;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: com.google.android.gms.auth.GoogleAuthUtil */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0016GoogleAuthUtil extends C0175zzg {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";
    @C0452ShowFirstParty
    private static final String zzc = C0175zzg.zza;
    @C0452ShowFirstParty
    private static final String zzd = C0175zzg.zzb;

    @Deprecated
    public static String getTokenWithNotification(Context context, String str, String str2, Bundle bundle) throws IOException, C0020UserRecoverableNotifiedException, C0015GoogleAuthException {
        Account account;
        new Account(str, "com.google");
        return getTokenWithNotification(context, account, str2, bundle);
    }

    @Deprecated
    public static String getTokenWithNotification(Context context, String str, String str2, Bundle bundle, Intent intent) throws IOException, C0020UserRecoverableNotifiedException, C0015GoogleAuthException {
        Account account;
        new Account(str, "com.google");
        return getTokenWithNotification(context, account, str2, bundle, intent);
    }

    @Deprecated
    public static String getTokenWithNotification(Context context, String str, String str2, Bundle bundle, String str3, Bundle bundle2) throws IOException, C0020UserRecoverableNotifiedException, C0015GoogleAuthException {
        Account account;
        new Account(str, "com.google");
        return getTokenWithNotification(context, account, str2, bundle, str3, bundle2);
    }

    public static String getTokenWithNotification(Context context, Account account, String str, Bundle bundle) throws IOException, C0020UserRecoverableNotifiedException, C0015GoogleAuthException {
        Bundle bundle2;
        Bundle bundle3 = bundle;
        String str2 = str;
        Account account2 = account;
        Context context2 = context;
        if (bundle3 == null) {
            new Bundle();
            bundle3 = bundle2;
        }
        bundle3.putBoolean("handle_notification", true);
        return zzb(context2, account2, str2, bundle3).zza();
    }

    public static String getTokenWithNotification(Context context, Account account, String str, Bundle bundle, Intent intent) throws IOException, C0020UserRecoverableNotifiedException, C0015GoogleAuthException {
        Throwable th;
        Bundle bundle2;
        Bundle bundle3;
        Throwable th2;
        Context context2 = context;
        Account account2 = account;
        String str2 = str;
        Bundle bundle4 = bundle;
        Intent intent2 = intent;
        Intent intent3 = intent2;
        Intent intent4 = intent3;
        if (intent3 == null) {
            Throwable th3 = th2;
            new IllegalArgumentException("Callback cannot be null.");
            throw th3;
        }
        try {
            Intent parseUri = Intent.parseUri(intent4.toUri(1), 1);
            if (bundle4 == null) {
                bundle2 = bundle3;
                new Bundle();
            } else {
                bundle2 = bundle4;
            }
            Bundle bundle5 = bundle2;
            Bundle bundle6 = bundle5;
            bundle5.putParcelable("callback_intent", intent2);
            bundle6.putBoolean("handle_notification", true);
            return zzb(context2, account2, str2, bundle6).zza();
        } catch (URISyntaxException e) {
            Throwable th4 = th;
            new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
            throw th4;
        }
    }

    public static String getTokenWithNotification(Context context, Account account, String str, Bundle bundle, String str2, Bundle bundle2) throws IOException, C0020UserRecoverableNotifiedException, C0015GoogleAuthException {
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        Bundle bundle6;
        Context context2 = context;
        Account account2 = account;
        String str3 = str;
        Bundle bundle7 = bundle;
        String str4 = str2;
        Bundle bundle8 = bundle2;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str4, "Authority cannot be empty or null.");
        if (bundle7 == null) {
            bundle3 = bundle6;
            new Bundle();
        } else {
            bundle3 = bundle7;
        }
        Bundle bundle9 = bundle3;
        if (bundle8 == null) {
            bundle4 = bundle5;
            new Bundle();
        } else {
            bundle4 = bundle8;
        }
        Bundle bundle10 = bundle4;
        ContentResolver.validateSyncExtrasBundle(bundle10);
        bundle9.putString("authority", str4);
        bundle9.putBundle("sync_extras", bundle10);
        bundle9.putBoolean("handle_notification", true);
        return zzb(context2, account2, str3, bundle9).zza();
    }

    private static C0018TokenData zzb(Context context, Account account, String str, Bundle bundle) throws IOException, C0015GoogleAuthException {
        Throwable th;
        Throwable th2;
        Bundle bundle2;
        Context context2 = context;
        Account account2 = account;
        String str2 = str;
        Bundle bundle3 = bundle;
        if (bundle3 == null) {
            new Bundle();
            bundle3 = bundle2;
        }
        String str3 = str2;
        String str4 = str3;
        try {
            C0018TokenData zza = C0175zzg.zza(context2, account2, str3, bundle3);
            C0196GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(context2);
            return zza;
        } catch (C0017GooglePlayServicesAvailabilityException e) {
            C0017GooglePlayServicesAvailabilityException googlePlayServicesAvailabilityException = e;
            C0196GooglePlayServicesUtil.showErrorNotification(googlePlayServicesAvailabilityException.getConnectionStatusCode(), context2);
            int w = Log.w("GoogleAuthUtil", "Error when getting token", googlePlayServicesAvailabilityException);
            Throwable th3 = th2;
            new C0020UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
            throw th3;
        } catch (C0019UserRecoverableAuthException e2) {
            C0196GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(context2);
            int w2 = Log.w("GoogleAuthUtil", "Error when getting token", e2);
            Throwable th4 = th;
            new C0020UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
            throw th4;
        }
    }

    private C0016GoogleAuthUtil() {
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2) throws IOException, C0019UserRecoverableAuthException, C0015GoogleAuthException {
        return C0175zzg.getToken(context, str, str2);
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2, Bundle bundle) throws IOException, C0019UserRecoverableAuthException, C0015GoogleAuthException {
        return C0175zzg.getToken(context, str, str2, bundle);
    }

    public static String getToken(Context context, Account account, String str) throws IOException, C0019UserRecoverableAuthException, C0015GoogleAuthException {
        return C0175zzg.getToken(context, account, str);
    }

    public static String getToken(Context context, Account account, String str, Bundle bundle) throws IOException, C0019UserRecoverableAuthException, C0015GoogleAuthException {
        return C0175zzg.getToken(context, account, str, bundle);
    }

    @RequiresPermission("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    public static void invalidateToken(Context context, String str) {
        C0175zzg.invalidateToken(context, str);
    }

    public static void clearToken(Context context, String str) throws C0017GooglePlayServicesAvailabilityException, C0015GoogleAuthException, IOException {
        C0175zzg.clearToken(context, str);
    }

    public static List<C0011AccountChangeEvent> getAccountChangeEvents(Context context, int i, String str) throws C0015GoogleAuthException, IOException {
        return C0175zzg.getAccountChangeEvents(context, i, str);
    }

    public static String getAccountId(Context context, String str) throws C0015GoogleAuthException, IOException {
        return C0175zzg.getAccountId(context, str);
    }

    @TargetApi(23)
    public static Bundle removeAccount(Context context, Account account) throws C0015GoogleAuthException, IOException {
        return C0175zzg.removeAccount(context, account);
    }

    @TargetApi(26)
    public static Boolean requestGoogleAccountsAccess(Context context) throws C0015GoogleAuthException, IOException {
        return C0175zzg.requestGoogleAccountsAccess(context);
    }
}

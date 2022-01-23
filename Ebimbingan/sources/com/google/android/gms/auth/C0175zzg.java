package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.C0183BlockingServiceConnection;
import com.google.android.gms.common.C0189GoogleApiAvailability;
import com.google.android.gms.common.C0194GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.C0195GooglePlayServicesRepairableException;
import com.google.android.gms.common.C0197GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.C0212ApiException;
import com.google.android.gms.common.internal.C0434GmsClientSupervisor;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.logging.C0547Logger;
import com.google.android.gms.internal.auth.C0832zzcb;
import com.google.android.gms.internal.auth.C0834zzcd;
import com.google.android.gms.internal.auth.C0854zzcx;
import com.google.android.gms.internal.auth.C0965zzh;
import com.google.android.gms.internal.auth.C1019zzj;
import com.google.android.gms.internal.auth.C1072zzkz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

@C0452ShowFirstParty
/* renamed from: com.google.android.gms.auth.zzg */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0175zzg {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    @C0452ShowFirstParty
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";
    @C0452ShowFirstParty
    @SuppressLint({"InlinedApi"})
    public static final String zza = "callerUid";
    @C0452ShowFirstParty
    @SuppressLint({"InlinedApi"})
    public static final String zzb = "androidPackageName";
    @C0452ShowFirstParty
    private static final String[] zzc;
    private static final ComponentName zzd;
    /* access modifiers changed from: private */
    public static final C0547Logger zze = C0171zzc.zza("GoogleAuthUtil");

    @Deprecated
    public static String getToken(Context context, String str, String str2) throws IOException, C0019UserRecoverableAuthException, C0015GoogleAuthException {
        Account account;
        new Account(str, "com.google");
        return getToken(context, account, str2);
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2, Bundle bundle) throws IOException, C0019UserRecoverableAuthException, C0015GoogleAuthException {
        Account account;
        new Account(str, "com.google");
        return getToken(context, account, str2, bundle);
    }

    public static String getToken(Context context, Account account, String str) throws IOException, C0019UserRecoverableAuthException, C0015GoogleAuthException {
        Bundle bundle;
        new Bundle();
        return getToken(context, account, str, bundle);
    }

    public static String getToken(Context context, Account account, String str, Bundle bundle) throws IOException, C0019UserRecoverableAuthException, C0015GoogleAuthException {
        Account account2 = account;
        zza(account2);
        return zza(context, account2, str, bundle).zza();
    }

    public static C0018TokenData zza(Context context, Account account, String str, Bundle bundle) throws IOException, C0019UserRecoverableAuthException, C0015GoogleAuthException {
        Bundle bundle2;
        Bundle bundle3;
        C0180zzl zzl;
        Bundle bundle4;
        Context context2 = context;
        Account account2 = account;
        String str2 = str;
        Bundle bundle5 = bundle;
        C0446Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2, "Scope cannot be empty or null.");
        zza(account2);
        zza(context2, 8400000);
        if (bundle5 == null) {
            bundle3 = bundle4;
            new Bundle();
        } else {
            bundle3 = bundle2;
            new Bundle(bundle5);
        }
        Bundle bundle6 = bundle3;
        String str3 = context2.getApplicationInfo().packageName;
        bundle6.putString("clientPackageName", str3);
        if (TextUtils.isEmpty(bundle6.getString(zzb))) {
            bundle6.putString(zzb, str3);
        }
        bundle6.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        C0854zzcx.zza(context2);
        if (C1072zzkz.zzd() && zza(context2)) {
            String str4 = "token retrieval";
            try {
                Bundle bundle7 = (Bundle) zza(C1019zzj.zza(context2).zza(account2, str2, bundle6), str4);
                Object zzb2 = zzb(bundle7);
                return zzb(bundle7);
            } catch (C0212ApiException e) {
                zza(e, str4);
            }
        }
        new C0174zzf(account2, str2, bundle6);
        return (C0018TokenData) zza(context2, zzd, zzl);
    }

    private static boolean zza(Context context) {
        Context context2 = context;
        if (C0189GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context2, 17895000) != 0) {
            return false;
        }
        String str = context2.getApplicationInfo().packageName;
        for (String equals : C1072zzkz.zzb().zzi()) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static C0018TokenData zzb(Bundle bundle) throws C0015GoogleAuthException, IOException {
        Throwable th;
        Throwable th2;
        StringBuilder sb;
        Throwable th3;
        Bundle bundle2 = bundle;
        C0018TokenData zza2 = C0018TokenData.zza(bundle2, "tokenDetails");
        C0018TokenData tokenData = zza2;
        if (zza2 != null) {
            return tokenData;
        }
        String string = bundle2.getString("Error");
        Intent intent = (Intent) bundle2.getParcelable("userRecoveryIntent");
        C0834zzcd zza3 = C0834zzcd.zza(string);
        C0834zzcd zzcd = zza3;
        if (C0834zzcd.zza(zza3)) {
            Object[] objArr = new Object[1];
            String valueOf = String.valueOf(zzcd);
            new StringBuilder(31 + String.valueOf(valueOf).length());
            objArr[0] = sb.append("isUserRecoverableError status: ").append(valueOf).toString();
            zze.w("GoogleAuthUtil", objArr);
            Throwable th4 = th3;
            new C0019UserRecoverableAuthException(string, intent);
            throw th4;
        }
        C0834zzcd zzcd2 = zzcd;
        if (C0834zzcd.zzb.equals(zzcd2) || C0834zzcd.zzc.equals(zzcd2) || C0834zzcd.zzd.equals(zzcd2) || C0834zzcd.zze.equals(zzcd2)) {
            Throwable th5 = th2;
            new IOException(string);
            throw th5;
        }
        Throwable th6 = th;
        new C0015GoogleAuthException(string);
        throw th6;
    }

    private static <ResultT> ResultT zza(Task<ResultT> task, String str) throws IOException, C0212ApiException {
        Throwable th;
        Throwable th2;
        Throwable th3;
        String str2 = str;
        try {
            return Tasks.await(task);
        } catch (ExecutionException e) {
            ExecutionException executionException = e;
            ExecutionException executionException2 = executionException;
            Throwable cause = executionException.getCause();
            Throwable th4 = cause;
            if (cause instanceof C0212ApiException) {
                throw ((C0212ApiException) th4);
            }
            String format = String.format("Unable to get a result for %s due to ExecutionException.", new Object[]{str2});
            zze.w(format, new Object[0]);
            Throwable th5 = th3;
            new IOException(format, executionException2);
            throw th5;
        } catch (InterruptedException e2) {
            InterruptedException interruptedException = e2;
            String format2 = String.format("Interrupted while waiting for the task of %s to finish.", new Object[]{str2});
            zze.w(format2, new Object[0]);
            Throwable th6 = th2;
            new IOException(format2, interruptedException);
            throw th6;
        } catch (CancellationException e3) {
            CancellationException cancellationException = e3;
            String format3 = String.format("Canceled while waiting for the task of %s to finish.", new Object[]{str2});
            zze.w(format3, new Object[0]);
            Throwable th7 = th;
            new IOException(format3, cancellationException);
            throw th7;
        }
    }

    private static void zza(C0212ApiException apiException, String str) {
        C0547Logger logger = zze;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        Object[] objArr2 = objArr;
        objArr2[1] = Log.getStackTraceString(apiException);
        logger.w("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", objArr2);
    }

    @RequiresPermission("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    public static void invalidateToken(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    public static void clearToken(Context context, String str) throws C0017GooglePlayServicesAvailabilityException, C0015GoogleAuthException, IOException {
        Bundle bundle;
        C0180zzl zzl;
        C0832zzcb zzcb;
        Context context2 = context;
        String str2 = str;
        C0446Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zza(context2, 8400000);
        new Bundle();
        Bundle bundle2 = bundle;
        String str3 = context2.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str3);
        if (!bundle2.containsKey(zzb)) {
            bundle2.putString(zzb, str3);
        }
        C0854zzcx.zza(context2);
        if (C1072zzkz.zzd() && zza(context2)) {
            String str4 = "clear token";
            C0965zzh zza2 = C1019zzj.zza(context2);
            new C0832zzcb();
            try {
                Object zza3 = zza(zza2.zza(zzcb.zza(str2)), str4);
                return;
            } catch (C0212ApiException e) {
                zza(e, str4);
            }
        }
        new C0177zzi(str2, bundle2);
        Object zza4 = zza(context2, zzd, zzl);
    }

    public static List<C0011AccountChangeEvent> getAccountChangeEvents(Context context, int i, String str) throws C0015GoogleAuthException, IOException {
        C0012AccountChangeEventsRequest accountChangeEventsRequest;
        C0180zzl zzl;
        Context context2 = context;
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2, "accountName must be provided");
        C0446Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zza(context2, 8400000);
        new C0012AccountChangeEventsRequest();
        C0012AccountChangeEventsRequest eventIndex = accountChangeEventsRequest.setAccountName(str2).setEventIndex(i);
        C0854zzcx.zza(context2);
        if (C1072zzkz.zzc() && zza(context2)) {
            String str3 = "account change events retrieval";
            try {
                C0013AccountChangeEventsResponse accountChangeEventsResponse = (C0013AccountChangeEventsResponse) zza(C1019zzj.zza(context2).zza(eventIndex), str3);
                Object zzb2 = zzb(accountChangeEventsResponse);
                return accountChangeEventsResponse.getEvents();
            } catch (C0212ApiException e) {
                zza(e, str3);
            }
        }
        new C0176zzh(eventIndex);
        return (List) zza(context2, zzd, zzl);
    }

    public static String getAccountId(Context context, String str) throws C0015GoogleAuthException, IOException {
        Bundle bundle;
        Context context2 = context;
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2, "accountName must be provided");
        C0446Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zza(context2, 8400000);
        new Bundle();
        return getToken(context2, str2, "^^_account_id_^^", bundle);
    }

    @C0452ShowFirstParty
    @TargetApi(23)
    public static Bundle removeAccount(Context context, Account account) throws C0015GoogleAuthException, IOException {
        C0180zzl zzl;
        Context context2 = context;
        Account account2 = account;
        Object checkNotNull = C0446Preconditions.checkNotNull(context2);
        zza(account2);
        zza(context2, 8400000);
        C0854zzcx.zza(context2);
        if (C1072zzkz.zzd() && zza(context2)) {
            String str = "account removal";
            try {
                return (Bundle) zzb((Bundle) zza(C1019zzj.zza(context2).zza(account2), str));
            } catch (C0212ApiException e) {
                zza(e, str);
            }
        }
        new C0179zzk(account2);
        return (Bundle) zza(context2, zzd, zzl);
    }

    @TargetApi(26)
    public static Boolean requestGoogleAccountsAccess(Context context) throws C0015GoogleAuthException, IOException {
        C0180zzl zzl;
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        Context context2 = context;
        Object checkNotNull = C0446Preconditions.checkNotNull(context2);
        zza(context2, 11400000);
        String str = context2.getApplicationInfo().packageName;
        C0854zzcx.zza(context2);
        if (C1072zzkz.zzd() && zza(context2)) {
            String str2 = "google accounts access request";
            try {
                Bundle bundle = (Bundle) zza(C1019zzj.zza(context2).zza(str), str2);
                String string = bundle.getString("Error");
                Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
                C0834zzcd zza2 = C0834zzcd.zza(string);
                if (C0834zzcd.zza.equals(zza2)) {
                    return 1;
                }
                if (C0834zzcd.zza(zza2)) {
                    C0547Logger logger = zze;
                    Object[] objArr = new Object[1];
                    Object[] objArr2 = objArr;
                    Object[] objArr3 = objArr;
                    String valueOf = String.valueOf(zza2);
                    new StringBuilder(31 + String.valueOf(valueOf).length());
                    objArr3[0] = sb.append("isUserRecoverableError status: ").append(valueOf).toString();
                    logger.w("GoogleAuthUtil", objArr2);
                    Throwable th3 = th2;
                    new C0019UserRecoverableAuthException(string, intent);
                    throw th3;
                }
                Throwable th4 = th;
                new C0015GoogleAuthException(string);
                throw th4;
            } catch (C0212ApiException e) {
                zza(e, str2);
            }
        }
        new C0178zzj(str);
        return (Boolean) zza(context2, zzd, zzl);
    }

    private static void zza(Account account) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Account account2 = account;
        if (account2 == null) {
            Throwable th4 = th3;
            new IllegalArgumentException("Account cannot be null");
            throw th4;
        } else if (TextUtils.isEmpty(account2.name)) {
            Throwable th5 = th2;
            new IllegalArgumentException("Account name cannot be empty!");
            throw th5;
        } else {
            String[] strArr = zzc;
            String[] strArr2 = strArr;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr2[i].equals(account2.type)) {
                    i++;
                } else {
                    return;
                }
            }
            Throwable th6 = th;
            new IllegalArgumentException("Account type not supported");
            throw th6;
        }
    }

    private static void zza(Context context, int i) throws C0015GoogleAuthException {
        Throwable th;
        Throwable th2;
        try {
            C0197GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i);
        } catch (C0195GooglePlayServicesRepairableException e) {
            C0195GooglePlayServicesRepairableException googlePlayServicesRepairableException = e;
            Throwable th3 = th2;
            new C0017GooglePlayServicesAvailabilityException(googlePlayServicesRepairableException.getConnectionStatusCode(), googlePlayServicesRepairableException.getMessage(), googlePlayServicesRepairableException.getIntent());
            throw th3;
        } catch (C0194GooglePlayServicesNotAvailableException e2) {
            C0194GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException = e2;
            Throwable th4 = th;
            new C0015GoogleAuthException(googlePlayServicesNotAvailableException.getMessage());
            throw th4;
        }
    }

    /* access modifiers changed from: private */
    public static <T> T zzb(T t) throws IOException {
        Throwable th;
        T t2 = t;
        if (t2 != null) {
            return t2;
        }
        zze.w("GoogleAuthUtil", "Service call returned null.");
        Throwable th2 = th;
        new IOException("Service unavailable.");
        throw th2;
    }

    private static <T> T zza(Context context, ComponentName componentName, C0180zzl<T> zzl) throws IOException, C0015GoogleAuthException {
        C0183BlockingServiceConnection blockingServiceConnection;
        Throwable th;
        Throwable th2;
        Throwable th3;
        ComponentName componentName2 = componentName;
        C0180zzl<T> zzl2 = zzl;
        new C0183BlockingServiceConnection();
        C0183BlockingServiceConnection blockingServiceConnection2 = blockingServiceConnection;
        C0434GmsClientSupervisor instance = C0434GmsClientSupervisor.getInstance(context);
        try {
            if (instance.bindService(componentName2, (ServiceConnection) blockingServiceConnection2, "GoogleAuthUtil")) {
                try {
                    T zza2 = zzl2.zza(blockingServiceConnection2.getService());
                    instance.unbindService(componentName2, (ServiceConnection) blockingServiceConnection2, "GoogleAuthUtil");
                    return zza2;
                } catch (RemoteException | InterruptedException e) {
                    Throwable th4 = e;
                    C0547Logger logger = zze;
                    Object[] objArr = new Object[2];
                    objArr[0] = "Error on service connection.";
                    Object[] objArr2 = objArr;
                    objArr2[1] = th4;
                    logger.i("GoogleAuthUtil", objArr2);
                    Throwable th5 = th3;
                    new IOException("Error on service connection.", th4);
                    throw th5;
                } catch (Throwable th6) {
                    Throwable th7 = th6;
                    instance.unbindService(componentName2, (ServiceConnection) blockingServiceConnection2, "GoogleAuthUtil");
                    throw th7;
                }
            } else {
                Throwable th8 = th2;
                new IOException("Could not bind to service.");
                throw th8;
            }
        } catch (SecurityException e2) {
            SecurityException securityException = e2;
            zze.w("SecurityException while bind to auth service: %s", securityException.getMessage());
            Throwable th9 = th;
            new IOException("SecurityException while binding to Auth service.", securityException);
            throw th9;
        }
    }

    C0175zzg() {
    }

    static {
        ComponentName componentName;
        String[] strArr = new String[3];
        strArr[0] = "com.google";
        String[] strArr2 = strArr;
        strArr2[1] = "com.google.work";
        String[] strArr3 = strArr2;
        strArr3[2] = "cn.google";
        zzc = strArr3;
        new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        zzd = componentName;
    }
}

package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.firebase_auth.zzay;
import com.google.android.gms.internal.firebase_auth.zzfm;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.api.internal.zzdr;
import com.google.firebase.auth.zzf;

public final class zzaq {
    @VisibleForTesting
    private static long zzuq = 3600000;
    private static final zzay<String> zzur = zzay.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");
    private static final zzaq zzus;
    private Task<AuthResult> zzut;
    private long zzuu = 0;

    private zzaq() {
    }

    public static zzaq zzfp() {
        return zzus;
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth) {
        Context context2 = context;
        FirebaseAuth firebaseAuth2 = firebaseAuth;
        Object checkNotNull = Preconditions.checkNotNull(context2);
        Object checkNotNull2 = Preconditions.checkNotNull(firebaseAuth2);
        SharedPreferences.Editor edit = context2.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        SharedPreferences.Editor putString = edit.putString("firebaseAppName", firebaseAuth2.zzcu().getName());
        boolean commit = edit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        Context context2 = context;
        FirebaseAuth firebaseAuth2 = firebaseAuth;
        FirebaseUser firebaseUser2 = firebaseUser;
        Object checkNotNull = Preconditions.checkNotNull(context2);
        Object checkNotNull2 = Preconditions.checkNotNull(firebaseAuth2);
        Object checkNotNull3 = Preconditions.checkNotNull(firebaseUser2);
        SharedPreferences.Editor edit = context2.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        SharedPreferences.Editor editor = edit;
        SharedPreferences.Editor putString = edit.putString("firebaseAppName", firebaseAuth2.zzcu().getName());
        SharedPreferences.Editor putString2 = editor.putString("firebaseUserUid", firebaseUser2.getUid());
        boolean commit = editor.commit();
    }

    public static void zza(Context context, zzfm zzfm, String str, @Nullable String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        SharedPreferences.Editor editor = edit;
        SharedPreferences.Editor putString = edit.putString("verifyAssertionRequest", SafeParcelableSerializer.serializeToString(zzfm));
        SharedPreferences.Editor putString2 = editor.putString("operation", str);
        SharedPreferences.Editor putString3 = editor.putString("tenantId", str2);
        SharedPreferences.Editor putLong = editor.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        boolean commit = editor.commit();
    }

    public static void zza(Context context, Status status) {
        Status status2 = status;
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        SharedPreferences.Editor editor = edit;
        SharedPreferences.Editor putInt = edit.putInt("statusCode", status2.getStatusCode());
        SharedPreferences.Editor putString = editor.putString("statusMessage", status2.getStatusMessage());
        SharedPreferences.Editor putLong = editor.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        boolean commit = editor.commit();
    }

    public final void zzg(FirebaseAuth firebaseAuth) {
        Status status;
        FirebaseAuth firebaseAuth2 = firebaseAuth;
        Object checkNotNull = Preconditions.checkNotNull(firebaseAuth2);
        SharedPreferences sharedPreferences = firebaseAuth2.zzcu().getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (firebaseAuth2.zzcu().getName().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (sharedPreferences2.contains("verifyAssertionRequest")) {
                zzfm deserializeFromString = SafeParcelableSerializer.deserializeFromString(sharedPreferences2.getString("verifyAssertionRequest", ""), zzfm.CREATOR);
                String string = sharedPreferences2.getString("operation", "");
                String string2 = sharedPreferences2.getString("tenantId", (String) null);
                String string3 = sharedPreferences2.getString("firebaseUserUid", "");
                this.zzuu = sharedPreferences2.getLong("timestamp", 0);
                if (string2 != null) {
                    firebaseAuth2.zzf(string2);
                    zzfm zzcz = deserializeFromString.zzcz(string2);
                }
                String str = string;
                boolean z = true;
                switch (str.hashCode()) {
                    case -1843829902:
                        if (str.equals("com.google.firebase.auth.internal.REAUTHENTICATE")) {
                            z = true;
                            break;
                        }
                        break;
                    case -286760092:
                        if (str.equals("com.google.firebase.auth.internal.LINK")) {
                            z = true;
                            break;
                        }
                        break;
                    case 1731327805:
                        if (str.equals("com.google.firebase.auth.internal.SIGN_IN")) {
                            z = false;
                            break;
                        }
                        break;
                }
                switch (z) {
                    case false:
                        this.zzut = firebaseAuth2.signInWithCredential(zzf.zza(deserializeFromString));
                        break;
                    case true:
                        if (!firebaseAuth2.getCurrentUser().getUid().equals(string3)) {
                            this.zzut = null;
                            break;
                        } else {
                            this.zzut = firebaseAuth2.getCurrentUser().linkWithCredential(zzf.zza(deserializeFromString));
                            break;
                        }
                    case true:
                        if (!firebaseAuth2.getCurrentUser().getUid().equals(string3)) {
                            this.zzut = null;
                            break;
                        } else {
                            this.zzut = firebaseAuth2.getCurrentUser().reauthenticateAndRetrieveData(zzf.zza(deserializeFromString));
                            break;
                        }
                    default:
                        this.zzut = null;
                        break;
                }
                zza(sharedPreferences2);
            } else if (sharedPreferences2.contains("statusCode")) {
                new Status(sharedPreferences2.getInt("statusCode", 17062), sharedPreferences2.getString("statusMessage", ""));
                this.zzuu = sharedPreferences2.getLong("timestamp", 0);
                zza(sharedPreferences2);
                this.zzut = Tasks.forException(zzdr.zzb(status));
            }
        }
    }

    public final Task<AuthResult> zzfo() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.zzuu < zzuq) {
            return this.zzut;
        }
        return null;
    }

    public final void zza(Context context) {
        Context context2 = context;
        Object checkNotNull = Preconditions.checkNotNull(context2);
        zza(context2.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.zzut = null;
        this.zzuu = 0;
    }

    private static void zza(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzay zzay = zzur;
        zzay zzay2 = zzay;
        int size = zzay.size();
        int i = 0;
        while (i < size) {
            i++;
            SharedPreferences.Editor remove = edit.remove((String) zzay2.get(i));
        }
        boolean commit = edit.commit();
    }

    static {
        zzaq zzaq;
        new zzaq();
        zzus = zzaq;
    }
}

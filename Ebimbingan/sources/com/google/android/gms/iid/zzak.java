package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public final class zzak {
    private SharedPreferences zzde;
    private final zzn zzdf;
    @GuardedBy("this")
    private final Map<String, zzo> zzdg;
    private Context zzl;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzak(android.content.Context r8) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r0
            r3 = r1
            com.google.android.gms.iid.zzn r4 = new com.google.android.gms.iid.zzn
            r6 = r4
            r4 = r6
            r5 = r6
            r5.<init>()
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzak.<init>(android.content.Context):void");
    }

    @C0617VisibleForTesting
    private zzak(Context context, zzn zzn) {
        Map<String, zzo> map;
        File file;
        String str;
        String str2;
        Context context2 = context;
        new ArrayMap();
        this.zzdg = map;
        this.zzl = context2;
        this.zzde = context2.getSharedPreferences("com.google.android.gms.appid", 0);
        this.zzdf = zzn;
        new File(ContextCompat.getNoBackupFilesDir(this.zzl), "com.google.android.gms.appid-no-backup");
        File file2 = file;
        File file3 = file2;
        if (!file2.exists()) {
            try {
                if (file3.createNewFile() && !isEmpty()) {
                    int i = Log.i("InstanceID/Store", "App restored, clearing state");
                    InstanceIDListenerService.zzd(this.zzl, this);
                }
            } catch (IOException e) {
                IOException iOException = e;
                if (Log.isLoggable("InstanceID/Store", 3)) {
                    String valueOf = String.valueOf(iOException.getMessage());
                    String str3 = valueOf;
                    if (valueOf.length() != 0) {
                        str2 = "Error creating file in no backup dir: ".concat(str3);
                    } else {
                        str2 = str;
                        new String("Error creating file in no backup dir: ");
                    }
                    int d = Log.d("InstanceID/Store", str2);
                }
            }
        }
    }

    public final boolean isEmpty() {
        return this.zzde.getAll().isEmpty();
    }

    private static String zzd(String str, String str2, String str3) {
        StringBuilder sb;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        new StringBuilder(4 + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
        return sb.append(str4).append("|T|").append(str5).append("|").append(str6).toString();
    }

    private static String zze(String str, String str2, String str3) {
        StringBuilder sb;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        new StringBuilder(14 + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
        return sb.append(str4).append("|T-timestamp|").append(str5).append("|").append(str6).toString();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final synchronized String get(String str) {
        String string;
        String str2 = str;
        synchronized (this) {
            string = this.zzde.getString(str2, (String) null);
        }
        return string;
    }

    public final synchronized void zzi(String str) {
        String str2 = str;
        synchronized (this) {
            SharedPreferences.Editor edit = this.zzde.edit();
            for (String next : this.zzde.getAll().keySet()) {
                String str3 = next;
                if (next.startsWith(str2)) {
                    SharedPreferences.Editor remove = edit.remove(str3);
                }
            }
            boolean commit = edit.commit();
        }
    }

    public final synchronized void zzz() {
        synchronized (this) {
            this.zzdg.clear();
            zzn.zzi(this.zzl);
            boolean commit = this.zzde.edit().clear().commit();
        }
    }

    @Nullable
    public final synchronized String zzf(String str, String str2, String str3) {
        String string;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        synchronized (this) {
            string = this.zzde.getString(zzd(str4, str5, str6), (String) null);
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    public final synchronized long zzg(String str, String str2, String str3) {
        long j;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        synchronized (this) {
            j = this.zzde.getLong(zze(str4, str5, str6), -1);
        }
        return j;
    }

    public final synchronized void zzd(String str, String str2, String str3, String str4, String str5) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        synchronized (this) {
            String zzd = zzd(str6, str7, str8);
            String zze = zze(str6, str7, str8);
            SharedPreferences.Editor edit = this.zzde.edit();
            SharedPreferences.Editor editor = edit;
            SharedPreferences.Editor putString = edit.putString(zzd, str9);
            SharedPreferences.Editor putLong = editor.putLong(zze, System.currentTimeMillis());
            SharedPreferences.Editor putString2 = editor.putString("appVersion", str10);
            boolean commit = editor.commit();
        }
    }

    public final synchronized void zzh(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        synchronized (this) {
            SharedPreferences.Editor edit = this.zzde.edit();
            SharedPreferences.Editor editor = edit;
            SharedPreferences.Editor remove = edit.remove(zzd(str4, str5, str6));
            SharedPreferences.Editor remove2 = editor.remove(zze(str4, str5, str6));
            boolean commit = editor.commit();
        }
    }

    public final synchronized zzo zzj(String str) {
        zzo zzf;
        zzo zzo;
        String str2 = str;
        synchronized (this) {
            zzo zzo2 = this.zzdg.get(str2);
            zzo zzo3 = zzo2;
            if (zzo2 != null) {
                zzo = zzo3;
            } else {
                try {
                    zzf = this.zzdf.zze(this.zzl, str2);
                } catch (zzp e) {
                    int w = Log.w("InstanceID/Store", "Stored data is corrupt, generating new identity");
                    InstanceIDListenerService.zzd(this.zzl, this);
                    zzf = this.zzdf.zzf(this.zzl, str2);
                }
                zzo put = this.zzdg.put(str2, zzf);
                zzo = zzf;
            }
        }
        return zzo;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void zzk(String str) {
        String str2 = str;
        synchronized (this) {
            try {
                zzo remove = this.zzdg.remove(str2);
                zzn.zzg(this.zzl, str2);
                zzi(String.valueOf(str2).concat("|"));
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
    }

    static String zzh(String str, String str2) {
        StringBuilder sb;
        String str3 = str;
        String str4 = str2;
        new StringBuilder(3 + String.valueOf(str3).length() + String.valueOf(str4).length());
        return sb.append(str3).append("|S|").append(str4).toString();
    }
}

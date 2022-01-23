package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.gcm.zzq;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

final class zzn {
    zzn() {
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final zzo zze(Context context, String str) throws zzp {
        Context context2 = context;
        String str2 = str;
        zzo zzh = zzh(context2, str2);
        zzo zzo = zzh;
        if (zzh != null) {
            return zzo;
        }
        return zzf(context2, str2);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final zzo zzf(Context context, String str) {
        zzo zzo;
        Context context2 = context;
        String str2 = str;
        new zzo(zzd.zzl(), System.currentTimeMillis());
        zzo zzo2 = zzo;
        try {
            zzo zzh = zzh(context2, str2);
            zzo zzo3 = zzh;
            if (zzh != null) {
                if (Log.isLoggable("InstanceID", 3)) {
                    int d = Log.d("InstanceID", "Loaded key after generating new one, using loaded one");
                }
                return zzo3;
            }
        } catch (zzp e) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            int d2 = Log.d("InstanceID", "Generated new key");
        }
        zzd(context2, str2, zzo2);
        zze(context2, str2, zzo2);
        return zzo2;
    }

    static void zzg(Context context, String str) {
        File zzj = zzj(context, str);
        File file = zzj;
        if (zzj.exists()) {
            boolean delete = file.delete();
        }
    }

    static void zzi(Context context) {
        File[] listFiles = zzj(context).listFiles();
        File[] fileArr = listFiles;
        int length = listFiles.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            File file2 = file;
            if (file.getName().startsWith("com.google.InstanceId")) {
                boolean delete = file2.delete();
            }
        }
    }

    @Nullable
    private final zzo zzh(Context context, String str) throws zzp {
        Context context2 = context;
        String str2 = str;
        zzp zzp = null;
        try {
            zzo zzi = zzi(context2, str2);
            zzo zzo = zzi;
            if (zzi != null) {
                zze(context2, str2, zzo);
                return zzo;
            }
        } catch (zzp e) {
            zzp = e;
        }
        Context context3 = context2;
        Context context4 = context3;
        try {
            zzo zzd = zzd(context3.getSharedPreferences("com.google.android.gms.appid", 0), str2);
            zzo zzo2 = zzd;
            if (zzd != null) {
                zzd(context2, str2, zzo2);
                return zzo2;
            }
        } catch (zzp e2) {
            zzp = e2;
        }
        if (zzp == null) {
            return null;
        }
        throw zzp;
    }

    private static KeyPair zzg(String str, String str2) throws zzp {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        KeySpec keySpec;
        KeySpec keySpec2;
        KeyPair keyPair;
        String str3 = str2;
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str3, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                new X509EncodedKeySpec(decode);
                PublicKey generatePublic = instance.generatePublic(keySpec);
                new PKCS8EncodedKeySpec(decode2);
                KeyPair keyPair2 = keyPair;
                new KeyPair(generatePublic, instance.generatePrivate(keySpec2));
                return keyPair2;
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                Exception exc = e;
                String valueOf = String.valueOf(exc);
                new StringBuilder(19 + String.valueOf(valueOf).length());
                int w = Log.w("InstanceID", sb.append("Invalid key stored ").append(valueOf).toString());
                Throwable th3 = th2;
                new zzp(exc);
                throw th3;
            }
        } catch (IllegalArgumentException e2) {
            IllegalArgumentException illegalArgumentException = e2;
            Throwable th4 = th;
            new zzp(illegalArgumentException);
            throw th4;
        }
    }

    @Nullable
    private final zzo zzi(Context context, String str) throws zzp {
        StringBuilder sb;
        Throwable th;
        StringBuilder sb2;
        File zzj = zzj(context, str);
        File file = zzj;
        if (!zzj.exists()) {
            return null;
        }
        try {
            return zzd(file);
        } catch (IOException e) {
            IOException iOException = e;
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(iOException);
                new StringBuilder(40 + String.valueOf(valueOf).length());
                int d = Log.d("InstanceID", sb2.append("Failed to read key from file, retrying: ").append(valueOf).toString());
            }
            try {
                return zzd(file);
            } catch (IOException e2) {
                IOException iOException2 = e2;
                String valueOf2 = String.valueOf(iOException2);
                new StringBuilder(45 + String.valueOf(valueOf2).length());
                int w = Log.w("InstanceID", sb.append("IID file exists, but failed to read from it: ").append(valueOf2).toString());
                Throwable th2 = th;
                new zzp(iOException2);
                throw th2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r11v19, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r11v20, types: [java.io.FileOutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzd(android.content.Context r16, java.lang.String r17, com.google.android.gms.iid.zzo r18) {
        /*
            r1 = r16
            r2 = r17
            r3 = r18
            java.lang.String r10 = "InstanceID"
            r11 = 3
            boolean r10 = android.util.Log.isLoggable(r10, r11)     // Catch:{ IOException -> 0x0087 }
            if (r10 == 0) goto L_0x001a
            java.lang.String r10 = "InstanceID"
            java.lang.String r11 = "Writing key to properties file"
            int r10 = android.util.Log.d(r10, r11)     // Catch:{ IOException -> 0x0087 }
        L_0x001a:
            r10 = r1
            r11 = r2
            java.io.File r10 = zzj(r10, r11)     // Catch:{ IOException -> 0x0087 }
            r14 = r10
            r10 = r14
            r11 = r14
            r4 = r11
            boolean r10 = r10.createNewFile()     // Catch:{ IOException -> 0x0087 }
            java.util.Properties r10 = new java.util.Properties     // Catch:{ IOException -> 0x0087 }
            r14 = r10
            r10 = r14
            r11 = r14
            r11.<init>()     // Catch:{ IOException -> 0x0087 }
            r14 = r10
            r10 = r14
            r11 = r14
            r5 = r11
            java.lang.String r11 = "pub"
            r12 = r3
            java.lang.String r12 = r12.zzq()     // Catch:{ IOException -> 0x0087 }
            java.lang.Object r10 = r10.setProperty(r11, r12)     // Catch:{ IOException -> 0x0087 }
            r10 = r5
            java.lang.String r11 = "pri"
            r12 = r3
            java.lang.String r12 = r12.zzr()     // Catch:{ IOException -> 0x0087 }
            java.lang.Object r10 = r10.setProperty(r11, r12)     // Catch:{ IOException -> 0x0087 }
            r10 = r5
            java.lang.String r11 = "cre"
            r12 = r3
            long r12 = r12.zzcc     // Catch:{ IOException -> 0x0087 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ IOException -> 0x0087 }
            java.lang.Object r10 = r10.setProperty(r11, r12)     // Catch:{ IOException -> 0x0087 }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0087 }
            r14 = r10
            r10 = r14
            r11 = r14
            r12 = r4
            r11.<init>(r12)     // Catch:{ IOException -> 0x0087 }
            r6 = r10
            r10 = 0
            r7 = r10
            r10 = r5
            r11 = r6
            r12 = 0
            r10.store(r11, r12)     // Catch:{ Throwable -> 0x0076 }
            r10 = 0
            r11 = r6
            zzd((java.lang.Throwable) r10, (java.io.FileOutputStream) r11)     // Catch:{ IOException -> 0x0087 }
        L_0x0075:
            return
        L_0x0076:
            r10 = move-exception
            r14 = r10
            r10 = r14
            r11 = r14
            r8 = r11
            r7 = r10
            r10 = r8
            throw r10     // Catch:{ all -> 0x007e }
        L_0x007e:
            r10 = move-exception
            r9 = r10
            r10 = r7
            r11 = r6
            zzd((java.lang.Throwable) r10, (java.io.FileOutputStream) r11)     // Catch:{ IOException -> 0x0087 }
            r10 = r9
            throw r10     // Catch:{ IOException -> 0x0087 }
        L_0x0087:
            r10 = move-exception
            r4 = r10
            java.lang.String r10 = "InstanceID"
            r11 = r4
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r5 = r11
            r11 = 21
            r12 = r5
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r12 = r12.length()
            int r11 = r11 + r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r14 = r11
            r15 = r12
            r11 = r15
            r12 = r14
            r13 = r15
            r14 = r12
            r15 = r13
            r12 = r15
            r13 = r14
            r12.<init>(r13)
            java.lang.String r12 = "Failed to write key: "
            java.lang.StringBuilder r11 = r11.append(r12)
            r12 = r5
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            int r10 = android.util.Log.w(r10, r11)
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzn.zzd(android.content.Context, java.lang.String, com.google.android.gms.iid.zzo):void");
    }

    private static File zzj(Context context) {
        Context context2 = context;
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(context2);
        File file = noBackupFilesDir;
        if (noBackupFilesDir != null && file.isDirectory()) {
            return file;
        }
        int w = Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context2.getFilesDir();
    }

    private static File zzj(Context context, String str) {
        Throwable th;
        StringBuilder sb;
        String sb2;
        File file;
        Context context2 = context;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            sb2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str2.getBytes("UTF-8"), 11);
                new StringBuilder(33 + String.valueOf(encodeToString).length());
                sb2 = sb.append("com.google.InstanceId_").append(encodeToString).append(".properties").toString();
            } catch (UnsupportedEncodingException e) {
                UnsupportedEncodingException unsupportedEncodingException = e;
                Throwable th2 = th;
                new AssertionError(unsupportedEncodingException);
                throw th2;
            }
        }
        new File(zzj(context2), sb2);
        return file;
    }

    @Nullable
    private static zzo zzd(File file) throws zzp, IOException {
        FileInputStream fileInputStream;
        Properties properties;
        Throwable th;
        zzo zzo;
        new FileInputStream(file);
        FileInputStream fileInputStream2 = fileInputStream;
        try {
            new Properties();
            Properties properties2 = properties;
            Properties properties3 = properties2;
            properties2.load(fileInputStream2);
            String property = properties3.getProperty("pub");
            String property2 = properties3.getProperty("pri");
            if (property == null || property2 == null) {
                zzd((Throwable) null, fileInputStream2);
                return null;
            }
            zzo zzo2 = zzo;
            new zzo(zzg(property, property2), Long.parseLong(properties3.getProperty("cre")));
            zzd((Throwable) null, fileInputStream2);
            return zzo2;
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = e;
            Throwable th2 = th;
            new zzp(numberFormatException);
            throw th2;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            Throwable th5 = th4;
            try {
                throw th4;
            } catch (Throwable th6) {
                Throwable th7 = th6;
                zzd(th5, fileInputStream2);
                throw th7;
            }
        }
    }

    @Nullable
    private static zzo zzd(SharedPreferences sharedPreferences, String str) throws zzp {
        zzo zzo;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String str2 = str;
        String string = sharedPreferences2.getString(zzak.zzh(str2, "|P|"), (String) null);
        String string2 = sharedPreferences2.getString(zzak.zzh(str2, "|K|"), (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        new zzo(zzg(string, string2), zze(sharedPreferences2, str2));
        return zzo;
    }

    private final void zze(Context context, String str, zzo zzo) {
        String str2 = str;
        zzo zzo2 = zzo;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (zzo2.equals(zzd(sharedPreferences, str2))) {
                return;
            }
        } catch (zzp e) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            int d = Log.d("InstanceID", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        SharedPreferences.Editor editor = edit;
        SharedPreferences.Editor putString = edit.putString(zzak.zzh(str2, "|P|"), zzo2.zzq());
        SharedPreferences.Editor putString2 = editor.putString(zzak.zzh(str2, "|K|"), zzo2.zzr());
        SharedPreferences.Editor putString3 = editor.putString(zzak.zzh(str2, "cre"), String.valueOf(zzo2.zzcc));
        boolean commit = editor.commit();
    }

    private static long zze(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(zzak.zzh(str, "cre"), (String) null);
        String str2 = string;
        if (string != null) {
            try {
                return Long.parseLong(str2);
            } catch (NumberFormatException e) {
            }
        }
        return 0;
    }

    private static /* synthetic */ void zzd(Throwable th, FileOutputStream fileOutputStream) {
        Throwable th2 = th;
        FileOutputStream fileOutputStream2 = fileOutputStream;
        if (th2 != null) {
            try {
                fileOutputStream2.close();
            } catch (Throwable th3) {
                zzq.zzd(th2, th3);
            }
        } else {
            fileOutputStream2.close();
        }
    }

    private static /* synthetic */ void zzd(Throwable th, FileInputStream fileInputStream) {
        Throwable th2 = th;
        FileInputStream fileInputStream2 = fileInputStream;
        if (th2 != null) {
            try {
                fileInputStream2.close();
            } catch (Throwable th3) {
                zzq.zzd(th2, th3);
            }
        } else {
            fileInputStream2.close();
        }
    }
}

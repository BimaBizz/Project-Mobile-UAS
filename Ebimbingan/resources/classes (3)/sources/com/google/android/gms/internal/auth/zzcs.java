package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzcs {
    public zzcs() {
    }

    public static zzdr<zzct> zza(Context context) {
        boolean z;
        Context context2;
        Context context3 = context;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        String str3 = str;
        String str4 = str3;
        if (!str3.equals("eng") && !str4.equals("userdebug")) {
            z = false;
        } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return zzdr.zzc();
        }
        Context context4 = context3;
        if (zzch.zza()) {
            Context context5 = context4;
            Context context6 = context5;
            if (context5.isDeviceProtectedStorage()) {
                context2 = context6;
            } else {
                context2 = context6.createDeviceProtectedStorageContext();
            }
        } else {
            context2 = context4;
        }
        zzdr<File> zzb = zzb(context2);
        zzdr<File> zzdr = zzb;
        if (zzb.zza()) {
            return zzdr.zza(zza(zzdr.zzb()));
        }
        return zzdr.zzc();
    }

    private static zzdr<File> zzb(Context context) {
        File file;
        Context context2 = context;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            File file2 = file;
            new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
            File file3 = file2;
            zzdr<File> zza = file3.exists() ? zzdr.zza(file3) : zzdr.zzc();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zza;
        } catch (RuntimeException e) {
            int e2 = Log.e("HermeticFileOverrides", "no data dir", e);
            zzdr<File> zzc = zzdr.zzc();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzc;
        } catch (Throwable th) {
            Throwable th2 = th;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    private static zzct zza(File file) {
        Throwable th;
        BufferedReader bufferedReader;
        Reader reader;
        InputStream inputStream;
        BufferedReader bufferedReader2;
        Throwable th2;
        Map map;
        StringBuilder sb;
        zzct zzct;
        Object obj;
        String str;
        String str2;
        File file2 = file;
        try {
            BufferedReader bufferedReader3 = bufferedReader;
            new FileInputStream(file2);
            new InputStreamReader(inputStream);
            new BufferedReader(reader);
            bufferedReader2 = bufferedReader3;
            new HashMap();
            Map map2 = map;
            while (true) {
                String readLine = bufferedReader2.readLine();
                String str3 = readLine;
                if (readLine != null) {
                    String[] split = str3.split(" ", 3);
                    String[] strArr = split;
                    if (split.length != 3) {
                        String valueOf = String.valueOf(str3);
                        String str4 = valueOf;
                        if (valueOf.length() != 0) {
                            str2 = "Invalid: ".concat(str4);
                        } else {
                            str2 = str;
                            new String("Invalid: ");
                        }
                        int e = Log.e("HermeticFileOverrides", str2);
                    } else {
                        String str5 = strArr[0];
                        String decode = Uri.decode(strArr[1]);
                        String decode2 = Uri.decode(strArr[2]);
                        if (!map2.containsKey(str5)) {
                            new HashMap();
                            Object put = map2.put(str5, obj);
                        }
                        Object put2 = ((Map) map2.get(str5)).put(decode, decode2);
                    }
                } else {
                    String valueOf2 = String.valueOf(file2);
                    new StringBuilder(7 + String.valueOf(valueOf2).length());
                    int i = Log.i("HermeticFileOverrides", sb.append("Parsed ").append(valueOf2).toString());
                    zzct zzct2 = zzct;
                    new zzct(map2);
                    zzct zzct3 = zzct2;
                    bufferedReader2.close();
                    return zzct3;
                }
            }
        } catch (IOException e2) {
            IOException iOException = e2;
            Throwable th3 = th;
            new RuntimeException(iOException);
            throw th3;
        } catch (Throwable th4) {
            zzfq.zza(th2, th4);
        }
        throw th2;
    }
}

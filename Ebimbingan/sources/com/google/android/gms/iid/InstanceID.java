package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.microsoft.appcenter.Constants;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

@Deprecated
public class InstanceID {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_MISSING_INSTANCEID_SERVICE = "MISSING_INSTANCEID_SERVICE";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String ERROR_TIMEOUT = "TIMEOUT";
    private static final zzaj<Boolean> zzbu = zzai.zzy().zzd("gcm_check_for_different_iid_in_token", true);
    private static Map<String, InstanceID> zzbv;
    private static final long zzbw = TimeUnit.DAYS.toMillis(7);
    private static zzak zzbx;
    private static zzaf zzby;
    private static String zzbz;
    private String zzca = "";
    private Context zzl;

    @C0452ShowFirstParty
    private InstanceID(Context context, String str) {
        this.zzl = context.getApplicationContext();
        this.zzca = str;
    }

    static int zzg(Context context) {
        StringBuilder sb;
        Context context2 = context;
        try {
            return context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            new StringBuilder(38 + String.valueOf(valueOf).length());
            int w = Log.w("InstanceID", sb.append("Never happens: can't find own package ").append(valueOf).toString());
            return 0;
        }
    }

    static String zzh(Context context) {
        StringBuilder sb;
        Context context2 = context;
        try {
            return context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            new StringBuilder(38 + String.valueOf(valueOf).length());
            int w = Log.w("InstanceID", sb.append("Never happens: can't find own package ").append(valueOf).toString());
            return null;
        }
    }

    @Deprecated
    public static InstanceID getInstance(Context context) {
        return getInstance(context, (Bundle) null);
    }

    @C0206KeepForSdk
    public static synchronized InstanceID getInstance(Context context, Bundle bundle) {
        InstanceID instanceID;
        InstanceID instanceID2;
        StringBuilder sb;
        zzak zzak;
        zzaf zzaf;
        Context context2 = context;
        Bundle bundle2 = bundle;
        synchronized (InstanceID.class) {
            String string = bundle2 == null ? "" : bundle2.getString("subtype");
            String str = string;
            if (string == null) {
                str = "";
            }
            Context applicationContext = context2.getApplicationContext();
            if (zzbx == null) {
                String packageName = applicationContext.getPackageName();
                new StringBuilder(73 + String.valueOf(packageName).length());
                int w = Log.w("InstanceID", sb.append("Instance ID SDK is deprecated, ").append(packageName).append(" should update to use Firebase Instance ID").toString());
                new zzak(applicationContext);
                zzbx = zzak;
                new zzaf(applicationContext);
                zzby = zzaf;
            }
            zzbz = Integer.toString(zzg(applicationContext));
            InstanceID instanceID3 = zzbv.get(str);
            InstanceID instanceID4 = instanceID3;
            if (instanceID3 == null) {
                new InstanceID(applicationContext, str);
                instanceID4 = instanceID2;
                InstanceID put = zzbv.put(str, instanceID4);
            }
            instanceID = instanceID4;
        }
        return instanceID;
    }

    private final KeyPair getKeyPair() {
        return zzbx.zzj(this.zzca).getKeyPair();
    }

    @C0206KeepForSdk
    public String getSubtype() {
        return this.zzca;
    }

    @Deprecated
    public String getId() {
        return zzd(getKeyPair());
    }

    static String zzd(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            byte[] bArr = digest;
            bArr[0] = (byte) (112 + (15 & digest[0]));
            return Base64.encodeToString(bArr, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            int w = Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    @Deprecated
    public long getCreationTime() {
        return zzbx.zzj(this.zzca).getCreationTime();
    }

    @Deprecated
    public void deleteInstanceID() throws IOException {
        zzd(Marker.ANY_MARKER, Marker.ANY_MARKER, (Bundle) null);
        zzo();
    }

    /* access modifiers changed from: package-private */
    public final void zzo() {
        zzbx.zzk(this.zzca);
    }

    @Deprecated
    public void deleteToken(String str, String str2) throws IOException {
        zzd(str, str2, (Bundle) null);
    }

    @C0452ShowFirstParty
    public final void zzd(String str, String str2, Bundle bundle) throws IOException {
        Bundle bundle2;
        Throwable th;
        String str3 = str;
        String str4 = str2;
        Bundle bundle3 = bundle;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            Throwable th2 = th;
            new IOException("MAIN_THREAD");
            throw th2;
        }
        zzbx.zzh(this.zzca, str3, str4);
        if (bundle3 == null) {
            new Bundle();
            bundle3 = bundle2;
        }
        bundle3.putString("sender", str3);
        if (str4 != null) {
            bundle3.putString("scope", str4);
        }
        bundle3.putString("subscription", str3);
        bundle3.putString("delete", "1");
        bundle3.putString("X-delete", "1");
        bundle3.putString("subtype", "".equals(this.zzca) ? str3 : this.zzca);
        bundle3.putString("X-subtype", "".equals(this.zzca) ? str3 : this.zzca);
        String zzi = zzaf.zzi(zzby.zzd(bundle3, getKeyPair()));
    }

    public static zzak zzp() {
        return zzbx;
    }

    @Deprecated
    public String getToken(String str, String str2) throws IOException {
        return getToken(str, str2, (Bundle) null);
    }

    @Deprecated
    public String getToken(String str, String str2, Bundle bundle) throws IOException {
        boolean z;
        Throwable th;
        Bundle bundle2;
        Throwable th2;
        String str3 = str;
        String str4 = str2;
        Bundle bundle3 = bundle;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            Throwable th3 = th2;
            new IOException("MAIN_THREAD");
            throw th3;
        }
        String str5 = null;
        String str6 = str4;
        String str7 = str3;
        String str8 = zzbx.get("appVersion");
        String str9 = str8;
        if (str8 == null || !str9.equals(zzbz)) {
            z = true;
        } else {
            long zzg = zzbx.zzg(this.zzca, str7, str6);
            long j = zzg;
            if (zzg < 0) {
                z = true;
            } else if (System.currentTimeMillis() - j >= zzbw) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            str5 = zzbx.zzf(this.zzca, str3, str4);
        }
        if (str5 == null) {
            if (bundle3 == null) {
                new Bundle();
                bundle3 = bundle2;
            }
            str5 = zze(str3, str4, bundle3);
            String str10 = str5;
            if (zzbu.get().booleanValue() && str10.contains(Constants.COMMON_SCHEMA_PREFIX_SEPARATOR) && !str10.startsWith(String.valueOf(getId()).concat(Constants.COMMON_SCHEMA_PREFIX_SEPARATOR))) {
                InstanceIDListenerService.zzd(this.zzl, zzbx);
                Throwable th4 = th;
                new IOException("SERVICE_NOT_AVAILABLE");
                throw th4;
            } else if (str5 != null) {
                zzbx.zzd(this.zzca, str3, str4, str5, zzbz);
            }
        }
        return str5;
    }

    public final String zze(String str, String str2, Bundle bundle) throws IOException {
        String str3;
        Throwable th;
        String str4 = str;
        String str5 = str2;
        Bundle bundle2 = bundle;
        if (str5 != null) {
            bundle2.putString("scope", str5);
        }
        bundle2.putString("sender", str4);
        if ("".equals(this.zzca)) {
            str3 = str4;
        } else {
            str3 = this.zzca;
        }
        String str6 = str3;
        if (!bundle2.containsKey("legacy.register")) {
            bundle2.putString("subscription", str4);
            bundle2.putString("subtype", str6);
            bundle2.putString("X-subscription", str4);
            bundle2.putString("X-subtype", str6);
        }
        String zzi = zzaf.zzi(zzby.zzd(bundle2, getKeyPair()));
        if (!"RST".equals(zzi) && !zzi.startsWith("RST|")) {
            return zzi;
        }
        InstanceIDListenerService.zzd(this.zzl, zzbx);
        Throwable th2 = th;
        new IOException("SERVICE_NOT_AVAILABLE");
        throw th2;
    }

    static {
        Map<String, InstanceID> map;
        new ArrayMap();
        zzbv = map;
    }
}

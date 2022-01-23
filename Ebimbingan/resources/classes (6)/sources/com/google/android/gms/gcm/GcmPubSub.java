package com.google.android.gms.gcm;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.iid.InstanceID;
import java.io.IOException;
import java.util.regex.Pattern;

@Deprecated
public class GcmPubSub {
    private static GcmPubSub zzo;
    private static final Pattern zzq = Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
    private InstanceID zzp;

    private GcmPubSub(Context context) {
        this.zzp = InstanceID.getInstance(context);
    }

    @Deprecated
    public static synchronized GcmPubSub getInstance(Context context) {
        GcmPubSub gcmPubSub;
        GcmPubSub gcmPubSub2;
        Context context2 = context;
        synchronized (GcmPubSub.class) {
            if (zzo == null) {
                GoogleCloudMessaging.zze(context2);
                new GcmPubSub(context2);
                zzo = gcmPubSub2;
            }
            gcmPubSub = zzo;
        }
        return gcmPubSub;
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    @Deprecated
    public void subscribe(String str, String str2, Bundle bundle) throws IOException {
        String str3;
        String str4;
        String str5;
        String str6;
        Bundle bundle2;
        String str7 = str;
        String str8 = str2;
        Bundle bundle3 = bundle;
        if (str7 == null || str7.isEmpty()) {
            IllegalArgumentException illegalArgumentException = r9;
            String valueOf = String.valueOf(str7);
            String str9 = valueOf;
            if (valueOf.length() != 0) {
                str4 = "Invalid appInstanceToken: ".concat(str9);
            } else {
                str4 = str3;
                new String("Invalid appInstanceToken: ");
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(str4);
            throw illegalArgumentException;
        } else if (str8 == null || !zzq.matcher(str8).matches()) {
            IllegalArgumentException illegalArgumentException3 = r9;
            String valueOf2 = String.valueOf(str8);
            String str10 = valueOf2;
            if (valueOf2.length() != 0) {
                str6 = "Invalid topic name: ".concat(str10);
            } else {
                str6 = str5;
                new String("Invalid topic name: ");
            }
            IllegalArgumentException illegalArgumentException4 = new IllegalArgumentException(str6);
            throw illegalArgumentException3;
        } else {
            if (bundle3 == null) {
                new Bundle();
                bundle3 = bundle2;
            }
            bundle3.putString("gcm.topic", str8);
            String token = this.zzp.getToken(str7, str8, bundle3);
        }
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    @Deprecated
    public void unsubscribe(String str, String str2) throws IOException {
        Bundle bundle;
        String str3 = str2;
        new Bundle();
        Bundle bundle2 = bundle;
        Bundle bundle3 = bundle2;
        bundle2.putString("gcm.topic", str3);
        this.zzp.zzd(str, str3, bundle3);
    }
}

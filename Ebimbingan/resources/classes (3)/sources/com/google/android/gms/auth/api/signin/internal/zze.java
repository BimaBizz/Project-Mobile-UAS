package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zze implements Runnable {
    private static final Logger zzci;
    private final String zzcj;
    private final StatusPendingResult zzck;

    private zze(String str) {
        StatusPendingResult statusPendingResult;
        this.zzcj = Preconditions.checkNotEmpty(str);
        new StatusPendingResult((GoogleApiClient) null);
        this.zzck = statusPendingResult;
    }

    public final void run() {
        String str;
        String str2;
        String str3;
        String str4;
        URL url;
        String str5;
        String str6;
        StringBuilder sb;
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            URL url2 = url;
            String valueOf = String.valueOf("https://accounts.google.com/o/oauth2/revoke?token=");
            String valueOf2 = String.valueOf(this.zzcj);
            String str7 = valueOf2;
            if (valueOf2.length() != 0) {
                str6 = valueOf.concat(str7);
            } else {
                String str8 = valueOf;
                str6 = str5;
                new String(str8);
            }
            new URL(str6);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            int i = responseCode;
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                zzci.e("Unable to revoke access!", new Object[0]);
            }
            Logger logger = zzci;
            new StringBuilder(26);
            logger.d(sb.append("Response Code: ").append(i).toString(), new Object[0]);
        } catch (IOException e) {
            IOException iOException = e;
            Logger logger2 = zzci;
            String valueOf3 = String.valueOf(iOException.toString());
            String str9 = valueOf3;
            if (valueOf3.length() != 0) {
                str4 = "IOException when revoking access: ".concat(str9);
            } else {
                str4 = str3;
                new String("IOException when revoking access: ");
            }
            logger2.e(str4, new Object[0]);
        } catch (Exception e2) {
            Exception exc = e2;
            Logger logger3 = zzci;
            String valueOf4 = String.valueOf(exc.toString());
            String str10 = valueOf4;
            if (valueOf4.length() != 0) {
                str2 = "Exception when revoking access: ".concat(str10);
            } else {
                str2 = str;
                new String("Exception when revoking access: ");
            }
            logger3.e(str2, new Object[0]);
        }
        this.zzck.setResult(status);
    }

    public static PendingResult<Status> zzi(@Nullable String str) {
        zze zze;
        Thread thread;
        Result result;
        String str2 = str;
        if (str2 == null) {
            new Status(4);
            return PendingResults.immediateFailedResult(result, (GoogleApiClient) null);
        }
        new zze(str2);
        zze zze2 = zze;
        new Thread(zze2);
        thread.start();
        return zze2.zzck;
    }

    static {
        Logger logger;
        new Logger("RevokeAccessOperation", new String[0]);
        zzci = logger;
    }
}

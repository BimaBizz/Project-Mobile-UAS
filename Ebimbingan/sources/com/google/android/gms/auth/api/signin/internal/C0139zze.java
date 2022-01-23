package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0226PendingResults;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0266StatusPendingResult;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.logging.C0547Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.shaded.apache.http.client.utils.URLEncodedUtils;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zze */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0139zze implements Runnable {
    private static final C0547Logger zzci;
    private final String zzcj;
    private final C0266StatusPendingResult zzck;

    private C0139zze(String str) {
        C0266StatusPendingResult statusPendingResult;
        this.zzcj = C0446Preconditions.checkNotEmpty(str);
        new C0266StatusPendingResult((C0222GoogleApiClient) null);
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
        C0236Status status = C0236Status.RESULT_INTERNAL_ERROR;
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
            httpURLConnection.setRequestProperty("Content-Type", URLEncodedUtils.CONTENT_TYPE);
            int responseCode = httpURLConnection.getResponseCode();
            int i = responseCode;
            if (responseCode == 200) {
                status = C0236Status.RESULT_SUCCESS;
            } else {
                zzci.e("Unable to revoke access!", new Object[0]);
            }
            C0547Logger logger = zzci;
            new StringBuilder(26);
            logger.d(sb.append("Response Code: ").append(i).toString(), new Object[0]);
        } catch (IOException e) {
            IOException iOException = e;
            C0547Logger logger2 = zzci;
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
            C0547Logger logger3 = zzci;
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

    public static C0225PendingResult<C0236Status> zzi(@Nullable String str) {
        C0139zze zze;
        Thread thread;
        C0231Result result;
        String str2 = str;
        if (str2 == null) {
            new C0236Status(4);
            return C0226PendingResults.immediateFailedResult(result, (C0222GoogleApiClient) null);
        }
        new C0139zze(str2);
        C0139zze zze2 = zze;
        new Thread(zze2);
        thread.start();
        return zze2.zzck;
    }

    static {
        C0547Logger logger;
        new C0547Logger("RevokeAccessOperation", new String[0]);
        zzci = logger;
    }
}

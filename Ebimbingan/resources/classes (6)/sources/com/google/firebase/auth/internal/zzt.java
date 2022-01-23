package com.google.firebase.auth.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.firebase.client.utilities.Base64;
import com.google.android.gms.common.api.Status;
import com.google.firebase.FirebaseError;
import com.shaded.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.util.Arrays;
import java.util.List;
import org.shaded.apache.commons.logging.impl.SimpleLog;
import org.shaded.apache.http.conn.params.ConnManagerParams;
import org.shaded.apache.http.protocol.HTTP;
import org.shaded.apache.http.util.LangUtils;

public final class zzt {
    @NonNull
    public static Status zzdc(@Nullable String str) {
        Status status;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            new Status(FirebaseError.ERROR_INTERNAL_ERROR);
            return status;
        }
        String str3 = ":";
        String str4 = str3;
        String[] split = str2.split(str3, 2);
        String[] strArr = split;
        split[0] = strArr[0].trim();
        if (strArr.length > 1 && strArr[1] != null) {
            strArr[1] = strArr[1].trim();
        }
        List asList = Arrays.asList(strArr);
        List list = asList;
        if (asList.size() > 1) {
            return zzc((String) list.get(0), (String) list.get(1));
        }
        return zzc((String) list.get(0), (String) null);
    }

    @NonNull
    private static Status zzc(String str, @Nullable String str2) {
        int i;
        Status status;
        Status status2;
        Status status3;
        StringBuilder sb;
        String str3 = str;
        String str4 = str2;
        String str5 = str3;
        boolean z = true;
        switch (str5.hashCode()) {
            case -2065866930:
                if (str5.equals("INVALID_RECIPIENT_EMAIL")) {
                    z = true;
                    break;
                }
                break;
            case -2014808264:
                if (str5.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    z = true;
                    break;
                }
                break;
            case -2001169389:
                if (str5.equals("INVALID_IDP_RESPONSE")) {
                    z = true;
                    break;
                }
                break;
            case -1944433728:
                if (str5.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    z = true;
                    break;
                }
                break;
            case -1800638118:
                if (str5.equals("QUOTA_EXCEEDED")) {
                    z = true;
                    break;
                }
                break;
            case -1774756919:
                if (str5.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    z = true;
                    break;
                }
                break;
            case -1587614300:
                if (str5.equals("EXPIRED_OOB_CODE")) {
                    z = true;
                    break;
                }
                break;
            case -1583894766:
                if (str5.equals("INVALID_OOB_CODE")) {
                    z = true;
                    break;
                }
                break;
            case -1458751677:
                if (str5.equals("MISSING_EMAIL")) {
                    z = true;
                    break;
                }
                break;
            case -1421414571:
                if (str5.equals("INVALID_CODE")) {
                    z = true;
                    break;
                }
                break;
            case -1345867105:
                if (str5.equals("TOKEN_EXPIRED")) {
                    z = true;
                    break;
                }
                break;
            case -1340100504:
                if (str5.equals("INVALID_TENANT_ID")) {
                    z = true;
                    break;
                }
                break;
            case -1232010689:
                if (str5.equals("INVALID_SESSION_INFO")) {
                    z = true;
                    break;
                }
                break;
            case -1112393964:
                if (str5.equals("INVALID_EMAIL")) {
                    z = true;
                    break;
                }
                break;
            case -863830559:
                if (str5.equals("INVALID_CERT_HASH")) {
                    z = true;
                    break;
                }
                break;
            case -828507413:
                if (str5.equals("NO_SUCH_PROVIDER")) {
                    z = false;
                    break;
                }
                break;
            case -736207500:
                if (str5.equals("MISSING_PASSWORD")) {
                    z = true;
                    break;
                }
                break;
            case -646022241:
                if (str5.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    z = true;
                    break;
                }
                break;
            case -595928767:
                if (str5.equals("TIMEOUT")) {
                    z = true;
                    break;
                }
                break;
            case -333672188:
                if (str5.equals("OPERATION_NOT_ALLOWED")) {
                    z = true;
                    break;
                }
                break;
            case -294485423:
                if (str5.equals("WEB_INTERNAL_ERROR")) {
                    z = true;
                    break;
                }
                break;
            case -75433118:
                if (str5.equals("USER_NOT_FOUND")) {
                    z = true;
                    break;
                }
                break;
            case -40686718:
                if (str5.equals("WEAK_PASSWORD")) {
                    z = true;
                    break;
                }
                break;
            case 15352275:
                if (str5.equals("EMAIL_NOT_FOUND")) {
                    z = true;
                    break;
                }
                break;
            case 269327773:
                if (str5.equals("INVALID_SENDER")) {
                    z = true;
                    break;
                }
                break;
            case 278802867:
                if (str5.equals("MISSING_PHONE_NUMBER")) {
                    z = true;
                    break;
                }
                break;
            case 408411681:
                if (str5.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    z = true;
                    break;
                }
                break;
            case 483847807:
                if (str5.equals("EMAIL_EXISTS")) {
                    z = true;
                    break;
                }
                break;
            case 491979549:
                if (str5.equals("INVALID_ID_TOKEN")) {
                    z = true;
                    break;
                }
                break;
            case 492072102:
                if (str5.equals("WEB_STORAGE_UNSUPPORTED")) {
                    z = true;
                    break;
                }
                break;
            case 542728406:
                if (str5.equals("PASSWORD_LOGIN_DISABLED")) {
                    z = true;
                    break;
                }
                break;
            case 605031096:
                if (str5.equals("REJECTED_CREDENTIAL")) {
                    z = true;
                    break;
                }
                break;
            case 786916712:
                if (str5.equals("INVALID_VERIFICATION_PROOF")) {
                    z = true;
                    break;
                }
                break;
            case 799258561:
                if (str5.equals("INVALID_PROVIDER_ID")) {
                    z = true;
                    break;
                }
                break;
            case 819646646:
                if (str5.equals("CREDENTIAL_MISMATCH")) {
                    z = true;
                    break;
                }
                break;
            case 844240628:
                if (str5.equals("WEB_CONTEXT_CANCELED")) {
                    z = true;
                    break;
                }
                break;
            case 886186878:
                if (str5.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    z = true;
                    break;
                }
                break;
            case 922685102:
                if (str5.equals("INVALID_MESSAGE_PAYLOAD")) {
                    z = true;
                    break;
                }
                break;
            case 989000548:
                if (str5.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    z = true;
                    break;
                }
                break;
            case 1034932393:
                if (str5.equals("INVALID_PENDING_TOKEN")) {
                    z = true;
                    break;
                }
                break;
            case 1072360691:
                if (str5.equals("INVALID_CUSTOM_TOKEN")) {
                    z = true;
                    break;
                }
                break;
            case 1094975491:
                if (str5.equals("INVALID_PASSWORD")) {
                    z = true;
                    break;
                }
                break;
            case 1107081238:
                if (str5.equals("<<Network Error>>")) {
                    z = true;
                    break;
                }
                break;
            case 1141576252:
                if (str5.equals("SESSION_EXPIRED")) {
                    z = true;
                    break;
                }
                break;
            case 1199811910:
                if (str5.equals("MISSING_CODE")) {
                    z = true;
                    break;
                }
                break;
            case 1226505451:
                if (str5.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    z = true;
                    break;
                }
                break;
            case 1388786705:
                if (str5.equals("INVALID_IDENTIFIER")) {
                    z = true;
                    break;
                }
                break;
            case 1433767024:
                if (str5.equals("USER_DISABLED")) {
                    z = true;
                    break;
                }
                break;
            case 1442968770:
                if (str5.equals("INVALID_PHONE_NUMBER")) {
                    z = true;
                    break;
                }
                break;
            case 1494923453:
                if (str5.equals("INVALID_APP_CREDENTIAL")) {
                    z = true;
                    break;
                }
                break;
            case 1497901284:
                if (str5.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    z = true;
                    break;
                }
                break;
            case 1803454477:
                if (str5.equals("MISSING_CONTINUE_URI")) {
                    z = true;
                    break;
                }
                break;
            case 1898790704:
                if (str5.equals("MISSING_SESSION_INFO")) {
                    z = true;
                    break;
                }
                break;
            case 2082564316:
                if (str5.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                i = FirebaseError.ERROR_NO_SUCH_PROVIDER;
                break;
            case true:
                i = FirebaseError.ERROR_CUSTOM_TOKEN_MISMATCH;
                break;
            case true:
                i = FirebaseError.ERROR_INVALID_CUSTOM_TOKEN;
                break;
            case true:
            case true:
                i = FirebaseError.ERROR_INVALID_CREDENTIAL;
                break;
            case true:
                i = FirebaseError.ERROR_USER_DISABLED;
                break;
            case SimpleLog.LOG_LEVEL_FATAL /*6*/:
            case SimpleLog.LOG_LEVEL_OFF /*7*/:
                i = FirebaseError.ERROR_INVALID_EMAIL;
                break;
            case Base64.DO_BREAK_LINES:
            case HTTP.HT /*9*/:
                i = FirebaseError.ERROR_USER_NOT_FOUND;
                break;
            case HTTP.LF /*10*/:
                i = FirebaseError.ERROR_EMAIL_ALREADY_IN_USE;
                break;
            case true:
                i = FirebaseError.ERROR_WRONG_PASSWORD;
                break;
            case true:
                i = FirebaseError.ERROR_CREDENTIAL_ALREADY_IN_USE;
                break;
            case HTTP.CR /*13*/:
                i = FirebaseError.ERROR_INVALID_USER_TOKEN;
                break;
            case true:
            case true:
                i = FirebaseError.ERROR_NETWORK_REQUEST_FAILED;
                break;
            case true:
                i = FirebaseError.ERROR_WEAK_PASSWORD;
                break;
            case LangUtils.HASH_SEED /*17*/:
            case true:
                i = FirebaseError.ERROR_OPERATION_NOT_ALLOWED;
                break;
            case true:
                i = FirebaseError.ERROR_APP_NOT_AUTHORIZED;
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                i = FirebaseError.ERROR_REQUIRES_RECENT_LOGIN;
                break;
            case true:
            case true:
                i = FirebaseError.ERROR_TOO_MANY_REQUESTS;
                break;
            case true:
                i = FirebaseError.ERROR_USER_TOKEN_EXPIRED;
                break;
            case true:
                i = 17030;
                break;
            case true:
                i = 17029;
                break;
            case true:
                i = 17031;
                break;
            case true:
                i = 17032;
                break;
            case true:
                i = 17033;
                break;
            case true:
                i = 17034;
                break;
            case true:
                i = 17035;
                break;
            case true:
                i = 17041;
                break;
            case true:
                i = 17042;
                break;
            case CharsToNameCanonicalizer.HASH_MULT /*33*/:
                i = 17043;
                break;
            case true:
                i = 17044;
                break;
            case true:
                i = 17045;
                break;
            case true:
                i = 17046;
                break;
            case LangUtils.HASH_OFFSET /*37*/:
                i = 17049;
                break;
            case true:
                i = 17051;
                break;
            case true:
                i = 17052;
                break;
            case true:
                i = 17064;
                break;
            case true:
                i = 17061;
                break;
            case true:
                i = 17062;
                break;
            case true:
                i = 17065;
                break;
            case true:
                i = 17040;
                break;
            case true:
                i = 17068;
                break;
            case true:
                i = 17071;
                break;
            case true:
                i = 17057;
                break;
            case true:
                i = 17058;
                break;
            case true:
                i = 17073;
                break;
            case true:
                i = 17079;
                break;
            case true:
                i = 17074;
                break;
            case true:
                i = 17075;
                break;
            case true:
                i = 17078;
                break;
            default:
                i = FirebaseError.ERROR_INTERNAL_ERROR;
                break;
        }
        int i2 = i;
        int i3 = i2;
        if (i2 != 17499) {
            new Status(i3, str4);
            return status;
        } else if (str4 != null) {
            Status status4 = status3;
            new StringBuilder(1 + String.valueOf(str3).length() + String.valueOf(str4).length());
            new Status(i3, sb.append(str3).append(":").append(str4).toString());
            return status4;
        } else {
            new Status(i3, str3);
            return status2;
        }
    }
}

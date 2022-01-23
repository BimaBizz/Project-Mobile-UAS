package com.google.firebase.auth.api.internal;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzaj;
import com.google.android.gms.internal.firebase_auth.zzeb;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.internal.zzp;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.zzac;
import com.google.firebase.auth.zzu;
import com.google.firebase.auth.zzx;
import java.util.ArrayList;
import java.util.List;

public final class zzdr {
    @VisibleForTesting
    private static final SparseArray<Pair<String, String>> zzov;

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.firebase.FirebaseException zzb(com.google.android.gms.common.api.Status r10) {
        /*
            r0 = r10
            r4 = r0
            int r4 = r4.getStatusCode()
            r9 = r4
            r4 = r9
            r5 = r9
            r1 = r5
            java.lang.String r4 = zzi(r4)
            r5 = r0
            java.lang.String r4 = zza((java.lang.String) r4, (com.google.android.gms.common.api.Status) r5)
            r2 = r4
            r4 = r1
            switch(r4) {
                case 17000: goto L_0x0108;
                case 17002: goto L_0x0108;
                case 17004: goto L_0x0108;
                case 17005: goto L_0x0045;
                case 17006: goto L_0x0157;
                case 17007: goto L_0x0035;
                case 17008: goto L_0x0108;
                case 17009: goto L_0x0108;
                case 17010: goto L_0x006a;
                case 17011: goto L_0x0045;
                case 17012: goto L_0x0035;
                case 17014: goto L_0x0025;
                case 17015: goto L_0x00bc;
                case 17016: goto L_0x00a7;
                case 17017: goto L_0x0045;
                case 17020: goto L_0x007e;
                case 17021: goto L_0x0045;
                case 17024: goto L_0x0108;
                case 17025: goto L_0x0035;
                case 17026: goto L_0x0055;
                case 17028: goto L_0x0157;
                case 17029: goto L_0x00e6;
                case 17030: goto L_0x00e6;
                case 17031: goto L_0x00f7;
                case 17032: goto L_0x00f7;
                case 17033: goto L_0x00f7;
                case 17034: goto L_0x0108;
                case 17035: goto L_0x0108;
                case 17040: goto L_0x0157;
                case 17041: goto L_0x0108;
                case 17042: goto L_0x0108;
                case 17043: goto L_0x0108;
                case 17044: goto L_0x0108;
                case 17045: goto L_0x0108;
                case 17046: goto L_0x0108;
                case 17049: goto L_0x0108;
                case 17051: goto L_0x0108;
                case 17052: goto L_0x0119;
                case 17057: goto L_0x0146;
                case 17058: goto L_0x0146;
                case 17061: goto L_0x0131;
                case 17062: goto L_0x0146;
                case 17063: goto L_0x0125;
                case 17064: goto L_0x0157;
                case 17065: goto L_0x0146;
                case 17068: goto L_0x0157;
                case 17071: goto L_0x0157;
                case 17072: goto L_0x0157;
                case 17073: goto L_0x0157;
                case 17074: goto L_0x0157;
                case 17075: goto L_0x0108;
                case 17077: goto L_0x0108;
                case 17079: goto L_0x0157;
                case 17080: goto L_0x0125;
                case 17495: goto L_0x00d1;
                case 17499: goto L_0x0092;
                default: goto L_0x0018;
            }
        L_0x0018:
            com.google.firebase.FirebaseException r4 = new com.google.firebase.FirebaseException
            r9 = r4
            r4 = r9
            r5 = r9
            java.lang.String r6 = "An internal error has occurred."
            r5.<init>(r6)
            r0 = r4
        L_0x0024:
            return r0
        L_0x0025:
            com.google.firebase.auth.FirebaseAuthRecentLoginRequiredException r4 = new com.google.firebase.auth.FirebaseAuthRecentLoginRequiredException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r1
            java.lang.String r6 = zzh(r6)
            r7 = r2
            r5.<init>(r6, r7)
            r0 = r4
            goto L_0x0024
        L_0x0035:
            com.google.firebase.auth.FirebaseAuthUserCollisionException r4 = new com.google.firebase.auth.FirebaseAuthUserCollisionException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r1
            java.lang.String r6 = zzh(r6)
            r7 = r2
            r5.<init>(r6, r7)
            r0 = r4
            goto L_0x0024
        L_0x0045:
            com.google.firebase.auth.FirebaseAuthInvalidUserException r4 = new com.google.firebase.auth.FirebaseAuthInvalidUserException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r1
            java.lang.String r6 = zzh(r6)
            r7 = r2
            r5.<init>(r6, r7)
            r0 = r4
            goto L_0x0024
        L_0x0055:
            com.google.firebase.auth.FirebaseAuthWeakPasswordException r4 = new com.google.firebase.auth.FirebaseAuthWeakPasswordException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r1
            java.lang.String r6 = zzh(r6)
            r7 = r2
            r8 = r0
            java.lang.String r8 = r8.getStatusMessage()
            r5.<init>(r6, r7, r8)
            r0 = r4
            goto L_0x0024
        L_0x006a:
            java.lang.String r4 = "We have blocked all requests from this device due to unusual activity. Try again later."
            r5 = r0
            java.lang.String r4 = zza((java.lang.String) r4, (com.google.android.gms.common.api.Status) r5)
            r3 = r4
            com.google.firebase.FirebaseTooManyRequestsException r4 = new com.google.firebase.FirebaseTooManyRequestsException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r3
            r5.<init>(r6)
            r0 = r4
            goto L_0x0024
        L_0x007e:
            java.lang.String r4 = "A network error (such as timeout, interrupted connection or unreachable host) has occurred."
            r5 = r0
            java.lang.String r4 = zza((java.lang.String) r4, (com.google.android.gms.common.api.Status) r5)
            r3 = r4
            com.google.firebase.FirebaseNetworkException r4 = new com.google.firebase.FirebaseNetworkException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r3
            r5.<init>(r6)
            r0 = r4
            goto L_0x0024
        L_0x0092:
            java.lang.String r4 = "An internal error has occurred."
            r5 = r0
            java.lang.String r4 = zza((java.lang.String) r4, (com.google.android.gms.common.api.Status) r5)
            r3 = r4
            com.google.firebase.FirebaseException r4 = new com.google.firebase.FirebaseException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r3
            r5.<init>(r6)
            r0 = r4
            goto L_0x0024
        L_0x00a7:
            java.lang.String r4 = "User was not linked to an account with the given provider."
            r5 = r0
            java.lang.String r4 = zza((java.lang.String) r4, (com.google.android.gms.common.api.Status) r5)
            r3 = r4
            com.google.firebase.FirebaseException r4 = new com.google.firebase.FirebaseException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r3
            r5.<init>(r6)
            r0 = r4
            goto L_0x0024
        L_0x00bc:
            java.lang.String r4 = "User has already been linked to the given provider."
            r5 = r0
            java.lang.String r4 = zza((java.lang.String) r4, (com.google.android.gms.common.api.Status) r5)
            r3 = r4
            com.google.firebase.FirebaseException r4 = new com.google.firebase.FirebaseException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r3
            r5.<init>(r6)
            r0 = r4
            goto L_0x0024
        L_0x00d1:
            java.lang.String r4 = "Please sign in before trying to get a token."
            r5 = r0
            java.lang.String r4 = zza((java.lang.String) r4, (com.google.android.gms.common.api.Status) r5)
            r3 = r4
            com.google.firebase.internal.api.FirebaseNoSignedInUserException r4 = new com.google.firebase.internal.api.FirebaseNoSignedInUserException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r3
            r5.<init>(r6)
            r0 = r4
            goto L_0x0024
        L_0x00e6:
            com.google.firebase.auth.FirebaseAuthActionCodeException r4 = new com.google.firebase.auth.FirebaseAuthActionCodeException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r1
            java.lang.String r6 = zzh(r6)
            r7 = r2
            r5.<init>(r6, r7)
            r0 = r4
            goto L_0x0024
        L_0x00f7:
            com.google.firebase.auth.FirebaseAuthEmailException r4 = new com.google.firebase.auth.FirebaseAuthEmailException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r1
            java.lang.String r6 = zzh(r6)
            r7 = r2
            r5.<init>(r6, r7)
            r0 = r4
            goto L_0x0024
        L_0x0108:
            com.google.firebase.auth.FirebaseAuthInvalidCredentialsException r4 = new com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r1
            java.lang.String r6 = zzh(r6)
            r7 = r2
            r5.<init>(r6, r7)
            r0 = r4
            goto L_0x0024
        L_0x0119:
            com.google.firebase.FirebaseTooManyRequestsException r4 = new com.google.firebase.FirebaseTooManyRequestsException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r2
            r5.<init>(r6)
            r0 = r4
            goto L_0x0024
        L_0x0125:
            com.google.firebase.FirebaseApiNotAvailableException r4 = new com.google.firebase.FirebaseApiNotAvailableException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r2
            r5.<init>(r6)
            r0 = r4
            goto L_0x0024
        L_0x0131:
            java.lang.String r4 = "There was a failure in the connection between the web widget and the Firebase Auth backend."
            r5 = r0
            java.lang.String r4 = zza((java.lang.String) r4, (com.google.android.gms.common.api.Status) r5)
            r3 = r4
            com.google.firebase.FirebaseNetworkException r4 = new com.google.firebase.FirebaseNetworkException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r3
            r5.<init>(r6)
            r0 = r4
            goto L_0x0024
        L_0x0146:
            com.google.firebase.auth.FirebaseAuthWebException r4 = new com.google.firebase.auth.FirebaseAuthWebException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r1
            java.lang.String r6 = zzh(r6)
            r7 = r2
            r5.<init>(r6, r7)
            r0 = r4
            goto L_0x0024
        L_0x0157:
            com.google.firebase.auth.FirebaseAuthException r4 = new com.google.firebase.auth.FirebaseAuthException
            r9 = r4
            r4 = r9
            r5 = r9
            r6 = r1
            java.lang.String r6 = zzh(r6)
            r7 = r2
            r5.<init>(r6, r7)
            r0 = r4
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzdr.zzb(com.google.android.gms.common.api.Status):com.google.firebase.FirebaseException");
    }

    public static FirebaseAuthUserCollisionException zza(Status status, AuthCredential authCredential, @Nullable String str, @Nullable String str2) {
        FirebaseAuthUserCollisionException firebaseAuthUserCollisionException;
        Status status2 = status;
        int statusCode = status2.getStatusCode();
        String zza = zza(zzi(statusCode), status2);
        new FirebaseAuthUserCollisionException(zzh(statusCode), zza);
        return firebaseAuthUserCollisionException.zza(authCredential).zzbt(str).zzbu(str2);
    }

    public static zzu zza(FirebaseAuth firebaseAuth, zzeb zzeb) {
        List list;
        FirebaseAuth firebaseAuth2 = firebaseAuth;
        zzeb zzeb2 = zzeb;
        Object checkNotNull = zzaj.checkNotNull(firebaseAuth2);
        Object checkNotNull2 = zzaj.checkNotNull(zzeb2);
        Pair pair = zzov.get(17078);
        zzu zzu = r19;
        String str = (String) pair.first;
        String str2 = (String) pair.second;
        FirebaseAuth firebaseAuth3 = firebaseAuth2;
        zzeb zzeb3 = zzeb2;
        zzp zzp = r19;
        List<zzx> zzdp = zzeb3.zzdp();
        new ArrayList();
        List list2 = list;
        for (zzx next : zzdp) {
            zzx zzx = next;
            if (next instanceof zzac) {
                boolean add = list2.add((zzac) zzx);
            }
        }
        zzp zzp2 = new zzp(list2, zzr.zza(zzeb3.zzdp(), zzeb3.zzbb()), firebaseAuth3.zzcu().getName(), zzeb3.zzdo());
        zzu zzu2 = new zzu(str, str2, zzp);
        return zzu;
    }

    private static String zza(String str, Status status) {
        String str2 = str;
        Status status2 = status;
        if (TextUtils.isEmpty(status2.getStatusMessage())) {
            return str2;
        }
        return String.format(String.valueOf(str2).concat(" [ %s ]"), new Object[]{status2.getStatusMessage()});
    }

    private static String zzh(int i) {
        Pair pair = zzov.get(i);
        return pair != null ? (String) pair.first : "INTERNAL_ERROR";
    }

    private static String zzi(int i) {
        Pair pair = zzov.get(i);
        return pair != null ? (String) pair.second : "An internal error has occurred.";
    }

    static {
        SparseArray sparseArray;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22;
        Object obj23;
        Object obj24;
        Object obj25;
        Object obj26;
        Object obj27;
        Object obj28;
        Object obj29;
        Object obj30;
        Object obj31;
        Object obj32;
        Object obj33;
        Object obj34;
        Object obj35;
        Object obj36;
        Object obj37;
        Object obj38;
        Object obj39;
        Object obj40;
        Object obj41;
        Object obj42;
        Object obj43;
        Object obj44;
        Object obj45;
        Object obj46;
        Object obj47;
        Object obj48;
        Object obj49;
        Object obj50;
        new SparseArray();
        SparseArray sparseArray2 = sparseArray;
        zzov = sparseArray2;
        new Pair("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation.");
        sparseArray2.put(FirebaseError.ERROR_INVALID_CUSTOM_TOKEN, obj);
        new Pair("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience.");
        zzov.put(FirebaseError.ERROR_CUSTOM_TOKEN_MISMATCH, obj2);
        new Pair("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is malformed or has expired.");
        zzov.put(FirebaseError.ERROR_INVALID_CREDENTIAL, obj3);
        new Pair("ERROR_INVALID_EMAIL", "The email address is badly formatted.");
        zzov.put(FirebaseError.ERROR_INVALID_EMAIL, obj4);
        new Pair("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password.");
        zzov.put(FirebaseError.ERROR_WRONG_PASSWORD, obj5);
        new Pair("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user.");
        zzov.put(FirebaseError.ERROR_USER_MISMATCH, obj6);
        new Pair("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request.");
        zzov.put(FirebaseError.ERROR_REQUIRES_RECENT_LOGIN, obj7);
        new Pair("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address.");
        zzov.put(FirebaseError.ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL, obj8);
        new Pair("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account.");
        zzov.put(FirebaseError.ERROR_EMAIL_ALREADY_IN_USE, obj9);
        new Pair("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account.");
        zzov.put(FirebaseError.ERROR_CREDENTIAL_ALREADY_IN_USE, obj10);
        new Pair("ERROR_USER_DISABLED", "The user account has been disabled by an administrator.");
        zzov.put(FirebaseError.ERROR_USER_DISABLED, obj11);
        new Pair("ERROR_USER_TOKEN_EXPIRED", "The user's credential is no longer valid. The user must sign in again.");
        zzov.put(FirebaseError.ERROR_USER_TOKEN_EXPIRED, obj12);
        new Pair("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted.");
        zzov.put(FirebaseError.ERROR_USER_NOT_FOUND, obj13);
        new Pair("ERROR_INVALID_USER_TOKEN", "This user's credential isn't valid for this project. This can happen if the user's token has been tampered with, or if the user isn't for the project associated with this API key.");
        zzov.put(FirebaseError.ERROR_INVALID_USER_TOKEN, obj14);
        new Pair("ERROR_OPERATION_NOT_ALLOWED", "The given sign-in provider is disabled for this Firebase project. Enable it in the Firebase console, under the sign-in method tab of the Auth section.");
        zzov.put(FirebaseError.ERROR_OPERATION_NOT_ALLOWED, obj15);
        new Pair("ERROR_WEAK_PASSWORD", "The given password is invalid.");
        zzov.put(FirebaseError.ERROR_WEAK_PASSWORD, obj16);
        new Pair("ERROR_EXPIRED_ACTION_CODE", "The out of band code has expired.");
        zzov.put(17029, obj17);
        new Pair("ERROR_INVALID_ACTION_CODE", "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used.");
        zzov.put(17030, obj18);
        new Pair("ERROR_INVALID_MESSAGE_PAYLOAD", "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console.");
        zzov.put(17031, obj19);
        new Pair("ERROR_INVALID_RECIPIENT_EMAIL", "The email corresponding to this action failed to send as the provided recipient email address is invalid.");
        zzov.put(17033, obj20);
        new Pair("ERROR_INVALID_SENDER", "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console.");
        zzov.put(17032, obj21);
        new Pair("ERROR_MISSING_EMAIL", "An email address must be provided.");
        zzov.put(17034, obj22);
        new Pair("ERROR_MISSING_PASSWORD", "A password must be provided.");
        zzov.put(17035, obj23);
        new Pair("ERROR_MISSING_PHONE_NUMBER", "To send verification codes, provide a phone number for the recipient.");
        zzov.put(17041, obj24);
        new Pair("ERROR_INVALID_PHONE_NUMBER", "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code].");
        zzov.put(17042, obj25);
        new Pair("ERROR_MISSING_VERIFICATION_CODE", "The Phone Auth Credential was created with an empty sms verification Code");
        zzov.put(17043, obj26);
        new Pair("ERROR_INVALID_VERIFICATION_CODE", "The sms verification code used to create the phone auth credential is invalid. Please resend the verification code sms and be sure use the verification code provided by the user.");
        zzov.put(17044, obj27);
        new Pair("ERROR_MISSING_VERIFICATION_ID", "The Phone Auth Credential was created with an empty verification ID");
        zzov.put(17045, obj28);
        new Pair("ERROR_INVALID_VERIFICATION_ID", "The verification ID used to create the phone auth credential is invalid.");
        zzov.put(17046, obj29);
        new Pair("ERROR_RETRY_PHONE_AUTH", "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication.");
        zzov.put(17049, obj30);
        new Pair("ERROR_SESSION_EXPIRED", "The sms code has expired. Please re-send the verification code to try again.");
        zzov.put(17051, obj31);
        new Pair("ERROR_QUOTA_EXCEEDED", "The sms quota for this project has been exceeded.");
        zzov.put(17052, obj32);
        new Pair("ERROR_APP_NOT_AUTHORIZED", "This app is not authorized to use Firebase Authentication. Please verifythat the correct package name and SHA-1 are configured in the Firebase Console.");
        zzov.put(FirebaseError.ERROR_APP_NOT_AUTHORIZED, obj33);
        new Pair("ERROR_API_NOT_AVAILABLE_WITHOUT_GPS", "The API that you are calling is not available on devices without Google Play Services.");
        zzov.put(17063, obj34);
        new Pair("ERROR_WEB_INTERNAL_ERROR", "There was an internal error in the web widget.");
        zzov.put(17062, obj35);
        new Pair("ERROR_INVALID_CERT_HASH", "There was an error while trying to get your package certificate hash.");
        zzov.put(17064, obj36);
        new Pair("ERROR_WEB_STORAGE_UNSUPPORTED", "This browser is not supported or 3rd party cookies and data may be disabled.");
        zzov.put(17065, obj37);
        new Pair("ERROR_MISSING_CONTINUE_URI", "A continue URL must be provided in the request.");
        zzov.put(17040, obj38);
        new Pair("ERROR_DYNAMIC_LINK_NOT_ACTIVATED", "Please activate Dynamic Links in the Firebase Console and agree to the terms and conditions.");
        zzov.put(17068, obj39);
        new Pair("ERROR_INVALID_PROVIDER_ID", "The provider ID provided for the attempted web operation is invalid.");
        zzov.put(17071, obj40);
        new Pair("ERROR_WEB_CONTEXT_ALREADY_PRESENTED", "A headful operation is already in progress. Please wait for that to finish.");
        zzov.put(17057, obj41);
        new Pair("ERROR_WEB_CONTEXT_CANCELED", "The web operation was canceled by the user.");
        zzov.put(17058, obj42);
        new Pair("ERROR_TENANT_ID_MISMATCH", "The provided tenant ID does not match the Auth instance's tenant ID.");
        zzov.put(17072, obj43);
        new Pair("ERROR_UNSUPPORTED_TENANT_OPERATION", "This operation is not supported in a multi-tenant context.");
        zzov.put(17073, obj44);
        new Pair("ERROR_INVALID_DYNAMIC_LINK_DOMAIN", "The provided dynamic link domain is not configured or authorized for the current project.");
        zzov.put(17074, obj45);
        new Pair("ERROR_REJECTED_CREDENTIAL", "The request contains malformed or mismatching credentials");
        zzov.put(17075, obj46);
        new Pair("ERROR_PHONE_NUMBER_NOT_FOUND", "The provided phone number does not match any of the second factor phone numbers associated with this user.");
        zzov.put(17077, obj47);
        new Pair("ERROR_INVALID_TENANT_ID", "The Auth instance's tenant ID is invalid.");
        zzov.put(17079, obj48);
        new Pair("ERROR_SECOND_FACTOR_REQUIRED", "Please complete a second factor challenge to finish signing into this account.");
        zzov.put(17078, obj49);
        new Pair("ERROR_API_NOT_AVAILABLE", "The API that you are calling is not available.");
        zzov.put(17080, obj50);
    }
}

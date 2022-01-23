package com.google.firebase.auth;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class PhoneAuthProvider {
    public static final String PHONE_SIGN_IN_METHOD = "phone";
    public static final String PROVIDER_ID = "phone";
    private FirebaseAuth zzjr;

    @SafeParcelable.Class(creator = "DefaultForceResendingTokenCreator")
    public static class ForceResendingToken extends AbstractSafeParcelable {
        public static final Parcelable.Creator<ForceResendingToken> CREATOR;

        @SafeParcelable.Constructor
        ForceResendingToken() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2 = i;
            Parcel parcel2 = parcel;
            SafeParcelWriter.finishObjectHeader(parcel2, SafeParcelWriter.beginObjectHeader(parcel2));
        }

        public static ForceResendingToken zzdd() {
            ForceResendingToken forceResendingToken;
            ForceResendingToken forceResendingToken2 = forceResendingToken;
            new ForceResendingToken();
            return forceResendingToken2;
        }

        static {
            Parcelable.Creator<ForceResendingToken> creator;
            new zzd();
            CREATOR = creator;
        }
    }

    public static abstract class OnVerificationStateChangedCallbacks {
        private static final Logger zzjt;

        public OnVerificationStateChangedCallbacks() {
        }

        public abstract void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential);

        public abstract void onVerificationFailed(FirebaseException firebaseException);

        public void onCodeSent(String str, ForceResendingToken forceResendingToken) {
        }

        public void onCodeAutoRetrievalTimeOut(String str) {
            String str2 = str;
            zzjt.i("Sms auto retrieval timed-out.", new Object[0]);
        }

        static {
            Logger logger;
            new Logger("PhoneAuthProvider", new String[0]);
            zzjt = logger;
        }
    }

    private PhoneAuthProvider(FirebaseAuth firebaseAuth) {
        this.zzjr = firebaseAuth;
    }

    public static PhoneAuthProvider getInstance(FirebaseAuth firebaseAuth) {
        PhoneAuthProvider phoneAuthProvider;
        new PhoneAuthProvider(firebaseAuth);
        return phoneAuthProvider;
    }

    public static PhoneAuthProvider getInstance() {
        PhoneAuthProvider phoneAuthProvider;
        PhoneAuthProvider phoneAuthProvider2 = phoneAuthProvider;
        new PhoneAuthProvider(FirebaseAuth.getInstance(FirebaseApp.getInstance()));
        return phoneAuthProvider2;
    }

    public void verifyPhoneNumber(@NonNull String str, long j, TimeUnit timeUnit, @NonNull Activity activity, @NonNull OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        zza(Preconditions.checkNotEmpty(str), j, timeUnit, (Activity) Preconditions.checkNotNull(activity), TaskExecutors.MAIN_THREAD, (OnVerificationStateChangedCallbacks) Preconditions.checkNotNull(onVerificationStateChangedCallbacks), (ForceResendingToken) null);
    }

    public void verifyPhoneNumber(@NonNull String str, long j, TimeUnit timeUnit, @NonNull Executor executor, @NonNull OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        zza(Preconditions.checkNotEmpty(str), j, timeUnit, (Activity) null, (Executor) Preconditions.checkNotNull(executor), (OnVerificationStateChangedCallbacks) Preconditions.checkNotNull(onVerificationStateChangedCallbacks), (ForceResendingToken) null);
    }

    public void verifyPhoneNumber(@NonNull String str, long j, TimeUnit timeUnit, @NonNull Activity activity, @NonNull OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable ForceResendingToken forceResendingToken) {
        zza(Preconditions.checkNotEmpty(str), j, timeUnit, (Activity) Preconditions.checkNotNull(activity), TaskExecutors.MAIN_THREAD, (OnVerificationStateChangedCallbacks) Preconditions.checkNotNull(onVerificationStateChangedCallbacks), forceResendingToken);
    }

    public void verifyPhoneNumber(@NonNull String str, long j, TimeUnit timeUnit, @NonNull Executor executor, @NonNull OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable ForceResendingToken forceResendingToken) {
        zza(Preconditions.checkNotEmpty(str), j, timeUnit, (Activity) null, (Executor) Preconditions.checkNotNull(executor), (OnVerificationStateChangedCallbacks) Preconditions.checkNotNull(onVerificationStateChangedCallbacks), forceResendingToken);
    }

    private final void zza(String str, long j, TimeUnit timeUnit, Activity activity, Executor executor, OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, ForceResendingToken forceResendingToken) {
        this.zzjr.zza(str, j, timeUnit, onVerificationStateChangedCallbacks, activity, executor, forceResendingToken != null);
    }

    public static PhoneAuthCredential getCredential(@NonNull String str, @NonNull String str2) {
        PhoneAuthCredential phoneAuthCredential;
        new PhoneAuthCredential(str, str2, false, (String) null, true, (String) null);
        return phoneAuthCredential;
    }
}

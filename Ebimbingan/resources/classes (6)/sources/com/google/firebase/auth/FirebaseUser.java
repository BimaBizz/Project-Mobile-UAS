package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import java.util.List;

public abstract class FirebaseUser extends AbstractSafeParcelable implements UserInfo {
    public FirebaseUser() {
    }

    @Nullable
    public abstract String getDisplayName();

    @Nullable
    public abstract String getEmail();

    @Nullable
    public abstract FirebaseUserMetadata getMetadata();

    @Nullable
    public abstract String getPhoneNumber();

    @Nullable
    public abstract Uri getPhotoUrl();

    @NonNull
    public abstract List<? extends UserInfo> getProviderData();

    @NonNull
    public abstract String getProviderId();

    @NonNull
    public abstract String getUid();

    public abstract boolean isAnonymous();

    @NonNull
    public abstract FirebaseUser zza(@NonNull List<? extends UserInfo> list);

    public abstract void zza(@NonNull zzes zzes);

    public abstract void zzb(List<zzx> list);

    @Nullable
    public abstract String zzba();

    @NonNull
    public abstract FirebaseApp zzcu();

    @Nullable
    public abstract List<String> zzcw();

    public abstract FirebaseUser zzcx();

    @NonNull
    public abstract zzes zzcy();

    @NonNull
    public abstract String zzcz();

    @NonNull
    public abstract String zzda();

    public abstract zzv zzdb();

    @NonNull
    public Task<GetTokenResult> getIdToken(boolean z) {
        return FirebaseAuth.getInstance(zzcu()).zza(this, z);
    }

    @NonNull
    public Task<Void> reload() {
        return FirebaseAuth.getInstance(zzcu()).zzd(this);
    }

    public Task<Void> reauthenticate(@NonNull AuthCredential authCredential) {
        AuthCredential authCredential2 = authCredential;
        Object checkNotNull = Preconditions.checkNotNull(authCredential2);
        return FirebaseAuth.getInstance(zzcu()).zza(this, authCredential2);
    }

    public Task<AuthResult> reauthenticateAndRetrieveData(@NonNull AuthCredential authCredential) {
        AuthCredential authCredential2 = authCredential;
        Object checkNotNull = Preconditions.checkNotNull(authCredential2);
        return FirebaseAuth.getInstance(zzcu()).zzb(this, authCredential2);
    }

    @NonNull
    public Task<AuthResult> startActivityForReauthenticateWithProvider(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider) {
        Activity activity2 = activity;
        FederatedAuthProvider federatedAuthProvider2 = federatedAuthProvider;
        Object checkNotNull = Preconditions.checkNotNull(activity2);
        Object checkNotNull2 = Preconditions.checkNotNull(federatedAuthProvider2);
        return FirebaseAuth.getInstance(zzcu()).zzb(activity2, federatedAuthProvider2, this);
    }

    @NonNull
    public Task<AuthResult> linkWithCredential(@NonNull AuthCredential authCredential) {
        AuthCredential authCredential2 = authCredential;
        Object checkNotNull = Preconditions.checkNotNull(authCredential2);
        return FirebaseAuth.getInstance(zzcu()).zzc(this, authCredential2);
    }

    @NonNull
    public Task<AuthResult> startActivityForLinkWithProvider(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider) {
        Activity activity2 = activity;
        FederatedAuthProvider federatedAuthProvider2 = federatedAuthProvider;
        Object checkNotNull = Preconditions.checkNotNull(activity2);
        Object checkNotNull2 = Preconditions.checkNotNull(federatedAuthProvider2);
        return FirebaseAuth.getInstance(zzcu()).zza(activity2, federatedAuthProvider2, this);
    }

    public Task<AuthResult> unlink(@NonNull String str) {
        String str2 = str;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        return FirebaseAuth.getInstance(zzcu()).zza(this, str2);
    }

    @NonNull
    public Task<Void> updateProfile(@NonNull UserProfileChangeRequest userProfileChangeRequest) {
        UserProfileChangeRequest userProfileChangeRequest2 = userProfileChangeRequest;
        Object checkNotNull = Preconditions.checkNotNull(userProfileChangeRequest2);
        return FirebaseAuth.getInstance(zzcu()).zza(this, userProfileChangeRequest2);
    }

    @NonNull
    public Task<Void> updateEmail(@NonNull String str) {
        String str2 = str;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        return FirebaseAuth.getInstance(zzcu()).zzb(this, str2);
    }

    public Task<Void> updatePhoneNumber(@NonNull PhoneAuthCredential phoneAuthCredential) {
        return FirebaseAuth.getInstance(zzcu()).zza(this, phoneAuthCredential);
    }

    @NonNull
    public Task<Void> updatePassword(@NonNull String str) {
        String str2 = str;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        return FirebaseAuth.getInstance(zzcu()).zzc(this, str2);
    }

    @NonNull
    public Task<Void> delete() {
        return FirebaseAuth.getInstance(zzcu()).zze(this);
    }

    @NonNull
    public Task<Void> sendEmailVerification() {
        Continuation continuation;
        new zzq(this);
        return FirebaseAuth.getInstance(zzcu()).zza(this, false).continueWithTask(continuation);
    }

    @NonNull
    public Task<Void> sendEmailVerification(ActionCodeSettings actionCodeSettings) {
        Continuation continuation;
        new zzr(this, actionCodeSettings);
        return FirebaseAuth.getInstance(zzcu()).zza(this, false).continueWithTask(continuation);
    }
}

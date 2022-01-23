package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EmailAuthCredentialCreator")
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR;
    @SafeParcelable.Field(getter = "getEmail", id = 1)
    private String zzif;
    @SafeParcelable.Field(getter = "getPassword", id = 2)
    private String zzig;
    @SafeParcelable.Field(getter = "getSignInLink", id = 3)
    private final String zzih;
    @SafeParcelable.Field(getter = "getCachedState", id = 4)
    private String zzii;
    @SafeParcelable.Field(getter = "isForLinking", id = 5)
    private boolean zzij;

    @SafeParcelable.Constructor
    EmailAuthCredential(@SafeParcelable.Param(id = 1) @NonNull String str, @SafeParcelable.Param(id = 2) @NonNull String str2, @SafeParcelable.Param(id = 3) @NonNull String str3, @SafeParcelable.Param(id = 4) @NonNull String str4, @SafeParcelable.Param(id = 5) @NonNull boolean z) {
        Throwable th;
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        boolean z2 = z;
        this.zzif = Preconditions.checkNotEmpty(str);
        if (!TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str6)) {
            this.zzig = str5;
            this.zzih = str6;
            this.zzii = str7;
            this.zzij = z2;
            return;
        }
        Throwable th2 = th;
        new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        throw th2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    EmailAuthCredential(String str, String str2) {
        this(str, str2, (String) null, (String) null, false);
    }

    @NonNull
    public final String getEmail() {
        return this.zzif;
    }

    @NonNull
    public final String getPassword() {
        return this.zzig;
    }

    @NonNull
    public final String zzco() {
        return this.zzih;
    }

    @Nullable
    public final String zzcp() {
        return this.zzii;
    }

    public final boolean zzcq() {
        return this.zzij;
    }

    public final EmailAuthCredential zza(@Nullable FirebaseUser firebaseUser) {
        this.zzii = firebaseUser.zzcz();
        this.zzij = true;
        return this;
    }

    @NonNull
    public String getProvider() {
        return "password";
    }

    public String getSignInMethod() {
        return !TextUtils.isEmpty(this.zzig) ? "password" : EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD;
    }

    public final boolean zzcr() {
        return !TextUtils.isEmpty(this.zzih);
    }

    public static boolean isSignInWithEmailLink(@NonNull String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        zzb zzbr = zzb.zzbr(str2);
        zzb zzb = zzbr;
        if (zzbr == null || zzb.getOperation() != 4) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzif, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzig, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zzih, false);
        SafeParcelWriter.writeString(parcel2, 4, this.zzii, false);
        SafeParcelWriter.writeBoolean(parcel2, 5, this.zzij);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<EmailAuthCredential> creator;
        new zzg();
        CREATOR = creator;
    }
}

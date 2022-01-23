package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzfm;

@C0463SafeParcelable.Class(creator = "PlayGamesAuthCredentialCreator")
public class PlayGamesAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR;
    @C0463SafeParcelable.Field(getter = "getServerAuthCode", id = 1)
    private final String zzjx;

    @C0463SafeParcelable.Constructor
    PlayGamesAuthCredential(@C0463SafeParcelable.Param(id = 1) @NonNull String str) {
        this.zzjx = C0446Preconditions.checkNotEmpty(str);
    }

    public String getProvider() {
        return "playgames.google.com";
    }

    public String getSignInMethod() {
        return "playgames.google.com";
    }

    public static zzfm zza(@NonNull PlayGamesAuthCredential playGamesAuthCredential, @Nullable String str) {
        zzfm zzfm;
        PlayGamesAuthCredential playGamesAuthCredential2 = playGamesAuthCredential;
        Object checkNotNull = C0446Preconditions.checkNotNull(playGamesAuthCredential2);
        new zzfm((String) null, (String) null, playGamesAuthCredential2.getProvider(), (String) null, (String) null, playGamesAuthCredential2.zzjx, str, (String) null);
        return zzfm;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzjx, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<PlayGamesAuthCredential> creator;
        new zzad();
        CREATOR = creator;
    }
}

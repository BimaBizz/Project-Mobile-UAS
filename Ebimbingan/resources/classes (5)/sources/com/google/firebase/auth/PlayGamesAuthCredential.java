package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzfm;

@SafeParcelable.Class(creator = "PlayGamesAuthCredentialCreator")
public class PlayGamesAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR;
    @SafeParcelable.Field(getter = "getServerAuthCode", id = 1)
    private final String zzjx;

    @SafeParcelable.Constructor
    PlayGamesAuthCredential(@SafeParcelable.Param(id = 1) @NonNull String str) {
        this.zzjx = Preconditions.checkNotEmpty(str);
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
        Object checkNotNull = Preconditions.checkNotNull(playGamesAuthCredential2);
        new zzfm((String) null, (String) null, playGamesAuthCredential2.getProvider(), (String) null, (String) null, playGamesAuthCredential2.zzjx, str, (String) null);
        return zzfm;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzjx, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<PlayGamesAuthCredential> creator;
        new zzad();
        CREATOR = creator;
    }
}

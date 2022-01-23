package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInConfigurationCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR;
    @SafeParcelable.Field(getter = "getConsumerPkgName", id = 2)
    private final String zzcu;
    @SafeParcelable.Field(getter = "getGoogleConfig", id = 5)
    private GoogleSignInOptions zzcv;

    @SafeParcelable.Constructor
    public SignInConfiguration(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 5) GoogleSignInOptions googleSignInOptions) {
        this.zzcu = Preconditions.checkNotEmpty(str);
        this.zzcv = googleSignInOptions;
    }

    public final GoogleSignInOptions zzu() {
        return this.zzcv;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 2, this.zzcu, false);
        SafeParcelWriter.writeParcelable(parcel2, 5, this.zzcv, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj2;
        if (!this.zzcu.equals(signInConfiguration.zzcu) || (this.zzcv != null ? !this.zzcv.equals(signInConfiguration.zzcv) : signInConfiguration.zzcv != null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        HashAccumulator hashAccumulator;
        new HashAccumulator();
        return hashAccumulator.addObject(this.zzcu).addObject(this.zzcv).hash();
    }

    static {
        Parcelable.Creator<SignInConfiguration> creator;
        new zzx();
        CREATOR = creator;
    }
}

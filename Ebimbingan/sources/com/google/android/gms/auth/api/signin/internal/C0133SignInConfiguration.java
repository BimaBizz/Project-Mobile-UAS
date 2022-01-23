package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SignInConfigurationCreator")
@C0463SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.auth.api.signin.internal.SignInConfiguration */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0133SignInConfiguration extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    public static final Parcelable.Creator<C0133SignInConfiguration> CREATOR;
    @C0463SafeParcelable.Field(getter = "getConsumerPkgName", id = 2)
    private final String zzcu;
    @C0463SafeParcelable.Field(getter = "getGoogleConfig", id = 5)
    private C0125GoogleSignInOptions zzcv;

    @C0463SafeParcelable.Constructor
    public C0133SignInConfiguration(@C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 5) C0125GoogleSignInOptions googleSignInOptions) {
        this.zzcu = C0446Preconditions.checkNotEmpty(str);
        this.zzcv = googleSignInOptions;
    }

    public final C0125GoogleSignInOptions zzu() {
        return this.zzcv;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzcu, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 5, this.zzcv, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof C0133SignInConfiguration)) {
            return false;
        }
        C0133SignInConfiguration signInConfiguration = (C0133SignInConfiguration) obj2;
        if (!this.zzcu.equals(signInConfiguration.zzcu) || (this.zzcv != null ? !this.zzcv.equals(signInConfiguration.zzcv) : signInConfiguration.zzcv != null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C0132HashAccumulator hashAccumulator;
        new C0132HashAccumulator();
        return hashAccumulator.addObject(this.zzcu).addObject(this.zzcv).hash();
    }

    static {
        Parcelable.Creator<C0133SignInConfiguration> creator;
        new C0158zzx();
        CREATOR = creator;
    }
}

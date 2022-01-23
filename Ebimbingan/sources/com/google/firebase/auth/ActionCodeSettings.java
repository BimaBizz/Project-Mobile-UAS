package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzfw;

@C0463SafeParcelable.Class(creator = "ActionCodeSettingsCreator")
public class ActionCodeSettings extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR;
    @C0463SafeParcelable.Field(getter = "getUrl", id = 1)
    private final String url;
    @C0463SafeParcelable.Field(getter = "getIOSBundle", id = 2)
    private final String zzhk;
    @C0463SafeParcelable.Field(getter = "getIOSAppStoreId", id = 3)
    private final String zzhl;
    @C0463SafeParcelable.Field(getter = "getAndroidPackageName", id = 4)
    private final String zzhm;
    @C0463SafeParcelable.Field(getter = "getAndroidInstallApp", id = 5)
    private final boolean zzhn;
    @C0463SafeParcelable.Field(getter = "getAndroidMinimumVersion", id = 6)
    private final String zzho;
    @C0463SafeParcelable.Field(getter = "canHandleCodeInApp", id = 7)
    private final boolean zzhp;
    @C0463SafeParcelable.Field(getter = "getLocaleHeader", id = 8)
    private String zzhq;
    @C0463SafeParcelable.Field(getter = "getRequestType", id = 9)
    private int zzhr;
    @C0463SafeParcelable.Field(getter = "getDynamicLinkDomain", id = 10)
    private String zzhs;

    @C0463SafeParcelable.Constructor
    ActionCodeSettings(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) String str2, @C0463SafeParcelable.Param(id = 3) String str3, @C0463SafeParcelable.Param(id = 4) String str4, @C0463SafeParcelable.Param(id = 5) boolean z, @C0463SafeParcelable.Param(id = 6) String str5, @C0463SafeParcelable.Param(id = 7) boolean z2, @C0463SafeParcelable.Param(id = 8) String str6, @C0463SafeParcelable.Param(id = 9) int i, @C0463SafeParcelable.Param(id = 10) String str7) {
        this.url = str;
        this.zzhk = str2;
        this.zzhl = str3;
        this.zzhm = str4;
        this.zzhn = z;
        this.zzho = str5;
        this.zzhp = z2;
        this.zzhq = str6;
        this.zzhr = i;
        this.zzhs = str7;
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public String url;
        /* access modifiers changed from: private */
        public String zzhk;
        /* access modifiers changed from: private */
        public String zzhm;
        /* access modifiers changed from: private */
        public boolean zzhn;
        /* access modifiers changed from: private */
        public String zzho;
        /* access modifiers changed from: private */
        public boolean zzhp;
        /* access modifiers changed from: private */
        public String zzhs;

        private Builder() {
            this.zzhp = false;
        }

        public Builder setUrl(@NonNull String str) {
            this.url = str;
            return this;
        }

        public Builder setIOSBundleId(@NonNull String str) {
            this.zzhk = str;
            return this;
        }

        public Builder setAndroidPackageName(@NonNull String str, boolean z, @Nullable String str2) {
            this.zzhm = str;
            this.zzhn = z;
            this.zzho = str2;
            return this;
        }

        public Builder setHandleCodeInApp(boolean z) {
            this.zzhp = z;
            return this;
        }

        public Builder setDynamicLinkDomain(String str) {
            this.zzhs = str;
            return this;
        }

        public ActionCodeSettings build() {
            ActionCodeSettings actionCodeSettings;
            Throwable th;
            if (this.url == null) {
                Throwable th2 = th;
                new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
                throw th2;
            }
            new ActionCodeSettings(this, (zza) null);
            return actionCodeSettings;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ Builder(zza zza) {
            this();
            zza zza2 = zza;
        }
    }

    private ActionCodeSettings(Builder builder) {
        Builder builder2 = builder;
        this.url = builder2.url;
        this.zzhk = builder2.zzhk;
        this.zzhl = null;
        this.zzhm = builder2.zzhm;
        this.zzhn = builder2.zzhn;
        this.zzho = builder2.zzho;
        this.zzhp = builder2.zzhp;
        this.zzhs = builder2.zzhs;
    }

    public static ActionCodeSettings zzcj() {
        ActionCodeSettings actionCodeSettings;
        Builder builder;
        ActionCodeSettings actionCodeSettings2 = actionCodeSettings;
        new Builder((zza) null);
        new ActionCodeSettings(builder);
        return actionCodeSettings2;
    }

    public String getUrl() {
        return this.url;
    }

    public String getIOSBundle() {
        return this.zzhk;
    }

    public final String zzck() {
        return this.zzhl;
    }

    public String getAndroidPackageName() {
        return this.zzhm;
    }

    public boolean getAndroidInstallApp() {
        return this.zzhn;
    }

    public String getAndroidMinimumVersion() {
        return this.zzho;
    }

    public boolean canHandleCodeInApp() {
        return this.zzhp;
    }

    public final void zzbq(@NonNull String str) {
        String str2 = str;
        this.zzhq = str2;
    }

    public final String zzcl() {
        return this.zzhq;
    }

    public final void zzb(@NonNull zzfw zzfw) {
        int zzbq = zzfw.zzbq();
        this.zzhr = zzbq;
    }

    public final int getRequestType() {
        return this.zzhr;
    }

    public final String zzcm() {
        return this.zzhs;
    }

    public static Builder newBuilder() {
        Builder builder;
        Builder builder2 = builder;
        new Builder((zza) null);
        return builder2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, getUrl(), false);
        C0462SafeParcelWriter.writeString(parcel2, 2, getIOSBundle(), false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzhl, false);
        C0462SafeParcelWriter.writeString(parcel2, 4, getAndroidPackageName(), false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, getAndroidInstallApp());
        C0462SafeParcelWriter.writeString(parcel2, 6, getAndroidMinimumVersion(), false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 7, canHandleCodeInApp());
        C0462SafeParcelWriter.writeString(parcel2, 8, this.zzhq, false);
        C0462SafeParcelWriter.writeInt(parcel2, 9, this.zzhr);
        C0462SafeParcelWriter.writeString(parcel2, 10, this.zzhs, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ ActionCodeSettings(Builder builder, zza zza) {
        this(builder);
        zza zza2 = zza;
    }

    static {
        Parcelable.Creator<ActionCodeSettings> creator;
        new zzc();
        CREATOR = creator;
    }
}

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.util.List;
import javax.annotation.Nonnull;

@C0463SafeParcelable.Class(creator = "CredentialCreator")
@C0463SafeParcelable.Reserved({1000})
/* renamed from: com.google.android.gms.auth.api.credentials.Credential */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0062Credential extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    public static final Parcelable.Creator<C0062Credential> CREATOR;
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getId", id = 1)
    @Nonnull
    public final String mId;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getName", id = 2)
    @Nullable
    public final String mName;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getProfilePictureUri", id = 3)
    @Nullable
    public final Uri zzo;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getIdTokens", id = 4)
    @Nonnull
    public final List<C0072IdToken> zzp;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getPassword", id = 5)
    @Nullable
    public final String zzq;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getAccountType", id = 6)
    @Nullable
    public final String zzr;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getGivenName", id = 9)
    @Nullable
    public final String zzs;
    /* access modifiers changed from: private */
    @C0463SafeParcelable.Field(getter = "getFamilyName", id = 10)
    @Nullable
    public final String zzt;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    @com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0062Credential(@com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable.Param(id = 1) java.lang.String r17, @com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable.Param(id = 2) @androidx.annotation.Nullable java.lang.String r18, @com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable.Param(id = 3) @androidx.annotation.Nullable android.net.Uri r19, @com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable.Param(id = 4) java.util.List<com.google.android.gms.auth.api.credentials.C0072IdToken> r20, @com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable.Param(id = 5) @androidx.annotation.Nullable java.lang.String r21, @com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable.Param(id = 6) @androidx.annotation.Nullable java.lang.String r22, @com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable.Param(id = 9) @androidx.annotation.Nullable java.lang.String r23, @com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable.Param(id = 10) @androidx.annotation.Nullable java.lang.String r24) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r12 = r0
            r12.<init>()
            r12 = r1
            java.lang.String r13 = "credential identifier cannot be null"
            java.lang.Object r12 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r12, r13)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r12 = r12.trim()
            r15 = r12
            r12 = r15
            r13 = r15
            r9 = r13
            java.lang.String r13 = "credential identifier cannot be empty"
            java.lang.String r12 = com.google.android.gms.common.internal.C0446Preconditions.checkNotEmpty(r12, r13)
            r12 = r5
            if (r12 == 0) goto L_0x0045
            r12 = r5
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0045
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r15 = r12
            r12 = r15
            r13 = r15
            java.lang.String r14 = "Password must not be empty if set"
            r13.<init>(r14)
            throw r12
        L_0x0045:
            r12 = r6
            if (r12 == 0) goto L_0x00b6
            r12 = r6
            r15 = r12
            r12 = r15
            r13 = r15
            r10 = r13
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x00b4
            r12 = r10
            android.net.Uri r12 = android.net.Uri.parse(r12)
            r15 = r12
            r12 = r15
            r13 = r15
            r11 = r13
            boolean r12 = r12.isAbsolute()
            if (r12 == 0) goto L_0x007f
            r12 = r11
            boolean r12 = r12.isHierarchical()
            if (r12 == 0) goto L_0x007f
            r12 = r11
            java.lang.String r12 = r12.getScheme()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x007f
            r12 = r11
            java.lang.String r12 = r12.getAuthority()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0096
        L_0x007f:
            r12 = 0
        L_0x0080:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x00b6
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r15 = r12
            r12 = r15
            r13 = r15
            java.lang.String r14 = "Account type must be a valid Http/Https URI"
            r13.<init>(r14)
            throw r12
        L_0x0096:
            java.lang.String r12 = "http"
            r13 = r11
            java.lang.String r13 = r13.getScheme()
            boolean r12 = r12.equalsIgnoreCase(r13)
            if (r12 != 0) goto L_0x00b2
            java.lang.String r12 = "https"
            r13 = r11
            java.lang.String r13 = r13.getScheme()
            boolean r12 = r12.equalsIgnoreCase(r13)
            if (r12 == 0) goto L_0x00b4
        L_0x00b2:
            r12 = 1
            goto L_0x0080
        L_0x00b4:
            r12 = 0
            goto L_0x0080
        L_0x00b6:
            r12 = r6
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x00d0
            r12 = r5
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x00d0
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r15 = r12
            r12 = r15
            r13 = r15
            java.lang.String r14 = "Password and AccountType are mutually exclusive"
            r13.<init>(r14)
            throw r12
        L_0x00d0:
            r12 = r2
            if (r12 == 0) goto L_0x00e0
            r12 = r2
            java.lang.String r12 = r12.trim()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 0
            r2 = r12
        L_0x00e0:
            r12 = r0
            r13 = r2
            r12.mName = r13
            r12 = r0
            r13 = r3
            r12.zzo = r13
            r12 = r0
            r13 = r4
            if (r13 != 0) goto L_0x0107
            java.util.List r13 = java.util.Collections.emptyList()
        L_0x00f0:
            r12.zzp = r13
            r12 = r0
            r13 = r9
            r12.mId = r13
            r12 = r0
            r13 = r5
            r12.zzq = r13
            r12 = r0
            r13 = r6
            r12.zzr = r13
            r12 = r0
            r13 = r7
            r12.zzs = r13
            r12 = r0
            r13 = r8
            r12.zzt = r13
            return
        L_0x0107:
            r13 = r4
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.C0062Credential.<init>(java.lang.String, java.lang.String, android.net.Uri, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: com.google.android.gms.auth.api.credentials.Credential$Builder */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class Builder {
        private final String mId;
        @Nullable
        private String mName;
        @Nullable
        private Uri zzo;
        private List<C0072IdToken> zzp;
        @Nullable
        private String zzq;
        @Nullable
        private String zzr;
        @Nullable
        private String zzs;
        @Nullable
        private String zzt;

        public Builder(String str) {
            this.mId = str;
        }

        public Builder(C0062Credential credential) {
            C0062Credential credential2 = credential;
            this.mId = credential2.mId;
            this.mName = credential2.mName;
            this.zzo = credential2.zzo;
            this.zzp = credential2.zzp;
            this.zzq = credential2.zzq;
            this.zzr = credential2.zzr;
            this.zzs = credential2.zzs;
            this.zzt = credential2.zzt;
        }

        public Builder setName(String str) {
            this.mName = str;
            return this;
        }

        public Builder setProfilePictureUri(Uri uri) {
            this.zzo = uri;
            return this;
        }

        public Builder setPassword(@Nullable String str) {
            this.zzq = str;
            return this;
        }

        public Builder setAccountType(String str) {
            this.zzr = str;
            return this;
        }

        public C0062Credential build() {
            C0062Credential credential;
            new C0062Credential(this.mId, this.mName, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt);
            return credential;
        }
    }

    @Nonnull
    public String getId() {
        return this.mId;
    }

    @Nullable
    public String getName() {
        return this.mName;
    }

    @Nullable
    public Uri getProfilePictureUri() {
        return this.zzo;
    }

    @Nonnull
    public List<C0072IdToken> getIdTokens() {
        return this.zzp;
    }

    @Nullable
    public String getPassword() {
        return this.zzq;
    }

    @Nullable
    public String getAccountType() {
        return this.zzr;
    }

    @Nullable
    public String getGivenName() {
        return this.zzs;
    }

    @Nullable
    public String getFamilyName() {
        return this.zzt;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, getId(), false);
        C0462SafeParcelWriter.writeString(parcel2, 2, getName(), false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, getProfilePictureUri(), i, false);
        C0462SafeParcelWriter.writeTypedList(parcel2, 4, getIdTokens(), false);
        C0462SafeParcelWriter.writeString(parcel2, 5, getPassword(), false);
        C0462SafeParcelWriter.writeString(parcel2, 6, getAccountType(), false);
        C0462SafeParcelWriter.writeString(parcel2, 9, getGivenName(), false);
        C0462SafeParcelWriter.writeString(parcel2, 10, getFamilyName(), false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r3 = r0
            r4 = r1
            if (r3 != r4) goto L_0x0009
            r3 = 1
            r0 = r3
        L_0x0008:
            return r0
        L_0x0009:
            r3 = r1
            boolean r3 = r3 instanceof com.google.android.gms.auth.api.credentials.C0062Credential
            if (r3 != 0) goto L_0x0011
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x0011:
            r3 = r1
            com.google.android.gms.auth.api.credentials.Credential r3 = (com.google.android.gms.auth.api.credentials.C0062Credential) r3
            r2 = r3
            r3 = r0
            java.lang.String r3 = r3.mId
            r4 = r2
            java.lang.String r4 = r4.mId
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0054
            r3 = r0
            java.lang.String r3 = r3.mName
            r4 = r2
            java.lang.String r4 = r4.mName
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0054
            r3 = r0
            android.net.Uri r3 = r3.zzo
            r4 = r2
            android.net.Uri r4 = r4.zzo
            boolean r3 = com.google.android.gms.common.internal.C0444Objects.equal(r3, r4)
            if (r3 == 0) goto L_0x0054
            r3 = r0
            java.lang.String r3 = r3.zzq
            r4 = r2
            java.lang.String r4 = r4.zzq
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0054
            r3 = r0
            java.lang.String r3 = r3.zzr
            r4 = r2
            java.lang.String r4 = r4.zzr
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0054
            r3 = 1
            r0 = r3
            goto L_0x0008
        L_0x0054:
            r3 = 0
            r0 = r3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.C0062Credential.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mId;
        Object[] objArr2 = objArr;
        objArr2[1] = this.mName;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.zzo;
        Object[] objArr4 = objArr3;
        objArr4[3] = this.zzq;
        Object[] objArr5 = objArr4;
        objArr5[4] = this.zzr;
        return C0444Objects.hashCode(objArr5);
    }

    static {
        Parcelable.Creator<C0062Credential> creator;
        new C0074zzc();
        CREATOR = creator;
    }
}

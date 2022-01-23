package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzay;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.auth.zzf;
import com.google.firebase.auth.zzv;
import com.google.firebase.auth.zzx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SafeParcelable.Class(creator = "DefaultFirebaseUserCreator")
public class zzm extends FirebaseUser {
    public static final Parcelable.Creator<zzm> CREATOR;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 11)
    private zzf zzkw;
    @SafeParcelable.Field(getter = "isNewUser", id = 10)
    private boolean zzrg;
    @SafeParcelable.Field(getter = "getCachedTokenState", id = 1)
    private zzes zzth;
    @SafeParcelable.Field(getter = "getDefaultAuthUserInfo", id = 2)
    private zzi zzti;
    @SafeParcelable.Field(getter = "getFirebaseAppName", id = 3)
    private String zztj;
    @SafeParcelable.Field(getter = "getUserType", id = 4)
    private String zztk;
    @SafeParcelable.Field(getter = "getUserInfos", id = 5)
    private List<zzi> zztl;
    @SafeParcelable.Field(getter = "getProviders", id = 6)
    private List<String> zztm;
    @SafeParcelable.Field(getter = "getCurrentVersion", id = 7)
    private String zztn;
    @SafeParcelable.Field(getter = "isAnonymous", id = 8)
    private Boolean zzto;
    @SafeParcelable.Field(getter = "getMetadata", id = 9)
    private zzo zztp;
    @SafeParcelable.Field(getter = "getMultiFactorInfoList", id = 12)
    private zzao zztq;

    @SafeParcelable.Constructor
    zzm(@SafeParcelable.Param(id = 1) zzes zzes, @SafeParcelable.Param(id = 2) zzi zzi, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) List<zzi> list, @SafeParcelable.Param(id = 6) List<String> list2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Boolean bool, @SafeParcelable.Param(id = 9) zzo zzo, @SafeParcelable.Param(id = 10) boolean z, @SafeParcelable.Param(id = 11) zzf zzf, @SafeParcelable.Param(id = 12) zzao zzao) {
        this.zzth = zzes;
        this.zzti = zzi;
        this.zztj = str;
        this.zztk = str2;
        this.zztl = list;
        this.zztm = list2;
        this.zztn = str3;
        this.zzto = bool;
        this.zztp = zzo;
        this.zzrg = z;
        this.zzkw = zzf;
        this.zztq = zzao;
    }

    public zzm(FirebaseApp firebaseApp, List<? extends UserInfo> list) {
        FirebaseApp firebaseApp2 = firebaseApp;
        Object checkNotNull = Preconditions.checkNotNull(firebaseApp2);
        this.zztj = firebaseApp2.getName();
        this.zztk = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.zztn = "2";
        FirebaseUser zza = zza(list);
    }

    @Nullable
    public String getDisplayName() {
        return this.zzti.getDisplayName();
    }

    @Nullable
    public Uri getPhotoUrl() {
        return this.zzti.getPhotoUrl();
    }

    @Nullable
    public String getEmail() {
        return this.zzti.getEmail();
    }

    @Nullable
    public String getPhoneNumber() {
        return this.zzti.getPhoneNumber();
    }

    @Nullable
    public final String zzba() {
        String str;
        String str2 = null;
        if (!(this.zzth == null || this.zzth.getAccessToken() == null)) {
            Map map = (Map) zzan.zzdf(this.zzth.getAccessToken()).getClaims().get(FirebaseAuthProvider.PROVIDER_ID);
            Map map2 = map;
            if (map != null) {
                str = (String) map2.get("tenant");
            } else {
                str = null;
            }
            str2 = str;
        }
        return str2;
    }

    public final zzm zzdb(String str) {
        this.zztn = str;
        return this;
    }

    @NonNull
    public String getProviderId() {
        return this.zzti.getProviderId();
    }

    @NonNull
    public final FirebaseApp zzcu() {
        return FirebaseApp.getInstance(this.zztj);
    }

    public final List<zzi> zzff() {
        return this.zztl;
    }

    @NonNull
    public String getUid() {
        return this.zzti.getUid();
    }

    public boolean isAnonymous() {
        if (this.zzto == null || this.zzto.booleanValue()) {
            String str = "";
            if (this.zzth != null) {
                GetTokenResult zzdf = zzan.zzdf(this.zzth.getAccessToken());
                str = zzdf != null ? zzdf.getSignInProvider() : "";
            }
            this.zzto = Boolean.valueOf(getProviderData().size() <= 1 && (str == null || !str.equals("custom")));
        }
        return this.zzto.booleanValue();
    }

    @Nullable
    public final List<String> zzcw() {
        return this.zztm;
    }

    @NonNull
    public final FirebaseUser zza(List<? extends UserInfo> list) {
        List<zzi> list2;
        List<String> list3;
        List<? extends UserInfo> list4 = list;
        Object checkNotNull = Preconditions.checkNotNull(list4);
        new ArrayList(list4.size());
        this.zztl = list2;
        new ArrayList(list4.size());
        this.zztm = list3;
        for (int i = 0; i < list4.size(); i++) {
            UserInfo userInfo = (UserInfo) list4.get(i);
            UserInfo userInfo2 = userInfo;
            if (userInfo.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                this.zzti = (zzi) userInfo2;
            } else {
                boolean add = this.zztm.add(userInfo2.getProviderId());
            }
            boolean add2 = this.zztl.add((zzi) userInfo2);
        }
        if (this.zzti == null) {
            this.zzti = this.zztl.get(0);
        }
        return this;
    }

    @NonNull
    public List<? extends UserInfo> getProviderData() {
        return this.zztl;
    }

    @NonNull
    public final zzes zzcy() {
        return this.zzth;
    }

    @NonNull
    public final String zzda() {
        return zzcy().getAccessToken();
    }

    @NonNull
    public final String zzcz() {
        return this.zzth.zzew();
    }

    public final void zza(zzes zzes) {
        zzes zzes2 = (zzes) Preconditions.checkNotNull(zzes);
        this.zzth = zzes2;
    }

    public boolean isEmailVerified() {
        return this.zzti.isEmailVerified();
    }

    public final void zza(zzo zzo) {
        zzo zzo2 = zzo;
        this.zztp = zzo2;
    }

    public FirebaseUserMetadata getMetadata() {
        return this.zztp;
    }

    public final void zzs(boolean z) {
        boolean z2 = z;
        this.zzrg = z2;
    }

    public final boolean isNewUser() {
        return this.zzrg;
    }

    public final void zzb(zzf zzf) {
        zzf zzf2 = zzf;
        this.zzkw = zzf2;
    }

    @Nullable
    public final zzf zzdo() {
        return this.zzkw;
    }

    public final void zzb(List<zzx> list) {
        zzao zzf = zzao.zzf(list);
        this.zztq = zzf;
    }

    @Nullable
    public final List<zzx> zzdc() {
        if (this.zztq != null) {
            return this.zztq.zzdp();
        }
        return zzay.zzce();
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.os.Parcelable, com.google.android.gms.internal.firebase_auth.zzes] */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.os.Parcelable, com.google.firebase.auth.internal.zzi] */
    /* JADX WARNING: type inference failed for: r8v18, types: [android.os.Parcelable, com.google.firebase.auth.FirebaseUserMetadata] */
    /* JADX WARNING: type inference failed for: r8v22, types: [android.os.Parcelable, com.google.firebase.auth.zzf] */
    /* JADX WARNING: type inference failed for: r8v24, types: [android.os.Parcelable, com.google.firebase.auth.internal.zzao] */
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, zzcy(), i2, false);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.zzti, i2, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zztj, false);
        SafeParcelWriter.writeString(parcel2, 4, this.zztk, false);
        SafeParcelWriter.writeTypedList(parcel2, 5, this.zztl, false);
        SafeParcelWriter.writeStringList(parcel2, 6, zzcw(), false);
        SafeParcelWriter.writeString(parcel2, 7, this.zztn, false);
        SafeParcelWriter.writeBooleanObject(parcel2, 8, Boolean.valueOf(isAnonymous()), false);
        SafeParcelWriter.writeParcelable(parcel2, 9, getMetadata(), i2, false);
        SafeParcelWriter.writeBoolean(parcel2, 10, this.zzrg);
        SafeParcelWriter.writeParcelable(parcel2, 11, this.zzkw, i2, false);
        SafeParcelWriter.writeParcelable(parcel2, 12, this.zztq, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public static FirebaseUser zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser) {
        zzm zzm;
        FirebaseUser firebaseUser2 = firebaseUser;
        new zzm(firebaseApp, firebaseUser2.getProviderData());
        zzm zzm2 = zzm;
        if (firebaseUser2 instanceof zzm) {
            zzm zzm3 = (zzm) firebaseUser2;
            String str = zzm3.zztn;
            String str2 = str;
            zzm2.zztn = str;
            String str3 = zzm3.zztk;
            String str4 = str3;
            zzm2.zztk = str3;
            zzo zzo = (zzo) zzm3.getMetadata();
            zzo zzo2 = zzo;
            zzm2.zztp = zzo;
        } else {
            zzm2.zztp = null;
        }
        if (firebaseUser2.zzcy() != null) {
            zzm2.zza(firebaseUser2.zzcy());
        }
        if (!firebaseUser2.isAnonymous()) {
            FirebaseUser zzcx = zzm2.zzcx();
        }
        return zzm2;
    }

    public final /* synthetic */ zzv zzdb() {
        zzv zzv;
        new zzq(this);
        return zzv;
    }

    public final /* synthetic */ FirebaseUser zzcx() {
        this.zzto = false;
        return this;
    }

    static {
        Parcelable.Creator<zzm> creator;
        new zzl();
        CREATOR = creator;
    }
}

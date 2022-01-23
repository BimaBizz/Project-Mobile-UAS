package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class AccountPicker {

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class AccountChooserOptions {
        /* access modifiers changed from: private */
        @Nullable
        public Account zza;
        /* access modifiers changed from: private */
        public boolean zzb;
        /* access modifiers changed from: private */
        @Nullable
        public ArrayList<Account> zzc;
        /* access modifiers changed from: private */
        @Nullable
        public ArrayList<String> zzd;
        /* access modifiers changed from: private */
        public boolean zze;
        /* access modifiers changed from: private */
        @Nullable
        public String zzf;
        /* access modifiers changed from: private */
        @Nullable
        public Bundle zzg;
        /* access modifiers changed from: private */
        public boolean zzh;
        /* access modifiers changed from: private */
        public int zzi;
        /* access modifiers changed from: private */
        @Nullable
        public String zzj;
        /* access modifiers changed from: private */
        public boolean zzk;
        /* access modifiers changed from: private */
        @Nullable
        public zza zzl;
        /* access modifiers changed from: private */
        @Nullable
        public String zzm;
        /* access modifiers changed from: private */
        public boolean zzn;
        /* access modifiers changed from: private */
        public boolean zzo;

        /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
        public static class Builder {
            @Nullable
            private Account zza;
            @Nullable
            private ArrayList<Account> zzb;
            @Nullable
            private ArrayList<String> zzc;
            private boolean zzd = false;
            @Nullable
            private String zze;
            @Nullable
            private Bundle zzf;

            public Builder() {
            }

            @RecentlyNonNull
            public AccountChooserOptions build() {
                AccountChooserOptions accountChooserOptions;
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                new AccountChooserOptions();
                ArrayList zzp = AccountChooserOptions.zzp(accountChooserOptions, this.zzc);
                ArrayList zzq = AccountChooserOptions.zzq(accountChooserOptions, this.zzb);
                boolean zzr = AccountChooserOptions.zzr(accountChooserOptions, this.zzd);
                zza zzs = AccountChooserOptions.zzs(accountChooserOptions, (zza) null);
                String zzt = AccountChooserOptions.zzt(accountChooserOptions, (String) null);
                Bundle zzu = AccountChooserOptions.zzu(accountChooserOptions, this.zzf);
                Account zzv = AccountChooserOptions.zzv(accountChooserOptions, this.zza);
                boolean zzw = AccountChooserOptions.zzw(accountChooserOptions, false);
                boolean zzx = AccountChooserOptions.zzx(accountChooserOptions, false);
                String zzy = AccountChooserOptions.zzy(accountChooserOptions, (String) null);
                int zzz = AccountChooserOptions.zzz(accountChooserOptions, 0);
                String zzA = AccountChooserOptions.zzA(accountChooserOptions, this.zze);
                boolean zzB = AccountChooserOptions.zzB(accountChooserOptions, false);
                boolean zzC = AccountChooserOptions.zzC(accountChooserOptions, false);
                boolean zzD = AccountChooserOptions.zzD(accountChooserOptions, false);
                return accountChooserOptions;
            }

            /* JADX WARNING: Multi-variable type inference failed */
            @androidx.annotation.RecentlyNonNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAllowableAccounts(@androidx.annotation.Nullable java.util.List<android.accounts.Account> r6) {
                /*
                    r5 = this;
                    r0 = r5
                    r1 = r6
                    r3 = r1
                    if (r3 != 0) goto L_0x000e
                    r3 = 0
                    r1 = r3
                L_0x0007:
                    r3 = r0
                    r4 = r1
                    r3.zzb = r4
                    r3 = r0
                    r0 = r3
                    return r0
                L_0x000e:
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r2 = r3
                    r3 = r2
                    r4 = r1
                    r3.<init>(r4)
                    r3 = r2
                    r1 = r3
                    goto L_0x0007
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder.setAllowableAccounts(java.util.List):com.google.android.gms.common.AccountPicker$AccountChooserOptions$Builder");
            }

            /* JADX WARNING: Multi-variable type inference failed */
            @androidx.annotation.RecentlyNonNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAllowableAccountsTypes(@androidx.annotation.Nullable java.util.List<java.lang.String> r6) {
                /*
                    r5 = this;
                    r0 = r5
                    r1 = r6
                    r3 = r1
                    if (r3 != 0) goto L_0x000e
                    r3 = 0
                    r1 = r3
                L_0x0007:
                    r3 = r0
                    r4 = r1
                    r3.zzc = r4
                    r3 = r0
                    r0 = r3
                    return r0
                L_0x000e:
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r2 = r3
                    r3 = r2
                    r4 = r1
                    r3.<init>(r4)
                    r3 = r2
                    r1 = r3
                    goto L_0x0007
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder.setAllowableAccountsTypes(java.util.List):com.google.android.gms.common.AccountPicker$AccountChooserOptions$Builder");
            }

            @RecentlyNonNull
            public Builder setAlwaysShowAccountPicker(boolean z) {
                this.zzd = z;
                return this;
            }

            @RecentlyNonNull
            public Builder setOptionsForAddingAccount(@Nullable Bundle bundle) {
                this.zzf = bundle;
                return this;
            }

            @RecentlyNonNull
            public Builder setSelectedAccount(@Nullable Account account) {
                this.zza = account;
                return this;
            }

            @RecentlyNonNull
            public Builder setTitleOverrideText(@Nullable String str) {
                this.zze = str;
                return this;
            }
        }

        public AccountChooserOptions() {
        }

        static /* synthetic */ String zzA(AccountChooserOptions accountChooserOptions, String str) {
            String str2 = str;
            accountChooserOptions.zzf = str2;
            return str2;
        }

        static /* synthetic */ boolean zzB(AccountChooserOptions accountChooserOptions, boolean z) {
            boolean z2 = z;
            accountChooserOptions.zzk = false;
            return false;
        }

        static /* synthetic */ boolean zzC(AccountChooserOptions accountChooserOptions, boolean z) {
            boolean z2 = z;
            accountChooserOptions.zzn = false;
            return false;
        }

        static /* synthetic */ boolean zzD(AccountChooserOptions accountChooserOptions, boolean z) {
            boolean z2 = z;
            accountChooserOptions.zzo = false;
            return false;
        }

        static /* synthetic */ ArrayList zzp(AccountChooserOptions accountChooserOptions, ArrayList arrayList) {
            ArrayList arrayList2 = arrayList;
            accountChooserOptions.zzd = arrayList2;
            return arrayList2;
        }

        static /* synthetic */ ArrayList zzq(AccountChooserOptions accountChooserOptions, ArrayList arrayList) {
            ArrayList arrayList2 = arrayList;
            accountChooserOptions.zzc = arrayList2;
            return arrayList2;
        }

        static /* synthetic */ boolean zzr(AccountChooserOptions accountChooserOptions, boolean z) {
            boolean z2 = z;
            accountChooserOptions.zze = z2;
            return z2;
        }

        static /* synthetic */ zza zzs(AccountChooserOptions accountChooserOptions, zza zza2) {
            zza zza3 = zza2;
            accountChooserOptions.zzl = null;
            return null;
        }

        static /* synthetic */ String zzt(AccountChooserOptions accountChooserOptions, String str) {
            String str2 = str;
            accountChooserOptions.zzj = null;
            return null;
        }

        static /* synthetic */ Bundle zzu(AccountChooserOptions accountChooserOptions, Bundle bundle) {
            Bundle bundle2 = bundle;
            accountChooserOptions.zzg = bundle2;
            return bundle2;
        }

        static /* synthetic */ Account zzv(AccountChooserOptions accountChooserOptions, Account account) {
            Account account2 = account;
            accountChooserOptions.zza = account2;
            return account2;
        }

        static /* synthetic */ boolean zzw(AccountChooserOptions accountChooserOptions, boolean z) {
            boolean z2 = z;
            accountChooserOptions.zzb = false;
            return false;
        }

        static /* synthetic */ boolean zzx(AccountChooserOptions accountChooserOptions, boolean z) {
            boolean z2 = z;
            accountChooserOptions.zzh = false;
            return false;
        }

        static /* synthetic */ String zzy(AccountChooserOptions accountChooserOptions, String str) {
            String str2 = str;
            accountChooserOptions.zzm = null;
            return null;
        }

        static /* synthetic */ int zzz(AccountChooserOptions accountChooserOptions, int i) {
            int i2 = i;
            accountChooserOptions.zzi = 0;
            return 0;
        }
    }

    private AccountPicker() {
    }

    @RecentlyNonNull
    @Deprecated
    public static Intent newChooseAccountIntent(@Nullable Account account, @Nullable ArrayList<Account> arrayList, @Nullable String[] strArr, boolean z, @Nullable String str, @Nullable String str2, @Nullable String[] strArr2, @Nullable Bundle bundle) {
        Intent intent;
        new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        Intent action = intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        Intent intent2 = intent.setPackage("com.google.android.gms");
        Intent putExtra = intent.putExtra("allowableAccounts", arrayList);
        Intent putExtra2 = intent.putExtra("allowableAccountTypes", strArr);
        Intent putExtra3 = intent.putExtra("addAccountOptions", bundle);
        Intent putExtra4 = intent.putExtra("selectedAccount", account);
        Intent putExtra5 = intent.putExtra("alwaysPromptForAccount", z);
        Intent putExtra6 = intent.putExtra("descriptionTextOverride", str);
        Intent putExtra7 = intent.putExtra("authTokenType", str2);
        Intent putExtra8 = intent.putExtra("addAccountRequiredFeatures", strArr2);
        Intent putExtra9 = intent.putExtra("setGmsCoreAccount", false);
        Intent putExtra10 = intent.putExtra("overrideTheme", 0);
        Intent putExtra11 = intent.putExtra("overrideCustomTheme", 0);
        Intent putExtra12 = intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @RecentlyNonNull
    public static Intent newChooseAccountIntent(@RecentlyNonNull AccountChooserOptions accountChooserOptions) {
        Intent intent;
        Bundle bundle;
        AccountChooserOptions accountChooserOptions2 = accountChooserOptions;
        new Intent();
        boolean zza = accountChooserOptions2.zzk;
        String zzb = accountChooserOptions2.zzj;
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        zza zzc = accountChooserOptions2.zzl;
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        boolean zzd = accountChooserOptions2.zzb;
        Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2");
        boolean zza2 = accountChooserOptions2.zzk;
        Intent action = intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        Intent intent2 = intent.setPackage("com.google.android.gms");
        Intent putExtra = intent.putExtra("allowableAccounts", accountChooserOptions2.zzc);
        if (accountChooserOptions2.zzd != null) {
            Intent putExtra2 = intent.putExtra("allowableAccountTypes", (String[]) accountChooserOptions2.zzd.toArray(new String[0]));
        }
        Intent putExtra3 = intent.putExtra("addAccountOptions", accountChooserOptions2.zzg);
        Intent putExtra4 = intent.putExtra("selectedAccount", accountChooserOptions2.zza);
        boolean zzd2 = accountChooserOptions2.zzb;
        Intent putExtra5 = intent.putExtra("selectedAccountIsNotClickable", false);
        Intent putExtra6 = intent.putExtra("alwaysPromptForAccount", accountChooserOptions2.zze);
        Intent putExtra7 = intent.putExtra("descriptionTextOverride", accountChooserOptions2.zzf);
        boolean zzl = accountChooserOptions2.zzh;
        Intent putExtra8 = intent.putExtra("setGmsCoreAccount", false);
        String zzm = accountChooserOptions2.zzm;
        Intent putExtra9 = intent.putExtra("realClientPackage", (String) null);
        int zze = accountChooserOptions2.zzi;
        Intent putExtra10 = intent.putExtra("overrideTheme", 0);
        boolean zza3 = accountChooserOptions2.zzk;
        Intent putExtra11 = intent.putExtra("overrideCustomTheme", 0);
        String zzb2 = accountChooserOptions2.zzj;
        Intent putExtra12 = intent.putExtra("hostedDomainFilter", (String) null);
        new Bundle();
        boolean zza4 = accountChooserOptions2.zzk;
        zza zzc2 = accountChooserOptions2.zzl;
        boolean zzn = accountChooserOptions2.zzn;
        boolean zzo = accountChooserOptions2.zzo;
        if (!bundle.isEmpty()) {
            Intent putExtra13 = intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}

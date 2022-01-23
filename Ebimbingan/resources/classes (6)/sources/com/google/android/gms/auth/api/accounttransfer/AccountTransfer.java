package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzaq;
import com.google.android.gms.internal.auth.zzar;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class AccountTransfer {
    public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    public static final String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    public static final String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
    private static final Api.ClientKey<zzaq> zza;
    private static final Api.AbstractClientBuilder<zzaq, zzm> zzb;
    private static final Api<zzm> zzc;
    @Deprecated
    private static final zzb zzd;
    @Deprecated
    private static final zzq zze;

    public static AccountTransferClient getAccountTransferClient(@NonNull Activity activity) {
        AccountTransferClient accountTransferClient;
        new AccountTransferClient(activity, (zzm) null);
        return accountTransferClient;
    }

    public static AccountTransferClient getAccountTransferClient(@NonNull Context context) {
        AccountTransferClient accountTransferClient;
        new AccountTransferClient(context, (zzm) null);
        return accountTransferClient;
    }

    private AccountTransfer() {
    }

    static {
        Api.ClientKey<zzaq> clientKey;
        Api.AbstractClientBuilder<zzaq, zzm> abstractClientBuilder;
        Api<zzm> api;
        zzb zzb2;
        zzq zzq;
        new Api.ClientKey<>();
        zza = clientKey;
        new zza();
        zzb = abstractClientBuilder;
        new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzb, zza);
        zzc = api;
        new zzar();
        zzd = zzb2;
        new zzar();
        zze = zzq;
    }
}

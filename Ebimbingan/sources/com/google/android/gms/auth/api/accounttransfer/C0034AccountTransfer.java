package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.internal.auth.C0793zzaq;
import com.google.android.gms.internal.auth.C0794zzar;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.AccountTransfer */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0034AccountTransfer {
    public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    public static final String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    public static final String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
    private static final C0211Api.ClientKey<C0793zzaq> zza;
    private static final C0211Api.AbstractClientBuilder<C0793zzaq, C0052zzm> zzb;
    private static final C0211Api<C0052zzm> zzc;
    @Deprecated
    private static final C0041zzb zzd;
    @Deprecated
    private static final C0056zzq zze;

    public static C0035AccountTransferClient getAccountTransferClient(@NonNull Activity activity) {
        C0035AccountTransferClient accountTransferClient;
        new C0035AccountTransferClient(activity, (C0052zzm) null);
        return accountTransferClient;
    }

    public static C0035AccountTransferClient getAccountTransferClient(@NonNull Context context) {
        C0035AccountTransferClient accountTransferClient;
        new C0035AccountTransferClient(context, (C0052zzm) null);
        return accountTransferClient;
    }

    private C0034AccountTransfer() {
    }

    static {
        C0211Api.ClientKey<C0793zzaq> clientKey;
        C0211Api.AbstractClientBuilder<C0793zzaq, C0052zzm> abstractClientBuilder;
        C0211Api<C0052zzm> api;
        C0041zzb zzb2;
        C0056zzq zzq;
        new C0211Api.ClientKey<>();
        zza = clientKey;
        new C0040zza();
        zzb = abstractClientBuilder;
        new C0211Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzb, zza);
        zzc = api;
        new C0794zzar();
        zzd = zzb2;
        new C0794zzar();
        zze = zzq;
    }
}

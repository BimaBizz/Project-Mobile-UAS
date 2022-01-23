package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth.zzap;
import com.google.android.gms.internal.auth.zzaq;
import com.google.android.gms.internal.auth.zzat;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzaz;
import com.google.android.gms.internal.auth.zzbb;
import com.google.android.gms.internal.auth.zzbd;
import com.google.android.gms.internal.auth.zzbf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class AccountTransferClient extends GoogleApi<zzm> {
    private static final Api.ClientKey<zzaq> zza;
    private static final Api.AbstractClientBuilder<zzaq, zzm> zzb;
    private static final Api<zzm> zzc;

    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static abstract class zza<T> extends TaskApiCall<zzaq, T> {
        private TaskCompletionSource<T> zza;

        private zza() {
        }

        /* access modifiers changed from: protected */
        public abstract void zza(zzax zzax) throws RemoteException;

        /* access modifiers changed from: protected */
        public final void zza(T t) {
            this.zza.setResult(t);
        }

        /* access modifiers changed from: protected */
        public final void zza(Status status) {
            AccountTransferClient.zzb(this.zza, status);
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
            this.zza = taskCompletionSource;
            zza((zzax) ((zzaq) anyClient).getService());
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zza(zzd zzd) {
            this();
            zzd zzd2 = zzd;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    AccountTransferClient(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.Nullable com.google.android.gms.auth.api.accounttransfer.zzm r13) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r0
            r4 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.accounttransfer.zzm> r5 = zzc
            r6 = 0
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r7 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r10 = r7
            r7 = r10
            r8 = r10
            r8.<init>()
            com.google.android.gms.common.api.internal.ApiExceptionMapper r8 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r10 = r8
            r8 = r10
            r9 = r10
            r9.<init>()
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r7 = r7.setMapper(r8)
            com.google.android.gms.common.api.GoogleApi$Settings r7 = r7.build()
            r3.<init>((android.content.Context) r4, r5, r6, (com.google.android.gms.common.api.GoogleApi.Settings) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.<init>(android.content.Context, com.google.android.gms.auth.api.accounttransfer.zzm):void");
    }

    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static abstract class zzc extends zza<Void> {
        zzau zza;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private zzc() {
            super((zzd) null);
            zzau zzau;
            new zzk(this);
            this.zza = zzau;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zzc(zzd zzd) {
            this();
            zzd zzd2 = zzd;
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static class zzb<T> extends zzap {
        private zza<T> zza;

        public zzb(zza<T> zza2) {
            this.zza = zza2;
        }

        public final void zza(Status status) {
            this.zza.zza(status);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    AccountTransferClient(@androidx.annotation.NonNull android.app.Activity r12, @androidx.annotation.Nullable com.google.android.gms.auth.api.accounttransfer.zzm r13) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r0
            r4 = r1
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.accounttransfer.zzm> r5 = zzc
            r6 = 0
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r7 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r10 = r7
            r7 = r10
            r8 = r10
            r8.<init>()
            com.google.android.gms.common.api.internal.ApiExceptionMapper r8 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r10 = r8
            r8 = r10
            r9 = r10
            r9.<init>()
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r7 = r7.setMapper(r8)
            com.google.android.gms.common.api.GoogleApi$Settings r7 = r7.build()
            r3.<init>((android.app.Activity) r4, r5, r6, (com.google.android.gms.common.api.GoogleApi.Settings) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.<init>(android.app.Activity, com.google.android.gms.auth.api.accounttransfer.zzm):void");
    }

    public Task<Void> sendData(String str, byte[] bArr) {
        zzbd zzbd;
        TaskApiCall taskApiCall;
        String str2 = str;
        byte[] bArr2 = bArr;
        Object checkNotNull = Preconditions.checkNotNull(str2);
        Object checkNotNull2 = Preconditions.checkNotNull(bArr2);
        new zzbd(str2, bArr2);
        new zzc(this, zzbd);
        return doWrite(taskApiCall);
    }

    public Task<byte[]> retrieveData(String str) {
        zzbb zzbb;
        TaskApiCall taskApiCall;
        String str2 = str;
        Object checkNotNull = Preconditions.checkNotNull(str2);
        new zzbb(str2);
        new zzf(this, zzbb);
        return doRead(taskApiCall);
    }

    public Task<DeviceMetaData> getDeviceMetaData(String str) {
        zzat zzat;
        TaskApiCall taskApiCall;
        String str2 = str;
        Object checkNotNull = Preconditions.checkNotNull(str2);
        new zzat(str2);
        new zzh(this, zzat);
        return doRead(taskApiCall);
    }

    public Task<Void> showUserChallenge(String str, PendingIntent pendingIntent) {
        zzbf zzbf;
        TaskApiCall taskApiCall;
        String str2 = str;
        PendingIntent pendingIntent2 = pendingIntent;
        Object checkNotNull = Preconditions.checkNotNull(str2);
        Object checkNotNull2 = Preconditions.checkNotNull(pendingIntent2);
        new zzbf(str2, pendingIntent2);
        new zzj(this, zzbf);
        return doWrite(taskApiCall);
    }

    public Task<Void> notifyCompletion(String str, int i) {
        zzaz zzaz;
        TaskApiCall taskApiCall;
        String str2 = str;
        Object checkNotNull = Preconditions.checkNotNull(str2);
        new zzaz(str2, i);
        new zzi(this, zzaz);
        return doWrite(taskApiCall);
    }

    /* access modifiers changed from: private */
    public static void zzb(TaskCompletionSource taskCompletionSource, Status status) {
        Exception exc;
        new AccountTransferException(status);
        taskCompletionSource.setException(exc);
    }

    static {
        Api.ClientKey<zzaq> clientKey;
        Api.AbstractClientBuilder<zzaq, zzm> abstractClientBuilder;
        Api<zzm> api;
        new Api.ClientKey<>();
        zza = clientKey;
        new zzd();
        zzb = abstractClientBuilder;
        new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzb, zza);
        zzc = api;
    }
}

package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.internal.auth.C0792zzap;
import com.google.android.gms.internal.auth.C0793zzaq;
import com.google.android.gms.internal.auth.C0796zzat;
import com.google.android.gms.internal.auth.C0797zzau;
import com.google.android.gms.internal.auth.C0800zzax;
import com.google.android.gms.internal.auth.C0802zzaz;
import com.google.android.gms.internal.auth.C0805zzbb;
import com.google.android.gms.internal.auth.C0807zzbd;
import com.google.android.gms.internal.auth.C0809zzbf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.AccountTransferClient */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0035AccountTransferClient extends C0220GoogleApi<C0052zzm> {
    private static final C0211Api.ClientKey<C0793zzaq> zza;
    private static final C0211Api.AbstractClientBuilder<C0793zzaq, C0052zzm> zzb;
    private static final C0211Api<C0052zzm> zzc;

    /* renamed from: com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$zza */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static abstract class zza<T> extends C0267TaskApiCall<C0793zzaq, T> {
        private TaskCompletionSource<T> zza;

        private zza() {
        }

        /* access modifiers changed from: protected */
        public abstract void zza(C0800zzax zzax) throws RemoteException;

        /* access modifiers changed from: protected */
        public final void zza(T t) {
            this.zza.setResult(t);
        }

        /* access modifiers changed from: protected */
        public final void zza(C0236Status status) {
            C0035AccountTransferClient.zzb(this.zza, status);
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ void doExecute(C0211Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
            this.zza = taskCompletionSource;
            zza((C0800zzax) ((C0793zzaq) anyClient).getService());
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zza(C0043zzd zzd) {
            this();
            C0043zzd zzd2 = zzd;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0035AccountTransferClient(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.Nullable com.google.android.gms.auth.api.accounttransfer.C0052zzm r13) {
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
            r3.<init>((android.content.Context) r4, r5, r6, (com.google.android.gms.common.api.C0220GoogleApi.Settings) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.accounttransfer.C0035AccountTransferClient.<init>(android.content.Context, com.google.android.gms.auth.api.accounttransfer.zzm):void");
    }

    /* renamed from: com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$zzc */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static abstract class zzc extends zza<Void> {
        C0797zzau zza;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private zzc() {
            super((C0043zzd) null);
            C0797zzau zzau;
            new C0050zzk(this);
            this.zza = zzau;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zzc(C0043zzd zzd) {
            this();
            C0043zzd zzd2 = zzd;
        }
    }

    /* renamed from: com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$zzb */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static class zzb<T> extends C0792zzap {
        private zza<T> zza;

        public zzb(zza<T> zza2) {
            this.zza = zza2;
        }

        public final void zza(C0236Status status) {
            this.zza.zza(status);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0035AccountTransferClient(@androidx.annotation.NonNull android.app.Activity r12, @androidx.annotation.Nullable com.google.android.gms.auth.api.accounttransfer.C0052zzm r13) {
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
            r3.<init>((android.app.Activity) r4, r5, r6, (com.google.android.gms.common.api.C0220GoogleApi.Settings) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.accounttransfer.C0035AccountTransferClient.<init>(android.app.Activity, com.google.android.gms.auth.api.accounttransfer.zzm):void");
    }

    public Task<Void> sendData(String str, byte[] bArr) {
        C0807zzbd zzbd;
        C0267TaskApiCall taskApiCall;
        String str2 = str;
        byte[] bArr2 = bArr;
        Object checkNotNull = C0446Preconditions.checkNotNull(str2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(bArr2);
        new C0807zzbd(str2, bArr2);
        new C0042zzc(this, zzbd);
        return doWrite(taskApiCall);
    }

    public Task<byte[]> retrieveData(String str) {
        C0805zzbb zzbb;
        C0267TaskApiCall taskApiCall;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(str2);
        new C0805zzbb(str2);
        new C0045zzf(this, zzbb);
        return doRead(taskApiCall);
    }

    public Task<C0039DeviceMetaData> getDeviceMetaData(String str) {
        C0796zzat zzat;
        C0267TaskApiCall taskApiCall;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(str2);
        new C0796zzat(str2);
        new C0047zzh(this, zzat);
        return doRead(taskApiCall);
    }

    public Task<Void> showUserChallenge(String str, PendingIntent pendingIntent) {
        C0809zzbf zzbf;
        C0267TaskApiCall taskApiCall;
        String str2 = str;
        PendingIntent pendingIntent2 = pendingIntent;
        Object checkNotNull = C0446Preconditions.checkNotNull(str2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(pendingIntent2);
        new C0809zzbf(str2, pendingIntent2);
        new C0049zzj(this, zzbf);
        return doWrite(taskApiCall);
    }

    public Task<Void> notifyCompletion(String str, int i) {
        C0802zzaz zzaz;
        C0267TaskApiCall taskApiCall;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(str2);
        new C0802zzaz(str2, i);
        new C0048zzi(this, zzaz);
        return doWrite(taskApiCall);
    }

    /* access modifiers changed from: private */
    public static void zzb(TaskCompletionSource taskCompletionSource, C0236Status status) {
        Exception exc;
        new C0036AccountTransferException(status);
        taskCompletionSource.setException(exc);
    }

    static {
        C0211Api.ClientKey<C0793zzaq> clientKey;
        C0211Api.AbstractClientBuilder<C0793zzaq, C0052zzm> abstractClientBuilder;
        C0211Api<C0052zzm> api;
        new C0211Api.ClientKey<>();
        zza = clientKey;
        new C0043zzd();
        zzb = abstractClientBuilder;
        new C0211Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzb, zza);
        zzc = api;
    }
}

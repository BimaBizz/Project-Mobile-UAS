package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.internal.common.C1114zzh;
import java.util.concurrent.Executor;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.concurrent.HandlerExecutor */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0619HandlerExecutor implements Executor {
    private final Handler zza;

    @C0206KeepForSdk
    public C0619HandlerExecutor(@RecentlyNonNull Looper looper) {
        Handler handler;
        new C1114zzh(looper);
        this.zza = handler;
    }

    public final void execute(@RecentlyNonNull Runnable runnable) {
        boolean post = this.zza.post(runnable);
    }
}

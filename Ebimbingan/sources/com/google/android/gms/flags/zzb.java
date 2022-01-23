package com.google.android.gms.flags;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.C0663ObjectWrapper;
import com.google.android.gms.dynamite.C0677DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

public final class zzb {
    private boolean zzj = false;
    private zzc zzk = null;

    public zzb() {
    }

    public final void initialize(Context context) {
        Context context2 = context;
        synchronized (this) {
            try {
                if (this.zzj) {
                    return;
                }
                this.zzk = zzd.asInterface(C0677DynamiteModule.load(context2, C0677DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.flags.impl.FlagProviderImpl"));
                this.zzk.init(C0663ObjectWrapper.wrap(context2));
                this.zzj = true;
            } catch (RemoteException | C0677DynamiteModule.LoadingException e) {
                int w = Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
            } catch (Throwable th) {
                Throwable th2 = th;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final <T> T zzb(Flag<T> flag) {
        Flag<T> flag2 = flag;
        synchronized (this) {
            try {
                if (!this.zzj) {
                    T zzb = flag2.zzb();
                    return zzb;
                }
                return flag2.zza(this.zzk);
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
    }
}

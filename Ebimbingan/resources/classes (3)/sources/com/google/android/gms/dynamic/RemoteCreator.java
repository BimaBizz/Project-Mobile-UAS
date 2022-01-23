package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class RemoteCreator<T> {
    private final String zza;
    private T zzb;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class RemoteCreatorException extends Exception {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @KeepForSdk
        public RemoteCreatorException(@RecentlyNonNull String str) {
            super(str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @KeepForSdk
        public RemoteCreatorException(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super(str, th);
        }
    }

    @KeepForSdk
    protected RemoteCreator(@RecentlyNonNull String str) {
        this.zza = str;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @KeepForSdk
    public abstract T getRemoteCreator(@RecentlyNonNull IBinder iBinder);

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    @KeepForSdk
    public final T getRemoteCreatorInstance(@RecentlyNonNull Context context) throws RemoteCreatorException {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Context context2 = context;
        if (this.zzb == null) {
            Object checkNotNull = Preconditions.checkNotNull(context2);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context2);
            if (remoteContext == null) {
                new RemoteCreatorException("Could not get remote context.");
                throw th4;
            }
            try {
                this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e) {
                new RemoteCreatorException("Could not load creator class.", e);
                throw th2;
            } catch (InstantiationException e2) {
                new RemoteCreatorException("Could not instantiate creator.", e2);
                throw th;
            } catch (IllegalAccessException e3) {
                new RemoteCreatorException("Could not access creator.", e3);
                throw th3;
            }
        }
        return this.zzb;
    }
}

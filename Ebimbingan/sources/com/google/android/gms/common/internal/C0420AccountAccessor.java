package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0437IAccountAccessor;

/* renamed from: com.google.android.gms.common.internal.AccountAccessor */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0420AccountAccessor extends C0437IAccountAccessor.Stub {
    @C0206KeepForSdk
    @RecentlyNullable
    public static Account getAccountBinderSafe(@RecentlyNonNull C0437IAccountAccessor iAccountAccessor) {
        Account account;
        C0437IAccountAccessor iAccountAccessor2 = iAccountAccessor;
        if (iAccountAccessor2 != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = iAccountAccessor2.zzb();
                Binder.restoreCallingIdentity(clearCallingIdentity);
            } catch (RemoteException e) {
                int w = Log.w("AccountAccessor", "Remote account accessor probably died");
                Binder.restoreCallingIdentity(clearCallingIdentity);
                account = null;
            } catch (Throwable th) {
                Throwable th2 = th;
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th2;
            }
        } else {
            account = null;
        }
        return account;
    }

    public final boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        throw null;
    }

    @RecentlyNonNull
    public final Account zzb() {
        throw null;
    }
}

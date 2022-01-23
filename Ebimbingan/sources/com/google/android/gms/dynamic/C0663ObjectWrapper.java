package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0612RetainForClient;
import com.google.android.gms.dynamic.C0661IObjectWrapper;
import java.lang.reflect.Field;

@C0612RetainForClient
@C0206KeepForSdk
/* renamed from: com.google.android.gms.dynamic.ObjectWrapper */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0663ObjectWrapper<T> extends C0661IObjectWrapper.Stub {
    private final T zza;

    private C0663ObjectWrapper(T t) {
        this.zza = t;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static <T> T unwrap(@RecentlyNonNull C0661IObjectWrapper iObjectWrapper) {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        C0661IObjectWrapper iObjectWrapper2 = iObjectWrapper;
        if (iObjectWrapper2 instanceof C0663ObjectWrapper) {
            return ((C0663ObjectWrapper) iObjectWrapper2).zza;
        }
        IBinder asBinder = iObjectWrapper2.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        Field field = null;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            Field field2 = declaredFields[i2];
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
            i2++;
            i = i;
        }
        if (i == 1) {
            Object checkNotNull = C0446Preconditions.checkNotNull(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    new IllegalArgumentException("Binder object is null.", e);
                    throw th3;
                } catch (IllegalAccessException e2) {
                    new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                    throw th4;
                }
            } else {
                new IllegalArgumentException("IObjectWrapper declared field not private!");
                throw th2;
            }
        } else {
            int length2 = declaredFields.length;
            new StringBuilder(64);
            StringBuilder append = sb.append("Unexpected number of IObjectWrapper declared fields: ");
            StringBuilder append2 = sb.append(length2);
            new IllegalArgumentException(sb.toString());
            throw th;
        }
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static <T> C0661IObjectWrapper wrap(@RecentlyNonNull T t) {
        C0661IObjectWrapper iObjectWrapper;
        new C0663ObjectWrapper(t);
        return iObjectWrapper;
    }
}

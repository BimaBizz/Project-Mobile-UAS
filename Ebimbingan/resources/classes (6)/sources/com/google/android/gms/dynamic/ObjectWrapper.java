package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

@RetainForClient
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    private final T zza;

    private ObjectWrapper(T t) {
        this.zza = t;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <T> T unwrap(@RecentlyNonNull IObjectWrapper iObjectWrapper) {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        IObjectWrapper iObjectWrapper2 = iObjectWrapper;
        if (iObjectWrapper2 instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper2).zza;
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
            Object checkNotNull = Preconditions.checkNotNull(field);
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
    @KeepForSdk
    public static <T> IObjectWrapper wrap(@RecentlyNonNull T t) {
        IObjectWrapper iObjectWrapper;
        new ObjectWrapper(t);
        return iObjectWrapper;
    }
}

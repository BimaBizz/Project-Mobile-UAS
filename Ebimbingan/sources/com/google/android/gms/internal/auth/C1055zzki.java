package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.auth.zzki */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1055zzki implements PrivilegedExceptionAction<Unsafe> {
    C1055zzki() {
    }

    public final /* synthetic */ Object run() throws Exception {
        Class<Unsafe> cls = Unsafe.class;
        Class<Unsafe> cls2 = cls;
        Field[] declaredFields = cls.getDeclaredFields();
        Field[] fieldArr = declaredFields;
        int length = declaredFields.length;
        for (int i = 0; i < length; i++) {
            Field field = fieldArr[i];
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls2.isInstance(obj)) {
                return cls2.cast(obj);
            }
        }
        return null;
    }
}

package com.google.android.gms.internal.firebase_auth;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class zzks implements PrivilegedExceptionAction<Unsafe> {
    zzks() {
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

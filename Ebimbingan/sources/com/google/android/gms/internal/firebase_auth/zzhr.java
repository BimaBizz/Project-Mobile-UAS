package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhf;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zzhr<T extends zzhf> {
    private static final Logger logger = Logger.getLogger(zzha.class.getName());
    private static String zzaaf = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    zzhr() {
    }

    /* access modifiers changed from: protected */
    public abstract T zzic();

    static <T extends zzhf> T zzc(Class<T> cls) {
        String format;
        Throwable th;
        ArrayList arrayList;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        String str;
        String str2;
        Throwable th5;
        Throwable th6;
        Throwable th7;
        Throwable th8;
        Class<T> cls2 = cls;
        ClassLoader classLoader = zzhr.class.getClassLoader();
        if (cls2.equals(zzhf.class)) {
            format = zzaaf;
        } else if (!cls2.getPackage().equals(zzhr.class.getPackage())) {
            Throwable th9 = th;
            new IllegalArgumentException(cls2.getName());
            throw th9;
        } else {
            Object[] objArr = new Object[2];
            objArr[0] = cls2.getPackage().getName();
            Object[] objArr2 = objArr;
            objArr2[1] = cls2.getSimpleName();
            format = String.format("%s.BlazeGenerated%sLoader", objArr2);
        }
        try {
            return (zzhf) cls2.cast(((zzhr) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zzic());
        } catch (NoSuchMethodException e) {
            NoSuchMethodException noSuchMethodException = e;
            Throwable th10 = th8;
            new IllegalStateException(noSuchMethodException);
            throw th10;
        } catch (InstantiationException e2) {
            InstantiationException instantiationException = e2;
            Throwable th11 = th7;
            new IllegalStateException(instantiationException);
            throw th11;
        } catch (IllegalAccessException e3) {
            IllegalAccessException illegalAccessException = e3;
            Throwable th12 = th6;
            new IllegalStateException(illegalAccessException);
            throw th12;
        } catch (InvocationTargetException e4) {
            InvocationTargetException invocationTargetException = e4;
            Throwable th13 = th5;
            new IllegalStateException(invocationTargetException);
            throw th13;
        } catch (ClassNotFoundException e5) {
            Iterator<S> it = ServiceLoader.load(zzhr.class, classLoader).iterator();
            new ArrayList();
            ArrayList arrayList2 = arrayList;
            while (it.hasNext()) {
                try {
                    boolean add = arrayList2.add(cls2.cast(((zzhr) it.next()).zzic()));
                } catch (ServiceConfigurationError e6) {
                    ServiceConfigurationError serviceConfigurationError = e6;
                    Logger logger2 = logger;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls2.getSimpleName());
                    String str3 = valueOf;
                    if (valueOf.length() != 0) {
                        str2 = "Unable to load ".concat(str3);
                    } else {
                        str2 = str;
                        new String("Unable to load ");
                    }
                    logger2.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str2, serviceConfigurationError);
                }
            }
            if (arrayList2.size() == 1) {
                return (zzhf) arrayList2.get(0);
            }
            if (arrayList2.size() == 0) {
                return null;
            }
            try {
                return (zzhf) cls2.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList2});
            } catch (NoSuchMethodException e7) {
                NoSuchMethodException noSuchMethodException2 = e7;
                Throwable th14 = th4;
                new IllegalStateException(noSuchMethodException2);
                throw th14;
            } catch (IllegalAccessException e8) {
                IllegalAccessException illegalAccessException2 = e8;
                Throwable th15 = th3;
                new IllegalStateException(illegalAccessException2);
                throw th15;
            } catch (InvocationTargetException e9) {
                InvocationTargetException invocationTargetException2 = e9;
                Throwable th16 = th2;
                new IllegalStateException(invocationTargetException2);
                throw th16;
            }
        }
    }
}

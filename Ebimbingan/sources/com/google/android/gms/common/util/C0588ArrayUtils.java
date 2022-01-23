package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0444Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@C0206KeepForSdk
@C0617VisibleForTesting
/* renamed from: com.google.android.gms.common.util.ArrayUtils */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0588ArrayUtils {
    private C0588ArrayUtils() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static <T> T[] appendToArray(@RecentlyNonNull T[] tArr, @RecentlyNonNull T t) {
        T[] copyOf;
        Throwable th;
        T[] tArr2 = tArr;
        T t2 = t;
        if (tArr2 == null && t2 == null) {
            new IllegalArgumentException("Cannot generate array of generic type w/o class info");
            throw th;
        }
        if (tArr2 == null) {
            copyOf = (Object[]) Array.newInstance(t2.getClass(), 1);
        } else {
            copyOf = Arrays.copyOf(tArr2, tArr2.length + 1);
        }
        copyOf[copyOf.length - 1] = t2;
        return copyOf;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static <T> T[] concat(@RecentlyNonNull T[]... tArr) {
        T[][] tArr2 = tArr;
        if (tArr2.length == 0) {
            return (Object[]) Array.newInstance(tArr2.getClass(), 0);
        }
        int i = 0;
        for (int i2 = 0; i2 < tArr2.length; i2++) {
            i += tArr2[i2].length;
        }
        T[] copyOf = Arrays.copyOf(tArr2[0], i);
        int length = tArr2[0].length;
        for (int i3 = 1; i3 < tArr2.length; i3++) {
            T[] tArr3 = tArr2[i3];
            int length2 = tArr3.length;
            System.arraycopy(tArr3, 0, copyOf, length, length2);
            length += length2;
        }
        return copyOf;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static byte[] concatByteArrays(@RecentlyNonNull byte[]... bArr) {
        byte[][] bArr2 = bArr;
        if (bArr2.length == 0) {
            return new byte[0];
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            i += bArr2[i2].length;
        }
        byte[] copyOf = Arrays.copyOf(bArr2[0], i);
        int length = bArr2[0].length;
        for (int i3 = 1; i3 < bArr2.length; i3++) {
            byte[] bArr3 = bArr2[i3];
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, copyOf, length, length2);
            length += length2;
        }
        return copyOf;
    }

    @C0206KeepForSdk
    public static boolean contains(@RecentlyNonNull int[] iArr, int i) {
        int[] iArr2 = iArr;
        int i2 = i;
        if (iArr2 == null) {
            return false;
        }
        int length = iArr2.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (iArr2[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.RecentlyNonNull
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> java.util.ArrayList<T> newArrayList() {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            r0 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C0588ArrayUtils.newArrayList():java.util.ArrayList");
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static <T> ArrayList<T> toArrayList(@RecentlyNonNull T[] tArr) {
        ArrayList arrayList;
        T[] tArr2 = tArr;
        int length = tArr2.length;
        new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            boolean add = arrayList.add(tArr2[i]);
        }
        return arrayList;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static int[] toPrimitiveArray(@RecentlyNonNull Collection<Integer> collection) {
        Collection<Integer> collection2 = collection;
        if (collection2 == null || collection2.size() == 0) {
            return new int[0];
        }
        int[] iArr = new int[collection2.size()];
        Iterator<Integer> it = collection2.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return iArr;
            }
            iArr[i2] = it.next().intValue();
            i = i2 + 1;
        }
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public static Integer[] toWrapperArray(@RecentlyNonNull int[] iArr) {
        int[] iArr2 = iArr;
        if (iArr2 == null) {
            return null;
        }
        int length = iArr2.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr2[i]);
        }
        return numArr;
    }

    @C0206KeepForSdk
    public static void writeArray(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull double[] dArr) {
        StringBuilder sb2 = sb;
        double[] dArr2 = dArr;
        int length = dArr2.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                StringBuilder append = sb2.append(",");
            }
            StringBuilder append2 = sb2.append(Double.toString(dArr2[i]));
        }
    }

    @C0206KeepForSdk
    public static void writeStringArray(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull String[] strArr) {
        StringBuilder sb2 = sb;
        String[] strArr2 = strArr;
        int length = strArr2.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                StringBuilder append = sb2.append(",");
            }
            StringBuilder append2 = sb2.append("\"");
            StringBuilder append3 = sb2.append(strArr2[i]);
            StringBuilder append4 = sb2.append("\"");
        }
    }

    @C0206KeepForSdk
    public static <T> boolean contains(@RecentlyNonNull T[] tArr, @RecentlyNonNull T t) {
        T[] tArr2 = tArr;
        T t2 = t;
        int length = tArr2 != null ? tArr2.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!C0444Objects.equal(tArr2[i], t2)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    @C0206KeepForSdk
    public static void writeArray(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull float[] fArr) {
        StringBuilder sb2 = sb;
        float[] fArr2 = fArr;
        int length = fArr2.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                StringBuilder append = sb2.append(",");
            }
            StringBuilder append2 = sb2.append(Float.toString(fArr2[i]));
        }
    }

    @C0206KeepForSdk
    public static void writeArray(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull int[] iArr) {
        StringBuilder sb2 = sb;
        int[] iArr2 = iArr;
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                StringBuilder append = sb2.append(",");
            }
            StringBuilder append2 = sb2.append(Integer.toString(iArr2[i]));
        }
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public static <T> T[] removeAll(@RecentlyNonNull T[] tArr, @RecentlyNonNull T... tArr2) {
        int length;
        int i;
        T[] tArr3;
        T[] tArr4 = tArr;
        T[] tArr5 = tArr2;
        if (tArr4 == null) {
            return null;
        }
        if (tArr5 == null || (length = tArr5.length) == 0) {
            return Arrays.copyOf(tArr4, tArr4.length);
        }
        Class<?> componentType = tArr5.getClass().getComponentType();
        int length2 = tArr4.length;
        T[] tArr6 = (Object[]) Array.newInstance(componentType, length2);
        if (length == 1) {
            int i2 = 0;
            for (int i3 = 0; i3 < length2; i3++) {
                T t = tArr4[i3];
                if (!C0444Objects.equal(tArr5[0], t)) {
                    tArr6[i2] = t;
                    i2++;
                }
            }
            i = i2;
        } else {
            int i4 = 0;
            for (int i5 = 0; i5 < length2; i5++) {
                T t2 = tArr4[i5];
                if (!contains(tArr5, t2)) {
                    tArr6[i4] = t2;
                    i4++;
                }
            }
            i = i4;
        }
        if (tArr6 == null) {
            tArr3 = null;
        } else if (i != tArr6.length) {
            return Arrays.copyOf(tArr6, i);
        } else {
            tArr3 = tArr6;
        }
        return tArr3;
    }

    @C0206KeepForSdk
    public static void writeArray(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull long[] jArr) {
        StringBuilder sb2 = sb;
        long[] jArr2 = jArr;
        int length = jArr2.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                StringBuilder append = sb2.append(",");
            }
            StringBuilder append2 = sb2.append(Long.toString(jArr2[i]));
        }
    }

    @C0206KeepForSdk
    public static <T> void writeArray(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull T[] tArr) {
        StringBuilder sb2 = sb;
        T[] tArr2 = tArr;
        int length = tArr2.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                StringBuilder append = sb2.append(",");
            }
            StringBuilder append2 = sb2.append(tArr2[i]);
        }
    }

    @C0206KeepForSdk
    public static void writeArray(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull boolean[] zArr) {
        StringBuilder sb2 = sb;
        boolean[] zArr2 = zArr;
        int length = zArr2.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                StringBuilder append = sb2.append(",");
            }
            StringBuilder append2 = sb2.append(Boolean.toString(zArr2[i]));
        }
    }
}

package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.RecentlyNonNull;
import androidx.core.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelReader */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0461SafeParcelReader {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(@androidx.annotation.RecentlyNonNull java.lang.String r10, @androidx.annotation.RecentlyNonNull android.os.Parcel r11) {
            /*
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r11
                r6 = r2
                int r6 = r6.dataPosition()
                r3 = r6
                r6 = r2
                int r6 = r6.dataSize()
                r2 = r6
                r6 = r1
                java.lang.String r6 = java.lang.String.valueOf(r6)
                r4 = r6
                r6 = r4
                int r6 = r6.length()
                r4 = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r5 = r6
                r6 = r5
                r7 = r4
                r8 = 41
                int r7 = r7 + 41
                r6.<init>(r7)
                r6 = r5
                r7 = r1
                java.lang.StringBuilder r6 = r6.append(r7)
                r6 = r5
                java.lang.String r7 = " Parcel: pos="
                java.lang.StringBuilder r6 = r6.append(r7)
                r6 = r5
                r7 = r3
                java.lang.StringBuilder r6 = r6.append(r7)
                r6 = r5
                java.lang.String r7 = " size="
                java.lang.StringBuilder r6 = r6.append(r7)
                r6 = r5
                r7 = r2
                java.lang.StringBuilder r6 = r6.append(r7)
                r6 = r0
                r7 = r5
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    private C0461SafeParcelReader() {
    }

    @RecentlyNonNull
    public static BigDecimal createBigDecimal(@RecentlyNonNull Parcel parcel, int i) {
        BigDecimal bigDecimal;
        BigInteger bigInteger;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel2.createByteArray();
        int readInt = parcel2.readInt();
        parcel2.setDataPosition(dataPosition + readSize);
        new BigInteger(createByteArray);
        new BigDecimal(bigInteger, readInt);
        return bigDecimal;
    }

    @RecentlyNonNull
    public static BigDecimal[] createBigDecimalArray(@RecentlyNonNull Parcel parcel, int i) {
        BigDecimal bigDecimal;
        BigInteger bigInteger;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel2.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel2.createByteArray();
            int readInt2 = parcel2.readInt();
            new BigInteger(createByteArray);
            new BigDecimal(bigInteger, readInt2);
            bigDecimalArr[i2] = bigDecimal;
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return bigDecimalArr;
    }

    @RecentlyNonNull
    public static BigInteger createBigInteger(@RecentlyNonNull Parcel parcel, int i) {
        BigInteger bigInteger;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel2.createByteArray();
        parcel2.setDataPosition(dataPosition + readSize);
        new BigInteger(createByteArray);
        return bigInteger;
    }

    @RecentlyNonNull
    public static BigInteger[] createBigIntegerArray(@RecentlyNonNull Parcel parcel, int i) {
        BigInteger bigInteger;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel2.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            new BigInteger(parcel2.createByteArray());
            bigIntegerArr[i2] = bigInteger;
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return bigIntegerArr;
    }

    @RecentlyNonNull
    public static boolean[] createBooleanArray(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel2.createBooleanArray();
        parcel2.setDataPosition(dataPosition + readSize);
        return createBooleanArray;
    }

    @RecentlyNonNull
    public static ArrayList<Boolean> createBooleanList(@RecentlyNonNull Parcel parcel, int i) {
        ArrayList arrayList;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        new ArrayList<>();
        int readInt = parcel2.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            boolean add = arrayList.add(Boolean.valueOf(parcel2.readInt() != 0));
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @RecentlyNonNull
    public static Bundle createBundle(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        Bundle readBundle = parcel2.readBundle();
        parcel2.setDataPosition(dataPosition + readSize);
        return readBundle;
    }

    @RecentlyNonNull
    public static byte[] createByteArray(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel2.createByteArray();
        parcel2.setDataPosition(dataPosition + readSize);
        return createByteArray;
    }

    @RecentlyNonNull
    public static byte[][] createByteArrayArray(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel2.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel2.createByteArray();
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return bArr;
    }

    @RecentlyNonNull
    public static SparseArray<byte[]> createByteArraySparseArray(@RecentlyNonNull Parcel parcel, int i) {
        SparseArray sparseArray;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel2.readInt();
        new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel2.readInt(), parcel2.createByteArray());
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @RecentlyNonNull
    public static char[] createCharArray(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        char[] createCharArray = parcel2.createCharArray();
        parcel2.setDataPosition(dataPosition + readSize);
        return createCharArray;
    }

    @RecentlyNonNull
    public static double[] createDoubleArray(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        double[] createDoubleArray = parcel2.createDoubleArray();
        parcel2.setDataPosition(dataPosition + readSize);
        return createDoubleArray;
    }

    @RecentlyNonNull
    public static ArrayList<Double> createDoubleList(@RecentlyNonNull Parcel parcel, int i) {
        ArrayList arrayList;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        new ArrayList<>();
        int readInt = parcel2.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            boolean add = arrayList.add(Double.valueOf(parcel2.readDouble()));
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @RecentlyNonNull
    public static SparseArray<Double> createDoubleSparseArray(@RecentlyNonNull Parcel parcel, int i) {
        SparseArray sparseArray;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        new SparseArray<>();
        int readInt = parcel2.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel2.readInt(), Double.valueOf(parcel2.readDouble()));
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @RecentlyNonNull
    public static float[] createFloatArray(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        float[] createFloatArray = parcel2.createFloatArray();
        parcel2.setDataPosition(dataPosition + readSize);
        return createFloatArray;
    }

    @RecentlyNonNull
    public static ArrayList<Float> createFloatList(@RecentlyNonNull Parcel parcel, int i) {
        ArrayList arrayList;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        new ArrayList<>();
        int readInt = parcel2.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            boolean add = arrayList.add(Float.valueOf(parcel2.readFloat()));
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @RecentlyNonNull
    public static SparseArray<Float> createFloatSparseArray(@RecentlyNonNull Parcel parcel, int i) {
        SparseArray sparseArray;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        new SparseArray<>();
        int readInt = parcel2.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel2.readInt(), Float.valueOf(parcel2.readFloat()));
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @RecentlyNonNull
    public static IBinder[] createIBinderArray(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        IBinder[] createBinderArray = parcel2.createBinderArray();
        parcel2.setDataPosition(dataPosition + readSize);
        return createBinderArray;
    }

    @RecentlyNonNull
    public static ArrayList<IBinder> createIBinderList(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<IBinder> createBinderArrayList = parcel2.createBinderArrayList();
        parcel2.setDataPosition(dataPosition + readSize);
        return createBinderArrayList;
    }

    @RecentlyNonNull
    public static SparseArray<IBinder> createIBinderSparseArray(@RecentlyNonNull Parcel parcel, int i) {
        SparseArray sparseArray;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel2.readInt();
        new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel2.readInt(), parcel2.readStrongBinder());
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @RecentlyNonNull
    public static int[] createIntArray(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int[] createIntArray = parcel2.createIntArray();
        parcel2.setDataPosition(dataPosition + readSize);
        return createIntArray;
    }

    @RecentlyNonNull
    public static ArrayList<Integer> createIntegerList(@RecentlyNonNull Parcel parcel, int i) {
        ArrayList arrayList;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        new ArrayList<>();
        int readInt = parcel2.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            boolean add = arrayList.add(Integer.valueOf(parcel2.readInt()));
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @RecentlyNonNull
    public static long[] createLongArray(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        long[] createLongArray = parcel2.createLongArray();
        parcel2.setDataPosition(dataPosition + readSize);
        return createLongArray;
    }

    @RecentlyNonNull
    public static ArrayList<Long> createLongList(@RecentlyNonNull Parcel parcel, int i) {
        ArrayList arrayList;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        new ArrayList<>();
        int readInt = parcel2.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            boolean add = arrayList.add(Long.valueOf(parcel2.readLong()));
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @RecentlyNonNull
    public static Parcel createParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel2, dataPosition, readSize);
        parcel2.setDataPosition(dataPosition + readSize);
        return obtain;
    }

    @RecentlyNonNull
    public static Parcel[] createParcelArray(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel2.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel2.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel2.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel2, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel2.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return parcelArr;
    }

    @RecentlyNonNull
    public static ArrayList<Parcel> createParcelList(@RecentlyNonNull Parcel parcel, int i) {
        ArrayList arrayList;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel2.readInt();
        new ArrayList<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel2.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel2.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel2, dataPosition2, readInt2);
                boolean add = arrayList.add(obtain);
                parcel2.setDataPosition(dataPosition2 + readInt2);
            } else {
                boolean add2 = arrayList.add((Object) null);
            }
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @RecentlyNonNull
    public static SparseArray<Parcel> createParcelSparseArray(@RecentlyNonNull Parcel parcel, int i) {
        SparseArray sparseArray;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel2.readInt();
        new SparseArray<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel2.readInt();
            int readInt3 = parcel2.readInt();
            if (readInt3 != 0) {
                int dataPosition2 = parcel2.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel2, dataPosition2, readInt3);
                sparseArray.append(readInt2, obtain);
                parcel2.setDataPosition(dataPosition2 + readInt3);
            } else {
                sparseArray.append(readInt2, (Object) null);
            }
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @RecentlyNonNull
    public static <T extends Parcelable> T createParcelable(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        Parcel parcel2 = parcel;
        Parcelable.Creator<T> creator2 = creator;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        T t = (Parcelable) creator2.createFromParcel(parcel2);
        parcel2.setDataPosition(dataPosition + readSize);
        return t;
    }

    @RecentlyNonNull
    public static SparseBooleanArray createSparseBooleanArray(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseBooleanArray readSparseBooleanArray = parcel2.readSparseBooleanArray();
        parcel2.setDataPosition(dataPosition + readSize);
        return readSparseBooleanArray;
    }

    @RecentlyNonNull
    public static SparseIntArray createSparseIntArray(@RecentlyNonNull Parcel parcel, int i) {
        SparseIntArray sparseIntArray;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        new SparseIntArray();
        int readInt = parcel2.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseIntArray.append(parcel2.readInt(), parcel2.readInt());
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return sparseIntArray;
    }

    @RecentlyNonNull
    public static SparseLongArray createSparseLongArray(@RecentlyNonNull Parcel parcel, int i) {
        SparseLongArray sparseLongArray;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        new SparseLongArray();
        int readInt = parcel2.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseLongArray.append(parcel2.readInt(), parcel2.readLong());
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return sparseLongArray;
    }

    @RecentlyNonNull
    public static String createString(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        String readString = parcel2.readString();
        parcel2.setDataPosition(dataPosition + readSize);
        return readString;
    }

    @RecentlyNonNull
    public static String[] createStringArray(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        String[] createStringArray = parcel2.createStringArray();
        parcel2.setDataPosition(dataPosition + readSize);
        return createStringArray;
    }

    @RecentlyNonNull
    public static ArrayList<String> createStringList(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
        parcel2.setDataPosition(dataPosition + readSize);
        return createStringArrayList;
    }

    @RecentlyNonNull
    public static SparseArray<String> createStringSparseArray(@RecentlyNonNull Parcel parcel, int i) {
        SparseArray sparseArray;
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        new SparseArray<>();
        int readInt = parcel2.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel2.readInt(), parcel2.readString());
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @RecentlyNonNull
    public static <T> T[] createTypedArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        Parcel parcel2 = parcel;
        Parcelable.Creator<T> creator2 = creator;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        T[] createTypedArray = parcel2.createTypedArray(creator2);
        parcel2.setDataPosition(dataPosition + readSize);
        return createTypedArray;
    }

    @RecentlyNonNull
    public static <T> ArrayList<T> createTypedList(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        Parcel parcel2 = parcel;
        Parcelable.Creator<T> creator2 = creator;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel2.createTypedArrayList(creator2);
        parcel2.setDataPosition(dataPosition + readSize);
        return createTypedArrayList;
    }

    @RecentlyNonNull
    public static <T> SparseArray<T> createTypedSparseArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        SparseArray sparseArray;
        T t;
        Parcel parcel2 = parcel;
        Parcelable.Creator<T> creator2 = creator;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel2.readInt();
        new SparseArray<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel2.readInt();
            if (parcel2.readInt() != 0) {
                t = creator2.createFromParcel(parcel2);
            } else {
                t = null;
            }
            sparseArray.append(readInt2, t);
        }
        parcel2.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static void ensureAtEnd(@RecentlyNonNull Parcel parcel, int i) {
        Throwable th;
        StringBuilder sb;
        Parcel parcel2 = parcel;
        int i2 = i;
        if (parcel2.dataPosition() != i2) {
            new StringBuilder(37);
            StringBuilder append = sb.append("Overread allowed size end=");
            StringBuilder append2 = sb.append(i2);
            new ParseException(sb.toString(), parcel2);
            throw th;
        }
    }

    public static int getFieldId(int i) {
        return (char) i;
    }

    public static boolean readBoolean(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 4);
        return parcel2.readInt() != 0;
    }

    @RecentlyNonNull
    public static Boolean readBooleanObject(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int readSize = readSize(parcel2, i2);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel2, i2, readSize, 4);
        return Boolean.valueOf(parcel2.readInt() != 0);
    }

    public static byte readByte(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 4);
        return (byte) parcel2.readInt();
    }

    public static char readChar(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 4);
        return (char) parcel2.readInt();
    }

    public static double readDouble(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 8);
        return parcel2.readDouble();
    }

    @RecentlyNonNull
    public static Double readDoubleObject(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int readSize = readSize(parcel2, i2);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel2, i2, readSize, 8);
        return Double.valueOf(parcel2.readDouble());
    }

    public static float readFloat(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 4);
        return parcel2.readFloat();
    }

    @RecentlyNonNull
    public static Float readFloatObject(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int readSize = readSize(parcel2, i2);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel2, i2, readSize, 4);
        return Float.valueOf(parcel2.readFloat());
    }

    public static int readHeader(@RecentlyNonNull Parcel parcel) {
        return parcel.readInt();
    }

    @RecentlyNonNull
    public static IBinder readIBinder(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel2.readStrongBinder();
        parcel2.setDataPosition(dataPosition + readSize);
        return readStrongBinder;
    }

    public static int readInt(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 4);
        return parcel2.readInt();
    }

    @RecentlyNonNull
    public static Integer readIntegerObject(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int readSize = readSize(parcel2, i2);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel2, i2, readSize, 4);
        return Integer.valueOf(parcel2.readInt());
    }

    public static void readList(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List list, @RecentlyNonNull ClassLoader classLoader) {
        Parcel parcel2 = parcel;
        List list2 = list;
        ClassLoader classLoader2 = classLoader;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize != 0) {
            parcel2.readList(list2, classLoader2);
            parcel2.setDataPosition(dataPosition + readSize);
        }
    }

    public static long readLong(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 8);
        return parcel2.readLong();
    }

    @RecentlyNonNull
    public static Long readLongObject(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int readSize = readSize(parcel2, i2);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel2, i2, readSize, 8);
        return Long.valueOf(parcel2.readLong());
    }

    @RecentlyNonNull
    public static PendingIntent readPendingIntent(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int readSize = readSize(parcel2, i);
        int dataPosition = parcel2.dataPosition();
        if (readSize == 0) {
            return null;
        }
        PendingIntent readPendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel2);
        parcel2.setDataPosition(dataPosition + readSize);
        return readPendingIntentOrNullFromParcel;
    }

    public static short readShort(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 4);
        return (short) parcel2.readInt();
    }

    public static int readSize(@RecentlyNonNull Parcel parcel, int i) {
        int i2 = i;
        return (i2 & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void skipUnknownField(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        parcel2.setDataPosition(parcel2.dataPosition() + readSize(parcel2, i));
    }

    public static int validateObjectHeader(@RecentlyNonNull Parcel parcel) {
        Throwable th;
        StringBuilder sb;
        String str;
        ParseException parseException;
        Parcel parcel2 = parcel;
        int readHeader = readHeader(parcel2);
        int readSize = readSize(parcel2, readHeader);
        int dataPosition = parcel2.dataPosition();
        if (getFieldId(readHeader) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readHeader));
            String str2 = "Expected object header. Got 0x";
            if (valueOf.length() != 0) {
                str = str2.concat(valueOf);
            } else {
                new String(str2);
            }
            parseException = new ParseException(str, parcel2);
            throw r2;
        }
        int i = dataPosition + readSize;
        if (i >= dataPosition && i <= parcel2.dataSize()) {
            return i;
        }
        new StringBuilder(54);
        StringBuilder append = sb.append("Size read is invalid start=");
        StringBuilder append2 = sb.append(dataPosition);
        StringBuilder append3 = sb.append(" end=");
        StringBuilder append4 = sb.append(i);
        new ParseException(sb.toString(), parcel2);
        throw th;
    }

    private static void zza(Parcel parcel, int i, int i2) {
        Throwable th;
        StringBuilder sb;
        Parcel parcel2 = parcel;
        int i3 = i2;
        int readSize = readSize(parcel2, i);
        if (readSize != i3) {
            String hexString = Integer.toHexString(readSize);
            new StringBuilder(String.valueOf(hexString).length() + 46);
            StringBuilder append = sb.append("Expected size ");
            StringBuilder append2 = sb.append(i3);
            StringBuilder append3 = sb.append(" got ");
            StringBuilder append4 = sb.append(readSize);
            StringBuilder append5 = sb.append(" (0x");
            StringBuilder append6 = sb.append(hexString);
            StringBuilder append7 = sb.append(")");
            new ParseException(sb.toString(), parcel2);
            throw th;
        }
    }

    private static void zzb(Parcel parcel, int i, int i2, int i3) {
        Throwable th;
        StringBuilder sb;
        Parcel parcel2 = parcel;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (i5 != i6) {
            String hexString = Integer.toHexString(i5);
            new StringBuilder(String.valueOf(hexString).length() + 46);
            StringBuilder append = sb.append("Expected size ");
            StringBuilder append2 = sb.append(i6);
            StringBuilder append3 = sb.append(" got ");
            StringBuilder append4 = sb.append(i5);
            StringBuilder append5 = sb.append(" (0x");
            StringBuilder append6 = sb.append(hexString);
            StringBuilder append7 = sb.append(")");
            new ParseException(sb.toString(), parcel2);
            throw th;
        }
    }
}

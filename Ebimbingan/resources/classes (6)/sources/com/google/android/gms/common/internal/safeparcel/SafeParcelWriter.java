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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(@RecentlyNonNull Parcel parcel) {
        return zzb(parcel, 20293);
    }

    public static void finishObjectHeader(@RecentlyNonNull Parcel parcel, int i) {
        zzc(parcel, i);
    }

    public static void writeBigDecimal(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull BigDecimal bigDecimal, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        BigDecimal bigDecimal2 = bigDecimal;
        boolean z2 = z;
        if (bigDecimal2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeByteArray(bigDecimal2.unscaledValue().toByteArray());
            parcel2.writeInt(bigDecimal2.scale());
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeBigDecimalArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull BigDecimal[] bigDecimalArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        BigDecimal[] bigDecimalArr2 = bigDecimalArr;
        boolean z2 = z;
        if (bigDecimalArr2 != null) {
            int zzb = zzb(parcel2, i2);
            int length = bigDecimalArr2.length;
            parcel2.writeInt(length);
            for (int i3 = 0; i3 < length; i3++) {
                parcel2.writeByteArray(bigDecimalArr2[i3].unscaledValue().toByteArray());
                parcel2.writeInt(bigDecimalArr2[i3].scale());
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeBigInteger(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull BigInteger bigInteger, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        BigInteger bigInteger2 = bigInteger;
        boolean z2 = z;
        if (bigInteger2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeByteArray(bigInteger2.toByteArray());
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeBigIntegerArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull BigInteger[] bigIntegerArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        BigInteger[] bigIntegerArr2 = bigIntegerArr;
        boolean z2 = z;
        if (bigIntegerArr2 != null) {
            int zzb = zzb(parcel2, i2);
            int length = bigIntegerArr2.length;
            parcel2.writeInt(length);
            for (int i3 = 0; i3 < length; i3++) {
                parcel2.writeByteArray(bigIntegerArr2[i3].toByteArray());
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeBoolean(@RecentlyNonNull Parcel parcel, int i, boolean z) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 4);
        parcel2.writeInt(z ? 1 : 0);
    }

    public static void writeBooleanArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull boolean[] zArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        boolean[] zArr2 = zArr;
        boolean z2 = z;
        if (zArr2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeBooleanArray(zArr2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeBooleanList(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<Boolean> list, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        List<Boolean> list2 = list;
        boolean z2 = z;
        if (list2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = list2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeInt(list2.get(i3).booleanValue() ? 1 : 0);
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeBooleanObject(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Boolean bool, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        Boolean bool2 = bool;
        boolean z2 = z;
        if (bool2 != null) {
            zza(parcel2, i2, 4);
            parcel2.writeInt(bool2.booleanValue() ? 1 : 0);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeBundle(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Bundle bundle, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        Bundle bundle2 = bundle;
        boolean z2 = z;
        if (bundle2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeBundle(bundle2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeByte(@RecentlyNonNull Parcel parcel, int i, byte b) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 4);
        parcel2.writeInt(b);
    }

    public static void writeByteArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull byte[] bArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        byte[] bArr2 = bArr;
        boolean z2 = z;
        if (bArr2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeByteArray(bArr2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeByteArrayArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull byte[][] bArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        byte[][] bArr2 = bArr;
        boolean z2 = z;
        if (bArr2 != null) {
            int zzb = zzb(parcel2, i2);
            int length = bArr2.length;
            parcel2.writeInt(length);
            for (int i3 = 0; i3 < length; i3++) {
                parcel2.writeByteArray(bArr2[i3]);
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeByteArraySparseArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull SparseArray<byte[]> sparseArray, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        SparseArray<byte[]> sparseArray2 = sparseArray;
        boolean z2 = z;
        if (sparseArray2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = sparseArray2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeInt(sparseArray2.keyAt(i3));
                parcel2.writeByteArray(sparseArray2.valueAt(i3));
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeChar(@RecentlyNonNull Parcel parcel, int i, char c) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 4);
        parcel2.writeInt(c);
    }

    public static void writeCharArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull char[] cArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        char[] cArr2 = cArr;
        boolean z2 = z;
        if (cArr2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeCharArray(cArr2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeDouble(@RecentlyNonNull Parcel parcel, int i, double d) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 8);
        parcel2.writeDouble(d);
    }

    public static void writeDoubleArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull double[] dArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        double[] dArr2 = dArr;
        boolean z2 = z;
        if (dArr2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeDoubleArray(dArr2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeDoubleList(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<Double> list, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        List<Double> list2 = list;
        boolean z2 = z;
        if (list2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = list2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeDouble(list2.get(i3).doubleValue());
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeDoubleObject(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Double d, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        Double d2 = d;
        boolean z2 = z;
        if (d2 != null) {
            zza(parcel2, i2, 8);
            parcel2.writeDouble(d2.doubleValue());
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeDoubleSparseArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull SparseArray<Double> sparseArray, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        SparseArray<Double> sparseArray2 = sparseArray;
        boolean z2 = z;
        if (sparseArray2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = sparseArray2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeInt(sparseArray2.keyAt(i3));
                parcel2.writeDouble(sparseArray2.valueAt(i3).doubleValue());
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeFloat(@RecentlyNonNull Parcel parcel, int i, float f) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 4);
        parcel2.writeFloat(f);
    }

    public static void writeFloatArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull float[] fArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        float[] fArr2 = fArr;
        boolean z2 = z;
        if (fArr2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeFloatArray(fArr2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeFloatList(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<Float> list, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        List<Float> list2 = list;
        boolean z2 = z;
        if (list2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = list2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeFloat(list2.get(i3).floatValue());
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeFloatObject(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Float f, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        Float f2 = f;
        boolean z2 = z;
        if (f2 != null) {
            zza(parcel2, i2, 4);
            parcel2.writeFloat(f2.floatValue());
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeFloatSparseArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull SparseArray<Float> sparseArray, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        SparseArray<Float> sparseArray2 = sparseArray;
        boolean z2 = z;
        if (sparseArray2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = sparseArray2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeInt(sparseArray2.keyAt(i3));
                parcel2.writeFloat(sparseArray2.valueAt(i3).floatValue());
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeIBinder(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull IBinder iBinder, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        IBinder iBinder2 = iBinder;
        boolean z2 = z;
        if (iBinder2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeStrongBinder(iBinder2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeIBinderArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull IBinder[] iBinderArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        IBinder[] iBinderArr2 = iBinderArr;
        boolean z2 = z;
        if (iBinderArr2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeBinderArray(iBinderArr2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeIBinderList(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<IBinder> list, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        List<IBinder> list2 = list;
        boolean z2 = z;
        if (list2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeBinderList(list2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeIBinderSparseArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull SparseArray<IBinder> sparseArray, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        SparseArray<IBinder> sparseArray2 = sparseArray;
        boolean z2 = z;
        if (sparseArray2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = sparseArray2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeInt(sparseArray2.keyAt(i3));
                parcel2.writeStrongBinder(sparseArray2.valueAt(i3));
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeInt(@RecentlyNonNull Parcel parcel, int i, int i2) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 4);
        parcel2.writeInt(i2);
    }

    public static void writeIntArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull int[] iArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int[] iArr2 = iArr;
        boolean z2 = z;
        if (iArr2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeIntArray(iArr2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeIntegerList(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<Integer> list, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        List<Integer> list2 = list;
        boolean z2 = z;
        if (list2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = list2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeInt(list2.get(i3).intValue());
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeIntegerObject(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Integer num, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        Integer num2 = num;
        boolean z2 = z;
        if (num2 != null) {
            zza(parcel2, i2, 4);
            parcel2.writeInt(num2.intValue());
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeList(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List list, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        List list2 = list;
        boolean z2 = z;
        if (list2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeList(list2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeLong(@RecentlyNonNull Parcel parcel, int i, long j) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 8);
        parcel2.writeLong(j);
    }

    public static void writeLongArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull long[] jArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        long[] jArr2 = jArr;
        boolean z2 = z;
        if (jArr2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeLongArray(jArr2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeLongList(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<Long> list, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        List<Long> list2 = list;
        boolean z2 = z;
        if (list2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = list2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeLong(list2.get(i3).longValue());
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeLongObject(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Long l, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        Long l2 = l;
        boolean z2 = z;
        if (l2 != null) {
            zza(parcel2, i2, 8);
            parcel2.writeLong(l2.longValue());
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeParcel(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcel parcel2, boolean z) {
        Parcel parcel3 = parcel;
        int i2 = i;
        Parcel parcel4 = parcel2;
        boolean z2 = z;
        if (parcel4 != null) {
            int zzb = zzb(parcel3, i2);
            parcel3.appendFrom(parcel4, 0, parcel4.dataSize());
            zzc(parcel3, zzb);
        } else if (z2) {
            zza(parcel3, i2, 0);
        }
    }

    public static void writeParcelArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcel[] parcelArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        Parcel[] parcelArr2 = parcelArr;
        boolean z2 = z;
        if (parcelArr2 != null) {
            int zzb = zzb(parcel2, i2);
            int length = parcelArr2.length;
            parcel2.writeInt(length);
            for (int i3 = 0; i3 < length; i3++) {
                Parcel parcel3 = parcelArr2[i3];
                if (parcel3 != null) {
                    parcel2.writeInt(parcel3.dataSize());
                    parcel2.appendFrom(parcel3, 0, parcel3.dataSize());
                } else {
                    parcel2.writeInt(0);
                }
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeParcelList(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<Parcel> list, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        List<Parcel> list2 = list;
        boolean z2 = z;
        if (list2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = list2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                Parcel parcel3 = list2.get(i3);
                if (parcel3 != null) {
                    parcel2.writeInt(parcel3.dataSize());
                    parcel2.appendFrom(parcel3, 0, parcel3.dataSize());
                } else {
                    parcel2.writeInt(0);
                }
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeParcelSparseArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull SparseArray<Parcel> sparseArray, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        SparseArray<Parcel> sparseArray2 = sparseArray;
        boolean z2 = z;
        if (sparseArray2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = sparseArray2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeInt(sparseArray2.keyAt(i3));
                Parcel valueAt = sparseArray2.valueAt(i3);
                if (valueAt != null) {
                    parcel2.writeInt(valueAt.dataSize());
                    parcel2.appendFrom(valueAt, 0, valueAt.dataSize());
                } else {
                    parcel2.writeInt(0);
                }
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeParcelable(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable parcelable, int i2, boolean z) {
        Parcel parcel2 = parcel;
        int i3 = i;
        Parcelable parcelable2 = parcelable;
        int i4 = i2;
        boolean z2 = z;
        if (parcelable2 != null) {
            int zzb = zzb(parcel2, i3);
            parcelable2.writeToParcel(parcel2, i4);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i3, 0);
        }
    }

    public static void writePendingIntent(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull PendingIntent pendingIntent, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        PendingIntent pendingIntent2 = pendingIntent;
        boolean z2 = z;
        if (pendingIntent2 != null) {
            int zzb = zzb(parcel2, i2);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent2, parcel2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeShort(@RecentlyNonNull Parcel parcel, int i, short s) {
        Parcel parcel2 = parcel;
        zza(parcel2, i, 4);
        parcel2.writeInt(s);
    }

    public static void writeSparseBooleanArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull SparseBooleanArray sparseBooleanArray, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
        boolean z2 = z;
        if (sparseBooleanArray2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeSparseBooleanArray(sparseBooleanArray2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeSparseIntArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull SparseIntArray sparseIntArray, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        SparseIntArray sparseIntArray2 = sparseIntArray;
        boolean z2 = z;
        if (sparseIntArray2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = sparseIntArray2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeInt(sparseIntArray2.keyAt(i3));
                parcel2.writeInt(sparseIntArray2.valueAt(i3));
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeSparseLongArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull SparseLongArray sparseLongArray, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        SparseLongArray sparseLongArray2 = sparseLongArray;
        boolean z2 = z;
        if (sparseLongArray2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = sparseLongArray2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeInt(sparseLongArray2.keyAt(i3));
                parcel2.writeLong(sparseLongArray2.valueAt(i3));
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeString(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String str, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        String str2 = str;
        boolean z2 = z;
        if (str2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeString(str2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeStringArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String[] strArr, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        String[] strArr2 = strArr;
        boolean z2 = z;
        if (strArr2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeStringArray(strArr2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeStringList(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<String> list, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        List<String> list2 = list;
        boolean z2 = z;
        if (list2 != null) {
            int zzb = zzb(parcel2, i2);
            parcel2.writeStringList(list2);
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static void writeStringSparseArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull SparseArray<String> sparseArray, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        SparseArray<String> sparseArray2 = sparseArray;
        boolean z2 = z;
        if (sparseArray2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = sparseArray2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeInt(sparseArray2.keyAt(i3));
                parcel2.writeString(sparseArray2.valueAt(i3));
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static <T extends Parcelable> void writeTypedArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull T[] tArr, int i2, boolean z) {
        Parcel parcel2 = parcel;
        int i3 = i;
        T[] tArr2 = tArr;
        int i4 = i2;
        boolean z2 = z;
        if (tArr2 != null) {
            int zzb = zzb(parcel2, i3);
            int length = tArr2.length;
            parcel2.writeInt(length);
            for (int i5 = 0; i5 < length; i5++) {
                T t = tArr2[i5];
                if (t == null) {
                    parcel2.writeInt(0);
                } else {
                    zzd(parcel2, t, i4);
                }
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i3, 0);
        }
    }

    public static <T extends Parcelable> void writeTypedList(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<T> list, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        List<T> list2 = list;
        boolean z2 = z;
        if (list2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = list2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                Parcelable parcelable = (Parcelable) list2.get(i3);
                if (parcelable == null) {
                    parcel2.writeInt(0);
                } else {
                    zzd(parcel2, parcelable, 0);
                }
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    public static <T extends Parcelable> void writeTypedSparseArray(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull SparseArray<T> sparseArray, boolean z) {
        Parcel parcel2 = parcel;
        int i2 = i;
        SparseArray<T> sparseArray2 = sparseArray;
        boolean z2 = z;
        if (sparseArray2 != null) {
            int zzb = zzb(parcel2, i2);
            int size = sparseArray2.size();
            parcel2.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel2.writeInt(sparseArray2.keyAt(i3));
                Parcelable parcelable = (Parcelable) sparseArray2.valueAt(i3);
                if (parcelable == null) {
                    parcel2.writeInt(0);
                } else {
                    zzd(parcel2, parcelable, 0);
                }
            }
            zzc(parcel2, zzb);
        } else if (z2) {
            zza(parcel2, i2, 0);
        }
    }

    private static void zza(Parcel parcel, int i, int i2) {
        parcel.writeInt((i2 << 16) | i);
    }

    private static int zzb(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        parcel2.writeInt(i | -65536);
        parcel2.writeInt(0);
        return parcel2.dataPosition();
    }

    private static void zzc(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int dataPosition = parcel2.dataPosition();
        parcel2.setDataPosition(i2 - 4);
        parcel2.writeInt(dataPosition - i2);
        parcel2.setDataPosition(dataPosition);
    }

    private static <T extends Parcelable> void zzd(Parcel parcel, T t, int i) {
        Parcel parcel2 = parcel;
        int dataPosition = parcel2.dataPosition();
        parcel2.writeInt(1);
        int dataPosition2 = parcel2.dataPosition();
        t.writeToParcel(parcel2, i);
        int dataPosition3 = parcel2.dataPosition();
        parcel2.setDataPosition(dataPosition);
        parcel2.writeInt(dataPosition3 - dataPosition2);
        parcel2.setDataPosition(dataPosition3);
    }
}

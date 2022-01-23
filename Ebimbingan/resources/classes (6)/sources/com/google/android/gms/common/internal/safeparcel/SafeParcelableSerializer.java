package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.common.zzu;
import java.util.ArrayList;

@KeepForSdk
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class SafeParcelableSerializer {
    public SafeParcelableSerializer() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromBytes(@RecentlyNonNull byte[] bArr, @RecentlyNonNull Parcelable.Creator<T> creator) {
        byte[] bArr2 = bArr;
        Parcelable.Creator<T> creator2 = creator;
        T checkNotNull = Preconditions.checkNotNull(creator2);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr2, 0, bArr2.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) creator2.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    @KeepForSdk
    @RecentlyNullable
    public static <T extends SafeParcelable> T deserializeFromIntentExtra(@RecentlyNonNull Intent intent, @RecentlyNonNull String str, @RecentlyNonNull Parcelable.Creator<T> creator) {
        Parcelable.Creator<T> creator2 = creator;
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return deserializeFromBytes(byteArrayExtra, creator2);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromString(@RecentlyNonNull String str, @RecentlyNonNull Parcelable.Creator<T> creator) {
        return deserializeFromBytes(Base64Utils.decodeUrlSafe(str), creator);
    }

    @Deprecated
    @RecentlyNullable
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundle(@RecentlyNonNull Bundle bundle, @RecentlyNonNull String str, @RecentlyNonNull Parcelable.Creator<T> creator) {
        ArrayList arrayList;
        Parcelable.Creator<T> creator2 = creator;
        ArrayList arrayList2 = (ArrayList) bundle.getSerializable(str);
        if (arrayList2 == null) {
            return null;
        }
        new ArrayList<>(arrayList2.size());
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            boolean add = arrayList.add(deserializeFromBytes((byte[]) arrayList2.get(i), creator2));
        }
        return arrayList;
    }

    @RecentlyNullable
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundleSafe(@RecentlyNonNull Bundle bundle, @RecentlyNonNull String str, @RecentlyNonNull Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(bundle.getByteArray(str), creator);
    }

    @RecentlyNullable
    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtra(@RecentlyNonNull Intent intent, @RecentlyNonNull String str, @RecentlyNonNull Parcelable.Creator<T> creator) {
        ArrayList arrayList;
        Parcelable.Creator<T> creator2 = creator;
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList2 == null) {
            return null;
        }
        new ArrayList<>(arrayList2.size());
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            boolean add = arrayList.add(deserializeFromBytes((byte[]) arrayList2.get(i), creator2));
        }
        return arrayList;
    }

    @KeepForSdk
    @RecentlyNullable
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtraSafe(@RecentlyNonNull Intent intent, @RecentlyNonNull String str, @RecentlyNonNull Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToBundle(@RecentlyNonNull Iterable<T> iterable, @RecentlyNonNull Bundle bundle, @RecentlyNonNull String str) {
        ArrayList arrayList;
        Bundle bundle2 = bundle;
        String str2 = str;
        new ArrayList();
        for (T serializeToBytes : iterable) {
            boolean add = arrayList.add(serializeToBytes(serializeToBytes));
        }
        bundle2.putSerializable(str2, arrayList);
    }

    public static <T extends SafeParcelable> void serializeIterableToBundleSafe(@RecentlyNonNull Iterable<T> iterable, @RecentlyNonNull Bundle bundle, @RecentlyNonNull String str) {
        bundle.putByteArray(str, zza(iterable));
    }

    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToIntentExtra(@RecentlyNonNull Iterable<T> iterable, @RecentlyNonNull Intent intent, @RecentlyNonNull String str) {
        ArrayList arrayList;
        Intent intent2 = intent;
        String str2 = str;
        new ArrayList();
        for (T serializeToBytes : iterable) {
            boolean add = arrayList.add(serializeToBytes(serializeToBytes));
        }
        Intent putExtra = intent2.putExtra(str2, arrayList);
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeIterableToIntentExtraSafe(@RecentlyNonNull Iterable<T> iterable, @RecentlyNonNull Intent intent, @RecentlyNonNull String str) {
        Intent putExtra = intent.putExtra(str, zza(iterable));
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <T extends SafeParcelable> byte[] serializeToBytes(@RecentlyNonNull T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeToIntentExtra(@RecentlyNonNull T t, @RecentlyNonNull Intent intent, @RecentlyNonNull String str) {
        Intent putExtra = intent.putExtra(str, serializeToBytes(t));
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <T extends SafeParcelable> String serializeToString(@RecentlyNonNull T t) {
        return Base64Utils.encodeUrlSafe(serializeToBytes(t));
    }

    /* JADX INFO: finally extract failed */
    private static <T extends SafeParcelable> byte[] zza(Iterable<T> iterable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeTypedList(zzu.zzl(iterable));
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            Throwable th2 = th;
            obtain.recycle();
            throw th2;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.ArrayList<T>] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.RecentlyNullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromBytes(@androidx.annotation.Nullable byte[] r8, @androidx.annotation.RecentlyNonNull android.os.Parcelable.Creator<T> r9) {
        /*
            r0 = r8
            r1 = r9
            r4 = r0
            if (r4 != 0) goto L_0x0008
            r4 = 0
            r0 = r4
        L_0x0007:
            return r0
        L_0x0008:
            r4 = r0
            int r4 = r4.length
            r2 = r4
            android.os.Parcel r4 = android.os.Parcel.obtain()
            r3 = r4
            r4 = r3
            r5 = r0
            r6 = 0
            r7 = r2
            r4.unmarshall(r5, r6, r7)
            r4 = r3
            r5 = 0
            r4.setDataPosition(r5)
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0030 }
            r0 = r4
            r4 = r0
            r4.<init>()     // Catch:{ all -> 0x0030 }
            r4 = r3
            r5 = r0
            r6 = r1
            r4.readTypedList(r5, r6)     // Catch:{ all -> 0x0030 }
            r4 = r3
            r4.recycle()
            r4 = r0
            r0 = r4
            goto L_0x0007
        L_0x0030:
            r4 = move-exception
            r0 = r4
            r4 = r3
            r4.recycle()
            r4 = r0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeIterableFromBytes(byte[], android.os.Parcelable$Creator):java.util.ArrayList");
    }
}

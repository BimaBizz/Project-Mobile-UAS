package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.data.DataBufferUtils */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0399DataBufferUtils {
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final String KEY_NEXT_PAGE_TOKEN = "next_page_token";
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    private C0399DataBufferUtils() {
    }

    @RecentlyNonNull
    public static <T, E extends C0402Freezable<T>> ArrayList<T> freezeAndClose(@RecentlyNonNull C0393DataBuffer<E> dataBuffer) {
        ArrayList arrayList;
        C0393DataBuffer<E> dataBuffer2 = dataBuffer;
        new ArrayList<>(dataBuffer2.getCount());
        try {
            for (E freeze : dataBuffer2) {
                boolean add = arrayList.add(freeze.freeze());
            }
            dataBuffer2.close();
            return arrayList;
        } catch (Throwable th) {
            Throwable th2 = th;
            dataBuffer2.close();
            throw th2;
        }
    }

    public static boolean hasData(@RecentlyNonNull C0393DataBuffer<?> dataBuffer) {
        C0393DataBuffer<?> dataBuffer2 = dataBuffer;
        return dataBuffer2 != null && dataBuffer2.getCount() > 0;
    }

    public static boolean hasNextPage(@RecentlyNonNull C0393DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString("next_page_token") == null) ? false : true;
    }

    public static boolean hasPrevPage(@RecentlyNonNull C0393DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString("prev_page_token") == null) ? false : true;
    }
}

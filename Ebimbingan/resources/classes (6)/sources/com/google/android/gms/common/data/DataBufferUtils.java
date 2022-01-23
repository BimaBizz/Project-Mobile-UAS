package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class DataBufferUtils {
    @RecentlyNonNull
    @KeepForSdk
    public static final String KEY_NEXT_PAGE_TOKEN = "next_page_token";
    @RecentlyNonNull
    @KeepForSdk
    public static final String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    private DataBufferUtils() {
    }

    @RecentlyNonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(@RecentlyNonNull DataBuffer<E> dataBuffer) {
        ArrayList arrayList;
        DataBuffer<E> dataBuffer2 = dataBuffer;
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

    public static boolean hasData(@RecentlyNonNull DataBuffer<?> dataBuffer) {
        DataBuffer<?> dataBuffer2 = dataBuffer;
        return dataBuffer2 != null && dataBuffer2.getCount() > 0;
    }

    public static boolean hasNextPage(@RecentlyNonNull DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_NEXT_PAGE_TOKEN) == null) ? false : true;
    }

    public static boolean hasPrevPage(@RecentlyNonNull DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_PREV_PAGE_TOKEN) == null) ? false : true;
    }
}

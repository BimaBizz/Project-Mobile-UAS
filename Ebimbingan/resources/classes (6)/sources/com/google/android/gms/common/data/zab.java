package com.google.android.gms.common.data;

import android.content.ContentValues;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zab extends DataHolder.Builder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zab(String[] strArr, String str) {
        super(strArr, (String) null, (zab) null);
        String str2 = str;
    }

    public final DataHolder.Builder withRow(ContentValues contentValues) {
        Throwable th;
        ContentValues contentValues2 = contentValues;
        new UnsupportedOperationException("Cannot add data to empty builder");
        throw th;
    }

    public final DataHolder.Builder zaa(HashMap<String, Object> hashMap) {
        Throwable th;
        HashMap<String, Object> hashMap2 = hashMap;
        new UnsupportedOperationException("Cannot add data to empty builder");
        throw th;
    }
}

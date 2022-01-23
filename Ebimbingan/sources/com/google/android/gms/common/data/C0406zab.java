package com.google.android.gms.common.data;

import android.content.ContentValues;
import com.google.android.gms.common.data.C0400DataHolder;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.data.zab */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0406zab extends C0400DataHolder.Builder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0406zab(String[] strArr, String str) {
        super(strArr, (String) null, (C0406zab) null);
        String str2 = str;
    }

    public final C0400DataHolder.Builder withRow(ContentValues contentValues) {
        Throwable th;
        ContentValues contentValues2 = contentValues;
        new UnsupportedOperationException("Cannot add data to empty builder");
        throw th;
    }

    public final C0400DataHolder.Builder zaa(HashMap<String, Object> hashMap) {
        Throwable th;
        HashMap<String, Object> hashMap2 = hashMap;
        new UnsupportedOperationException("Cannot add data to empty builder");
        throw th;
    }
}

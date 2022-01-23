package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.collection.LruCache;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zak extends LruCache<Object, Drawable> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zak() {
        super(10);
    }
}

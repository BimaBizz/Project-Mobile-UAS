package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zah extends Drawable.ConstantState {
    int zaa;
    int zab;

    zah(@Nullable zah zah) {
        zah zah2 = zah;
        if (zah2 != null) {
            this.zaa = zah2.zaa;
            this.zab = zah2.zab;
        }
    }

    public final int getChangingConfigurations() {
        return this.zaa;
    }

    public final Drawable newDrawable() {
        Drawable drawable;
        new zai(this);
        return drawable;
    }
}

package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.base.zah */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C1098zah extends Drawable.ConstantState {
    int zaa;
    int zab;

    C1098zah(@Nullable C1098zah zah) {
        C1098zah zah2 = zah;
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
        new C1099zai(this);
        return drawable;
    }
}

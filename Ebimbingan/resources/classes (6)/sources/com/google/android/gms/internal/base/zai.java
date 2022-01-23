package com.google.android.gms.internal.base;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zai extends Drawable implements Drawable.Callback {
    private int zaa;
    private long zab;
    private int zac;
    private int zad;
    private int zae;
    private int zaf;
    private boolean zag;
    private boolean zah;
    private zah zai;
    private Drawable zaj;
    private Drawable zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private int zao;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zai(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this((zah) null);
        zag zag2;
        zag zag3 = drawable;
        Drawable drawable3 = drawable2;
        zag3 = zag3 == null ? zag.zaa : zag3;
        this.zaj = zag3;
        zag3.setCallback(this);
        this.zai.zab |= zag3.getChangingConfigurations();
        if (drawable3 == null) {
            zag2 = zag.zaa;
        } else {
            zag2 = drawable3;
        }
        this.zak = zag2;
        zag2.setCallback(this);
        this.zai.zab |= zag2.getChangingConfigurations();
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zah zah2 = this.zai;
        return changingConfigurations | zah2.zaa | zah2.zab;
    }

    @Nullable
    public final Drawable.ConstantState getConstantState() {
        if (!zaa()) {
            return null;
        }
        this.zai.zaa = getChangingConfigurations();
        return this.zai;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.zaj.getIntrinsicHeight(), this.zak.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.zaj.getIntrinsicWidth(), this.zak.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.zan) {
            this.zao = Drawable.resolveOpacity(this.zaj.getOpacity(), this.zak.getOpacity());
            this.zan = true;
        }
        return this.zao;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = drawable;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final Drawable mutate() {
        Throwable th;
        if (!this.zah && super.mutate() == this) {
            if (!zaa()) {
                new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
                throw th;
            }
            Drawable mutate = this.zaj.mutate();
            Drawable mutate2 = this.zak.mutate();
            this.zah = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Rect rect2 = rect;
        this.zaj.setBounds(rect2);
        this.zak.setBounds(rect2);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable drawable2 = drawable;
        Runnable runnable2 = runnable;
        long j2 = j;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable2, j2);
        }
    }

    public final void setAlpha(int i) {
        int i2 = i;
        if (this.zaf == this.zad) {
            this.zaf = i2;
        }
        this.zad = i2;
        invalidateSelf();
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        ColorFilter colorFilter2 = colorFilter;
        this.zaj.setColorFilter(colorFilter2);
        this.zak.setColorFilter(colorFilter2);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable drawable2 = drawable;
        Runnable runnable2 = runnable;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable2);
        }
    }

    public final boolean zaa() {
        if (!this.zal) {
            this.zam = this.zaj.getConstantState() != null ? this.zak.getConstantState() != null : false;
            this.zal = true;
        }
        return this.zam;
    }

    public final Drawable zab() {
        return this.zak;
    }

    public final void zac(int i) {
        int i2 = i;
        this.zac = this.zad;
        this.zaf = 0;
        this.zae = 250;
        this.zaa = 1;
        invalidateSelf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            r1 = r12
            r2 = r13
            r8 = r1
            int r8 = r8.zaa
            switch(r8) {
                case 1: goto L_0x0078;
                case 2: goto L_0x0086;
                default: goto L_0x0008;
            }
        L_0x0008:
            r8 = 1
            r3 = r8
        L_0x000a:
            r8 = r1
            int r8 = r8.zaf
            r4 = r8
            r8 = r1
            boolean r8 = r8.zag
            r5 = r8
            r8 = r1
            android.graphics.drawable.Drawable r8 = r8.zaj
            r6 = r8
            r8 = r1
            android.graphics.drawable.Drawable r8 = r8.zak
            r7 = r8
            r8 = r3
            if (r8 == 0) goto L_0x0044
            r8 = r5
            if (r8 == 0) goto L_0x0041
            r8 = r4
            if (r8 != 0) goto L_0x003e
            r8 = 0
            r3 = r8
        L_0x0025:
            r8 = r6
            r9 = r2
            r8.draw(r9)
        L_0x002a:
            r8 = r1
            int r8 = r8.zad
            r1 = r8
            r8 = r3
            r9 = r1
            if (r8 != r9) goto L_0x003d
            r8 = r7
            r9 = r1
            r8.setAlpha(r9)
            r8 = r7
            r9 = r2
            r8.draw(r9)
        L_0x003c:
            return
        L_0x003d:
            goto L_0x003c
        L_0x003e:
            r8 = r4
            r3 = r8
            goto L_0x002a
        L_0x0041:
            r8 = r4
            r3 = r8
            goto L_0x0025
        L_0x0044:
            r8 = r5
            if (r8 == 0) goto L_0x0050
            r8 = r6
            r9 = r1
            int r9 = r9.zad
            r10 = r4
            int r9 = r9 - r10
            r8.setAlpha(r9)
        L_0x0050:
            r8 = r6
            r9 = r2
            r8.draw(r9)
            r8 = r5
            if (r8 == 0) goto L_0x005f
            r8 = r6
            r9 = r1
            int r9 = r9.zad
            r8.setAlpha(r9)
        L_0x005f:
            r8 = r4
            if (r8 <= 0) goto L_0x0073
            r8 = r7
            r9 = r4
            r8.setAlpha(r9)
            r8 = r7
            r9 = r2
            r8.draw(r9)
            r8 = r7
            r9 = r1
            int r9 = r9.zad
            r8.setAlpha(r9)
        L_0x0073:
            r8 = r1
            r8.invalidateSelf()
            goto L_0x003c
        L_0x0078:
            r8 = r1
            long r9 = android.os.SystemClock.uptimeMillis()
            r8.zab = r9
            r8 = r1
            r9 = 2
            r8.zaa = r9
            r8 = 0
            r3 = r8
            goto L_0x000a
        L_0x0086:
            r8 = r1
            long r8 = r8.zab
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L_0x00c7
            long r8 = android.os.SystemClock.uptimeMillis()
            r10 = r1
            long r10 = r10.zab
            long r8 = r8 - r10
            float r8 = (float) r8
            r9 = r1
            int r9 = r9.zae
            float r9 = (float) r9
            float r8 = r8 / r9
            r4 = r8
            r8 = r4
            r9 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x00c4
            r8 = 1
            r3 = r8
        L_0x00a7:
            r8 = r3
            if (r8 == 0) goto L_0x00ae
            r8 = r1
            r9 = 0
            r8.zaa = r9
        L_0x00ae:
            r8 = r4
            r9 = 1065353216(0x3f800000, float:1.0)
            float r8 = java.lang.Math.min(r8, r9)
            r4 = r8
            r8 = r1
            r9 = r1
            int r9 = r9.zac
            float r9 = (float) r9
            r10 = r4
            float r9 = r9 * r10
            r10 = 0
            float r9 = r9 + r10
            int r9 = (int) r9
            r8.zaf = r9
            goto L_0x000a
        L_0x00c4:
            r8 = 0
            r3 = r8
            goto L_0x00a7
        L_0x00c7:
            r8 = 1
            r3 = r8
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.zai.draw(android.graphics.Canvas):void");
    }

    zai(@Nullable zah zah2) {
        zah zah3;
        this.zaa = 0;
        this.zad = 255;
        this.zaf = 0;
        this.zag = true;
        new zah(zah2);
        this.zai = zah3;
    }
}

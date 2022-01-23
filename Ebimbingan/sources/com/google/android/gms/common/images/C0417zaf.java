package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.images.C0409ImageManager;
import com.google.android.gms.common.internal.C0444Objects;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.zaf */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0417zaf extends C0418zag {
    private final WeakReference<C0409ImageManager.OnImageLoadedListener> zac;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0417zaf(com.google.android.gms.common.images.C0409ImageManager.OnImageLoadedListener r7, android.net.Uri r8) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r0
            r4 = r2
            r5 = 0
            r3.<init>(r4, r5)
            r3 = r1
            com.google.android.gms.common.internal.C0423Asserts.checkNotNull(r3)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r2 = r3
            r3 = r2
            r4 = r1
            r3.<init>(r4)
            r3 = r0
            r4 = r2
            r3.zac = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.C0417zaf.<init>(com.google.android.gms.common.images.ImageManager$OnImageLoadedListener, android.net.Uri):void");
    }

    public final int hashCode() {
        return C0444Objects.hashCode(this.zaa);
    }

    /* access modifiers changed from: protected */
    public final void zaa(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3) {
        C0409ImageManager.OnImageLoadedListener onImageLoadedListener;
        Drawable drawable2 = drawable;
        boolean z4 = z;
        boolean z5 = z3;
        if (!z2 && (onImageLoadedListener = (C0409ImageManager.OnImageLoadedListener) this.zac.get()) != null) {
            onImageLoadedListener.onImageLoaded(this.zaa.zaa, drawable2, z5);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r4 = r0
            r5 = r1
            if (r4 != r5) goto L_0x0009
            r4 = 1
            r0 = r4
        L_0x0008:
            return r0
        L_0x0009:
            r4 = r1
            boolean r4 = r4 instanceof com.google.android.gms.common.images.C0417zaf
            if (r4 != 0) goto L_0x0011
            r4 = 0
            r0 = r4
            goto L_0x0008
        L_0x0011:
            r4 = r1
            com.google.android.gms.common.images.zaf r4 = (com.google.android.gms.common.images.C0417zaf) r4
            r1 = r4
            r4 = r0
            java.lang.ref.WeakReference<com.google.android.gms.common.images.ImageManager$OnImageLoadedListener> r4 = r4.zac
            java.lang.Object r4 = r4.get()
            com.google.android.gms.common.images.ImageManager$OnImageLoadedListener r4 = (com.google.android.gms.common.images.C0409ImageManager.OnImageLoadedListener) r4
            r2 = r4
            r4 = r1
            java.lang.ref.WeakReference<com.google.android.gms.common.images.ImageManager$OnImageLoadedListener> r4 = r4.zac
            java.lang.Object r4 = r4.get()
            com.google.android.gms.common.images.ImageManager$OnImageLoadedListener r4 = (com.google.android.gms.common.images.C0409ImageManager.OnImageLoadedListener) r4
            r3 = r4
            r4 = r3
            if (r4 == 0) goto L_0x0046
            r4 = r2
            if (r4 == 0) goto L_0x0046
            r4 = r3
            r5 = r2
            boolean r4 = com.google.android.gms.common.internal.C0444Objects.equal(r4, r5)
            if (r4 == 0) goto L_0x0046
            r4 = r1
            com.google.android.gms.common.images.zad r4 = r4.zaa
            r5 = r0
            com.google.android.gms.common.images.zad r5 = r5.zaa
            boolean r4 = com.google.android.gms.common.internal.C0444Objects.equal(r4, r5)
            if (r4 == 0) goto L_0x0046
            r4 = 1
            r0 = r4
            goto L_0x0008
        L_0x0046:
            r4 = 0
            r0 = r4
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.C0417zaf.equals(java.lang.Object):boolean");
    }
}

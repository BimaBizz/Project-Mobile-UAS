package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.base.zai;
import com.google.android.gms.internal.base.zaj;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zae extends zag {
    private final WeakReference<ImageView> zac;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zae(android.widget.ImageView r7, int r8) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r0
            android.net.Uri r4 = android.net.Uri.EMPTY
            r5 = r2
            r3.<init>(r4, r5)
            r3 = r1
            com.google.android.gms.common.internal.Asserts.checkNotNull(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.zae.<init>(android.widget.ImageView, int):void");
    }

    public final int hashCode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void zaa(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3) {
        boolean z4;
        Drawable drawable2;
        Drawable drawable3 = drawable;
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        ImageView imageView = (ImageView) this.zac.get();
        if (imageView == null) {
            return;
        }
        if (z6 || z7 || !(imageView instanceof zaj)) {
            if (!z6) {
                z4 = !z5;
            } else {
                z4 = false;
            }
            if (z4) {
                Drawable drawable4 = imageView.getDrawable();
                if (drawable4 == null) {
                    drawable4 = null;
                } else if (drawable4 instanceof zai) {
                    drawable4 = ((zai) drawable4).zab();
                }
                new zai(drawable4, drawable3);
                drawable3 = drawable2;
            }
            imageView.setImageDrawable(drawable3);
            if (imageView instanceof zaj) {
                zaj zaj = (zaj) imageView;
                throw null;
            } else if (drawable3 != null && z4) {
                ((zai) drawable3).zac(250);
            }
        } else {
            zaj zaj2 = (zaj) imageView;
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zae(android.widget.ImageView r7, android.net.Uri r8) {
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
            com.google.android.gms.common.internal.Asserts.checkNotNull(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.zae.<init>(android.widget.ImageView, android.net.Uri):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r0
            r3 = r1
            if (r2 != r3) goto L_0x0009
            r2 = 1
            r0 = r2
        L_0x0008:
            return r0
        L_0x0009:
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.common.images.zae
            if (r2 != 0) goto L_0x0011
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x0011:
            r2 = r1
            com.google.android.gms.common.images.zae r2 = (com.google.android.gms.common.images.zae) r2
            r1 = r2
            r2 = r0
            java.lang.ref.WeakReference<android.widget.ImageView> r2 = r2.zac
            java.lang.Object r2 = r2.get()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = r2
            r2 = r1
            java.lang.ref.WeakReference<android.widget.ImageView> r2 = r2.zac
            java.lang.Object r2 = r2.get()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1 = r2
            r2 = r1
            if (r2 == 0) goto L_0x003a
            r2 = r0
            if (r2 == 0) goto L_0x003a
            r2 = r1
            r3 = r0
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x003a
            r2 = 1
            r0 = r2
            goto L_0x0008
        L_0x003a:
            r2 = 0
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.zae.equals(java.lang.Object):boolean");
    }
}

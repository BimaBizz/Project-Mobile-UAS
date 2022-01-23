package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0423Asserts;
import com.google.android.gms.internal.base.C1101zak;

/* renamed from: com.google.android.gms.common.images.zag */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0418zag {
    final C0415zad zaa;
    protected int zab = 0;

    public C0418zag(Uri uri, int i) {
        C0415zad zad;
        new C0415zad(uri);
        this.zaa = zad;
        this.zab = i;
    }

    /* access modifiers changed from: protected */
    public abstract void zaa(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: package-private */
    public final void zab(Context context, Bitmap bitmap, boolean z) {
        Drawable drawable;
        Bitmap bitmap2 = bitmap;
        boolean z2 = z;
        C0423Asserts.checkNotNull(bitmap2);
        new BitmapDrawable(context.getResources(), bitmap2);
        zaa(drawable, false, false, true);
    }

    /* access modifiers changed from: package-private */
    public final void zac(Context context, C1101zak zak, boolean z) {
        Drawable drawable;
        Context context2 = context;
        C1101zak zak2 = zak;
        boolean z2 = z;
        int i = this.zab;
        if (i != 0) {
            drawable = context2.getResources().getDrawable(i);
        } else {
            drawable = null;
        }
        zaa(drawable, z2, false, false);
    }
}

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class ImageManager {
    /* access modifiers changed from: private */
    public static final Object zaa;
    /* access modifiers changed from: private */
    public static HashSet<Uri> zab;
    private static ImageManager zac;
    /* access modifiers changed from: private */
    public final Context zad;
    /* access modifiers changed from: private */
    public final Handler zae;
    /* access modifiers changed from: private */
    public final ExecutorService zaf = zao.zaa().zaa(4, 2);
    /* access modifiers changed from: private */
    public final zak zag;
    /* access modifiers changed from: private */
    public final Map<zag, ImageReceiver> zah;
    /* access modifiers changed from: private */
    public final Map<Uri, ImageReceiver> zai;
    /* access modifiers changed from: private */
    public final Map<Uri, Long> zaj;

    @KeepName
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    private final class ImageReceiver extends ResultReceiver {
        final /* synthetic */ ImageManager zaa;
        private final Uri zab;
        /* access modifiers changed from: private */
        public final ArrayList<zag> zac;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        ImageReceiver(com.google.android.gms.common.images.ImageManager r6, android.net.Uri r7) {
            /*
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r0
                r4 = r1
                r3.zaa = r4
                com.google.android.gms.internal.base.zap r3 = new com.google.android.gms.internal.base.zap
                r1 = r3
                r3 = r1
                android.os.Looper r4 = android.os.Looper.getMainLooper()
                r3.<init>(r4)
                r3 = r0
                r4 = r1
                r3.<init>(r4)
                r3 = r0
                r4 = r2
                r3.zab = r4
                java.util.ArrayList r3 = new java.util.ArrayList
                r1 = r3
                r3 = r1
                r3.<init>()
                r3 = r0
                r4 = r1
                r3.zac = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.ImageManager.ImageReceiver.<init>(com.google.android.gms.common.images.ImageManager, android.net.Uri):void");
        }

        public final void onReceiveResult(int i, Bundle bundle) {
            Runnable runnable;
            int i2 = i;
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ExecutorService zai = this.zaa.zaf;
            new zaa(this.zaa, this.zab, parcelFileDescriptor);
            zai.execute(runnable);
        }

        public final void zaa(zag zag) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            boolean add = this.zac.add(zag);
        }

        public final void zab(zag zag) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            boolean remove = this.zac.remove(zag);
        }

        public final void zac() {
            Intent intent;
            new Intent(Constants.ACTION_LOAD_IMAGE);
            Intent intent2 = intent.setPackage("com.google.android.gms");
            Intent putExtra = intent.putExtra(Constants.EXTRA_URI, this.zab);
            Intent putExtra2 = intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            Intent putExtra3 = intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            this.zaa.zad.sendBroadcast(intent);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface OnImageLoadedListener {
        void onImageLoaded(@RecentlyNonNull Uri uri, @Nullable Drawable drawable, boolean z);
    }

    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Object r1 = new java.lang.Object
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            zaa = r1
            java.util.HashSet r1 = new java.util.HashSet
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            zab = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.ImageManager.<clinit>():void");
    }

    private ImageManager(Context context, boolean z) {
        Handler handler;
        zak zak;
        Map<zag, ImageReceiver> map;
        Map<Uri, ImageReceiver> map2;
        Map<Uri, Long> map3;
        boolean z2 = z;
        this.zad = context.getApplicationContext();
        new zap(Looper.getMainLooper());
        this.zae = handler;
        new zak();
        this.zag = zak;
        new HashMap();
        this.zah = map;
        new HashMap();
        this.zai = map2;
        new HashMap();
        this.zaj = map3;
    }

    @RecentlyNonNull
    public static ImageManager create(@RecentlyNonNull Context context) {
        ImageManager imageManager;
        Context context2 = context;
        if (zac == null) {
            new ImageManager(context2, false);
            zac = imageManager;
        }
        return zac;
    }

    public void loadImage(@RecentlyNonNull ImageView imageView, int i) {
        zag zag2;
        new zae(imageView, i);
        zaa(zag2);
    }

    public final void zaa(zag zag2) {
        Runnable runnable;
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zab(this, zag2);
        runnable.run();
    }

    public void loadImage(@RecentlyNonNull ImageView imageView, @RecentlyNonNull Uri uri) {
        zag zag2;
        new zae(imageView, uri);
        zaa(zag2);
    }

    public void loadImage(@RecentlyNonNull ImageView imageView, @RecentlyNonNull Uri uri, int i) {
        zag zag2;
        new zae(imageView, uri);
        zag2.zab = i;
        zaa(zag2);
    }

    public void loadImage(@RecentlyNonNull OnImageLoadedListener onImageLoadedListener, @RecentlyNonNull Uri uri) {
        zag zag2;
        new zaf(onImageLoadedListener, uri);
        zaa(zag2);
    }

    public void loadImage(@RecentlyNonNull OnImageLoadedListener onImageLoadedListener, @RecentlyNonNull Uri uri, int i) {
        zag zag2;
        new zaf(onImageLoadedListener, uri);
        zag2.zab = i;
        zaa(zag2);
    }
}

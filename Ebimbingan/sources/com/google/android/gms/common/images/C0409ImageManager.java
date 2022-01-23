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
import com.google.android.gms.common.annotation.C0209KeepName;
import com.google.android.gms.common.internal.C0423Asserts;
import com.google.android.gms.internal.base.C1101zak;
import com.google.android.gms.internal.base.C1105zao;
import com.google.android.gms.internal.base.C1106zap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.common.images.ImageManager */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0409ImageManager {
    /* access modifiers changed from: private */
    public static final Object zaa;
    /* access modifiers changed from: private */
    public static HashSet<Uri> zab;
    private static C0409ImageManager zac;
    /* access modifiers changed from: private */
    public final Context zad;
    /* access modifiers changed from: private */
    public final Handler zae;
    /* access modifiers changed from: private */
    public final ExecutorService zaf = C1105zao.zaa().zaa(4, 2);
    /* access modifiers changed from: private */
    public final C1101zak zag;
    /* access modifiers changed from: private */
    public final Map<C0418zag, ImageReceiver> zah;
    /* access modifiers changed from: private */
    public final Map<Uri, ImageReceiver> zai;
    /* access modifiers changed from: private */
    public final Map<Uri, Long> zaj;

    @C0209KeepName
    /* renamed from: com.google.android.gms.common.images.ImageManager$ImageReceiver */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    private final class ImageReceiver extends ResultReceiver {
        final /* synthetic */ C0409ImageManager zaa;
        private final Uri zab;
        /* access modifiers changed from: private */
        public final ArrayList<C0418zag> zac;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        ImageReceiver(com.google.android.gms.common.images.C0409ImageManager r6, android.net.Uri r7) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.C0409ImageManager.ImageReceiver.<init>(com.google.android.gms.common.images.ImageManager, android.net.Uri):void");
        }

        public final void onReceiveResult(int i, Bundle bundle) {
            Runnable runnable;
            int i2 = i;
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ExecutorService zai = this.zaa.zaf;
            new C0412zaa(this.zaa, this.zab, parcelFileDescriptor);
            zai.execute(runnable);
        }

        public final void zaa(C0418zag zag) {
            C0423Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            boolean add = this.zac.add(zag);
        }

        public final void zab(C0418zag zag) {
            C0423Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            boolean remove = this.zac.remove(zag);
        }

        public final void zac() {
            Intent intent;
            new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            Intent intent2 = intent.setPackage("com.google.android.gms");
            Intent putExtra = intent.putExtra("com.google.android.gms.extras.uri", this.zab);
            Intent putExtra2 = intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            Intent putExtra3 = intent.putExtra("com.google.android.gms.extras.priority", 3);
            this.zaa.zad.sendBroadcast(intent);
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$OnImageLoadedListener */
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.C0409ImageManager.<clinit>():void");
    }

    private C0409ImageManager(Context context, boolean z) {
        Handler handler;
        C1101zak zak;
        Map<C0418zag, ImageReceiver> map;
        Map<Uri, ImageReceiver> map2;
        Map<Uri, Long> map3;
        boolean z2 = z;
        this.zad = context.getApplicationContext();
        new C1106zap(Looper.getMainLooper());
        this.zae = handler;
        new C1101zak();
        this.zag = zak;
        new HashMap();
        this.zah = map;
        new HashMap();
        this.zai = map2;
        new HashMap();
        this.zaj = map3;
    }

    @RecentlyNonNull
    public static C0409ImageManager create(@RecentlyNonNull Context context) {
        C0409ImageManager imageManager;
        Context context2 = context;
        if (zac == null) {
            new C0409ImageManager(context2, false);
            zac = imageManager;
        }
        return zac;
    }

    public void loadImage(@RecentlyNonNull ImageView imageView, int i) {
        C0418zag zag2;
        new C0416zae(imageView, i);
        zaa(zag2);
    }

    public final void zaa(C0418zag zag2) {
        Runnable runnable;
        C0423Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new C0413zab(this, zag2);
        runnable.run();
    }

    public void loadImage(@RecentlyNonNull ImageView imageView, @RecentlyNonNull Uri uri) {
        C0418zag zag2;
        new C0416zae(imageView, uri);
        zaa(zag2);
    }

    public void loadImage(@RecentlyNonNull ImageView imageView, @RecentlyNonNull Uri uri, int i) {
        C0418zag zag2;
        new C0416zae(imageView, uri);
        zag2.zab = i;
        zaa(zag2);
    }

    public void loadImage(@RecentlyNonNull OnImageLoadedListener onImageLoadedListener, @RecentlyNonNull Uri uri) {
        C0418zag zag2;
        new C0417zaf(onImageLoadedListener, uri);
        zaa(zag2);
    }

    public void loadImage(@RecentlyNonNull OnImageLoadedListener onImageLoadedListener, @RecentlyNonNull Uri uri, int i) {
        C0418zag zag2;
        new C0417zaf(onImageLoadedListener, uri);
        zag2.zab = i;
        zaa(zag2);
    }
}

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.common.images.C0409ImageManager;
import com.google.android.gms.common.internal.C0423Asserts;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.zac */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0414zac implements Runnable {
    final /* synthetic */ C0409ImageManager zaa;
    private final Uri zab;
    @Nullable
    private final Bitmap zac;
    private final CountDownLatch zad;

    public C0414zac(C0409ImageManager imageManager, @Nullable Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        boolean z2 = z;
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = bitmap;
        this.zad = countDownLatch;
    }

    public final void run() {
        C0423Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.zac;
        C0409ImageManager.ImageReceiver imageReceiver = (C0409ImageManager.ImageReceiver) this.zaa.zai.remove(this.zab);
        if (imageReceiver != null) {
            ArrayList zad2 = imageReceiver.zac;
            int size = zad2.size();
            for (int i = 0; i < size; i++) {
                C0418zag zag = (C0418zag) zad2.get(i);
                if (this.zac == null || bitmap == null) {
                    Object put = this.zaa.zaj.put(this.zab, Long.valueOf(SystemClock.elapsedRealtime()));
                    zag.zac(this.zaa.zad, this.zaa.zag, false);
                } else {
                    zag.zab(this.zaa.zad, this.zac, false);
                }
                if (!(zag instanceof C0417zaf)) {
                    Object remove = this.zaa.zah.remove(zag);
                }
            }
        }
        this.zad.countDown();
        Object zag2 = C0409ImageManager.zaa;
        synchronized (zag2) {
            try {
                boolean remove2 = C0409ImageManager.zab.remove(this.zab);
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj = zag2;
                throw th2;
            }
        }
    }
}

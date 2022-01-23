package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zab implements Runnable {
    final /* synthetic */ ImageManager zaa;
    private final zag zab;

    public zab(ImageManager imageManager, zag zag) {
        this.zaa = imageManager;
        this.zab = zag;
    }

    public final void run() {
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.zaa.zah.get(this.zab);
        if (imageReceiver != null) {
            Object remove = this.zaa.zah.remove(this.zab);
            imageReceiver.zab(this.zab);
        }
        zag zag = this.zab;
        zad zad = zag.zaa;
        if (zad.zaa != null) {
            Long l = (Long) this.zaa.zaj.get(zad.zaa);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                    this.zab.zac(this.zaa.zad, this.zaa.zag, true);
                    return;
                }
                Object remove2 = this.zaa.zaj.remove(zad.zaa);
            }
            this.zab.zaa((Drawable) null, false, true, false);
            ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) this.zaa.zai.get(zad.zaa);
            if (imageReceiver2 == null) {
                new ImageManager.ImageReceiver(this.zaa, zad.zaa);
                Object put = this.zaa.zai.put(zad.zaa, imageReceiver2);
            }
            imageReceiver2.zaa(this.zab);
            if (!(this.zab instanceof zaf)) {
                Object put2 = this.zaa.zah.put(this.zab, imageReceiver2);
            }
            Object zag2 = ImageManager.zaa;
            synchronized (zag2) {
                try {
                    if (!ImageManager.zab.contains(zad.zaa)) {
                        boolean add = ImageManager.zab.add(zad.zaa);
                        imageReceiver2.zac();
                    }
                } catch (Throwable th) {
                    while (true) {
                        Throwable th2 = th;
                        Object obj = zag2;
                        throw th2;
                    }
                }
            }
            return;
        }
        zag.zac(this.zaa.zad, this.zaa.zag, true);
    }
}

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.common.images.C0409ImageManager;
import com.google.android.gms.common.internal.C0423Asserts;

/* renamed from: com.google.android.gms.common.images.zab */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0413zab implements Runnable {
    final /* synthetic */ C0409ImageManager zaa;
    private final C0418zag zab;

    public C0413zab(C0409ImageManager imageManager, C0418zag zag) {
        this.zaa = imageManager;
        this.zab = zag;
    }

    public final void run() {
        C0423Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        C0409ImageManager.ImageReceiver imageReceiver = (C0409ImageManager.ImageReceiver) this.zaa.zah.get(this.zab);
        if (imageReceiver != null) {
            Object remove = this.zaa.zah.remove(this.zab);
            imageReceiver.zab(this.zab);
        }
        C0418zag zag = this.zab;
        C0415zad zad = zag.zaa;
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
            C0409ImageManager.ImageReceiver imageReceiver2 = (C0409ImageManager.ImageReceiver) this.zaa.zai.get(zad.zaa);
            if (imageReceiver2 == null) {
                new C0409ImageManager.ImageReceiver(this.zaa, zad.zaa);
                Object put = this.zaa.zai.put(zad.zaa, imageReceiver2);
            }
            imageReceiver2.zaa(this.zab);
            if (!(this.zab instanceof C0417zaf)) {
                Object put2 = this.zaa.zah.put(this.zab, imageReceiver2);
            }
            Object zag2 = C0409ImageManager.zaa;
            synchronized (zag2) {
                try {
                    if (!C0409ImageManager.zab.contains(zad.zaa)) {
                        boolean add = C0409ImageManager.zab.add(zad.zaa);
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

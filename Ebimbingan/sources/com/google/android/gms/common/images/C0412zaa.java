package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0423Asserts;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.zaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0412zaa implements Runnable {
    final /* synthetic */ C0409ImageManager zaa;
    private final Uri zab;
    @Nullable
    private final ParcelFileDescriptor zac;

    public C0412zaa(C0409ImageManager imageManager, @Nullable Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = parcelFileDescriptor;
    }

    public final void run() {
        boolean z;
        Bitmap bitmap;
        CountDownLatch countDownLatch;
        Runnable runnable;
        StringBuilder sb;
        StringBuilder sb2;
        Bitmap bitmap2;
        C0423Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.zac;
        if (parcelFileDescriptor != null) {
            try {
                bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                z = false;
            } catch (OutOfMemoryError e) {
                OutOfMemoryError outOfMemoryError = e;
                String valueOf = String.valueOf(this.zab);
                new StringBuilder(String.valueOf(valueOf).length() + 34);
                StringBuilder append = sb2.append("OOM while loading bitmap for uri: ");
                StringBuilder append2 = sb2.append(valueOf);
                int e2 = Log.e("ImageManager", sb2.toString(), outOfMemoryError);
                z = true;
                bitmap2 = null;
            }
            try {
                this.zac.close();
                bitmap = bitmap2;
            } catch (IOException e3) {
                int e4 = Log.e("ImageManager", "closed failed", e3);
                bitmap = bitmap2;
            }
        } else {
            z = false;
            bitmap = null;
        }
        new CountDownLatch(1);
        Handler zaj = this.zaa.zae;
        new C0414zac(this.zaa, this.zab, bitmap, z, countDownLatch);
        boolean post = zaj.post(runnable);
        try {
            countDownLatch.await();
        } catch (InterruptedException e5) {
            String valueOf2 = String.valueOf(this.zab);
            new StringBuilder(String.valueOf(valueOf2).length() + 32);
            StringBuilder append3 = sb.append("Latch interrupted while posting ");
            StringBuilder append4 = sb.append(valueOf2);
            int w = Log.w("ImageManager", sb.toString());
        }
    }
}

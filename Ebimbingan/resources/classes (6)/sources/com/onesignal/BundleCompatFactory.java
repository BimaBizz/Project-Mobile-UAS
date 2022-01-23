package com.onesignal;

import android.os.Build;

/* compiled from: BundleCompat */
class BundleCompatFactory {
    BundleCompatFactory() {
    }

    static BundleCompat getInstance() {
        BundleCompat bundleCompat;
        BundleCompat bundleCompat2;
        if (Build.VERSION.SDK_INT >= 22) {
            BundleCompat bundleCompat3 = bundleCompat2;
            new BundleCompatPersistableBundle();
            return bundleCompat3;
        }
        BundleCompat bundleCompat4 = bundleCompat;
        new BundleCompatBundle();
        return bundleCompat4;
    }
}

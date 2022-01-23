package com.onesignal;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;

class OneSignalChromeTab {
    OneSignalChromeTab() {
    }

    private static boolean hasChromeTabLibrary() {
        return CustomTabsServiceConnection.class != null;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static boolean open(java.lang.String r8, boolean r9) {
        /*
            r0 = r8
            r1 = r9
            boolean r3 = hasChromeTabLibrary()
            if (r3 != 0) goto L_0x000b
            r3 = 0
            r0 = r3
        L_0x000a:
            return r0
        L_0x000b:
            com.onesignal.OneSignalChromeTab$OneSignalCustomTabsServiceConnection r3 = new com.onesignal.OneSignalChromeTab$OneSignalCustomTabsServiceConnection
            r7 = r3
            r3 = r7
            r4 = r7
            r5 = r0
            r6 = r1
            r4.<init>(r5, r6)
            r2 = r3
            android.content.Context r3 = com.onesignal.OneSignal.appContext
            java.lang.String r4 = "com.android.chrome"
            r5 = r2
            boolean r3 = androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(r3, r4, r5)
            r0 = r3
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OneSignalChromeTab.open(java.lang.String, boolean):boolean");
    }

    private static class OneSignalCustomTabsServiceConnection extends CustomTabsServiceConnection {
        private boolean openActivity;
        private String url;

        OneSignalCustomTabsServiceConnection(@NonNull String url2, boolean openActivity2) {
            this.url = url2;
            this.openActivity = openActivity2;
        }

        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            CustomTabsIntent.Builder mBuilder;
            ComponentName componentName2 = componentName;
            CustomTabsClient customTabsClient2 = customTabsClient;
            if (customTabsClient2 != null) {
                boolean warmup = customTabsClient2.warmup(0);
                CustomTabsSession session = customTabsClient2.newSession((CustomTabsCallback) null);
                if (session != null) {
                    Uri uri = Uri.parse(this.url);
                    boolean mayLaunchUrl = session.mayLaunchUrl(uri, (Bundle) null, (List) null);
                    if (this.openActivity) {
                        new CustomTabsIntent.Builder(session);
                        CustomTabsIntent customTabsIntent = mBuilder.build();
                        Intent data = customTabsIntent.intent.setData(uri);
                        Intent addFlags = customTabsIntent.intent.addFlags(268435456);
                        if (Build.VERSION.SDK_INT >= 16) {
                            OneSignal.appContext.startActivity(customTabsIntent.intent, customTabsIntent.startAnimationBundle);
                        } else {
                            OneSignal.appContext.startActivity(customTabsIntent.intent);
                        }
                    }
                }
            }
        }

        public void onServiceDisconnected(ComponentName name) {
        }
    }
}

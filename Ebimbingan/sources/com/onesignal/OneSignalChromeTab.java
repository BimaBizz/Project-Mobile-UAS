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
import gnu.expr.Declaration;
import java.util.List;

class OneSignalChromeTab {
    OneSignalChromeTab() {
    }

    private static boolean hasChromeTabLibrary() {
        return CustomTabsServiceConnection.class != null;
    }

    protected static boolean open(String str, boolean z) {
        CustomTabsServiceConnection connection;
        String url = str;
        boolean openActivity = z;
        if (!hasChromeTabLibrary()) {
            return false;
        }
        new OneSignalCustomTabsServiceConnection(url, openActivity);
        return CustomTabsClient.bindCustomTabsService(OneSignal.appContext, "com.android.chrome", connection);
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
                    boolean mayLaunchUrl = session.mayLaunchUrl(uri, (Bundle) null, (List<Bundle>) null);
                    if (this.openActivity) {
                        new CustomTabsIntent.Builder(session);
                        CustomTabsIntent customTabsIntent = mBuilder.build();
                        Intent data = customTabsIntent.intent.setData(uri);
                        Intent addFlags = customTabsIntent.intent.addFlags(Declaration.IS_DYNAMIC);
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

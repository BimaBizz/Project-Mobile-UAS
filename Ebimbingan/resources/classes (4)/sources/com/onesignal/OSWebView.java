package com.onesignal;

import android.content.Context;
import android.webkit.WebView;

public class OSWebView extends WebView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OSWebView(Context context) {
        super(context);
    }

    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9 = i;
        int i10 = i2;
        int i11 = i3;
        int i12 = i4;
        int i13 = i5;
        int i14 = i6;
        int i15 = i7;
        int i16 = i8;
        boolean z2 = z;
        return false;
    }

    public void scrollTo(int x, int y) {
    }

    public void computeScroll() {
    }
}

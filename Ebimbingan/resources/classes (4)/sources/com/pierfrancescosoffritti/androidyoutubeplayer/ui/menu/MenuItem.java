package com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu;

import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MenuItem {
    private final String a;
    @DrawableRes
    private final int b;
    private final View.OnClickListener c;

    public MenuItem(@NonNull String str, @DrawableRes int i, @Nullable View.OnClickListener onClickListener) {
        this.a = str;
        this.b = i;
        this.c = onClickListener;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r3 = r0
            r4 = r1
            if (r3 != r4) goto L_0x0009
            r3 = 1
            r0 = r3
        L_0x0008:
            return r0
        L_0x0009:
            r3 = r1
            if (r3 == 0) goto L_0x0018
            r3 = r0
            java.lang.Class r3 = r3.getClass()
            r4 = r1
            java.lang.Class r4 = r4.getClass()
            if (r3 == r4) goto L_0x001b
        L_0x0018:
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x001b:
            r3 = r1
            com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.MenuItem r3 = (com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.MenuItem) r3
            r2 = r3
            r3 = r0
            int r3 = r3.b
            r4 = r2
            int r4 = r4.b
            if (r3 != r4) goto L_0x0036
            r3 = r0
            java.lang.String r3 = r3.a
            r4 = r2
            java.lang.String r4 = r4.a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0036
            r3 = 1
        L_0x0034:
            r0 = r3
            goto L_0x0008
        L_0x0036:
            r3 = 0
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.MenuItem.equals(java.lang.Object):boolean");
    }

    @DrawableRes
    public int getIcon() {
        return this.b;
    }

    @Nullable
    public View.OnClickListener getOnClickListener() {
        return this.c;
    }

    @NonNull
    public String getText() {
        return this.a;
    }

    public int hashCode() {
        return (31 * this.a.hashCode()) + this.b;
    }
}

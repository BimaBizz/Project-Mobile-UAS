package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.internal.C0483zaaa;
import com.google.android.gms.common.internal.C0510zaz;
import com.google.android.gms.dynamic.C0665RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.gms.common.SignInButton */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0203SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int zaa;
    private int zab;
    private View zac;
    @Nullable
    private View.OnClickListener zad;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.common.SignInButton$ButtonSize */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.common.SignInButton$ColorScheme */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public @interface ColorScheme {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0203SignInButton(@RecentlyNonNull Context context) {
        this(context, (AttributeSet) null);
    }

    private final void zaa(Context context) {
        C0483zaaa zaaa;
        Context context2 = context;
        View view = this.zac;
        if (view != null) {
            removeView(view);
        }
        try {
            this.zac = C0510zaz.zaa(context2, this.zaa, this.zab);
        } catch (C0665RemoteCreator.RemoteCreatorException e) {
            int w = Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i = this.zaa;
            int i2 = this.zab;
            new C0483zaaa(context2, (AttributeSet) null);
            zaaa.zaa(context2.getResources(), i, i2);
            this.zac = zaaa;
        }
        addView(this.zac);
        this.zac.setEnabled(isEnabled());
        this.zac.setOnClickListener(this);
    }

    public void onClick(@RecentlyNonNull View view) {
        View view2 = view;
        View.OnClickListener onClickListener = this.zad;
        if (onClickListener != null && view2 == this.zac) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        setStyle(this.zaa, i);
    }

    public void setEnabled(boolean z) {
        boolean z2 = z;
        super.setEnabled(z2);
        this.zac.setEnabled(z2);
    }

    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.zad = onClickListener;
        View view = this.zac;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@RecentlyNonNull C0235Scope[] scopeArr) {
        C0235Scope[] scopeArr2 = scopeArr;
        setStyle(this.zaa, this.zab);
    }

    public void setSize(int i) {
        setStyle(i, this.zab);
    }

    public void setStyle(int i, int i2) {
        this.zaa = i;
        this.zab = i2;
        zaa(getContext());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0203SignInButton(@RecentlyNonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setStyle(int i, int i2, @RecentlyNonNull C0235Scope[] scopeArr) {
        C0235Scope[] scopeArr2 = scopeArr;
        setStyle(i, i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0203SignInButton(@androidx.annotation.RecentlyNonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r0
            r5 = r1
            r6 = r2
            r7 = r3
            r4.<init>(r5, r6, r7)
            r4 = r0
            r5 = 0
            r4.zad = r5
            r4 = r1
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = r2
            int[] r6 = com.google.android.gms.base.R.styleable.SignInButton
            r7 = 0
            r8 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            r1 = r4
            r4 = r0
            r5 = r1
            int r6 = com.google.android.gms.base.R.styleable.SignInButton_buttonSize     // Catch:{ all -> 0x0043 }
            r7 = 0
            int r5 = r5.getInt(r6, r7)     // Catch:{ all -> 0x0043 }
            r4.zaa = r5     // Catch:{ all -> 0x0043 }
            r4 = r0
            r5 = r1
            int r6 = com.google.android.gms.base.R.styleable.SignInButton_colorScheme     // Catch:{ all -> 0x0043 }
            r7 = 2
            int r5 = r5.getInt(r6, r7)     // Catch:{ all -> 0x0043 }
            r4.zab = r5     // Catch:{ all -> 0x0043 }
            r4 = r1
            r4.recycle()
            r4 = r0
            r5 = r0
            int r5 = r5.zaa
            r6 = r0
            int r6 = r6.zab
            r4.setStyle(r5, r6)
            return
        L_0x0043:
            r4 = move-exception
            r0 = r4
            r4 = r1
            r4.recycle()
            r4 = r0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C0203SignInButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.base.R;
import com.google.android.gms.common.util.C0598DeviceProperties;

/* renamed from: com.google.android.gms.common.internal.zaaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0483zaaa extends Button {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0483zaaa(Context context, @Nullable AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
        AttributeSet attributeSet2 = attributeSet;
    }

    private static final int zab(int i, int i2, int i3, int i4) {
        Throwable th;
        StringBuilder sb;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        switch (i5) {
            case 0:
                return i6;
            case 1:
                return i7;
            case 2:
                return i8;
            default:
                new StringBuilder(33);
                StringBuilder append = sb.append("Unknown color scheme: ");
                StringBuilder append2 = sb.append(i5);
                new IllegalStateException(sb.toString());
                throw th;
        }
    }

    public final void zaa(Resources resources, int i, int i2) {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        StringBuilder sb2;
        Resources resources2 = resources;
        int i3 = i;
        int i4 = i2;
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i5 = (int) ((resources2.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i5);
        setMinWidth(i5);
        int zab = zab(i4, R.drawable.common_google_signin_btn_icon_dark, R.drawable.common_google_signin_btn_icon_light, R.drawable.common_google_signin_btn_icon_light);
        int zab2 = zab(i4, R.drawable.common_google_signin_btn_text_dark, R.drawable.common_google_signin_btn_text_light, R.drawable.common_google_signin_btn_text_light);
        switch (i3) {
            case 0:
            case 1:
                zab = zab2;
                break;
            case 2:
                break;
            default:
                new StringBuilder(32);
                StringBuilder append = sb2.append("Unknown button size: ");
                StringBuilder append2 = sb2.append(i3);
                new IllegalStateException(sb2.toString());
                throw th2;
        }
        Drawable wrap = DrawableCompat.wrap(resources2.getDrawable(zab));
        DrawableCompat.setTintList(wrap, resources2.getColorStateList(R.color.common_google_signin_btn_tint));
        DrawableCompat.setTintMode(wrap, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(wrap);
        setTextColor((ColorStateList) C0446Preconditions.checkNotNull(resources2.getColorStateList(zab(i4, R.color.common_google_signin_btn_text_dark, R.color.common_google_signin_btn_text_light, R.color.common_google_signin_btn_text_light))));
        switch (i3) {
            case 0:
                setText(resources2.getString(R.string.common_signin_button_text));
                break;
            case 1:
                setText(resources2.getString(R.string.common_signin_button_text_long));
                break;
            case 2:
                setText((CharSequence) null);
                break;
            default:
                new StringBuilder(32);
                StringBuilder append3 = sb.append("Unknown button size: ");
                StringBuilder append4 = sb.append(i3);
                new IllegalStateException(sb.toString());
                throw th;
        }
        setTransformationMethod((TransformationMethod) null);
        if (C0598DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}

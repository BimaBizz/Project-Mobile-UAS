package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.annotation.Nullable;

/* renamed from: androidx.cardview.widget.CardViewImpl */
interface C1165CardViewImpl {
    ColorStateList getBackgroundColor(C1164CardViewDelegate cardViewDelegate);

    float getElevation(C1164CardViewDelegate cardViewDelegate);

    float getMaxElevation(C1164CardViewDelegate cardViewDelegate);

    float getMinHeight(C1164CardViewDelegate cardViewDelegate);

    float getMinWidth(C1164CardViewDelegate cardViewDelegate);

    float getRadius(C1164CardViewDelegate cardViewDelegate);

    void initStatic();

    void initialize(C1164CardViewDelegate cardViewDelegate, Context context, ColorStateList colorStateList, float f, float f2, float f3);

    void onCompatPaddingChanged(C1164CardViewDelegate cardViewDelegate);

    void onPreventCornerOverlapChanged(C1164CardViewDelegate cardViewDelegate);

    void setBackgroundColor(C1164CardViewDelegate cardViewDelegate, @Nullable ColorStateList colorStateList);

    void setElevation(C1164CardViewDelegate cardViewDelegate, float f);

    void setMaxElevation(C1164CardViewDelegate cardViewDelegate, float f);

    void setRadius(C1164CardViewDelegate cardViewDelegate, float f);

    void updatePadding(C1164CardViewDelegate cardViewDelegate);
}

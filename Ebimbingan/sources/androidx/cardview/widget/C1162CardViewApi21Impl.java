package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.cardview.widget.CardViewApi21Impl */
class C1162CardViewApi21Impl implements C1165CardViewImpl {
    C1162CardViewApi21Impl() {
    }

    public void initialize(C1164CardViewDelegate cardViewDelegate, Context context, ColorStateList backgroundColor, float radius, float elevation, float maxElevation) {
        Drawable drawable;
        C1164CardViewDelegate cardView = cardViewDelegate;
        Context context2 = context;
        new C1166RoundRectDrawable(backgroundColor, radius);
        cardView.setCardBackground(drawable);
        View view = cardView.getCardView();
        view.setClipToOutline(true);
        view.setElevation(elevation);
        setMaxElevation(cardView, maxElevation);
    }

    public void setRadius(C1164CardViewDelegate cardView, float radius) {
        getCardBackground(cardView).setRadius(radius);
    }

    public void initStatic() {
    }

    public void setMaxElevation(C1164CardViewDelegate cardViewDelegate, float maxElevation) {
        C1164CardViewDelegate cardView = cardViewDelegate;
        getCardBackground(cardView).setPadding(maxElevation, cardView.getUseCompatPadding(), cardView.getPreventCornerOverlap());
        updatePadding(cardView);
    }

    public float getMaxElevation(C1164CardViewDelegate cardView) {
        return getCardBackground(cardView).getPadding();
    }

    public float getMinWidth(C1164CardViewDelegate cardView) {
        return getRadius(cardView) * 2.0f;
    }

    public float getMinHeight(C1164CardViewDelegate cardView) {
        return getRadius(cardView) * 2.0f;
    }

    public float getRadius(C1164CardViewDelegate cardView) {
        return getCardBackground(cardView).getRadius();
    }

    public void setElevation(C1164CardViewDelegate cardView, float elevation) {
        cardView.getCardView().setElevation(elevation);
    }

    public float getElevation(C1164CardViewDelegate cardView) {
        return cardView.getCardView().getElevation();
    }

    public void updatePadding(C1164CardViewDelegate cardViewDelegate) {
        C1164CardViewDelegate cardView = cardViewDelegate;
        if (!cardView.getUseCompatPadding()) {
            cardView.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float elevation = getMaxElevation(cardView);
        float radius = getRadius(cardView);
        int hPadding = (int) Math.ceil((double) C1167RoundRectDrawableWithShadow.calculateHorizontalPadding(elevation, radius, cardView.getPreventCornerOverlap()));
        int vPadding = (int) Math.ceil((double) C1167RoundRectDrawableWithShadow.calculateVerticalPadding(elevation, radius, cardView.getPreventCornerOverlap()));
        cardView.setShadowPadding(hPadding, vPadding, hPadding, vPadding);
    }

    public void onCompatPaddingChanged(C1164CardViewDelegate cardViewDelegate) {
        C1164CardViewDelegate cardView = cardViewDelegate;
        setMaxElevation(cardView, getMaxElevation(cardView));
    }

    public void onPreventCornerOverlapChanged(C1164CardViewDelegate cardViewDelegate) {
        C1164CardViewDelegate cardView = cardViewDelegate;
        setMaxElevation(cardView, getMaxElevation(cardView));
    }

    public void setBackgroundColor(C1164CardViewDelegate cardView, @Nullable ColorStateList color) {
        getCardBackground(cardView).setColor(color);
    }

    public ColorStateList getBackgroundColor(C1164CardViewDelegate cardView) {
        return getCardBackground(cardView).getColor();
    }

    private C1166RoundRectDrawable getCardBackground(C1164CardViewDelegate cardView) {
        return (C1166RoundRectDrawable) cardView.getCardBackground();
    }
}

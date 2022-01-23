package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class CardViewApi21Impl implements CardViewImpl {
    CardViewApi21Impl() {
    }

    public void initialize(CardViewDelegate cardViewDelegate, Context context, ColorStateList backgroundColor, float radius, float elevation, float maxElevation) {
        Drawable drawable;
        CardViewDelegate cardView = cardViewDelegate;
        Context context2 = context;
        new RoundRectDrawable(backgroundColor, radius);
        cardView.setCardBackground(drawable);
        View view = cardView.getCardView();
        view.setClipToOutline(true);
        view.setElevation(elevation);
        setMaxElevation(cardView, maxElevation);
    }

    public void setRadius(CardViewDelegate cardView, float radius) {
        getCardBackground(cardView).setRadius(radius);
    }

    public void initStatic() {
    }

    public void setMaxElevation(CardViewDelegate cardViewDelegate, float maxElevation) {
        CardViewDelegate cardView = cardViewDelegate;
        getCardBackground(cardView).setPadding(maxElevation, cardView.getUseCompatPadding(), cardView.getPreventCornerOverlap());
        updatePadding(cardView);
    }

    public float getMaxElevation(CardViewDelegate cardView) {
        return getCardBackground(cardView).getPadding();
    }

    public float getMinWidth(CardViewDelegate cardView) {
        return getRadius(cardView) * 2.0f;
    }

    public float getMinHeight(CardViewDelegate cardView) {
        return getRadius(cardView) * 2.0f;
    }

    public float getRadius(CardViewDelegate cardView) {
        return getCardBackground(cardView).getRadius();
    }

    public void setElevation(CardViewDelegate cardView, float elevation) {
        cardView.getCardView().setElevation(elevation);
    }

    public float getElevation(CardViewDelegate cardView) {
        return cardView.getCardView().getElevation();
    }

    public void updatePadding(CardViewDelegate cardViewDelegate) {
        CardViewDelegate cardView = cardViewDelegate;
        if (!cardView.getUseCompatPadding()) {
            cardView.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float elevation = getMaxElevation(cardView);
        float radius = getRadius(cardView);
        int hPadding = (int) Math.ceil((double) RoundRectDrawableWithShadow.calculateHorizontalPadding(elevation, radius, cardView.getPreventCornerOverlap()));
        int vPadding = (int) Math.ceil((double) RoundRectDrawableWithShadow.calculateVerticalPadding(elevation, radius, cardView.getPreventCornerOverlap()));
        cardView.setShadowPadding(hPadding, vPadding, hPadding, vPadding);
    }

    public void onCompatPaddingChanged(CardViewDelegate cardViewDelegate) {
        CardViewDelegate cardView = cardViewDelegate;
        setMaxElevation(cardView, getMaxElevation(cardView));
    }

    public void onPreventCornerOverlapChanged(CardViewDelegate cardViewDelegate) {
        CardViewDelegate cardView = cardViewDelegate;
        setMaxElevation(cardView, getMaxElevation(cardView));
    }

    public void setBackgroundColor(CardViewDelegate cardView, @Nullable ColorStateList color) {
        getCardBackground(cardView).setColor(color);
    }

    public ColorStateList getBackgroundColor(CardViewDelegate cardView) {
        return getCardBackground(cardView).getColor();
    }

    private RoundRectDrawable getCardBackground(CardViewDelegate cardView) {
        return (RoundRectDrawable) cardView.getCardBackground();
    }
}

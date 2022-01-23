package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.RoundRectDrawableWithShadow;

@RequiresApi(17)
class CardViewApi17Impl extends CardViewBaseImpl {
    CardViewApi17Impl() {
    }

    public void initStatic() {
        RoundRectDrawableWithShadow.RoundRectHelper roundRectHelper;
        new RoundRectDrawableWithShadow.RoundRectHelper(this) {
            final /* synthetic */ CardViewApi17Impl this$0;

            {
                this.this$0 = this$0;
            }

            public void drawRoundRect(Canvas canvas, RectF bounds, float f, Paint paint) {
                float cornerRadius = f;
                canvas.drawRoundRect(bounds, cornerRadius, cornerRadius, paint);
            }
        };
        RoundRectDrawableWithShadow.sRoundRectHelper = roundRectHelper;
    }
}

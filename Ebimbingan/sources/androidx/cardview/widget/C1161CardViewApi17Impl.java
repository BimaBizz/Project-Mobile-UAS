package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.C1167RoundRectDrawableWithShadow;

@RequiresApi(17)
/* renamed from: androidx.cardview.widget.CardViewApi17Impl */
class C1161CardViewApi17Impl extends C1163CardViewBaseImpl {
    C1161CardViewApi17Impl() {
    }

    public void initStatic() {
        C1167RoundRectDrawableWithShadow.RoundRectHelper roundRectHelper;
        new C1167RoundRectDrawableWithShadow.RoundRectHelper(this) {
            final /* synthetic */ C1161CardViewApi17Impl this$0;

            {
                this.this$0 = this$0;
            }

            public void drawRoundRect(Canvas canvas, RectF bounds, float f, Paint paint) {
                float cornerRadius = f;
                canvas.drawRoundRect(bounds, cornerRadius, cornerRadius, paint);
            }
        };
        C1167RoundRectDrawableWithShadow.sRoundRectHelper = roundRectHelper;
    }
}

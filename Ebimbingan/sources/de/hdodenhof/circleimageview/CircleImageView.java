package de.hdodenhof.circleimageview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;

public class CircleImageView extends ImageView {
    private static final Bitmap.Config BITMAP_CONFIG = Bitmap.Config.ARGB_8888;
    private static final int COLORDRAWABLE_DIMENSION = 2;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final boolean DEFAULT_BORDER_OVERLAY = false;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final int DEFAULT_CIRCLE_BACKGROUND_COLOR = 0;
    private static final ImageView.ScaleType SCALE_TYPE = ImageView.ScaleType.CENTER_CROP;
    private Bitmap mBitmap;
    private int mBitmapHeight;
    private final Paint mBitmapPaint;
    private BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private int mBorderColor;
    private boolean mBorderOverlay;
    private final Paint mBorderPaint;
    private float mBorderRadius;
    /* access modifiers changed from: private */
    public final RectF mBorderRect;
    private int mBorderWidth;
    private int mCircleBackgroundColor;
    private final Paint mCircleBackgroundPaint;
    private ColorFilter mColorFilter;
    private boolean mDisableCircularTransformation;
    private float mDrawableRadius;
    private final RectF mDrawableRect;
    private boolean mReady;
    private boolean mSetupPending;
    private final Matrix mShaderMatrix;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircleImageView(Context context) {
        super(context);
        RectF rectF;
        RectF rectF2;
        Matrix matrix;
        Paint paint;
        Paint paint2;
        Paint paint3;
        new RectF();
        this.mDrawableRect = rectF;
        new RectF();
        this.mBorderRect = rectF2;
        new Matrix();
        this.mShaderMatrix = matrix;
        new Paint();
        this.mBitmapPaint = paint;
        new Paint();
        this.mBorderPaint = paint2;
        new Paint();
        this.mCircleBackgroundPaint = paint3;
        this.mBorderColor = -16777216;
        this.mBorderWidth = 0;
        this.mCircleBackgroundColor = 0;
        init();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CircleImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CircleImageView(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r0
            r6 = r1
            r7 = r2
            r8 = r3
            r5.<init>(r6, r7, r8)
            r5 = r0
            android.graphics.RectF r6 = new android.graphics.RectF
            r10 = r6
            r6 = r10
            r7 = r10
            r7.<init>()
            r5.mDrawableRect = r6
            r5 = r0
            android.graphics.RectF r6 = new android.graphics.RectF
            r10 = r6
            r6 = r10
            r7 = r10
            r7.<init>()
            r5.mBorderRect = r6
            r5 = r0
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r10 = r6
            r6 = r10
            r7 = r10
            r7.<init>()
            r5.mShaderMatrix = r6
            r5 = r0
            android.graphics.Paint r6 = new android.graphics.Paint
            r10 = r6
            r6 = r10
            r7 = r10
            r7.<init>()
            r5.mBitmapPaint = r6
            r5 = r0
            android.graphics.Paint r6 = new android.graphics.Paint
            r10 = r6
            r6 = r10
            r7 = r10
            r7.<init>()
            r5.mBorderPaint = r6
            r5 = r0
            android.graphics.Paint r6 = new android.graphics.Paint
            r10 = r6
            r6 = r10
            r7 = r10
            r7.<init>()
            r5.mCircleBackgroundPaint = r6
            r5 = r0
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.mBorderColor = r6
            r5 = r0
            r6 = 0
            r5.mBorderWidth = r6
            r5 = r0
            r6 = 0
            r5.mCircleBackgroundColor = r6
            r5 = r1
            r6 = r2
            int[] r7 = de.hdodenhof.circleimageview.R.styleable.CircleImageView
            r8 = r3
            r9 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            r4 = r5
            r5 = r0
            r6 = r4
            int r7 = de.hdodenhof.circleimageview.R.styleable.CircleImageView_civ_border_width
            r8 = 0
            int r6 = r6.getDimensionPixelSize(r7, r8)
            r5.mBorderWidth = r6
            r5 = r0
            r6 = r4
            int r7 = de.hdodenhof.circleimageview.R.styleable.CircleImageView_civ_border_color
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r6 = r6.getColor(r7, r8)
            r5.mBorderColor = r6
            r5 = r0
            r6 = r4
            int r7 = de.hdodenhof.circleimageview.R.styleable.CircleImageView_civ_border_overlay
            r8 = 0
            boolean r6 = r6.getBoolean(r7, r8)
            r5.mBorderOverlay = r6
            r5 = r0
            r6 = r4
            int r7 = de.hdodenhof.circleimageview.R.styleable.CircleImageView_civ_circle_background_color
            r8 = 0
            int r6 = r6.getColor(r7, r8)
            r5.mCircleBackgroundColor = r6
            r5 = r4
            r5.recycle()
            r5 = r0
            r5.init()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.hdodenhof.circleimageview.CircleImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void init() {
        ViewOutlineProvider viewOutlineProvider;
        super.setScaleType(SCALE_TYPE);
        this.mReady = true;
        if (Build.VERSION.SDK_INT >= 21) {
            new OutlineProvider(this, (AnonymousClass1) null);
            setOutlineProvider(viewOutlineProvider);
        }
        if (this.mSetupPending) {
            setup();
            this.mSetupPending = false;
        }
    }

    public ImageView.ScaleType getScaleType() {
        return SCALE_TYPE;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        Throwable th;
        ImageView.ScaleType scaleType2 = scaleType;
        if (scaleType2 != SCALE_TYPE) {
            Throwable th2 = th;
            new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{scaleType2}));
            throw th2;
        }
    }

    public void setAdjustViewBounds(boolean adjustViewBounds) {
        Throwable th;
        if (adjustViewBounds) {
            Throwable th2 = th;
            new IllegalArgumentException("adjustViewBounds not supported.");
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.mDisableCircularTransformation) {
            super.onDraw(canvas2);
        } else if (this.mBitmap != null) {
            if (this.mCircleBackgroundColor != 0) {
                canvas2.drawCircle(this.mDrawableRect.centerX(), this.mDrawableRect.centerY(), this.mDrawableRadius, this.mCircleBackgroundPaint);
            }
            canvas2.drawCircle(this.mDrawableRect.centerX(), this.mDrawableRect.centerY(), this.mDrawableRadius, this.mBitmapPaint);
            if (this.mBorderWidth > 0) {
                canvas2.drawCircle(this.mBorderRect.centerX(), this.mBorderRect.centerY(), this.mBorderRadius, this.mBorderPaint);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        setup();
    }

    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(left, top, right, bottom);
        setup();
    }

    public void setPaddingRelative(int start, int top, int end, int bottom) {
        super.setPaddingRelative(start, top, end, bottom);
        setup();
    }

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public void setBorderColor(@ColorInt int i) {
        int borderColor = i;
        if (borderColor != this.mBorderColor) {
            this.mBorderColor = borderColor;
            this.mBorderPaint.setColor(this.mBorderColor);
            invalidate();
        }
    }

    public int getCircleBackgroundColor() {
        return this.mCircleBackgroundColor;
    }

    public void setCircleBackgroundColor(@ColorInt int i) {
        int circleBackgroundColor = i;
        if (circleBackgroundColor != this.mCircleBackgroundColor) {
            this.mCircleBackgroundColor = circleBackgroundColor;
            this.mCircleBackgroundPaint.setColor(circleBackgroundColor);
            invalidate();
        }
    }

    public void setCircleBackgroundColorResource(@ColorRes int circleBackgroundRes) {
        setCircleBackgroundColor(getContext().getResources().getColor(circleBackgroundRes));
    }

    public int getBorderWidth() {
        return this.mBorderWidth;
    }

    public void setBorderWidth(int i) {
        int borderWidth = i;
        if (borderWidth != this.mBorderWidth) {
            this.mBorderWidth = borderWidth;
            setup();
        }
    }

    public boolean isBorderOverlay() {
        return this.mBorderOverlay;
    }

    public void setBorderOverlay(boolean z) {
        boolean borderOverlay = z;
        if (borderOverlay != this.mBorderOverlay) {
            this.mBorderOverlay = borderOverlay;
            setup();
        }
    }

    public boolean isDisableCircularTransformation() {
        return this.mDisableCircularTransformation;
    }

    public void setDisableCircularTransformation(boolean z) {
        boolean disableCircularTransformation = z;
        if (this.mDisableCircularTransformation != disableCircularTransformation) {
            this.mDisableCircularTransformation = disableCircularTransformation;
            initializeBitmap();
        }
    }

    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        initializeBitmap();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        initializeBitmap();
    }

    public void setImageResource(@DrawableRes int resId) {
        super.setImageResource(resId);
        initializeBitmap();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        initializeBitmap();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        ColorFilter cf = colorFilter;
        if (cf != this.mColorFilter) {
            this.mColorFilter = cf;
            applyColorFilter();
            invalidate();
        }
    }

    public ColorFilter getColorFilter() {
        return this.mColorFilter;
    }

    private void applyColorFilter() {
        ColorFilter colorFilter = this.mBitmapPaint.setColorFilter(this.mColorFilter);
    }

    private Bitmap getBitmapFromDrawable(Drawable drawable) {
        Bitmap bitmap;
        Canvas canvas;
        Drawable drawable2 = drawable;
        if (drawable2 == null) {
            return null;
        }
        if (drawable2 instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        try {
            if (drawable2 instanceof ColorDrawable) {
                bitmap = Bitmap.createBitmap(2, 2, BITMAP_CONFIG);
            } else {
                bitmap = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), BITMAP_CONFIG);
            }
            new Canvas(bitmap);
            Canvas canvas2 = canvas;
            drawable2.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawable2.draw(canvas2);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void initializeBitmap() {
        if (this.mDisableCircularTransformation) {
            this.mBitmap = null;
        } else {
            this.mBitmap = getBitmapFromDrawable(getDrawable());
        }
        setup();
    }

    private void setup() {
        BitmapShader bitmapShader;
        if (!this.mReady) {
            this.mSetupPending = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.mBitmap == null) {
                invalidate();
                return;
            }
            new BitmapShader(this.mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.mBitmapShader = bitmapShader;
            this.mBitmapPaint.setAntiAlias(true);
            Shader shader = this.mBitmapPaint.setShader(this.mBitmapShader);
            this.mBorderPaint.setStyle(Paint.Style.STROKE);
            this.mBorderPaint.setAntiAlias(true);
            this.mBorderPaint.setColor(this.mBorderColor);
            this.mBorderPaint.setStrokeWidth((float) this.mBorderWidth);
            this.mCircleBackgroundPaint.setStyle(Paint.Style.FILL);
            this.mCircleBackgroundPaint.setAntiAlias(true);
            this.mCircleBackgroundPaint.setColor(this.mCircleBackgroundColor);
            this.mBitmapHeight = this.mBitmap.getHeight();
            this.mBitmapWidth = this.mBitmap.getWidth();
            this.mBorderRect.set(calculateBounds());
            this.mBorderRadius = Math.min((this.mBorderRect.height() - ((float) this.mBorderWidth)) / 2.0f, (this.mBorderRect.width() - ((float) this.mBorderWidth)) / 2.0f);
            this.mDrawableRect.set(this.mBorderRect);
            if (!this.mBorderOverlay && this.mBorderWidth > 0) {
                this.mDrawableRect.inset(((float) this.mBorderWidth) - 1.0f, ((float) this.mBorderWidth) - 1.0f);
            }
            this.mDrawableRadius = Math.min(this.mDrawableRect.height() / 2.0f, this.mDrawableRect.width() / 2.0f);
            applyColorFilter();
            updateShaderMatrix();
            invalidate();
        }
    }

    private RectF calculateBounds() {
        RectF rectF;
        int availableWidth = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int availableHeight = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int sideLength = Math.min(availableWidth, availableHeight);
        float left = ((float) getPaddingLeft()) + (((float) (availableWidth - sideLength)) / 2.0f);
        float top = ((float) getPaddingTop()) + (((float) (availableHeight - sideLength)) / 2.0f);
        new RectF(left, top, left + ((float) sideLength), top + ((float) sideLength));
        return rectF;
    }

    private void updateShaderMatrix() {
        float scale;
        float dx = 0.0f;
        float dy = 0.0f;
        this.mShaderMatrix.set((Matrix) null);
        if (((float) this.mBitmapWidth) * this.mDrawableRect.height() > this.mDrawableRect.width() * ((float) this.mBitmapHeight)) {
            scale = this.mDrawableRect.height() / ((float) this.mBitmapHeight);
            dx = (this.mDrawableRect.width() - (((float) this.mBitmapWidth) * scale)) * 0.5f;
        } else {
            scale = this.mDrawableRect.width() / ((float) this.mBitmapWidth);
            dy = (this.mDrawableRect.height() - (((float) this.mBitmapHeight) * scale)) * 0.5f;
        }
        this.mShaderMatrix.setScale(scale, scale);
        boolean postTranslate = this.mShaderMatrix.postTranslate(((float) ((int) (dx + 0.5f))) + this.mDrawableRect.left, ((float) ((int) (dy + 0.5f))) + this.mDrawableRect.top);
        this.mBitmapShader.setLocalMatrix(this.mShaderMatrix);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent event = motionEvent;
        return inTouchableArea(event.getX(), event.getY()) && super.onTouchEvent(event);
    }

    private boolean inTouchableArea(float x, float y) {
        return Math.pow((double) (x - this.mBorderRect.centerX()), 2.0d) + Math.pow((double) (y - this.mBorderRect.centerY()), 2.0d) <= Math.pow((double) this.mBorderRadius, 2.0d);
    }

    @RequiresApi(api = 21)
    private class OutlineProvider extends ViewOutlineProvider {
        final /* synthetic */ CircleImageView this$0;

        private OutlineProvider(CircleImageView circleImageView) {
            this.this$0 = circleImageView;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ OutlineProvider(CircleImageView x0, AnonymousClass1 r7) {
            this(x0);
            AnonymousClass1 r2 = r7;
        }

        public void getOutline(View view, Outline outline) {
            Rect rect;
            View view2 = view;
            new Rect();
            Rect bounds = rect;
            this.this$0.mBorderRect.roundOut(bounds);
            outline.setRoundRect(bounds, ((float) bounds.width()) / 2.0f);
        }
    }
}

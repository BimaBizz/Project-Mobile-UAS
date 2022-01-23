package com.onesignal;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.microsoft.appcenter.Constants;

class DraggableRelativeLayout extends RelativeLayout {
    private static final int EXTRA_PX_DISMISS = OSViewUtils.dpToPx(64);
    private static final int MARGIN_PX_SIZE = OSViewUtils.dpToPx(28);
    /* access modifiers changed from: private */
    public boolean dismissing;
    /* access modifiers changed from: private */
    public ViewDragHelper mDragHelper;
    /* access modifiers changed from: private */
    public DraggableListener mListener;
    /* access modifiers changed from: private */
    public Params params;

    interface DraggableListener {
        void onDismiss();

        void onDragEnd();

        void onDragStart();
    }

    static /* synthetic */ boolean access$502(DraggableRelativeLayout x0, boolean x1) {
        boolean z = x1;
        boolean z2 = z;
        x0.dismissing = z2;
        return z;
    }

    static class Params {
        static final int DRAGGABLE_DIRECTION_DOWN = 1;
        static final int DRAGGABLE_DIRECTION_UP = 0;
        /* access modifiers changed from: private */
        public int dismissingYPos;
        /* access modifiers changed from: private */
        public int dismissingYVelocity;
        int dragDirection;
        int dragThresholdY;
        int height;
        int maxXPos;
        int maxYPos;
        int messageHeight;
        /* access modifiers changed from: private */
        public int offScreenYPos;
        int posY;

        Params() {
        }

        static /* synthetic */ int access$002(Params x0, int x1) {
            int i = x1;
            int i2 = i;
            x0.offScreenYPos = i2;
            return i;
        }

        static /* synthetic */ int access$102(Params x0, int x1) {
            int i = x1;
            int i2 = i;
            x0.dismissingYVelocity = i2;
            return i;
        }

        static /* synthetic */ int access$202(Params x0, int x1) {
            int i = x1;
            int i2 = i;
            x0.dismissingYPos = i2;
            return i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableRelativeLayout(Context context) {
        super(context);
        setClipChildren(false);
        createDragHelper();
    }

    /* access modifiers changed from: package-private */
    public void setListener(DraggableListener listener) {
        DraggableListener draggableListener = listener;
        this.mListener = draggableListener;
    }

    /* access modifiers changed from: package-private */
    public void setParams(Params params2) {
        Params params3 = params2;
        Params params4 = params3;
        this.params = params4;
        int access$002 = Params.access$002(params3, params3.messageHeight + params3.posY + ((Resources.getSystem().getDisplayMetrics().heightPixels - params3.messageHeight) - params3.posY) + EXTRA_PX_DISMISS);
        int access$102 = Params.access$102(params3, OSViewUtils.dpToPx(Constants.DEFAULT_TRIGGER_INTERVAL));
        if (params3.dragDirection == 0) {
            int access$0022 = Params.access$002(params3, (-params3.messageHeight) - MARGIN_PX_SIZE);
            int access$1022 = Params.access$102(params3, -params3.dismissingYVelocity);
            int access$202 = Params.access$202(params3, params3.offScreenYPos / 3);
            return;
        }
        int access$2022 = Params.access$202(params3, (params3.messageHeight / 3) + (params3.maxYPos * 2));
    }

    private void createDragHelper() {
        ViewDragHelper.Callback callback;
        new ViewDragHelper.Callback(this) {
            private int lastYPos;
            final /* synthetic */ DraggableRelativeLayout this$0;

            {
                this.this$0 = this$0;
            }

            public boolean tryCaptureView(@NonNull View view, int i) {
                View view2 = view;
                int i2 = i;
                return true;
            }

            public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
                View view2 = view;
                int top = i;
                int i3 = i2;
                this.lastYPos = top;
                if (this.this$0.params.dragDirection == 1) {
                    if (top >= this.this$0.params.dragThresholdY && this.this$0.mListener != null) {
                        this.this$0.mListener.onDragStart();
                    }
                    if (top < this.this$0.params.maxYPos) {
                        return this.this$0.params.maxYPos;
                    }
                } else {
                    if (top <= this.this$0.params.dragThresholdY && this.this$0.mListener != null) {
                        this.this$0.mListener.onDragStart();
                    }
                    if (top > this.this$0.params.maxYPos) {
                        return this.this$0.params.maxYPos;
                    }
                }
                return top;
            }

            public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
                View view2 = view;
                int i3 = i;
                int i4 = i2;
                return this.this$0.params.maxXPos;
            }

            public void onViewReleased(@NonNull View view, float f, float f2) {
                View view2 = view;
                float f3 = f;
                float yvel = f2;
                int settleDestY = this.this$0.params.maxYPos;
                if (!this.this$0.dismissing) {
                    if (this.this$0.params.dragDirection == 1) {
                        if (this.lastYPos > this.this$0.params.dismissingYPos || yvel > ((float) this.this$0.params.dismissingYVelocity)) {
                            settleDestY = this.this$0.params.offScreenYPos;
                            boolean access$502 = DraggableRelativeLayout.access$502(this.this$0, true);
                            if (this.this$0.mListener != null) {
                                this.this$0.mListener.onDismiss();
                            }
                        }
                    } else if (this.lastYPos < this.this$0.params.dismissingYPos || yvel < ((float) this.this$0.params.dismissingYVelocity)) {
                        settleDestY = this.this$0.params.offScreenYPos;
                        boolean access$5022 = DraggableRelativeLayout.access$502(this.this$0, true);
                        if (this.this$0.mListener != null) {
                            this.this$0.mListener.onDismiss();
                        }
                    }
                }
                if (this.this$0.mDragHelper.settleCapturedViewAt(this.this$0.params.maxXPos, settleDestY)) {
                    ViewCompat.postInvalidateOnAnimation(this.this$0);
                }
            }
        };
        this.mDragHelper = ViewDragHelper.create(this, 1.0f, callback);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent event = motionEvent;
        if (this.dismissing) {
            return true;
        }
        switch (event.getAction()) {
            case 0:
            case 5:
                if (this.mListener != null) {
                    this.mListener.onDragEnd();
                    break;
                }
                break;
        }
        this.mDragHelper.processTouchEvent(event);
        return false;
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.mDragHelper.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void dismiss() {
        this.dismissing = true;
        boolean smoothSlideViewTo = this.mDragHelper.smoothSlideViewTo(this, getLeft(), this.params.offScreenYPos);
        ViewCompat.postInvalidateOnAnimation(this);
    }
}

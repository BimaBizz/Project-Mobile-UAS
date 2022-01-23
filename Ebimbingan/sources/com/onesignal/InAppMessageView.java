package com.onesignal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.C1160CardView;
import androidx.core.widget.PopupWindowCompat;
import com.onesignal.DraggableRelativeLayout;
import com.onesignal.OneSignal;
import com.onesignal.WebViewManager;

class InAppMessageView {
    private static final int ACTIVITY_BACKGROUND_COLOR_EMPTY = Color.parseColor("#00000000");
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor("#BB000000");
    private static final int ACTIVITY_FINISH_AFTER_DISMISS_DELAY_MS = 600;
    private static final int ACTIVITY_INIT_DELAY = 200;
    private static final int DRAG_THRESHOLD_PX_SIZE = OSViewUtils.dpToPx(4);
    private static final int IN_APP_BACKGROUND_ANIMATION_DURATION_MS = 400;
    private static final int IN_APP_BANNER_ANIMATION_DURATION_MS = 1000;
    private static final int IN_APP_CENTER_ANIMATION_DURATION_MS = 1000;
    private static final String IN_APP_MESSAGE_CARD_VIEW_TAG = "IN_APP_MESSAGE_CARD_VIEW_TAG";
    private static final int MARGIN_PX_SIZE = OSViewUtils.dpToPx(24);
    /* access modifiers changed from: private */
    public Activity currentActivity;
    private double dismissDuration;
    /* access modifiers changed from: private */
    @NonNull
    public WebViewManager.Position displayLocation;
    /* access modifiers changed from: private */
    public DraggableRelativeLayout draggableRelativeLayout;
    private final Handler handler;
    /* access modifiers changed from: private */
    public boolean hasBackground;
    private boolean isDragging = false;
    /* access modifiers changed from: private */
    public InAppMessageViewListener messageController;
    private int pageHeight;
    private int pageWidth;
    /* access modifiers changed from: private */
    public RelativeLayout parentRelativeLayout;
    private PopupWindow popupWindow;
    private Runnable scheduleDismissRunnable;
    private boolean shouldDismissWhenActive = false;
    /* access modifiers changed from: private */
    public WebView webView;

    interface InAppMessageViewListener {
        void onMessageWasDismissed();

        void onMessageWasShown();
    }

    static /* synthetic */ boolean access$1302(InAppMessageView x0, boolean x1) {
        boolean z = x1;
        boolean z2 = z;
        x0.isDragging = z2;
        return z;
    }

    static /* synthetic */ Runnable access$1402(InAppMessageView x0, Runnable x1) {
        Runnable runnable = x1;
        Runnable runnable2 = runnable;
        x0.scheduleDismissRunnable = runnable2;
        return runnable;
    }

    static /* synthetic */ boolean access$1502(InAppMessageView x0, boolean x1) {
        boolean z = x1;
        boolean z2 = z;
        x0.shouldDismissWhenActive = z2;
        return z;
    }

    InAppMessageView(@NonNull WebView webView2, @NonNull WebViewManager.Position position, int pageHeight2, double d) {
        Handler handler2;
        WebViewManager.Position displayLocation2 = position;
        double dismissDuration2 = d;
        new Handler();
        this.handler = handler2;
        this.webView = webView2;
        this.displayLocation = displayLocation2;
        this.pageHeight = pageHeight2;
        this.pageWidth = -1;
        this.dismissDuration = Double.isNaN(dismissDuration2) ? 0.0d : dismissDuration2;
        this.hasBackground = !displayLocation2.isBanner();
    }

    /* access modifiers changed from: package-private */
    public void setWebView(WebView webView2) {
        WebView webView3 = webView2;
        this.webView = webView3;
    }

    /* access modifiers changed from: package-private */
    public void setMessageController(InAppMessageViewListener messageController2) {
        InAppMessageViewListener inAppMessageViewListener = messageController2;
        this.messageController = inAppMessageViewListener;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public WebViewManager.Position getDisplayPosition() {
        return this.displayLocation;
    }

    /* access modifiers changed from: package-private */
    public void showView(Activity activity) {
        delayShowUntilAvailable(activity);
    }

    /* access modifiers changed from: package-private */
    public void checkIfShouldDismiss() {
        if (this.shouldDismissWhenActive) {
            this.shouldDismissWhenActive = false;
            finishAfterDelay((WebViewManager.OneSignalGenericCallback) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateHeight(int i) {
        Runnable runnable;
        int pageHeight2 = i;
        this.pageHeight = pageHeight2;
        final int i2 = pageHeight2;
        new Runnable(this) {
            final /* synthetic */ InAppMessageView this$0;

            {
                this.this$0 = this$0;
            }

            public void run() {
                if (this.this$0.webView == null) {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "WebView height update skipped, new height will be used once it is displayed.");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = this.this$0.webView.getLayoutParams();
                layoutParams.height = i2;
                this.this$0.webView.setLayoutParams(layoutParams);
                if (this.this$0.draggableRelativeLayout != null) {
                    this.this$0.draggableRelativeLayout.setParams(this.this$0.createDraggableLayoutParams(i2, this.this$0.displayLocation));
                }
            }
        };
        OSUtils.runOnMainUIThread(runnable);
    }

    /* access modifiers changed from: package-private */
    public void showInAppMessageView(Activity currentActivity2) {
        RelativeLayout.LayoutParams layoutParams;
        this.currentActivity = currentActivity2;
        new RelativeLayout.LayoutParams(-1, this.pageHeight);
        RelativeLayout.LayoutParams webViewLayoutParams = layoutParams;
        webViewLayoutParams.addRule(13);
        showDraggableView(this.displayLocation, webViewLayoutParams, this.hasBackground ? createParentLinearLayoutParams() : null, createDraggableLayoutParams(this.pageHeight, this.displayLocation));
    }

    private int getDisplayYSize() {
        return OSViewUtils.getWindowHeight(this.currentActivity);
    }

    private LinearLayout.LayoutParams createParentLinearLayoutParams() {
        LinearLayout.LayoutParams layoutParams;
        new LinearLayout.LayoutParams(this.pageWidth, -1);
        LinearLayout.LayoutParams linearLayoutParams = layoutParams;
        switch (this.displayLocation) {
            case TOP_BANNER:
                linearLayoutParams.gravity = 49;
                break;
            case BOTTOM_BANNER:
                linearLayoutParams.gravity = 81;
                break;
            case CENTER_MODAL:
            case FULL_SCREEN:
                linearLayoutParams.gravity = 17;
                break;
        }
        return linearLayoutParams;
    }

    /* access modifiers changed from: private */
    public DraggableRelativeLayout.Params createDraggableLayoutParams(int i, WebViewManager.Position position) {
        DraggableRelativeLayout.Params params;
        int pageHeight2 = i;
        WebViewManager.Position displayLocation2 = position;
        new DraggableRelativeLayout.Params();
        DraggableRelativeLayout.Params draggableParams = params;
        draggableParams.maxXPos = MARGIN_PX_SIZE;
        draggableParams.maxYPos = MARGIN_PX_SIZE;
        draggableParams.messageHeight = pageHeight2;
        draggableParams.height = getDisplayYSize();
        switch (displayLocation2) {
            case TOP_BANNER:
                draggableParams.dragThresholdY = MARGIN_PX_SIZE - DRAG_THRESHOLD_PX_SIZE;
                break;
            case BOTTOM_BANNER:
                draggableParams.posY = getDisplayYSize() - pageHeight2;
                draggableParams.dragThresholdY = MARGIN_PX_SIZE + DRAG_THRESHOLD_PX_SIZE;
                break;
            case CENTER_MODAL:
                break;
            case FULL_SCREEN:
                int displayYSize = getDisplayYSize() - (MARGIN_PX_SIZE * 2);
                pageHeight2 = displayYSize;
                draggableParams.messageHeight = displayYSize;
                break;
        }
        int y = (getDisplayYSize() / 2) - (pageHeight2 / 2);
        draggableParams.dragThresholdY = y + DRAG_THRESHOLD_PX_SIZE;
        draggableParams.maxYPos = y;
        draggableParams.posY = y;
        draggableParams.dragDirection = displayLocation2 == WebViewManager.Position.TOP_BANNER ? 0 : 1;
        return draggableParams;
    }

    private void showDraggableView(WebViewManager.Position displayLocation2, RelativeLayout.LayoutParams relativeLayoutParams, LinearLayout.LayoutParams linearLayoutParams, DraggableRelativeLayout.Params webViewLayoutParams) {
        Runnable runnable;
        final RelativeLayout.LayoutParams layoutParams = relativeLayoutParams;
        final LinearLayout.LayoutParams layoutParams2 = linearLayoutParams;
        final DraggableRelativeLayout.Params params = webViewLayoutParams;
        final WebViewManager.Position position = displayLocation2;
        new Runnable(this) {
            final /* synthetic */ InAppMessageView this$0;

            {
                this.this$0 = this$0;
            }

            public void run() {
                if (this.this$0.webView != null) {
                    this.this$0.webView.setLayoutParams(layoutParams);
                    Context context = this.this$0.currentActivity.getApplicationContext();
                    this.this$0.setUpDraggableLayout(context, layoutParams2, params);
                    this.this$0.setUpParentLinearLayout(context);
                    this.this$0.createPopupWindow(this.this$0.parentRelativeLayout);
                    if (this.this$0.messageController != null) {
                        this.this$0.animateInAppMessage(position, this.this$0.draggableRelativeLayout, this.this$0.parentRelativeLayout);
                        this.this$0.messageController.onMessageWasShown();
                    }
                    this.this$0.startDismissTimerIfNeeded();
                }
            }
        };
        OSUtils.runOnMainUIThread(runnable);
    }

    /* access modifiers changed from: private */
    public void createPopupWindow(@NonNull RelativeLayout parentRelativeLayout2) {
        int i;
        int i2;
        Drawable drawable;
        PopupWindow popupWindow2 = r9;
        RelativeLayout relativeLayout = parentRelativeLayout2;
        if (this.hasBackground) {
            i = -1;
        } else {
            i = this.pageWidth;
        }
        if (this.hasBackground) {
            i2 = -1;
        } else {
            i2 = -2;
        }
        PopupWindow popupWindow3 = new PopupWindow(relativeLayout, i, i2);
        this.popupWindow = popupWindow2;
        new ColorDrawable(0);
        this.popupWindow.setBackgroundDrawable(drawable);
        this.popupWindow.setTouchable(true);
        int gravity = 0;
        if (!this.hasBackground) {
            switch (this.displayLocation) {
                case TOP_BANNER:
                    gravity = 49;
                    break;
                case BOTTOM_BANNER:
                    gravity = 81;
                    break;
            }
        }
        PopupWindowCompat.setWindowLayoutType(this.popupWindow, 1003);
        this.popupWindow.showAtLocation(this.currentActivity.getWindow().getDecorView().getRootView(), gravity, 0, 0);
    }

    /* access modifiers changed from: private */
    public void setUpParentLinearLayout(Context context) {
        RelativeLayout relativeLayout;
        Drawable drawable;
        new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        new ColorDrawable(0);
        this.parentRelativeLayout.setBackgroundDrawable(drawable);
        this.parentRelativeLayout.setClipChildren(false);
        this.parentRelativeLayout.setClipToPadding(false);
        this.parentRelativeLayout.addView(this.draggableRelativeLayout);
    }

    /* access modifiers changed from: private */
    public void setUpDraggableLayout(Context context, LinearLayout.LayoutParams layoutParams, DraggableRelativeLayout.Params params) {
        DraggableRelativeLayout draggableRelativeLayout2;
        DraggableRelativeLayout.DraggableListener draggableListener;
        Context context2 = context;
        LinearLayout.LayoutParams linearLayoutParams = layoutParams;
        DraggableRelativeLayout.Params draggableParams = params;
        new DraggableRelativeLayout(context2);
        this.draggableRelativeLayout = draggableRelativeLayout2;
        if (linearLayoutParams != null) {
            this.draggableRelativeLayout.setLayoutParams(linearLayoutParams);
        }
        this.draggableRelativeLayout.setParams(draggableParams);
        new DraggableRelativeLayout.DraggableListener(this) {
            final /* synthetic */ InAppMessageView this$0;

            {
                this.this$0 = this$0;
            }

            public void onDismiss() {
                this.this$0.finishAfterDelay((WebViewManager.OneSignalGenericCallback) null);
            }

            public void onDragStart() {
                boolean access$1302 = InAppMessageView.access$1302(this.this$0, true);
            }

            public void onDragEnd() {
                boolean access$1302 = InAppMessageView.access$1302(this.this$0, false);
            }
        };
        this.draggableRelativeLayout.setListener(draggableListener);
        if (this.webView.getParent() != null) {
            ((ViewGroup) this.webView.getParent()).removeAllViews();
        }
        C1160CardView cardView = createCardView(context2);
        cardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        cardView.addView(this.webView);
        this.draggableRelativeLayout.setPadding(MARGIN_PX_SIZE, MARGIN_PX_SIZE, MARGIN_PX_SIZE, MARGIN_PX_SIZE);
        this.draggableRelativeLayout.setClipChildren(false);
        this.draggableRelativeLayout.setClipToPadding(false);
        this.draggableRelativeLayout.addView(cardView);
    }

    /* access modifiers changed from: package-private */
    public boolean isDragging() {
        return this.isDragging;
    }

    private C1160CardView createCardView(Context context) {
        C1160CardView cardView;
        RelativeLayout.LayoutParams layoutParams;
        new C1160CardView(context);
        C1160CardView cardView2 = cardView;
        new RelativeLayout.LayoutParams(-1, this.displayLocation == WebViewManager.Position.FULL_SCREEN ? -1 : -2);
        RelativeLayout.LayoutParams cardViewLayoutParams = layoutParams;
        cardViewLayoutParams.addRule(13);
        cardView2.setLayoutParams(cardViewLayoutParams);
        if (Build.VERSION.SDK_INT == 23) {
            cardView2.setCardElevation(0.0f);
        } else {
            cardView2.setCardElevation((float) OSViewUtils.dpToPx(5));
        }
        cardView2.setRadius((float) OSViewUtils.dpToPx(8));
        cardView2.setClipChildren(false);
        cardView2.setClipToPadding(false);
        cardView2.setPreventCornerOverlap(false);
        return cardView2;
    }

    /* access modifiers changed from: private */
    public void startDismissTimerIfNeeded() {
        Runnable runnable;
        if (this.dismissDuration > 0.0d && this.scheduleDismissRunnable == null) {
            new Runnable(this) {
                final /* synthetic */ InAppMessageView this$0;

                {
                    this.this$0 = this$0;
                }

                public void run() {
                    if (this.this$0.currentActivity != null) {
                        this.this$0.dismissAndAwaitNextMessage((WebViewManager.OneSignalGenericCallback) null);
                        Runnable access$1402 = InAppMessageView.access$1402(this.this$0, (Runnable) null);
                        return;
                    }
                    boolean access$1502 = InAppMessageView.access$1502(this.this$0, true);
                }
            };
            this.scheduleDismissRunnable = runnable;
            boolean postDelayed = this.handler.postDelayed(this.scheduleDismissRunnable, ((long) this.dismissDuration) * 1000);
        }
    }

    /* access modifiers changed from: private */
    public void delayShowUntilAvailable(Activity activity) {
        Handler handler2;
        Runnable runnable;
        Activity currentActivity2 = activity;
        if (!OSViewUtils.isActivityFullyReady(currentActivity2) || this.parentRelativeLayout != null) {
            new Handler();
            final Activity activity2 = currentActivity2;
            new Runnable(this) {
                final /* synthetic */ InAppMessageView this$0;

                {
                    this.this$0 = this$0;
                }

                public void run() {
                    this.this$0.delayShowUntilAvailable(activity2);
                }
            };
            boolean postDelayed = handler2.postDelayed(runnable, 200);
            return;
        }
        showInAppMessageView(currentActivity2);
    }

    /* access modifiers changed from: package-private */
    public void dismissAndAwaitNextMessage(@Nullable WebViewManager.OneSignalGenericCallback oneSignalGenericCallback) {
        Throwable th;
        WebViewManager.OneSignalGenericCallback callback = oneSignalGenericCallback;
        if (this.draggableRelativeLayout == null) {
            new Throwable();
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", th);
            dereferenceViews();
            if (callback != null) {
                callback.onComplete();
                return;
            }
            return;
        }
        this.draggableRelativeLayout.dismiss();
        finishAfterDelay(callback);
    }

    /* access modifiers changed from: private */
    public void finishAfterDelay(WebViewManager.OneSignalGenericCallback callback) {
        Runnable runnable;
        final WebViewManager.OneSignalGenericCallback oneSignalGenericCallback = callback;
        new Runnable(this) {
            final /* synthetic */ InAppMessageView this$0;

            {
                this.this$0 = this$0;
            }

            public void run() {
                if (!this.this$0.hasBackground || this.this$0.parentRelativeLayout == null) {
                    this.this$0.cleanupViewsAfterDismiss();
                    if (oneSignalGenericCallback != null) {
                        oneSignalGenericCallback.onComplete();
                        return;
                    }
                    return;
                }
                this.this$0.animateAndDismissLayout(this.this$0.parentRelativeLayout, oneSignalGenericCallback);
            }
        };
        OSUtils.runOnMainThreadDelayed(runnable, ACTIVITY_FINISH_AFTER_DISMISS_DELAY_MS);
    }

    /* access modifiers changed from: private */
    public void cleanupViewsAfterDismiss() {
        removeAllViews();
        if (this.messageController != null) {
            this.messageController.onMessageWasDismissed();
        }
    }

    /* access modifiers changed from: package-private */
    public void removeAllViews() {
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "InAppMessageView removing views");
        if (this.scheduleDismissRunnable != null) {
            this.handler.removeCallbacks(this.scheduleDismissRunnable);
            this.scheduleDismissRunnable = null;
        }
        if (this.draggableRelativeLayout != null) {
            this.draggableRelativeLayout.removeAllViews();
        }
        if (this.popupWindow != null) {
            this.popupWindow.dismiss();
        }
        dereferenceViews();
    }

    private void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* access modifiers changed from: private */
    public void animateInAppMessage(WebViewManager.Position position, View view, View view2) {
        WebViewManager.Position displayLocation2 = position;
        View messageView = view;
        View backgroundView = view2;
        C1160CardView messageViewCardView = (C1160CardView) messageView.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        Animation.AnimationListener cardViewAnimCallback = null;
        if (Build.VERSION.SDK_INT == 23) {
            cardViewAnimCallback = createAnimationListenerForAndroidApi23Elevation(messageViewCardView);
        }
        switch (displayLocation2) {
            case TOP_BANNER:
                animateTop(messageViewCardView, this.webView.getHeight(), cardViewAnimCallback);
                return;
            case BOTTOM_BANNER:
                animateBottom(messageViewCardView, this.webView.getHeight(), cardViewAnimCallback);
                return;
            case CENTER_MODAL:
            case FULL_SCREEN:
                animateCenter(messageView, backgroundView, cardViewAnimCallback, (Animator.AnimatorListener) null);
                return;
            default:
                return;
        }
    }

    private Animation.AnimationListener createAnimationListenerForAndroidApi23Elevation(C1160CardView messageViewCardView) {
        Animation.AnimationListener animationListener;
        final C1160CardView cardView = messageViewCardView;
        new Animation.AnimationListener(this) {
            final /* synthetic */ InAppMessageView this$0;

            {
                this.this$0 = this$0;
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                Animation animation2 = animation;
                cardView.setCardElevation((float) OSViewUtils.dpToPx(5));
            }

            public void onAnimationRepeat(Animation animation) {
            }
        };
        return animationListener;
    }

    private void animateTop(View messageView, int height, Animation.AnimationListener cardViewAnimCallback) {
        Interpolator interpolator;
        new OneSignalBounceInterpolator(0.1d, 8.0d);
        OneSignalAnimate.animateViewByTranslation(messageView, (float) ((-height) - MARGIN_PX_SIZE), 0.0f, 1000, interpolator, cardViewAnimCallback).start();
    }

    private void animateBottom(View messageView, int height, Animation.AnimationListener cardViewAnimCallback) {
        Interpolator interpolator;
        new OneSignalBounceInterpolator(0.1d, 8.0d);
        OneSignalAnimate.animateViewByTranslation(messageView, (float) (height + MARGIN_PX_SIZE), 0.0f, 1000, interpolator, cardViewAnimCallback).start();
    }

    private void animateCenter(View messageView, View backgroundView, Animation.AnimationListener cardViewAnimCallback, Animator.AnimatorListener backgroundAnimCallback) {
        Interpolator interpolator;
        new OneSignalBounceInterpolator(0.1d, 8.0d);
        Animation messageAnimation = OneSignalAnimate.animateViewSmallToLarge(messageView, 1000, interpolator, cardViewAnimCallback);
        ValueAnimator backgroundAnimation = animateBackgroundColor(backgroundView, 400, ACTIVITY_BACKGROUND_COLOR_EMPTY, ACTIVITY_BACKGROUND_COLOR_FULL, backgroundAnimCallback);
        messageAnimation.start();
        backgroundAnimation.start();
    }

    /* access modifiers changed from: private */
    public void animateAndDismissLayout(View backgroundView, WebViewManager.OneSignalGenericCallback callback) {
        Animator.AnimatorListener animCallback;
        final WebViewManager.OneSignalGenericCallback oneSignalGenericCallback = callback;
        new AnimatorListenerAdapter(this) {
            final /* synthetic */ InAppMessageView this$0;

            {
                this.this$0 = this$0;
            }

            public void onAnimationEnd(Animator animator) {
                Animator animator2 = animator;
                this.this$0.cleanupViewsAfterDismiss();
                if (oneSignalGenericCallback != null) {
                    oneSignalGenericCallback.onComplete();
                }
            }
        };
        animateBackgroundColor(backgroundView, 400, ACTIVITY_BACKGROUND_COLOR_FULL, ACTIVITY_BACKGROUND_COLOR_EMPTY, animCallback).start();
    }

    private ValueAnimator animateBackgroundColor(View backgroundView, int duration, int startColor, int endColor, Animator.AnimatorListener animCallback) {
        return OneSignalAnimate.animateViewColor(backgroundView, duration, startColor, endColor, animCallback);
    }
}

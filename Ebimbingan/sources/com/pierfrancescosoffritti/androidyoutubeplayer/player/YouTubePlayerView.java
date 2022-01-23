package com.pierfrancescosoffritti.androidyoutubeplayer.player;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerFullScreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerInitListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.playerUtils.FullScreenHelper;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.playerUtils.PlaybackResumer;
import com.pierfrancescosoffritti.androidyoutubeplayer.ui.DefaultPlayerUIController;
import com.pierfrancescosoffritti.androidyoutubeplayer.ui.PlayerUIController;
import com.pierfrancescosoffritti.androidyoutubeplayer.utils.Callable;
import com.pierfrancescosoffritti.androidyoutubeplayer.utils.NetworkReceiver;
import com.pierfrancescosoffritti.androidyoutubeplayer.utils.Utils;
import gnu.expr.Declaration;

public class YouTubePlayerView extends FrameLayout implements LifecycleObserver, NetworkReceiver.NetworkListener {
    /* access modifiers changed from: private */
    @NonNull
    public final a a;
    @Nullable
    private DefaultPlayerUIController b;
    @NonNull
    private final NetworkReceiver c;
    @NonNull
    private final PlaybackResumer d;
    @NonNull
    private final FullScreenHelper e;
    @Nullable
    private Callable f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public YouTubePlayerView(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r0
            r5 = r1
            r6 = r2
            r7 = r3
            r4.<init>(r5, r6, r7)
            r4 = r0
            com.pierfrancescosoffritti.androidyoutubeplayer.player.a r5 = new com.pierfrancescosoffritti.androidyoutubeplayer.player.a
            r10 = r5
            r5 = r10
            r6 = r10
            r7 = r1
            r6.<init>(r7)
            r4.a = r5
            r4 = r0
            r5 = r0
            com.pierfrancescosoffritti.androidyoutubeplayer.player.a r5 = r5.a
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r10 = r6
            r6 = r10
            r7 = r10
            r8 = -1
            r9 = -1
            r7.<init>(r8, r9)
            r4.addView(r5, r6)
            r4 = r0
            com.pierfrancescosoffritti.androidyoutubeplayer.ui.DefaultPlayerUIController r5 = new com.pierfrancescosoffritti.androidyoutubeplayer.ui.DefaultPlayerUIController
            r10 = r5
            r5 = r10
            r6 = r10
            r7 = r0
            r8 = r0
            com.pierfrancescosoffritti.androidyoutubeplayer.player.a r8 = r8.a
            r6.<init>(r7, r8)
            r4.b = r5
            r4 = r0
            com.pierfrancescosoffritti.androidyoutubeplayer.player.playerUtils.PlaybackResumer r5 = new com.pierfrancescosoffritti.androidyoutubeplayer.player.playerUtils.PlaybackResumer
            r10 = r5
            r5 = r10
            r6 = r10
            r6.<init>()
            r4.d = r5
            r4 = r0
            com.pierfrancescosoffritti.androidyoutubeplayer.utils.NetworkReceiver r5 = new com.pierfrancescosoffritti.androidyoutubeplayer.utils.NetworkReceiver
            r10 = r5
            r5 = r10
            r6 = r10
            r7 = r0
            r6.<init>(r7)
            r4.c = r5
            r4 = r0
            com.pierfrancescosoffritti.androidyoutubeplayer.player.playerUtils.FullScreenHelper r5 = new com.pierfrancescosoffritti.androidyoutubeplayer.player.playerUtils.FullScreenHelper
            r10 = r5
            r5 = r10
            r6 = r10
            r6.<init>()
            r4.e = r5
            r4 = r0
            com.pierfrancescosoffritti.androidyoutubeplayer.player.playerUtils.FullScreenHelper r4 = r4.e
            r5 = r0
            com.pierfrancescosoffritti.androidyoutubeplayer.ui.DefaultPlayerUIController r5 = r5.b
            boolean r4 = r4.addFullScreenListener(r5)
            r4 = r0
            r5 = r0
            com.pierfrancescosoffritti.androidyoutubeplayer.player.a r5 = r5.a
            r4.a((com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayer) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    static /* synthetic */ Callable a(YouTubePlayerView youTubePlayerView, Callable callable) {
        Callable callable2 = callable;
        Callable callable3 = callable2;
        youTubePlayerView.f = callable3;
        return callable2;
    }

    private void a(YouTubePlayer youTubePlayer) {
        YouTubePlayerListener youTubePlayerListener;
        YouTubePlayer youTubePlayer2 = youTubePlayer;
        if (this.b != null) {
            boolean addListener = youTubePlayer2.addListener(this.b);
        }
        boolean addListener2 = youTubePlayer2.addListener(this.d);
        new AbstractYouTubePlayerListener(this) {
            final /* synthetic */ YouTubePlayerView a;

            {
                this.a = r5;
            }

            public void onReady() {
                Callable a2 = YouTubePlayerView.a(this.a, (Callable) null);
            }
        };
        boolean addListener3 = youTubePlayer2.addListener(youTubePlayerListener);
    }

    public boolean addFullScreenListener(@NonNull YouTubePlayerFullScreenListener youTubePlayerFullScreenListener) {
        return this.e.addFullScreenListener(youTubePlayerFullScreenListener);
    }

    public void enableBackgroundPlayback(boolean z) {
        boolean z2 = z;
        this.a.a = z2;
    }

    public void enterFullScreen() {
        this.e.enterFullScreen(this);
    }

    public void exitFullScreen() {
        this.e.exitFullScreen(this);
    }

    @NonNull
    public PlayerUIController getPlayerUIController() {
        Throwable th;
        if (this.b != null) {
            return this.b;
        }
        Throwable th2 = th;
        new RuntimeException("You have inflated a custom player UI. You must manage it with your own controller.");
        throw th2;
    }

    public View inflateCustomPlayerUI(@LayoutRes int i) {
        int i2 = i;
        removeViews(1, getChildCount() - 1);
        if (this.b != null) {
            boolean removeListener = this.a.removeListener(this.b);
            boolean removeFullScreenListener = this.e.removeFullScreenListener(this.b);
        }
        this.b = null;
        return View.inflate(getContext(), i2, this);
    }

    public void initialize(@NonNull YouTubePlayerInitListener youTubePlayerInitListener, boolean z) {
        initialize(youTubePlayerInitListener, z, (IFramePlayerOptions) null);
    }

    public void initialize(@NonNull YouTubePlayerInitListener youTubePlayerInitListener, boolean z, @Nullable IFramePlayerOptions iFramePlayerOptions) {
        Callable callable;
        IntentFilter intentFilter;
        YouTubePlayerInitListener youTubePlayerInitListener2 = youTubePlayerInitListener;
        IFramePlayerOptions iFramePlayerOptions2 = iFramePlayerOptions;
        if (z) {
            new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            Intent registerReceiver = getContext().registerReceiver(this.c, intentFilter);
        }
        final YouTubePlayerInitListener youTubePlayerInitListener3 = youTubePlayerInitListener2;
        final IFramePlayerOptions iFramePlayerOptions3 = iFramePlayerOptions2;
        new Callable(this) {
            final /* synthetic */ YouTubePlayerView c;

            {
                this.c = r7;
            }

            public void call() {
                YouTubePlayerInitListener youTubePlayerInitListener;
                new YouTubePlayerInitListener(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r5;
                    }

                    public void onInitSuccess(@NonNull YouTubePlayer youTubePlayer) {
                        youTubePlayerInitListener3.onInitSuccess(youTubePlayer);
                    }
                };
                this.c.a.a(youTubePlayerInitListener, iFramePlayerOptions3);
            }
        };
        this.f = callable;
        if (Utils.isOnline(getContext())) {
            this.f.call();
        }
    }

    public boolean isFullScreen() {
        return this.e.isFullScreen();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (getLayoutParams().height == -2) {
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i3) * 9) / 16, Declaration.MODULE_REFERENCE));
            return;
        }
        super.onMeasure(i3, i4);
    }

    public void onNetworkAvailable() {
        if (this.f != null) {
            this.f.call();
        } else {
            this.d.resume(this.a);
        }
    }

    public void onNetworkUnavailable() {
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.a.pause();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void release() {
        removeView(this.a);
        this.a.removeAllViews();
        this.a.destroy();
        try {
            getContext().unregisterReceiver(this.c);
        } catch (Exception e2) {
            Exception exc = e2;
        }
    }

    public boolean removeFullScreenListener(@NonNull YouTubePlayerFullScreenListener youTubePlayerFullScreenListener) {
        return this.e.removeFullScreenListener(youTubePlayerFullScreenListener);
    }

    public void toggleFullScreen() {
        this.e.toggleFullScreen(this);
    }
}

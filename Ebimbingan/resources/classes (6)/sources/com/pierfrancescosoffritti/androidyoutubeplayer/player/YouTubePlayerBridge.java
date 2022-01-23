package com.pierfrancescosoffritti.androidyoutubeplayer.player;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerListener;
import java.util.Collection;

public class YouTubePlayerBridge {
    /* access modifiers changed from: private */
    @NonNull
    public final YouTubePlayerBridgeCallbacks a;
    @NonNull
    private final Handler b;

    public interface YouTubePlayerBridgeCallbacks {
        Collection<YouTubePlayerListener> getListeners();

        void onYouTubeIframeAPIReady();
    }

    public YouTubePlayerBridge(@NonNull YouTubePlayerBridgeCallbacks youTubePlayerBridgeCallbacks) {
        Handler handler;
        this.a = youTubePlayerBridgeCallbacks;
        new Handler(Looper.getMainLooper());
        this.b = handler;
    }

    @NonNull
    private PlayerConstants.PlayerState a(String str) {
        String str2 = str;
        return str2.equalsIgnoreCase("UNSTARTED") ? PlayerConstants.PlayerState.UNSTARTED : str2.equalsIgnoreCase("ENDED") ? PlayerConstants.PlayerState.ENDED : str2.equalsIgnoreCase("PLAYING") ? PlayerConstants.PlayerState.PLAYING : str2.equalsIgnoreCase("PAUSED") ? PlayerConstants.PlayerState.PAUSED : str2.equalsIgnoreCase("BUFFERING") ? PlayerConstants.PlayerState.BUFFERING : str2.equalsIgnoreCase("CUED") ? PlayerConstants.PlayerState.VIDEO_CUED : PlayerConstants.PlayerState.UNKNOWN;
    }

    @NonNull
    private PlayerConstants.PlaybackQuality b(String str) {
        String str2 = str;
        return str2.equalsIgnoreCase("small") ? PlayerConstants.PlaybackQuality.SMALL : str2.equalsIgnoreCase("medium") ? PlayerConstants.PlaybackQuality.MEDIUM : str2.equalsIgnoreCase("large") ? PlayerConstants.PlaybackQuality.LARGE : str2.equalsIgnoreCase("hd720") ? PlayerConstants.PlaybackQuality.HD720 : str2.equalsIgnoreCase("hd1080") ? PlayerConstants.PlaybackQuality.HD1080 : str2.equalsIgnoreCase("highres") ? PlayerConstants.PlaybackQuality.HIGH_RES : str2.equalsIgnoreCase("default") ? PlayerConstants.PlaybackQuality.DEFAULT : PlayerConstants.PlaybackQuality.UNKNOWN;
    }

    @NonNull
    private PlayerConstants.PlaybackRate c(String str) {
        String str2 = str;
        return str2.equalsIgnoreCase("0.25") ? PlayerConstants.PlaybackRate.RATE_0_25 : str2.equalsIgnoreCase("0.5") ? PlayerConstants.PlaybackRate.RATE_0_5 : str2.equalsIgnoreCase("1") ? PlayerConstants.PlaybackRate.RATE_1 : str2.equalsIgnoreCase("1.5") ? PlayerConstants.PlaybackRate.RATE_1_5 : str2.equalsIgnoreCase("2") ? PlayerConstants.PlaybackRate.RATE_2 : PlayerConstants.PlaybackRate.UNKNOWN;
    }

    @NonNull
    private PlayerConstants.PlayerError d(String str) {
        String str2 = str;
        return str2.equalsIgnoreCase("2") ? PlayerConstants.PlayerError.INVALID_PARAMETER_IN_REQUEST : str2.equalsIgnoreCase("5") ? PlayerConstants.PlayerError.HTML_5_PLAYER : str2.equalsIgnoreCase("100") ? PlayerConstants.PlayerError.VIDEO_NOT_FOUND : str2.equalsIgnoreCase("101") ? PlayerConstants.PlayerError.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER : str2.equalsIgnoreCase("150") ? PlayerConstants.PlayerError.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER : PlayerConstants.PlayerError.UNKNOWN;
    }

    @JavascriptInterface
    public void sendApiChange() {
        Runnable runnable;
        new Runnable(this) {
            final /* synthetic */ YouTubePlayerBridge a;

            {
                this.a = r5;
            }

            public void run() {
                for (YouTubePlayerListener onApiChange : this.a.a.getListeners()) {
                    onApiChange.onApiChange();
                }
            }
        };
        boolean post = this.b.post(runnable);
    }

    @JavascriptInterface
    public void sendError(String str) {
        Runnable runnable;
        final PlayerConstants.PlayerError d = d(str);
        new Runnable(this) {
            final /* synthetic */ YouTubePlayerBridge b;

            {
                this.b = r6;
            }

            public void run() {
                for (YouTubePlayerListener onError : this.b.a.getListeners()) {
                    onError.onError(d);
                }
            }
        };
        boolean post = this.b.post(runnable);
    }

    @JavascriptInterface
    public void sendPlaybackQualityChange(String str) {
        Runnable runnable;
        final PlayerConstants.PlaybackQuality b2 = b(str);
        new Runnable(this) {
            final /* synthetic */ YouTubePlayerBridge b;

            {
                this.b = r6;
            }

            public void run() {
                for (YouTubePlayerListener onPlaybackQualityChange : this.b.a.getListeners()) {
                    onPlaybackQualityChange.onPlaybackQualityChange(b2);
                }
            }
        };
        boolean post = this.b.post(runnable);
    }

    @JavascriptInterface
    public void sendPlaybackRateChange(String str) {
        Runnable runnable;
        final PlayerConstants.PlaybackRate c = c(str);
        new Runnable(this) {
            final /* synthetic */ YouTubePlayerBridge b;

            {
                this.b = r6;
            }

            public void run() {
                for (YouTubePlayerListener onPlaybackRateChange : this.b.a.getListeners()) {
                    onPlaybackRateChange.onPlaybackRateChange(c);
                }
            }
        };
        boolean post = this.b.post(runnable);
    }

    @JavascriptInterface
    public void sendReady() {
        Runnable runnable;
        new Runnable(this) {
            final /* synthetic */ YouTubePlayerBridge a;

            {
                this.a = r5;
            }

            public void run() {
                for (YouTubePlayerListener onReady : this.a.a.getListeners()) {
                    onReady.onReady();
                }
            }
        };
        boolean post = this.b.post(runnable);
    }

    @JavascriptInterface
    public void sendStateChange(String str) {
        Runnable runnable;
        final PlayerConstants.PlayerState a2 = a(str);
        new Runnable(this) {
            final /* synthetic */ YouTubePlayerBridge b;

            {
                this.b = r6;
            }

            public void run() {
                for (YouTubePlayerListener onStateChange : this.b.a.getListeners()) {
                    onStateChange.onStateChange(a2);
                }
            }
        };
        boolean post = this.b.post(runnable);
    }

    @JavascriptInterface
    public void sendVideoCurrentTime(String str) {
        Runnable runnable;
        try {
            final float parseFloat = Float.parseFloat(str);
            new Runnable(this) {
                final /* synthetic */ YouTubePlayerBridge b;

                {
                    this.b = r6;
                }

                public void run() {
                    for (YouTubePlayerListener onCurrentSecond : this.b.a.getListeners()) {
                        onCurrentSecond.onCurrentSecond(parseFloat);
                    }
                }
            };
            boolean post = this.b.post(runnable);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public void sendVideoDuration(String str) {
        Runnable runnable;
        String str2 = str;
        try {
            final float parseFloat = Float.parseFloat(TextUtils.isEmpty(str2) ? "0" : str2);
            new Runnable(this) {
                final /* synthetic */ YouTubePlayerBridge b;

                {
                    this.b = r6;
                }

                public void run() {
                    for (YouTubePlayerListener onVideoDuration : this.b.a.getListeners()) {
                        onVideoDuration.onVideoDuration(parseFloat);
                    }
                }
            };
            boolean post = this.b.post(runnable);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public void sendVideoId(String str) {
        Runnable runnable;
        final String str2 = str;
        new Runnable(this) {
            final /* synthetic */ YouTubePlayerBridge b;

            {
                this.b = r6;
            }

            public void run() {
                for (YouTubePlayerListener onVideoId : this.b.a.getListeners()) {
                    onVideoId.onVideoId(str2);
                }
            }
        };
        boolean post = this.b.post(runnable);
    }

    @JavascriptInterface
    public void sendVideoLoadedFraction(String str) {
        Runnable runnable;
        try {
            final float parseFloat = Float.parseFloat(str);
            new Runnable(this) {
                final /* synthetic */ YouTubePlayerBridge b;

                {
                    this.b = r6;
                }

                public void run() {
                    for (YouTubePlayerListener onVideoLoadedFraction : this.b.a.getListeners()) {
                        onVideoLoadedFraction.onVideoLoadedFraction(parseFloat);
                    }
                }
            };
            boolean post = this.b.post(runnable);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public void sendYouTubeIframeAPIReady() {
        Runnable runnable;
        new Runnable(this) {
            final /* synthetic */ YouTubePlayerBridge a;

            {
                this.a = r5;
            }

            public void run() {
                this.a.a.onYouTubeIframeAPIReady();
            }
        };
        boolean post = this.b.post(runnable);
    }
}

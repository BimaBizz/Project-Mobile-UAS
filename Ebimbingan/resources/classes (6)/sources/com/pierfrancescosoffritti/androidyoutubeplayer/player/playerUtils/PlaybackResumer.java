package com.pierfrancescosoffritti.androidyoutubeplayer.player.playerUtils;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.AbstractYouTubePlayerListener;

public class PlaybackResumer extends AbstractYouTubePlayerListener {
    private boolean a = false;
    private PlayerConstants.PlayerError b = null;
    private String c;
    private float d;

    /* renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.player.playerUtils.PlaybackResumer$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[PlayerConstants.PlayerState.values().length];

        static {
            try {
                a[PlayerConstants.PlayerState.ENDED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                NoSuchFieldError noSuchFieldError = e;
            }
            try {
                a[PlayerConstants.PlayerState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                NoSuchFieldError noSuchFieldError2 = e2;
            }
            try {
                a[PlayerConstants.PlayerState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                NoSuchFieldError noSuchFieldError3 = e3;
            }
        }
    }

    public PlaybackResumer() {
    }

    public void onCurrentSecond(float f) {
        float f2 = f;
        this.d = f2;
    }

    public void onError(@NonNull PlayerConstants.PlayerError playerError) {
        PlayerConstants.PlayerError playerError2 = playerError;
        if (playerError2 == PlayerConstants.PlayerError.HTML_5_PLAYER) {
            this.b = playerError2;
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public void onStateChange(@NonNull PlayerConstants.PlayerState playerState) {
        switch (AnonymousClass1.a[playerState.ordinal()]) {
            case 1:
                this.a = false;
                return;
            case 2:
                this.a = false;
                return;
            case GifDecoder.STATUS_PARTIAL_DECODE:
                this.a = true;
                return;
            default:
                return;
        }
    }

    public void onVideoId(@NonNull String str) {
        String str2 = str;
        this.c = str2;
    }

    public void resume(YouTubePlayer youTubePlayer) {
        YouTubePlayer youTubePlayer2 = youTubePlayer;
        if (this.a && this.b == PlayerConstants.PlayerError.HTML_5_PLAYER) {
            youTubePlayer2.loadVideo(this.c, this.d);
        } else if (!this.a && this.b == PlayerConstants.PlayerError.HTML_5_PLAYER) {
            youTubePlayer2.cueVideo(this.c, this.d);
        }
        this.b = null;
    }
}

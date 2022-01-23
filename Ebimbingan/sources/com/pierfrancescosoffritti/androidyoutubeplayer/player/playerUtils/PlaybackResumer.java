package com.pierfrancescosoffritti.androidyoutubeplayer.player.playerUtils;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.AbstractYouTubePlayerListener;

public class PlaybackResumer extends AbstractYouTubePlayerListener {
    private boolean a = false;
    private PlayerConstants.PlayerError b = null;
    private String c;
    private float d;

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
        switch (playerState) {
            case ENDED:
                this.a = false;
                return;
            case PAUSED:
                this.a = false;
                return;
            case PLAYING:
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

package com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners;

import androidx.annotation.NonNull;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.PlayerConstants;

public abstract class AbstractYouTubePlayerListener implements YouTubePlayerListener {
    public AbstractYouTubePlayerListener() {
    }

    public void onApiChange() {
    }

    public void onCurrentSecond(float f) {
    }

    public void onError(@NonNull PlayerConstants.PlayerError playerError) {
    }

    public void onPlaybackQualityChange(@NonNull PlayerConstants.PlaybackQuality playbackQuality) {
    }

    public void onPlaybackRateChange(@NonNull PlayerConstants.PlaybackRate playbackRate) {
    }

    public void onReady() {
    }

    public void onStateChange(@NonNull PlayerConstants.PlayerState playerState) {
    }

    public void onVideoDuration(float f) {
    }

    public void onVideoId(@NonNull String str) {
    }

    public void onVideoLoadedFraction(float f) {
    }
}

package com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners;

import androidx.annotation.NonNull;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.PlayerConstants;

public interface YouTubePlayerListener {
    void onApiChange();

    void onCurrentSecond(float f);

    void onError(@NonNull PlayerConstants.PlayerError playerError);

    void onPlaybackQualityChange(@NonNull PlayerConstants.PlaybackQuality playbackQuality);

    void onPlaybackRateChange(@NonNull PlayerConstants.PlaybackRate playbackRate);

    void onReady();

    void onStateChange(@NonNull PlayerConstants.PlayerState playerState);

    void onVideoDuration(float f);

    void onVideoId(@NonNull String str);

    void onVideoLoadedFraction(float f);
}

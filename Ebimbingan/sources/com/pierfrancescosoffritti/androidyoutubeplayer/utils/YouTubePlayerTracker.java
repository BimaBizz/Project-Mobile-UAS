package com.pierfrancescosoffritti.androidyoutubeplayer.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.AbstractYouTubePlayerListener;

public class YouTubePlayerTracker extends AbstractYouTubePlayerListener {
    private PlayerConstants.PlayerState a = PlayerConstants.PlayerState.UNKNOWN;
    private float b;
    private float c;
    private String d;

    public YouTubePlayerTracker() {
    }

    public float getCurrentSecond() {
        return this.b;
    }

    public PlayerConstants.PlayerState getState() {
        return this.a;
    }

    public float getVideoDuration() {
        return this.c;
    }

    @Nullable
    public String getVideoId() {
        return this.d;
    }

    public void onCurrentSecond(float f) {
        float f2 = f;
        this.b = f2;
    }

    public void onStateChange(@NonNull PlayerConstants.PlayerState playerState) {
        PlayerConstants.PlayerState playerState2 = playerState;
        this.a = playerState2;
    }

    public void onVideoDuration(float f) {
        float f2 = f;
        this.c = f2;
    }

    public void onVideoId(@NonNull String str) {
        String str2 = str;
        this.d = str2;
    }
}

package com.pierfrancescosoffritti.androidyoutubeplayer.player;

import androidx.annotation.NonNull;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerListener;

public interface YouTubePlayer {
    boolean addListener(@NonNull YouTubePlayerListener youTubePlayerListener);

    void cueVideo(@NonNull String str, float f);

    void loadVideo(@NonNull String str, float f);

    void pause();

    void play();

    boolean removeListener(@NonNull YouTubePlayerListener youTubePlayerListener);

    void seekTo(float f);

    void setVolume(int i);
}

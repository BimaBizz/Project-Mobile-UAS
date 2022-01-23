package com.pierfrancescosoffritti.androidyoutubeplayer.player.playerUtils;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerFullScreenListener;
import java.util.HashSet;
import java.util.Set;

public class FullScreenHelper {
    private boolean a = false;
    private final Set<YouTubePlayerFullScreenListener> b;

    public FullScreenHelper() {
        Set<YouTubePlayerFullScreenListener> set;
        new HashSet();
        this.b = set;
    }

    public boolean addFullScreenListener(@NonNull YouTubePlayerFullScreenListener youTubePlayerFullScreenListener) {
        return this.b.add(youTubePlayerFullScreenListener);
    }

    public void enterFullScreen(@NonNull View view) {
        View view2 = view;
        if (!this.a) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
            view2.setLayoutParams(layoutParams);
            this.a = true;
            for (YouTubePlayerFullScreenListener onYouTubePlayerEnterFullScreen : this.b) {
                onYouTubePlayerEnterFullScreen.onYouTubePlayerEnterFullScreen();
            }
        }
    }

    public void exitFullScreen(@NonNull View view) {
        View view2 = view;
        if (this.a) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.width = -1;
            view2.setLayoutParams(layoutParams);
            this.a = false;
            for (YouTubePlayerFullScreenListener onYouTubePlayerExitFullScreen : this.b) {
                onYouTubePlayerExitFullScreen.onYouTubePlayerExitFullScreen();
            }
        }
    }

    public boolean isFullScreen() {
        return this.a;
    }

    public boolean removeFullScreenListener(@NonNull YouTubePlayerFullScreenListener youTubePlayerFullScreenListener) {
        return this.b.remove(youTubePlayerFullScreenListener);
    }

    public void toggleFullScreen(@NonNull View view) {
        View view2 = view;
        if (this.a) {
            exitFullScreen(view2);
        } else {
            enterFullScreen(view2);
        }
    }
}

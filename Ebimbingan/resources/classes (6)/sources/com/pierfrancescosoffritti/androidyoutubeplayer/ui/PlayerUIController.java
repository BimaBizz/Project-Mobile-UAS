package com.pierfrancescosoffritti.androidyoutubeplayer.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.YouTubePlayerMenu;

public interface PlayerUIController {
    void addView(@NonNull View view);

    void enableLiveVideoUI(boolean z);

    @Nullable
    YouTubePlayerMenu getMenu();

    void removeView(@NonNull View view);

    void setCustomAction1(@NonNull Drawable drawable, @Nullable View.OnClickListener onClickListener);

    void setCustomAction2(@NonNull Drawable drawable, @Nullable View.OnClickListener onClickListener);

    void setFullScreenButtonClickListener(@NonNull View.OnClickListener onClickListener);

    void setMenu(@NonNull YouTubePlayerMenu youTubePlayerMenu);

    void setMenuButtonClickListener(@NonNull View.OnClickListener onClickListener);

    void setVideoTitle(@NonNull String str);

    void showBufferingProgress(boolean z);

    void showCurrentTime(boolean z);

    void showCustomAction1(boolean z);

    void showCustomAction2(boolean z);

    void showDuration(boolean z);

    void showFullscreenButton(boolean z);

    void showMenuButton(boolean z);

    void showPlayPauseButton(boolean z);

    void showSeekBar(boolean z);

    void showUI(boolean z);

    void showVideoTitle(boolean z);

    void showYouTubeButton(boolean z);
}

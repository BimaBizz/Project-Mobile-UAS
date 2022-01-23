package com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu;

import android.view.View;

public interface YouTubePlayerMenu {
    void addItem(MenuItem menuItem);

    void dismiss();

    int getItemCount();

    void removeItem(int i);

    void show(View view);
}

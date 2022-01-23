package com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.defaultMenu;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.MenuItem;
import com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.YouTubePlayerMenu;
import java.util.ArrayList;
import java.util.List;

public class DefaultYouTubePlayerMenu implements YouTubePlayerMenu {
    private final Context a;
    private final List<MenuItem> b;
    @Nullable
    private PopupWindow c;

    public DefaultYouTubePlayerMenu(@NonNull Context context) {
        List<MenuItem> list;
        this.a = context;
        new ArrayList();
        this.b = list;
    }

    @NonNull
    private PopupWindow a() {
        PopupWindow popupWindow;
        Throwable th;
        LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            Throwable th2 = th;
            new RuntimeException("can't access LAYOUT_INFLATER_SERVICE");
            throw th2;
        }
        View inflate = layoutInflater.inflate(R.layout.player_menu, (ViewGroup) null);
        a((RecyclerView) inflate.findViewById(R.id.recycler_view));
        new PopupWindow(inflate, -2, -2);
        PopupWindow popupWindow2 = popupWindow;
        popupWindow2.setFocusable(true);
        popupWindow2.setWidth(-2);
        popupWindow2.setHeight(-2);
        popupWindow2.setContentView(inflate);
        return popupWindow2;
    }

    private void a(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView2 = recyclerView;
        recyclerView2.setHasFixedSize(true);
        new LinearLayoutManager(this.a);
        recyclerView2.setLayoutManager(layoutManager);
        new a(this.a, this.b);
        recyclerView2.setAdapter(adapter);
    }

    public void addItem(MenuItem menuItem) {
        boolean add = this.b.add(menuItem);
    }

    public void dismiss() {
        if (this.c != null) {
            this.c.dismiss();
        }
    }

    public int getItemCount() {
        return this.b.size();
    }

    public void removeItem(int i) {
        MenuItem remove = this.b.remove(i);
    }

    public void show(View view) {
        this.c = a();
        this.c.showAsDropDown(view, 0, (-this.a.getResources().getDimensionPixelSize(R.dimen._8dp)) * 4);
        if (this.b.size() == 0) {
            int e = Log.e(YouTubePlayerMenu.class.getName(), "The menu is empty");
        }
    }
}

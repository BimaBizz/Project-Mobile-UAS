package com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.defaultMenu;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
        a(inflate.findViewById(R.id.recycler_view));
        new PopupWindow(inflate, -2, -2);
        PopupWindow popupWindow2 = popupWindow;
        popupWindow2.setFocusable(true);
        popupWindow2.setWidth(-2);
        popupWindow2.setHeight(-2);
        popupWindow2.setContentView(inflate);
        return popupWindow2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.recyclerview.widget.RecyclerView$LayoutManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(androidx.recyclerview.widget.RecyclerView r9) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r3 = r1
            r4 = 1
            r3.setHasFixedSize(r4)
            r3 = r1
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            r7 = r4
            r4 = r7
            r5 = r7
            r6 = r0
            android.content.Context r6 = r6.a
            r5.<init>(r6)
            r3.setLayoutManager(r4)
            com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.defaultMenu.a r3 = new com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.defaultMenu.a
            r7 = r3
            r3 = r7
            r4 = r7
            r5 = r0
            android.content.Context r5 = r5.a
            r6 = r0
            java.util.List<com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.MenuItem> r6 = r6.b
            r4.<init>(r5, r6)
            r2 = r3
            r3 = r1
            r4 = r2
            r3.setAdapter(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.defaultMenu.DefaultYouTubePlayerMenu.a(androidx.recyclerview.widget.RecyclerView):void");
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

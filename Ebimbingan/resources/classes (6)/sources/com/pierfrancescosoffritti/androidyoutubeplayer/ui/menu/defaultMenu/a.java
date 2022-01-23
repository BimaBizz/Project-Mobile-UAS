package com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.defaultMenu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.MenuItem;
import java.util.List;

class a extends RecyclerView.Adapter<C0000a> {
    @NonNull
    private final Context a;
    @NonNull
    private final List<MenuItem> b;

    /* renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.defaultMenu.a$a  reason: collision with other inner class name */
    class C0000a extends RecyclerView.ViewHolder {
        final View a;
        final TextView b;
        final /* synthetic */ a c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C0000a(com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.defaultMenu.a r7, android.view.View r8) {
            /*
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r0
                r4 = r1
                r3.c = r4
                r3 = r0
                r4 = r2
                r3.<init>(r4)
                r3 = r0
                r4 = r2
                r3.a = r4
                r3 = r0
                r4 = r2
                int r5 = com.pierfrancescosoffritti.androidyoutubeplayer.R.id.text
                android.view.View r4 = r4.findViewById(r5)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.defaultMenu.a.C0000a.<init>(com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.defaultMenu.a, android.view.View):void");
        }
    }

    a(@NonNull Context context, @NonNull List<MenuItem> list) {
        this.a = context;
        this.b = list;
    }

    @NonNull
    /* renamed from: a */
    public C0000a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        C0000a aVar;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        new C0000a(this, LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.menu_item, viewGroup2, false));
        return aVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(@NonNull C0000a aVar, int i) {
        C0000a aVar2 = aVar;
        int i2 = i;
        aVar2.a.setOnClickListener(this.b.get(i2).getOnClickListener());
        aVar2.b.setText(this.b.get(i2).getText());
        aVar2.b.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this.a, this.b.get(i2).getIcon()), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public int getItemCount() {
        return this.b.size();
    }
}

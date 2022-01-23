package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.ListenerHolders */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0255ListenerHolders {
    private final Set<C0254ListenerHolder<?>> zaa;

    public C0255ListenerHolders() {
        Map map;
        new WeakHashMap();
        this.zaa = Collections.newSetFromMap(map);
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.RecentlyNonNull
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L> com.google.android.gms.common.api.internal.C0254ListenerHolder<L> createListenerHolder(@androidx.annotation.RecentlyNonNull L r8, @androidx.annotation.RecentlyNonNull android.os.Looper r9, @androidx.annotation.RecentlyNonNull java.lang.String r10) {
        /*
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r0
            java.lang.String r5 = "Listener must not be null"
            java.lang.Object r4 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r4, r5)
            r4 = r1
            java.lang.String r5 = "Looper must not be null"
            java.lang.Object r4 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r4, r5)
            r4 = r2
            java.lang.String r5 = "Listener type must not be null"
            java.lang.Object r4 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r4, r5)
            com.google.android.gms.common.api.internal.ListenerHolder r4 = new com.google.android.gms.common.api.internal.ListenerHolder
            r3 = r4
            r4 = r3
            r5 = r1
            r6 = r0
            r7 = r2
            r4.<init>(r5, r6, r7)
            r4 = r3
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0255ListenerHolders.createListenerHolder(java.lang.Object, android.os.Looper, java.lang.String):com.google.android.gms.common.api.internal.ListenerHolder");
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.RecentlyNonNull
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L> com.google.android.gms.common.api.internal.C0254ListenerHolder.ListenerKey<L> createListenerKey(@androidx.annotation.RecentlyNonNull L r6, @androidx.annotation.RecentlyNonNull java.lang.String r7) {
        /*
            r0 = r6
            r1 = r7
            r3 = r0
            java.lang.String r4 = "Listener must not be null"
            java.lang.Object r3 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r3, r4)
            r3 = r1
            java.lang.String r4 = "Listener type must not be null"
            java.lang.Object r3 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r3, r4)
            r3 = r1
            java.lang.String r4 = "Listener type must not be empty"
            java.lang.String r3 = com.google.android.gms.common.internal.C0446Preconditions.checkNotEmpty(r3, r4)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r3 = new com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey
            r2 = r3
            r3 = r2
            r4 = r0
            r5 = r1
            r3.<init>(r4, r5)
            r3 = r2
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0255ListenerHolders.createListenerKey(java.lang.Object, java.lang.String):com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey");
    }

    @RecentlyNonNull
    public final <L> C0254ListenerHolder<L> zaa(@RecentlyNonNull L l, @RecentlyNonNull Looper looper, @RecentlyNonNull String str) {
        String str2 = str;
        C0254ListenerHolder<L> createListenerHolder = createListenerHolder(l, looper, "NO_TYPE");
        boolean add = this.zaa.add(createListenerHolder);
        return createListenerHolder;
    }

    public final void zab() {
        for (C0254ListenerHolder<?> clear : this.zaa) {
            clear.clear();
        }
        this.zaa.clear();
    }
}

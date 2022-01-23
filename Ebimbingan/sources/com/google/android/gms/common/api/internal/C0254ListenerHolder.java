package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.ListenerHolder */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0254ListenerHolder<L> {
    private final C0319zabv zaa;
    @Nullable
    private volatile L zab;
    @Nullable
    private volatile ListenerKey<L> zac;

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.ListenerHolder$Notifier */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface Notifier<L> {
        @C0206KeepForSdk
        void notifyListener(@RecentlyNonNull L l);

        @C0206KeepForSdk
        void onNotifyListenerFailed();
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0254ListenerHolder(@androidx.annotation.NonNull android.os.Looper r9, @androidx.annotation.NonNull L r10, @androidx.annotation.NonNull java.lang.String r11) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r0
            r5.<init>()
            com.google.android.gms.common.api.internal.zabv r5 = new com.google.android.gms.common.api.internal.zabv
            r4 = r5
            r5 = r4
            r6 = r0
            r7 = r1
            r5.<init>(r6, r7)
            r5 = r0
            r6 = r4
            r5.zaa = r6
            r5 = r0
            r6 = r2
            java.lang.String r7 = "Listener must not be null"
            java.lang.Object r6 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r6, r7)
            r5.zab = r6
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r5 = new com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey
            r1 = r5
            r5 = r1
            r6 = r2
            r7 = r3
            java.lang.String r7 = com.google.android.gms.common.internal.C0446Preconditions.checkNotEmpty(r7)
            r5.<init>(r6, r7)
            r5 = r0
            r6 = r1
            r5.zac = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0254ListenerHolder.<init>(android.os.Looper, java.lang.Object, java.lang.String):void");
    }

    @C0206KeepForSdk
    public void clear() {
        this.zab = null;
        this.zac = null;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public ListenerKey<L> getListenerKey() {
        return this.zac;
    }

    @C0206KeepForSdk
    public boolean hasListener() {
        return this.zab != null;
    }

    @C0206KeepForSdk
    public void notifyListener(@RecentlyNonNull Notifier<? super L> notifier) {
        Notifier<? super L> notifier2 = notifier;
        Object checkNotNull = C0446Preconditions.checkNotNull(notifier2, "Notifier must not be null");
        boolean sendMessage = this.zaa.sendMessage(this.zaa.obtainMessage(1, notifier2));
    }

    /* access modifiers changed from: package-private */
    @C0206KeepForSdk
    public void notifyListenerInternal(Notifier<? super L> notifier) {
        Notifier<? super L> notifier2 = notifier;
        L l = this.zab;
        if (l == null) {
            notifier2.onNotifyListenerFailed();
            return;
        }
        try {
            notifier2.notifyListener(l);
        } catch (RuntimeException e) {
            RuntimeException runtimeException = e;
            notifier2.onNotifyListenerFailed();
            throw runtimeException;
        }
    }

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static final class ListenerKey<L> {
        private final L zaa;
        private final String zab;

        @C0206KeepForSdk
        ListenerKey(L l, String str) {
            this.zaa = l;
            this.zab = str;
        }

        @C0206KeepForSdk
        public int hashCode() {
            return (System.identityHashCode(this.zaa) * 31) + this.zab.hashCode();
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            /*
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r0
                r3 = r1
                if (r2 != r3) goto L_0x0009
                r2 = 1
                r0 = r2
            L_0x0008:
                return r0
            L_0x0009:
                r2 = r1
                boolean r2 = r2 instanceof com.google.android.gms.common.api.internal.C0254ListenerHolder.ListenerKey
                if (r2 != 0) goto L_0x0011
                r2 = 0
                r0 = r2
                goto L_0x0008
            L_0x0011:
                r2 = r1
                com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r2 = (com.google.android.gms.common.api.internal.C0254ListenerHolder.ListenerKey) r2
                r1 = r2
                r2 = r0
                L r2 = r2.zaa
                r3 = r1
                L r3 = r3.zaa
                if (r2 != r3) goto L_0x002c
                r2 = r0
                java.lang.String r2 = r2.zab
                r3 = r1
                java.lang.String r3 = r3.zab
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x002c
                r2 = 1
                r0 = r2
                goto L_0x0008
            L_0x002c:
                r2 = 0
                r0 = r2
                goto L_0x0008
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0254ListenerHolder.ListenerKey.equals(java.lang.Object):boolean");
        }
    }
}

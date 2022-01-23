package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.common.zzh;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzb extends Fragment implements LifecycleFragment {
    private static final WeakHashMap<Activity, WeakReference<zzb>> zza;
    private final Map<String, LifecycleCallback> zzb;
    /* access modifiers changed from: private */
    public int zzc = 0;
    /* access modifiers changed from: private */
    @Nullable
    public Bundle zzd;

    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            zza = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzb.<clinit>():void");
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzb() {
        /*
            r4 = this;
            r0 = r4
            r2 = r0
            r2.<init>()
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            java.util.Map r3 = java.util.Collections.synchronizedMap(r3)
            r2.zzb = r3
            r2 = r0
            r3 = 0
            r2.zzc = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzb.<init>():void");
    }

    public static zzb zza(Activity activity) {
        Throwable th;
        Object obj;
        zzb zzb2;
        Activity activity2 = activity;
        WeakReference weakReference = zza.get(activity2);
        if (weakReference != null && (zzb2 = (zzb) weakReference.get()) != null) {
            return zzb2;
        }
        try {
            zzb zzb3 = (zzb) activity2.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzb3 == null || zzb3.isRemoving()) {
                new zzb();
                int commitAllowingStateLoss = activity2.getFragmentManager().beginTransaction().add(zzb3, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            WeakHashMap<Activity, WeakReference<zzb>> weakHashMap = zza;
            new WeakReference(zzb3);
            WeakReference<zzb> put = weakHashMap.put(activity2, obj);
            return zzb3;
        } catch (ClassCastException e) {
            new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            throw th;
        }
    }

    public final void addCallback(String str, @NonNull LifecycleCallback lifecycleCallback) {
        Throwable th;
        StringBuilder sb;
        zzh zzh;
        Runnable runnable;
        String str2 = str;
        LifecycleCallback lifecycleCallback2 = lifecycleCallback;
        if (!this.zzb.containsKey(str2)) {
            LifecycleCallback put = this.zzb.put(str2, lifecycleCallback2);
            if (this.zzc > 0) {
                new zzh(Looper.getMainLooper());
                new zza(this, lifecycleCallback2, str2);
                boolean post = zzh.post(runnable);
                return;
            }
            return;
        }
        new StringBuilder(String.valueOf(str2).length() + 59);
        StringBuilder append = sb.append("LifecycleCallback with tag ");
        StringBuilder append2 = sb.append(str2);
        StringBuilder append3 = sb.append(" already added to this fragment.");
        new IllegalArgumentException(sb.toString());
        throw th;
    }

    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        String str2 = str;
        FileDescriptor fileDescriptor2 = fileDescriptor;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        super.dump(str2, fileDescriptor2, printWriter2, strArr2);
        for (LifecycleCallback dump : this.zzb.values()) {
            dump.dump(str2, fileDescriptor2, printWriter2, strArr2);
        }
    }

    @Nullable
    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.zzb.get(str));
    }

    public final Activity getLifecycleActivity() {
        return getActivity();
    }

    public final boolean isCreated() {
        return this.zzc > 0;
    }

    public final boolean isStarted() {
        return this.zzc >= 2;
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i3, i4, intent2);
        for (LifecycleCallback onActivityResult : this.zzb.values()) {
            onActivityResult.onActivityResult(i3, i4, intent2);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3 = bundle;
        super.onCreate(bundle3);
        this.zzc = 1;
        this.zzd = bundle3;
        for (Map.Entry next : this.zzb.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) next.getValue();
            if (bundle3 != null) {
                bundle2 = bundle3.getBundle((String) next.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.zzc = 5;
        for (LifecycleCallback onDestroy : this.zzb.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.zzc = 3;
        for (LifecycleCallback onResume : this.zzb.values()) {
            onResume.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3 = bundle;
        super.onSaveInstanceState(bundle3);
        if (bundle3 != null) {
            for (Map.Entry next : this.zzb.entrySet()) {
                new Bundle();
                ((LifecycleCallback) next.getValue()).onSaveInstanceState(bundle2);
                bundle3.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.zzc = 2;
        for (LifecycleCallback onStart : this.zzb.values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.zzc = 4;
        for (LifecycleCallback onStop : this.zzb.values()) {
            onStop.onStop();
        }
    }
}

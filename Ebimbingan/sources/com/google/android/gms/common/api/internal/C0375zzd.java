package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.common.C1114zzh;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.zzd */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0375zzd extends Fragment implements C0253LifecycleFragment {
    private static final WeakHashMap<FragmentActivity, WeakReference<C0375zzd>> zza;
    private final Map<String, C0252LifecycleCallback> zzb;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0375zzd.<clinit>():void");
    }

    public C0375zzd() {
        Map map;
        new ArrayMap();
        this.zzb = Collections.synchronizedMap(map);
    }

    public static C0375zzd zza(FragmentActivity fragmentActivity) {
        Throwable th;
        Object obj;
        C0375zzd zzd2;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        WeakReference weakReference = zza.get(fragmentActivity2);
        if (weakReference != null && (zzd2 = (C0375zzd) weakReference.get()) != null) {
            return zzd2;
        }
        try {
            C0375zzd zzd3 = (C0375zzd) fragmentActivity2.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (zzd3 == null || zzd3.isRemoving()) {
                new C0375zzd();
                int commitAllowingStateLoss = fragmentActivity2.getSupportFragmentManager().beginTransaction().add((Fragment) zzd3, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            WeakHashMap<FragmentActivity, WeakReference<C0375zzd>> weakHashMap = zza;
            new WeakReference(zzd3);
            WeakReference<C0375zzd> put = weakHashMap.put(fragmentActivity2, obj);
            return zzd3;
        } catch (ClassCastException e) {
            new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            throw th;
        }
    }

    public final void addCallback(String str, @NonNull C0252LifecycleCallback lifecycleCallback) {
        Throwable th;
        StringBuilder sb;
        C1114zzh zzh;
        Runnable runnable;
        String str2 = str;
        C0252LifecycleCallback lifecycleCallback2 = lifecycleCallback;
        if (!this.zzb.containsKey(str2)) {
            C0252LifecycleCallback put = this.zzb.put(str2, lifecycleCallback2);
            if (this.zzc > 0) {
                new C1114zzh(Looper.getMainLooper());
                new C0374zzc(this, lifecycleCallback2, str2);
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
        for (C0252LifecycleCallback dump : this.zzb.values()) {
            dump.dump(str2, fileDescriptor2, printWriter2, strArr2);
        }
    }

    @Nullable
    public final <T extends C0252LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        return (C0252LifecycleCallback) cls.cast(this.zzb.get(str));
    }

    public final /* bridge */ /* synthetic */ Activity getLifecycleActivity() {
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
        for (C0252LifecycleCallback onActivityResult : this.zzb.values()) {
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
            C0252LifecycleCallback lifecycleCallback = (C0252LifecycleCallback) next.getValue();
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
        for (C0252LifecycleCallback onDestroy : this.zzb.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.zzc = 3;
        for (C0252LifecycleCallback onResume : this.zzb.values()) {
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
                ((C0252LifecycleCallback) next.getValue()).onSaveInstanceState(bundle2);
                bundle3.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.zzc = 2;
        for (C0252LifecycleCallback onStart : this.zzb.values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.zzc = 4;
        for (C0252LifecycleCallback onStop : this.zzb.values()) {
            onStop.onStop();
        }
    }
}

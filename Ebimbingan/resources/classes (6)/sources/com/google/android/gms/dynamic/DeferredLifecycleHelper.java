package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    /* access modifiers changed from: private */
    public T zaa;
    @Nullable
    private Bundle zab;
    /* access modifiers changed from: private */
    public LinkedList<zah> zac;
    private final OnDelegateCreatedListener<T> zad;

    @KeepForSdk
    public DeferredLifecycleHelper() {
        OnDelegateCreatedListener<T> onDelegateCreatedListener;
        new zaa(this);
        this.zad = onDelegateCreatedListener;
    }

    @KeepForSdk
    public static void showGooglePlayUnavailableMessage(@RecentlyNonNull FrameLayout frameLayout) {
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        TextView textView;
        ViewGroup.LayoutParams layoutParams2;
        Button button;
        ViewGroup.LayoutParams layoutParams3;
        View.OnClickListener onClickListener;
        FrameLayout frameLayout2 = frameLayout;
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        Context context = frameLayout2.getContext();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
        String zac2 = zac.zac(context, isGooglePlayServicesAvailable);
        String zae = zac.zae(context, isGooglePlayServicesAvailable);
        new LinearLayout(frameLayout2.getContext());
        linearLayout.setOrientation(1);
        new FrameLayout.LayoutParams(-2, -2);
        linearLayout.setLayoutParams(layoutParams);
        frameLayout2.addView(linearLayout);
        new TextView(frameLayout2.getContext());
        new FrameLayout.LayoutParams(-2, -2);
        textView.setLayoutParams(layoutParams2);
        textView.setText(zac2);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = instance.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, (String) null);
        if (errorResolutionIntent != null) {
            new Button(context);
            button.setId(16908313);
            new FrameLayout.LayoutParams(-2, -2);
            button.setLayoutParams(layoutParams3);
            button.setText(zae);
            linearLayout.addView(button);
            new zae(context, errorResolutionIntent);
            button.setOnClickListener(onClickListener);
        }
    }

    static /* synthetic */ LifecycleDelegate zaa(DeferredLifecycleHelper deferredLifecycleHelper, LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2 = lifecycleDelegate;
        deferredLifecycleHelper.zaa = lifecycleDelegate2;
        return lifecycleDelegate2;
    }

    static /* synthetic */ Bundle zad(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        Bundle bundle2 = bundle;
        deferredLifecycleHelper.zab = null;
        return null;
    }

    private final void zae(int i) {
        int i2 = i;
        while (!this.zac.isEmpty() && this.zac.getLast().zaa() >= i2) {
            zah removeLast = this.zac.removeLast();
        }
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zaf(@androidx.annotation.Nullable android.os.Bundle r7, com.google.android.gms.dynamic.zah r8) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r0
            T r4 = r4.zaa
            r3 = r4
            r4 = r3
            if (r4 == 0) goto L_0x0010
            r4 = r2
            r5 = r3
            r4.zab(r5)
        L_0x000f:
            return
        L_0x0010:
            r4 = r0
            java.util.LinkedList<com.google.android.gms.dynamic.zah> r4 = r4.zac
            if (r4 != 0) goto L_0x0020
            java.util.LinkedList r4 = new java.util.LinkedList
            r3 = r4
            r4 = r3
            r4.<init>()
            r4 = r0
            r5 = r3
            r4.zac = r5
        L_0x0020:
            r4 = r0
            java.util.LinkedList<com.google.android.gms.dynamic.zah> r4 = r4.zac
            r5 = r2
            boolean r4 = r4.add(r5)
            r4 = r1
            if (r4 == 0) goto L_0x003c
            r4 = r0
            android.os.Bundle r4 = r4.zab
            r2 = r4
            r4 = r2
            if (r4 != 0) goto L_0x0044
            r4 = r0
            r5 = r1
            java.lang.Object r5 = r5.clone()
            android.os.Bundle r5 = (android.os.Bundle) r5
            r4.zab = r5
        L_0x003c:
            r4 = r0
            r5 = r0
            com.google.android.gms.dynamic.OnDelegateCreatedListener<T> r5 = r5.zad
            r4.createDelegate(r5)
            goto L_0x000f
        L_0x0044:
            r4 = r2
            r5 = r1
            r4.putAll(r5)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.DeferredLifecycleHelper.zaf(android.os.Bundle, com.google.android.gms.dynamic.zah):void");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract void createDelegate(@RecentlyNonNull OnDelegateCreatedListener<T> onDelegateCreatedListener);

    @RecentlyNonNull
    @KeepForSdk
    public T getDelegate() {
        return this.zaa;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void handleGooglePlayUnavailable(@RecentlyNonNull FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    @KeepForSdk
    public void onCreate(@Nullable Bundle bundle) {
        zah zah;
        Bundle bundle2 = bundle;
        new zac(this, bundle2);
        zaf(bundle2, zah);
    }

    @RecentlyNonNull
    @KeepForSdk
    public View onCreateView(@RecentlyNonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FrameLayout frameLayout;
        zah zah;
        LayoutInflater layoutInflater2 = layoutInflater;
        Bundle bundle2 = bundle;
        new FrameLayout(layoutInflater2.getContext());
        new zad(this, frameLayout, layoutInflater2, viewGroup, bundle2);
        zaf(bundle2, zah);
        if (this.zaa == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    public void onDestroy() {
        T t = this.zaa;
        if (t != null) {
            t.onDestroy();
        } else {
            zae(1);
        }
    }

    @KeepForSdk
    public void onDestroyView() {
        T t = this.zaa;
        if (t != null) {
            t.onDestroyView();
        } else {
            zae(2);
        }
    }

    @KeepForSdk
    public void onInflate(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle, @Nullable Bundle bundle2) {
        zah zah;
        Bundle bundle3 = bundle2;
        new zab(this, activity, bundle, bundle3);
        zaf(bundle3, zah);
    }

    @KeepForSdk
    public void onLowMemory() {
        T t = this.zaa;
        if (t != null) {
            t.onLowMemory();
        }
    }

    @KeepForSdk
    public void onPause() {
        T t = this.zaa;
        if (t != null) {
            t.onPause();
        } else {
            zae(5);
        }
    }

    @KeepForSdk
    public void onResume() {
        zah zah;
        new zag(this);
        zaf((Bundle) null, zah);
    }

    @KeepForSdk
    public void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        Bundle bundle2 = bundle;
        T t = this.zaa;
        if (t != null) {
            t.onSaveInstanceState(bundle2);
            return;
        }
        Bundle bundle3 = this.zab;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
    }

    @KeepForSdk
    public void onStart() {
        zah zah;
        new zaf(this);
        zaf((Bundle) null, zah);
    }

    @KeepForSdk
    public void onStop() {
        T t = this.zaa;
        if (t != null) {
            t.onStop();
        } else {
            zae(4);
        }
    }
}

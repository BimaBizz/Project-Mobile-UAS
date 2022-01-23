package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.dynamic.LifecycleDelegate */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface C0662LifecycleDelegate {
    @C0206KeepForSdk
    void onCreate(@Nullable Bundle bundle);

    @RecentlyNonNull
    @C0206KeepForSdk
    View onCreateView(@RecentlyNonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle);

    @C0206KeepForSdk
    void onDestroy();

    @C0206KeepForSdk
    void onDestroyView();

    @C0206KeepForSdk
    void onInflate(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle, @Nullable Bundle bundle2);

    @C0206KeepForSdk
    void onLowMemory();

    @C0206KeepForSdk
    void onPause();

    @C0206KeepForSdk
    void onResume();

    @C0206KeepForSdk
    void onSaveInstanceState(@RecentlyNonNull Bundle bundle);

    @C0206KeepForSdk
    void onStart();

    @C0206KeepForSdk
    void onStop();
}

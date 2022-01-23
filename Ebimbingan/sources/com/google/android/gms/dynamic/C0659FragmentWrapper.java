package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.dynamic.C0660IFragmentWrapper;

@SuppressLint({"NewApi"})
@C0206KeepForSdk
/* renamed from: com.google.android.gms.dynamic.FragmentWrapper */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0659FragmentWrapper extends C0660IFragmentWrapper.Stub {
    private Fragment zza;

    private C0659FragmentWrapper(Fragment fragment) {
        this.zza = fragment;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public static C0659FragmentWrapper wrap(@Nullable Fragment fragment) {
        C0659FragmentWrapper fragmentWrapper;
        Fragment fragment2 = fragment;
        if (fragment2 == null) {
            return null;
        }
        new C0659FragmentWrapper(fragment2);
        return fragmentWrapper;
    }

    public final void zzA(@RecentlyNonNull C0661IObjectWrapper iObjectWrapper) {
        View view = (View) C0663ObjectWrapper.unwrap(iObjectWrapper);
        Fragment fragment = this.zza;
        Object checkNotNull = C0446Preconditions.checkNotNull(view);
        fragment.unregisterForContextMenu(view);
    }

    @RecentlyNonNull
    public final C0661IObjectWrapper zzb() {
        return C0663ObjectWrapper.wrap(this.zza.getActivity());
    }

    @RecentlyNonNull
    public final Bundle zzc() {
        return this.zza.getArguments();
    }

    public final int zzd() {
        return this.zza.getId();
    }

    @RecentlyNullable
    public final C0660IFragmentWrapper zze() {
        return wrap(this.zza.getParentFragment());
    }

    @RecentlyNonNull
    public final C0661IObjectWrapper zzf() {
        return C0663ObjectWrapper.wrap(this.zza.getResources());
    }

    public final boolean zzg() {
        return this.zza.getRetainInstance();
    }

    @RecentlyNullable
    public final String zzh() {
        return this.zza.getTag();
    }

    @RecentlyNullable
    public final C0660IFragmentWrapper zzi() {
        return wrap(this.zza.getTargetFragment());
    }

    public final int zzj() {
        return this.zza.getTargetRequestCode();
    }

    public final boolean zzk() {
        return this.zza.getUserVisibleHint();
    }

    @RecentlyNonNull
    public final C0661IObjectWrapper zzl() {
        return C0663ObjectWrapper.wrap(this.zza.getView());
    }

    public final boolean zzm() {
        return this.zza.isAdded();
    }

    public final boolean zzn() {
        return this.zza.isDetached();
    }

    public final boolean zzo() {
        return this.zza.isHidden();
    }

    public final boolean zzp() {
        return this.zza.isInLayout();
    }

    public final boolean zzq() {
        return this.zza.isRemoving();
    }

    public final boolean zzr() {
        return this.zza.isResumed();
    }

    public final boolean zzs() {
        return this.zza.isVisible();
    }

    public final void zzt(@RecentlyNonNull C0661IObjectWrapper iObjectWrapper) {
        View view = (View) C0663ObjectWrapper.unwrap(iObjectWrapper);
        Fragment fragment = this.zza;
        Object checkNotNull = C0446Preconditions.checkNotNull(view);
        fragment.registerForContextMenu(view);
    }

    public final void zzu(boolean z) {
        this.zza.setHasOptionsMenu(z);
    }

    public final void zzv(boolean z) {
        this.zza.setMenuVisibility(z);
    }

    public final void zzw(boolean z) {
        this.zza.setRetainInstance(z);
    }

    public final void zzx(boolean z) {
        this.zza.setUserVisibleHint(z);
    }

    public final void zzy(@RecentlyNonNull Intent intent) {
        this.zza.startActivity(intent);
    }

    public final void zzz(@RecentlyNonNull Intent intent, int i) {
        this.zza.startActivityForResult(intent, i);
    }
}

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {
    private Fragment zza;

    private SupportFragmentWrapper(Fragment fragment) {
        this.zza = fragment;
    }

    @KeepForSdk
    @RecentlyNullable
    public static SupportFragmentWrapper wrap(@Nullable Fragment fragment) {
        SupportFragmentWrapper supportFragmentWrapper;
        Fragment fragment2 = fragment;
        if (fragment2 == null) {
            return null;
        }
        new SupportFragmentWrapper(fragment2);
        return supportFragmentWrapper;
    }

    public final void zzA(@RecentlyNonNull IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        Fragment fragment = this.zza;
        Object checkNotNull = Preconditions.checkNotNull(view);
        fragment.unregisterForContextMenu(view);
    }

    @RecentlyNonNull
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this.zza.getActivity());
    }

    @RecentlyNonNull
    public final Bundle zzc() {
        return this.zza.getArguments();
    }

    public final int zzd() {
        return this.zza.getId();
    }

    @RecentlyNullable
    public final IFragmentWrapper zze() {
        return wrap(this.zza.getParentFragment());
    }

    @RecentlyNonNull
    public final IObjectWrapper zzf() {
        return ObjectWrapper.wrap(this.zza.getResources());
    }

    public final boolean zzg() {
        return this.zza.getRetainInstance();
    }

    @RecentlyNullable
    public final String zzh() {
        return this.zza.getTag();
    }

    @RecentlyNullable
    public final IFragmentWrapper zzi() {
        return wrap(this.zza.getTargetFragment());
    }

    public final int zzj() {
        return this.zza.getTargetRequestCode();
    }

    public final boolean zzk() {
        return this.zza.getUserVisibleHint();
    }

    @RecentlyNonNull
    public final IObjectWrapper zzl() {
        return ObjectWrapper.wrap(this.zza.getView());
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

    public final void zzt(@RecentlyNonNull IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        Fragment fragment = this.zza;
        Object checkNotNull = Preconditions.checkNotNull(view);
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

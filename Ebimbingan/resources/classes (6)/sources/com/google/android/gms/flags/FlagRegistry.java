package com.google.android.gms.flags;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.flags.Flag;
import java.util.ArrayList;
import java.util.Collection;

public class FlagRegistry {
    private final Collection<Flag> zzg;
    private final Collection<Flag.StringFlag> zzh;
    private final Collection<Flag.StringFlag> zzi;

    public FlagRegistry() {
        Collection<Flag> collection;
        Collection<Flag.StringFlag> collection2;
        Collection<Flag.StringFlag> collection3;
        new ArrayList();
        this.zzg = collection;
        new ArrayList();
        this.zzh = collection2;
        new ArrayList();
        this.zzi = collection3;
    }

    public final void zza(Flag flag) {
        boolean add = this.zzg.add(flag);
    }

    @KeepForSdk
    public static void initialize(Context context) {
        Singletons.zzd().initialize(context);
    }
}

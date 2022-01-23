package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class Objects {

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static final class ToStringHelper {
        private final List<String> zza;
        private final Object zzb;

        /* synthetic */ ToStringHelper(Object obj, zzag zzag) {
            List<String> list;
            Object obj2 = obj;
            zzag zzag2 = zzag;
            Object checkNotNull = Preconditions.checkNotNull(obj2);
            this.zzb = obj2;
            new ArrayList();
            this.zza = list;
        }

        @RecentlyNonNull
        @KeepForSdk
        public ToStringHelper add(@RecentlyNonNull String str, @Nullable Object obj) {
            StringBuilder sb;
            String str2 = str;
            List<String> list = this.zza;
            Object checkNotNull = Preconditions.checkNotNull(str2);
            String valueOf = String.valueOf(obj);
            new StringBuilder(str2.length() + 1 + String.valueOf(valueOf).length());
            StringBuilder append = sb.append(str2);
            StringBuilder append2 = sb.append("=");
            StringBuilder append3 = sb.append(valueOf);
            boolean add = list.add(sb.toString());
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public String toString() {
            StringBuilder sb;
            new StringBuilder(100);
            StringBuilder append = sb.append(this.zzb.getClass().getSimpleName());
            StringBuilder append2 = sb.append('{');
            int size = this.zza.size();
            for (int i = 0; i < size; i++) {
                StringBuilder append3 = sb.append(this.zza.get(i));
                if (i < size - 1) {
                    StringBuilder append4 = sb.append(", ");
                }
            }
            StringBuilder append5 = sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        Throwable th;
        new AssertionError("Uninstantiable");
        throw th;
    }

    @KeepForSdk
    public static boolean equal(@Nullable Object obj, @Nullable Object obj2) {
        boolean z;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (obj3 == obj4) {
            z = true;
        } else if (obj3 == null) {
            z = false;
        } else if (!obj3.equals(obj4)) {
            return false;
        } else {
            z = true;
        }
        return z;
    }

    @KeepForSdk
    public static int hashCode(@RecentlyNonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static ToStringHelper toStringHelper(@RecentlyNonNull Object obj) {
        ToStringHelper toStringHelper;
        new ToStringHelper(obj, (zzag) null);
        return toStringHelper;
    }

    @KeepForSdk
    public static boolean checkBundlesEquality(@RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2) {
        Bundle bundle3 = bundle;
        Bundle bundle4 = bundle2;
        if (bundle3 == null || bundle4 == null) {
            if (bundle3 == bundle4) {
                return true;
            }
            return false;
        } else if (bundle3.size() != bundle4.size()) {
            return false;
        } else {
            Set<String> keySet = bundle3.keySet();
            if (!keySet.containsAll(bundle4.keySet())) {
                return false;
            }
            for (String str : keySet) {
                if (!equal(bundle3.get(str), bundle4.get(str))) {
                    return false;
                }
            }
            return true;
        }
    }
}

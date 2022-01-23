package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface C0463SafeParcelable extends Parcelable {
    @RecentlyNonNull
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface Class {
        @RecentlyNonNull
        String creator();

        boolean validate() default false;
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface Constructor {
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface Field {
        @RecentlyNonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @RecentlyNonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @RecentlyNonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @RecentlyNonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$Indicator */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface Indicator {
        @RecentlyNonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface Param {
        int id();
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$Reserved */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface Reserved {
        @RecentlyNonNull
        int[] value();
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface VersionField {
        @RecentlyNonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @RecentlyNonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}

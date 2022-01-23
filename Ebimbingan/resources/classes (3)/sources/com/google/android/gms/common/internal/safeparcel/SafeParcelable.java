package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface SafeParcelable extends Parcelable {
    @RecentlyNonNull
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface Class {
        @RecentlyNonNull
        String creator();

        boolean validate() default false;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface Constructor {
    }

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

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface Indicator {
        @RecentlyNonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface Param {
        int id();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface Reserved {
        @RecentlyNonNull
        int[] value();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public @interface VersionField {
        @RecentlyNonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @RecentlyNonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}

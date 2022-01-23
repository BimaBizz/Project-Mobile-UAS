package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@C0463SafeParcelable.Class(creator = "ActivityTransitionCreator")
@C0463SafeParcelable.Reserved({1000})
public class ActivityTransition extends C0460AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;
    public static final Parcelable.Creator<ActivityTransition> CREATOR;
    @C0463SafeParcelable.Field(getter = "getActivityType", id = 1)
    private final int zzi;
    @C0463SafeParcelable.Field(getter = "getTransitionType", id = 2)
    private final int zzj;

    public static class Builder {
        private int zzi = -1;
        private int zzj = -1;

        public Builder() {
        }

        public ActivityTransition build() {
            ActivityTransition activityTransition;
            C0446Preconditions.checkState(this.zzi != -1, "Activity type not set.");
            C0446Preconditions.checkState(this.zzj != -1, "Activity transition type not set.");
            new ActivityTransition(this.zzi, this.zzj);
            return activityTransition;
        }

        public Builder setActivityTransition(int i) {
            int i2 = i;
            ActivityTransition.zza(i2);
            this.zzj = i2;
            return this;
        }

        public Builder setActivityType(int i) {
            int i2 = i;
            DetectedActivity.zzb(i2);
            this.zzi = i2;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    static {
        Parcelable.Creator<ActivityTransition> creator;
        new zzc();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    ActivityTransition(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) int i2) {
        this.zzi = i;
        this.zzj = i2;
    }

    public static void zza(int i) {
        StringBuilder sb;
        int i2 = i;
        boolean z = i2 >= 0 && i2 <= 1;
        new StringBuilder(41);
        C0446Preconditions.checkArgument(z, sb.append("Transition type ").append(i2).append(" is not valid.").toString());
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r3 = r0
            r4 = r1
            if (r3 != r4) goto L_0x0009
            r3 = 1
            r0 = r3
        L_0x0008:
            return r0
        L_0x0009:
            r3 = r1
            boolean r3 = r3 instanceof com.google.android.gms.location.ActivityTransition
            if (r3 != 0) goto L_0x0011
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x0011:
            r3 = r1
            com.google.android.gms.location.ActivityTransition r3 = (com.google.android.gms.location.ActivityTransition) r3
            r2 = r3
            r3 = r0
            int r3 = r3.zzi
            r4 = r2
            int r4 = r4.zzi
            if (r3 != r4) goto L_0x0028
            r3 = r0
            int r3 = r3.zzj
            r4 = r2
            int r4 = r4.zzj
            if (r3 != r4) goto L_0x0028
            r3 = 1
            r0 = r3
            goto L_0x0008
        L_0x0028:
            r3 = 0
            r0 = r3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityTransition.equals(java.lang.Object):boolean");
    }

    public int getActivityType() {
        return this.zzi;
    }

    public int getTransitionType() {
        return this.zzj;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.zzi);
        Object[] objArr2 = objArr;
        objArr2[1] = Integer.valueOf(this.zzj);
        return C0444Objects.hashCode(objArr2);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.zzi;
        int i2 = this.zzj;
        new StringBuilder(75);
        return sb.append("ActivityTransition [mActivityType=").append(i).append(", mTransitionType=").append(i2).append(']').toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, getActivityType());
        C0462SafeParcelWriter.writeInt(parcel2, 2, getTransitionType());
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}

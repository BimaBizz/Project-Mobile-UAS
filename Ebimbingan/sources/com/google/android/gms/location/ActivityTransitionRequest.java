package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0426ClientIdentity;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0464SafeParcelableSerializer;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

@C0463SafeParcelable.Class(creator = "ActivityTransitionRequestCreator")
@C0463SafeParcelable.Reserved({1000})
public class ActivityTransitionRequest extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR;
    public static final Comparator<ActivityTransition> IS_SAME_TRANSITION;
    @C0463SafeParcelable.Field(getter = "getTag", id = 2)
    @Nullable
    private final String tag;
    @C0463SafeParcelable.Field(getter = "getActivityTransitions", id = 1)
    private final List<ActivityTransition> zzl;
    @C0463SafeParcelable.Field(getter = "getClients", id = 3)
    private final List<C0426ClientIdentity> zzm;

    static {
        Parcelable.Creator<ActivityTransitionRequest> creator;
        Comparator<ActivityTransition> comparator;
        new zzf();
        CREATOR = creator;
        new zze();
        IS_SAME_TRANSITION = comparator;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ActivityTransitionRequest(List<ActivityTransition> list) {
        this(list, (String) null, (List<C0426ClientIdentity>) null);
    }

    @C0463SafeParcelable.Constructor
    public ActivityTransitionRequest(@C0463SafeParcelable.Param(id = 1) List<ActivityTransition> list, @C0463SafeParcelable.Param(id = 2) @Nullable String str, @C0463SafeParcelable.Param(id = 3) @Nullable List<C0426ClientIdentity> list2) {
        TreeSet treeSet;
        List<ActivityTransition> list3 = list;
        String str2 = str;
        List<C0426ClientIdentity> list4 = list2;
        Object checkNotNull = C0446Preconditions.checkNotNull(list3, "transitions can't be null");
        C0446Preconditions.checkArgument(list3.size() > 0, "transitions can't be empty.");
        new TreeSet(IS_SAME_TRANSITION);
        TreeSet treeSet2 = treeSet;
        for (ActivityTransition next : list3) {
            C0446Preconditions.checkArgument(treeSet2.add(next), String.format("Found duplicated transition: %s.", new Object[]{next}));
        }
        this.zzl = Collections.unmodifiableList(list3);
        this.tag = str2;
        this.zzm = list4 == null ? Collections.emptyList() : Collections.unmodifiableList(list4);
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
            if (r3 == 0) goto L_0x0018
            r3 = r0
            java.lang.Class r3 = r3.getClass()
            r4 = r1
            java.lang.Class r4 = r4.getClass()
            if (r3 == r4) goto L_0x001b
        L_0x0018:
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x001b:
            r3 = r1
            com.google.android.gms.location.ActivityTransitionRequest r3 = (com.google.android.gms.location.ActivityTransitionRequest) r3
            r2 = r3
            r3 = r0
            java.util.List<com.google.android.gms.location.ActivityTransition> r3 = r3.zzl
            r4 = r2
            java.util.List<com.google.android.gms.location.ActivityTransition> r4 = r4.zzl
            boolean r3 = com.google.android.gms.common.internal.C0444Objects.equal(r3, r4)
            if (r3 == 0) goto L_0x0046
            r3 = r0
            java.lang.String r3 = r3.tag
            r4 = r2
            java.lang.String r4 = r4.tag
            boolean r3 = com.google.android.gms.common.internal.C0444Objects.equal(r3, r4)
            if (r3 == 0) goto L_0x0046
            r3 = r0
            java.util.List<com.google.android.gms.common.internal.ClientIdentity> r3 = r3.zzm
            r4 = r2
            java.util.List<com.google.android.gms.common.internal.ClientIdentity> r4 = r4.zzm
            boolean r3 = com.google.android.gms.common.internal.C0444Objects.equal(r3, r4)
            if (r3 == 0) goto L_0x0046
            r3 = 1
            r0 = r3
            goto L_0x0008
        L_0x0046:
            r3 = 0
            r0 = r3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityTransitionRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = this.zzl.hashCode();
        int i = hashCode;
        int hashCode2 = (hashCode * 31) + (this.tag != null ? this.tag.hashCode() : 0);
        int i2 = hashCode2;
        return (hashCode2 * 31) + (this.zzm != null ? this.zzm.hashCode() : 0);
    }

    public void serializeToIntentExtra(Intent intent) {
        C0464SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    public String toString() {
        StringBuilder sb;
        String valueOf = String.valueOf(this.zzl);
        String str = this.tag;
        String valueOf2 = String.valueOf(this.zzm);
        new StringBuilder(61 + String.valueOf(valueOf).length() + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        return sb.append("ActivityTransitionRequest [mTransitions=").append(valueOf).append(", mTag='").append(str).append('\'').append(", mClients=").append(valueOf2).append(']').toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeTypedList(parcel2, 1, this.zzl, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.tag, false);
        C0462SafeParcelWriter.writeTypedList(parcel2, 3, this.zzm, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}

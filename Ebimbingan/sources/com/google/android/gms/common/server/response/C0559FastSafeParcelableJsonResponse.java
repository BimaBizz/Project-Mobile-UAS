package com.google.android.gms.common.server.response;

import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.server.response.C0557FastJsonResponse;
import com.google.android.gms.common.util.C0617VisibleForTesting;

@C0452ShowFirstParty
@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0559FastSafeParcelableJsonResponse extends C0557FastJsonResponse implements C0463SafeParcelable {
    @C0206KeepForSdk
    public C0559FastSafeParcelableJsonResponse() {
    }

    public final int describeContents() {
        return 0;
    }

    @RecentlyNullable
    @C0617VisibleForTesting
    public Object getValueObject(@RecentlyNonNull String str) {
        String str2 = str;
        return null;
    }

    @C0206KeepForSdk
    public int hashCode() {
        int i = 0;
        for (C0557FastJsonResponse.Field next : getFieldMappings().values()) {
            if (isFieldSet(next)) {
                i = (i * 31) + C0446Preconditions.checkNotNull(getFieldValue(next)).hashCode();
            }
        }
        return i;
    }

    @C0617VisibleForTesting
    public boolean isPrimitiveFieldSet(@RecentlyNonNull String str) {
        String str2 = str;
        return false;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public byte[] toByteArray() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r4 = r1
            if (r4 != 0) goto L_0x0008
            r4 = 0
            r0 = r4
        L_0x0007:
            return r0
        L_0x0008:
            r4 = r0
            r5 = r1
            if (r4 != r5) goto L_0x000f
            r4 = 1
            r0 = r4
            goto L_0x0007
        L_0x000f:
            r4 = r0
            java.lang.Class r4 = r4.getClass()
            r5 = r1
            boolean r4 = r4.isInstance(r5)
            if (r4 != 0) goto L_0x001e
            r4 = 0
            r0 = r4
            goto L_0x0007
        L_0x001e:
            r4 = r1
            com.google.android.gms.common.server.response.FastJsonResponse r4 = (com.google.android.gms.common.server.response.C0557FastJsonResponse) r4
            r1 = r4
            r4 = r0
            java.util.Map r4 = r4.getFieldMappings()
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
            r2 = r4
        L_0x0030:
            r4 = r2
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L_0x0072
            r4 = r2
            java.lang.Object r4 = r4.next()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = (com.google.android.gms.common.server.response.C0557FastJsonResponse.Field) r4
            r3 = r4
            r4 = r0
            r5 = r3
            boolean r4 = r4.isFieldSet(r5)
            if (r4 == 0) goto L_0x0067
            r4 = r1
            r5 = r3
            boolean r4 = r4.isFieldSet(r5)
            if (r4 == 0) goto L_0x0064
            r4 = r0
            r5 = r3
            java.lang.Object r4 = r4.getFieldValue(r5)
            r5 = r1
            r6 = r3
            java.lang.Object r5 = r5.getFieldValue(r6)
            boolean r4 = com.google.android.gms.common.internal.C0444Objects.equal(r4, r5)
            if (r4 != 0) goto L_0x0030
            r4 = 0
            r0 = r4
            goto L_0x0007
        L_0x0064:
            r4 = 0
            r0 = r4
            goto L_0x0007
        L_0x0067:
            r4 = r1
            r5 = r3
            boolean r4 = r4.isFieldSet(r5)
            if (r4 == 0) goto L_0x0030
            r4 = 0
            r0 = r4
            goto L_0x0007
        L_0x0072:
            r4 = 1
            r0 = r4
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0559FastSafeParcelableJsonResponse.equals(java.lang.Object):boolean");
    }
}

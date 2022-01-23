package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "WebImageCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class WebImage extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<WebImage> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    @SafeParcelable.Field(getter = "getUrl", id = 2)
    private final Uri zab;
    @SafeParcelable.Field(getter = "getWidth", id = 3)
    private final int zac;
    @SafeParcelable.Field(getter = "getHeight", id = 4)
    private final int zad;

    static {
        Parcelable.Creator<WebImage> creator;
        new zah();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    WebImage(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Uri uri, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3) {
        this.zaa = i;
        this.zab = uri;
        this.zac = i2;
        this.zad = i3;
    }

    public int getHeight() {
        return this.zad;
    }

    @RecentlyNonNull
    public Uri getUrl() {
        return this.zab;
    }

    public int getWidth() {
        return this.zac;
    }

    public int hashCode() {
        return Objects.hashCode(this.zab, Integer.valueOf(this.zac), Integer.valueOf(this.zad));
    }

    @RecentlyNonNull
    @KeepForSdk
    public JSONObject toJson() {
        JSONObject jSONObject;
        new JSONObject();
        try {
            JSONObject put = jSONObject.put(ImagesContract.URL, this.zab.toString());
            JSONObject put2 = jSONObject.put("width", this.zac);
            JSONObject put3 = jSONObject.put("height", this.zad);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.zac), Integer.valueOf(this.zad), this.zab.toString()});
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel2, 2, getUrl(), i, false);
        SafeParcelWriter.writeInt(parcel2, 3, getWidth());
        SafeParcelWriter.writeInt(parcel2, 4, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebImage(@RecentlyNonNull Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WebImage(@androidx.annotation.RecentlyNonNull android.net.Uri r10, int r11, int r12) throws java.lang.IllegalArgumentException {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r0
            r5 = 1
            r6 = r1
            r7 = r2
            r8 = r3
            r4.<init>(r5, r6, r7, r8)
            r4 = r1
            if (r4 != 0) goto L_0x001b
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r0 = r4
            r4 = r0
            java.lang.String r5 = "url cannot be null"
            r4.<init>(r5)
            r4 = r0
            throw r4
        L_0x001b:
            r4 = r2
            if (r4 < 0) goto L_0x0021
            r4 = r3
            if (r4 >= 0) goto L_0x002d
        L_0x0021:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r0 = r4
            r4 = r0
            java.lang.String r5 = "width and height must not be negative"
            r4.<init>(r5)
            r4 = r0
            throw r4
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.<init>(android.net.Uri, int, int):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r0
            r3 = r1
            if (r2 != r3) goto L_0x0009
            r2 = 1
            r0 = r2
        L_0x0008:
            return r0
        L_0x0009:
            r2 = r1
            if (r2 == 0) goto L_0x0011
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.common.images.WebImage
            if (r2 != 0) goto L_0x0014
        L_0x0011:
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x0014:
            r2 = r1
            com.google.android.gms.common.images.WebImage r2 = (com.google.android.gms.common.images.WebImage) r2
            r1 = r2
            r2 = r0
            android.net.Uri r2 = r2.zab
            r3 = r1
            android.net.Uri r3 = r3.zab
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x0037
            r2 = r0
            int r2 = r2.zac
            r3 = r1
            int r3 = r3.zac
            if (r2 != r3) goto L_0x0037
            r2 = r0
            int r2 = r2.zad
            r3 = r1
            int r3 = r3.zad
            if (r2 != r3) goto L_0x0037
            r2 = 1
            r0 = r2
            goto L_0x0008
        L_0x0037:
            r2 = 0
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WebImage(@androidx.annotation.RecentlyNonNull org.json.JSONObject r11) throws java.lang.IllegalArgumentException {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            android.net.Uri r4 = android.net.Uri.EMPTY
            r2 = r4
            r4 = r1
            java.lang.String r5 = "url"
            boolean r4 = r4.has(r5)
            if (r4 == 0) goto L_0x001e
            r4 = r1
            java.lang.String r5 = "url"
            java.lang.String r4 = r4.getString(r5)     // Catch:{ JSONException -> 0x0036 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ JSONException -> 0x0036 }
            r3 = r4
            r4 = r3
            r2 = r4
        L_0x001e:
            r4 = r0
            r5 = r2
            r6 = r1
            java.lang.String r7 = "width"
            r8 = 0
            int r6 = r6.optInt(r7, r8)
            r7 = r1
            java.lang.String r8 = "height"
            r9 = 0
            int r7 = r7.optInt(r8, r9)
            r4.<init>(r5, r6, r7)
            return
        L_0x0036:
            r4 = move-exception
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.<init>(org.json.JSONObject):void");
    }
}

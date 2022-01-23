package com.google.android.gms.common.images;

import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i, int i2) {
        this.zaa = i;
        this.zab = i2;
    }

    @RecentlyNonNull
    public static Size parseSize(@RecentlyNonNull String str) throws NumberFormatException {
        Size size;
        Throwable th;
        String str2 = str;
        if (str2 == null) {
            new IllegalArgumentException("string must not be null");
            throw th;
        }
        int indexOf = str2.indexOf(42);
        if (indexOf < 0) {
            indexOf = str2.indexOf(120);
        }
        if (indexOf < 0) {
            throw zaa(str2);
        }
        try {
            new Size(Integer.parseInt(str2.substring(0, indexOf)), Integer.parseInt(str2.substring(indexOf + 1)));
            return size;
        } catch (NumberFormatException e) {
            throw zaa(str2);
        }
    }

    private static NumberFormatException zaa(String str) {
        Throwable th;
        StringBuilder sb;
        String str2 = str;
        new StringBuilder(str2.length() + 16);
        StringBuilder append = sb.append("Invalid Size: \"");
        StringBuilder append2 = sb.append(str2);
        StringBuilder append3 = sb.append("\"");
        new NumberFormatException(sb.toString());
        throw th;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i = this.zab;
        int i2 = this.zaa;
        return i ^ ((i2 << 16) | (i2 >>> 16));
    }

    @RecentlyNonNull
    public String toString() {
        StringBuilder sb;
        int i = this.zaa;
        int i2 = this.zab;
        new StringBuilder(23);
        StringBuilder append = sb.append(i);
        StringBuilder append2 = sb.append("x");
        StringBuilder append3 = sb.append(i2);
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r1
            if (r2 != 0) goto L_0x0008
            r2 = 0
            r0 = r2
        L_0x0007:
            return r0
        L_0x0008:
            r2 = r0
            r3 = r1
            if (r2 != r3) goto L_0x000f
            r2 = 1
            r0 = r2
            goto L_0x0007
        L_0x000f:
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.common.images.Size
            if (r2 == 0) goto L_0x002e
            r2 = r1
            com.google.android.gms.common.images.Size r2 = (com.google.android.gms.common.images.Size) r2
            r1 = r2
            r2 = r0
            int r2 = r2.zaa
            r3 = r1
            int r3 = r3.zaa
            if (r2 != r3) goto L_0x002b
            r2 = r0
            int r2 = r2.zab
            r3 = r1
            int r3 = r3.zab
            if (r2 != r3) goto L_0x002b
            r2 = 1
            r0 = r2
            goto L_0x0007
        L_0x002b:
            r2 = 0
            r0 = r2
            goto L_0x0007
        L_0x002e:
            r2 = 0
            r0 = r2
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.Size.equals(java.lang.Object):boolean");
    }
}

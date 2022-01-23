package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.annotation.C0209KeepName;
import com.google.android.gms.common.internal.C0423Asserts;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@C0209KeepName
@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
/* renamed from: com.google.android.gms.common.data.DataHolder */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0400DataHolder extends C0460AbstractSafeParcelable implements Closeable {
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final Parcelable.Creator<C0400DataHolder> CREATOR;
    private static final Builder zak;
    @C0463SafeParcelable.VersionField(id = 1000)
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    @C0463SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zaf;
    @C0463SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zag;
    @C0463SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zah;
    @C0463SafeParcelable.Field(getter = "getMetadata", id = 4)
    @Nullable
    private final Bundle zai;
    private boolean zaj;

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.data.DataHolder$Builder */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class Builder {
        /* access modifiers changed from: private */
        public final String[] zaa;
        /* access modifiers changed from: private */
        public final ArrayList<HashMap<String, Object>> zab;
        private final HashMap<Object, Integer> zac;

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* synthetic */ Builder(java.lang.String[] r7, java.lang.String r8, com.google.android.gms.common.data.C0406zab r9) {
            /*
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r0
                r4.<init>()
                r4 = r0
                r5 = r1
                java.lang.Object r5 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r5)
                java.lang.String[] r5 = (java.lang.String[]) r5
                r4.zaa = r5
                java.util.ArrayList r4 = new java.util.ArrayList
                r1 = r4
                r4 = r1
                r4.<init>()
                r4 = r0
                r5 = r1
                r4.zab = r5
                java.util.HashMap r4 = new java.util.HashMap
                r1 = r4
                r4 = r1
                r4.<init>()
                r4 = r0
                r5 = r1
                r4.zac = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.C0400DataHolder.Builder.<init>(java.lang.String[], java.lang.String, com.google.android.gms.common.data.zab):void");
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public C0400DataHolder build(int i) {
            C0400DataHolder dataHolder;
            new C0400DataHolder(this, i, (Bundle) null, (C0406zab) null);
            return dataHolder;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder withRow(@RecentlyNonNull ContentValues contentValues) {
            HashMap hashMap;
            ContentValues contentValues2 = contentValues;
            C0423Asserts.checkNotNull(contentValues2);
            new HashMap(contentValues2.size());
            for (Map.Entry next : contentValues2.valueSet()) {
                Object put = hashMap.put((String) next.getKey(), next.getValue());
            }
            return zaa(hashMap);
        }

        @RecentlyNonNull
        public Builder zaa(@RecentlyNonNull HashMap<String, Object> hashMap) {
            HashMap<String, Object> hashMap2 = hashMap;
            C0423Asserts.checkNotNull(hashMap2);
            boolean add = this.zab.add(hashMap2);
            return this;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public C0400DataHolder build(int i, @RecentlyNonNull Bundle bundle) {
            C0400DataHolder dataHolder;
            new C0400DataHolder(this, i, bundle, -1, (C0406zab) null);
            return dataHolder;
        }
    }

    static {
        Parcelable.Creator<C0400DataHolder> creator;
        Builder builder;
        new C0408zad();
        CREATOR = creator;
        new C0406zab(new String[0], (String) null);
        zak = builder;
    }

    @C0463SafeParcelable.Constructor
    C0400DataHolder(@C0463SafeParcelable.Param(id = 1000) int i, @C0463SafeParcelable.Param(id = 1) String[] strArr, @C0463SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @C0463SafeParcelable.Param(id = 3) int i2, @C0463SafeParcelable.Param(id = 4) @Nullable Bundle bundle) {
        this.zae = false;
        this.zaj = true;
        this.zaa = i;
        this.zaf = strArr;
        this.zag = cursorWindowArr;
        this.zah = i2;
        this.zai = bundle;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* synthetic */ C0400DataHolder(com.google.android.gms.common.data.C0400DataHolder.Builder r12, int r13, android.os.Bundle r14, int r15, com.google.android.gms.common.data.C0406zab r16) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r0
            r7 = r1
            java.lang.String[] r7 = r7.zaa
            r8 = r1
            r9 = -1
            android.database.CursorWindow[] r8 = zae(r8, r9)
            r9 = r2
            r10 = r3
            r6.<init>((java.lang.String[]) r7, (android.database.CursorWindow[]) r8, (int) r9, (android.os.Bundle) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.C0400DataHolder.<init>(com.google.android.gms.common.data.DataHolder$Builder, int, android.os.Bundle, int, com.google.android.gms.common.data.zab):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0400DataHolder(Builder builder, int i, Bundle bundle, C0406zab zab2) {
        this(builder, i, (Bundle) null);
        Bundle bundle2 = bundle;
        C0406zab zab3 = zab2;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static Builder builder(@RecentlyNonNull String[] strArr) {
        Builder builder;
        new Builder(strArr, (String) null, (C0406zab) null);
        return builder;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0400DataHolder empty(int i) {
        C0400DataHolder dataHolder;
        new C0400DataHolder(zak, i, (Bundle) null);
        return dataHolder;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v63, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v66, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v67, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v125, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v127, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v129, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v136, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v139, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v141, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v143, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v145, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v159, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v160, resolved type: android.database.CursorWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v164, resolved type: android.database.CursorWindow} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.database.CursorWindow[] zae(com.google.android.gms.common.data.C0400DataHolder.Builder r18, int r19) {
        /*
            r1 = r18
            r2 = r19
            r13 = r1
            java.lang.String[] r13 = r13.zaa
            int r13 = r13.length
            if (r13 != 0) goto L_0x0011
            r13 = 0
            android.database.CursorWindow[] r13 = new android.database.CursorWindow[r13]
            r1 = r13
        L_0x0010:
            return r1
        L_0x0011:
            r13 = r1
            java.util.ArrayList r13 = r13.zab
            r9 = r13
            r13 = r9
            int r13 = r13.size()
            r10 = r13
            android.database.CursorWindow r13 = new android.database.CursorWindow
            r2 = r13
            r13 = r2
            r14 = 0
            r13.<init>(r14)
            java.util.ArrayList r13 = new java.util.ArrayList
            r11 = r13
            r13 = r11
            r13.<init>()
            r13 = r11
            r14 = r2
            boolean r13 = r13.add(r14)
            r13 = r2
            r14 = r1
            java.lang.String[] r14 = r14.zaa
            int r14 = r14.length
            boolean r13 = r13.setNumColumns(r14)
            r13 = 0
            r3 = r13
            r13 = 0
            r4 = r13
        L_0x0041:
            r13 = r4
            r14 = r10
            if (r13 >= r14) goto L_0x0243
            r13 = r2
            boolean r13 = r13.allocRow()     // Catch:{ RuntimeException -> 0x01c4 }
            r5 = r13
            r13 = r5
            if (r13 != 0) goto L_0x00c3
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01c4 }
            r2 = r13
            r13 = r2
            r14 = 72
            r13.<init>(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r2
            java.lang.String r14 = "Allocating additional cursor window for large data set (row "
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r2
            r14 = r4
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r2
            java.lang.String r14 = ")"
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            java.lang.String r13 = "DataHolder"
            r14 = r2
            java.lang.String r14 = r14.toString()     // Catch:{ RuntimeException -> 0x01c4 }
            int r13 = android.util.Log.d(r13, r14)     // Catch:{ RuntimeException -> 0x01c4 }
            android.database.CursorWindow r13 = new android.database.CursorWindow     // Catch:{ RuntimeException -> 0x01c4 }
            r2 = r13
            r13 = r2
            r14 = 0
            r13.<init>(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r2
            r14 = r4
            r13.setStartPosition(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r2
            r14 = r1
            java.lang.String[] r14 = r14.zaa     // Catch:{ RuntimeException -> 0x01c4 }
            int r14 = r14.length     // Catch:{ RuntimeException -> 0x01c4 }
            boolean r13 = r13.setNumColumns(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r11
            r14 = r2
            boolean r13 = r13.add(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r2
            boolean r13 = r13.allocRow()     // Catch:{ RuntimeException -> 0x01c4 }
            r5 = r13
            r13 = r5
            if (r13 != 0) goto L_0x00c3
            java.lang.String r13 = "DataHolder"
            java.lang.String r14 = "Unable to allocate row to hold data."
            int r13 = android.util.Log.e(r13, r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r11
            r14 = r2
            boolean r13 = r13.remove(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r11
            r14 = r11
            int r14 = r14.size()     // Catch:{ RuntimeException -> 0x01c4 }
            android.database.CursorWindow[] r14 = new android.database.CursorWindow[r14]     // Catch:{ RuntimeException -> 0x01c4 }
            java.lang.Object[] r13 = r13.toArray(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            android.database.CursorWindow[] r13 = (android.database.CursorWindow[]) r13     // Catch:{ RuntimeException -> 0x01c4 }
            r1 = r13
            r13 = r1
            r1 = r13
            goto L_0x0010
        L_0x00c3:
            r13 = r9
            r14 = r4
            java.lang.Object r13 = r13.get(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ RuntimeException -> 0x01c4 }
            r12 = r13
            r13 = 1
            r5 = r13
            r13 = 0
            r6 = r13
        L_0x00d0:
            r13 = r1
            java.lang.String[] r13 = r13.zaa     // Catch:{ RuntimeException -> 0x01c4 }
            int r13 = r13.length     // Catch:{ RuntimeException -> 0x01c4 }
            r7 = r13
            r13 = r6
            r14 = r7
            if (r13 >= r14) goto L_0x023b
            r13 = r5
            if (r13 == 0) goto L_0x01b3
            r13 = r1
            java.lang.String[] r13 = r13.zaa     // Catch:{ RuntimeException -> 0x01c4 }
            r14 = r6
            r13 = r13[r14]     // Catch:{ RuntimeException -> 0x01c4 }
            r5 = r13
            r13 = r12
            r14 = r5
            java.lang.Object r13 = r13.get(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r7 = r13
            r13 = r7
            if (r13 != 0) goto L_0x00fc
            r13 = r2
            r14 = r4
            r15 = r6
            boolean r13 = r13.putNull(r14, r15)     // Catch:{ RuntimeException -> 0x01c4 }
            r5 = r13
        L_0x00f9:
            int r6 = r6 + 1
            goto L_0x00d0
        L_0x00fc:
            r13 = r7
            boolean r13 = r13 instanceof java.lang.String     // Catch:{ RuntimeException -> 0x01c4 }
            r8 = r13
            r13 = r8
            if (r13 == 0) goto L_0x0110
            r13 = r2
            r14 = r7
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ RuntimeException -> 0x01c4 }
            r15 = r4
            r16 = r6
            boolean r13 = r13.putString(r14, r15, r16)     // Catch:{ RuntimeException -> 0x01c4 }
            r5 = r13
            goto L_0x00f9
        L_0x0110:
            r13 = r7
            boolean r13 = r13 instanceof java.lang.Long     // Catch:{ RuntimeException -> 0x01c4 }
            r8 = r13
            r13 = r8
            if (r13 == 0) goto L_0x0129
            r13 = r2
            r14 = r7
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ RuntimeException -> 0x01c4 }
            long r14 = r14.longValue()     // Catch:{ RuntimeException -> 0x01c4 }
            r16 = r4
            r17 = r6
            boolean r13 = r13.putLong(r14, r16, r17)     // Catch:{ RuntimeException -> 0x01c4 }
            r5 = r13
            goto L_0x00f9
        L_0x0129:
            r13 = r7
            boolean r13 = r13 instanceof java.lang.Integer     // Catch:{ RuntimeException -> 0x01c4 }
            r8 = r13
            r13 = r8
            if (r13 == 0) goto L_0x0143
            r13 = r2
            r14 = r7
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ RuntimeException -> 0x01c4 }
            int r14 = r14.intValue()     // Catch:{ RuntimeException -> 0x01c4 }
            long r14 = (long) r14     // Catch:{ RuntimeException -> 0x01c4 }
            r16 = r4
            r17 = r6
            boolean r13 = r13.putLong(r14, r16, r17)     // Catch:{ RuntimeException -> 0x01c4 }
            r5 = r13
            goto L_0x00f9
        L_0x0143:
            r13 = r7
            boolean r13 = r13 instanceof java.lang.Boolean     // Catch:{ RuntimeException -> 0x01c4 }
            r8 = r13
            r13 = r8
            if (r13 == 0) goto L_0x0169
            r13 = r7
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ RuntimeException -> 0x01c4 }
            boolean r13 = r13.booleanValue()     // Catch:{ RuntimeException -> 0x01c4 }
            r5 = r13
            r13 = 1
            r14 = r5
            if (r13 == r14) goto L_0x0165
            r13 = 0
            r7 = r13
        L_0x0159:
            r13 = r2
            r14 = r7
            r16 = r4
            r17 = r6
            boolean r13 = r13.putLong(r14, r16, r17)     // Catch:{ RuntimeException -> 0x01c4 }
            r5 = r13
            goto L_0x00f9
        L_0x0165:
            r13 = 1
            r7 = r13
            goto L_0x0159
        L_0x0169:
            r13 = r7
            boolean r13 = r13 instanceof byte[]     // Catch:{ RuntimeException -> 0x01c4 }
            r8 = r13
            r13 = r8
            if (r13 == 0) goto L_0x017e
            r13 = r2
            r14 = r7
            byte[] r14 = (byte[]) r14     // Catch:{ RuntimeException -> 0x01c4 }
            r15 = r4
            r16 = r6
            boolean r13 = r13.putBlob(r14, r15, r16)     // Catch:{ RuntimeException -> 0x01c4 }
            r5 = r13
            goto L_0x00f9
        L_0x017e:
            r13 = r7
            boolean r13 = r13 instanceof java.lang.Double     // Catch:{ RuntimeException -> 0x01c4 }
            r8 = r13
            r13 = r8
            if (r13 == 0) goto L_0x0198
            r13 = r2
            r14 = r7
            java.lang.Double r14 = (java.lang.Double) r14     // Catch:{ RuntimeException -> 0x01c4 }
            double r14 = r14.doubleValue()     // Catch:{ RuntimeException -> 0x01c4 }
            r16 = r4
            r17 = r6
            boolean r13 = r13.putDouble(r14, r16, r17)     // Catch:{ RuntimeException -> 0x01c4 }
            r5 = r13
            goto L_0x00f9
        L_0x0198:
            r13 = r7
            boolean r13 = r13 instanceof java.lang.Float     // Catch:{ RuntimeException -> 0x01c4 }
            r8 = r13
            r13 = r8
            if (r13 == 0) goto L_0x0254
            r13 = r2
            r14 = r7
            java.lang.Float r14 = (java.lang.Float) r14     // Catch:{ RuntimeException -> 0x01c4 }
            float r14 = r14.floatValue()     // Catch:{ RuntimeException -> 0x01c4 }
            double r14 = (double) r14     // Catch:{ RuntimeException -> 0x01c4 }
            r16 = r4
            r17 = r6
            boolean r13 = r13.putDouble(r14, r16, r17)     // Catch:{ RuntimeException -> 0x01c4 }
            r5 = r13
            goto L_0x00f9
        L_0x01b3:
            r13 = r3
            if (r13 == 0) goto L_0x01e0
            java.lang.String r13 = "Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle."
            r1 = r13
            com.google.android.gms.common.data.zac r13 = new com.google.android.gms.common.data.zac     // Catch:{ RuntimeException -> 0x01c4 }
            r2 = r13
            r13 = r2
            r14 = r1
            r13.<init>(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r2
            throw r13     // Catch:{ RuntimeException -> 0x01c4 }
        L_0x01c4:
            r13 = move-exception
            r2 = r13
            r13 = r11
            int r13 = r13.size()
            r3 = r13
            r13 = 0
            r1 = r13
        L_0x01ce:
            r13 = r1
            r14 = r3
            if (r13 >= r14) goto L_0x02a6
            r13 = r11
            r14 = r1
            java.lang.Object r13 = r13.get(r14)
            android.database.CursorWindow r13 = (android.database.CursorWindow) r13
            r13.close()
            int r1 = r1 + 1
            goto L_0x01ce
        L_0x01e0:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01c4 }
            r3 = r13
            r13 = r3
            r14 = 74
            r13.<init>(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r3
            java.lang.String r14 = "Couldn't populate window data for row "
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r3
            r14 = r4
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r3
            java.lang.String r14 = " - allocating new window."
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            java.lang.String r13 = "DataHolder"
            r14 = r3
            java.lang.String r14 = r14.toString()     // Catch:{ RuntimeException -> 0x01c4 }
            int r13 = android.util.Log.d(r13, r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r2
            r13.freeLastRow()     // Catch:{ RuntimeException -> 0x01c4 }
            android.database.CursorWindow r13 = new android.database.CursorWindow     // Catch:{ RuntimeException -> 0x01c4 }
            r2 = r13
            r13 = r2
            r14 = 0
            r13.<init>(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r2
            r14 = r4
            r13.setStartPosition(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r2
            r14 = r1
            java.lang.String[] r14 = r14.zaa     // Catch:{ RuntimeException -> 0x01c4 }
            int r14 = r14.length     // Catch:{ RuntimeException -> 0x01c4 }
            boolean r13 = r13.setNumColumns(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r11
            r14 = r2
            boolean r13 = r13.add(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r4
            r14 = -1
            int r13 = r13 + -1
            r5 = r13
            r13 = 1
            r3 = r13
        L_0x0234:
            r13 = r5
            r14 = 1
            int r13 = r13 + 1
            r4 = r13
            goto L_0x0041
        L_0x023b:
            r13 = r5
            if (r13 == 0) goto L_0x01b3
            r13 = 0
            r3 = r13
            r13 = r4
            r5 = r13
            goto L_0x0234
        L_0x0243:
            r13 = r11
            r14 = r11
            int r14 = r14.size()
            android.database.CursorWindow[] r14 = new android.database.CursorWindow[r14]
            java.lang.Object[] r13 = r13.toArray(r14)
            android.database.CursorWindow[] r13 = (android.database.CursorWindow[]) r13
            r1 = r13
            goto L_0x0010
        L_0x0254:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x01c4 }
            r1 = r13
            r13 = r7
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ RuntimeException -> 0x01c4 }
            r2 = r13
            r13 = r5
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ RuntimeException -> 0x01c4 }
            int r13 = r13.length()     // Catch:{ RuntimeException -> 0x01c4 }
            r3 = r13
            int r3 = r3 + 32
            r13 = r2
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ RuntimeException -> 0x01c4 }
            int r13 = r13.length()     // Catch:{ RuntimeException -> 0x01c4 }
            r4 = r13
            r13 = r3
            r14 = r4
            int r13 = r13 + r14
            r3 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01c4 }
            r4 = r13
            r13 = r4
            r14 = r3
            r13.<init>(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r4
            java.lang.String r14 = "Unsupported object for column "
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r4
            r14 = r5
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r4
            java.lang.String r14 = ": "
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r4
            r14 = r2
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r1
            r14 = r4
            java.lang.String r14 = r14.toString()     // Catch:{ RuntimeException -> 0x01c4 }
            r13.<init>(r14)     // Catch:{ RuntimeException -> 0x01c4 }
            r13 = r1
            throw r13     // Catch:{ RuntimeException -> 0x01c4 }
        L_0x02a6:
            r13 = r2
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.C0400DataHolder.zae(com.google.android.gms.common.data.DataHolder$Builder, int):android.database.CursorWindow[]");
    }

    private final void zaf(String str, int i) {
        String str2;
        IllegalArgumentException illegalArgumentException;
        Throwable th;
        Throwable th2;
        String str3 = str;
        int i2 = i;
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str3)) {
            String valueOf = String.valueOf(str3);
            String str4 = "No such column: ";
            if (valueOf.length() != 0) {
                str2 = str4.concat(valueOf);
            } else {
                new String(str4);
            }
            illegalArgumentException = new IllegalArgumentException(str2);
            throw r2;
        } else if (isClosed()) {
            new IllegalArgumentException("Buffer is closed.");
            throw th2;
        } else if (i2 < 0 || i2 >= this.zad) {
            new CursorIndexOutOfBoundsException(i2, this.zad);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @C0206KeepForSdk
    public void close() {
        synchronized (this) {
            try {
                if (!this.zae) {
                    this.zae = true;
                    int i = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zag;
                        if (i >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        StringBuilder sb;
        try {
            if (this.zaj && this.zag.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                new StringBuilder(String.valueOf(obj).length() + 178);
                StringBuilder append = sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                StringBuilder append2 = sb.append(obj);
                StringBuilder append3 = sb.append(")");
                int e = Log.e("DataBuffer", sb.toString());
            }
            super.finalize();
        } catch (Throwable th) {
            Throwable th2 = th;
            super.finalize();
            throw th2;
        }
    }

    @C0206KeepForSdk
    public boolean getBoolean(@RecentlyNonNull String str, int i, int i2) {
        String str2 = str;
        int i3 = i;
        zaf(str2, i3);
        return Long.valueOf(this.zag[i2].getLong(i3, this.zab.getInt(str2))).longValue() == 1;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public byte[] getByteArray(@RecentlyNonNull String str, int i, int i2) {
        String str2 = str;
        int i3 = i;
        zaf(str2, i3);
        return this.zag[i2].getBlob(i3, this.zab.getInt(str2));
    }

    @C0206KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @C0206KeepForSdk
    public int getInteger(@RecentlyNonNull String str, int i, int i2) {
        String str2 = str;
        int i3 = i;
        zaf(str2, i3);
        return this.zag[i2].getInt(i3, this.zab.getInt(str2));
    }

    @C0206KeepForSdk
    public long getLong(@RecentlyNonNull String str, int i, int i2) {
        String str2 = str;
        int i3 = i;
        zaf(str2, i3);
        return this.zag[i2].getLong(i3, this.zab.getInt(str2));
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public Bundle getMetadata() {
        return this.zai;
    }

    @C0206KeepForSdk
    public int getStatusCode() {
        return this.zah;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public String getString(@RecentlyNonNull String str, int i, int i2) {
        String str2 = str;
        int i3 = i;
        zaf(str2, i3);
        return this.zag[i2].getString(i3, this.zab.getInt(str2));
    }

    @C0206KeepForSdk
    public int getWindowIndex(int i) {
        boolean z;
        int length;
        int i2;
        int i3 = i;
        if (i3 >= 0) {
            z = i3 < this.zad;
        } else {
            z = false;
        }
        C0446Preconditions.checkState(z);
        int i4 = 0;
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i4 >= length) {
                i2 = i4;
                break;
            } else if (i3 < iArr[i4]) {
                i2 = i4 - 1;
                break;
            } else {
                i4++;
            }
        }
        return i2 == length ? i2 - 1 : i2;
    }

    @C0206KeepForSdk
    public boolean hasColumn(@RecentlyNonNull String str) {
        return this.zab.containsKey(str);
    }

    @C0206KeepForSdk
    public boolean hasNull(@RecentlyNonNull String str, int i, int i2) {
        String str2 = str;
        int i3 = i;
        zaf(str2, i3);
        return this.zag[i2].isNull(i3, this.zab.getInt(str2));
    }

    @C0206KeepForSdk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            try {
                z = this.zae;
            } catch (Throwable th) {
                Throwable th2 = th;
                throw th2;
            }
        }
        return z;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeStringArray(parcel2, 1, this.zaf, false);
        C0462SafeParcelWriter.writeTypedArray(parcel2, 2, this.zag, i2, false);
        C0462SafeParcelWriter.writeInt(parcel2, 3, getStatusCode());
        C0462SafeParcelWriter.writeBundle(parcel2, 4, getMetadata(), false);
        C0462SafeParcelWriter.writeInt(parcel2, 1000, this.zaa);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
        if ((i2 & 1) != 0) {
            close();
        }
    }

    public final void zaa() {
        Bundle bundle;
        new Bundle();
        this.zab = bundle;
        int i = 0;
        while (true) {
            String[] strArr = this.zaf;
            if (i >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i], i);
            i++;
        }
        this.zac = new int[this.zag.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zag;
            if (i3 < cursorWindowArr.length) {
                this.zac[i3] = i2;
                i2 += this.zag[i3].getNumRows() - (i2 - cursorWindowArr[i3].getStartPosition());
                i3++;
            } else {
                this.zad = i2;
                return;
            }
        }
    }

    public final float zab(@RecentlyNonNull String str, int i, int i2) {
        String str2 = str;
        int i3 = i;
        zaf(str2, i3);
        return this.zag[i2].getFloat(i3, this.zab.getInt(str2));
    }

    public final double zac(@RecentlyNonNull String str, int i, int i2) {
        String str2 = str;
        int i3 = i;
        zaf(str2, i3);
        return this.zag[i2].getDouble(i3, this.zab.getInt(str2));
    }

    public final void zad(@RecentlyNonNull String str, int i, int i2, @RecentlyNonNull CharArrayBuffer charArrayBuffer) {
        String str2 = str;
        int i3 = i;
        zaf(str2, i3);
        this.zag[i2].copyStringToBuffer(i3, this.zab.getInt(str2), charArrayBuffer);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0400DataHolder(@androidx.annotation.RecentlyNonNull android.database.Cursor r15, int r16, @androidx.annotation.Nullable android.os.Bundle r17) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            com.google.android.gms.common.sqlite.CursorWrapper r9 = new com.google.android.gms.common.sqlite.CursorWrapper
            r4 = r9
            r9 = r4
            r10 = r1
            r9.<init>(r10)
            r9 = r4
            java.lang.String[] r9 = r9.getColumnNames()
            r5 = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r6 = r9
            r9 = r6
            r9.<init>()
            r9 = r4
            int r9 = r9.getCount()     // Catch:{ all -> 0x00bd }
            r7 = r9
            r9 = r4
            android.database.CursorWindow r9 = r9.getWindow()     // Catch:{ all -> 0x00bd }
            r1 = r9
            r9 = r1
            if (r9 == 0) goto L_0x00c5
            r9 = r1
            int r9 = r9.getStartPosition()     // Catch:{ all -> 0x00bd }
            r8 = r9
            r9 = r8
            if (r9 != 0) goto L_0x00ba
            r9 = r1
            r9.acquireReference()     // Catch:{ all -> 0x00bd }
            r9 = r4
            r10 = 0
            r9.setWindow(r10)     // Catch:{ all -> 0x00bd }
            r9 = r6
            r10 = r1
            boolean r9 = r9.add(r10)     // Catch:{ all -> 0x00bd }
            r9 = r1
            int r9 = r9.getNumRows()     // Catch:{ all -> 0x00bd }
            r1 = r9
        L_0x0048:
            r9 = r1
            r10 = r7
            if (r9 >= r10) goto L_0x0073
            r9 = r4
            r10 = r1
            boolean r9 = r9.moveToPosition(r10)     // Catch:{ all -> 0x00bd }
            r8 = r9
            r9 = r8
            if (r9 == 0) goto L_0x0073
            r9 = r4
            android.database.CursorWindow r9 = r9.getWindow()     // Catch:{ all -> 0x00bd }
            r8 = r9
            r9 = r8
            if (r9 == 0) goto L_0x00a4
            r9 = r8
            r9.acquireReference()     // Catch:{ all -> 0x00bd }
            r9 = r4
            r10 = 0
            r9.setWindow(r10)     // Catch:{ all -> 0x00bd }
            r9 = r8
            r1 = r9
        L_0x006a:
            r9 = r1
            int r9 = r9.getNumRows()     // Catch:{ all -> 0x00bd }
            r8 = r9
            r9 = r8
            if (r9 != 0) goto L_0x008d
        L_0x0073:
            r9 = r4
            r9.close()
            r9 = r0
            r10 = r5
            r11 = r6
            r12 = r6
            int r12 = r12.size()
            android.database.CursorWindow[] r12 = new android.database.CursorWindow[r12]
            java.lang.Object[] r11 = r11.toArray(r12)
            android.database.CursorWindow[] r11 = (android.database.CursorWindow[]) r11
            r12 = r2
            r13 = r3
            r9.<init>((java.lang.String[]) r10, (android.database.CursorWindow[]) r11, (int) r12, (android.os.Bundle) r13)
            return
        L_0x008d:
            r9 = r6
            r10 = r1
            boolean r9 = r9.add(r10)     // Catch:{ all -> 0x00bd }
            r9 = r1
            int r9 = r9.getStartPosition()     // Catch:{ all -> 0x00bd }
            r8 = r9
            r9 = r1
            int r9 = r9.getNumRows()     // Catch:{ all -> 0x00bd }
            r1 = r9
            r9 = r8
            r10 = r1
            int r9 = r9 + r10
            r1 = r9
            goto L_0x0048
        L_0x00a4:
            android.database.CursorWindow r9 = new android.database.CursorWindow     // Catch:{ all -> 0x00bd }
            r8 = r9
            r9 = r8
            r10 = 0
            r9.<init>(r10)     // Catch:{ all -> 0x00bd }
            r9 = r8
            r10 = r1
            r9.setStartPosition(r10)     // Catch:{ all -> 0x00bd }
            r9 = r4
            r10 = r1
            r11 = r8
            r9.fillWindow(r10, r11)     // Catch:{ all -> 0x00bd }
            r9 = r8
            r1 = r9
            goto L_0x006a
        L_0x00ba:
            r9 = 0
            r1 = r9
            goto L_0x0048
        L_0x00bd:
            r9 = move-exception
            r0 = r9
            r9 = r4
            r9.close()
            r9 = r0
            throw r9
        L_0x00c5:
            r9 = 0
            r1 = r9
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.C0400DataHolder.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0400DataHolder(com.google.android.gms.common.data.C0400DataHolder.Builder r10, int r11, @androidx.annotation.Nullable android.os.Bundle r12) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r0
            r5 = r1
            java.lang.String[] r5 = r5.zaa
            r6 = r1
            r7 = -1
            android.database.CursorWindow[] r6 = zae(r6, r7)
            r7 = r2
            r8 = 0
            r4.<init>((java.lang.String[]) r5, (android.database.CursorWindow[]) r6, (int) r7, (android.os.Bundle) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.C0400DataHolder.<init>(com.google.android.gms.common.data.DataHolder$Builder, int, android.os.Bundle):void");
    }

    @C0206KeepForSdk
    public C0400DataHolder(@RecentlyNonNull String[] strArr, @RecentlyNonNull CursorWindow[] cursorWindowArr, int i, @Nullable Bundle bundle) {
        this.zae = false;
        this.zaj = true;
        this.zaa = 1;
        this.zaf = (String[]) C0446Preconditions.checkNotNull(strArr);
        this.zag = (CursorWindow[]) C0446Preconditions.checkNotNull(cursorWindowArr);
        this.zah = i;
        this.zai = bundle;
        zaa();
    }
}

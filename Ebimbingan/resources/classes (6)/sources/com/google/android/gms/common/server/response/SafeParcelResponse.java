package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @RecentlyNonNull
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR;
    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getParcel", id = 2)
    private final Parcel zab;
    private final int zac;
    @SafeParcelable.Field(getter = "getFieldMappingDictionary", id = 3)
    private final zan zad;
    @Nullable
    private final String zae;
    private int zaf;
    private int zag;

    static {
        Parcelable.Creator<SafeParcelResponse> creator;
        new zaq();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    SafeParcelResponse(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Parcel parcel, @SafeParcelable.Param(id = 3) zan zan) {
        this.zaa = i;
        this.zab = (Parcel) Preconditions.checkNotNull(parcel);
        this.zac = 2;
        this.zad = zan;
        zan zan2 = this.zad;
        if (zan2 == null) {
            this.zae = null;
        } else {
            this.zae = zan2.zaf();
        }
        this.zaf = 2;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(@RecentlyNonNull T t) {
        zan zan;
        SafeParcelResponse safeParcelResponse;
        T t2 = t;
        String str = (String) Preconditions.checkNotNull(t2.getClass().getCanonicalName());
        new zan(t2.getClass());
        zaF(zan, t2);
        zan.zab();
        zan.zaa();
        new SafeParcelResponse((SafeParcelable) t2, zan, str);
        return safeParcelResponse;
    }

    private static void zaF(zan zan, FastJsonResponse fastJsonResponse) {
        String str;
        IllegalStateException illegalStateException;
        String str2;
        IllegalStateException illegalStateException2;
        zan zan2 = zan;
        FastJsonResponse fastJsonResponse2 = fastJsonResponse;
        Class<?> cls = fastJsonResponse2.getClass();
        if (!zan2.zae(cls)) {
            Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse2.getFieldMappings();
            zan2.zac(cls, fieldMappings);
            for (String str3 : fieldMappings.keySet()) {
                FastJsonResponse.Field field = fieldMappings.get(str3);
                Class<? extends FastJsonResponse> cls2 = field.zag;
                if (cls2 != null) {
                    try {
                        zaF(zan2, (FastJsonResponse) cls2.newInstance());
                    } catch (InstantiationException e) {
                        InstantiationException instantiationException = e;
                        String valueOf = String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName());
                        String str4 = "Could not instantiate an object of type ";
                        if (valueOf.length() != 0) {
                            str2 = str4.concat(valueOf);
                        } else {
                            new String(str4);
                        }
                        illegalStateException2 = new IllegalStateException(str2, instantiationException);
                        throw r2;
                    } catch (IllegalAccessException e2) {
                        IllegalAccessException illegalAccessException = e2;
                        String valueOf2 = String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName());
                        String str5 = "Could not access object of type ";
                        if (valueOf2.length() != 0) {
                            str = str5.concat(valueOf2);
                        } else {
                            new String(str5);
                        }
                        illegalStateException = new IllegalStateException(str, illegalAccessException);
                        throw r2;
                    }
                }
            }
        }
    }

    private final void zaH(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray;
        Throwable th;
        StringBuilder sb2;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        Throwable th6;
        StringBuilder sb3;
        HashMap hashMap;
        StringBuilder sb4 = sb;
        Parcel parcel2 = parcel;
        new SparseArray();
        for (Map.Entry next : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) next.getValue()).getSafeParcelableFieldId(), next);
        }
        StringBuilder append = sb4.append('{');
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        boolean z = false;
        while (parcel2.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel2);
            Map.Entry entry = (Map.Entry) sparseArray.get(SafeParcelReader.getFieldId(readHeader));
            if (entry != null) {
                if (z) {
                    StringBuilder append2 = sb4.append(",");
                }
                String str = (String) entry.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry.getValue();
                StringBuilder append3 = sb4.append("\"");
                StringBuilder append4 = sb4.append(str);
                StringBuilder append5 = sb4.append("\":");
                if (field.zac()) {
                    int i = field.zac;
                    switch (i) {
                        case 0:
                            zaJ(sb4, field, zaD(field, Integer.valueOf(SafeParcelReader.readInt(parcel2, readHeader))));
                            z = true;
                            break;
                        case 1:
                            zaJ(sb4, field, zaD(field, SafeParcelReader.createBigInteger(parcel2, readHeader)));
                            z = true;
                            break;
                        case 2:
                            zaJ(sb4, field, zaD(field, Long.valueOf(SafeParcelReader.readLong(parcel2, readHeader))));
                            z = true;
                            break;
                        case 3:
                            zaJ(sb4, field, zaD(field, Float.valueOf(SafeParcelReader.readFloat(parcel2, readHeader))));
                            z = true;
                            break;
                        case 4:
                            zaJ(sb4, field, zaD(field, Double.valueOf(SafeParcelReader.readDouble(parcel2, readHeader))));
                            z = true;
                            break;
                        case 5:
                            zaJ(sb4, field, zaD(field, SafeParcelReader.createBigDecimal(parcel2, readHeader)));
                            z = true;
                            break;
                        case 6:
                            zaJ(sb4, field, zaD(field, Boolean.valueOf(SafeParcelReader.readBoolean(parcel2, readHeader))));
                            z = true;
                            break;
                        case 7:
                            zaJ(sb4, field, zaD(field, SafeParcelReader.createString(parcel2, readHeader)));
                            z = true;
                            break;
                        case 8:
                        case ConnectionResult.SERVICE_INVALID:
                            zaJ(sb4, field, zaD(field, SafeParcelReader.createByteArray(parcel2, readHeader)));
                            z = true;
                            break;
                        case 10:
                            Bundle createBundle = SafeParcelReader.createBundle(parcel2, readHeader);
                            new HashMap();
                            for (String str2 : createBundle.keySet()) {
                                Object put = hashMap.put(str2, (String) Preconditions.checkNotNull(createBundle.getString(str2)));
                            }
                            zaJ(sb4, field, zaD(field, hashMap));
                            z = true;
                            break;
                        case ConnectionResult.LICENSE_CHECK_FAILED:
                            new IllegalArgumentException("Method does not accept concrete type.");
                            throw th5;
                        default:
                            new StringBuilder(36);
                            StringBuilder append6 = sb3.append("Unknown field out type = ");
                            StringBuilder append7 = sb3.append(i);
                            new IllegalArgumentException(sb3.toString());
                            throw th6;
                    }
                } else if (field.zad) {
                    StringBuilder append8 = sb4.append("[");
                    switch (field.zac) {
                        case 0:
                            ArrayUtils.writeArray(sb4, SafeParcelReader.createIntArray(parcel2, readHeader));
                            break;
                        case 1:
                            ArrayUtils.writeArray(sb4, (T[]) SafeParcelReader.createBigIntegerArray(parcel2, readHeader));
                            break;
                        case 2:
                            ArrayUtils.writeArray(sb4, SafeParcelReader.createLongArray(parcel2, readHeader));
                            break;
                        case 3:
                            ArrayUtils.writeArray(sb4, SafeParcelReader.createFloatArray(parcel2, readHeader));
                            break;
                        case 4:
                            ArrayUtils.writeArray(sb4, SafeParcelReader.createDoubleArray(parcel2, readHeader));
                            break;
                        case 5:
                            ArrayUtils.writeArray(sb4, (T[]) SafeParcelReader.createBigDecimalArray(parcel2, readHeader));
                            break;
                        case 6:
                            ArrayUtils.writeArray(sb4, SafeParcelReader.createBooleanArray(parcel2, readHeader));
                            break;
                        case 7:
                            ArrayUtils.writeStringArray(sb4, SafeParcelReader.createStringArray(parcel2, readHeader));
                            break;
                        case 8:
                        case ConnectionResult.SERVICE_INVALID:
                        case 10:
                            new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            throw th3;
                        case ConnectionResult.LICENSE_CHECK_FAILED:
                            Parcel[] createParcelArray = SafeParcelReader.createParcelArray(parcel2, readHeader);
                            int length = createParcelArray.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    StringBuilder append9 = sb4.append(",");
                                }
                                createParcelArray[i2].setDataPosition(0);
                                zaH(sb4, field.zag(), createParcelArray[i2]);
                            }
                            break;
                        default:
                            new IllegalStateException("Unknown field type out.");
                            throw th4;
                    }
                    StringBuilder append10 = sb4.append("]");
                    z = true;
                } else {
                    switch (field.zac) {
                        case 0:
                            StringBuilder append11 = sb4.append(SafeParcelReader.readInt(parcel2, readHeader));
                            z = true;
                            break;
                        case 1:
                            StringBuilder append12 = sb4.append(SafeParcelReader.createBigInteger(parcel2, readHeader));
                            z = true;
                            break;
                        case 2:
                            StringBuilder append13 = sb4.append(SafeParcelReader.readLong(parcel2, readHeader));
                            z = true;
                            break;
                        case 3:
                            StringBuilder append14 = sb4.append(SafeParcelReader.readFloat(parcel2, readHeader));
                            z = true;
                            break;
                        case 4:
                            StringBuilder append15 = sb4.append(SafeParcelReader.readDouble(parcel2, readHeader));
                            z = true;
                            break;
                        case 5:
                            StringBuilder append16 = sb4.append(SafeParcelReader.createBigDecimal(parcel2, readHeader));
                            z = true;
                            break;
                        case 6:
                            StringBuilder append17 = sb4.append(SafeParcelReader.readBoolean(parcel2, readHeader));
                            z = true;
                            break;
                        case 7:
                            String createString = SafeParcelReader.createString(parcel2, readHeader);
                            StringBuilder append18 = sb4.append("\"");
                            StringBuilder append19 = sb4.append(JsonUtils.escapeString(createString));
                            StringBuilder append20 = sb4.append("\"");
                            z = true;
                            break;
                        case 8:
                            byte[] createByteArray = SafeParcelReader.createByteArray(parcel2, readHeader);
                            StringBuilder append21 = sb4.append("\"");
                            StringBuilder append22 = sb4.append(Base64Utils.encode(createByteArray));
                            StringBuilder append23 = sb4.append("\"");
                            z = true;
                            break;
                        case ConnectionResult.SERVICE_INVALID:
                            byte[] createByteArray2 = SafeParcelReader.createByteArray(parcel2, readHeader);
                            StringBuilder append24 = sb4.append("\"");
                            StringBuilder append25 = sb4.append(Base64Utils.encodeUrlSafe(createByteArray2));
                            StringBuilder append26 = sb4.append("\"");
                            z = true;
                            break;
                        case 10:
                            Bundle createBundle2 = SafeParcelReader.createBundle(parcel2, readHeader);
                            Set keySet = createBundle2.keySet();
                            StringBuilder append27 = sb4.append("{");
                            Iterator it = keySet.iterator();
                            boolean z2 = true;
                            while (true) {
                                boolean z3 = z2;
                                if (!it.hasNext()) {
                                    StringBuilder append28 = sb4.append("}");
                                    z = true;
                                    break;
                                } else {
                                    String str3 = (String) it.next();
                                    if (!z3) {
                                        StringBuilder append29 = sb4.append(",");
                                    }
                                    StringBuilder append30 = sb4.append("\"");
                                    StringBuilder append31 = sb4.append(str3);
                                    StringBuilder append32 = sb4.append("\":\"");
                                    StringBuilder append33 = sb4.append(JsonUtils.escapeString(createBundle2.getString(str3)));
                                    StringBuilder append34 = sb4.append("\"");
                                    z2 = false;
                                }
                            }
                        case ConnectionResult.LICENSE_CHECK_FAILED:
                            Parcel createParcel = SafeParcelReader.createParcel(parcel2, readHeader);
                            createParcel.setDataPosition(0);
                            zaH(sb4, field.zag(), createParcel);
                            z = true;
                            break;
                        default:
                            new IllegalStateException("Unknown field type out");
                            throw th2;
                    }
                }
            }
        }
        if (parcel2.dataPosition() != validateObjectHeader) {
            new StringBuilder(37);
            StringBuilder append35 = sb2.append("Overread allowed size end=");
            StringBuilder append36 = sb2.append(validateObjectHeader);
            new SafeParcelReader.ParseException(sb2.toString(), parcel2);
            throw th;
        }
        StringBuilder append37 = sb4.append('}');
    }

    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@RecentlyNonNull FastJsonResponse.Field field, @RecentlyNonNull String str, @Nullable ArrayList<T> arrayList) {
        ArrayList arrayList2;
        FastJsonResponse.Field field2 = field;
        String str2 = str;
        ArrayList<T> arrayList3 = arrayList;
        zaG(field2);
        new ArrayList();
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList3)).size();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            boolean add = arrayList2.add(((SafeParcelResponse) ((FastJsonResponse) arrayList3.get(i))).zaE());
        }
        SafeParcelWriter.writeParcelList(this.zab, field2.getSafeParcelableFieldId(), arrayList2, true);
    }

    public final <T extends FastJsonResponse> void addConcreteTypeInternal(@RecentlyNonNull FastJsonResponse.Field field, @RecentlyNonNull String str, @RecentlyNonNull T t) {
        FastJsonResponse.Field field2 = field;
        String str2 = str;
        zaG(field2);
        SafeParcelWriter.writeParcel(this.zab, field2.getSafeParcelableFieldId(), ((SafeParcelResponse) t).zaE(), true);
    }

    @RecentlyNullable
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zan zan = this.zad;
        if (zan == null) {
            return null;
        }
        return zan.zad((String) Preconditions.checkNotNull(this.zae));
    }

    @RecentlyNonNull
    public final Object getValueObject(@RecentlyNonNull String str) {
        Throwable th;
        String str2 = str;
        new UnsupportedOperationException("Converting to JSON does not require this method.");
        throw th;
    }

    public final boolean isPrimitiveFieldSet(@RecentlyNonNull String str) {
        Throwable th;
        String str2 = str;
        new UnsupportedOperationException("Converting to JSON does not require this method.");
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void setBooleanInternal(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, boolean z) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        SafeParcelWriter.writeBoolean(this.zab, field2.getSafeParcelableFieldId(), z);
    }

    /* access modifiers changed from: protected */
    public final void setDecodedBytesInternal(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable byte[] bArr) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        SafeParcelWriter.writeByteArray(this.zab, field2.getSafeParcelableFieldId(), bArr, true);
    }

    /* access modifiers changed from: protected */
    public final void setIntegerInternal(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, int i) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        SafeParcelWriter.writeInt(this.zab, field2.getSafeParcelableFieldId(), i);
    }

    /* access modifiers changed from: protected */
    public final void setLongInternal(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, long j) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        SafeParcelWriter.writeLong(this.zab, field2.getSafeParcelableFieldId(), j);
    }

    /* access modifiers changed from: protected */
    public final void setStringInternal(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable String str2) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str3 = str;
        zaG(field2);
        SafeParcelWriter.writeString(this.zab, field2.getSafeParcelableFieldId(), str2, true);
    }

    /* access modifiers changed from: protected */
    public final void setStringMapInternal(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable Map<String, String> map) {
        Bundle bundle;
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        Map<String, String> map2 = map;
        zaG(field2);
        new Bundle();
        for (String str3 : ((Map) Preconditions.checkNotNull(map2)).keySet()) {
            bundle.putString(str3, map2.get(str3));
        }
        SafeParcelWriter.writeBundle(this.zab, field2.getSafeParcelableFieldId(), bundle, true);
    }

    /* access modifiers changed from: protected */
    public final void setStringsInternal(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<String> arrayList) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<String> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList2)).size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList2.get(i);
        }
        SafeParcelWriter.writeStringArray(this.zab, field2.getSafeParcelableFieldId(), strArr, true);
    }

    @RecentlyNonNull
    public final String toString() {
        StringBuilder sb;
        Object checkNotNull = Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        Parcel zaE = zaE();
        zaE.setDataPosition(0);
        new StringBuilder(100);
        zaH(sb, (Map) Preconditions.checkNotNull(this.zad.zad((String) Preconditions.checkNotNull(this.zae))), zaE);
        return sb.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        zan zan;
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeParcel(parcel2, 2, zaE(), false);
        switch (this.zac) {
            case 0:
                zan = null;
                break;
            case 1:
                zan = this.zad;
                break;
            default:
                zan = this.zad;
                break;
        }
        SafeParcelWriter.writeParcelable(parcel2, 3, zan, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* access modifiers changed from: protected */
    public final void zaA(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable BigDecimal bigDecimal) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        SafeParcelWriter.writeBigDecimal(this.zab, field2.getSafeParcelableFieldId(), bigDecimal, true);
    }

    /* access modifiers changed from: protected */
    public final void zaB(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<BigDecimal> arrayList) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<BigDecimal> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList2)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = arrayList2.get(i);
        }
        SafeParcelWriter.writeBigDecimalArray(this.zab, field2.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaC(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Boolean> arrayList) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Boolean> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList2)).size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = arrayList2.get(i).booleanValue();
        }
        SafeParcelWriter.writeBooleanArray(this.zab, field2.getSafeParcelableFieldId(), zArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zas(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Integer> arrayList) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Integer> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList2)).size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = arrayList2.get(i).intValue();
        }
        SafeParcelWriter.writeIntArray(this.zab, field2.getSafeParcelableFieldId(), iArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zat(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable BigInteger bigInteger) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        SafeParcelWriter.writeBigInteger(this.zab, field2.getSafeParcelableFieldId(), bigInteger, true);
    }

    /* access modifiers changed from: protected */
    public final void zau(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<BigInteger> arrayList) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<BigInteger> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList2)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = arrayList2.get(i);
        }
        SafeParcelWriter.writeBigIntegerArray(this.zab, field2.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zav(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Long> arrayList) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Long> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList2)).size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = arrayList2.get(i).longValue();
        }
        SafeParcelWriter.writeLongArray(this.zab, field2.getSafeParcelableFieldId(), jArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaw(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, float f) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        SafeParcelWriter.writeFloat(this.zab, field2.getSafeParcelableFieldId(), f);
    }

    /* access modifiers changed from: protected */
    public final void zax(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Float> arrayList) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Float> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList2)).size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = arrayList2.get(i).floatValue();
        }
        SafeParcelWriter.writeFloatArray(this.zab, field2.getSafeParcelableFieldId(), fArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zay(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, double d) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        SafeParcelWriter.writeDouble(this.zab, field2.getSafeParcelableFieldId(), d);
    }

    /* access modifiers changed from: protected */
    public final void zaz(@RecentlyNonNull FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Double> arrayList) {
        FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Double> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList2)).size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList2.get(i).doubleValue();
        }
        SafeParcelWriter.writeDoubleArray(this.zab, field2.getSafeParcelableFieldId(), dArr, true);
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, zan zan, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        safeParcelable.writeToParcel(this.zab, 0);
        this.zac = 1;
        this.zad = (zan) Preconditions.checkNotNull(zan);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 2;
    }

    private final void zaG(FastJsonResponse.Field<?, ?> field) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        if (field.zaf != -1) {
            Parcel parcel = this.zab;
            if (parcel == null) {
                new IllegalStateException("Internal Parcel object is null.");
                throw th3;
            }
            switch (this.zaf) {
                case 0:
                    this.zag = SafeParcelWriter.beginObjectHeader(parcel);
                    this.zaf = 1;
                    return;
                case 1:
                    return;
                default:
                    new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                    throw th2;
            }
        } else {
            new IllegalStateException("Field does not have a valid safe parcelable field id.");
            throw th;
        }
    }

    private static final void zaJ(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        StringBuilder sb2 = sb;
        FastJsonResponse.Field<?, ?> field2 = field;
        Object obj2 = obj;
        if (field2.zab) {
            ArrayList arrayList = (ArrayList) obj2;
            StringBuilder append = sb2.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    StringBuilder append2 = sb2.append(",");
                }
                zaI(sb2, field2.zaa, arrayList.get(i));
            }
            StringBuilder append3 = sb2.append("]");
            return;
        }
        zaI(sb2, field2.zaa, obj2);
    }

    @RecentlyNonNull
    public final Parcel zaE() {
        switch (this.zaf) {
            case 0:
                int beginObjectHeader = SafeParcelWriter.beginObjectHeader(this.zab);
                this.zag = beginObjectHeader;
                SafeParcelWriter.finishObjectHeader(this.zab, beginObjectHeader);
                this.zaf = 2;
                break;
            case 1:
                SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
                this.zaf = 2;
                break;
        }
        return this.zab;
    }

    public SafeParcelResponse(zan zan, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        this.zac = 0;
        this.zad = (zan) Preconditions.checkNotNull(zan);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 0;
    }

    private static final void zaI(StringBuilder sb, int i, @Nullable Object obj) {
        Throwable th;
        Throwable th2;
        StringBuilder sb2;
        StringBuilder sb3 = sb;
        int i2 = i;
        Object obj2 = obj;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                StringBuilder append = sb3.append(obj2);
                return;
            case 7:
                StringBuilder append2 = sb3.append("\"");
                StringBuilder append3 = sb3.append(JsonUtils.escapeString(Preconditions.checkNotNull(obj2).toString()));
                StringBuilder append4 = sb3.append("\"");
                return;
            case 8:
                StringBuilder append5 = sb3.append("\"");
                StringBuilder append6 = sb3.append(Base64Utils.encode((byte[]) obj2));
                StringBuilder append7 = sb3.append("\"");
                return;
            case ConnectionResult.SERVICE_INVALID:
                StringBuilder append8 = sb3.append("\"");
                StringBuilder append9 = sb3.append(Base64Utils.encodeUrlSafe((byte[]) obj2));
                StringBuilder append10 = sb3.append("\"");
                return;
            case 10:
                MapUtils.writeStringMapToJson(sb3, (HashMap) Preconditions.checkNotNull(obj2));
                return;
            case ConnectionResult.LICENSE_CHECK_FAILED:
                new IllegalArgumentException("Method does not accept concrete type.");
                throw th;
            default:
                new StringBuilder(26);
                StringBuilder append11 = sb2.append("Unknown type = ");
                StringBuilder append12 = sb2.append(i2);
                new IllegalArgumentException(sb2.toString());
                throw th2;
        }
    }
}

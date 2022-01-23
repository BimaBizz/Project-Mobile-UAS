package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.server.response.C0557FastJsonResponse;
import com.google.android.gms.common.util.C0588ArrayUtils;
import com.google.android.gms.common.util.C0589Base64Utils;
import com.google.android.gms.common.util.C0605JsonUtils;
import com.google.android.gms.common.util.C0606MapUtils;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "SafeParcelResponseCreator")
@C0617VisibleForTesting
/* renamed from: com.google.android.gms.common.server.response.SafeParcelResponse */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0560SafeParcelResponse extends C0559FastSafeParcelableJsonResponse {
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final Parcelable.Creator<C0560SafeParcelResponse> CREATOR;
    @C0463SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zaa;
    @C0463SafeParcelable.Field(getter = "getParcel", id = 2)
    private final Parcel zab;
    private final int zac;
    @C0463SafeParcelable.Field(getter = "getFieldMappingDictionary", id = 3)
    private final C0574zan zad;
    @Nullable
    private final String zae;
    private int zaf;
    private int zag;

    static {
        Parcelable.Creator<C0560SafeParcelResponse> creator;
        new C0577zaq();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0560SafeParcelResponse(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) Parcel parcel, @C0463SafeParcelable.Param(id = 3) C0574zan zan) {
        this.zaa = i;
        this.zab = (Parcel) C0446Preconditions.checkNotNull(parcel);
        this.zac = 2;
        this.zad = zan;
        C0574zan zan2 = this.zad;
        if (zan2 == null) {
            this.zae = null;
        } else {
            this.zae = zan2.zaf();
        }
        this.zaf = 2;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static <T extends C0557FastJsonResponse & C0463SafeParcelable> C0560SafeParcelResponse from(@RecentlyNonNull T t) {
        C0574zan zan;
        C0560SafeParcelResponse safeParcelResponse;
        T t2 = t;
        String str = (String) C0446Preconditions.checkNotNull(t2.getClass().getCanonicalName());
        new C0574zan(t2.getClass());
        zaF(zan, t2);
        zan.zab();
        zan.zaa();
        new C0560SafeParcelResponse((C0463SafeParcelable) t2, zan, str);
        return safeParcelResponse;
    }

    private static void zaF(C0574zan zan, C0557FastJsonResponse fastJsonResponse) {
        String str;
        IllegalStateException illegalStateException;
        String str2;
        IllegalStateException illegalStateException2;
        C0574zan zan2 = zan;
        C0557FastJsonResponse fastJsonResponse2 = fastJsonResponse;
        Class<?> cls = fastJsonResponse2.getClass();
        if (!zan2.zae(cls)) {
            Map<String, C0557FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse2.getFieldMappings();
            zan2.zac(cls, fieldMappings);
            for (String str3 : fieldMappings.keySet()) {
                C0557FastJsonResponse.Field field = fieldMappings.get(str3);
                Class<? extends C0557FastJsonResponse> cls2 = field.zag;
                if (cls2 != null) {
                    try {
                        zaF(zan2, (C0557FastJsonResponse) cls2.newInstance());
                    } catch (InstantiationException e) {
                        InstantiationException instantiationException = e;
                        String valueOf = String.valueOf(((Class) C0446Preconditions.checkNotNull(field.zag)).getCanonicalName());
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
                        String valueOf2 = String.valueOf(((Class) C0446Preconditions.checkNotNull(field.zag)).getCanonicalName());
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

    private final void zaH(StringBuilder sb, Map<String, C0557FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
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
            sparseArray.put(((C0557FastJsonResponse.Field) next.getValue()).getSafeParcelableFieldId(), next);
        }
        StringBuilder append = sb4.append('{');
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        boolean z = false;
        while (parcel2.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel2);
            Map.Entry entry = (Map.Entry) sparseArray.get(C0461SafeParcelReader.getFieldId(readHeader));
            if (entry != null) {
                if (z) {
                    StringBuilder append2 = sb4.append(",");
                }
                String str = (String) entry.getKey();
                C0557FastJsonResponse.Field field = (C0557FastJsonResponse.Field) entry.getValue();
                StringBuilder append3 = sb4.append("\"");
                StringBuilder append4 = sb4.append(str);
                StringBuilder append5 = sb4.append("\":");
                if (field.zac()) {
                    int i = field.zac;
                    switch (i) {
                        case 0:
                            zaJ(sb4, field, zaD(field, Integer.valueOf(C0461SafeParcelReader.readInt(parcel2, readHeader))));
                            z = true;
                            break;
                        case 1:
                            zaJ(sb4, field, zaD(field, C0461SafeParcelReader.createBigInteger(parcel2, readHeader)));
                            z = true;
                            break;
                        case 2:
                            zaJ(sb4, field, zaD(field, Long.valueOf(C0461SafeParcelReader.readLong(parcel2, readHeader))));
                            z = true;
                            break;
                        case 3:
                            zaJ(sb4, field, zaD(field, Float.valueOf(C0461SafeParcelReader.readFloat(parcel2, readHeader))));
                            z = true;
                            break;
                        case 4:
                            zaJ(sb4, field, zaD(field, Double.valueOf(C0461SafeParcelReader.readDouble(parcel2, readHeader))));
                            z = true;
                            break;
                        case 5:
                            zaJ(sb4, field, zaD(field, C0461SafeParcelReader.createBigDecimal(parcel2, readHeader)));
                            z = true;
                            break;
                        case 6:
                            zaJ(sb4, field, zaD(field, Boolean.valueOf(C0461SafeParcelReader.readBoolean(parcel2, readHeader))));
                            z = true;
                            break;
                        case 7:
                            zaJ(sb4, field, zaD(field, C0461SafeParcelReader.createString(parcel2, readHeader)));
                            z = true;
                            break;
                        case 8:
                        case 9:
                            zaJ(sb4, field, zaD(field, C0461SafeParcelReader.createByteArray(parcel2, readHeader)));
                            z = true;
                            break;
                        case 10:
                            Bundle createBundle = C0461SafeParcelReader.createBundle(parcel2, readHeader);
                            new HashMap();
                            for (String str2 : createBundle.keySet()) {
                                Object put = hashMap.put(str2, (String) C0446Preconditions.checkNotNull(createBundle.getString(str2)));
                            }
                            zaJ(sb4, field, zaD(field, hashMap));
                            z = true;
                            break;
                        case 11:
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
                            C0588ArrayUtils.writeArray(sb4, C0461SafeParcelReader.createIntArray(parcel2, readHeader));
                            break;
                        case 1:
                            C0588ArrayUtils.writeArray(sb4, (T[]) C0461SafeParcelReader.createBigIntegerArray(parcel2, readHeader));
                            break;
                        case 2:
                            C0588ArrayUtils.writeArray(sb4, C0461SafeParcelReader.createLongArray(parcel2, readHeader));
                            break;
                        case 3:
                            C0588ArrayUtils.writeArray(sb4, C0461SafeParcelReader.createFloatArray(parcel2, readHeader));
                            break;
                        case 4:
                            C0588ArrayUtils.writeArray(sb4, C0461SafeParcelReader.createDoubleArray(parcel2, readHeader));
                            break;
                        case 5:
                            C0588ArrayUtils.writeArray(sb4, (T[]) C0461SafeParcelReader.createBigDecimalArray(parcel2, readHeader));
                            break;
                        case 6:
                            C0588ArrayUtils.writeArray(sb4, C0461SafeParcelReader.createBooleanArray(parcel2, readHeader));
                            break;
                        case 7:
                            C0588ArrayUtils.writeStringArray(sb4, C0461SafeParcelReader.createStringArray(parcel2, readHeader));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            throw th3;
                        case 11:
                            Parcel[] createParcelArray = C0461SafeParcelReader.createParcelArray(parcel2, readHeader);
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
                            StringBuilder append11 = sb4.append(C0461SafeParcelReader.readInt(parcel2, readHeader));
                            z = true;
                            break;
                        case 1:
                            StringBuilder append12 = sb4.append(C0461SafeParcelReader.createBigInteger(parcel2, readHeader));
                            z = true;
                            break;
                        case 2:
                            StringBuilder append13 = sb4.append(C0461SafeParcelReader.readLong(parcel2, readHeader));
                            z = true;
                            break;
                        case 3:
                            StringBuilder append14 = sb4.append(C0461SafeParcelReader.readFloat(parcel2, readHeader));
                            z = true;
                            break;
                        case 4:
                            StringBuilder append15 = sb4.append(C0461SafeParcelReader.readDouble(parcel2, readHeader));
                            z = true;
                            break;
                        case 5:
                            StringBuilder append16 = sb4.append(C0461SafeParcelReader.createBigDecimal(parcel2, readHeader));
                            z = true;
                            break;
                        case 6:
                            StringBuilder append17 = sb4.append(C0461SafeParcelReader.readBoolean(parcel2, readHeader));
                            z = true;
                            break;
                        case 7:
                            String createString = C0461SafeParcelReader.createString(parcel2, readHeader);
                            StringBuilder append18 = sb4.append("\"");
                            StringBuilder append19 = sb4.append(C0605JsonUtils.escapeString(createString));
                            StringBuilder append20 = sb4.append("\"");
                            z = true;
                            break;
                        case 8:
                            byte[] createByteArray = C0461SafeParcelReader.createByteArray(parcel2, readHeader);
                            StringBuilder append21 = sb4.append("\"");
                            StringBuilder append22 = sb4.append(C0589Base64Utils.encode(createByteArray));
                            StringBuilder append23 = sb4.append("\"");
                            z = true;
                            break;
                        case 9:
                            byte[] createByteArray2 = C0461SafeParcelReader.createByteArray(parcel2, readHeader);
                            StringBuilder append24 = sb4.append("\"");
                            StringBuilder append25 = sb4.append(C0589Base64Utils.encodeUrlSafe(createByteArray2));
                            StringBuilder append26 = sb4.append("\"");
                            z = true;
                            break;
                        case 10:
                            Bundle createBundle2 = C0461SafeParcelReader.createBundle(parcel2, readHeader);
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
                                    StringBuilder append33 = sb4.append(C0605JsonUtils.escapeString(createBundle2.getString(str3)));
                                    StringBuilder append34 = sb4.append("\"");
                                    z2 = false;
                                }
                            }
                        case 11:
                            Parcel createParcel = C0461SafeParcelReader.createParcel(parcel2, readHeader);
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
            new C0461SafeParcelReader.ParseException(sb2.toString(), parcel2);
            throw th;
        }
        StringBuilder append37 = sb4.append('}');
    }

    public final <T extends C0557FastJsonResponse> void addConcreteTypeArrayInternal(@RecentlyNonNull C0557FastJsonResponse.Field field, @RecentlyNonNull String str, @Nullable ArrayList<T> arrayList) {
        ArrayList arrayList2;
        C0557FastJsonResponse.Field field2 = field;
        String str2 = str;
        ArrayList<T> arrayList3 = arrayList;
        zaG(field2);
        new ArrayList();
        int size = ((ArrayList) C0446Preconditions.checkNotNull(arrayList3)).size();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            boolean add = arrayList2.add(((C0560SafeParcelResponse) ((C0557FastJsonResponse) arrayList3.get(i))).zaE());
        }
        C0462SafeParcelWriter.writeParcelList(this.zab, field2.getSafeParcelableFieldId(), arrayList2, true);
    }

    public final <T extends C0557FastJsonResponse> void addConcreteTypeInternal(@RecentlyNonNull C0557FastJsonResponse.Field field, @RecentlyNonNull String str, @RecentlyNonNull T t) {
        C0557FastJsonResponse.Field field2 = field;
        String str2 = str;
        zaG(field2);
        C0462SafeParcelWriter.writeParcel(this.zab, field2.getSafeParcelableFieldId(), ((C0560SafeParcelResponse) t).zaE(), true);
    }

    @RecentlyNullable
    public final Map<String, C0557FastJsonResponse.Field<?, ?>> getFieldMappings() {
        C0574zan zan = this.zad;
        if (zan == null) {
            return null;
        }
        return zan.zad((String) C0446Preconditions.checkNotNull(this.zae));
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
    public final void setBooleanInternal(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, boolean z) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        C0462SafeParcelWriter.writeBoolean(this.zab, field2.getSafeParcelableFieldId(), z);
    }

    /* access modifiers changed from: protected */
    public final void setDecodedBytesInternal(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable byte[] bArr) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        C0462SafeParcelWriter.writeByteArray(this.zab, field2.getSafeParcelableFieldId(), bArr, true);
    }

    /* access modifiers changed from: protected */
    public final void setIntegerInternal(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, int i) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        C0462SafeParcelWriter.writeInt(this.zab, field2.getSafeParcelableFieldId(), i);
    }

    /* access modifiers changed from: protected */
    public final void setLongInternal(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, long j) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        C0462SafeParcelWriter.writeLong(this.zab, field2.getSafeParcelableFieldId(), j);
    }

    /* access modifiers changed from: protected */
    public final void setStringInternal(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable String str2) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str3 = str;
        zaG(field2);
        C0462SafeParcelWriter.writeString(this.zab, field2.getSafeParcelableFieldId(), str2, true);
    }

    /* access modifiers changed from: protected */
    public final void setStringMapInternal(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable Map<String, String> map) {
        Bundle bundle;
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        Map<String, String> map2 = map;
        zaG(field2);
        new Bundle();
        for (String str3 : ((Map) C0446Preconditions.checkNotNull(map2)).keySet()) {
            bundle.putString(str3, map2.get(str3));
        }
        C0462SafeParcelWriter.writeBundle(this.zab, field2.getSafeParcelableFieldId(), bundle, true);
    }

    /* access modifiers changed from: protected */
    public final void setStringsInternal(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<String> arrayList) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<String> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) C0446Preconditions.checkNotNull(arrayList2)).size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList2.get(i);
        }
        C0462SafeParcelWriter.writeStringArray(this.zab, field2.getSafeParcelableFieldId(), strArr, true);
    }

    @RecentlyNonNull
    public final String toString() {
        StringBuilder sb;
        Object checkNotNull = C0446Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        Parcel zaE = zaE();
        zaE.setDataPosition(0);
        new StringBuilder(100);
        zaH(sb, (Map) C0446Preconditions.checkNotNull(this.zad.zad((String) C0446Preconditions.checkNotNull(this.zae))), zaE);
        return sb.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C0574zan zan;
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeParcel(parcel2, 2, zaE(), false);
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
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, zan, i2, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    /* access modifiers changed from: protected */
    public final void zaA(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable BigDecimal bigDecimal) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        C0462SafeParcelWriter.writeBigDecimal(this.zab, field2.getSafeParcelableFieldId(), bigDecimal, true);
    }

    /* access modifiers changed from: protected */
    public final void zaB(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<BigDecimal> arrayList) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<BigDecimal> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) C0446Preconditions.checkNotNull(arrayList2)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = arrayList2.get(i);
        }
        C0462SafeParcelWriter.writeBigDecimalArray(this.zab, field2.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaC(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Boolean> arrayList) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Boolean> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) C0446Preconditions.checkNotNull(arrayList2)).size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = arrayList2.get(i).booleanValue();
        }
        C0462SafeParcelWriter.writeBooleanArray(this.zab, field2.getSafeParcelableFieldId(), zArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zas(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Integer> arrayList) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Integer> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) C0446Preconditions.checkNotNull(arrayList2)).size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = arrayList2.get(i).intValue();
        }
        C0462SafeParcelWriter.writeIntArray(this.zab, field2.getSafeParcelableFieldId(), iArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zat(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable BigInteger bigInteger) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        C0462SafeParcelWriter.writeBigInteger(this.zab, field2.getSafeParcelableFieldId(), bigInteger, true);
    }

    /* access modifiers changed from: protected */
    public final void zau(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<BigInteger> arrayList) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<BigInteger> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) C0446Preconditions.checkNotNull(arrayList2)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = arrayList2.get(i);
        }
        C0462SafeParcelWriter.writeBigIntegerArray(this.zab, field2.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zav(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Long> arrayList) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Long> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) C0446Preconditions.checkNotNull(arrayList2)).size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = arrayList2.get(i).longValue();
        }
        C0462SafeParcelWriter.writeLongArray(this.zab, field2.getSafeParcelableFieldId(), jArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaw(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, float f) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        C0462SafeParcelWriter.writeFloat(this.zab, field2.getSafeParcelableFieldId(), f);
    }

    /* access modifiers changed from: protected */
    public final void zax(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Float> arrayList) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Float> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) C0446Preconditions.checkNotNull(arrayList2)).size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = arrayList2.get(i).floatValue();
        }
        C0462SafeParcelWriter.writeFloatArray(this.zab, field2.getSafeParcelableFieldId(), fArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zay(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, double d) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        zaG(field2);
        C0462SafeParcelWriter.writeDouble(this.zab, field2.getSafeParcelableFieldId(), d);
    }

    /* access modifiers changed from: protected */
    public final void zaz(@RecentlyNonNull C0557FastJsonResponse.Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Double> arrayList) {
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Double> arrayList2 = arrayList;
        zaG(field2);
        int size = ((ArrayList) C0446Preconditions.checkNotNull(arrayList2)).size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList2.get(i).doubleValue();
        }
        C0462SafeParcelWriter.writeDoubleArray(this.zab, field2.getSafeParcelableFieldId(), dArr, true);
    }

    private C0560SafeParcelResponse(C0463SafeParcelable safeParcelable, C0574zan zan, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        safeParcelable.writeToParcel(this.zab, 0);
        this.zac = 1;
        this.zad = (C0574zan) C0446Preconditions.checkNotNull(zan);
        this.zae = (String) C0446Preconditions.checkNotNull(str);
        this.zaf = 2;
    }

    private final void zaG(C0557FastJsonResponse.Field<?, ?> field) {
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
                    this.zag = C0462SafeParcelWriter.beginObjectHeader(parcel);
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

    private static final void zaJ(StringBuilder sb, C0557FastJsonResponse.Field<?, ?> field, Object obj) {
        StringBuilder sb2 = sb;
        C0557FastJsonResponse.Field<?, ?> field2 = field;
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
                int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(this.zab);
                this.zag = beginObjectHeader;
                C0462SafeParcelWriter.finishObjectHeader(this.zab, beginObjectHeader);
                this.zaf = 2;
                break;
            case 1:
                C0462SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
                this.zaf = 2;
                break;
        }
        return this.zab;
    }

    public C0560SafeParcelResponse(C0574zan zan, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        this.zac = 0;
        this.zad = (C0574zan) C0446Preconditions.checkNotNull(zan);
        this.zae = (String) C0446Preconditions.checkNotNull(str);
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
                StringBuilder append3 = sb3.append(C0605JsonUtils.escapeString(C0446Preconditions.checkNotNull(obj2).toString()));
                StringBuilder append4 = sb3.append("\"");
                return;
            case 8:
                StringBuilder append5 = sb3.append("\"");
                StringBuilder append6 = sb3.append(C0589Base64Utils.encode((byte[]) obj2));
                StringBuilder append7 = sb3.append("\"");
                return;
            case 9:
                StringBuilder append8 = sb3.append("\"");
                StringBuilder append9 = sb3.append(C0589Base64Utils.encodeUrlSafe((byte[]) obj2));
                StringBuilder append10 = sb3.append("\"");
                return;
            case 10:
                C0606MapUtils.writeStringMapToJson(sb3, (HashMap) C0446Preconditions.checkNotNull(obj2));
                return;
            case 11:
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

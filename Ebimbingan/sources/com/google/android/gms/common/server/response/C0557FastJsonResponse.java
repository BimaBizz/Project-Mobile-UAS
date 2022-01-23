package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.server.converter.C0552zaa;
import com.google.android.gms.common.util.C0589Base64Utils;
import com.google.android.gms.common.util.C0605JsonUtils;
import com.google.android.gms.common.util.C0606MapUtils;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@C0452ShowFirstParty
@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.server.response.FastJsonResponse */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0557FastJsonResponse {

    @C0452ShowFirstParty
    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        @RecentlyNonNull
        I zac(@RecentlyNonNull O o);

        @RecentlyNullable
        O zad(@RecentlyNonNull I i);
    }

    public C0557FastJsonResponse() {
    }

    @RecentlyNonNull
    protected static final <O, I> I zaD(@RecentlyNonNull Field<I, O> field, @Nullable Object obj) {
        Field<I, O> field2 = field;
        Object obj2 = obj;
        return field2.zak != null ? field2.zai(obj2) : obj2;
    }

    private final <I, O> void zaE(Field<I, O> field, @Nullable I i) {
        Throwable th;
        StringBuilder sb;
        Field<I, O> field2 = field;
        String str = field2.zae;
        O zah = field2.zah(i);
        int i2 = field2.zac;
        switch (i2) {
            case 0:
                if (zah != null) {
                    setIntegerInternal(field2, str, ((Integer) zah).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zat(field2, str, (BigInteger) zah);
                return;
            case 2:
                if (zah != null) {
                    setLongInternal(field2, str, ((Long) zah).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 4:
                if (zah != null) {
                    zay(field2, str, ((Double) zah).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zaA(field2, str, (BigDecimal) zah);
                return;
            case 6:
                if (zah != null) {
                    setBooleanInternal(field2, str, ((Boolean) zah).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(field2, str, (String) zah);
                return;
            case 8:
            case 9:
                if (zah != null) {
                    setDecodedBytesInternal(field2, str, (byte[]) zah);
                    return;
                } else {
                    zaG(str);
                    return;
                }
            default:
                new StringBuilder(44);
                StringBuilder append = sb.append("Unsupported type for conversion: ");
                StringBuilder append2 = sb.append(i2);
                new IllegalStateException(sb.toString());
                throw th;
        }
    }

    private static final void zaF(StringBuilder sb, Field field, Object obj) {
        StringBuilder sb2 = sb;
        Field field2 = field;
        Object obj2 = obj;
        int i = field2.zaa;
        if (i == 11) {
            Class<? extends C0557FastJsonResponse> cls = field2.zag;
            Object checkNotNull = C0446Preconditions.checkNotNull(cls);
            StringBuilder append = sb2.append(((C0557FastJsonResponse) cls.cast(obj2)).toString());
        } else if (i == 7) {
            StringBuilder append2 = sb2.append("\"");
            StringBuilder append3 = sb2.append(C0605JsonUtils.escapeString((String) obj2));
            StringBuilder append4 = sb2.append("\"");
        } else {
            StringBuilder append5 = sb2.append(obj2);
        }
    }

    private static final <O> void zaG(String str) {
        StringBuilder sb;
        String str2 = str;
        if (Log.isLoggable("FastJsonResponse", 6)) {
            new StringBuilder(String.valueOf(str2).length() + 58);
            StringBuilder append = sb.append("Output field (");
            StringBuilder append2 = sb.append(str2);
            StringBuilder append3 = sb.append(") has a null value, but expected a primitive");
            int e = Log.e("FastJsonResponse", sb.toString());
        }
    }

    @C0206KeepForSdk
    public <T extends C0557FastJsonResponse> void addConcreteTypeArrayInternal(@RecentlyNonNull Field field, @RecentlyNonNull String str, @Nullable ArrayList<T> arrayList) {
        Throwable th;
        Field field2 = field;
        String str2 = str;
        ArrayList<T> arrayList2 = arrayList;
        new UnsupportedOperationException("Concrete type array not supported");
        throw th;
    }

    @C0206KeepForSdk
    public <T extends C0557FastJsonResponse> void addConcreteTypeInternal(@RecentlyNonNull Field field, @RecentlyNonNull String str, @RecentlyNonNull T t) {
        Throwable th;
        Field field2 = field;
        String str2 = str;
        T t2 = t;
        new UnsupportedOperationException("Concrete type not supported");
        throw th;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    @RecentlyNullable
    public abstract Object getValueObject(@RecentlyNonNull String str);

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public abstract boolean isPrimitiveFieldSet(@RecentlyNonNull String str);

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public void setBooleanInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, boolean z) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        boolean z2 = z;
        new UnsupportedOperationException("Boolean not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public void setDecodedBytesInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable byte[] bArr) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        byte[] bArr2 = bArr;
        new UnsupportedOperationException("byte[] not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public void setIntegerInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, int i) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        int i2 = i;
        new UnsupportedOperationException("Integer not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public void setLongInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, long j) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        long j2 = j;
        new UnsupportedOperationException("Long not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public void setStringInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable String str2) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str3 = str;
        String str4 = str2;
        new UnsupportedOperationException("String not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public void setStringMapInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable Map<String, String> map) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        Map<String, String> map2 = map;
        new UnsupportedOperationException("String map not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public void setStringsInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<String> arrayList) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<String> arrayList2 = arrayList;
        new UnsupportedOperationException("String list not supported");
        throw th;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public String toString() {
        StringBuilder sb;
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        new StringBuilder(100);
        for (String next : fieldMappings.keySet()) {
            Field field = fieldMappings.get(next);
            if (isFieldSet(field)) {
                Object zaD = zaD(field, getFieldValue(field));
                if (sb.length() == 0) {
                    StringBuilder append = sb.append("{");
                } else {
                    StringBuilder append2 = sb.append(",");
                }
                StringBuilder append3 = sb.append("\"");
                StringBuilder append4 = sb.append(next);
                StringBuilder append5 = sb.append("\":");
                if (zaD != null) {
                    switch (field.zac) {
                        case 8:
                            StringBuilder append6 = sb.append("\"");
                            StringBuilder append7 = sb.append(C0589Base64Utils.encode((byte[]) zaD));
                            StringBuilder append8 = sb.append("\"");
                            break;
                        case 9:
                            StringBuilder append9 = sb.append("\"");
                            StringBuilder append10 = sb.append(C0589Base64Utils.encodeUrlSafe((byte[]) zaD));
                            StringBuilder append11 = sb.append("\"");
                            break;
                        case 10:
                            C0606MapUtils.writeStringMapToJson(sb, (HashMap) zaD);
                            break;
                        default:
                            if (!field.zab) {
                                zaF(sb, field, zaD);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) zaD;
                                StringBuilder append12 = sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        StringBuilder append13 = sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        zaF(sb, field, obj);
                                    }
                                }
                                StringBuilder append14 = sb.append("]");
                                break;
                            }
                    }
                } else {
                    StringBuilder append15 = sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            StringBuilder append16 = sb.append("}");
        } else {
            StringBuilder append17 = sb.append("{}");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void zaA(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable BigDecimal bigDecimal) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        BigDecimal bigDecimal2 = bigDecimal;
        new UnsupportedOperationException("BigDecimal not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    public void zaB(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<BigDecimal> arrayList) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<BigDecimal> arrayList2 = arrayList;
        new UnsupportedOperationException("BigDecimal list not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    public void zaC(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Boolean> arrayList) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Boolean> arrayList2 = arrayList;
        new UnsupportedOperationException("Boolean list not supported");
        throw th;
    }

    public final <O> void zaa(@RecentlyNonNull Field<Integer, O> field, int i) {
        Field<Integer, O> field2 = field;
        int i2 = i;
        if (field2.zak != null) {
            zaE(field2, Integer.valueOf(i2));
        } else {
            setIntegerInternal(field2, field2.zae, i2);
        }
    }

    public final <O> void zab(@RecentlyNonNull Field<ArrayList<Integer>, O> field, @Nullable ArrayList<Integer> arrayList) {
        Field<ArrayList<Integer>, O> field2 = field;
        ArrayList<Integer> arrayList2 = arrayList;
        if (field2.zak != null) {
            zaE(field2, arrayList2);
        } else {
            zas(field2, field2.zae, arrayList2);
        }
    }

    public final <O> void zac(@RecentlyNonNull Field<BigInteger, O> field, @Nullable BigInteger bigInteger) {
        Field<BigInteger, O> field2 = field;
        BigInteger bigInteger2 = bigInteger;
        if (field2.zak != null) {
            zaE(field2, bigInteger2);
        } else {
            zat(field2, field2.zae, bigInteger2);
        }
    }

    public final <O> void zad(@RecentlyNonNull Field<ArrayList<BigInteger>, O> field, @Nullable ArrayList<BigInteger> arrayList) {
        Field<ArrayList<BigInteger>, O> field2 = field;
        ArrayList<BigInteger> arrayList2 = arrayList;
        if (field2.zak != null) {
            zaE(field2, arrayList2);
        } else {
            zau(field2, field2.zae, arrayList2);
        }
    }

    public final <O> void zae(@RecentlyNonNull Field<Long, O> field, long j) {
        Field<Long, O> field2 = field;
        long j2 = j;
        if (field2.zak != null) {
            zaE(field2, Long.valueOf(j2));
        } else {
            setLongInternal(field2, field2.zae, j2);
        }
    }

    public final <O> void zaf(@RecentlyNonNull Field<ArrayList<Long>, O> field, @Nullable ArrayList<Long> arrayList) {
        Field<ArrayList<Long>, O> field2 = field;
        ArrayList<Long> arrayList2 = arrayList;
        if (field2.zak != null) {
            zaE(field2, arrayList2);
        } else {
            zav(field2, field2.zae, arrayList2);
        }
    }

    public final <O> void zag(@RecentlyNonNull Field<Float, O> field, float f) {
        Field<Float, O> field2 = field;
        float f2 = f;
        if (field2.zak != null) {
            zaE(field2, Float.valueOf(f2));
        } else {
            zaw(field2, field2.zae, f2);
        }
    }

    public final <O> void zah(@RecentlyNonNull Field<ArrayList<Float>, O> field, @Nullable ArrayList<Float> arrayList) {
        Field<ArrayList<Float>, O> field2 = field;
        ArrayList<Float> arrayList2 = arrayList;
        if (field2.zak != null) {
            zaE(field2, arrayList2);
        } else {
            zax(field2, field2.zae, arrayList2);
        }
    }

    public final <O> void zai(@RecentlyNonNull Field<Double, O> field, double d) {
        Field<Double, O> field2 = field;
        double d2 = d;
        if (field2.zak != null) {
            zaE(field2, Double.valueOf(d2));
        } else {
            zay(field2, field2.zae, d2);
        }
    }

    public final <O> void zaj(@RecentlyNonNull Field<ArrayList<Double>, O> field, @Nullable ArrayList<Double> arrayList) {
        Field<ArrayList<Double>, O> field2 = field;
        ArrayList<Double> arrayList2 = arrayList;
        if (field2.zak != null) {
            zaE(field2, arrayList2);
        } else {
            zaz(field2, field2.zae, arrayList2);
        }
    }

    public final <O> void zak(@RecentlyNonNull Field<BigDecimal, O> field, @Nullable BigDecimal bigDecimal) {
        Field<BigDecimal, O> field2 = field;
        BigDecimal bigDecimal2 = bigDecimal;
        if (field2.zak != null) {
            zaE(field2, bigDecimal2);
        } else {
            zaA(field2, field2.zae, bigDecimal2);
        }
    }

    public final <O> void zal(@RecentlyNonNull Field<ArrayList<BigDecimal>, O> field, @Nullable ArrayList<BigDecimal> arrayList) {
        Field<ArrayList<BigDecimal>, O> field2 = field;
        ArrayList<BigDecimal> arrayList2 = arrayList;
        if (field2.zak != null) {
            zaE(field2, arrayList2);
        } else {
            zaB(field2, field2.zae, arrayList2);
        }
    }

    public final <O> void zam(@RecentlyNonNull Field<Boolean, O> field, boolean z) {
        Field<Boolean, O> field2 = field;
        boolean z2 = z;
        if (field2.zak != null) {
            zaE(field2, Boolean.valueOf(z2));
        } else {
            setBooleanInternal(field2, field2.zae, z2);
        }
    }

    public final <O> void zan(@RecentlyNonNull Field<ArrayList<Boolean>, O> field, @Nullable ArrayList<Boolean> arrayList) {
        Field<ArrayList<Boolean>, O> field2 = field;
        ArrayList<Boolean> arrayList2 = arrayList;
        if (field2.zak != null) {
            zaE(field2, arrayList2);
        } else {
            zaC(field2, field2.zae, arrayList2);
        }
    }

    public final <O> void zao(@RecentlyNonNull Field<String, O> field, @Nullable String str) {
        Field<String, O> field2 = field;
        String str2 = str;
        if (field2.zak != null) {
            zaE(field2, str2);
        } else {
            setStringInternal(field2, field2.zae, str2);
        }
    }

    public final <O> void zap(@RecentlyNonNull Field<ArrayList<String>, O> field, @Nullable ArrayList<String> arrayList) {
        Field<ArrayList<String>, O> field2 = field;
        ArrayList<String> arrayList2 = arrayList;
        if (field2.zak != null) {
            zaE(field2, arrayList2);
        } else {
            setStringsInternal(field2, field2.zae, arrayList2);
        }
    }

    public final <O> void zaq(@RecentlyNonNull Field<byte[], O> field, @Nullable byte[] bArr) {
        Field<byte[], O> field2 = field;
        byte[] bArr2 = bArr;
        if (field2.zak != null) {
            zaE(field2, bArr2);
        } else {
            setDecodedBytesInternal(field2, field2.zae, bArr2);
        }
    }

    public final <O> void zar(@RecentlyNonNull Field<Map<String, String>, O> field, @Nullable Map<String, String> map) {
        Field<Map<String, String>, O> field2 = field;
        Map<String, String> map2 = map;
        if (field2.zak != null) {
            zaE(field2, map2);
        } else {
            setStringMapInternal(field2, field2.zae, map2);
        }
    }

    /* access modifiers changed from: protected */
    public void zas(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Integer> arrayList) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Integer> arrayList2 = arrayList;
        new UnsupportedOperationException("Integer list not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    public void zat(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable BigInteger bigInteger) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        BigInteger bigInteger2 = bigInteger;
        new UnsupportedOperationException("BigInteger not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    public void zau(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<BigInteger> arrayList) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<BigInteger> arrayList2 = arrayList;
        new UnsupportedOperationException("BigInteger list not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    public void zav(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Long> arrayList) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Long> arrayList2 = arrayList;
        new UnsupportedOperationException("Long list not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    public void zaw(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, float f) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        float f2 = f;
        new UnsupportedOperationException("Float not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    public void zax(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Float> arrayList) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Float> arrayList2 = arrayList;
        new UnsupportedOperationException("Float list not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    public void zay(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, double d) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        double d2 = d;
        new UnsupportedOperationException("Double not supported");
        throw th;
    }

    /* access modifiers changed from: protected */
    public void zaz(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Double> arrayList) {
        Throwable th;
        Field<?, ?> field2 = field;
        String str2 = str;
        ArrayList<Double> arrayList2 = arrayList;
        new UnsupportedOperationException("Double list not supported");
        throw th;
    }

    @C0452ShowFirstParty
    @C0463SafeParcelable.Class(creator = "FieldCreator")
    @C0617VisibleForTesting
    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$Field */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class Field<I, O> extends C0460AbstractSafeParcelable {
        public static final C0570zaj CREATOR;
        @C0463SafeParcelable.Field(getter = "getTypeIn", id = 2)
        protected final int zaa;
        @C0463SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        protected final boolean zab;
        @C0463SafeParcelable.Field(getter = "getTypeOut", id = 4)
        protected final int zac;
        @C0463SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        protected final boolean zad;
        @RecentlyNonNull
        @C0463SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        protected final String zae;
        @C0463SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        protected final int zaf;
        @RecentlyNullable
        protected final Class<? extends C0557FastJsonResponse> zag;
        @C0463SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        @RecentlyNullable
        protected final String zah;
        @C0463SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        private final int zai;
        private C0574zan zaj;
        /* access modifiers changed from: private */
        @C0463SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        @Nullable
        public FieldConverter<I, O> zak;

        static {
            C0570zaj zaj2;
            new C0570zaj();
            CREATOR = zaj2;
        }

        @C0463SafeParcelable.Constructor
        Field(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) int i2, @C0463SafeParcelable.Param(id = 3) boolean z, @C0463SafeParcelable.Param(id = 4) int i3, @C0463SafeParcelable.Param(id = 5) boolean z2, @C0463SafeParcelable.Param(id = 6) String str, @C0463SafeParcelable.Param(id = 7) int i4, @C0463SafeParcelable.Param(id = 8) @Nullable String str2, @C0463SafeParcelable.Param(id = 9) @Nullable C0552zaa zaa2) {
            String str3 = str2;
            C0552zaa zaa3 = zaa2;
            this.zai = i;
            this.zaa = i2;
            this.zab = z;
            this.zac = i3;
            this.zad = z2;
            this.zae = str;
            this.zaf = i4;
            if (str3 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = C0560SafeParcelResponse.class;
                this.zah = str3;
            }
            if (zaa3 == null) {
                this.zak = null;
                return;
            }
            this.zak = zaa3.zab();
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        @com.google.android.gms.common.util.C0617VisibleForTesting
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.gms.common.server.response.C0557FastJsonResponse.Field<byte[], byte[]> forBase64(@androidx.annotation.RecentlyNonNull java.lang.String r12, int r13) {
            /*
                r0 = r12
                r1 = r13
                com.google.android.gms.common.server.response.FastJsonResponse$Field r3 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r2 = r3
                r3 = r2
                r4 = 8
                r5 = 0
                r6 = 8
                r7 = 0
                r8 = r0
                r9 = r1
                r10 = 0
                r11 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r3 = r2
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0557FastJsonResponse.Field.forBase64(java.lang.String, int):com.google.android.gms.common.server.response.FastJsonResponse$Field");
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.gms.common.server.response.C0557FastJsonResponse.Field<java.lang.Boolean, java.lang.Boolean> forBoolean(@androidx.annotation.RecentlyNonNull java.lang.String r12, int r13) {
            /*
                r0 = r12
                r1 = r13
                com.google.android.gms.common.server.response.FastJsonResponse$Field r3 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r2 = r3
                r3 = r2
                r4 = 6
                r5 = 0
                r6 = 6
                r7 = 0
                r8 = r0
                r9 = r1
                r10 = 0
                r11 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r3 = r2
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0557FastJsonResponse.Field.forBoolean(java.lang.String, int):com.google.android.gms.common.server.response.FastJsonResponse$Field");
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <T extends com.google.android.gms.common.server.response.C0557FastJsonResponse> com.google.android.gms.common.server.response.C0557FastJsonResponse.Field<T, T> forConcreteType(@androidx.annotation.RecentlyNonNull java.lang.String r13, int r14, @androidx.annotation.RecentlyNonNull java.lang.Class<T> r15) {
            /*
                r0 = r13
                r1 = r14
                r2 = r15
                com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r3 = r4
                r4 = r3
                r5 = 11
                r6 = 0
                r7 = 11
                r8 = 0
                r9 = r0
                r10 = r1
                r11 = r2
                r12 = 0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                r4 = r3
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0557FastJsonResponse.Field.forConcreteType(java.lang.String, int, java.lang.Class):com.google.android.gms.common.server.response.FastJsonResponse$Field");
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <T extends com.google.android.gms.common.server.response.C0557FastJsonResponse> com.google.android.gms.common.server.response.C0557FastJsonResponse.Field<java.util.ArrayList<T>, java.util.ArrayList<T>> forConcreteTypeArray(@androidx.annotation.RecentlyNonNull java.lang.String r13, int r14, @androidx.annotation.RecentlyNonNull java.lang.Class<T> r15) {
            /*
                r0 = r13
                r1 = r14
                r2 = r15
                com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r3 = r4
                r4 = r3
                r5 = 11
                r6 = 1
                r7 = 11
                r8 = 1
                r9 = r0
                r10 = r1
                r11 = r2
                r12 = 0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                r4 = r3
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0557FastJsonResponse.Field.forConcreteTypeArray(java.lang.String, int, java.lang.Class):com.google.android.gms.common.server.response.FastJsonResponse$Field");
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.gms.common.server.response.C0557FastJsonResponse.Field<java.lang.Double, java.lang.Double> forDouble(@androidx.annotation.RecentlyNonNull java.lang.String r12, int r13) {
            /*
                r0 = r12
                r1 = r13
                com.google.android.gms.common.server.response.FastJsonResponse$Field r3 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r2 = r3
                r3 = r2
                r4 = 4
                r5 = 0
                r6 = 4
                r7 = 0
                r8 = r0
                r9 = r1
                r10 = 0
                r11 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r3 = r2
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0557FastJsonResponse.Field.forDouble(java.lang.String, int):com.google.android.gms.common.server.response.FastJsonResponse$Field");
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.gms.common.server.response.C0557FastJsonResponse.Field<java.lang.Float, java.lang.Float> forFloat(@androidx.annotation.RecentlyNonNull java.lang.String r12, int r13) {
            /*
                r0 = r12
                r1 = r13
                com.google.android.gms.common.server.response.FastJsonResponse$Field r3 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r2 = r3
                r3 = r2
                r4 = 3
                r5 = 0
                r6 = 3
                r7 = 0
                r8 = r0
                r9 = r1
                r10 = 0
                r11 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r3 = r2
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0557FastJsonResponse.Field.forFloat(java.lang.String, int):com.google.android.gms.common.server.response.FastJsonResponse$Field");
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        @com.google.android.gms.common.util.C0617VisibleForTesting
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.gms.common.server.response.C0557FastJsonResponse.Field<java.lang.Integer, java.lang.Integer> forInteger(@androidx.annotation.RecentlyNonNull java.lang.String r12, int r13) {
            /*
                r0 = r12
                r1 = r13
                com.google.android.gms.common.server.response.FastJsonResponse$Field r3 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r2 = r3
                r3 = r2
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = r0
                r9 = r1
                r10 = 0
                r11 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r3 = r2
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0557FastJsonResponse.Field.forInteger(java.lang.String, int):com.google.android.gms.common.server.response.FastJsonResponse$Field");
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.gms.common.server.response.C0557FastJsonResponse.Field<java.lang.Long, java.lang.Long> forLong(@androidx.annotation.RecentlyNonNull java.lang.String r12, int r13) {
            /*
                r0 = r12
                r1 = r13
                com.google.android.gms.common.server.response.FastJsonResponse$Field r3 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r2 = r3
                r3 = r2
                r4 = 2
                r5 = 0
                r6 = 2
                r7 = 0
                r8 = r0
                r9 = r1
                r10 = 0
                r11 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r3 = r2
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0557FastJsonResponse.Field.forLong(java.lang.String, int):com.google.android.gms.common.server.response.FastJsonResponse$Field");
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.gms.common.server.response.C0557FastJsonResponse.Field<java.lang.String, java.lang.String> forString(@androidx.annotation.RecentlyNonNull java.lang.String r12, int r13) {
            /*
                r0 = r12
                r1 = r13
                com.google.android.gms.common.server.response.FastJsonResponse$Field r3 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r2 = r3
                r3 = r2
                r4 = 7
                r5 = 0
                r6 = 7
                r7 = 0
                r8 = r0
                r9 = r1
                r10 = 0
                r11 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r3 = r2
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0557FastJsonResponse.Field.forString(java.lang.String, int):com.google.android.gms.common.server.response.FastJsonResponse$Field");
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.gms.common.server.response.C0557FastJsonResponse.Field<java.util.HashMap<java.lang.String, java.lang.String>, java.util.HashMap<java.lang.String, java.lang.String>> forStringMap(@androidx.annotation.RecentlyNonNull java.lang.String r12, int r13) {
            /*
                r0 = r12
                r1 = r13
                com.google.android.gms.common.server.response.FastJsonResponse$Field r3 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r2 = r3
                r3 = r2
                r4 = 10
                r5 = 0
                r6 = 10
                r7 = 0
                r8 = r0
                r9 = r1
                r10 = 0
                r11 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r3 = r2
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0557FastJsonResponse.Field.forStringMap(java.lang.String, int):com.google.android.gms.common.server.response.FastJsonResponse$Field");
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        @com.google.android.gms.common.annotation.C0206KeepForSdk
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.gms.common.server.response.C0557FastJsonResponse.Field<java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>> forStrings(@androidx.annotation.RecentlyNonNull java.lang.String r12, int r13) {
            /*
                r0 = r12
                r1 = r13
                com.google.android.gms.common.server.response.FastJsonResponse$Field r3 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r2 = r3
                r3 = r2
                r4 = 7
                r5 = 1
                r6 = 7
                r7 = 1
                r8 = r0
                r9 = r1
                r10 = 0
                r11 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r3 = r2
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0557FastJsonResponse.Field.forStrings(java.lang.String, int):com.google.android.gms.common.server.response.FastJsonResponse$Field");
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public static Field withConverter(@RecentlyNonNull String str, int i, @RecentlyNonNull FieldConverter<?, ?> fieldConverter, boolean z) {
            Field field;
            FieldConverter<?, ?> fieldConverter2 = fieldConverter;
            int zaa2 = fieldConverter2.zaa();
            int zab2 = fieldConverter2.zab();
            new Field(7, z, 0, false, str, i, (Class<? extends C0557FastJsonResponse>) null, fieldConverter2);
            return field;
        }

        @C0206KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        @RecentlyNonNull
        public final String toString() {
            C0444Objects.ToStringHelper add = C0444Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.zai)).add("typeIn", Integer.valueOf(this.zaa)).add("typeInArray", Boolean.valueOf(this.zab)).add("typeOut", Integer.valueOf(this.zac)).add("typeOutArray", Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", Integer.valueOf(this.zaf)).add("concreteTypeName", zab());
            Class<? extends C0557FastJsonResponse> cls = this.zag;
            if (cls != null) {
                C0444Objects.ToStringHelper add2 = add.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.zak;
            if (fieldConverter != null) {
                C0444Objects.ToStringHelper add3 = add.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return add.toString();
        }

        public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
            C0462SafeParcelWriter.writeInt(parcel2, 1, this.zai);
            C0462SafeParcelWriter.writeInt(parcel2, 2, this.zaa);
            C0462SafeParcelWriter.writeBoolean(parcel2, 3, this.zab);
            C0462SafeParcelWriter.writeInt(parcel2, 4, this.zac);
            C0462SafeParcelWriter.writeBoolean(parcel2, 5, this.zad);
            C0462SafeParcelWriter.writeString(parcel2, 6, this.zae, false);
            C0462SafeParcelWriter.writeInt(parcel2, 7, getSafeParcelableFieldId());
            C0462SafeParcelWriter.writeString(parcel2, 8, zab(), false);
            C0462SafeParcelWriter.writeParcelable(parcel2, 9, zae(), i, false);
            C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
        }

        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.android.gms.common.server.response.C0557FastJsonResponse.Field<I, O> zaa() {
            /*
                r12 = this;
                r0 = r12
                com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = r2
                r2 = r1
                r3 = r0
                int r3 = r3.zai
                r4 = r0
                int r4 = r4.zaa
                r5 = r0
                boolean r5 = r5.zab
                r6 = r0
                int r6 = r6.zac
                r7 = r0
                boolean r7 = r7.zad
                r8 = r0
                java.lang.String r8 = r8.zae
                r9 = r0
                int r9 = r9.zaf
                r10 = r0
                java.lang.String r10 = r10.zah
                r11 = r0
                com.google.android.gms.common.server.converter.zaa r11 = r11.zae()
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r2 = r1
                r0 = r2
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0557FastJsonResponse.Field.zaa():com.google.android.gms.common.server.response.FastJsonResponse$Field");
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public final String zab() {
            String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final boolean zac() {
            return this.zak != null;
        }

        public final void zad(C0574zan zan) {
            C0574zan zan2 = zan;
            this.zaj = zan2;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public final C0552zaa zae() {
            FieldConverter<I, O> fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return C0552zaa.zaa(fieldConverter);
        }

        @RecentlyNonNull
        public final C0557FastJsonResponse zaf() throws InstantiationException, IllegalAccessException {
            C0557FastJsonResponse fastJsonResponse;
            Object checkNotNull = C0446Preconditions.checkNotNull(this.zag);
            Class<? extends C0557FastJsonResponse> cls = this.zag;
            if (cls != C0560SafeParcelResponse.class) {
                return (C0557FastJsonResponse) cls.newInstance();
            }
            Object checkNotNull2 = C0446Preconditions.checkNotNull(this.zah);
            Object checkNotNull3 = C0446Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            new C0560SafeParcelResponse(this.zaj, this.zah);
            return fastJsonResponse;
        }

        @RecentlyNonNull
        public final Map<String, Field<?, ?>> zag() {
            Object checkNotNull = C0446Preconditions.checkNotNull(this.zah);
            Object checkNotNull2 = C0446Preconditions.checkNotNull(this.zaj);
            return (Map) C0446Preconditions.checkNotNull(this.zaj.zad(this.zah));
        }

        @RecentlyNonNull
        public final O zah(@Nullable I i) {
            Object checkNotNull = C0446Preconditions.checkNotNull(this.zak);
            return C0446Preconditions.checkNotNull(this.zak.zad(i));
        }

        @RecentlyNonNull
        public final I zai(@RecentlyNonNull O o) {
            Object checkNotNull = C0446Preconditions.checkNotNull(this.zak);
            return this.zak.zac(o);
        }

        protected Field(int i, boolean z, int i2, boolean z2, @RecentlyNonNull String str, int i3, @Nullable Class<? extends C0557FastJsonResponse> cls, @Nullable FieldConverter<I, O> fieldConverter) {
            Class<? extends C0557FastJsonResponse> cls2 = cls;
            FieldConverter<I, O> fieldConverter2 = fieldConverter;
            this.zai = 1;
            this.zaa = i;
            this.zab = z;
            this.zac = i2;
            this.zad = z2;
            this.zae = str;
            this.zaf = i3;
            this.zag = cls2;
            if (cls2 == null) {
                this.zah = null;
            } else {
                this.zah = cls2.getCanonicalName();
            }
            this.zak = fieldConverter2;
        }
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    @RecentlyNullable
    public Object getFieldValue(@RecentlyNonNull Field field) {
        boolean z;
        Throwable th;
        StringBuilder sb;
        Field field2 = field;
        String str = field2.zae;
        if (field2.zag == null) {
            return getValueObject(str);
        }
        if (getValueObject(str) == null) {
            z = true;
        } else {
            z = false;
        }
        C0446Preconditions.checkState(z, "Concrete field shouldn't be value object: %s", field2.zae);
        boolean z2 = field2.zad;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            new StringBuilder(String.valueOf(substring).length() + 4);
            StringBuilder append = sb.append("get");
            StringBuilder append2 = sb.append(upperCase);
            StringBuilder append3 = sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            new RuntimeException(e);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public boolean isFieldSet(@RecentlyNonNull Field field) {
        Throwable th;
        Throwable th2;
        Field field2 = field;
        if (field2.zac != 11) {
            return isPrimitiveFieldSet(field2.zae);
        }
        if (field2.zad) {
            String str = field2.zae;
            new UnsupportedOperationException("Concrete type arrays not supported");
            throw th2;
        }
        String str2 = field2.zae;
        new UnsupportedOperationException("Concrete types not supported");
        throw th;
    }
}

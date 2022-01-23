package com.google.android.gms.common.server.response;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.server.response.C0557FastJsonResponse;
import com.google.android.gms.common.util.C0589Base64Utils;
import com.google.android.gms.common.util.C0605JsonUtils;
import com.microsoft.appcenter.crashes.utils.ErrorLogHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

@C0452ShowFirstParty
@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.server.response.FastParser */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0558FastParser<T extends C0557FastJsonResponse> {
    private static final char[] zaf = {'u', 'l', 'l'};
    private static final char[] zag = {'r', 'u', 'e'};
    private static final char[] zah = {'r', 'u', 'e', '\"'};
    private static final char[] zai = {'a', 'l', 's', 'e'};
    private static final char[] zaj = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zak = {10};
    private static final C0569zai<Integer> zam;
    private static final C0569zai<Long> zan;
    private static final C0569zai<Float> zao;
    private static final C0569zai<Double> zap;
    private static final C0569zai<Boolean> zaq;
    private static final C0569zai<String> zar;
    private static final C0569zai<BigInteger> zas;
    private static final C0569zai<BigDecimal> zat;
    private final char[] zaa = new char[1];
    private final char[] zab = new char[32];
    private final char[] zac = new char[1024];
    private final StringBuilder zad;
    private final StringBuilder zae;
    private final Stack<Integer> zal;

    @C0452ShowFirstParty
    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.server.response.FastParser$ParseException */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class ParseException extends Exception {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ParseException(@RecentlyNonNull String str) {
            super(str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ParseException(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super("Error instantiating inner object", th);
            String str2 = str;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ParseException(@RecentlyNonNull Throwable th) {
            super(th);
        }
    }

    static {
        C0569zai<Integer> zai2;
        C0569zai<Long> zai3;
        C0569zai<Float> zai4;
        C0569zai<Double> zai5;
        C0569zai<Boolean> zai6;
        C0569zai<String> zai7;
        C0569zai<BigInteger> zai8;
        C0569zai<BigDecimal> zai9;
        new C0561zaa();
        zam = zai2;
        new C0562zab();
        zan = zai3;
        new C0563zac();
        zao = zai4;
        new C0564zad();
        zap = zai5;
        new C0565zae();
        zaq = zai6;
        new C0566zaf();
        zar = zai7;
        new C0567zag();
        zas = zai8;
        new C0568zah();
        zat = zai9;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0558FastParser() {
        /*
            r4 = this;
            r0 = r4
            r2 = r0
            r2.<init>()
            r2 = r0
            r3 = 1
            char[] r3 = new char[r3]
            r2.zaa = r3
            r2 = r0
            r3 = 32
            char[] r3 = new char[r3]
            r2.zab = r3
            r2 = r0
            r3 = 1024(0x400, float:1.435E-42)
            char[] r3 = new char[r3]
            r2.zac = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r1 = r2
            r2 = r1
            r3 = 32
            r2.<init>(r3)
            r2 = r0
            r3 = r1
            r2.zad = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r1 = r2
            r2 = r1
            r3 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3)
            r2 = r0
            r3 = r1
            r2.zae = r3
            java.util.Stack r2 = new java.util.Stack
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zal = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.C0558FastParser.<init>():void");
    }

    private static final String zaA(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        Throwable th;
        boolean z;
        Throwable th2;
        BufferedReader bufferedReader2 = bufferedReader;
        char[] cArr3 = cArr;
        StringBuilder sb2 = sb;
        char[] cArr4 = cArr2;
        sb2.setLength(0);
        bufferedReader2.mark(cArr3.length);
        boolean z2 = false;
        boolean z3 = false;
        loop0:
        while (true) {
            boolean z4 = z3;
            int read = bufferedReader2.read(cArr3);
            if (read != -1) {
                boolean z5 = z4;
                int i = 0;
                while (i < read) {
                    char c = cArr3[i];
                    if (Character.isISOControl(c)) {
                        if (cArr4 == null) {
                            break loop0;
                        }
                        int i2 = 0;
                        while (i2 < cArr4.length) {
                            if (cArr4[i2] != c) {
                                i2++;
                            }
                        }
                        break loop0;
                    }
                    if (c == '\"') {
                        if (!z2) {
                            StringBuilder append = sb2.append(cArr3, 0, i);
                            bufferedReader2.reset();
                            long skip = bufferedReader2.skip((long) (i + 1));
                            if (z5) {
                                return C0605JsonUtils.unescapeString(sb2.toString());
                            }
                            return sb2.toString();
                        }
                        z2 = false;
                        z = z5;
                    } else if (c == '\\') {
                        z2 = !z2;
                        z = true;
                    } else {
                        z2 = false;
                        z = z5;
                    }
                    i++;
                    z5 = z;
                }
                StringBuilder append2 = sb2.append(cArr3, 0, read);
                bufferedReader2.mark(cArr3.length);
                z3 = z5;
            } else {
                new ParseException("Unexpected EOF while parsing string");
                throw th;
            }
        }
        new ParseException("Unexpected control character while reading string");
        throw th2;
    }

    static /* synthetic */ boolean zae(C0558FastParser fastParser, BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        boolean z2 = z;
        return fastParser.zar(bufferedReader, false);
    }

    private final boolean zai(BufferedReader bufferedReader, C0557FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        Throwable th6;
        StringBuilder sb2;
        Throwable th7;
        HashMap hashMap;
        Throwable th8;
        String str;
        ParseException parseException;
        String str2;
        ParseException parseException2;
        Throwable th9;
        StringBuilder sb3;
        BufferedReader bufferedReader2 = bufferedReader;
        C0557FastJsonResponse fastJsonResponse2 = fastJsonResponse;
        Map<String, C0557FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse2.getFieldMappings();
        String zaj2 = zaj(bufferedReader2);
        if (zaj2 != null) {
            while (zaj2 != null) {
                C0557FastJsonResponse.Field field = fieldMappings.get(zaj2);
                if (field == null) {
                    zaj2 = zak(bufferedReader2);
                } else {
                    Integer push = this.zal.push(4);
                    int i = field.zaa;
                    switch (i) {
                        case 0:
                            if (!field.zab) {
                                fastJsonResponse2.zaa(field, zao(bufferedReader2));
                                break;
                            } else {
                                fastJsonResponse2.zab(field, zam(bufferedReader2, zam));
                                break;
                            }
                        case 1:
                            if (!field.zab) {
                                fastJsonResponse2.zac(field, zaq(bufferedReader2));
                                break;
                            } else {
                                fastJsonResponse2.zad(field, zam(bufferedReader2, zas));
                                break;
                            }
                        case 2:
                            if (!field.zab) {
                                fastJsonResponse2.zae(field, zap(bufferedReader2));
                                break;
                            } else {
                                fastJsonResponse2.zaf(field, zam(bufferedReader2, zan));
                                break;
                            }
                        case 3:
                            if (!field.zab) {
                                fastJsonResponse2.zag(field, zas(bufferedReader2));
                                break;
                            } else {
                                fastJsonResponse2.zah(field, zam(bufferedReader2, zao));
                                break;
                            }
                        case 4:
                            if (!field.zab) {
                                fastJsonResponse2.zai(field, zat(bufferedReader2));
                                break;
                            } else {
                                fastJsonResponse2.zaj(field, zam(bufferedReader2, zap));
                                break;
                            }
                        case 5:
                            if (!field.zab) {
                                fastJsonResponse2.zak(field, zau(bufferedReader2));
                                break;
                            } else {
                                fastJsonResponse2.zal(field, zam(bufferedReader2, zat));
                                break;
                            }
                        case 6:
                            if (!field.zab) {
                                fastJsonResponse2.zam(field, zar(bufferedReader2, false));
                                break;
                            } else {
                                fastJsonResponse2.zan(field, zam(bufferedReader2, zaq));
                                break;
                            }
                        case 7:
                            if (!field.zab) {
                                fastJsonResponse2.zao(field, zal(bufferedReader2));
                                break;
                            } else {
                                fastJsonResponse2.zap(field, zam(bufferedReader2, zar));
                                break;
                            }
                        case 8:
                            fastJsonResponse2.zaq(field, C0589Base64Utils.decode(zan(bufferedReader2, this.zac, this.zae, zak)));
                            break;
                        case 9:
                            fastJsonResponse2.zaq(field, C0589Base64Utils.decodeUrlSafe(zan(bufferedReader2, this.zac, this.zae, zak)));
                            break;
                        case 10:
                            char zaw = zaw(bufferedReader2);
                            if (zaw != 'n') {
                                if (zaw == '{') {
                                    Integer push2 = this.zal.push(1);
                                    new HashMap();
                                    while (true) {
                                        switch (zaw(bufferedReader2)) {
                                            case 0:
                                                new ParseException("Unexpected EOF");
                                                throw th8;
                                            case '\"':
                                                String zaA = zaA(bufferedReader2, this.zab, this.zad, (char[]) null);
                                                if (zaw(bufferedReader2) == ':') {
                                                    if (zaw(bufferedReader2) == '\"') {
                                                        Object put = hashMap.put(zaA, zaA(bufferedReader2, this.zab, this.zad, (char[]) null));
                                                        char zaw2 = zaw(bufferedReader2);
                                                        if (zaw2 == ',') {
                                                            break;
                                                        } else if (zaw2 == '}') {
                                                            zaz(1);
                                                            break;
                                                        } else {
                                                            new StringBuilder(48);
                                                            StringBuilder append = sb3.append("Unexpected character while parsing string map: ");
                                                            StringBuilder append2 = sb3.append(zaw2);
                                                            new ParseException(sb3.toString());
                                                            throw th9;
                                                        }
                                                    } else {
                                                        String valueOf = String.valueOf(zaA);
                                                        String str3 = "Expected String value for key ";
                                                        if (valueOf.length() != 0) {
                                                            str2 = str3.concat(valueOf);
                                                        } else {
                                                            new String(str3);
                                                        }
                                                        parseException2 = new ParseException(str2);
                                                        throw r2;
                                                    }
                                                } else {
                                                    String valueOf2 = String.valueOf(zaA);
                                                    String str4 = "No map value found for key ";
                                                    if (valueOf2.length() != 0) {
                                                        str = str4.concat(valueOf2);
                                                    } else {
                                                        new String(str4);
                                                    }
                                                    parseException = new ParseException(str);
                                                    throw r2;
                                                }
                                            case ErrorLogHelper.MAX_PROPERTY_ITEM_LENGTH /*125*/:
                                                zaz(1);
                                                break;
                                        }
                                    }
                                } else {
                                    new ParseException("Expected start of a map object");
                                    throw th7;
                                }
                            } else {
                                zay(bufferedReader2, zaf);
                                hashMap = null;
                            }
                            fastJsonResponse2.zar(field, hashMap);
                            break;
                        case 11:
                            if (field.zab) {
                                char zaw3 = zaw(bufferedReader2);
                                if (zaw3 == 'n') {
                                    zay(bufferedReader2, zaf);
                                    fastJsonResponse2.addConcreteTypeArrayInternal(field, field.zae, (ArrayList) null);
                                    break;
                                } else {
                                    Integer push3 = this.zal.push(5);
                                    if (zaw3 == '[') {
                                        fastJsonResponse2.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader2, field));
                                        break;
                                    } else {
                                        new ParseException("Expected array start");
                                        throw th5;
                                    }
                                }
                            } else {
                                char zaw4 = zaw(bufferedReader2);
                                if (zaw4 == 'n') {
                                    zay(bufferedReader2, zaf);
                                    fastJsonResponse2.addConcreteTypeInternal(field, field.zae, null);
                                    break;
                                } else {
                                    Integer push4 = this.zal.push(1);
                                    if (zaw4 != '{') {
                                        new ParseException("Expected start of object");
                                        throw th2;
                                    }
                                    try {
                                        C0557FastJsonResponse zaf2 = field.zaf();
                                        boolean zai2 = zai(bufferedReader2, zaf2);
                                        fastJsonResponse2.addConcreteTypeInternal(field, field.zae, zaf2);
                                        break;
                                    } catch (InstantiationException e) {
                                        new ParseException("Error instantiating inner object", e);
                                        throw th3;
                                    } catch (IllegalAccessException e2) {
                                        new ParseException("Error instantiating inner object", e2);
                                        throw th4;
                                    }
                                }
                            }
                        default:
                            new StringBuilder(30);
                            StringBuilder append3 = sb.append("Invalid field type ");
                            StringBuilder append4 = sb.append(i);
                            new ParseException(sb.toString());
                            throw th;
                    }
                    zaz(4);
                    zaz(2);
                    char zaw5 = zaw(bufferedReader2);
                    switch (zaw5) {
                        case ',':
                            zaj2 = zaj(bufferedReader2);
                            break;
                        case ErrorLogHelper.MAX_PROPERTY_ITEM_LENGTH /*125*/:
                            zaj2 = null;
                            break;
                        default:
                            new StringBuilder(55);
                            StringBuilder append5 = sb2.append("Expected end of object or field separator, but found: ");
                            StringBuilder append6 = sb2.append(zaw5);
                            new ParseException(sb2.toString());
                            throw th6;
                    }
                }
            }
            zaz(1);
            return true;
        }
        zaz(1);
        return false;
    }

    @Nullable
    private final String zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        Throwable th;
        Throwable th2;
        StringBuilder sb;
        BufferedReader bufferedReader2 = bufferedReader;
        Integer push = this.zal.push(2);
        char zaw = zaw(bufferedReader2);
        switch (zaw) {
            case '\"':
                Integer push2 = this.zal.push(3);
                String zaA = zaA(bufferedReader2, this.zab, this.zad, (char[]) null);
                zaz(3);
                if (zaw(bufferedReader2) == ':') {
                    return zaA;
                }
                new ParseException("Expected key/value separator");
                throw th;
            case ']':
                zaz(2);
                zaz(1);
                zaz(5);
                return null;
            case ErrorLogHelper.MAX_PROPERTY_ITEM_LENGTH /*125*/:
                zaz(2);
                return null;
            default:
                new StringBuilder(19);
                StringBuilder append = sb.append("Unexpected token: ");
                StringBuilder append2 = sb.append(zaw);
                new ParseException(sb.toString());
                throw th2;
        }
    }

    @Nullable
    private final String zak(BufferedReader bufferedReader) throws ParseException, IOException {
        Throwable th;
        char c;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        Throwable th6;
        boolean z;
        char c2;
        int i;
        Throwable th7;
        StringBuilder sb;
        Throwable th8;
        StringBuilder sb2;
        BufferedReader bufferedReader2 = bufferedReader;
        bufferedReader2.mark(1024);
        switch (zaw(bufferedReader2)) {
            case '\"':
                if (bufferedReader2.read(this.zaa) == -1) {
                    new ParseException("Unexpected EOF while parsing string");
                    throw th4;
                }
                char c3 = this.zaa[0];
                boolean z2 = false;
                do {
                    if (c3 == '\"') {
                        if (!z2) {
                            break;
                        } else {
                            z2 = true;
                            c = '\"';
                        }
                    } else {
                        c = c3;
                    }
                    if (c == '\\') {
                        z2 = !z2;
                    } else {
                        z2 = false;
                    }
                    if (bufferedReader2.read(this.zaa) == -1) {
                        new ParseException("Unexpected EOF while parsing string");
                        throw th2;
                    }
                    c3 = this.zaa[0];
                } while (!Character.isISOControl(c3));
                new ParseException("Unexpected control character while reading string");
                throw th3;
            case ',':
                new ParseException("Missing value");
                throw th;
            case '[':
                Integer push = this.zal.push(5);
                bufferedReader2.mark(32);
                if (zaw(bufferedReader2) != ']') {
                    bufferedReader2.reset();
                    boolean z3 = false;
                    boolean z4 = false;
                    int i2 = 1;
                    while (i2 > 0) {
                        char zaw = zaw(bufferedReader2);
                        if (zaw == 0) {
                            new ParseException("Unexpected EOF while parsing array");
                            throw th5;
                        } else if (Character.isISOControl(zaw)) {
                            new ParseException("Unexpected control character while reading array");
                            throw th6;
                        } else {
                            if (zaw != '\"') {
                                z = z4;
                            } else if (!z3) {
                                z = !z4;
                                zaw = '\"';
                            } else {
                                zaw = '\"';
                                z = z4;
                            }
                            if (zaw != '[') {
                                c2 = zaw;
                                i = i2;
                            } else if (!z) {
                                i = i2 + 1;
                                c2 = '[';
                            } else {
                                c2 = '[';
                                i = i2;
                            }
                            i2 = c2 == ']' ? !z ? i - 1 : i : i;
                            if (c2 != '\\') {
                                z3 = false;
                                z4 = z;
                            } else if (z) {
                                z3 = !z3;
                                z4 = z;
                            } else {
                                z3 = false;
                                z4 = z;
                            }
                        }
                    }
                    zaz(5);
                    break;
                } else {
                    zaz(5);
                    break;
                }
            case '{':
                Integer push2 = this.zal.push(1);
                bufferedReader2.mark(32);
                char zaw2 = zaw(bufferedReader2);
                if (zaw2 == '}') {
                    zaz(1);
                    break;
                } else if (zaw2 == '\"') {
                    bufferedReader2.reset();
                    String zaj2 = zaj(bufferedReader2);
                    do {
                    } while (zak(bufferedReader2) != null);
                    zaz(1);
                    break;
                } else {
                    new StringBuilder(18);
                    StringBuilder append = sb.append("Unexpected token ");
                    StringBuilder append2 = sb.append(zaw2);
                    new ParseException(sb.toString());
                    throw th7;
                }
            default:
                bufferedReader2.reset();
                int zax = zax(bufferedReader2, this.zac);
                break;
        }
        char zaw3 = zaw(bufferedReader2);
        switch (zaw3) {
            case ',':
                zaz(2);
                return zaj(bufferedReader2);
            case ErrorLogHelper.MAX_PROPERTY_ITEM_LENGTH /*125*/:
                zaz(2);
                return null;
            default:
                new StringBuilder(18);
                StringBuilder append3 = sb2.append("Unexpected token ");
                StringBuilder append4 = sb2.append(zaw3);
                new ParseException(sb2.toString());
                throw th8;
        }
    }

    /* access modifiers changed from: private */
    @Nullable
    public final String zal(BufferedReader bufferedReader) throws ParseException, IOException {
        return zan(bufferedReader, this.zab, this.zad, (char[]) null);
    }

    @Nullable
    private final <O> ArrayList<O> zam(BufferedReader bufferedReader, C0569zai<O> zai2) throws ParseException, IOException {
        ArrayList arrayList;
        Throwable th;
        Throwable th2;
        BufferedReader bufferedReader2 = bufferedReader;
        C0569zai<O> zai3 = zai2;
        char zaw = zaw(bufferedReader2);
        if (zaw != 'n') {
            if (zaw == '[') {
                Integer push = this.zal.push(5);
                new ArrayList<>();
                while (true) {
                    bufferedReader2.mark(1024);
                    switch (zaw(bufferedReader2)) {
                        case 0:
                            new ParseException("Unexpected EOF");
                            throw th;
                        case ',':
                            break;
                        case ']':
                            zaz(5);
                            return arrayList;
                        default:
                            bufferedReader2.reset();
                            boolean add = arrayList.add(zai3.zaa(this, bufferedReader2));
                            break;
                    }
                }
            } else {
                new ParseException("Expected start of array");
                throw th2;
            }
        } else {
            zay(bufferedReader2, zaf);
            return null;
        }
    }

    @Nullable
    private final String zan(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        Throwable th;
        BufferedReader bufferedReader2 = bufferedReader;
        char[] cArr3 = cArr;
        StringBuilder sb2 = sb;
        char[] cArr4 = cArr2;
        switch (zaw(bufferedReader2)) {
            case '\"':
                return zaA(bufferedReader2, cArr3, sb2, cArr4);
            case 'n':
                zay(bufferedReader2, zaf);
                return null;
            default:
                new ParseException("Expected string");
                throw th;
        }
    }

    /* access modifiers changed from: private */
    public final int zao(BufferedReader bufferedReader) throws ParseException, IOException {
        Throwable th;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        Throwable th6;
        int zax = zax(bufferedReader, this.zac);
        if (zax == 0) {
            return 0;
        }
        char[] cArr = this.zac;
        if (zax > 0) {
            char c = cArr[0];
            if (c == '-') {
                i = Integer.MIN_VALUE;
            } else {
                i = -2147483647;
            }
            if (c == '-') {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i2 < zax) {
                i3 = i2 + 1;
                int digit = Character.digit(cArr[i2], 10);
                if (digit < 0) {
                    new ParseException("Unexpected non-digit character");
                    throw th6;
                }
                i4 = -digit;
            } else {
                i4 = 0;
                i3 = i2;
            }
            while (i3 < zax) {
                int i6 = i3 + 1;
                int digit2 = Character.digit(cArr[i3], 10);
                if (digit2 < 0) {
                    new ParseException("Unexpected non-digit character");
                    throw th3;
                } else if (i4 < -214748364) {
                    new ParseException("Number too large");
                    throw th4;
                } else {
                    int i7 = i4 * 10;
                    if (i7 < i + digit2) {
                        new ParseException("Number too large");
                        throw th5;
                    }
                    i4 = i7 - digit2;
                    i3 = i6;
                }
            }
            if (i2 == 0) {
                i5 = -i4;
            } else if (i3 > 1) {
                i5 = i4;
            } else {
                new ParseException("No digits to parse");
                throw th2;
            }
            return i5;
        }
        new ParseException("No number to parse");
        throw th;
    }

    /* access modifiers changed from: private */
    public final long zap(BufferedReader bufferedReader) throws ParseException, IOException {
        Throwable th;
        long j;
        int i;
        long j2;
        int i2;
        long j3;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        Throwable th6;
        int zax = zax(bufferedReader, this.zac);
        if (zax == 0) {
            return 0;
        }
        char[] cArr = this.zac;
        if (zax > 0) {
            char c = cArr[0];
            if (c == '-') {
                j = Long.MIN_VALUE;
            } else {
                j = -9223372036854775807L;
            }
            if (c == '-') {
                i = 1;
            } else {
                i = 0;
            }
            if (i < zax) {
                i2 = i + 1;
                int digit = Character.digit(cArr[i], 10);
                if (digit < 0) {
                    new ParseException("Unexpected non-digit character");
                    throw th6;
                }
                j2 = (long) (-digit);
            } else {
                j2 = 0;
                i2 = i;
            }
            while (i2 < zax) {
                int i3 = i2 + 1;
                int digit2 = Character.digit(cArr[i2], 10);
                if (digit2 < 0) {
                    new ParseException("Unexpected non-digit character");
                    throw th3;
                } else if (j2 < -922337203685477580L) {
                    new ParseException("Number too large");
                    throw th4;
                } else {
                    long j4 = j2 * 10;
                    long j5 = (long) digit2;
                    if (j4 < j + j5) {
                        new ParseException("Number too large");
                        throw th5;
                    }
                    j2 = j4 - j5;
                    i2 = i3;
                }
            }
            if (i == 0) {
                j3 = -j2;
            } else if (i2 > 1) {
                j3 = j2;
            } else {
                new ParseException("No digits to parse");
                throw th2;
            }
            return j3;
        }
        new ParseException("No number to parse");
        throw th;
    }

    /* access modifiers changed from: private */
    @Nullable
    public final BigInteger zaq(BufferedReader bufferedReader) throws ParseException, IOException {
        BigInteger bigInteger;
        String str;
        int zax = zax(bufferedReader, this.zac);
        if (zax == 0) {
            return null;
        }
        new String(this.zac, 0, zax);
        new BigInteger(str);
        return bigInteger;
    }

    private final boolean zar(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        char[] cArr;
        Throwable th;
        char[] cArr2;
        Throwable th2;
        StringBuilder sb;
        BufferedReader bufferedReader2 = bufferedReader;
        boolean z2 = z;
        char zaw = zaw(bufferedReader2);
        switch (zaw) {
            case '\"':
                if (!z2) {
                    return zar(bufferedReader2, true);
                }
                new ParseException("No boolean value found in string");
                throw th;
            case 'f':
                if (z2) {
                    cArr = zaj;
                } else {
                    cArr = zai;
                }
                zay(bufferedReader2, cArr);
                return false;
            case 'n':
                zay(bufferedReader2, zaf);
                return false;
            case 't':
                if (z2) {
                    cArr2 = zah;
                } else {
                    cArr2 = zag;
                }
                zay(bufferedReader2, cArr2);
                return true;
            default:
                new StringBuilder(19);
                StringBuilder append = sb.append("Unexpected token: ");
                StringBuilder append2 = sb.append(zaw);
                new ParseException(sb.toString());
                throw th2;
        }
    }

    /* access modifiers changed from: private */
    public final float zas(BufferedReader bufferedReader) throws ParseException, IOException {
        String str;
        int zax = zax(bufferedReader, this.zac);
        if (zax == 0) {
            return 0.0f;
        }
        new String(this.zac, 0, zax);
        return Float.parseFloat(str);
    }

    /* access modifiers changed from: private */
    public final double zat(BufferedReader bufferedReader) throws ParseException, IOException {
        String str;
        int zax = zax(bufferedReader, this.zac);
        if (zax == 0) {
            return 0.0d;
        }
        new String(this.zac, 0, zax);
        return Double.parseDouble(str);
    }

    /* access modifiers changed from: private */
    @Nullable
    public final BigDecimal zau(BufferedReader bufferedReader) throws ParseException, IOException {
        BigDecimal bigDecimal;
        String str;
        int zax = zax(bufferedReader, this.zac);
        if (zax == 0) {
            return null;
        }
        new String(this.zac, 0, zax);
        new BigDecimal(str);
        return bigDecimal;
    }

    @Nullable
    private final <T extends C0557FastJsonResponse> ArrayList<T> zav(BufferedReader bufferedReader, C0557FastJsonResponse.Field<?, ?> field) throws ParseException, IOException {
        ArrayList<T> arrayList;
        Throwable th;
        Throwable th2;
        Throwable th3;
        StringBuilder sb;
        Throwable th4;
        Throwable th5;
        StringBuilder sb2;
        BufferedReader bufferedReader2 = bufferedReader;
        C0557FastJsonResponse.Field<?, ?> field2 = field;
        new ArrayList<>();
        char zaw = zaw(bufferedReader2);
        switch (zaw) {
            case ']':
                zaz(5);
                return arrayList;
            case 'n':
                zay(bufferedReader2, zaf);
                zaz(5);
                return null;
            case '{':
                Integer push = this.zal.push(1);
                while (true) {
                    try {
                        C0557FastJsonResponse zaf2 = field2.zaf();
                        if (!zai(bufferedReader2, zaf2)) {
                            return arrayList;
                        }
                        boolean add = arrayList.add(zaf2);
                        char zaw2 = zaw(bufferedReader2);
                        switch (zaw2) {
                            case ',':
                                if (zaw(bufferedReader2) != '{') {
                                    new ParseException("Expected start of next object in array");
                                    throw th4;
                                }
                                Integer push2 = this.zal.push(1);
                            case ']':
                                zaz(5);
                                return arrayList;
                            default:
                                new StringBuilder(19);
                                StringBuilder append = sb.append("Unexpected token: ");
                                StringBuilder append2 = sb.append(zaw2);
                                new ParseException(sb.toString());
                                throw th3;
                        }
                    } catch (InstantiationException e) {
                        new ParseException("Error instantiating inner object", e);
                        throw th2;
                    } catch (IllegalAccessException e2) {
                        new ParseException("Error instantiating inner object", e2);
                        throw th;
                    }
                }
            default:
                new StringBuilder(19);
                StringBuilder append3 = sb2.append("Unexpected token: ");
                StringBuilder append4 = sb2.append(zaw);
                new ParseException(sb2.toString());
                throw th5;
        }
    }

    private final char zaw(BufferedReader bufferedReader) throws ParseException, IOException {
        BufferedReader bufferedReader2 = bufferedReader;
        if (bufferedReader2.read(this.zaa) == -1) {
            return 0;
        }
        while (Character.isWhitespace(this.zaa[0])) {
            if (bufferedReader2.read(this.zaa) == -1) {
                return 0;
            }
        }
        return this.zaa[0];
    }

    private final int zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i;
        Throwable th;
        Throwable th2;
        Throwable th3;
        boolean z;
        Throwable th4;
        Throwable th5;
        BufferedReader bufferedReader2 = bufferedReader;
        char[] cArr2 = cArr;
        char zaw = zaw(bufferedReader2);
        if (zaw == 0) {
            new ParseException("Unexpected EOF");
            throw th5;
        } else if (zaw == ',') {
            new ParseException("Missing value");
            throw th4;
        } else if (zaw == 'n') {
            zay(bufferedReader2, zaf);
            return 0;
        } else {
            bufferedReader2.mark(1024);
            if (zaw == '\"') {
                i = 0;
                boolean z2 = false;
                while (i < cArr2.length && bufferedReader2.read(cArr2, i, 1) != -1) {
                    char c = cArr2[i];
                    if (Character.isISOControl(c)) {
                        new ParseException("Unexpected control character while reading string");
                        throw th3;
                    }
                    if (c != '\"') {
                        z = c == '\\' ? !z2 : false;
                    } else if (z2) {
                        z = false;
                    } else {
                        bufferedReader2.reset();
                        long skip = bufferedReader2.skip((long) (i + 1));
                        return i;
                    }
                    z2 = z;
                    i++;
                }
            } else {
                cArr2[0] = zaw;
                int i2 = 1;
                while (i < cArr2.length && bufferedReader2.read(cArr2, i, 1) != -1) {
                    char c2 = cArr2[i];
                    if (c2 == '}' || c2 == ',' || Character.isWhitespace(c2) || cArr2[i] == ']') {
                        bufferedReader2.reset();
                        long skip2 = bufferedReader2.skip((long) (i - 1));
                        cArr2[i] = 0;
                        return i;
                    }
                    i2 = i + 1;
                }
            }
            if (i == cArr2.length) {
                new ParseException("Absurdly long value");
                throw th2;
            }
            new ParseException("Unexpected EOF");
            throw th;
        }
    }

    private final void zay(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        Throwable th;
        Throwable th2;
        BufferedReader bufferedReader2 = bufferedReader;
        char[] cArr2 = cArr;
        int i = 0;
        while (true) {
            int i2 = i;
            int length = cArr2.length;
            if (i2 < length) {
                int read = bufferedReader2.read(this.zab, 0, length - i2);
                if (read != -1) {
                    for (int i3 = 0; i3 < read; i3++) {
                        if (cArr2[i3 + i2] != this.zab[i3]) {
                            new ParseException("Unexpected character");
                            throw th2;
                        }
                    }
                    i = i2 + read;
                } else {
                    new ParseException("Unexpected EOF");
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    private final void zaz(int i) throws ParseException {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        StringBuilder sb2;
        int i2 = i;
        if (this.zal.isEmpty()) {
            new StringBuilder(46);
            StringBuilder append = sb2.append("Expected state ");
            StringBuilder append2 = sb2.append(i2);
            StringBuilder append3 = sb2.append(" but had empty stack");
            new ParseException(sb2.toString());
            throw th2;
        }
        int intValue = this.zal.pop().intValue();
        if (intValue != i2) {
            new StringBuilder(46);
            StringBuilder append4 = sb.append("Expected state ");
            StringBuilder append5 = sb.append(i2);
            StringBuilder append6 = sb.append(" but had ");
            StringBuilder append7 = sb.append(intValue);
            new ParseException(sb.toString());
            throw th;
        }
    }

    @C0206KeepForSdk
    public void parse(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull T t) throws ParseException {
        BufferedReader bufferedReader;
        Reader reader;
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        StringBuilder sb;
        T t2 = t;
        new InputStreamReader(inputStream);
        new BufferedReader(reader, 1024);
        try {
            Integer push = this.zal.push(0);
            char zaw = zaw(bufferedReader);
            switch (zaw) {
                case 0:
                    new ParseException("No data to parse");
                    throw th2;
                case '[':
                    Integer push2 = this.zal.push(5);
                    Map<String, C0557FastJsonResponse.Field<?, ?>> fieldMappings = t2.getFieldMappings();
                    if (fieldMappings.size() == 1) {
                        C0557FastJsonResponse.Field field = (C0557FastJsonResponse.Field) fieldMappings.entrySet().iterator().next().getValue();
                        t2.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                        break;
                    } else {
                        new ParseException("Object array response class must have a single Field");
                        throw th3;
                    }
                case '{':
                    Integer push3 = this.zal.push(1);
                    boolean zai2 = zai(bufferedReader, t2);
                    break;
                default:
                    new StringBuilder(19);
                    StringBuilder append = sb.append("Unexpected token: ");
                    StringBuilder append2 = sb.append(zaw);
                    new ParseException(sb.toString());
                    throw th4;
            }
            zaz(0);
            try {
                bufferedReader.close();
            } catch (IOException e) {
                int w = Log.w("FastParser", "Failed to close reader while parsing.");
            }
        } catch (IOException e2) {
            new ParseException((Throwable) e2);
            throw th;
        } catch (Throwable th5) {
            Throwable th6 = th5;
            try {
                bufferedReader.close();
            } catch (IOException e3) {
                int w2 = Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th6;
        }
    }
}

package org.jose4j.base64url.internal.apache.commons.codec.binary;

import java.math.BigInteger;
import org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec;
import org.jose4j.lang.StringUtil;

public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private static final int MASK_6BITS = 63;
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Base64() {
        this(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Base64(boolean urlSafe) {
        this(76, CHUNK_SEPARATOR, urlSafe);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Base64(int lineLength) {
        this(lineLength, CHUNK_SEPARATOR);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Base64(int lineLength, byte[] lineSeparator2) {
        this(lineLength, lineSeparator2, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Base64(int r12, byte[] r13, boolean r14) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r0
            r6 = 3
            r7 = 4
            r8 = r1
            r9 = r2
            if (r9 != 0) goto L_0x004d
            r9 = 0
        L_0x000c:
            r5.<init>(r6, r7, r8, r9)
            r5 = r0
            byte[] r6 = DECODE_TABLE
            r5.decodeTable = r6
            r5 = r2
            if (r5 == 0) goto L_0x0087
            r5 = r0
            r6 = r2
            boolean r5 = r5.containsAlphabetOrPad(r6)
            if (r5 == 0) goto L_0x0050
            r5 = r2
            java.lang.String r5 = org.jose4j.lang.StringUtil.newStringUtf8(r5)
            r4 = r5
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r10 = r5
            r5 = r10
            r6 = r10
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r10 = r7
            r7 = r10
            r8 = r10
            r8.<init>()
            java.lang.String r8 = "lineSeparator must not contain base64 characters: ["
            java.lang.StringBuilder r7 = r7.append(r8)
            r8 = r4
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = "]"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r5
        L_0x004d:
            r9 = r2
            int r9 = r9.length
            goto L_0x000c
        L_0x0050:
            r5 = r1
            if (r5 <= 0) goto L_0x007e
            r5 = r0
            r6 = 4
            r7 = r2
            int r7 = r7.length
            int r6 = r6 + r7
            r5.encodeSize = r6
            r5 = r0
            r6 = r2
            int r6 = r6.length
            byte[] r6 = new byte[r6]
            r5.lineSeparator = r6
            r5 = r2
            r6 = 0
            r7 = r0
            byte[] r7 = r7.lineSeparator
            r8 = 0
            r9 = r2
            int r9 = r9.length
            java.lang.System.arraycopy(r5, r6, r7, r8, r9)
        L_0x006c:
            r5 = r0
            r6 = r0
            int r6 = r6.encodeSize
            r7 = 1
            int r6 = r6 + -1
            r5.decodeSize = r6
            r5 = r0
            r6 = r3
            if (r6 == 0) goto L_0x0090
            byte[] r6 = URL_SAFE_ENCODE_TABLE
        L_0x007b:
            r5.encodeTable = r6
            return
        L_0x007e:
            r5 = r0
            r6 = 4
            r5.encodeSize = r6
            r5 = r0
            r6 = 0
            r5.lineSeparator = r6
            goto L_0x006c
        L_0x0087:
            r5 = r0
            r6 = 4
            r5.encodeSize = r6
            r5 = r0
            r6 = 0
            r5.lineSeparator = r6
            goto L_0x006c
        L_0x0090:
            byte[] r6 = STANDARD_ENCODE_TABLE
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jose4j.base64url.internal.apache.commons.codec.binary.Base64.<init>(int, byte[], boolean):void");
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }

    /* access modifiers changed from: package-private */
    public void encode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        Throwable th;
        StringBuilder sb;
        byte[] in = bArr;
        int inPos = i;
        int inAvail = i2;
        BaseNCodec.Context context2 = context;
        if (!context2.eof) {
            if (inAvail < 0) {
                context2.eof = true;
                if (0 != context2.modulus || this.lineLength != 0) {
                    byte[] buffer = ensureBufferSize(this.encodeSize, context2);
                    int savedPos = context2.pos;
                    switch (context2.modulus) {
                        case 0:
                            break;
                        case 1:
                            BaseNCodec.Context context3 = context2;
                            int i3 = context3.pos;
                            context3.pos = i3 + 1;
                            buffer[i3] = this.encodeTable[(context2.ibitWorkArea >> 2) & MASK_6BITS];
                            BaseNCodec.Context context4 = context2;
                            int i4 = context4.pos;
                            context4.pos = i4 + 1;
                            buffer[i4] = this.encodeTable[(context2.ibitWorkArea << 4) & MASK_6BITS];
                            if (this.encodeTable == STANDARD_ENCODE_TABLE) {
                                BaseNCodec.Context context5 = context2;
                                int i5 = context5.pos;
                                context5.pos = i5 + 1;
                                buffer[i5] = 61;
                                BaseNCodec.Context context6 = context2;
                                int i6 = context6.pos;
                                context6.pos = i6 + 1;
                                buffer[i6] = 61;
                                break;
                            }
                            break;
                        case 2:
                            BaseNCodec.Context context7 = context2;
                            int i7 = context7.pos;
                            context7.pos = i7 + 1;
                            buffer[i7] = this.encodeTable[(context2.ibitWorkArea >> 10) & MASK_6BITS];
                            BaseNCodec.Context context8 = context2;
                            int i8 = context8.pos;
                            context8.pos = i8 + 1;
                            buffer[i8] = this.encodeTable[(context2.ibitWorkArea >> 4) & MASK_6BITS];
                            BaseNCodec.Context context9 = context2;
                            int i9 = context9.pos;
                            context9.pos = i9 + 1;
                            buffer[i9] = this.encodeTable[(context2.ibitWorkArea << 2) & MASK_6BITS];
                            if (this.encodeTable == STANDARD_ENCODE_TABLE) {
                                BaseNCodec.Context context10 = context2;
                                int i10 = context10.pos;
                                context10.pos = i10 + 1;
                                buffer[i10] = 61;
                                break;
                            }
                            break;
                        default:
                            Throwable th2 = th;
                            new StringBuilder();
                            new IllegalStateException(sb.append("Impossible modulus ").append(context2.modulus).toString());
                            throw th2;
                    }
                    context2.currentLinePos += context2.pos - savedPos;
                    if (this.lineLength > 0 && context2.currentLinePos > 0) {
                        System.arraycopy(this.lineSeparator, 0, buffer, context2.pos, this.lineSeparator.length);
                        context2.pos += this.lineSeparator.length;
                        return;
                    }
                    return;
                }
                return;
            }
            for (int i11 = 0; i11 < inAvail; i11++) {
                byte[] buffer2 = ensureBufferSize(this.encodeSize, context2);
                context2.modulus = (context2.modulus + 1) % 3;
                int i12 = inPos;
                inPos++;
                int b = in[i12];
                if (b < 0) {
                    b += 256;
                }
                context2.ibitWorkArea = (context2.ibitWorkArea << 8) + b;
                if (0 == context2.modulus) {
                    BaseNCodec.Context context11 = context2;
                    int i13 = context11.pos;
                    context11.pos = i13 + 1;
                    buffer2[i13] = this.encodeTable[(context2.ibitWorkArea >> 18) & MASK_6BITS];
                    BaseNCodec.Context context12 = context2;
                    int i14 = context12.pos;
                    context12.pos = i14 + 1;
                    buffer2[i14] = this.encodeTable[(context2.ibitWorkArea >> 12) & MASK_6BITS];
                    BaseNCodec.Context context13 = context2;
                    int i15 = context13.pos;
                    context13.pos = i15 + 1;
                    buffer2[i15] = this.encodeTable[(context2.ibitWorkArea >> 6) & MASK_6BITS];
                    BaseNCodec.Context context14 = context2;
                    int i16 = context14.pos;
                    context14.pos = i16 + 1;
                    buffer2[i16] = this.encodeTable[context2.ibitWorkArea & MASK_6BITS];
                    context2.currentLinePos += 4;
                    if (this.lineLength > 0 && this.lineLength <= context2.currentLinePos) {
                        System.arraycopy(this.lineSeparator, 0, buffer2, context2.pos, this.lineSeparator.length);
                        context2.pos += this.lineSeparator.length;
                        context2.currentLinePos = 0;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void decode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        Throwable th;
        StringBuilder sb;
        int result;
        byte[] in = bArr;
        int inPos = i;
        int inAvail = i2;
        BaseNCodec.Context context2 = context;
        if (!context2.eof) {
            if (inAvail < 0) {
                context2.eof = true;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= inAvail) {
                    break;
                }
                byte[] buffer = ensureBufferSize(this.decodeSize, context2);
                int i4 = inPos;
                inPos++;
                byte b = in[i4];
                if (b == 61) {
                    context2.eof = true;
                    break;
                }
                if (b >= 0 && b < DECODE_TABLE.length && (result = DECODE_TABLE[b]) >= 0) {
                    context2.modulus = (context2.modulus + 1) % 4;
                    context2.ibitWorkArea = (context2.ibitWorkArea << 6) + result;
                    if (context2.modulus == 0) {
                        BaseNCodec.Context context3 = context2;
                        int i5 = context3.pos;
                        context3.pos = i5 + 1;
                        buffer[i5] = (byte) ((context2.ibitWorkArea >> 16) & 255);
                        BaseNCodec.Context context4 = context2;
                        int i6 = context4.pos;
                        context4.pos = i6 + 1;
                        buffer[i6] = (byte) ((context2.ibitWorkArea >> 8) & 255);
                        BaseNCodec.Context context5 = context2;
                        int i7 = context5.pos;
                        context5.pos = i7 + 1;
                        buffer[i7] = (byte) (context2.ibitWorkArea & 255);
                    }
                }
                i3++;
            }
            if (context2.eof && context2.modulus != 0) {
                byte[] buffer2 = ensureBufferSize(this.decodeSize, context2);
                switch (context2.modulus) {
                    case 1:
                        return;
                    case 2:
                        context2.ibitWorkArea >>= 4;
                        BaseNCodec.Context context6 = context2;
                        int i8 = context6.pos;
                        context6.pos = i8 + 1;
                        buffer2[i8] = (byte) (context2.ibitWorkArea & 255);
                        return;
                    case 3:
                        context2.ibitWorkArea >>= 2;
                        BaseNCodec.Context context7 = context2;
                        int i9 = context7.pos;
                        context7.pos = i9 + 1;
                        buffer2[i9] = (byte) ((context2.ibitWorkArea >> 8) & 255);
                        BaseNCodec.Context context8 = context2;
                        int i10 = context8.pos;
                        context8.pos = i10 + 1;
                        buffer2[i10] = (byte) (context2.ibitWorkArea & 255);
                        return;
                    default:
                        Throwable th2 = th;
                        new StringBuilder();
                        new IllegalStateException(sb.append("Impossible modulus ").append(context2.modulus).toString());
                        throw th2;
                }
            }
        }
    }

    @Deprecated
    public static boolean isArrayByteBase64(byte[] arrayOctet) {
        return isBase64(arrayOctet);
    }

    public static boolean isBase64(byte b) {
        byte octet = b;
        return octet == 61 || (octet >= 0 && octet < DECODE_TABLE.length && DECODE_TABLE[octet] != -1);
    }

    public static boolean isBase64(String base64) {
        return isBase64(StringUtil.getBytesUtf8(base64));
    }

    public static boolean isBase64(byte[] bArr) {
        byte[] arrayOctet = bArr;
        for (int i = 0; i < arrayOctet.length; i++) {
            if (!isBase64(arrayOctet[i]) && !isWhiteSpace(arrayOctet[i])) {
                return false;
            }
        }
        return true;
    }

    public static byte[] encodeBase64(byte[] binaryData) {
        return encodeBase64(binaryData, false);
    }

    public static String encodeBase64String(byte[] binaryData) {
        return StringUtil.newStringUtf8(encodeBase64(binaryData, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] binaryData) {
        return encodeBase64(binaryData, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] binaryData) {
        return StringUtil.newStringUtf8(encodeBase64(binaryData, false, true));
    }

    public static byte[] encodeBase64Chunked(byte[] binaryData) {
        return encodeBase64(binaryData, true);
    }

    public static byte[] encodeBase64(byte[] binaryData, boolean isChunked) {
        return encodeBase64(binaryData, isChunked, false);
    }

    public static byte[] encodeBase64(byte[] binaryData, boolean isChunked, boolean urlSafe) {
        return encodeBase64(binaryData, isChunked, urlSafe, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        Base64 base64;
        Base64 base642;
        Throwable th;
        StringBuilder sb;
        Base64 base643;
        byte[] binaryData = bArr;
        boolean isChunked = z;
        boolean urlSafe = z2;
        int maxResultSize = i;
        if (binaryData == null || binaryData.length == 0) {
            return binaryData;
        }
        if (isChunked) {
            base642 = base643;
            new Base64(urlSafe);
        } else {
            base642 = base64;
            new Base64(0, CHUNK_SEPARATOR, urlSafe);
        }
        Base64 b64 = base642;
        long len = b64.getEncodedLength(binaryData);
        if (len <= ((long) maxResultSize)) {
            return b64.encode(binaryData);
        }
        Throwable th2 = th;
        new StringBuilder();
        new IllegalArgumentException(sb.append("Input array too big, the output array would be bigger (").append(len).append(") than the specified maximum size of ").append(maxResultSize).toString());
        throw th2;
    }

    public static byte[] decodeBase64(String base64String) {
        Base64 base64;
        new Base64();
        return base64.decode(base64String);
    }

    public static byte[] decodeBase64(byte[] base64Data) {
        Base64 base64;
        new Base64();
        return base64.decode(base64Data);
    }

    public static BigInteger decodeInteger(byte[] pArray) {
        BigInteger bigInteger;
        new BigInteger(1, decodeBase64(pArray));
        return bigInteger;
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        Throwable th;
        BigInteger bigInt = bigInteger;
        if (bigInt != null) {
            return encodeBase64(toIntegerBytes(bigInt), false);
        }
        Throwable th2 = th;
        new NullPointerException("encodeInteger called with null parameter");
        throw th2;
    }

    static byte[] toIntegerBytes(BigInteger bigInteger) {
        BigInteger bigInt = bigInteger;
        int bitlen = ((bigInt.bitLength() + 7) >> 3) << 3;
        byte[] bigBytes = bigInt.toByteArray();
        if (bigInt.bitLength() % 8 != 0 && (bigInt.bitLength() / 8) + 1 == bitlen / 8) {
            return bigBytes;
        }
        int startSrc = 0;
        int len = bigBytes.length;
        if (bigInt.bitLength() % 8 == 0) {
            startSrc = 1;
            len--;
        }
        byte[] resizedBytes = new byte[(bitlen / 8)];
        System.arraycopy(bigBytes, startSrc, resizedBytes, (bitlen / 8) - len, len);
        return resizedBytes;
    }

    /* access modifiers changed from: protected */
    public boolean isInAlphabet(byte b) {
        byte octet = b;
        return octet >= 0 && octet < this.decodeTable.length && this.decodeTable[octet] != -1;
    }
}

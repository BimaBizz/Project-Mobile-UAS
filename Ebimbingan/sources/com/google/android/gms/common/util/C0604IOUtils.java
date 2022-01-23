package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.appinventor.components.runtime.util.Ev3Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@C0452ShowFirstParty
@C0206KeepForSdk
@Deprecated
/* renamed from: com.google.android.gms.common.util.IOUtils */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0604IOUtils {
    private C0604IOUtils() {
    }

    @C0206KeepForSdk
    public static void closeQuietly(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        if (parcelFileDescriptor2 != null) {
            try {
                parcelFileDescriptor2.close();
            } catch (IOException e) {
            }
        }
    }

    @C0206KeepForSdk
    @Deprecated
    public static long copyStream(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream) throws IOException {
        return copyStream(inputStream, outputStream, false, 1024);
    }

    @C0206KeepForSdk
    public static boolean isGzipByteBuffer(@RecentlyNonNull byte[] bArr) {
        byte[] bArr2 = bArr;
        return bArr2.length > 1 && ((bArr2[0] & Ev3Constants.Opcode.TST) | ((bArr2[1] & Ev3Constants.Opcode.TST) << 8)) == 35615;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(@RecentlyNonNull InputStream inputStream) throws IOException {
        return readInputStreamFully(inputStream, true);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    @Deprecated
    public static byte[] toByteArray(@RecentlyNonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream2 = inputStream;
        new ByteArrayOutputStream();
        Object checkNotNull = C0446Preconditions.checkNotNull(inputStream2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream2.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @C0206KeepForSdk
    public static void closeQuietly(@Nullable Closeable closeable) {
        Closeable closeable2 = closeable;
        if (closeable2 != null) {
            try {
                closeable2.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @C0206KeepForSdk
    @Deprecated
    public static long copyStream(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream, boolean z, int i) throws IOException {
        long j;
        InputStream inputStream2 = inputStream;
        OutputStream outputStream2 = outputStream;
        boolean z2 = z;
        byte[] bArr = new byte[i];
        long j2 = 0;
        while (true) {
            j = j2;
            try {
                int read = inputStream2.read(bArr, 0, bArr.length);
                if (read == -1) {
                    break;
                }
                long j3 = j + ((long) read);
                outputStream2.write(bArr, 0, read);
                j2 = j3;
            } catch (Throwable th) {
                Throwable th2 = th;
                if (z2) {
                    closeQuietly((Closeable) inputStream2);
                    closeQuietly((Closeable) outputStream2);
                }
                throw th2;
            }
        }
        if (z2) {
            closeQuietly((Closeable) inputStream2);
            closeQuietly((Closeable) outputStream2);
        }
        return j;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(@RecentlyNonNull InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        new ByteArrayOutputStream();
        long copyStream = copyStream(inputStream, byteArrayOutputStream, z, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}

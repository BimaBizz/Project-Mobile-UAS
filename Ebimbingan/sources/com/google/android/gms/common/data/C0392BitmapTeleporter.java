package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import gnu.expr.Declaration;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

@C0452ShowFirstParty
@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "BitmapTeleporterCreator")
/* renamed from: com.google.android.gms.common.data.BitmapTeleporter */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0392BitmapTeleporter extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final Parcelable.Creator<C0392BitmapTeleporter> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @C0463SafeParcelable.Field(id = 2)
    @Nullable
    ParcelFileDescriptor zab;
    @C0463SafeParcelable.Field(id = 3)
    final int zac;
    @Nullable
    private Bitmap zad;
    private boolean zae;
    private File zaf;

    static {
        Parcelable.Creator<C0392BitmapTeleporter> creator;
        new C0405zaa();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0392BitmapTeleporter(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor, @C0463SafeParcelable.Param(id = 3) int i2) {
        this.zaa = i;
        this.zab = parcelFileDescriptor;
        this.zac = i2;
        this.zad = null;
        this.zae = false;
    }

    private static final void zaa(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            int w = Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public Bitmap get() {
        DataInputStream dataInputStream;
        InputStream inputStream;
        Throwable th;
        if (!this.zae) {
            new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) C0446Preconditions.checkNotNull(this.zab));
            new DataInputStream(inputStream);
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                int read = dataInputStream.read(bArr);
                zaa(dataInputStream);
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.zad = createBitmap;
                this.zae = true;
            } catch (IOException e) {
                new IllegalStateException("Could not read from parcel file descriptor", e);
                throw th;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                zaa(dataInputStream);
                throw th3;
            }
        }
        return this.zad;
    }

    @C0206KeepForSdk
    public void release() {
        if (!this.zae) {
            try {
                ((ParcelFileDescriptor) C0446Preconditions.checkNotNull(this.zab)).close();
            } catch (IOException e) {
                int w = Log.w("BitmapTeleporter", "Could not close PFD", e);
            }
        }
    }

    @C0206KeepForSdk
    public void setTempDir(@RecentlyNonNull File file) {
        Throwable th;
        File file2 = file;
        if (file2 == null) {
            new NullPointerException("Cannot set null temp directory");
            throw th;
        }
        this.zaf = file2;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Throwable th;
        Throwable th2;
        OutputStream outputStream;
        BufferedOutputStream bufferedOutputStream;
        DataOutputStream dataOutputStream;
        Throwable th3;
        Throwable th4;
        Parcel parcel2 = parcel;
        int i2 = i;
        if (this.zab == null) {
            Bitmap bitmap = (Bitmap) C0446Preconditions.checkNotNull(this.zad);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.zaf;
            if (file == null) {
                new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
                throw th4;
            }
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    new FileOutputStream(createTempFile);
                    this.zab = ParcelFileDescriptor.open(createTempFile, Declaration.IS_DYNAMIC);
                    boolean delete = createTempFile.delete();
                    bufferedOutputStream = new BufferedOutputStream(outputStream);
                    new DataOutputStream(r5);
                    try {
                        dataOutputStream.writeInt(array.length);
                        dataOutputStream.writeInt(bitmap.getWidth());
                        dataOutputStream.writeInt(bitmap.getHeight());
                        dataOutputStream.writeUTF(bitmap.getConfig().toString());
                        dataOutputStream.write(array);
                        zaa(dataOutputStream);
                    } catch (IOException e) {
                        new IllegalStateException("Could not write into unlinked file", e);
                        throw th3;
                    } catch (Throwable th5) {
                        Throwable th6 = th5;
                        zaa(dataOutputStream);
                        throw th6;
                    }
                } catch (FileNotFoundException e2) {
                    new IllegalStateException("Temporary file is somehow already deleted");
                    throw th2;
                }
            } catch (IOException e3) {
                new IllegalStateException("Could not create temporary file", e3);
                throw th;
            }
        }
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.zab, i2 | 1, false);
        C0462SafeParcelWriter.writeInt(parcel2, 3, this.zac);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
        this.zab = null;
    }

    @C0206KeepForSdk
    public C0392BitmapTeleporter(@RecentlyNonNull Bitmap bitmap) {
        this.zaa = 1;
        this.zab = null;
        this.zac = 0;
        this.zad = bitmap;
        this.zae = true;
    }
}

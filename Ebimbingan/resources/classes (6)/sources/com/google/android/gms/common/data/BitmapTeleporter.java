package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
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

@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class(creator = "BitmapTeleporterCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    @SafeParcelable.Field(id = 2)
    @Nullable
    ParcelFileDescriptor zab;
    @SafeParcelable.Field(id = 3)
    final int zac;
    @Nullable
    private Bitmap zad;
    private boolean zae;
    private File zaf;

    static {
        Parcelable.Creator<BitmapTeleporter> creator;
        new zaa();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    BitmapTeleporter(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 3) int i2) {
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

    @KeepForSdk
    @RecentlyNullable
    public Bitmap get() {
        DataInputStream dataInputStream;
        InputStream inputStream;
        Throwable th;
        if (!this.zae) {
            new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) Preconditions.checkNotNull(this.zab));
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

    @KeepForSdk
    public void release() {
        if (!this.zae) {
            try {
                ((ParcelFileDescriptor) Preconditions.checkNotNull(this.zab)).close();
            } catch (IOException e) {
                int w = Log.w("BitmapTeleporter", "Could not close PFD", e);
            }
        }
    }

    @KeepForSdk
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
            Bitmap bitmap = (Bitmap) Preconditions.checkNotNull(this.zad);
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
                    this.zab = ParcelFileDescriptor.open(createTempFile, 268435456);
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
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.zab, i2 | 1, false);
        SafeParcelWriter.writeInt(parcel2, 3, this.zac);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
        this.zab = null;
    }

    @KeepForSdk
    public BitmapTeleporter(@RecentlyNonNull Bitmap bitmap) {
        this.zaa = 1;
        this.zab = null;
        this.zac = 0;
        this.zad = bitmap;
        this.zae = true;
    }
}

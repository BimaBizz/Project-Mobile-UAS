package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jose4j.jwk.RsaJsonWebKey;

public class FileDescriptorLocalUriFetcher extends LocalUriFetcher<ParcelFileDescriptor> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileDescriptorLocalUriFetcher(Context context, Uri uri) {
        super(context, uri);
    }

    /* access modifiers changed from: protected */
    public ParcelFileDescriptor loadResource(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return contentResolver.openAssetFileDescriptor(uri, RsaJsonWebKey.PRIME_FACTOR_OTHER_MEMBER_NAME).getParcelFileDescriptor();
    }

    /* access modifiers changed from: protected */
    public void close(ParcelFileDescriptor data) throws IOException {
        data.close();
    }
}
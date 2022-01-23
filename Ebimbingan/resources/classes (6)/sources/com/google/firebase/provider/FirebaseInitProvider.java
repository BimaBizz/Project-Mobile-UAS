package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.PublicApi;

@PublicApi
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class FirebaseInitProvider extends ContentProvider {
    @VisibleForTesting
    static final String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = "com.google.firebase.firebaseinitprovider";
    private static final String TAG = "FirebaseInitProvider";

    public FirebaseInitProvider() {
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        ProviderInfo info = providerInfo;
        checkContentProviderAuthority(info);
        super.attachInfo(context, info);
    }

    public boolean onCreate() {
        if (FirebaseApp.initializeApp(getContext()) == null) {
            int i = Log.i(TAG, "FirebaseApp initialization unsuccessful");
        } else {
            int i2 = Log.i(TAG, "FirebaseApp initialization successful");
        }
        return false;
    }

    private static void checkContentProviderAuthority(@NonNull ProviderInfo providerInfo) {
        Throwable th;
        ProviderInfo info = providerInfo;
        Object checkNotNull = Preconditions.checkNotNull(info, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY.equals(info.authority)) {
            Throwable th2 = th;
            new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
            throw th2;
        }
    }

    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Uri uri2 = uri;
        String[] strArr3 = strArr;
        String str3 = str;
        String[] strArr4 = strArr2;
        String str4 = str2;
        return null;
    }

    @Nullable
    public String getType(Uri uri) {
        Uri uri2 = uri;
        return null;
    }

    @Nullable
    public Uri insert(Uri uri, ContentValues contentValues) {
        Uri uri2 = uri;
        ContentValues contentValues2 = contentValues;
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        Uri uri2 = uri;
        String str2 = str;
        String[] strArr2 = strArr;
        return 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Uri uri2 = uri;
        ContentValues contentValues2 = contentValues;
        String str2 = str;
        String[] strArr2 = strArr;
        return 0;
    }
}

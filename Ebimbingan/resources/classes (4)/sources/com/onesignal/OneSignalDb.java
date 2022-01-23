package com.onesignal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface OneSignalDb {
    void delete(@NonNull String str, @Nullable String str2, @Nullable String[] strArr);

    void insert(@NonNull String str, @Nullable String str2, @Nullable ContentValues contentValues);

    void insertOrThrow(@NonNull String str, @Nullable String str2, @Nullable ContentValues contentValues) throws SQLException;

    Cursor query(@NonNull String str, @Nullable String[] strArr, @Nullable String str2, String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5);

    Cursor query(@NonNull String str, @Nullable String[] strArr, @Nullable String str2, @Nullable String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6);

    int update(@NonNull String str, @NonNull ContentValues contentValues, @Nullable String str2, @Nullable String[] strArr);
}

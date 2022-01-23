package com.onesignal.shortcutbadger.util;

import android.database.Cursor;
import java.io.Closeable;
import java.io.IOException;

public class CloseHelper {
    public CloseHelper() {
    }

    public static void close(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 != null && !cursor2.isClosed()) {
            cursor2.close();
        }
    }

    public static void closeQuietly(Closeable closeable) {
        Closeable closeable2 = closeable;
        if (closeable2 != null) {
            try {
                closeable2.close();
            } catch (IOException e) {
                IOException iOException = e;
            }
        }
    }
}

package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbContract;
import com.onesignal.outcomes.OSOutcomeTableProvider;
import java.util.ArrayList;
import java.util.List;

class OneSignalDbHelper extends SQLiteOpenHelper implements OneSignalDb {
    private static final String COMMA_SEP = ",";
    private static final String DATABASE_NAME = "OneSignal.db";
    static final int DATABASE_VERSION = 8;
    private static final int DB_OPEN_RETRY_BACKOFF = 400;
    private static final int DB_OPEN_RETRY_MAX = 5;
    private static final String FLOAT_TYPE = " FLOAT";
    private static final String INTEGER_PRIMARY_KEY_TYPE = " INTEGER PRIMARY KEY";
    private static final String INT_TYPE = " INTEGER";
    private static final Object LOCK;
    protected static final String SQL_CREATE_ENTRIES = "CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);";
    private static final String SQL_CREATE_IN_APP_MESSAGE_ENTRIES = "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);";
    protected static final String[] SQL_INDEX_ENTRIES;
    private static final String TEXT_TYPE = " TEXT";
    private static final String TIMESTAMP_TYPE = " TIMESTAMP";
    private static OSLogger logger;
    private static OSOutcomeTableProvider outcomeTableProvider;
    private static OneSignalDbHelper sInstance;

    static {
        Object obj;
        OSLogger oSLogger;
        OSOutcomeTableProvider oSOutcomeTableProvider;
        new Object();
        LOCK = obj;
        String[] strArr = new String[6];
        strArr[0] = OneSignalDbContract.NotificationTable.INDEX_CREATE_NOTIFICATION_ID;
        String[] strArr2 = strArr;
        strArr2[1] = OneSignalDbContract.NotificationTable.INDEX_CREATE_ANDROID_NOTIFICATION_ID;
        String[] strArr3 = strArr2;
        strArr3[2] = OneSignalDbContract.NotificationTable.INDEX_CREATE_GROUP_ID;
        String[] strArr4 = strArr3;
        strArr4[3] = OneSignalDbContract.NotificationTable.INDEX_CREATE_COLLAPSE_ID;
        String[] strArr5 = strArr4;
        strArr5[4] = OneSignalDbContract.NotificationTable.INDEX_CREATE_CREATED_TIME;
        String[] strArr6 = strArr5;
        strArr6[5] = OneSignalDbContract.NotificationTable.INDEX_CREATE_EXPIRE_TIME;
        SQL_INDEX_ENTRIES = strArr6;
        new OSLogWrapper();
        logger = oSLogger;
        new OSOutcomeTableProvider();
        outcomeTableProvider = oSOutcomeTableProvider;
    }

    /* access modifiers changed from: package-private */
    public void setOutcomeTableProvider(OSOutcomeTableProvider outcomeTableProvider2) {
        outcomeTableProvider = outcomeTableProvider2;
    }

    private static int getDbVersion() {
        return 8;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OneSignalDbHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, getDbVersion());
    }

    public static OneSignalDbHelper getInstance(Context context) {
        OneSignalDbHelper oneSignalDbHelper;
        Context context2 = context;
        if (sInstance == null) {
            Object obj = LOCK;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    if (sInstance == null) {
                        new OneSignalDbHelper(context2.getApplicationContext());
                        sInstance = oneSignalDbHelper;
                    }
                } catch (Throwable th) {
                    while (true) {
                        Throwable th2 = th;
                        Object obj3 = obj2;
                        throw th2;
                    }
                }
            }
        }
        return sInstance;
    }

    private SQLiteDatabase getSQLiteDatabase() {
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                return writableDatabase;
            } catch (SQLiteCantOpenDatabaseException | SQLiteDatabaseLockedException e) {
                throw e;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        monitor-exit(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.database.sqlite.SQLiteDatabase getSQLiteDatabaseWithRetries() {
        /*
            r9 = this;
            r1 = r9
            java.lang.Object r6 = LOCK
            r8 = r6
            r6 = r8
            r7 = r8
            r2 = r7
            monitor-enter(r6)
            r6 = 0
            r3 = r6
        L_0x000a:
            r6 = r1
            android.database.sqlite.SQLiteDatabase r6 = r6.getSQLiteDatabase()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x0013, SQLiteDatabaseLockedException -> 0x002d }
            r7 = r2
            monitor-exit(r7)     // Catch:{ all -> 0x001d }
            r1 = r6
            return r1
        L_0x0013:
            r6 = move-exception
        L_0x0014:
            r4 = r6
            int r3 = r3 + 1
            r6 = r3
            r7 = 5
            if (r6 < r7) goto L_0x0023
            r6 = r4
            throw r6     // Catch:{ all -> 0x001d }
        L_0x001d:
            r6 = move-exception
            r5 = r6
            r6 = r2
            monitor-exit(r6)     // Catch:{ all -> 0x001d }
            r6 = r5
            throw r6
        L_0x0023:
            r6 = r3
            r7 = 400(0x190, float:5.6E-43)
            int r6 = r6 * 400
            long r6 = (long) r6
            android.os.SystemClock.sleep(r6)     // Catch:{ all -> 0x001d }
            goto L_0x000a
        L_0x002d:
            r6 = move-exception
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OneSignalDbHelper.getSQLiteDatabaseWithRetries():android.database.sqlite.SQLiteDatabase");
    }

    /* JADX INFO: finally extract failed */
    public Cursor query(@NonNull String str, @Nullable String[] strArr, @Nullable String str2, String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        String table = str;
        String[] columns = strArr;
        String selection = str2;
        String[] selectionArgs = strArr2;
        String groupBy = str3;
        String having = str4;
        String orderBy = str5;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                Cursor query = getSQLiteDatabaseWithRetries().query(table, columns, selection, selectionArgs, groupBy, having, orderBy);
                return query;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public Cursor query(@NonNull String str, @Nullable String[] strArr, @Nullable String str2, @Nullable String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        String table = str;
        String[] columns = strArr;
        String selection = str2;
        String[] selectionArgs = strArr2;
        String groupBy = str3;
        String having = str4;
        String orderBy = str5;
        String limit = str6;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                Cursor query = getSQLiteDatabaseWithRetries().query(table, columns, selection, selectionArgs, groupBy, having, orderBy, limit);
                return query;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    public void insert(@NonNull String str, @Nullable String str2, @Nullable ContentValues contentValues) {
        StringBuilder sb;
        StringBuilder sb2;
        String table = str;
        String nullColumnHack = str2;
        ContentValues values = contentValues;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                SQLiteDatabase writableDb = getSQLiteDatabaseWithRetries();
                try {
                    writableDb.beginTransaction();
                    long insert = writableDb.insert(table, nullColumnHack, values);
                    writableDb.setTransactionSuccessful();
                    if (writableDb != null) {
                        writableDb.endTransaction();
                    }
                } catch (SQLiteException e) {
                    SQLiteException e2 = e;
                    OSLogger oSLogger = logger;
                    new StringBuilder();
                    oSLogger.error(sb2.append("Error inserting on table: ").append(table).append(" with nullColumnHack: ").append(nullColumnHack).append(" and values: ").append(values).toString(), e2);
                    if (writableDb != null) {
                        try {
                            writableDb.endTransaction();
                        } catch (IllegalStateException e3) {
                            logger.error("Error closing transaction! ", e3);
                        } catch (SQLiteException e4) {
                            logger.error("Error closing transaction! ", e4);
                        }
                    }
                } catch (IllegalStateException e5) {
                    IllegalStateException e6 = e5;
                    OSLogger oSLogger2 = logger;
                    new StringBuilder();
                    oSLogger2.error(sb.append("Error under inserting transaction under table: ").append(table).append(" with nullColumnHack: ").append(nullColumnHack).append(" and values: ").append(values).toString(), e6);
                    if (writableDb != null) {
                        try {
                            writableDb.endTransaction();
                        } catch (IllegalStateException e7) {
                            logger.error("Error closing transaction! ", e7);
                        } catch (SQLiteException e8) {
                            logger.error("Error closing transaction! ", e8);
                        }
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (writableDb != null) {
                        try {
                            writableDb.endTransaction();
                        } catch (IllegalStateException e9) {
                            logger.error("Error closing transaction! ", e9);
                        } catch (SQLiteException e10) {
                            logger.error("Error closing transaction! ", e10);
                        }
                    }
                    throw th2;
                }
            } catch (IllegalStateException e11) {
                logger.error("Error closing transaction! ", e11);
            } catch (SQLiteException e12) {
                logger.error("Error closing transaction! ", e12);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                Object obj3 = obj2;
                throw th4;
            }
        }
    }

    public void insertOrThrow(@NonNull String str, @Nullable String str2, @Nullable ContentValues contentValues) throws SQLException {
        StringBuilder sb;
        StringBuilder sb2;
        String table = str;
        String nullColumnHack = str2;
        ContentValues values = contentValues;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                SQLiteDatabase writableDb = getSQLiteDatabaseWithRetries();
                try {
                    writableDb.beginTransaction();
                    long insertOrThrow = writableDb.insertOrThrow(table, nullColumnHack, values);
                    writableDb.setTransactionSuccessful();
                    if (writableDb != null) {
                        writableDb.endTransaction();
                    }
                } catch (SQLiteException e) {
                    SQLiteException e2 = e;
                    OSLogger oSLogger = logger;
                    new StringBuilder();
                    oSLogger.error(sb2.append("Error inserting or throw on table: ").append(table).append(" with nullColumnHack: ").append(nullColumnHack).append(" and values: ").append(values).toString(), e2);
                    if (writableDb != null) {
                        try {
                            writableDb.endTransaction();
                        } catch (IllegalStateException e3) {
                            logger.error("Error closing transaction! ", e3);
                        } catch (SQLiteException e4) {
                            logger.error("Error closing transaction! ", e4);
                        }
                    }
                } catch (IllegalStateException e5) {
                    IllegalStateException e6 = e5;
                    OSLogger oSLogger2 = logger;
                    new StringBuilder();
                    oSLogger2.error(sb.append("Error under inserting or throw transaction under table: ").append(table).append(" with nullColumnHack: ").append(nullColumnHack).append(" and values: ").append(values).toString(), e6);
                    if (writableDb != null) {
                        try {
                            writableDb.endTransaction();
                        } catch (IllegalStateException e7) {
                            logger.error("Error closing transaction! ", e7);
                        } catch (SQLiteException e8) {
                            logger.error("Error closing transaction! ", e8);
                        }
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (writableDb != null) {
                        try {
                            writableDb.endTransaction();
                        } catch (IllegalStateException e9) {
                            logger.error("Error closing transaction! ", e9);
                        } catch (SQLiteException e10) {
                            logger.error("Error closing transaction! ", e10);
                        }
                    }
                    throw th2;
                }
            } catch (IllegalStateException e11) {
                logger.error("Error closing transaction! ", e11);
            } catch (SQLiteException e12) {
                logger.error("Error closing transaction! ", e12);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                Object obj3 = obj2;
                throw th4;
            }
        }
    }

    public int update(@NonNull String str, @NonNull ContentValues contentValues, @Nullable String str2, @Nullable String[] strArr) {
        StringBuilder sb;
        StringBuilder sb2;
        String table = str;
        ContentValues values = contentValues;
        String whereClause = str2;
        String[] whereArgs = strArr;
        int result = 0;
        if (values == null || values.toString().isEmpty()) {
            return 0;
        }
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                SQLiteDatabase writableDb = getSQLiteDatabaseWithRetries();
                try {
                    writableDb.beginTransaction();
                    result = writableDb.update(table, values, whereClause, whereArgs);
                    writableDb.setTransactionSuccessful();
                    if (writableDb != null) {
                        writableDb.endTransaction();
                    }
                } catch (SQLiteException e) {
                    SQLiteException e2 = e;
                    OSLogger oSLogger = logger;
                    new StringBuilder();
                    oSLogger.error(sb2.append("Error updating on table: ").append(table).append(" with whereClause: ").append(whereClause).append(" and whereArgs: ").append(whereArgs).toString(), e2);
                    if (writableDb != null) {
                        try {
                            writableDb.endTransaction();
                        } catch (IllegalStateException e3) {
                            logger.error("Error closing transaction! ", e3);
                        } catch (SQLiteException e4) {
                            logger.error("Error closing transaction! ", e4);
                        }
                    }
                } catch (IllegalStateException e5) {
                    IllegalStateException e6 = e5;
                    OSLogger oSLogger2 = logger;
                    new StringBuilder();
                    oSLogger2.error(sb.append("Error under update transaction under table: ").append(table).append(" with whereClause: ").append(whereClause).append(" and whereArgs: ").append(whereArgs).toString(), e6);
                    if (writableDb != null) {
                        try {
                            writableDb.endTransaction();
                        } catch (IllegalStateException e7) {
                            logger.error("Error closing transaction! ", e7);
                        } catch (SQLiteException e8) {
                            logger.error("Error closing transaction! ", e8);
                        }
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (writableDb != null) {
                        try {
                            writableDb.endTransaction();
                        } catch (IllegalStateException e9) {
                            logger.error("Error closing transaction! ", e9);
                        } catch (SQLiteException e10) {
                            logger.error("Error closing transaction! ", e10);
                        }
                    }
                    throw th2;
                }
            } catch (IllegalStateException e11) {
                logger.error("Error closing transaction! ", e11);
            } catch (SQLiteException e12) {
                logger.error("Error closing transaction! ", e12);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                Object obj3 = obj2;
                throw th4;
            }
            return result;
        }
    }

    public void delete(@NonNull String str, @Nullable String str2, @Nullable String[] strArr) {
        StringBuilder sb;
        StringBuilder sb2;
        String table = str;
        String whereClause = str2;
        String[] whereArgs = strArr;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                SQLiteDatabase writableDb = getSQLiteDatabaseWithRetries();
                try {
                    writableDb.beginTransaction();
                    int delete = writableDb.delete(table, whereClause, whereArgs);
                    writableDb.setTransactionSuccessful();
                    if (writableDb != null) {
                        writableDb.endTransaction();
                    }
                } catch (SQLiteException e) {
                    SQLiteException e2 = e;
                    OSLogger oSLogger = logger;
                    new StringBuilder();
                    oSLogger.error(sb2.append("Error deleting on table: ").append(table).append(" with whereClause: ").append(whereClause).append(" and whereArgs: ").append(whereArgs).toString(), e2);
                    if (writableDb != null) {
                        try {
                            writableDb.endTransaction();
                        } catch (IllegalStateException e3) {
                            logger.error("Error closing transaction! ", e3);
                        } catch (SQLiteException e4) {
                            logger.error("Error closing transaction! ", e4);
                        }
                    }
                } catch (IllegalStateException e5) {
                    IllegalStateException e6 = e5;
                    OSLogger oSLogger2 = logger;
                    new StringBuilder();
                    oSLogger2.error(sb.append("Error under delete transaction under table: ").append(table).append(" with whereClause: ").append(whereClause).append(" and whereArgs: ").append(whereArgs).toString(), e6);
                    if (writableDb != null) {
                        try {
                            writableDb.endTransaction();
                        } catch (IllegalStateException e7) {
                            logger.error("Error closing transaction! ", e7);
                        } catch (SQLiteException e8) {
                            logger.error("Error closing transaction! ", e8);
                        }
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (writableDb != null) {
                        try {
                            writableDb.endTransaction();
                        } catch (IllegalStateException e9) {
                            logger.error("Error closing transaction! ", e9);
                        } catch (SQLiteException e10) {
                            logger.error("Error closing transaction! ", e10);
                        }
                    }
                    throw th2;
                }
            } catch (IllegalStateException e11) {
                logger.error("Error closing transaction! ", e11);
            } catch (SQLiteException e12) {
                logger.error("Error closing transaction! ", e12);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                Object obj3 = obj2;
                throw th4;
            }
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase db = sQLiteDatabase;
        db.execSQL(SQL_CREATE_ENTRIES);
        db.execSQL(OSOutcomeTableProvider.SQL_CREATE_OUTCOME_ENTRIES_V3);
        db.execSQL(OSOutcomeTableProvider.SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V2);
        db.execSQL(SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
        String[] strArr = SQL_INDEX_ENTRIES;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            db.execSQL(strArr[i]);
        }
    }

    public void onUpgrade(SQLiteDatabase db, int i, int newVersion) {
        StringBuilder sb;
        int oldVersion = i;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("OneSignal Database onUpgrade from: ").append(oldVersion).append(" to: ").append(newVersion).toString());
        try {
            internalOnUpgrade(db, oldVersion);
        } catch (SQLiteException e) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error in upgrade, migration may have already run! Skipping!", e);
        }
    }

    private synchronized void internalOnUpgrade(SQLiteDatabase sQLiteDatabase, int i) {
        SQLiteDatabase db = sQLiteDatabase;
        int oldVersion = i;
        synchronized (this) {
            if (oldVersion < 2) {
                upgradeToV2(db);
            }
            if (oldVersion < 3) {
                upgradeToV3(db);
            }
            if (oldVersion < 4) {
                upgradeToV4(db);
            }
            if (oldVersion < 5) {
                upgradeToV5(db);
            }
            if (oldVersion == 5) {
                upgradeFromV5ToV6(db);
            }
            if (oldVersion < 7) {
                upgradeToV7(db);
            }
            if (oldVersion < 8) {
                upgradeToV8(db);
            }
        }
    }

    private static void upgradeToV2(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase db = sQLiteDatabase;
        safeExecSQL(db, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        safeExecSQL(db, OneSignalDbContract.NotificationTable.INDEX_CREATE_GROUP_ID);
    }

    private static void upgradeToV3(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase db = sQLiteDatabase;
        safeExecSQL(db, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        safeExecSQL(db, "UPDATE notification SET expire_time = created_time + 259200;");
        safeExecSQL(db, OneSignalDbContract.NotificationTable.INDEX_CREATE_EXPIRE_TIME);
    }

    private static void upgradeToV4(SQLiteDatabase db) {
        safeExecSQL(db, OSOutcomeTableProvider.SQL_CREATE_OUTCOME_ENTRIES_V1);
    }

    private static void upgradeToV5(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase db = sQLiteDatabase;
        safeExecSQL(db, OSOutcomeTableProvider.SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V1);
        upgradeFromV5ToV6(db);
    }

    private static void upgradeFromV5ToV6(SQLiteDatabase db) {
        outcomeTableProvider.upgradeOutcomeTableRevision1To2(db);
    }

    private static void upgradeToV7(SQLiteDatabase db) {
        safeExecSQL(db, SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
    }

    private synchronized void upgradeToV8(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase db = sQLiteDatabase;
        synchronized (this) {
            outcomeTableProvider.upgradeOutcomeTableRevision2To3(db);
            outcomeTableProvider.upgradeCacheOutcomeTableRevision1To2(db);
        }
    }

    private static void safeExecSQL(SQLiteDatabase db, String sql) {
        try {
            db.execSQL(sql);
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List list;
        StringBuilder sb;
        SQLiteDatabase db = sQLiteDatabase;
        int i3 = i;
        int i4 = i2;
        OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.");
        Cursor cursor = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", (String[]) null);
        try {
            new ArrayList(cursor.getCount());
            List<String> list2 = list;
            while (cursor.moveToNext()) {
                boolean add = list2.add(cursor.getString(0));
            }
            for (String table : list2) {
                if (!table.startsWith("sqlite_")) {
                    new StringBuilder();
                    db.execSQL(sb.append("DROP TABLE IF EXISTS ").append(table).toString());
                }
            }
            cursor.close();
            onCreate(db);
        } catch (Throwable th) {
            Throwable th2 = th;
            cursor.close();
            throw th2;
        }
    }

    static StringBuilder recentUninteractedWithNotificationsWhere() {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        long currentTimeSec = System.currentTimeMillis() / 1000;
        new StringBuilder();
        new StringBuilder(sb2.append("created_time > ").append(currentTimeSec - 604800).append(" AND ").append(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED).append(" = 0 AND ").append(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED).append(" = 0 AND ").append(OneSignalDbContract.NotificationTable.COLUMN_NAME_IS_SUMMARY).append(" = 0").toString());
        StringBuilder where = sb;
        if (OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_RESTORE_TTL_FILTER, true)) {
            new StringBuilder();
            StringBuilder append = where.append(sb3.append(" AND expire_time > ").append(currentTimeSec).toString());
        }
        return where;
    }

    static void cleanOutcomeDatabaseTable(SQLiteDatabase writeableDb) {
        int delete = writeableDb.delete(OSOutcomeTableProvider.OUTCOME_EVENT_TABLE, (String) null, (String[]) null);
    }
}

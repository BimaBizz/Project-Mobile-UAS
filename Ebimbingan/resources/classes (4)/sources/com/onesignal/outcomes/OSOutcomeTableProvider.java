package com.onesignal.outcomes;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.onesignal.OneSignalDbContract;
import com.onesignal.influence.model.OSInfluenceChannel;

public class OSOutcomeTableProvider {
    public static final String CACHE_UNIQUE_OUTCOME_COLUMN_CHANNEL_INFLUENCE_ID = "channel_influence_id";
    public static final String CACHE_UNIQUE_OUTCOME_COLUMN_CHANNEL_TYPE = "channel_type";
    public static final String CACHE_UNIQUE_OUTCOME_TABLE = "cached_unique_outcome";
    private static final String FLOAT_TYPE = " FLOAT";
    private static final String INTEGER_PRIMARY_KEY_TYPE = " INTEGER PRIMARY KEY";
    private static final String INT_TYPE = " INTEGER";
    public static final String OUTCOME_EVENT_TABLE = "outcome";
    public static final String SQL_CREATE_OUTCOME_ENTRIES_V1 = "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);";
    public static final String SQL_CREATE_OUTCOME_ENTRIES_V2 = "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);";
    public static final String SQL_CREATE_OUTCOME_ENTRIES_V3 = "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);";
    public static final String SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V1 = "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);";
    public static final String SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V2 = "CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);";
    private static final String TEXT_TYPE = " TEXT";
    private static final String TIMESTAMP_TYPE = " TIMESTAMP";

    public OSOutcomeTableProvider() {
    }

    public void upgradeOutcomeTableRevision1To2(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        SQLiteDatabase db = sQLiteDatabase;
        String commonColumns = "_id,session,notification_ids,name,timestamp";
        try {
            db.execSQL("BEGIN TRANSACTION;");
            new StringBuilder();
            db.execSQL(sb.append("CREATE TEMPORARY TABLE outcome_backup(").append(commonColumns).append(");").toString());
            new StringBuilder();
            db.execSQL(sb2.append("INSERT INTO outcome_backup SELECT ").append(commonColumns).append(" FROM outcome;").toString());
            db.execSQL("DROP TABLE outcome;");
            db.execSQL(SQL_CREATE_OUTCOME_ENTRIES_V2);
            new StringBuilder();
            db.execSQL(sb3.append("INSERT INTO outcome (").append(commonColumns).append(", weight) SELECT ").append(commonColumns).append(", 0 FROM outcome_backup;").toString());
            db.execSQL("DROP TABLE outcome_backup;");
            db.execSQL("COMMIT;");
        } catch (SQLiteException e) {
            e.printStackTrace();
            db.execSQL("COMMIT;");
        } catch (Throwable th) {
            Throwable th2 = th;
            db.execSQL("COMMIT;");
            throw th2;
        }
    }

    public void upgradeOutcomeTableRevision2To3(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        SQLiteDatabase db = sQLiteDatabase;
        String commonColumns = "_id,name,timestamp,notification_ids,weight";
        new StringBuilder();
        String commonColumnsWithSessionColumn = sb.append(commonColumns).append(",").append("session").toString();
        new StringBuilder();
        String commonColumnsWithNewSessionColumn = sb2.append(commonColumns).append(",").append("notification_influence_type").toString();
        String auxOutcomeTableName = "outcome_aux";
        try {
            db.execSQL("BEGIN TRANSACTION;");
            new StringBuilder();
            db.execSQL(sb3.append("ALTER TABLE outcome RENAME TO ").append(auxOutcomeTableName).append(";").toString());
            db.execSQL(SQL_CREATE_OUTCOME_ENTRIES_V3);
            new StringBuilder();
            db.execSQL(sb4.append("INSERT INTO outcome(").append(commonColumnsWithNewSessionColumn).append(") SELECT ").append(commonColumnsWithSessionColumn).append(" FROM ").append(auxOutcomeTableName).append(";").toString());
            new StringBuilder();
            db.execSQL(sb5.append("DROP TABLE ").append(auxOutcomeTableName).append(";").toString());
            db.execSQL("COMMIT;");
        } catch (SQLiteException e) {
            e.printStackTrace();
            db.execSQL("COMMIT;");
        } catch (Throwable th) {
            Throwable th2 = th;
            db.execSQL("COMMIT;");
            throw th2;
        }
    }

    public void upgradeCacheOutcomeTableRevision1To2(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        SQLiteDatabase db = sQLiteDatabase;
        String commonColumns = "_id,name";
        new StringBuilder();
        String commonColumnsWithNotificationIdColumn = sb.append(commonColumns).append(",").append(OneSignalDbContract.NotificationTable.COLUMN_NAME_NOTIFICATION_ID).toString();
        new StringBuilder();
        String commonColumnsWithNewInfluenceIdColumn = sb2.append(commonColumns).append(",").append(CACHE_UNIQUE_OUTCOME_COLUMN_CHANNEL_INFLUENCE_ID).toString();
        String oldCacheUniqueOutcomeTable = "cached_unique_outcome_notification";
        try {
            db.execSQL("BEGIN TRANSACTION;");
            db.execSQL(SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V2);
            new StringBuilder();
            db.execSQL(sb3.append("INSERT INTO cached_unique_outcome(").append(commonColumnsWithNewInfluenceIdColumn).append(") SELECT ").append(commonColumnsWithNotificationIdColumn).append(" FROM ").append(oldCacheUniqueOutcomeTable).append(";").toString());
            new StringBuilder();
            db.execSQL(sb4.append("UPDATE cached_unique_outcome SET channel_type = '").append(OSInfluenceChannel.NOTIFICATION.toString()).append("';").toString());
            new StringBuilder();
            db.execSQL(sb5.append("DROP TABLE ").append(oldCacheUniqueOutcomeTable).append(";").toString());
            db.execSQL("COMMIT;");
        } catch (SQLiteException e) {
            e.printStackTrace();
            db.execSQL("COMMIT;");
        } catch (Throwable th) {
            Throwable th2 = th;
            db.execSQL("COMMIT;");
            throw th2;
        }
    }
}

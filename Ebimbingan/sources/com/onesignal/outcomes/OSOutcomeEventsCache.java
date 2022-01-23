package com.onesignal.outcomes;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignalDb;
import com.onesignal.influence.model.OSInfluenceChannel;
import com.onesignal.influence.model.OSInfluenceType;
import com.onesignal.outcomes.model.OSCachedUniqueOutcome;
import com.onesignal.outcomes.model.OSOutcomeEventParams;
import com.onesignal.outcomes.model.OSOutcomeSource;
import com.onesignal.outcomes.model.OSOutcomeSourceBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

class OSOutcomeEventsCache {
    private static final String PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT = "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT";
    private OneSignalDb dbHelper;
    private OSLogger logger;
    private OSSharedPreferences preferences;

    OSOutcomeEventsCache(OSLogger logger2, OneSignalDb dbHelper2, OSSharedPreferences preferences2) {
        this.logger = logger2;
        this.dbHelper = dbHelper2;
        this.preferences = preferences2;
    }

    /* access modifiers changed from: package-private */
    public boolean isOutcomesV2ServiceEnabled() {
        return this.preferences.getBool(this.preferences.getPreferencesName(), this.preferences.getOutcomesV2KeyName(), false);
    }

    /* access modifiers changed from: package-private */
    public Set<String> getUnattributedUniqueOutcomeEventsSentByChannel() {
        return this.preferences.getStringSet(this.preferences.getPreferencesName(), PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public void saveUnattributedUniqueOutcomeEventsSentByChannel(Set<String> unattributedUniqueOutcomeEvents) {
        this.preferences.saveStringSet(this.preferences.getPreferencesName(), PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT, unattributedUniqueOutcomeEvents);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public synchronized void deleteOldOutcomeEvent(OSOutcomeEventParams oSOutcomeEventParams) {
        OSOutcomeEventParams event = oSOutcomeEventParams;
        synchronized (this) {
            this.dbHelper.delete(OSOutcomeTableProvider.OUTCOME_EVENT_TABLE, "timestamp = ?", new String[]{String.valueOf(event.getTimestamp())});
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public synchronized void saveOutcomeEvent(OSOutcomeEventParams oSOutcomeEventParams) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        ContentValues contentValues;
        OSOutcomeEventParams eventParams = oSOutcomeEventParams;
        synchronized (this) {
            new JSONArray();
            JSONArray notificationIds = jSONArray;
            new JSONArray();
            JSONArray iamIds = jSONArray2;
            OSInfluenceType notificationInfluenceType = OSInfluenceType.UNATTRIBUTED;
            OSInfluenceType iamInfluenceType = OSInfluenceType.UNATTRIBUTED;
            if (eventParams.getOutcomeSource() != null) {
                OSOutcomeSource source = eventParams.getOutcomeSource();
                if (source.getDirectBody() != null) {
                    OSOutcomeSourceBody directBody = source.getDirectBody();
                    if (directBody.getNotificationIds() != null && directBody.getNotificationIds().length() > 0) {
                        notificationInfluenceType = OSInfluenceType.DIRECT;
                        notificationIds = source.getDirectBody().getNotificationIds();
                    }
                    if (directBody.getInAppMessagesIds() != null && directBody.getInAppMessagesIds().length() > 0) {
                        iamInfluenceType = OSInfluenceType.DIRECT;
                        iamIds = source.getDirectBody().getInAppMessagesIds();
                    }
                }
                if (source.getIndirectBody() != null) {
                    OSOutcomeSourceBody indirectBody = source.getIndirectBody();
                    if (indirectBody.getNotificationIds() != null && indirectBody.getNotificationIds().length() > 0) {
                        notificationInfluenceType = OSInfluenceType.INDIRECT;
                        notificationIds = source.getIndirectBody().getNotificationIds();
                    }
                    if (indirectBody.getInAppMessagesIds() != null && indirectBody.getInAppMessagesIds().length() > 0) {
                        iamInfluenceType = OSInfluenceType.INDIRECT;
                        iamIds = source.getIndirectBody().getInAppMessagesIds();
                    }
                }
            }
            new ContentValues();
            ContentValues values = contentValues;
            values.put("notification_ids", notificationIds.toString());
            values.put("iam_ids", iamIds.toString());
            values.put("notification_influence_type", notificationInfluenceType.toString().toLowerCase());
            values.put("iam_influence_type", iamInfluenceType.toString().toLowerCase());
            values.put(CommonProperties.NAME, eventParams.getOutcomeId());
            values.put("weight", eventParams.getWeight());
            values.put("timestamp", Long.valueOf(eventParams.getTimestamp()));
            this.dbHelper.insert(OSOutcomeTableProvider.OUTCOME_EVENT_TABLE, (String) null, values);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public synchronized List<OSOutcomeEventParams> getAllEventsToSend() {
        List<OSOutcomeEventParams> list;
        List<OSOutcomeEventParams> list2;
        OSOutcomeSourceBody oSOutcomeSourceBody;
        OSOutcomeSourceBody oSOutcomeSourceBody2;
        JSONArray jSONArray;
        OSOutcomeSource oSOutcomeSource;
        JSONArray jSONArray2;
        OSOutcomeSource oSOutcomeSource2;
        JSONArray jSONArray3;
        OSOutcomeSource indirectBody;
        OSOutcomeSource oSOutcomeSource3;
        JSONArray jSONArray4;
        OSOutcomeSource directBody;
        OSOutcomeSource oSOutcomeSource4;
        Object obj;
        synchronized (this) {
            new ArrayList();
            List<OSOutcomeEventParams> events = list;
            Cursor cursor = this.dbHelper.query(OSOutcomeTableProvider.OUTCOME_EVENT_TABLE, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            if (cursor.moveToFirst()) {
                do {
                    OSInfluenceType notificationInfluenceType = OSInfluenceType.fromString(cursor.getString(cursor.getColumnIndex("notification_influence_type")));
                    OSInfluenceType iamInfluenceType = OSInfluenceType.fromString(cursor.getString(cursor.getColumnIndex("iam_influence_type")));
                    String notificationIds = cursor.getString(cursor.getColumnIndex("notification_ids"));
                    String notificationIds2 = notificationIds != null ? notificationIds : "[]";
                    String iamIds = cursor.getString(cursor.getColumnIndex("iam_ids"));
                    String iamIds2 = iamIds != null ? iamIds : "[]";
                    String name = cursor.getString(cursor.getColumnIndex(CommonProperties.NAME));
                    float weight = cursor.getFloat(cursor.getColumnIndex("weight"));
                    long timestamp = cursor.getLong(cursor.getColumnIndex("timestamp"));
                    try {
                        new OSOutcomeSourceBody();
                        OSOutcomeSourceBody directSourceBody = oSOutcomeSourceBody;
                        new OSOutcomeSourceBody();
                        OSOutcomeSourceBody indirectSourceBody = oSOutcomeSourceBody2;
                        OSOutcomeSource source = null;
                        switch (notificationInfluenceType) {
                            case DIRECT:
                                OSOutcomeSourceBody oSOutcomeSourceBody3 = directSourceBody;
                                new JSONArray(notificationIds2);
                                oSOutcomeSourceBody3.setNotificationIds(jSONArray2);
                                new OSOutcomeSource(directSourceBody, (OSOutcomeSourceBody) null);
                                source = oSOutcomeSource2;
                                break;
                            case INDIRECT:
                                new JSONArray(notificationIds2);
                                indirectSourceBody.setNotificationIds(jSONArray);
                                new OSOutcomeSource((OSOutcomeSourceBody) null, indirectSourceBody);
                                source = oSOutcomeSource;
                                break;
                            case UNATTRIBUTED:
                                break;
                        }
                        switch (iamInfluenceType) {
                            case DIRECT:
                                new JSONArray(iamIds2);
                                directSourceBody.setInAppMessagesIds(jSONArray4);
                                if (source == null) {
                                    directBody = oSOutcomeSource4;
                                    new OSOutcomeSource(directSourceBody, (OSOutcomeSourceBody) null);
                                } else {
                                    directBody = source.setDirectBody(directSourceBody);
                                }
                                source = directBody;
                                break;
                            case INDIRECT:
                                new JSONArray(iamIds2);
                                indirectSourceBody.setInAppMessagesIds(jSONArray3);
                                if (source == null) {
                                    indirectBody = oSOutcomeSource3;
                                    new OSOutcomeSource((OSOutcomeSourceBody) null, indirectSourceBody);
                                } else {
                                    indirectBody = source.setIndirectBody(indirectSourceBody);
                                }
                                source = indirectBody;
                                break;
                        }
                        new OSOutcomeEventParams(name, source, weight, timestamp);
                        boolean add = events.add(obj);
                    } catch (JSONException e) {
                        this.logger.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e);
                    }
                } while (cursor.moveToNext());
            }
            cursor.close();
            list2 = events;
        }
        return list2;
    }

    private void addIdToListFromChannel(List<OSCachedUniqueOutcome> list, JSONArray jSONArray, OSInfluenceChannel oSInfluenceChannel) {
        Object obj;
        List<OSCachedUniqueOutcome> cachedUniqueOutcomes = list;
        JSONArray channelIds = jSONArray;
        OSInfluenceChannel channel = oSInfluenceChannel;
        if (channelIds != null) {
            for (int i = 0; i < channelIds.length(); i++) {
                try {
                    new OSCachedUniqueOutcome(channelIds.getString(i), channel);
                    boolean add = cachedUniqueOutcomes.add(obj);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void addIdsToListFromSource(List<OSCachedUniqueOutcome> list, OSOutcomeSourceBody oSOutcomeSourceBody) {
        List<OSCachedUniqueOutcome> cachedUniqueOutcomes = list;
        OSOutcomeSourceBody sourceBody = oSOutcomeSourceBody;
        if (sourceBody != null) {
            JSONArray iamIds = sourceBody.getInAppMessagesIds();
            JSONArray notificationIds = sourceBody.getNotificationIds();
            addIdToListFromChannel(cachedUniqueOutcomes, iamIds, OSInfluenceChannel.IAM);
            addIdToListFromChannel(cachedUniqueOutcomes, notificationIds, OSInfluenceChannel.NOTIFICATION);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public synchronized void saveUniqueOutcomeEventParams(@NonNull OSOutcomeEventParams oSOutcomeEventParams) {
        StringBuilder sb;
        List list;
        ContentValues contentValues;
        OSOutcomeEventParams eventParams = oSOutcomeEventParams;
        synchronized (this) {
            OSLogger oSLogger = this.logger;
            new StringBuilder();
            oSLogger.debug(sb.append("OneSignal saveUniqueOutcomeEventParams: ").append(eventParams.toString()).toString());
            if (eventParams.getOutcomeSource() != null) {
                String outcomeName = eventParams.getOutcomeId();
                new ArrayList();
                List<OSCachedUniqueOutcome> list2 = list;
                OSOutcomeSourceBody directBody = eventParams.getOutcomeSource().getDirectBody();
                OSOutcomeSourceBody indirectBody = eventParams.getOutcomeSource().getIndirectBody();
                addIdsToListFromSource(list2, directBody);
                addIdsToListFromSource(list2, indirectBody);
                for (OSCachedUniqueOutcome uniqueOutcome : list2) {
                    new ContentValues();
                    ContentValues values = contentValues;
                    values.put(OSOutcomeTableProvider.CACHE_UNIQUE_OUTCOME_COLUMN_CHANNEL_INFLUENCE_ID, uniqueOutcome.getInfluenceId());
                    values.put(OSOutcomeTableProvider.CACHE_UNIQUE_OUTCOME_COLUMN_CHANNEL_TYPE, String.valueOf(uniqueOutcome.getChannel()));
                    values.put(CommonProperties.NAME, outcomeName);
                    this.dbHelper.insert(OSOutcomeTableProvider.CACHE_UNIQUE_OUTCOME_TABLE, (String) null, values);
                }
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: CodeShrinkVisitor
        java.lang.NullPointerException
        */
    @androidx.annotation.WorkerThread
    synchronized java.util.List<com.onesignal.influence.model.OSInfluence> getNotCachedUniqueInfluencesForOutcome(java.lang.String r30, java.util.List<com.onesignal.influence.model.OSInfluence> r31) {
        /*
            r29 = this;
            r2 = r29
            r3 = r30
            r4 = r31
            r27 = r29
            monitor-enter(r27)
            java.util.ArrayList r18 = new java.util.ArrayList     // Catch:{ all -> 0x0150 }
            r28 = r18
            r18 = r28
            r19 = r28
            r19.<init>()     // Catch:{ all -> 0x0150 }
            r5 = r18
            r18 = 0
            r6 = r18
            r18 = r4
            java.util.Iterator r18 = r18.iterator()     // Catch:{ JSONException -> 0x011f }
            r7 = r18
        L_0x0022:
            r18 = r7
            boolean r18 = r18.hasNext()     // Catch:{ JSONException -> 0x011f }
            if (r18 == 0) goto L_0x0108
            r18 = r7
            java.lang.Object r18 = r18.next()     // Catch:{ JSONException -> 0x011f }
            com.onesignal.influence.model.OSInfluence r18 = (com.onesignal.influence.model.OSInfluence) r18     // Catch:{ JSONException -> 0x011f }
            r8 = r18
            org.json.JSONArray r18 = new org.json.JSONArray     // Catch:{ JSONException -> 0x011f }
            r28 = r18
            r18 = r28
            r19 = r28
            r19.<init>()     // Catch:{ JSONException -> 0x011f }
            r9 = r18
            r18 = r8
            org.json.JSONArray r18 = r18.getIds()     // Catch:{ JSONException -> 0x011f }
            r10 = r18
            r18 = r10
            if (r18 != 0) goto L_0x004e
            goto L_0x0022
        L_0x004e:
            r18 = 0
            r11 = r18
        L_0x0052:
            r18 = r11
            r19 = r10
            int r19 = r19.length()     // Catch:{ JSONException -> 0x011f }
            r0 = r18
            r1 = r19
            if (r0 >= r1) goto L_0x00e7
            r18 = r10
            r19 = r11
            java.lang.String r18 = r18.getString(r19)     // Catch:{ JSONException -> 0x011f }
            r12 = r18
            r18 = r8
            com.onesignal.influence.model.OSInfluenceChannel r18 = r18.getInfluenceChannel()     // Catch:{ JSONException -> 0x011f }
            r13 = r18
            r18 = 0
            r0 = r18
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ JSONException -> 0x011f }
            r18 = r0
            r14 = r18
            java.lang.String r18 = "channel_influence_id = ? AND channel_type = ? AND name = ?"
            r15 = r18
            r18 = 3
            r0 = r18
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ JSONException -> 0x011f }
            r18 = r0
            r28 = r18
            r18 = r28
            r19 = r28
            r20 = 0
            r21 = r12
            r19[r20] = r21     // Catch:{ JSONException -> 0x011f }
            r28 = r18
            r18 = r28
            r19 = r28
            r20 = 1
            r21 = r13
            java.lang.String r21 = java.lang.String.valueOf(r21)     // Catch:{ JSONException -> 0x011f }
            r19[r20] = r21     // Catch:{ JSONException -> 0x011f }
            r28 = r18
            r18 = r28
            r19 = r28
            r20 = 2
            r21 = r3
            r19[r20] = r21     // Catch:{ JSONException -> 0x011f }
            r16 = r18
            r18 = r2
            r0 = r18
            com.onesignal.OneSignalDb r0 = r0.dbHelper     // Catch:{ JSONException -> 0x011f }
            r18 = r0
            java.lang.String r19 = "cached_unique_outcome"
            r20 = r14
            r21 = r15
            r22 = r16
            r23 = 0
            r24 = 0
            r25 = 0
            java.lang.String r26 = "1"
            android.database.Cursor r18 = r18.query(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ JSONException -> 0x011f }
            r6 = r18
            r18 = r6
            int r18 = r18.getCount()     // Catch:{ JSONException -> 0x011f }
            if (r18 != 0) goto L_0x00e3
            r18 = r9
            r19 = r12
            org.json.JSONArray r18 = r18.put(r19)     // Catch:{ JSONException -> 0x011f }
        L_0x00e3:
            int r11 = r11 + 1
            goto L_0x0052
        L_0x00e7:
            r18 = r9
            int r18 = r18.length()     // Catch:{ JSONException -> 0x011f }
            if (r18 <= 0) goto L_0x0106
            r18 = r8
            com.onesignal.influence.model.OSInfluence r18 = r18.copy()     // Catch:{ JSONException -> 0x011f }
            r11 = r18
            r18 = r11
            r19 = r9
            r18.setIds(r19)     // Catch:{ JSONException -> 0x011f }
            r18 = r5
            r19 = r11
            boolean r18 = r18.add(r19)     // Catch:{ JSONException -> 0x011f }
        L_0x0106:
            goto L_0x0022
        L_0x0108:
            r18 = r6
            if (r18 == 0) goto L_0x0119
            r18 = r6
            boolean r18 = r18.isClosed()     // Catch:{ all -> 0x0150 }
            if (r18 != 0) goto L_0x0119
            r18 = r6
            r18.close()     // Catch:{ all -> 0x0150 }
        L_0x0119:
            r18 = r5
            r2 = r18
            monitor-exit(r27)
            return r2
        L_0x011f:
            r18 = move-exception
            r7 = r18
            r18 = r7
            r18.printStackTrace()     // Catch:{ all -> 0x0139 }
            r18 = r6
            if (r18 == 0) goto L_0x0119
            r18 = r6
            boolean r18 = r18.isClosed()     // Catch:{ all -> 0x0150 }
            if (r18 != 0) goto L_0x0119
            r18 = r6
            r18.close()     // Catch:{ all -> 0x0150 }
            goto L_0x0119
        L_0x0139:
            r18 = move-exception
            r17 = r18
            r18 = r6
            if (r18 == 0) goto L_0x014d
            r18 = r6
            boolean r18 = r18.isClosed()     // Catch:{ all -> 0x0150 }
            if (r18 != 0) goto L_0x014d
            r18 = r6
            r18.close()     // Catch:{ all -> 0x0150 }
        L_0x014d:
            r18 = r17
            throw r18     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r2 = move-exception
            monitor-exit(r27)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.outcomes.OSOutcomeEventsCache.getNotCachedUniqueInfluencesForOutcome(java.lang.String, java.util.List):java.util.List");
    }
}

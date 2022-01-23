package com.onesignal.influence;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.influence.model.OSInfluence;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class OSTrackerFactory {
    private OSInfluenceDataRepository dataRepository;
    private ConcurrentHashMap<String, OSChannelTracker> trackers;

    public OSTrackerFactory(OSSharedPreferences preferences, OSLogger oSLogger) {
        ConcurrentHashMap<String, OSChannelTracker> concurrentHashMap;
        OSInfluenceDataRepository oSInfluenceDataRepository;
        Object obj;
        Object obj2;
        OSLogger logger = oSLogger;
        new ConcurrentHashMap<>();
        this.trackers = concurrentHashMap;
        new OSInfluenceDataRepository(preferences);
        this.dataRepository = oSInfluenceDataRepository;
        new OSInAppMessageTracker(this.dataRepository, logger);
        OSChannelTracker put = this.trackers.put(OSInAppMessageTracker.TAG, obj);
        new OSNotificationTracker(this.dataRepository, logger);
        OSChannelTracker put2 = this.trackers.put(OSNotificationTracker.TAG, obj2);
    }

    public void saveInfluenceParams(OneSignalRemoteParams.InfluenceParams influenceParams) {
        this.dataRepository.saveInfluenceParams(influenceParams);
    }

    public void addSessionData(@NonNull JSONObject jSONObject, List<OSInfluence> influences) {
        JSONObject jsonObject = jSONObject;
        for (OSInfluence influence : influences) {
            switch (influence.getInfluenceChannel()) {
                case NOTIFICATION:
                    getNotificationChannelTracker().addSessionData(jsonObject, influence);
                    break;
            }
        }
    }

    public void initFromCache() {
        for (OSChannelTracker tracker : this.trackers.values()) {
            tracker.initInfluencedTypeFromCache();
        }
    }

    public List<OSInfluence> getInfluences() {
        List<OSInfluence> list;
        new ArrayList();
        List<OSInfluence> influences = list;
        for (OSChannelTracker tracker : this.trackers.values()) {
            boolean add = influences.add(tracker.getCurrentSessionInfluence());
        }
        return influences;
    }

    public List<OSInfluence> getSessionInfluences() {
        List<OSInfluence> list;
        new ArrayList();
        List<OSInfluence> influences = list;
        for (OSChannelTracker tracker : this.trackers.values()) {
            if (!(tracker instanceof OSInAppMessageTracker)) {
                boolean add = influences.add(tracker.getCurrentSessionInfluence());
            }
        }
        return influences;
    }

    public OSChannelTracker getIAMChannelTracker() {
        return this.trackers.get(OSInAppMessageTracker.TAG);
    }

    public OSChannelTracker getNotificationChannelTracker() {
        return this.trackers.get(OSNotificationTracker.TAG);
    }

    @Nullable
    public OSChannelTracker getChannelByEntryAction(OneSignal.AppEntryAction entryAction) {
        if (entryAction.isNotificationClick()) {
            return getNotificationChannelTracker();
        }
        return null;
    }

    public List<OSChannelTracker> getChannels() {
        List<OSChannelTracker> list;
        new ArrayList();
        List<OSChannelTracker> channels = list;
        OSChannelTracker notificationChannel = getNotificationChannelTracker();
        if (notificationChannel != null) {
            boolean add = channels.add(notificationChannel);
        }
        OSChannelTracker iamChannel = getIAMChannelTracker();
        if (iamChannel != null) {
            boolean add2 = channels.add(iamChannel);
        }
        return channels;
    }

    public List<OSChannelTracker> getChannelsToResetByEntryAction(OneSignal.AppEntryAction appEntryAction) {
        List<OSChannelTracker> list;
        OSChannelTracker notificationChannel;
        OneSignal.AppEntryAction entryAction = appEntryAction;
        new ArrayList();
        List<OSChannelTracker> channels = list;
        if (entryAction.isAppClose()) {
            return channels;
        }
        if (entryAction.isAppOpen() && (notificationChannel = getNotificationChannelTracker()) != null) {
            boolean add = channels.add(notificationChannel);
        }
        OSChannelTracker iamChannel = getIAMChannelTracker();
        if (iamChannel != null) {
            boolean add2 = channels.add(iamChannel);
        }
        return channels;
    }
}

package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import com.onesignal.influence.OSChannelTracker;
import com.onesignal.influence.OSTrackerFactory;
import com.onesignal.influence.model.OSInfluence;
import com.onesignal.influence.model.OSInfluenceType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class OSSessionManager {
    private static final String OS_END_CURRENT_SESSION = "OS_END_CURRENT_SESSION";
    private OSLogger logger;
    /* access modifiers changed from: private */
    public SessionListener sessionListener;
    protected OSTrackerFactory trackerFactory;

    public interface SessionListener {
        void onSessionEnding(@NonNull List<OSInfluence> list);
    }

    public OSSessionManager(@NonNull SessionListener sessionListener2, OSTrackerFactory trackerFactory2, OSLogger logger2) {
        this.sessionListener = sessionListener2;
        this.trackerFactory = trackerFactory2;
        this.logger = logger2;
    }

    /* access modifiers changed from: package-private */
    public void initSessionFromCache() {
        this.logger.debug("OneSignal SessionManager initSessionFromCache");
        this.trackerFactory.initFromCache();
    }

    /* access modifiers changed from: package-private */
    public void addSessionIds(@NonNull JSONObject jSONObject, List<OSInfluence> list) {
        StringBuilder sb;
        StringBuilder sb2;
        JSONObject jsonObject = jSONObject;
        List<OSInfluence> endingInfluences = list;
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal SessionManager addSessionData with influences: ").append(endingInfluences.toString()).toString());
        this.trackerFactory.addSessionData(jsonObject, endingInfluences);
        OSLogger oSLogger2 = this.logger;
        new StringBuilder();
        oSLogger2.debug(sb2.append("OneSignal SessionManager addSessionIds on jsonObject: ").append(jsonObject).toString());
    }

    /* access modifiers changed from: package-private */
    public void restartSessionIfNeeded(OneSignal.AppEntryAction appEntryAction) {
        List<OSInfluence> list;
        StringBuilder sb;
        StringBuilder sb2;
        boolean updated;
        OneSignal.AppEntryAction entryAction = appEntryAction;
        List<OSChannelTracker> channelTrackers = this.trackerFactory.getChannelsToResetByEntryAction(entryAction);
        new ArrayList<>();
        List<OSInfluence> updatedInfluences = list;
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal SessionManager restartSessionIfNeeded with entryAction: ").append(entryAction).append("\n channelTrackers: ").append(channelTrackers.toString()).toString());
        for (OSChannelTracker channelTracker : channelTrackers) {
            JSONArray lastIds = channelTracker.getLastReceivedIds();
            OSLogger oSLogger2 = this.logger;
            new StringBuilder();
            oSLogger2.debug(sb2.append("OneSignal SessionManager restartSessionIfNeeded lastIds: ").append(lastIds).toString());
            OSInfluence influence = channelTracker.getCurrentSessionInfluence();
            if (lastIds.length() > 0) {
                updated = setSession(channelTracker, OSInfluenceType.INDIRECT, (String) null, lastIds);
            } else {
                updated = setSession(channelTracker, OSInfluenceType.UNATTRIBUTED, (String) null, (JSONArray) null);
            }
            if (updated) {
                boolean add = updatedInfluences.add(influence);
            }
        }
        sendSessionEndingWithInfluences(updatedInfluences);
    }

    /* access modifiers changed from: package-private */
    public void onInAppMessageReceived(@NonNull String str) {
        StringBuilder sb;
        String messageId = str;
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal SessionManager onInAppMessageReceived messageId: ").append(messageId).toString());
        OSChannelTracker inAppMessageTracker = this.trackerFactory.getIAMChannelTracker();
        inAppMessageTracker.saveLastId(messageId);
        inAppMessageTracker.resetAndInitInfluence();
    }

    /* access modifiers changed from: package-private */
    public void onDirectInfluenceFromIAMClick(@NonNull String str) {
        StringBuilder sb;
        String messageId = str;
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: ").append(messageId).toString());
        boolean session = setSession(this.trackerFactory.getIAMChannelTracker(), OSInfluenceType.DIRECT, messageId, (JSONArray) null);
    }

    /* access modifiers changed from: package-private */
    public void onDirectInfluenceFromIAMClickFinished() {
        this.logger.debug("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        this.trackerFactory.getIAMChannelTracker().resetAndInitInfluence();
    }

    /* access modifiers changed from: package-private */
    public void onNotificationReceived(@Nullable String str) {
        StringBuilder sb;
        String notificationId = str;
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal SessionManager onNotificationReceived notificationId: ").append(notificationId).toString());
        if (notificationId != null && !notificationId.isEmpty()) {
            this.trackerFactory.getNotificationChannelTracker().saveLastId(notificationId);
        }
    }

    /* access modifiers changed from: package-private */
    public void onDirectInfluenceFromNotificationOpen(OneSignal.AppEntryAction appEntryAction, @Nullable String str) {
        StringBuilder sb;
        OneSignal.AppEntryAction entryAction = appEntryAction;
        String notificationId = str;
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: ").append(notificationId).toString());
        if (notificationId != null && !notificationId.isEmpty()) {
            attemptSessionUpgrade(entryAction, notificationId);
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public List<OSInfluence> getInfluences() {
        return this.trackerFactory.getInfluences();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public List<OSInfluence> getSessionInfluences() {
        return this.trackerFactory.getSessionInfluences();
    }

    /* access modifiers changed from: package-private */
    public void attemptSessionUpgrade(OneSignal.AppEntryAction entryAction) {
        attemptSessionUpgrade(entryAction, (String) null);
    }

    private void attemptSessionUpgrade(OneSignal.AppEntryAction appEntryAction, @Nullable String str) {
        StringBuilder sb;
        List<OSInfluence> list;
        StringBuilder sb2;
        StringBuilder sb3;
        OneSignal.AppEntryAction entryAction = appEntryAction;
        String directId = str;
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal SessionManager attemptSessionUpgrade with entryAction: ").append(entryAction).toString());
        OSChannelTracker channelTrackerByAction = this.trackerFactory.getChannelByEntryAction(entryAction);
        List<OSChannelTracker> channelTrackersToReset = this.trackerFactory.getChannelsToResetByEntryAction(entryAction);
        new ArrayList<>();
        List<OSInfluence> influencesToEnd = list;
        OSInfluence lastInfluence = null;
        boolean updated = false;
        if (channelTrackerByAction != null) {
            lastInfluence = channelTrackerByAction.getCurrentSessionInfluence();
            updated = setSession(channelTrackerByAction, OSInfluenceType.DIRECT, directId == null ? channelTrackerByAction.getDirectId() : directId, (JSONArray) null);
        }
        if (updated) {
            OSLogger oSLogger2 = this.logger;
            new StringBuilder();
            oSLogger2.debug(sb3.append("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: ").append(channelTrackersToReset).toString());
            boolean add = influencesToEnd.add(lastInfluence);
            for (OSChannelTracker tracker : channelTrackersToReset) {
                if (tracker.getInfluenceType().isDirect()) {
                    boolean add2 = influencesToEnd.add(tracker.getCurrentSessionInfluence());
                    tracker.resetAndInitInfluence();
                }
            }
        }
        this.logger.debug("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        for (OSChannelTracker channelTracker : channelTrackersToReset) {
            if (channelTracker.getInfluenceType().isUnattributed()) {
                JSONArray lastIds = channelTracker.getLastReceivedIds();
                if (lastIds.length() > 0 && !entryAction.isAppClose()) {
                    OSInfluence influence = channelTracker.getCurrentSessionInfluence();
                    if (setSession(channelTracker, OSInfluenceType.INDIRECT, (String) null, lastIds)) {
                        boolean add3 = influencesToEnd.add(influence);
                    }
                }
            }
        }
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb2.append("Trackers after update attempt: ").append(this.trackerFactory.getChannels().toString()).toString());
        sendSessionEndingWithInfluences(influencesToEnd);
    }

    private boolean setSession(@NonNull OSChannelTracker oSChannelTracker, @NonNull OSInfluenceType oSInfluenceType, @Nullable String str, @Nullable JSONArray jSONArray) {
        StringBuilder sb;
        StringBuilder sb2;
        OSChannelTracker channelTracker = oSChannelTracker;
        OSInfluenceType influenceType = oSInfluenceType;
        String directNotificationId = str;
        JSONArray indirectNotificationIds = jSONArray;
        if (!willChangeSession(channelTracker, influenceType, directNotificationId, indirectNotificationIds)) {
            return false;
        }
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("OSChannelTracker changed: ").append(channelTracker.getIdTag()).append("\nfrom:\ninfluenceType: ").append(channelTracker.getInfluenceType()).append(", directNotificationId: ").append(channelTracker.getDirectId()).append(", indirectNotificationIds: ").append(channelTracker.getIndirectIds()).append("\nto:\ninfluenceType: ").append(influenceType).append(", directNotificationId: ").append(directNotificationId).append(", indirectNotificationIds: ").append(indirectNotificationIds).toString());
        channelTracker.setInfluenceType(influenceType);
        channelTracker.setDirectId(directNotificationId);
        channelTracker.setIndirectIds(indirectNotificationIds);
        channelTracker.cacheState();
        OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level2, sb2.append("Trackers changed to: ").append(this.trackerFactory.getChannels().toString()).toString());
        return true;
    }

    private boolean willChangeSession(@NonNull OSChannelTracker oSChannelTracker, @NonNull OSInfluenceType influenceType, @Nullable String str, @Nullable JSONArray jSONArray) {
        OSChannelTracker channelTracker = oSChannelTracker;
        String directNotificationId = str;
        JSONArray indirectNotificationIds = jSONArray;
        if (!influenceType.equals(channelTracker.getInfluenceType())) {
            return true;
        }
        OSInfluenceType channelInfluenceType = channelTracker.getInfluenceType();
        if (channelInfluenceType.isDirect() && channelTracker.getDirectId() != null && !channelTracker.getDirectId().equals(directNotificationId)) {
            return true;
        }
        return channelInfluenceType.isIndirect() && channelTracker.getIndirectIds() != null && channelTracker.getIndirectIds().length() > 0 && !JSONUtils.compareJSONArrays(channelTracker.getIndirectIds(), indirectNotificationIds);
    }

    private void sendSessionEndingWithInfluences(List<OSInfluence> list) {
        StringBuilder sb;
        Thread thread;
        Runnable runnable;
        List<OSInfluence> endingInfluences = list;
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal SessionManager sendSessionEndingWithInfluences with influences: ").append(endingInfluences).toString());
        if (endingInfluences.size() > 0) {
            final List<OSInfluence> list2 = endingInfluences;
            new Runnable(this) {
                final /* synthetic */ OSSessionManager this$0;

                {
                    this.this$0 = this$0;
                }

                public void run() {
                    Thread.currentThread().setPriority(10);
                    this.this$0.sessionListener.onSessionEnding(list2);
                }
            };
            new Thread(runnable, OS_END_CURRENT_SESSION);
            thread.start();
        }
    }
}

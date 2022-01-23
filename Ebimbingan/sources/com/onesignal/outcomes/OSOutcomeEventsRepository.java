package com.onesignal.outcomes;

import com.onesignal.OSLogger;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.influence.model.OSInfluence;
import com.onesignal.outcomes.domain.OutcomeEventsService;
import com.onesignal.outcomes.model.OSOutcomeEventParams;
import java.util.List;
import java.util.Set;

abstract class OSOutcomeEventsRepository implements com.onesignal.outcomes.domain.OSOutcomeEventsRepository {
    static final String APP_ID = "app_id";
    static final String DEVICE_TYPE = "device_type";
    protected final OSLogger logger;
    private final OSOutcomeEventsCache outcomeEventsCache;
    final OutcomeEventsService outcomeEventsService;

    public abstract void requestMeasureOutcomeEvent(String str, int i, OSOutcomeEventParams oSOutcomeEventParams, OneSignalApiResponseHandler oneSignalApiResponseHandler);

    OSOutcomeEventsRepository(OSLogger logger2, OSOutcomeEventsCache outcomeEventsCache2, OutcomeEventsService outcomeEventsService2) {
        this.logger = logger2;
        this.outcomeEventsCache = outcomeEventsCache2;
        this.outcomeEventsService = outcomeEventsService2;
    }

    public List<OSOutcomeEventParams> getSavedOutcomeEvents() {
        return this.outcomeEventsCache.getAllEventsToSend();
    }

    public void saveOutcomeEvent(OSOutcomeEventParams event) {
        this.outcomeEventsCache.saveOutcomeEvent(event);
    }

    public void removeEvent(OSOutcomeEventParams outcomeEvent) {
        this.outcomeEventsCache.deleteOldOutcomeEvent(outcomeEvent);
    }

    public void saveUniqueOutcomeNotifications(OSOutcomeEventParams eventParams) {
        this.outcomeEventsCache.saveUniqueOutcomeEventParams(eventParams);
    }

    public List<OSInfluence> getNotCachedUniqueOutcome(String name, List<OSInfluence> influences) {
        StringBuilder sb;
        List<OSInfluence> influencesNotCached = this.outcomeEventsCache.getNotCachedUniqueInfluencesForOutcome(name, influences);
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal getNotCachedUniqueOutcome influences: ").append(influencesNotCached).toString());
        return influencesNotCached;
    }

    public Set<String> getUnattributedUniqueOutcomeEventsSent() {
        StringBuilder sb;
        Set<String> unattributedUniqueOutcomeEvents = this.outcomeEventsCache.getUnattributedUniqueOutcomeEventsSentByChannel();
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: ").append(unattributedUniqueOutcomeEvents).toString());
        return unattributedUniqueOutcomeEvents;
    }

    public void saveUnattributedUniqueOutcomeEventsSent(Set<String> set) {
        StringBuilder sb;
        Set<String> unattributedUniqueOutcomeEvents = set;
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal save unattributedUniqueOutcomeEvents: ").append(unattributedUniqueOutcomeEvents).toString());
        this.outcomeEventsCache.saveUnattributedUniqueOutcomeEventsSentByChannel(unattributedUniqueOutcomeEvents);
    }
}

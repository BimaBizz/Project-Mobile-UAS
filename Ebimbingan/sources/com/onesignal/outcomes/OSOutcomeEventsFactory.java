package com.onesignal.outcomes;

import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignalAPIClient;
import com.onesignal.OneSignalDb;
import com.onesignal.outcomes.domain.OSOutcomeEventsRepository;
import com.onesignal.outcomes.domain.OutcomeEventsService;

public class OSOutcomeEventsFactory {
    private final OneSignalAPIClient apiClient;
    private final OSLogger logger;
    private final OSOutcomeEventsCache outcomeEventsCache;
    private OSOutcomeEventsRepository repository;

    public OSOutcomeEventsFactory(OSLogger oSLogger, OneSignalAPIClient apiClient2, OneSignalDb dbHelper, OSSharedPreferences preferences) {
        OSOutcomeEventsCache oSOutcomeEventsCache;
        OSLogger logger2 = oSLogger;
        this.logger = logger2;
        this.apiClient = apiClient2;
        new OSOutcomeEventsCache(logger2, dbHelper, preferences);
        this.outcomeEventsCache = oSOutcomeEventsCache;
    }

    public OSOutcomeEventsRepository getRepository() {
        if (this.repository == null) {
            createRepository();
        } else {
            validateRepositoryVersion();
        }
        return this.repository;
    }

    private void validateRepositoryVersion() {
        if (!this.outcomeEventsCache.isOutcomesV2ServiceEnabled() && (this.repository instanceof OSOutcomeEventsV1Repository)) {
            return;
        }
        if (!this.outcomeEventsCache.isOutcomesV2ServiceEnabled() || !(this.repository instanceof OSOutcomeEventsV2Repository)) {
            createRepository();
        }
    }

    private void createRepository() {
        OSOutcomeEventsRepository oSOutcomeEventsRepository;
        OutcomeEventsService outcomeEventsService;
        OSOutcomeEventsRepository oSOutcomeEventsRepository2;
        OutcomeEventsService outcomeEventsService2;
        if (this.outcomeEventsCache.isOutcomesV2ServiceEnabled()) {
            new OSOutcomeEventsV2Service(this.apiClient);
            new OSOutcomeEventsV2Repository(this.logger, this.outcomeEventsCache, outcomeEventsService2);
            this.repository = oSOutcomeEventsRepository2;
            return;
        }
        new OSOutcomeEventsV1Service(this.apiClient);
        new OSOutcomeEventsV1Repository(this.logger, this.outcomeEventsCache, outcomeEventsService);
        this.repository = oSOutcomeEventsRepository;
    }
}

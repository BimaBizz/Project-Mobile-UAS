package com.onesignal.outcomes;

import com.onesignal.OneSignalAPIClient;
import com.onesignal.OneSignalApiResponseHandler;
import org.json.JSONObject;

class OSOutcomeEventsV2Service extends OSOutcomeEventsClient {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OSOutcomeEventsV2Service(OneSignalAPIClient client) {
        super(client);
    }

    public void sendOutcomeEvent(JSONObject object, OneSignalApiResponseHandler responseHandler) {
        this.client.post("outcomes/measure_sources", object, responseHandler);
    }
}

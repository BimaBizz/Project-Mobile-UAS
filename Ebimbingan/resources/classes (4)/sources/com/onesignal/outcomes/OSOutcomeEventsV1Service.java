package com.onesignal.outcomes;

import com.onesignal.OneSignalAPIClient;
import com.onesignal.OneSignalApiResponseHandler;
import org.json.JSONObject;

class OSOutcomeEventsV1Service extends OSOutcomeEventsClient {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OSOutcomeEventsV1Service(OneSignalAPIClient client) {
        super(client);
    }

    public void sendOutcomeEvent(JSONObject object, OneSignalApiResponseHandler responseHandler) {
        this.client.post("outcomes/measure", object, responseHandler);
    }
}

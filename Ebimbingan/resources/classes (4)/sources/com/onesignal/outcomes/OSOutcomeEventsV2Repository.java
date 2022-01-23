package com.onesignal.outcomes;

import com.onesignal.OSLogger;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.outcomes.domain.OutcomeEventsService;
import com.onesignal.outcomes.model.OSOutcomeEventParams;
import org.json.JSONException;
import org.json.JSONObject;

class OSOutcomeEventsV2Repository extends OSOutcomeEventsRepository {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OSOutcomeEventsV2Repository(OSLogger logger, OSOutcomeEventsCache outcomeEventsCache, OutcomeEventsService outcomeEventsService) {
        super(logger, outcomeEventsCache, outcomeEventsService);
    }

    public void requestMeasureOutcomeEvent(String str, int i, OSOutcomeEventParams event, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        String appId = str;
        int deviceType = i;
        OneSignalApiResponseHandler responseHandler = oneSignalApiResponseHandler;
        try {
            JSONObject jsonObject = event.toJSONObject();
            JSONObject put = jsonObject.put("app_id", appId);
            JSONObject put2 = jsonObject.put("device_type", deviceType);
            this.outcomeEventsService.sendOutcomeEvent(jsonObject, responseHandler);
        } catch (JSONException e) {
            this.logger.error("Generating indirect outcome:JSON Failed.", e);
        }
    }
}

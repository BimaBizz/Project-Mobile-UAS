package com.onesignal.outcomes;

import com.onesignal.OSLogger;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.OutcomeEvent;
import com.onesignal.outcomes.domain.OutcomeEventsService;
import com.onesignal.outcomes.model.OSOutcomeEventParams;
import org.json.JSONException;
import org.json.JSONObject;

class OSOutcomeEventsV1Repository extends OSOutcomeEventsRepository {
    private static final String DIRECT = "direct";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OSOutcomeEventsV1Repository(OSLogger logger, OSOutcomeEventsCache outcomeEventsCache, OutcomeEventsService outcomeEventsService) {
        super(logger, outcomeEventsCache, outcomeEventsService);
    }

    public void requestMeasureOutcomeEvent(String str, int i, OSOutcomeEventParams eventParams, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        String appId = str;
        int deviceType = i;
        OneSignalApiResponseHandler responseHandler = oneSignalApiResponseHandler;
        OutcomeEvent event = OutcomeEvent.fromOutcomeEventParamsV2toOutcomeEventV1(eventParams);
        switch (event.getSession()) {
            case DIRECT:
                requestMeasureDirectOutcomeEvent(appId, deviceType, event, responseHandler);
                return;
            case INDIRECT:
                requestMeasureIndirectOutcomeEvent(appId, deviceType, event, responseHandler);
                return;
            case UNATTRIBUTED:
                requestMeasureUnattributedOutcomeEvent(appId, deviceType, event, responseHandler);
                return;
            default:
                return;
        }
    }

    private void requestMeasureDirectOutcomeEvent(String str, int i, OutcomeEvent event, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        String appId = str;
        int deviceType = i;
        OneSignalApiResponseHandler responseHandler = oneSignalApiResponseHandler;
        try {
            JSONObject jsonObject = event.toJSONObjectForMeasure();
            JSONObject put = jsonObject.put("app_id", appId);
            JSONObject put2 = jsonObject.put("device_type", deviceType);
            JSONObject put3 = jsonObject.put(DIRECT, true);
            this.outcomeEventsService.sendOutcomeEvent(jsonObject, responseHandler);
        } catch (JSONException e) {
            this.logger.error("Generating direct outcome:JSON Failed.", e);
        }
    }

    private void requestMeasureIndirectOutcomeEvent(String str, int i, OutcomeEvent event, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        String appId = str;
        int deviceType = i;
        OneSignalApiResponseHandler responseHandler = oneSignalApiResponseHandler;
        try {
            JSONObject jsonObject = event.toJSONObjectForMeasure();
            JSONObject put = jsonObject.put("app_id", appId);
            JSONObject put2 = jsonObject.put("device_type", deviceType);
            JSONObject put3 = jsonObject.put(DIRECT, false);
            this.outcomeEventsService.sendOutcomeEvent(jsonObject, responseHandler);
        } catch (JSONException e) {
            this.logger.error("Generating indirect outcome:JSON Failed.", e);
        }
    }

    private void requestMeasureUnattributedOutcomeEvent(String str, int i, OutcomeEvent event, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        String appId = str;
        int deviceType = i;
        OneSignalApiResponseHandler responseHandler = oneSignalApiResponseHandler;
        try {
            JSONObject jsonObject = event.toJSONObjectForMeasure();
            JSONObject put = jsonObject.put("app_id", appId);
            JSONObject put2 = jsonObject.put("device_type", deviceType);
            this.outcomeEventsService.sendOutcomeEvent(jsonObject, responseHandler);
        } catch (JSONException e) {
            this.logger.error("Generating unattributed outcome:JSON Failed.", e);
        }
    }
}

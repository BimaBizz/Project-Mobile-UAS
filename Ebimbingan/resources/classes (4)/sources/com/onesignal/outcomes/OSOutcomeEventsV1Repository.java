package com.onesignal.outcomes;

import com.bumptech.glide.gifdecoder.GifDecoder;
import com.onesignal.OSLogger;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.OutcomeEvent;
import com.onesignal.influence.model.OSInfluenceType;
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

    /* renamed from: com.onesignal.outcomes.OSOutcomeEventsV1Repository$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$onesignal$influence$model$OSInfluenceType = new int[OSInfluenceType.values().length];

        static {
            try {
                $SwitchMap$com$onesignal$influence$model$OSInfluenceType[OSInfluenceType.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                NoSuchFieldError noSuchFieldError = e;
            }
            try {
                $SwitchMap$com$onesignal$influence$model$OSInfluenceType[OSInfluenceType.INDIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                NoSuchFieldError noSuchFieldError2 = e2;
            }
            try {
                $SwitchMap$com$onesignal$influence$model$OSInfluenceType[OSInfluenceType.UNATTRIBUTED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                NoSuchFieldError noSuchFieldError3 = e3;
            }
            try {
                $SwitchMap$com$onesignal$influence$model$OSInfluenceType[OSInfluenceType.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                NoSuchFieldError noSuchFieldError4 = e4;
            }
        }
    }

    public void requestMeasureOutcomeEvent(String str, int i, OSOutcomeEventParams eventParams, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        String appId = str;
        int deviceType = i;
        OneSignalApiResponseHandler responseHandler = oneSignalApiResponseHandler;
        OutcomeEvent event = OutcomeEvent.fromOutcomeEventParamsV2toOutcomeEventV1(eventParams);
        switch (AnonymousClass1.$SwitchMap$com$onesignal$influence$model$OSInfluenceType[event.getSession().ordinal()]) {
            case 1:
                requestMeasureDirectOutcomeEvent(appId, deviceType, event, responseHandler);
                return;
            case 2:
                requestMeasureIndirectOutcomeEvent(appId, deviceType, event, responseHandler);
                return;
            case GifDecoder.STATUS_PARTIAL_DECODE:
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

package com.onesignal;

import androidx.annotation.NonNull;
import com.onesignal.OneSignalRestClient;
import org.json.JSONObject;

class OneSignalRestClientWrapper implements OneSignalAPIClient {
    OneSignalRestClientWrapper() {
    }

    public void put(String url, JSONObject jsonBody, OneSignalApiResponseHandler responseHandler) {
        OneSignalRestClient.ResponseHandler responseHandler2;
        final OneSignalApiResponseHandler oneSignalApiResponseHandler = responseHandler;
        new OneSignalRestClient.ResponseHandler(this) {
            final /* synthetic */ OneSignalRestClientWrapper this$0;

            {
                this.this$0 = this$0;
            }

            public void onSuccess(String response) {
                oneSignalApiResponseHandler.onSuccess(response);
            }

            public void onFailure(int statusCode, String response, Throwable throwable) {
                oneSignalApiResponseHandler.onFailure(statusCode, response, throwable);
            }
        };
        OneSignalRestClient.put(url, jsonBody, responseHandler2);
    }

    public void post(String url, JSONObject jsonBody, OneSignalApiResponseHandler responseHandler) {
        OneSignalRestClient.ResponseHandler responseHandler2;
        final OneSignalApiResponseHandler oneSignalApiResponseHandler = responseHandler;
        new OneSignalRestClient.ResponseHandler(this) {
            final /* synthetic */ OneSignalRestClientWrapper this$0;

            {
                this.this$0 = this$0;
            }

            public void onSuccess(String response) {
                oneSignalApiResponseHandler.onSuccess(response);
            }

            public void onFailure(int statusCode, String response, Throwable throwable) {
                oneSignalApiResponseHandler.onFailure(statusCode, response, throwable);
            }
        };
        OneSignalRestClient.post(url, jsonBody, responseHandler2);
    }

    public void get(String url, OneSignalApiResponseHandler responseHandler, @NonNull String cacheKey) {
        OneSignalRestClient.ResponseHandler responseHandler2;
        final OneSignalApiResponseHandler oneSignalApiResponseHandler = responseHandler;
        new OneSignalRestClient.ResponseHandler(this) {
            final /* synthetic */ OneSignalRestClientWrapper this$0;

            {
                this.this$0 = this$0;
            }

            public void onSuccess(String response) {
                oneSignalApiResponseHandler.onSuccess(response);
            }

            public void onFailure(int statusCode, String response, Throwable throwable) {
                oneSignalApiResponseHandler.onFailure(statusCode, response, throwable);
            }
        };
        OneSignalRestClient.get(url, responseHandler2, cacheKey);
    }

    public void getSync(String url, OneSignalApiResponseHandler responseHandler, @NonNull String cacheKey) {
        OneSignalRestClient.ResponseHandler responseHandler2;
        final OneSignalApiResponseHandler oneSignalApiResponseHandler = responseHandler;
        new OneSignalRestClient.ResponseHandler(this) {
            final /* synthetic */ OneSignalRestClientWrapper this$0;

            {
                this.this$0 = this$0;
            }

            public void onSuccess(String response) {
                oneSignalApiResponseHandler.onSuccess(response);
            }

            public void onFailure(int statusCode, String response, Throwable throwable) {
                oneSignalApiResponseHandler.onFailure(statusCode, response, throwable);
            }
        };
        OneSignalRestClient.getSync(url, responseHandler2, cacheKey);
    }

    public void putSync(String url, JSONObject jsonBody, OneSignalApiResponseHandler responseHandler) {
        OneSignalRestClient.ResponseHandler responseHandler2;
        final OneSignalApiResponseHandler oneSignalApiResponseHandler = responseHandler;
        new OneSignalRestClient.ResponseHandler(this) {
            final /* synthetic */ OneSignalRestClientWrapper this$0;

            {
                this.this$0 = this$0;
            }

            public void onSuccess(String response) {
                oneSignalApiResponseHandler.onSuccess(response);
            }

            public void onFailure(int statusCode, String response, Throwable throwable) {
                oneSignalApiResponseHandler.onFailure(statusCode, response, throwable);
            }
        };
        OneSignalRestClient.putSync(url, jsonBody, responseHandler2);
    }

    public void postSync(String url, JSONObject jsonBody, OneSignalApiResponseHandler responseHandler) {
        OneSignalRestClient.ResponseHandler responseHandler2;
        final OneSignalApiResponseHandler oneSignalApiResponseHandler = responseHandler;
        new OneSignalRestClient.ResponseHandler(this) {
            final /* synthetic */ OneSignalRestClientWrapper this$0;

            {
                this.this$0 = this$0;
            }

            public void onSuccess(String response) {
                oneSignalApiResponseHandler.onSuccess(response);
            }

            public void onFailure(int statusCode, String response, Throwable throwable) {
                oneSignalApiResponseHandler.onFailure(statusCode, response, throwable);
            }
        };
        OneSignalRestClient.postSync(url, jsonBody, responseHandler2);
    }
}

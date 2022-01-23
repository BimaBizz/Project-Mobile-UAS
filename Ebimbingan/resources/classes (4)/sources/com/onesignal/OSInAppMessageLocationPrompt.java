package com.onesignal;

import com.onesignal.OneSignal;

class OSInAppMessageLocationPrompt extends OSInAppMessagePrompt {
    static final String LOCATION_PROMPT_KEY = "location";

    OSInAppMessageLocationPrompt() {
    }

    /* access modifiers changed from: package-private */
    public void handlePrompt(OneSignal.OSPromptActionCompletionCallback callback) {
        OneSignal.promptLocation(callback, true);
    }

    /* access modifiers changed from: package-private */
    public String getPromptKey() {
        return LOCATION_PROMPT_KEY;
    }
}

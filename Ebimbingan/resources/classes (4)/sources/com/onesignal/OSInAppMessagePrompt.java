package com.onesignal;

import com.onesignal.OneSignal;

abstract class OSInAppMessagePrompt {
    private boolean prompted = false;

    /* access modifiers changed from: package-private */
    public abstract String getPromptKey();

    /* access modifiers changed from: package-private */
    public abstract void handlePrompt(OneSignal.OSPromptActionCompletionCallback oSPromptActionCompletionCallback);

    OSInAppMessagePrompt() {
    }

    /* access modifiers changed from: package-private */
    public boolean hasPrompted() {
        return this.prompted;
    }

    /* access modifiers changed from: package-private */
    public void setPrompted(boolean prompted2) {
        boolean z = prompted2;
        this.prompted = z;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("OSInAppMessagePrompt{key=").append(getPromptKey()).append(" prompted=").append(this.prompted).append('}').toString();
    }
}

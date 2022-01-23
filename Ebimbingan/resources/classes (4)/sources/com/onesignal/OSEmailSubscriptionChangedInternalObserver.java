package com.onesignal;

class OSEmailSubscriptionChangedInternalObserver {
    OSEmailSubscriptionChangedInternalObserver() {
    }

    /* access modifiers changed from: package-private */
    public void changed(OSEmailSubscriptionState state) {
        fireChangesToPublicObserver(state);
    }

    static void fireChangesToPublicObserver(OSEmailSubscriptionState oSEmailSubscriptionState) {
        OSEmailSubscriptionStateChanges oSEmailSubscriptionStateChanges;
        OSEmailSubscriptionState state = oSEmailSubscriptionState;
        new OSEmailSubscriptionStateChanges();
        OSEmailSubscriptionStateChanges stateChanges = oSEmailSubscriptionStateChanges;
        stateChanges.from = OneSignal.lastEmailSubscriptionState;
        stateChanges.to = (OSEmailSubscriptionState) state.clone();
        if (OneSignal.getEmailSubscriptionStateChangesObserver().notifyChange(stateChanges)) {
            OneSignal.lastEmailSubscriptionState = (OSEmailSubscriptionState) state.clone();
            OneSignal.lastEmailSubscriptionState.persistAsFrom();
        }
    }
}

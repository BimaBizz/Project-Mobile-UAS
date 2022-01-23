package com.onesignal;

class OSSubscriptionChangedInternalObserver {
    OSSubscriptionChangedInternalObserver() {
    }

    public void changed(OSSubscriptionState state) {
        fireChangesToPublicObserver(state);
    }

    static void fireChangesToPublicObserver(OSSubscriptionState oSSubscriptionState) {
        OSSubscriptionStateChanges oSSubscriptionStateChanges;
        OSSubscriptionState state = oSSubscriptionState;
        new OSSubscriptionStateChanges();
        OSSubscriptionStateChanges stateChanges = oSSubscriptionStateChanges;
        stateChanges.from = OneSignal.lastSubscriptionState;
        stateChanges.to = (OSSubscriptionState) state.clone();
        if (OneSignal.getSubscriptionStateChangesObserver().notifyChange(stateChanges)) {
            OneSignal.lastSubscriptionState = (OSSubscriptionState) state.clone();
            OneSignal.lastSubscriptionState.persistAsFrom();
        }
    }
}

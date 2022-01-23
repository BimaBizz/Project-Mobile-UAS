package com.onesignal;

class OSPermissionChangedInternalObserver {
    OSPermissionChangedInternalObserver() {
    }

    /* access modifiers changed from: package-private */
    public void changed(OSPermissionState oSPermissionState) {
        OSPermissionState state = oSPermissionState;
        handleInternalChanges(state);
        fireChangesToPublicObserver(state);
    }

    static void handleInternalChanges(OSPermissionState state) {
        if (!state.getEnabled()) {
            BadgeCountUpdater.updateCount(0, OneSignal.appContext);
        }
        OneSignalStateSynchronizer.setPermission(OneSignal.areNotificationsEnabledForSubscribedState());
    }

    static void fireChangesToPublicObserver(OSPermissionState oSPermissionState) {
        OSPermissionStateChanges oSPermissionStateChanges;
        OSPermissionState state = oSPermissionState;
        new OSPermissionStateChanges();
        OSPermissionStateChanges stateChanges = oSPermissionStateChanges;
        stateChanges.from = OneSignal.lastPermissionState;
        stateChanges.to = (OSPermissionState) state.clone();
        if (OneSignal.getPermissionStateChangesObserver().notifyChange(stateChanges)) {
            OneSignal.lastPermissionState = (OSPermissionState) state.clone();
            OneSignal.lastPermissionState.persistAsFrom();
        }
    }
}

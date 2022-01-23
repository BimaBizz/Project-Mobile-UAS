package com.onesignal;

import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserStateSynchronizer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class UserStateEmailSynchronizer extends UserStateSynchronizer {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UserStateEmailSynchronizer() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.EMAIL);
    }

    /* access modifiers changed from: protected */
    public UserState newUserState(String inPersistKey, boolean load) {
        UserState userState;
        new UserStateEmail(inPersistKey, load);
        return userState;
    }

    /* access modifiers changed from: protected */
    public OneSignal.LOG_LEVEL getLogLevel() {
        return OneSignal.LOG_LEVEL.INFO;
    }

    /* access modifiers changed from: package-private */
    public boolean getSubscribed() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public UserStateSynchronizer.GetTagsResult getTags(boolean z) {
        boolean z2 = z;
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public String getExternalId(boolean z) {
        boolean z2 = z;
        return null;
    }

    /* access modifiers changed from: package-private */
    public void setSubscription(boolean enable) {
    }

    public boolean getUserSubscribePreference() {
        return false;
    }

    public void setPermission(boolean enable) {
    }

    /* access modifiers changed from: package-private */
    public void updateState(JSONObject state) {
    }

    /* access modifiers changed from: package-private */
    public void refresh() {
        scheduleSyncToServer();
    }

    /* access modifiers changed from: protected */
    public void scheduleSyncToServer() {
        if (!(getId() == null && getRegistrationId() == null) && OneSignal.getUserId() != null) {
            getNetworkHandlerThread(0).runNewJobDelayed();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setEmail(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r14
            r8 = r0
            com.onesignal.UserState r8 = r8.getUserStateForModification()
            r3 = r8
            r8 = r3
            com.onesignal.ImmutableJSONObject r8 = r8.getSyncValues()
            r4 = r8
            r8 = r1
            r9 = r4
            java.lang.String r10 = "identifier"
            java.lang.String r9 = r9.optString(r10)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x003d
            r8 = r4
            java.lang.String r9 = "email_auth_hash"
            java.lang.String r8 = r8.optString(r9)
            r9 = r2
            if (r9 != 0) goto L_0x003b
            java.lang.String r9 = ""
        L_0x002c:
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x003d
            r8 = 1
        L_0x0033:
            r5 = r8
            r8 = r5
            if (r8 == 0) goto L_0x003f
            com.onesignal.OneSignal.fireEmailUpdateSuccess()
        L_0x003a:
            return
        L_0x003b:
            r9 = r2
            goto L_0x002c
        L_0x003d:
            r8 = 0
            goto L_0x0033
        L_0x003f:
            r8 = r4
            java.lang.String r9 = "identifier"
            r10 = 0
            java.lang.String r8 = r8.optString(r9, r10)
            r6 = r8
            r8 = r6
            if (r8 != 0) goto L_0x0050
            r8 = r0
            r8.setNewSession()
        L_0x0050:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0096 }
            r11 = r8
            r8 = r11
            r9 = r11
            r9.<init>()     // Catch:{ JSONException -> 0x0096 }
            r7 = r8
            r8 = r7
            java.lang.String r9 = "identifier"
            r10 = r1
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch:{ JSONException -> 0x0096 }
            r8 = r2
            if (r8 == 0) goto L_0x006e
            r8 = r7
            java.lang.String r9 = "email_auth_hash"
            r10 = r2
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch:{ JSONException -> 0x0096 }
        L_0x006e:
            r8 = r2
            if (r8 != 0) goto L_0x008a
            r8 = r6
            if (r8 == 0) goto L_0x008a
            r8 = r6
            r9 = r1
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x0096 }
            if (r8 != 0) goto L_0x008a
            java.lang.String r8 = ""
            com.onesignal.OneSignal.saveEmailId(r8)     // Catch:{ JSONException -> 0x0096 }
            r8 = r0
            r8.resetCurrentState()     // Catch:{ JSONException -> 0x0096 }
            r8 = r0
            r8.setNewSession()     // Catch:{ JSONException -> 0x0096 }
        L_0x008a:
            r8 = r3
            r9 = r7
            r10 = 0
            org.json.JSONObject r8 = r8.generateJsonDiffFromIntoSyncValued(r9, r10)     // Catch:{ JSONException -> 0x0096 }
            r8 = r0
            r8.scheduleSyncToServer()     // Catch:{ JSONException -> 0x0096 }
        L_0x0095:
            goto L_0x003a
        L_0x0096:
            r8 = move-exception
            r7 = r8
            r8 = r7
            r8.printStackTrace()
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.UserStateEmailSynchronizer.setEmail(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public String getId() {
        return OneSignal.getEmailId();
    }

    /* access modifiers changed from: package-private */
    public void updateIdDependents(String id) {
        OneSignal.updateEmailIdDependents(id);
    }

    /* access modifiers changed from: protected */
    public void addOnSessionOrCreateExtras(JSONObject jSONObject) {
        JSONObject jsonBody = jSONObject;
        try {
            JSONObject put = jsonBody.put("device_type", 11);
            JSONObject putOpt = jsonBody.putOpt("device_player_id", OneSignal.getUserId());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void logoutEmail() {
        List<String> list;
        OneSignal.saveEmailId("");
        resetCurrentState();
        getToSyncUserState().removeFromSyncValues("identifier");
        new ArrayList<>();
        List<String> keysToRemove = list;
        boolean add = keysToRemove.add("email_auth_hash");
        boolean add2 = keysToRemove.add("device_player_id");
        boolean add3 = keysToRemove.add("external_user_id");
        this.toSyncUserState.removeFromSyncValues(keysToRemove);
        this.toSyncUserState.persistState();
        OneSignal.getPermissionSubscriptionState().emailSubscriptionStatus.clearEmailAndId();
    }

    /* access modifiers changed from: protected */
    public void fireEventsForUpdateFailure(JSONObject jsonFields) {
        if (jsonFields.has("identifier")) {
            OneSignal.fireEmailUpdateFailure();
        }
    }

    /* access modifiers changed from: protected */
    public void onSuccessfulSync(JSONObject jsonFields) {
        if (jsonFields.has("identifier")) {
            OneSignal.fireEmailUpdateSuccess();
        }
    }
}

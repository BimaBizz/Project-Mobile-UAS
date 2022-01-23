package com.onesignal;

class UserStateEmail extends UserState {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    UserStateEmail(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r6 = r4
            r4 = r6
            r5 = r6
            r5.<init>()
            java.lang.String r5 = "email"
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = r1
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = r2
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.UserStateEmail.<init>(java.lang.String, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public UserState newInstance(String persistKey) {
        UserStateEmail userStateEmail;
        new UserStateEmail(persistKey, false);
        return userStateEmail;
    }

    /* access modifiers changed from: protected */
    public void addDependFields() {
    }

    /* access modifiers changed from: package-private */
    public boolean isSubscribed() {
        return true;
    }
}

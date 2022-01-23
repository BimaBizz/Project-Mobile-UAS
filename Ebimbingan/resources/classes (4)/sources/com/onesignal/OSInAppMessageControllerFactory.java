package com.onesignal;

import android.os.Build;

class OSInAppMessageControllerFactory {
    private static final Object LOCK;
    private OSInAppMessageController controller;

    OSInAppMessageControllerFactory() {
    }

    static {
        Object obj;
        new Object();
        LOCK = obj;
    }

    public OSInAppMessageController getController(OneSignalDbHelper oneSignalDbHelper) {
        OSInAppMessageController oSInAppMessageController;
        OSInAppMessageController oSInAppMessageController2;
        OneSignalDbHelper dbHelper = oneSignalDbHelper;
        if (this.controller == null) {
            Object obj = LOCK;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    if (this.controller == null) {
                        if (Build.VERSION.SDK_INT <= 18) {
                            new OSInAppMessageDummyController((OneSignalDbHelper) null);
                            this.controller = oSInAppMessageController2;
                        } else {
                            new OSInAppMessageController(dbHelper);
                            this.controller = oSInAppMessageController;
                        }
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }
        return this.controller;
    }
}

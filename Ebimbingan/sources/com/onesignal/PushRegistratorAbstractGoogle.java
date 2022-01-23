package com.onesignal;

import android.content.Context;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistrator;
import java.io.IOException;

abstract class PushRegistratorAbstractGoogle implements PushRegistrator {
    /* access modifiers changed from: private */
    public static int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    /* access modifiers changed from: private */
    public static int REGISTRATION_RETRY_COUNT = 5;
    private boolean firedCallback;
    private Thread registerThread;
    private PushRegistrator.RegisteredHandler registeredHandler;

    /* access modifiers changed from: package-private */
    public abstract String getProviderName();

    /* access modifiers changed from: package-private */
    public abstract String getToken(String str) throws Throwable;

    PushRegistratorAbstractGoogle() {
    }

    public void registerForPush(Context context, String str, PushRegistrator.RegisteredHandler registeredHandler2) {
        Context context2 = context;
        String senderId = str;
        PushRegistrator.RegisteredHandler callback = registeredHandler2;
        this.registeredHandler = callback;
        if (isValidProjectNumber(senderId, callback)) {
            internalRegisterForPush(senderId);
        }
    }

    private void internalRegisterForPush(String str) {
        StringBuilder sb;
        String senderId = str;
        try {
            if (OSUtils.isGMSInstalledAndEnabled()) {
                registerInBackground(senderId);
                return;
            }
            GooglePlayServicesUpgradePrompt.showUpdateGPSDialog();
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "'Google Play services' app not installed or disabled on the device.");
            this.registeredHandler.complete((String) null, -7);
        } catch (Throwable th) {
            Throwable t = th;
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
            new StringBuilder();
            OneSignal.Log(log_level, sb.append("Could not register with ").append(getProviderName()).append(" due to an issue with your AndroidManifest.xml or with 'Google Play services'.").toString(), t);
            this.registeredHandler.complete((String) null, -8);
        }
    }

    private synchronized void registerInBackground(String str) {
        Thread thread;
        Runnable runnable;
        String senderId = str;
        synchronized (this) {
            if (this.registerThread == null || !this.registerThread.isAlive()) {
                final String str2 = senderId;
                new Runnable(this) {
                    final /* synthetic */ PushRegistratorAbstractGoogle this$0;

                    {
                        this.this$0 = this$0;
                    }

                    public void run() {
                        int currentRetry = 0;
                        while (currentRetry < PushRegistratorAbstractGoogle.REGISTRATION_RETRY_COUNT && !this.this$0.attemptRegistration(str2, currentRetry)) {
                            OSUtils.sleep(PushRegistratorAbstractGoogle.REGISTRATION_RETRY_BACKOFF_MS * (currentRetry + 1));
                            currentRetry++;
                        }
                    }
                };
                new Thread(runnable);
                this.registerThread = thread;
                this.registerThread.start();
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean attemptRegistration(String senderId, int i) {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        int currentRetry = i;
        try {
            String registrationId = getToken(senderId);
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
            new StringBuilder();
            OneSignal.Log(log_level, sb5.append("Device registered, push token = ").append(registrationId).toString());
            this.registeredHandler.complete(registrationId, 1);
            return true;
        } catch (IOException e) {
            IOException e2 = e;
            if (!"SERVICE_NOT_AVAILABLE".equals(e2.getMessage())) {
                OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.ERROR;
                new StringBuilder();
                OneSignal.Log(log_level2, sb4.append("Error Getting ").append(getProviderName()).append(" Token").toString(), e2);
                if (!this.firedCallback) {
                    this.registeredHandler.complete((String) null, -11);
                }
                return true;
            }
            if (currentRetry >= REGISTRATION_RETRY_COUNT - 1) {
                OneSignal.LOG_LEVEL log_level3 = OneSignal.LOG_LEVEL.ERROR;
                new StringBuilder();
                OneSignal.Log(log_level3, sb3.append("Retry count of ").append(REGISTRATION_RETRY_COUNT).append(" exceed! Could not get a ").append(getProviderName()).append(" Token.").toString(), e2);
            } else {
                OneSignal.LOG_LEVEL log_level4 = OneSignal.LOG_LEVEL.INFO;
                new StringBuilder();
                OneSignal.Log(log_level4, sb2.append("'Google Play services' returned SERVICE_NOT_AVAILABLE error. Current retry count: ").append(currentRetry).toString(), e2);
                if (currentRetry == 2) {
                    this.registeredHandler.complete((String) null, -9);
                    this.firedCallback = true;
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Throwable t = th;
            OneSignal.LOG_LEVEL log_level5 = OneSignal.LOG_LEVEL.ERROR;
            new StringBuilder();
            OneSignal.Log(log_level5, sb.append("Unknown error getting ").append(getProviderName()).append(" Token").toString(), t);
            this.registeredHandler.complete((String) null, -12);
            return true;
        }
    }

    private boolean isValidProjectNumber(String senderId, PushRegistrator.RegisteredHandler registeredHandler2) {
        boolean isProjectNumberValidFormat;
        PushRegistrator.RegisteredHandler callback = registeredHandler2;
        try {
            float parseFloat = Float.parseFloat(senderId);
            isProjectNumberValidFormat = true;
        } catch (Throwable th) {
            Throwable th2 = th;
            isProjectNumberValidFormat = false;
        }
        if (isProjectNumberValidFormat) {
            return true;
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.");
        callback.complete((String) null, -6);
        return false;
    }
}

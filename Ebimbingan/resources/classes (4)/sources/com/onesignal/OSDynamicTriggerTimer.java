package com.onesignal;

import com.onesignal.OneSignal;
import java.util.Timer;
import java.util.TimerTask;

class OSDynamicTriggerTimer {
    OSDynamicTriggerTimer() {
    }

    static void scheduleTrigger(TimerTask task, String str, long j) {
        StringBuilder sb;
        Timer timer;
        StringBuilder sb2;
        String triggerId = str;
        long delay = j;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.onesignalLog(log_level, sb.append("scheduleTrigger: ").append(triggerId).append(" delay: ").append(delay).toString());
        new StringBuilder();
        new Timer(sb2.append("trigger_timer:").append(triggerId).toString());
        timer.schedule(task, delay);
    }
}

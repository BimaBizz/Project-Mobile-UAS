package com.google.android.gms.gcm;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import com.google.android.gms.iid.zze;
import com.google.android.gms.internal.gcm.zzl;
import com.google.android.gms.internal.gcm.zzm;
import java.util.Iterator;

@Deprecated
public class GcmListenerService extends zze {
    private zzl zzg = zzm.zzdk;

    public GcmListenerService() {
    }

    public void onMessageReceived(String str, Bundle bundle) {
    }

    public void onDeletedMessages() {
    }

    public void onMessageSent(String str) {
    }

    public void onSendError(String str, String str2) {
    }

    @CallSuper
    public void onCreate() {
        super.onCreate();
        zzm zzab = zzm.zzab();
        Class<?> cls = getClass();
        this.zzg = zzm.zzdk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02a7, code lost:
        r20 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02ac, code lost:
        throw r20;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleIntent(android.content.Intent r27) {
        /*
            r26 = this;
            r2 = r26
            r3 = r27
            r20 = r3
            java.lang.String r20 = r20.getAction()
            r4 = r20
            java.lang.String r20 = "com.google.android.c2dm.intent.RECEIVE"
            r21 = r4
            boolean r20 = r20.equals(r21)
            if (r20 != 0) goto L_0x0054
            java.lang.String r20 = "GcmListenerService"
            java.lang.String r21 = "Unknown intent action: "
            r22 = r3
            java.lang.String r22 = r22.getAction()
            java.lang.String r22 = java.lang.String.valueOf(r22)
            r24 = r22
            r22 = r24
            r23 = r24
            int r23 = r23.length()
            if (r23 == 0) goto L_0x003c
            java.lang.String r21 = r21.concat(r22)
        L_0x0037:
            int r20 = android.util.Log.w(r20, r21)
        L_0x003b:
            return
        L_0x003c:
            java.lang.String r22 = new java.lang.String
            r24 = r21
            r25 = r22
            r21 = r25
            r22 = r24
            r23 = r25
            r24 = r22
            r25 = r23
            r22 = r25
            r23 = r24
            r22.<init>(r23)
            goto L_0x0037
        L_0x0054:
            r20 = r3
            java.lang.String r21 = "message_type"
            java.lang.String r20 = r20.getStringExtra(r21)
            r24 = r20
            r20 = r24
            r21 = r24
            r5 = r21
            if (r20 != 0) goto L_0x006c
            java.lang.String r20 = "gcm"
            r5 = r20
        L_0x006c:
            r20 = r5
            r6 = r20
            r20 = -1
            r7 = r20
            r20 = r6
            int r20 = r20.hashCode()
            switch(r20) {
                case -2062414158: goto L_0x00b3;
                case 102161: goto L_0x00a3;
                case 814694033: goto L_0x00d3;
                case 814800675: goto L_0x00c3;
                default: goto L_0x007d;
            }
        L_0x007d:
            r20 = r7
            switch(r20) {
                case 0: goto L_0x00e3;
                case 1: goto L_0x02ad;
                case 2: goto L_0x02b4;
                case 3: goto L_0x02c4;
                default: goto L_0x0082;
            }
        L_0x0082:
            java.lang.String r20 = "GcmListenerService"
            java.lang.String r21 = "Received message with unknown type: "
            r22 = r5
            java.lang.String r22 = java.lang.String.valueOf(r22)
            r24 = r22
            r22 = r24
            r23 = r24
            int r23 = r23.length()
            if (r23 == 0) goto L_0x02fc
            java.lang.String r21 = r21.concat(r22)
        L_0x009e:
            int r20 = android.util.Log.w(r20, r21)
            goto L_0x003b
        L_0x00a3:
            r20 = r6
            java.lang.String r21 = "gcm"
            boolean r20 = r20.equals(r21)
            if (r20 == 0) goto L_0x007d
            r20 = 0
            r7 = r20
            goto L_0x007d
        L_0x00b3:
            r20 = r6
            java.lang.String r21 = "deleted_messages"
            boolean r20 = r20.equals(r21)
            if (r20 == 0) goto L_0x007d
            r20 = 1
            r7 = r20
            goto L_0x007d
        L_0x00c3:
            r20 = r6
            java.lang.String r21 = "send_event"
            boolean r20 = r20.equals(r21)
            if (r20 == 0) goto L_0x007d
            r20 = 2
            r7 = r20
            goto L_0x007d
        L_0x00d3:
            r20 = r6
            java.lang.String r21 = "send_error"
            boolean r20 = r20.equals(r21)
            if (r20 == 0) goto L_0x007d
            r20 = 3
            r7 = r20
            goto L_0x007d
        L_0x00e3:
            r20 = r2
            r21 = r3
            r9 = r21
            r8 = r20
            r20 = r9
            android.os.Bundle r20 = r20.getExtras()
            r24 = r20
            r20 = r24
            r21 = r24
            r10 = r21
            java.lang.String r21 = "message_type"
            r20.remove(r21)
            r20 = r10
            java.lang.String r21 = "androidx.contentpager.content.wakelockid"
            r20.remove(r21)
            r20 = r10
            r13 = r20
            java.lang.String r20 = "1"
            r21 = r13
            java.lang.String r22 = "gcm.n.e"
            java.lang.String r21 = com.google.android.gms.gcm.zzd.zzd(r21, r22)
            boolean r20 = r20.equals(r21)
            if (r20 != 0) goto L_0x0128
            r20 = r13
            java.lang.String r21 = "gcm.n.icon"
            java.lang.String r20 = com.google.android.gms.gcm.zzd.zzd(r20, r21)
            if (r20 == 0) goto L_0x01b4
        L_0x0128:
            r20 = 1
        L_0x012a:
            if (r20 == 0) goto L_0x0273
            r20 = r8
            r24 = r20
            r20 = r24
            r21 = r24
            r13 = r21
            java.lang.String r21 = "keyguard"
            java.lang.Object r20 = r20.getSystemService(r21)
            android.app.KeyguardManager r20 = (android.app.KeyguardManager) r20
            boolean r20 = r20.inKeyguardRestrictedInputMode()
            if (r20 != 0) goto L_0x01bc
            int r20 = android.os.Process.myPid()
            r15 = r20
            r20 = r13
            java.lang.String r21 = "activity"
            java.lang.Object r20 = r20.getSystemService(r21)
            android.app.ActivityManager r20 = (android.app.ActivityManager) r20
            java.util.List r20 = r20.getRunningAppProcesses()
            r24 = r20
            r20 = r24
            r21 = r24
            r17 = r21
            if (r20 == 0) goto L_0x01bc
            r20 = r17
            java.util.Iterator r20 = r20.iterator()
            r18 = r20
        L_0x016c:
            r20 = r18
            boolean r20 = r20.hasNext()
            if (r20 == 0) goto L_0x01bc
            r20 = r18
            java.lang.Object r20 = r20.next()
            android.app.ActivityManager$RunningAppProcessInfo r20 = (android.app.ActivityManager.RunningAppProcessInfo) r20
            r24 = r20
            r20 = r24
            r21 = r24
            r19 = r21
            r0 = r20
            int r0 = r0.pid
            r20 = r0
            r21 = r15
            r0 = r20
            r1 = r21
            if (r0 != r1) goto L_0x01bb
            r20 = r19
            r0 = r20
            int r0 = r0.importance
            r20 = r0
            r21 = 100
            r0 = r20
            r1 = r21
            if (r0 != r1) goto L_0x01b8
            r20 = 1
        L_0x01a4:
            if (r20 != 0) goto L_0x01bf
            r20 = r8
            com.google.android.gms.gcm.zzd r20 = com.google.android.gms.gcm.zzd.zzd(r20)
            r21 = r10
            boolean r20 = r20.zze(r21)
            goto L_0x003b
        L_0x01b4:
            r20 = 0
            goto L_0x012a
        L_0x01b8:
            r20 = 0
            goto L_0x01a4
        L_0x01bb:
            goto L_0x016c
        L_0x01bc:
            r20 = 0
            goto L_0x01a4
        L_0x01bf:
            r20 = r10
            r13 = r20
            android.os.Bundle r20 = new android.os.Bundle
            r24 = r20
            r20 = r24
            r21 = r24
            r21.<init>()
            r14 = r20
            r20 = r13
            java.util.Set r20 = r20.keySet()
            java.util.Iterator r20 = r20.iterator()
            r15 = r20
        L_0x01dc:
            r20 = r15
            boolean r20 = r20.hasNext()
            if (r20 == 0) goto L_0x023c
            r20 = r15
            java.lang.Object r20 = r20.next()
            java.lang.String r20 = (java.lang.String) r20
            r16 = r20
            r20 = r13
            r21 = r16
            java.lang.String r20 = r20.getString(r21)
            r17 = r20
            r20 = r16
            java.lang.String r21 = "gcm.notification."
            boolean r20 = r20.startsWith(r21)
            if (r20 == 0) goto L_0x0211
            r20 = r16
            java.lang.String r21 = "gcm.notification."
            java.lang.String r22 = "gcm.n."
            java.lang.String r20 = r20.replace(r21, r22)
            r16 = r20
        L_0x0211:
            r20 = r16
            java.lang.String r21 = "gcm.n."
            boolean r20 = r20.startsWith(r21)
            if (r20 == 0) goto L_0x023b
            java.lang.String r20 = "gcm.n.e"
            r21 = r16
            boolean r20 = r20.equals(r21)
            if (r20 != 0) goto L_0x0236
            r20 = r14
            r21 = r16
            r22 = 6
            java.lang.String r21 = r21.substring(r22)
            r22 = r17
            r20.putString(r21, r22)
        L_0x0236:
            r20 = r15
            r20.remove()
        L_0x023b:
            goto L_0x01dc
        L_0x023c:
            r20 = r14
            java.lang.String r21 = "sound2"
            java.lang.String r20 = r20.getString(r21)
            r24 = r20
            r20 = r24
            r21 = r24
            r16 = r21
            if (r20 == 0) goto L_0x0261
            r20 = r14
            java.lang.String r21 = "sound2"
            r20.remove(r21)
            r20 = r14
            java.lang.String r21 = "sound"
            r22 = r16
            r20.putString(r21, r22)
        L_0x0261:
            r20 = r14
            boolean r20 = r20.isEmpty()
            if (r20 != 0) goto L_0x0273
            r20 = r13
            java.lang.String r21 = "notification"
            r22 = r14
            r20.putBundle(r21, r22)
        L_0x0273:
            r20 = r10
            java.lang.String r21 = "from"
            java.lang.String r20 = r20.getString(r21)
            r11 = r20
            r20 = r10
            java.lang.String r21 = "from"
            r20.remove(r21)
            r20 = r10
            zzd(r20)
            r20 = r8
            r0 = r20
            com.google.android.gms.internal.gcm.zzl r0 = r0.zzg
            r20 = r0
            java.lang.String r21 = "onMessageReceived"
            com.google.android.gms.internal.gcm.zzo r20 = r20.zzl(r21)
            r20 = r8
            r21 = r11
            r22 = r10
            r20.onMessageReceived(r21, r22)     // Catch:{ Throwable -> 0x02a5 }
            goto L_0x003b
        L_0x02a5:
            r20 = move-exception
            throw r20     // Catch:{ all -> 0x02a7 }
        L_0x02a7:
            r20 = move-exception
            r12 = r20
            r20 = r12
            throw r20
        L_0x02ad:
            r20 = r2
            r20.onDeletedMessages()
            goto L_0x003b
        L_0x02b4:
            r20 = r2
            r21 = r3
            java.lang.String r22 = "google.message_id"
            java.lang.String r21 = r21.getStringExtra(r22)
            r20.onMessageSent(r21)
            goto L_0x003b
        L_0x02c4:
            r20 = r2
            r21 = r3
            r24 = r21
            r21 = r24
            r22 = r24
            r8 = r22
            java.lang.String r22 = "google.message_id"
            java.lang.String r21 = r21.getStringExtra(r22)
            r24 = r21
            r21 = r24
            r22 = r24
            r9 = r22
            if (r21 != 0) goto L_0x02ec
            r21 = r8
            java.lang.String r22 = "message_id"
            java.lang.String r21 = r21.getStringExtra(r22)
            r9 = r21
        L_0x02ec:
            r21 = r9
            r22 = r3
            java.lang.String r23 = "error"
            java.lang.String r22 = r22.getStringExtra(r23)
            r20.onSendError(r21, r22)
            goto L_0x003b
        L_0x02fc:
            java.lang.String r22 = new java.lang.String
            r24 = r21
            r25 = r22
            r21 = r25
            r22 = r24
            r23 = r25
            r24 = r22
            r25 = r23
            r22 = r25
            r23 = r24
            r22.<init>(r23)
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmListenerService.handleIntent(android.content.Intent):void");
    }

    static void zzd(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String str2 = str;
            if (str != null && str2.startsWith("google.c.")) {
                it.remove();
            }
        }
    }
}

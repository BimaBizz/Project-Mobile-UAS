package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.zaah */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0278zaah implements Runnable {
    final /* synthetic */ C0288zaar zaa;

    C0278zaah(C0288zaar zaar) {
        this.zaa = zaar;
    }

    public final void run() {
        this.zaa.zad.cancelAvailabilityErrorNotifications(this.zaa.zac);
    }
}

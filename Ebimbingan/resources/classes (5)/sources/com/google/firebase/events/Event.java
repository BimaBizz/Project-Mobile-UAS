package com.google.firebase.events;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class Event<T> {
    private final T payload;
    private final Class<T> type;

    @KeepForSdk
    public Event(Class<T> type2, T payload2) {
        this.type = (Class) Preconditions.checkNotNull(type2);
        this.payload = Preconditions.checkNotNull(payload2);
    }

    @KeepForSdk
    public Class<T> getType() {
        return this.type;
    }

    @KeepForSdk
    public T getPayload() {
        return this.payload;
    }

    public String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.type;
        Object[] objArr2 = objArr;
        objArr2[1] = this.payload;
        return String.format("Event{type: %s, payload: %s}", objArr2);
    }
}

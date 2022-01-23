package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaz implements OnCompleteListener {
    final /* synthetic */ TaskCompletionSource zaa;
    final /* synthetic */ zaaa zab;

    zaz(zaaa zaaa, TaskCompletionSource taskCompletionSource) {
        this.zab = zaaa;
        this.zaa = taskCompletionSource;
    }

    public final void onComplete(@NonNull Task task) {
        Task task2 = task;
        Object remove = this.zab.zab.remove(this.zaa);
    }
}

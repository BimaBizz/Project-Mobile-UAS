package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.gcm.Task;

public class OneoffTask extends Task {
    public static final Parcelable.Creator<OneoffTask> CREATOR;
    private final long zzal;
    private final long zzam;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private OneoffTask(com.google.android.gms.gcm.OneoffTask.Builder r7) {
        /*
            r6 = this;
            r1 = r6
            r2 = r7
            r3 = r1
            r4 = r2
            r3.<init>((com.google.android.gms.gcm.Task.Builder) r4)
            r3 = r1
            r4 = r2
            long r4 = r4.zzal
            r3.zzal = r4
            r3 = r1
            r4 = r2
            long r4 = r4.zzam
            r3.zzam = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.OneoffTask.<init>(com.google.android.gms.gcm.OneoffTask$Builder):void");
    }

    public static class Builder extends Task.Builder {
        /* access modifiers changed from: private */
        public long zzal = -1;
        /* access modifiers changed from: private */
        public long zzam = -1;

        public Builder() {
            this.isPersisted = false;
        }

        public Builder setExecutionWindow(long j, long j2) {
            this.zzal = j;
            this.zzam = j2;
            return this;
        }

        public Builder setService(Class<? extends GcmTaskService> cls) {
            this.gcmTaskService = cls.getName();
            return this;
        }

        public Builder setRequiredNetwork(int i) {
            this.requiredNetworkState = i;
            return this;
        }

        public Builder setRequiresCharging(boolean z) {
            this.requiresCharging = z;
            return this;
        }

        public Builder setTag(String str) {
            this.tag = str;
            return this;
        }

        @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
        public Builder setPersisted(boolean z) {
            this.isPersisted = z;
            return this;
        }

        public Builder setUpdateCurrent(boolean z) {
            this.updateCurrent = z;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        /* access modifiers changed from: protected */
        public void checkConditions() {
            Throwable th;
            Throwable th2;
            super.checkConditions();
            if (this.zzal == -1 || this.zzam == -1) {
                Throwable th3 = th;
                new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
                throw th3;
            } else if (this.zzal >= this.zzam) {
                Throwable th4 = th2;
                new IllegalArgumentException("Window start must be shorter than window end.");
                throw th4;
            }
        }

        public OneoffTask build() {
            OneoffTask oneoffTask;
            checkConditions();
            new OneoffTask(this, (zzi) null);
            return oneoffTask;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private OneoffTask(android.os.Parcel r7) {
        /*
            r6 = this;
            r1 = r6
            r2 = r7
            r3 = r1
            r4 = r2
            r3.<init>((android.os.Parcel) r4)
            r3 = r1
            r4 = r2
            long r4 = r4.readLong()
            r3.zzal = r4
            r3 = r1
            r4 = r2
            long r4 = r4.readLong()
            r3.zzam = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.OneoffTask.<init>(android.os.Parcel):void");
    }

    public void toBundle(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.toBundle(bundle2);
        bundle2.putLong("window_start", this.zzal);
        bundle2.putLong("window_end", this.zzam);
    }

    public long getWindowStart() {
        return this.zzal;
    }

    public long getWindowEnd() {
        return this.zzam;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        super.writeToParcel(parcel2, i);
        parcel2.writeLong(this.zzal);
        parcel2.writeLong(this.zzam);
    }

    public String toString() {
        StringBuilder sb;
        String obj = super.toString();
        long windowStart = getWindowStart();
        long windowEnd = getWindowEnd();
        new StringBuilder(64 + String.valueOf(obj).length());
        return sb.append(obj).append(" windowStart=").append(windowStart).append(" windowEnd=").append(windowEnd).toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ OneoffTask(Parcel parcel, zzi zzi) {
        this(parcel);
        zzi zzi2 = zzi;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ OneoffTask(Builder builder, zzi zzi) {
        this(builder);
        zzi zzi2 = zzi;
    }

    static {
        Parcelable.Creator<OneoffTask> creator;
        new zzi();
        CREATOR = creator;
    }
}

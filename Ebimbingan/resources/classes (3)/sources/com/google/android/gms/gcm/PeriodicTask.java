package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.gcm.Task;

public class PeriodicTask extends Task {
    public static final Parcelable.Creator<PeriodicTask> CREATOR;
    protected long mFlexInSeconds;
    protected long mIntervalInSeconds;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private PeriodicTask(com.google.android.gms.gcm.PeriodicTask.Builder r9) {
        /*
            r8 = this;
            r1 = r8
            r2 = r9
            r3 = r1
            r4 = r2
            r3.<init>((com.google.android.gms.gcm.Task.Builder) r4)
            r3 = r1
            r4 = -1
            r3.mIntervalInSeconds = r4
            r3 = r1
            r4 = -1
            r3.mFlexInSeconds = r4
            r3 = r1
            r4 = r2
            long r4 = r4.zzao
            r3.mIntervalInSeconds = r4
            r3 = r1
            r4 = r2
            long r4 = r4.zzap
            r6 = r1
            long r6 = r6.mIntervalInSeconds
            long r4 = java.lang.Math.min(r4, r6)
            r3.mFlexInSeconds = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.PeriodicTask.<init>(com.google.android.gms.gcm.PeriodicTask$Builder):void");
    }

    public static class Builder extends Task.Builder {
        /* access modifiers changed from: private */
        public long zzao = -1;
        /* access modifiers changed from: private */
        public long zzap = -1;

        public Builder() {
            this.isPersisted = true;
        }

        public Builder setPeriod(long j) {
            this.zzao = j;
            return this;
        }

        public Builder setFlex(long j) {
            this.zzap = j;
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

        public PeriodicTask build() {
            PeriodicTask periodicTask;
            checkConditions();
            new PeriodicTask(this, (zzk) null);
            return periodicTask;
        }

        /* access modifiers changed from: protected */
        public void checkConditions() {
            Throwable th;
            StringBuilder sb;
            Throwable th2;
            super.checkConditions();
            if (this.zzao == -1) {
                Throwable th3 = th2;
                new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
                throw th3;
            } else if (this.zzao <= 0) {
                Throwable th4 = th;
                long j = this.zzao;
                new StringBuilder(66);
                new IllegalArgumentException(sb.append("Period set cannot be less than or equal to 0: ").append(j).toString());
                throw th4;
            } else if (this.zzap == -1) {
                this.zzap = (long) (((float) this.zzao) * 0.1f);
            } else if (this.zzap > this.zzao) {
                this.zzap = this.zzao;
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private PeriodicTask(android.os.Parcel r9) {
        /*
            r8 = this;
            r1 = r8
            r2 = r9
            r3 = r1
            r4 = r2
            r3.<init>((android.os.Parcel) r4)
            r3 = r1
            r4 = -1
            r3.mIntervalInSeconds = r4
            r3 = r1
            r4 = -1
            r3.mFlexInSeconds = r4
            r3 = r1
            r4 = r2
            long r4 = r4.readLong()
            r3.mIntervalInSeconds = r4
            r3 = r1
            r4 = r2
            long r4 = r4.readLong()
            r6 = r1
            long r6 = r6.mIntervalInSeconds
            long r4 = java.lang.Math.min(r4, r6)
            r3.mFlexInSeconds = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.PeriodicTask.<init>(android.os.Parcel):void");
    }

    public void toBundle(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.toBundle(bundle2);
        bundle2.putLong("period", this.mIntervalInSeconds);
        bundle2.putLong("period_flex", this.mFlexInSeconds);
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        super.writeToParcel(parcel2, i);
        parcel2.writeLong(this.mIntervalInSeconds);
        parcel2.writeLong(this.mFlexInSeconds);
    }

    public long getPeriod() {
        return this.mIntervalInSeconds;
    }

    public long getFlex() {
        return this.mFlexInSeconds;
    }

    public String toString() {
        StringBuilder sb;
        String obj = super.toString();
        long period = getPeriod();
        long flex = getFlex();
        new StringBuilder(54 + String.valueOf(obj).length());
        return sb.append(obj).append(" period=").append(period).append(" flex=").append(flex).toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ PeriodicTask(Parcel parcel, zzk zzk) {
        this(parcel);
        zzk zzk2 = zzk;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ PeriodicTask(Builder builder, zzk zzk) {
        this(builder);
        zzk zzk2 = zzk;
    }

    static {
        Parcelable.Creator<PeriodicTask> creator;
        new zzk();
        CREATOR = creator;
    }
}

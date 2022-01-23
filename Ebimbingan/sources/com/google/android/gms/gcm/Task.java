package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresPermission;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.jose4j.jwx.HeaderParameterNames;

public class Task implements C0447ReflectedParcelable {
    public static final int EXTRAS_LIMIT_BYTES = 10240;
    public static final int NETWORK_STATE_ANY = 2;
    public static final int NETWORK_STATE_CONNECTED = 0;
    public static final int NETWORK_STATE_UNMETERED = 1;
    protected static final long UNINITIALIZED = -1;
    private final Bundle extras;
    private final String gcmTaskService;
    private final boolean isPersisted;
    private final int requiredNetworkState;
    private final boolean requiresCharging;
    private final String tag;
    private final boolean updateCurrent;
    private final Set<Uri> zzaw;
    private final boolean zzax;
    private final zzl zzay;

    Task(Builder builder) {
        Builder builder2 = builder;
        this.gcmTaskService = builder2.gcmTaskService;
        this.tag = builder2.tag;
        this.updateCurrent = builder2.updateCurrent;
        this.isPersisted = builder2.isPersisted;
        this.requiredNetworkState = builder2.requiredNetworkState;
        this.zzaw = builder2.zzaw;
        this.requiresCharging = builder2.requiresCharging;
        this.zzax = false;
        this.extras = builder2.extras;
        this.zzay = builder2.zzay != null ? builder2.zzay : zzl.zzaq;
    }

    public static abstract class Builder {
        protected Bundle extras;
        protected String gcmTaskService;
        protected boolean isPersisted;
        protected int requiredNetworkState;
        protected boolean requiresCharging;
        protected String tag;
        protected boolean updateCurrent;
        protected Set<Uri> zzaw = Collections.emptySet();
        @C0452ShowFirstParty
        protected zzl zzay = zzl.zzaq;

        public Builder() {
        }

        public abstract Task build();

        public abstract Builder setExtras(Bundle bundle);

        @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
        public abstract Builder setPersisted(boolean z);

        public abstract Builder setRequiredNetwork(int i);

        public abstract Builder setRequiresCharging(boolean z);

        public abstract Builder setService(Class<? extends GcmTaskService> cls);

        public abstract Builder setTag(String str);

        public abstract Builder setUpdateCurrent(boolean z);

        /* access modifiers changed from: protected */
        @CallSuper
        public void checkConditions() {
            Throwable th;
            Throwable th2;
            StringBuilder sb;
            Throwable th3;
            Throwable th4;
            StringBuilder sb2;
            Throwable th5;
            StringBuilder sb3;
            C0446Preconditions.checkArgument(this.gcmTaskService != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
            GcmNetworkManager.zzd(this.tag);
            zzl zzl = this.zzay;
            zzl zzl2 = zzl;
            if (zzl != null) {
                int zzi = zzl2.zzi();
                int i = zzi;
                if (zzi == 1 || i == 0) {
                    int zzj = zzl2.zzj();
                    int zzk = zzl2.zzk();
                    if (i == 0 && zzj < 0) {
                        Throwable th6 = th4;
                        new StringBuilder(52);
                        new IllegalArgumentException(sb2.append("InitialBackoffSeconds can't be negative: ").append(zzj).toString());
                        throw th6;
                    } else if (i == 1 && zzj < 10) {
                        Throwable th7 = th3;
                        new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                        throw th7;
                    } else if (zzk < zzj) {
                        Throwable th8 = th2;
                        int zzk2 = zzl2.zzk();
                        new StringBuilder(77);
                        new IllegalArgumentException(sb.append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ").append(zzk2).toString());
                        throw th8;
                    }
                } else {
                    Throwable th9 = th5;
                    new StringBuilder(45);
                    new IllegalArgumentException(sb3.append("Must provide a valid RetryPolicy: ").append(i).toString());
                    throw th9;
                }
            }
            if (this.isPersisted) {
                Task.zzg(this.extras);
            }
            if (this.zzaw.isEmpty() || this.requiredNetworkState != 2) {
                for (Uri zze : this.zzaw) {
                    Task.zzd(zze);
                }
                return;
            }
            Throwable th10 = th;
            new IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
            throw th10;
        }
    }

    @Deprecated
    Task(Parcel parcel) {
        Parcel parcel2 = parcel;
        int e = Log.e("Task", "Constructing a Task object using a parcel.");
        this.gcmTaskService = parcel2.readString();
        this.tag = parcel2.readString();
        this.updateCurrent = parcel2.readInt() == 1;
        this.isPersisted = parcel2.readInt() == 1;
        this.requiredNetworkState = 2;
        this.zzaw = Collections.emptySet();
        this.requiresCharging = false;
        this.zzax = false;
        this.zzay = zzl.zzaq;
        this.extras = null;
    }

    public void toBundle(Bundle bundle) {
        Bundle bundle2;
        ArrayList arrayList;
        Bundle bundle3 = bundle;
        bundle3.putString(HeaderParameterNames.AUTHENTICATION_TAG, this.tag);
        bundle3.putBoolean("update_current", this.updateCurrent);
        bundle3.putBoolean("persisted", this.isPersisted);
        bundle3.putString(NotificationCompat.CATEGORY_SERVICE, this.gcmTaskService);
        bundle3.putInt("requiredNetwork", this.requiredNetworkState);
        if (!this.zzaw.isEmpty()) {
            new ArrayList();
            ArrayList arrayList2 = arrayList;
            for (Uri uri : this.zzaw) {
                boolean add = arrayList2.add(uri.toString());
            }
            bundle3.putStringArrayList("reachabilityUris", arrayList2);
        }
        bundle3.putBoolean("requiresCharging", this.requiresCharging);
        bundle3.putBoolean("requiresIdle", false);
        new Bundle();
        bundle3.putBundle("retryStrategy", this.zzay.zzf(bundle2));
        bundle3.putBundle("extras", this.extras);
    }

    public String getServiceName() {
        return this.gcmTaskService;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean isUpdateCurrent() {
        return this.updateCurrent;
    }

    public boolean isPersisted() {
        return this.isPersisted;
    }

    public int getRequiredNetwork() {
        return this.requiredNetworkState;
    }

    public boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    public Bundle getExtras() {
        return this.extras;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        parcel2.writeString(this.gcmTaskService);
        parcel2.writeString(this.tag);
        parcel2.writeInt(this.updateCurrent ? 1 : 0);
        parcel2.writeInt(this.isPersisted ? 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    public static void zzg(Bundle bundle) {
        Throwable th;
        Throwable th2;
        StringBuilder sb;
        Bundle bundle2 = bundle;
        if (bundle2 != null) {
            Parcel obtain = Parcel.obtain();
            bundle2.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            int i = dataSize;
            int i2 = i;
            if (i > 10240) {
                Throwable th3 = th2;
                new StringBuilder(55);
                new IllegalArgumentException(sb.append("Extras exceeding maximum size(10240 bytes): ").append(i2).toString());
                throw th3;
            }
            for (String str : bundle2.keySet()) {
                Object obj = bundle2.get(str);
                Object obj2 = obj;
                Object obj3 = obj;
                Object obj4 = obj3;
                if (!((obj3 instanceof Integer) || (obj4 instanceof Long) || (obj4 instanceof Double) || (obj4 instanceof String) || (obj4 instanceof Boolean))) {
                    if (obj2 instanceof Bundle) {
                        zzg((Bundle) obj2);
                    } else {
                        Throwable th4 = th;
                        new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                        throw th4;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static void zzd(Uri uri) {
        Throwable th;
        String str;
        String str2;
        String str3;
        String str4;
        Throwable th2;
        Throwable th3;
        StringBuilder sb;
        Throwable th4;
        Uri uri2 = uri;
        if (uri2 == null) {
            Throwable th5 = th4;
            new IllegalArgumentException("Null URI");
            throw th5;
        }
        String scheme = uri2.getScheme();
        String host = uri2.getHost();
        String str5 = host;
        if (TextUtils.isEmpty(host) || "null".equals(str5)) {
            Throwable th6 = th;
            new IllegalArgumentException("URI hostname is required");
            throw th6;
        }
        try {
            int port = uri2.getPort();
            if ("tcp".equals(scheme)) {
                if (port <= 0 || port > 65535) {
                    Throwable th7 = th3;
                    int port2 = uri2.getPort();
                    new StringBuilder(38);
                    new IllegalArgumentException(sb.append("Invalid required URI port: ").append(port2).toString());
                    throw th7;
                }
            } else if (!"ping".equals(scheme)) {
                IllegalArgumentException illegalArgumentException = r10;
                String valueOf = String.valueOf(scheme);
                String str6 = valueOf;
                if (valueOf.length() != 0) {
                    str4 = "Unsupported required URI scheme: ".concat(str6);
                } else {
                    str4 = str3;
                    new String("Unsupported required URI scheme: ");
                }
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(str4);
                throw illegalArgumentException;
            } else if (port != -1) {
                Throwable th8 = th2;
                new IllegalArgumentException("Ping does not support port numbers");
                throw th8;
            }
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = e;
            IllegalArgumentException illegalArgumentException3 = r10;
            String valueOf2 = String.valueOf(numberFormatException.getMessage());
            String str7 = valueOf2;
            if (valueOf2.length() != 0) {
                str2 = "Invalid port number: ".concat(str7);
            } else {
                str2 = str;
                new String("Invalid port number: ");
            }
            IllegalArgumentException illegalArgumentException4 = new IllegalArgumentException(str2);
            throw illegalArgumentException3;
        }
    }
}

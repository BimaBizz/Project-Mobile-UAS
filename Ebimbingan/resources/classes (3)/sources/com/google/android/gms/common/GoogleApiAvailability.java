package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    @NonNull
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final Object zaa;
    private static final GoogleApiAvailability zab;
    @GuardedBy("mLock")
    private String zac;

    static {
        Object obj;
        GoogleApiAvailability googleApiAvailability;
        new Object();
        zaa = obj;
        new GoogleApiAvailability();
        zab = googleApiAvailability;
    }

    public GoogleApiAvailability() {
    }

    @NonNull
    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    @NonNull
    public static final Task<Map<ApiKey<?>, String>> zai(@RecentlyNonNull HasApiKey<?> hasApiKey, @RecentlyNonNull HasApiKey<?>... hasApiKeyArr) {
        List list;
        HasApiKey<?> hasApiKey2 = hasApiKey;
        HasApiKey<?>[] hasApiKeyArr2 = hasApiKeyArr;
        Object checkNotNull = Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        int length = hasApiKeyArr2.length;
        for (int i = 0; i < length; i++) {
            Object checkNotNull2 = Preconditions.checkNotNull(hasApiKeyArr2[i], "Requested API must not be null.");
        }
        new ArrayList(hasApiKeyArr2.length + 1);
        boolean add = list.add(hasApiKey2);
        boolean addAll = list.addAll(Arrays.asList(hasApiKeyArr2));
        return GoogleApiManager.zab().zah(list);
    }

    @NonNull
    public Task<Void> checkApiAvailability(@RecentlyNonNull GoogleApi<?> googleApi, @RecentlyNonNull GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(zab.zaa);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(@RecentlyNonNull Context context) {
        return super.getClientVersion(context);
    }

    @RecentlyNullable
    public Dialog getErrorDialog(@RecentlyNonNull Activity activity, int i, int i2) {
        return getErrorDialog(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    @ShowFirstParty
    @KeepForSdk
    @RecentlyNullable
    public Intent getErrorResolutionIntent(@Nullable Context context, int i, @Nullable String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @RecentlyNullable
    public PendingIntent getErrorResolutionPendingIntent(@RecentlyNonNull Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    @NonNull
    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    @HideFirstParty
    public int isGooglePlayServicesAvailable(@RecentlyNonNull Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    @MainThread
    @NonNull
    public Task<Void> makeGooglePlayServicesAvailable(@RecentlyNonNull Activity activity) {
        ConnectionResult connectionResult;
        Task<Void> zab2;
        Activity activity2 = activity;
        int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity2, i);
        if (isGooglePlayServicesAvailable == 0) {
            zab2 = Tasks.forResult(null);
        } else {
            zabw zaa2 = zabw.zaa(activity2);
            new ConnectionResult(isGooglePlayServicesAvailable, (PendingIntent) null);
            zaa2.zaf(connectionResult, 0);
            zab2 = zaa2.zab();
        }
        return zab2;
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PlatformVersion.isAtLeastO()) {
            Object checkNotNull = Preconditions.checkNotNull(((NotificationManager) Preconditions.checkNotNull(context2.getSystemService("notification"))).getNotificationChannel(str2));
        }
        Object obj = zaa;
        synchronized (obj) {
            try {
                this.zac = str2;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
    }

    public boolean showErrorDialogFragment(@RecentlyNonNull Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(@RecentlyNonNull Context context, int i) {
        Context context2 = context;
        int i2 = i;
        zab(context2, i2, (String) null, getErrorResolutionPendingIntent(context2, i2, 0, "n"));
    }

    public final boolean zaa(@RecentlyNonNull Activity activity, @RecentlyNonNull LifecycleFragment lifecycleFragment, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Activity activity2 = activity;
        int i3 = i;
        int i4 = i2;
        DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
        Dialog zaf = zaf(activity2, i3, zag.zad(lifecycleFragment, getErrorResolutionIntent(activity2, i3, "d"), 2), onCancelListener2);
        if (zaf == null) {
            return false;
        }
        zag(activity2, zaf, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener2);
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    @TargetApi(20)
    public final void zab(Context context, int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        Throwable th;
        NotificationCompat.Builder builder;
        NotificationCompat.BigTextStyle bigTextStyle;
        String str2;
        NotificationChannel notificationChannel;
        int i2;
        Context context2 = context;
        int i3 = i;
        String str3 = str;
        PendingIntent pendingIntent2 = pendingIntent;
        String format = String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i3), null});
        new IllegalArgumentException();
        int w = Log.w("GoogleApiAvailability", format, th);
        if (i3 == 18) {
            zah(context2);
        } else if (pendingIntent2 != null) {
            String zab2 = zac.zab(context2, i3);
            String zad = zac.zad(context2, i3);
            Resources resources = context2.getResources();
            NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context2.getSystemService("notification"));
            new NotificationCompat.Builder(context2);
            NotificationCompat.Builder contentTitle = builder.setLocalOnly(true).setAutoCancel(true).setContentTitle(zab2);
            new NotificationCompat.BigTextStyle();
            NotificationCompat.Builder style = contentTitle.setStyle(bigTextStyle.bigText(zad));
            if (DeviceProperties.isWearable(context2)) {
                Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
                NotificationCompat.Builder priority = style.setSmallIcon(context2.getApplicationInfo().icon).setPriority(2);
                if (DeviceProperties.isWearableWithoutPlayStore(context2)) {
                    NotificationCompat.Builder addAction = style.addAction(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent2);
                } else {
                    NotificationCompat.Builder contentIntent = style.setContentIntent(pendingIntent2);
                }
            } else {
                NotificationCompat.Builder contentText = style.setSmallIcon(17301642).setTicker(resources.getString(R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent2).setContentText(zad);
            }
            if (PlatformVersion.isAtLeastO()) {
                Preconditions.checkState(PlatformVersion.isAtLeastO());
                Object obj = zaa;
                synchronized (obj) {
                    try {
                        str2 = this.zac;
                    } catch (Throwable th2) {
                        while (true) {
                            Throwable th3 = th2;
                            Object obj2 = obj;
                            throw th3;
                        }
                    }
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(str2);
                    String zag = zac.zag(context2);
                    if (notificationChannel2 == null) {
                        new NotificationChannel(str2, zag, 4);
                        notificationManager.createNotificationChannel(notificationChannel);
                    } else if (!zag.contentEquals(notificationChannel2.getName())) {
                        notificationChannel2.setName(zag);
                        notificationManager.createNotificationChannel(notificationChannel2);
                    }
                }
                NotificationCompat.Builder channelId = style.setChannelId(str2);
            }
            Notification build = style.build();
            switch (i3) {
                case 1:
                case 2:
                case 3:
                    GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
                    i2 = 10436;
                    break;
                default:
                    i2 = 39789;
                    break;
            }
            notificationManager.notify(i2, build);
        } else if (i3 == 6) {
            int w2 = Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final boolean zac(@RecentlyNonNull Context context, @RecentlyNonNull ConnectionResult connectionResult, int i) {
        Context context2 = context;
        ConnectionResult connectionResult2 = connectionResult;
        int i2 = i;
        PendingIntent errorResolutionPendingIntent = getErrorResolutionPendingIntent(context2, connectionResult2);
        if (errorResolutionPendingIntent == null) {
            return false;
        }
        zab(context2, connectionResult2.getErrorCode(), (String) null, PendingIntent.getActivity(context2, 0, GoogleApiActivity.zaa(context2, errorResolutionPendingIntent, i2, true), 134217728));
        return true;
    }

    @RecentlyNonNull
    public final Dialog zad(@RecentlyNonNull Activity activity, @RecentlyNonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar;
        AlertDialog.Builder builder;
        Activity activity2 = activity;
        new ProgressBar(activity2, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        new AlertDialog.Builder(activity2);
        AlertDialog.Builder view = builder.setView(progressBar);
        AlertDialog.Builder message = builder.setMessage(zac.zac(activity2, 18));
        AlertDialog.Builder positiveButton = builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zag(activity2, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @Nullable
    public final zabr zae(Context context, zabq zabq) {
        IntentFilter intentFilter;
        zabr zabr;
        Context context2 = context;
        zabq zabq2 = zabq;
        new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        new zabr(zabq2);
        Intent registerReceiver = context2.registerReceiver(zabr, intentFilter);
        zabr.zaa(context2);
        if (isUninstalledAppPossiblyUpdating(context2, "com.google.android.gms")) {
            return zabr;
        }
        zabq2.zaa();
        zabr.zab();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void zag(Activity activity, Dialog dialog, String str, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Activity activity2 = activity;
        Dialog dialog2 = dialog;
        String str2 = str;
        DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
        try {
            if (activity2 instanceof FragmentActivity) {
                SupportErrorDialogFragment.newInstance(dialog2, onCancelListener2).show(((FragmentActivity) activity2).getSupportFragmentManager(), str2);
                return;
            }
        } catch (NoClassDefFoundError e) {
        }
        ErrorDialogFragment.newInstance(dialog2, onCancelListener2).show(activity2.getFragmentManager(), str2);
    }

    /* access modifiers changed from: package-private */
    public final void zah(Context context) {
        Handler handler;
        new zac(this, context);
        boolean sendEmptyMessageDelayed = handler.sendEmptyMessageDelayed(1, 120000);
    }

    @RecentlyNullable
    public Dialog getErrorDialog(@RecentlyNonNull Activity activity, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Activity activity2 = activity;
        int i3 = i;
        return zaf(activity2, i3, zag.zab(activity2, getErrorResolutionIntent(activity2, i3, "d"), i2), onCancelListener);
    }

    @RecentlyNullable
    public PendingIntent getErrorResolutionPendingIntent(@RecentlyNonNull Context context, @RecentlyNonNull ConnectionResult connectionResult) {
        Context context2 = context;
        ConnectionResult connectionResult2 = connectionResult;
        if (connectionResult2.hasResolution()) {
            return connectionResult2.getResolution();
        }
        return getErrorResolutionPendingIntent(context2, connectionResult2.getErrorCode(), 0);
    }

    @ShowFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(@RecentlyNonNull Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public boolean showErrorDialogFragment(@RecentlyNonNull Activity activity, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Activity activity2 = activity;
        DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
        Dialog errorDialog = getErrorDialog(activity2, i, i2, onCancelListener2);
        if (errorDialog == null) {
            return false;
        }
        zag(activity2, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener2);
        return true;
    }

    @NonNull
    public Task<Void> checkApiAvailability(@RecentlyNonNull HasApiKey<?> hasApiKey, @RecentlyNonNull HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(zaa.zaa);
    }

    public void showErrorNotification(@RecentlyNonNull Context context, @RecentlyNonNull ConnectionResult connectionResult) {
        Context context2 = context;
        ConnectionResult connectionResult2 = connectionResult;
        zab(context2, connectionResult2.getErrorCode(), (String) null, getErrorResolutionPendingIntent(context2, connectionResult2));
    }

    @RecentlyNullable
    public Dialog getErrorDialog(@RecentlyNonNull Fragment fragment, int i, int i2) {
        return getErrorDialog(fragment, i, i2, (DialogInterface.OnCancelListener) null);
    }

    @RecentlyNullable
    public Dialog getErrorDialog(@RecentlyNonNull Fragment fragment, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Fragment fragment2 = fragment;
        int i3 = i;
        return zaf(fragment2.requireContext(), i3, zag.zac(fragment2, getErrorResolutionIntent(fragment2.requireContext(), i3, "d"), i2), onCancelListener);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Dialog zaf(@NonNull Context context, int i, zag zag, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        TypedValue typedValue;
        AlertDialog.Builder builder;
        Throwable th;
        Context context2 = context;
        int i2 = i;
        zag zag2 = zag;
        DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
        if (i2 == 0) {
            return null;
        }
        new TypedValue();
        boolean resolveAttribute = context2.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context2.getResources().getResourceEntryName(typedValue.resourceId))) {
            new AlertDialog.Builder(context2, 5);
        } else {
            builder = null;
        }
        if (builder == null) {
            new AlertDialog.Builder(context2);
        }
        AlertDialog.Builder message = builder.setMessage(zac.zac(context2, i2));
        if (onCancelListener2 != null) {
            AlertDialog.Builder onCancelListener3 = builder.setOnCancelListener(onCancelListener2);
        }
        String zae = zac.zae(context2, i2);
        if (zae != null) {
            AlertDialog.Builder positiveButton = builder.setPositiveButton(zae, zag2);
        }
        String zaa2 = zac.zaa(context2, i2);
        if (zaa2 != null) {
            AlertDialog.Builder title = builder.setTitle(zaa2);
        }
        String format = String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i2)});
        new IllegalArgumentException();
        int w = Log.w("GoogleApiAvailability", format, th);
        return builder.create();
    }
}

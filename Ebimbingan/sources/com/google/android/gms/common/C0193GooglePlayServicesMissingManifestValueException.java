package com.google.android.gms.common;

import com.google.android.gms.common.annotation.C0209KeepName;

@C0209KeepName
/* renamed from: com.google.android.gms.common.GooglePlayServicesMissingManifestValueException */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0193GooglePlayServicesMissingManifestValueException extends C0192GooglePlayServicesManifestException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0193GooglePlayServicesMissingManifestValueException() {
        super(0, "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}

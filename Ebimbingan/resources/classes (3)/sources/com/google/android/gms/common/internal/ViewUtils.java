package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class ViewUtils {
    private ViewUtils() {
    }

    @KeepForSdk
    @RecentlyNullable
    public static String getXmlAttributeString(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, boolean z, boolean z2, @RecentlyNonNull String str3) {
        String attributeValue;
        StringBuilder sb;
        TypedValue typedValue;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        String str4 = str;
        String str5 = str2;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        boolean z3 = z;
        boolean z4 = z2;
        String str6 = str3;
        if (attributeSet2 == null) {
            attributeValue = null;
        } else {
            attributeValue = attributeSet2.getAttributeValue(str4, str5);
        }
        if (attributeValue != null && attributeValue.startsWith("@string/") && z3) {
            String substring = attributeValue.substring(8);
            String packageName = context2.getPackageName();
            new TypedValue();
            try {
                Resources resources = context2.getResources();
                new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(substring).length());
                StringBuilder append = sb4.append(packageName);
                StringBuilder append2 = sb4.append(":string/");
                StringBuilder append3 = sb4.append(substring);
                resources.getValue(sb4.toString(), typedValue, true);
            } catch (Resources.NotFoundException e) {
                new StringBuilder(String.valueOf(str5).length() + 30 + attributeValue.length());
                StringBuilder append4 = sb2.append("Could not find resource for ");
                StringBuilder append5 = sb2.append(str5);
                StringBuilder append6 = sb2.append(": ");
                StringBuilder append7 = sb2.append(attributeValue);
                int w = Log.w(str6, sb2.toString());
            }
            if (typedValue.string != null) {
                attributeValue = typedValue.string.toString();
            } else {
                String valueOf = String.valueOf(typedValue);
                new StringBuilder(String.valueOf(str5).length() + 28 + String.valueOf(valueOf).length());
                StringBuilder append8 = sb3.append("Resource ");
                StringBuilder append9 = sb3.append(str5);
                StringBuilder append10 = sb3.append(" was not a string: ");
                StringBuilder append11 = sb3.append(valueOf);
                int w2 = Log.w(str6, sb3.toString());
            }
        }
        if (z4 && attributeValue == null) {
            new StringBuilder(String.valueOf(str5).length() + 33);
            StringBuilder append12 = sb.append("Required XML attribute \"");
            StringBuilder append13 = sb.append(str5);
            StringBuilder append14 = sb.append("\" missing");
            int w3 = Log.w(str6, sb.toString());
        }
        return attributeValue;
    }
}

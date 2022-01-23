package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import org.jose4j.jwx.HeaderParameterNames;

@C0463SafeParcelable.Class(creator = "PlaceReportCreator")
public class PlaceReport extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR;
    @C0463SafeParcelable.Field(getter = "getTag", id = 3)
    private final String tag;
    @C0463SafeParcelable.VersionField(id = 1)
    private final int versionCode;
    @C0463SafeParcelable.Field(getter = "getPlaceId", id = 2)
    private final String zza;
    @C0463SafeParcelable.Field(getter = "getSource", id = 4)
    private final String zzb;

    static {
        Parcelable.Creator<PlaceReport> creator;
        new zza();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    PlaceReport(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) String str2, @C0463SafeParcelable.Param(id = 4) String str3) {
        this.versionCode = i;
        this.zza = str;
        this.tag = str2;
        this.zzb = str3;
    }

    @C0617VisibleForTesting
    public static PlaceReport create(String str, String str2) {
        boolean z;
        PlaceReport placeReport;
        String str3 = EnvironmentCompat.MEDIA_UNKNOWN;
        String str4 = str2;
        String str5 = str;
        String str6 = str5;
        Object checkNotNull = C0446Preconditions.checkNotNull(str5);
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str4);
        String checkNotEmpty2 = C0446Preconditions.checkNotEmpty(str3);
        String str7 = str3;
        boolean z2 = true;
        switch (str7.hashCode()) {
            case -1436706272:
                if (str7.equals("inferredGeofencing")) {
                    z2 = true;
                    break;
                }
                break;
            case -1194968642:
                if (str7.equals("userReported")) {
                    z2 = true;
                    break;
                }
                break;
            case -284840886:
                if (str7.equals(EnvironmentCompat.MEDIA_UNKNOWN)) {
                    z2 = false;
                    break;
                }
                break;
            case -262743844:
                if (str7.equals("inferredReverseGeocoding")) {
                    z2 = true;
                    break;
                }
                break;
            case 1164924125:
                if (str7.equals("inferredSnappedToRoad")) {
                    z2 = true;
                    break;
                }
                break;
            case 1287171955:
                if (str7.equals("inferredRadioSignals")) {
                    z2 = true;
                    break;
                }
                break;
        }
        switch (z2) {
            case false:
            case true:
            case true:
            case true:
            case true:
            case true:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        C0446Preconditions.checkArgument(z, "Invalid source");
        new PlaceReport(1, str6, str4, str3);
        return placeReport;
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj2;
        return C0444Objects.equal(this.zza, placeReport.zza) && C0444Objects.equal(this.tag, placeReport.tag) && C0444Objects.equal(this.zzb, placeReport.zzb);
    }

    public String getPlaceId() {
        return this.zza;
    }

    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.zza;
        Object[] objArr2 = objArr;
        objArr2[1] = this.tag;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.zzb;
        return C0444Objects.hashCode(objArr3);
    }

    public String toString() {
        C0444Objects.ToStringHelper stringHelper = C0444Objects.toStringHelper(this);
        C0444Objects.ToStringHelper toStringHelper = stringHelper;
        C0444Objects.ToStringHelper add = stringHelper.add("placeId", this.zza);
        C0444Objects.ToStringHelper add2 = toStringHelper.add(HeaderParameterNames.AUTHENTICATION_TAG, this.tag);
        if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(this.zzb)) {
            C0444Objects.ToStringHelper add3 = toStringHelper.add("source", this.zzb);
        }
        return toStringHelper.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.versionCode);
        C0462SafeParcelWriter.writeString(parcel2, 2, getPlaceId(), false);
        C0462SafeParcelWriter.writeString(parcel2, 3, getTag(), false);
        C0462SafeParcelWriter.writeString(parcel2, 4, this.zzb, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.server.response.C0557FastJsonResponse;

@C0463SafeParcelable.Class(creator = "ConverterWrapperCreator")
/* renamed from: com.google.android.gms.common.server.converter.zaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0552zaa extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0552zaa> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @C0463SafeParcelable.Field(getter = "getStringToIntConverter", id = 2)
    private final C0551StringToIntConverter zab;

    static {
        Parcelable.Creator<C0552zaa> creator;
        new C0553zab();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0552zaa(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) C0551StringToIntConverter stringToIntConverter) {
        this.zaa = i;
        this.zab = stringToIntConverter;
    }

    public static C0552zaa zaa(C0557FastJsonResponse.FieldConverter<?, ?> fieldConverter) {
        C0552zaa zaa2;
        Throwable th;
        C0557FastJsonResponse.FieldConverter<?, ?> fieldConverter2 = fieldConverter;
        if (!(fieldConverter2 instanceof C0551StringToIntConverter)) {
            new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            throw th;
        }
        new C0552zaa((C0551StringToIntConverter) fieldConverter2);
        return zaa2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.zab, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final C0557FastJsonResponse.FieldConverter<?, ?> zab() {
        Throwable th;
        C0551StringToIntConverter stringToIntConverter = this.zab;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        throw th;
    }

    private C0552zaa(C0551StringToIntConverter stringToIntConverter) {
        this.zaa = 1;
        this.zab = stringToIntConverter;
    }
}

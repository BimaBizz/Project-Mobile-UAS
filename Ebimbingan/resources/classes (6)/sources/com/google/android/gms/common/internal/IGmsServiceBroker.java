package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface IGmsServiceBroker extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @RecentlyNonNull
        @KeepForSdk
        public IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i, @RecentlyNonNull Parcel parcel, @Nullable Parcel parcel2, int i2) throws RemoteException {
            IGmsCallbacks iGmsCallbacks;
            IGmsCallbacks iGmsCallbacks2;
            Throwable th;
            Throwable th2;
            GetServiceRequest getServiceRequest;
            int i3 = i;
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            int i4 = i2;
            if (i3 > 16777215) {
                return super.onTransact(i3, parcel3, parcel4, i4);
            }
            parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder readStrongBinder = parcel3.readStrongBinder();
            if (readStrongBinder == null) {
                iGmsCallbacks2 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if (queryLocalInterface instanceof IGmsCallbacks) {
                    iGmsCallbacks2 = (IGmsCallbacks) queryLocalInterface;
                } else {
                    new zzz(readStrongBinder);
                    iGmsCallbacks2 = iGmsCallbacks;
                }
            }
            if (i3 == 46) {
                if (parcel3.readInt() != 0) {
                    getServiceRequest = GetServiceRequest.CREATOR.createFromParcel(parcel3);
                } else {
                    getServiceRequest = null;
                }
                getService(iGmsCallbacks2, getServiceRequest);
                Object checkNotNull = Preconditions.checkNotNull(parcel4);
                parcel4.writeNoException();
                return true;
            } else if (i3 == 47) {
                if (parcel3.readInt() != 0) {
                    zzai createFromParcel = zzai.CREATOR.createFromParcel(parcel3);
                }
                new UnsupportedOperationException();
                throw th2;
            } else {
                int readInt = parcel3.readInt();
                if (i3 != 4) {
                    String readString = parcel3.readString();
                    switch (i3) {
                        case 1:
                            String readString2 = parcel3.readString();
                            String[] createStringArray = parcel3.createStringArray();
                            String readString3 = parcel3.readString();
                            if (parcel3.readInt() != 0) {
                                Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                                break;
                            }
                            break;
                        case 2:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case ConnectionResult.LICENSE_CHECK_FAILED:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case ConnectionResult.SERVICE_UPDATING:
                        case ConnectionResult.API_DISABLED:
                        case 25:
                        case 27:
                        case 37:
                        case 38:
                        case 41:
                        case 43:
                            if (parcel3.readInt() != 0) {
                                Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                                break;
                            }
                            break;
                        case ConnectionResult.SERVICE_INVALID:
                            String readString4 = parcel3.readString();
                            String[] createStringArray2 = parcel3.createStringArray();
                            String readString5 = parcel3.readString();
                            IBinder readStrongBinder2 = parcel3.readStrongBinder();
                            String readString6 = parcel3.readString();
                            if (parcel3.readInt() != 0) {
                                Bundle bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                                break;
                            }
                            break;
                        case 10:
                            String readString7 = parcel3.readString();
                            String[] createStringArray3 = parcel3.createStringArray();
                            break;
                        case 19:
                            IBinder readStrongBinder3 = parcel3.readStrongBinder();
                            if (parcel3.readInt() != 0) {
                                Bundle bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                                break;
                            }
                            break;
                        case 20:
                        case 30:
                            String[] createStringArray4 = parcel3.createStringArray();
                            String readString8 = parcel3.readString();
                            if (parcel3.readInt() != 0) {
                                Bundle bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                                break;
                            }
                            break;
                        case 34:
                            String readString9 = parcel3.readString();
                            break;
                    }
                }
                new UnsupportedOperationException();
                throw th;
            }
        }
    }

    @KeepForSdk
    void getService(@RecentlyNonNull IGmsCallbacks iGmsCallbacks, @Nullable GetServiceRequest getServiceRequest) throws RemoteException;
}

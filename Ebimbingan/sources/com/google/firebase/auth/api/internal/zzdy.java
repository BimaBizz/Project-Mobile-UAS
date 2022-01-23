package com.google.firebase.auth.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.firebase_auth.zza;
import com.google.android.gms.internal.firebase_auth.zzbn;
import com.google.android.gms.internal.firebase_auth.zzbp;
import com.google.android.gms.internal.firebase_auth.zzbr;
import com.google.android.gms.internal.firebase_auth.zzbt;
import com.google.android.gms.internal.firebase_auth.zzbv;
import com.google.android.gms.internal.firebase_auth.zzbx;
import com.google.android.gms.internal.firebase_auth.zzbz;
import com.google.android.gms.internal.firebase_auth.zzcb;
import com.google.android.gms.internal.firebase_auth.zzcd;
import com.google.android.gms.internal.firebase_auth.zzcf;
import com.google.android.gms.internal.firebase_auth.zzch;
import com.google.android.gms.internal.firebase_auth.zzcj;
import com.google.android.gms.internal.firebase_auth.zzcl;
import com.google.android.gms.internal.firebase_auth.zzcn;
import com.google.android.gms.internal.firebase_auth.zzcp;
import com.google.android.gms.internal.firebase_auth.zzcr;
import com.google.android.gms.internal.firebase_auth.zzct;
import com.google.android.gms.internal.firebase_auth.zzcv;
import com.google.android.gms.internal.firebase_auth.zzcx;
import com.google.android.gms.internal.firebase_auth.zzcz;
import com.google.android.gms.internal.firebase_auth.zzd;
import com.google.android.gms.internal.firebase_auth.zzdb;
import com.google.android.gms.internal.firebase_auth.zzdd;
import com.google.android.gms.internal.firebase_auth.zzdf;
import com.google.android.gms.internal.firebase_auth.zzdh;
import com.google.android.gms.internal.firebase_auth.zzdj;
import com.google.android.gms.internal.firebase_auth.zzdl;
import com.google.android.gms.internal.firebase_auth.zzdn;
import com.google.android.gms.internal.firebase_auth.zzdp;
import com.google.android.gms.internal.firebase_auth.zzdr;
import com.google.android.gms.internal.firebase_auth.zzdt;
import com.google.android.gms.internal.firebase_auth.zzdv;
import com.google.android.gms.internal.firebase_auth.zzdx;
import com.google.android.gms.internal.firebase_auth.zzfe;
import com.google.android.gms.internal.firebase_auth.zzfm;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;

public abstract class zzdy extends zza implements zzdz {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdy() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzdu zzdu;
        zzdu zzdu2;
        zzdu zzdu3;
        zzdu zzdu4;
        zzdu zzdu5;
        zzdu zzdu6;
        zzdu zzdu7;
        zzdu zzdu8;
        zzdu zzdu9;
        zzdu zzdu10;
        zzdu zzdu11;
        zzdu zzdu12;
        zzdu zzdu13;
        zzdu zzdu14;
        zzdu zzdu15;
        zzdu zzdu16;
        zzdu zzdu17;
        zzdu zzdu18;
        zzdu zzdu19;
        zzdu zzdu20;
        zzdu zzdu21;
        zzdu zzdu22;
        zzdu zzdu23;
        zzdu zzdu24;
        zzdu zzdu25;
        zzdu zzdu26;
        zzdu zzdu27;
        zzdu zzdu28;
        zzdu zzdu29;
        zzdu zzdu30;
        zzdu zzdu31;
        zzdu zzdu32;
        zzdu zzdu33;
        zzdu zzdu34;
        zzdu zzdu35;
        zzdu zzdu36;
        zzdu zzdu37;
        zzdu zzdu38;
        zzdu zzdu39;
        zzdu zzdu40;
        zzdu zzdu41;
        zzdu zzdu42;
        zzdu zzdu43;
        zzdu zzdu44;
        zzdu zzdu45;
        zzdu zzdu46;
        zzdu zzdu47;
        zzdu zzdu48;
        zzdu zzdu49;
        zzdu zzdu50;
        zzdu zzdu51;
        zzdu zzdu52;
        zzdu zzdu53;
        zzdu zzdu54;
        zzdu zzdu55;
        zzdu zzdu56;
        zzdu zzdu57;
        zzdu zzdu58;
        zzdu zzdu59;
        zzdu zzdu60;
        zzdu zzdu61;
        zzdu zzdu62;
        zzdu zzdu63;
        zzdu zzdu64;
        zzdu zzdu65;
        zzdu zzdu66;
        zzdu zzdu67;
        zzdu zzdu68;
        zzdu zzdu69;
        zzdu zzdu70;
        zzdu zzdu71;
        zzdu zzdu72;
        zzdu zzdu73;
        zzdu zzdu74;
        zzdu zzdu75;
        zzdu zzdu76;
        zzdu zzdu77;
        zzdu zzdu78;
        zzdu zzdu79;
        zzdu zzdu80;
        zzdu zzdu81;
        zzdu zzdu82;
        zzdu zzdu83;
        zzdu zzdu84;
        zzdu zzdu85;
        zzdu zzdu86;
        zzdu zzdu87;
        zzdu zzdu88;
        zzdu zzdu89;
        zzdu zzdu90;
        zzdu zzdu91;
        zzdu zzdu92;
        zzdu zzdu93;
        zzdu zzdu94;
        zzdu zzdu95;
        zzdu zzdu96;
        zzdu zzdu97;
        zzdu zzdu98;
        zzdu zzdu99;
        zzdu zzdu100;
        zzdu zzdu101;
        zzdu zzdu102;
        zzdu zzdu103;
        zzdu zzdu104;
        zzdu zzdu105;
        zzdu zzdu106;
        zzdu zzdu107;
        zzdu zzdu108;
        zzdu zzdu109;
        zzdu zzdu110;
        zzdu zzdu111;
        zzdu zzdu112;
        zzdu zzdu113;
        zzdu zzdu114;
        zzdu zzdu115;
        zzdu zzdu116;
        zzdu zzdu117;
        zzdu zzdu118;
        zzdu zzdu119;
        zzdu zzdu120;
        zzdu zzdu121;
        zzdu zzdu122;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                String readString = parcel3.readString();
                IBinder readStrongBinder = parcel3.readStrongBinder();
                IBinder iBinder = readStrongBinder;
                if (readStrongBinder == null) {
                    zzdu122 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface = queryLocalInterface;
                    if (queryLocalInterface instanceof zzdu) {
                        zzdu122 = (zzdu) iInterface;
                    } else {
                        zzdu122 = zzdu121;
                        new zzdw(iBinder);
                    }
                }
                zza(readString, zzdu122);
                break;
            case 2:
                String readString2 = parcel3.readString();
                IBinder readStrongBinder2 = parcel3.readStrongBinder();
                IBinder iBinder2 = readStrongBinder2;
                if (readStrongBinder2 == null) {
                    zzdu120 = null;
                } else {
                    IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface2 = queryLocalInterface2;
                    if (queryLocalInterface2 instanceof zzdu) {
                        zzdu120 = (zzdu) iInterface2;
                    } else {
                        zzdu120 = zzdu119;
                        new zzdw(iBinder2);
                    }
                }
                zzb(readString2, zzdu120);
                break;
            case 3:
                zzfm zzfm = (zzfm) zzd.zza(parcel3, zzfm.CREATOR);
                IBinder readStrongBinder3 = parcel3.readStrongBinder();
                IBinder iBinder3 = readStrongBinder3;
                if (readStrongBinder3 == null) {
                    zzdu118 = null;
                } else {
                    IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface3 = queryLocalInterface3;
                    if (queryLocalInterface3 instanceof zzdu) {
                        zzdu118 = (zzdu) iInterface3;
                    } else {
                        zzdu118 = zzdu117;
                        new zzdw(iBinder3);
                    }
                }
                zza(zzfm, zzdu118);
                break;
            case 4:
                String readString3 = parcel3.readString();
                UserProfileChangeRequest userProfileChangeRequest = (UserProfileChangeRequest) zzd.zza(parcel3, UserProfileChangeRequest.CREATOR);
                IBinder readStrongBinder4 = parcel3.readStrongBinder();
                IBinder iBinder4 = readStrongBinder4;
                if (readStrongBinder4 == null) {
                    zzdu116 = null;
                } else {
                    IInterface queryLocalInterface4 = iBinder4.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface4 = queryLocalInterface4;
                    if (queryLocalInterface4 instanceof zzdu) {
                        zzdu116 = (zzdu) iInterface4;
                    } else {
                        zzdu116 = zzdu115;
                        new zzdw(iBinder4);
                    }
                }
                zza(readString3, userProfileChangeRequest, zzdu116);
                break;
            case 5:
                String readString4 = parcel3.readString();
                String readString5 = parcel3.readString();
                IBinder readStrongBinder5 = parcel3.readStrongBinder();
                IBinder iBinder5 = readStrongBinder5;
                if (readStrongBinder5 == null) {
                    zzdu114 = null;
                } else {
                    IInterface queryLocalInterface5 = iBinder5.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface5 = queryLocalInterface5;
                    if (queryLocalInterface5 instanceof zzdu) {
                        zzdu114 = (zzdu) iInterface5;
                    } else {
                        zzdu114 = zzdu113;
                        new zzdw(iBinder5);
                    }
                }
                zza(readString4, readString5, zzdu114);
                break;
            case 6:
                String readString6 = parcel3.readString();
                String readString7 = parcel3.readString();
                IBinder readStrongBinder6 = parcel3.readStrongBinder();
                IBinder iBinder6 = readStrongBinder6;
                if (readStrongBinder6 == null) {
                    zzdu112 = null;
                } else {
                    IInterface queryLocalInterface6 = iBinder6.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface6 = queryLocalInterface6;
                    if (queryLocalInterface6 instanceof zzdu) {
                        zzdu112 = (zzdu) iInterface6;
                    } else {
                        zzdu112 = zzdu111;
                        new zzdw(iBinder6);
                    }
                }
                zzb(readString6, readString7, zzdu112);
                break;
            case 7:
                String readString8 = parcel3.readString();
                String readString9 = parcel3.readString();
                IBinder readStrongBinder7 = parcel3.readStrongBinder();
                IBinder iBinder7 = readStrongBinder7;
                if (readStrongBinder7 == null) {
                    zzdu110 = null;
                } else {
                    IInterface queryLocalInterface7 = iBinder7.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface7 = queryLocalInterface7;
                    if (queryLocalInterface7 instanceof zzdu) {
                        zzdu110 = (zzdu) iInterface7;
                    } else {
                        zzdu110 = zzdu109;
                        new zzdw(iBinder7);
                    }
                }
                zzc(readString8, readString9, zzdu110);
                break;
            case 8:
                String readString10 = parcel3.readString();
                String readString11 = parcel3.readString();
                IBinder readStrongBinder8 = parcel3.readStrongBinder();
                IBinder iBinder8 = readStrongBinder8;
                if (readStrongBinder8 == null) {
                    zzdu108 = null;
                } else {
                    IInterface queryLocalInterface8 = iBinder8.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface8 = queryLocalInterface8;
                    if (queryLocalInterface8 instanceof zzdu) {
                        zzdu108 = (zzdu) iInterface8;
                    } else {
                        zzdu108 = zzdu107;
                        new zzdw(iBinder8);
                    }
                }
                zzd(readString10, readString11, zzdu108);
                break;
            case 9:
                String readString12 = parcel3.readString();
                IBinder readStrongBinder9 = parcel3.readStrongBinder();
                IBinder iBinder9 = readStrongBinder9;
                if (readStrongBinder9 == null) {
                    zzdu106 = null;
                } else {
                    IInterface queryLocalInterface9 = iBinder9.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface9 = queryLocalInterface9;
                    if (queryLocalInterface9 instanceof zzdu) {
                        zzdu106 = (zzdu) iInterface9;
                    } else {
                        zzdu106 = zzdu105;
                        new zzdw(iBinder9);
                    }
                }
                zzc(readString12, zzdu106);
                break;
            case 10:
                String readString13 = parcel3.readString();
                IBinder readStrongBinder10 = parcel3.readStrongBinder();
                IBinder iBinder10 = readStrongBinder10;
                if (readStrongBinder10 == null) {
                    zzdu104 = null;
                } else {
                    IInterface queryLocalInterface10 = iBinder10.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface10 = queryLocalInterface10;
                    if (queryLocalInterface10 instanceof zzdu) {
                        zzdu104 = (zzdu) iInterface10;
                    } else {
                        zzdu104 = zzdu103;
                        new zzdw(iBinder10);
                    }
                }
                zzd(readString13, zzdu104);
                break;
            case 11:
                String readString14 = parcel3.readString();
                String readString15 = parcel3.readString();
                String readString16 = parcel3.readString();
                IBinder readStrongBinder11 = parcel3.readStrongBinder();
                IBinder iBinder11 = readStrongBinder11;
                if (readStrongBinder11 == null) {
                    zzdu102 = null;
                } else {
                    IInterface queryLocalInterface11 = iBinder11.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface11 = queryLocalInterface11;
                    if (queryLocalInterface11 instanceof zzdu) {
                        zzdu102 = (zzdu) iInterface11;
                    } else {
                        zzdu102 = zzdu101;
                        new zzdw(iBinder11);
                    }
                }
                zza(readString14, readString15, readString16, zzdu102);
                break;
            case 12:
                String readString17 = parcel3.readString();
                zzfm zzfm2 = (zzfm) zzd.zza(parcel3, zzfm.CREATOR);
                IBinder readStrongBinder12 = parcel3.readStrongBinder();
                IBinder iBinder12 = readStrongBinder12;
                if (readStrongBinder12 == null) {
                    zzdu100 = null;
                } else {
                    IInterface queryLocalInterface12 = iBinder12.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface12 = queryLocalInterface12;
                    if (queryLocalInterface12 instanceof zzdu) {
                        zzdu100 = (zzdu) iInterface12;
                    } else {
                        zzdu100 = zzdu99;
                        new zzdw(iBinder12);
                    }
                }
                zza(readString17, zzfm2, zzdu100);
                break;
            case 13:
                String readString18 = parcel3.readString();
                IBinder readStrongBinder13 = parcel3.readStrongBinder();
                IBinder iBinder13 = readStrongBinder13;
                if (readStrongBinder13 == null) {
                    zzdu98 = null;
                } else {
                    IInterface queryLocalInterface13 = iBinder13.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface13 = queryLocalInterface13;
                    if (queryLocalInterface13 instanceof zzdu) {
                        zzdu98 = (zzdu) iInterface13;
                    } else {
                        zzdu98 = zzdu97;
                        new zzdw(iBinder13);
                    }
                }
                zze(readString18, zzdu98);
                break;
            case 14:
                String readString19 = parcel3.readString();
                String readString20 = parcel3.readString();
                IBinder readStrongBinder14 = parcel3.readStrongBinder();
                IBinder iBinder14 = readStrongBinder14;
                if (readStrongBinder14 == null) {
                    zzdu96 = null;
                } else {
                    IInterface queryLocalInterface14 = iBinder14.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface14 = queryLocalInterface14;
                    if (queryLocalInterface14 instanceof zzdu) {
                        zzdu96 = (zzdu) iInterface14;
                    } else {
                        zzdu96 = zzdu95;
                        new zzdw(iBinder14);
                    }
                }
                zze(readString19, readString20, zzdu96);
                break;
            case 15:
                String readString21 = parcel3.readString();
                IBinder readStrongBinder15 = parcel3.readStrongBinder();
                IBinder iBinder15 = readStrongBinder15;
                if (readStrongBinder15 == null) {
                    zzdu94 = null;
                } else {
                    IInterface queryLocalInterface15 = iBinder15.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface15 = queryLocalInterface15;
                    if (queryLocalInterface15 instanceof zzdu) {
                        zzdu94 = (zzdu) iInterface15;
                    } else {
                        zzdu94 = zzdu93;
                        new zzdw(iBinder15);
                    }
                }
                zzf(readString21, zzdu94);
                break;
            case 16:
                IBinder readStrongBinder16 = parcel3.readStrongBinder();
                IBinder iBinder16 = readStrongBinder16;
                if (readStrongBinder16 == null) {
                    zzdu92 = null;
                } else {
                    IInterface queryLocalInterface16 = iBinder16.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface16 = queryLocalInterface16;
                    if (queryLocalInterface16 instanceof zzdu) {
                        zzdu92 = (zzdu) iInterface16;
                    } else {
                        zzdu92 = zzdu91;
                        new zzdw(iBinder16);
                    }
                }
                zza(zzdu92);
                break;
            case 17:
                String readString22 = parcel3.readString();
                IBinder readStrongBinder17 = parcel3.readStrongBinder();
                IBinder iBinder17 = readStrongBinder17;
                if (readStrongBinder17 == null) {
                    zzdu90 = null;
                } else {
                    IInterface queryLocalInterface17 = iBinder17.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface17 = queryLocalInterface17;
                    if (queryLocalInterface17 instanceof zzdu) {
                        zzdu90 = (zzdu) iInterface17;
                    } else {
                        zzdu90 = zzdu89;
                        new zzdw(iBinder17);
                    }
                }
                zzg(readString22, zzdu90);
                break;
            case 18:
                String readString23 = parcel3.readString();
                IBinder readStrongBinder18 = parcel3.readStrongBinder();
                IBinder iBinder18 = readStrongBinder18;
                if (readStrongBinder18 == null) {
                    zzdu88 = null;
                } else {
                    IInterface queryLocalInterface18 = iBinder18.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface18 = queryLocalInterface18;
                    if (queryLocalInterface18 instanceof zzdu) {
                        zzdu88 = (zzdu) iInterface18;
                    } else {
                        zzdu88 = zzdu87;
                        new zzdw(iBinder18);
                    }
                }
                zzh(readString23, zzdu88);
                break;
            case 19:
                String readString24 = parcel3.readString();
                IBinder readStrongBinder19 = parcel3.readStrongBinder();
                IBinder iBinder19 = readStrongBinder19;
                if (readStrongBinder19 == null) {
                    zzdu86 = null;
                } else {
                    IInterface queryLocalInterface19 = iBinder19.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface19 = queryLocalInterface19;
                    if (queryLocalInterface19 instanceof zzdu) {
                        zzdu86 = (zzdu) iInterface19;
                    } else {
                        zzdu86 = zzdu85;
                        new zzdw(iBinder19);
                    }
                }
                zzi(readString24, zzdu86);
                break;
            case 20:
                String readString25 = parcel3.readString();
                IBinder readStrongBinder20 = parcel3.readStrongBinder();
                IBinder iBinder20 = readStrongBinder20;
                if (readStrongBinder20 == null) {
                    zzdu84 = null;
                } else {
                    IInterface queryLocalInterface20 = iBinder20.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface20 = queryLocalInterface20;
                    if (queryLocalInterface20 instanceof zzdu) {
                        zzdu84 = (zzdu) iInterface20;
                    } else {
                        zzdu84 = zzdu83;
                        new zzdw(iBinder20);
                    }
                }
                zzj(readString25, zzdu84);
                break;
            case 21:
                String readString26 = parcel3.readString();
                String readString27 = parcel3.readString();
                IBinder readStrongBinder21 = parcel3.readStrongBinder();
                IBinder iBinder21 = readStrongBinder21;
                if (readStrongBinder21 == null) {
                    zzdu82 = null;
                } else {
                    IInterface queryLocalInterface21 = iBinder21.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface21 = queryLocalInterface21;
                    if (queryLocalInterface21 instanceof zzdu) {
                        zzdu82 = (zzdu) iInterface21;
                    } else {
                        zzdu82 = zzdu81;
                        new zzdw(iBinder21);
                    }
                }
                zzf(readString26, readString27, zzdu82);
                break;
            case 22:
                zzfe zzfe = (zzfe) zzd.zza(parcel3, zzfe.CREATOR);
                IBinder readStrongBinder22 = parcel3.readStrongBinder();
                IBinder iBinder22 = readStrongBinder22;
                if (readStrongBinder22 == null) {
                    zzdu80 = null;
                } else {
                    IInterface queryLocalInterface22 = iBinder22.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface22 = queryLocalInterface22;
                    if (queryLocalInterface22 instanceof zzdu) {
                        zzdu80 = (zzdu) iInterface22;
                    } else {
                        zzdu80 = zzdu79;
                        new zzdw(iBinder22);
                    }
                }
                zza(zzfe, zzdu80);
                break;
            case 23:
                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) zzd.zza(parcel3, PhoneAuthCredential.CREATOR);
                IBinder readStrongBinder23 = parcel3.readStrongBinder();
                IBinder iBinder23 = readStrongBinder23;
                if (readStrongBinder23 == null) {
                    zzdu78 = null;
                } else {
                    IInterface queryLocalInterface23 = iBinder23.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface23 = queryLocalInterface23;
                    if (queryLocalInterface23 instanceof zzdu) {
                        zzdu78 = (zzdu) iInterface23;
                    } else {
                        zzdu78 = zzdu77;
                        new zzdw(iBinder23);
                    }
                }
                zza(phoneAuthCredential, zzdu78);
                break;
            case 24:
                String readString28 = parcel3.readString();
                PhoneAuthCredential phoneAuthCredential2 = (PhoneAuthCredential) zzd.zza(parcel3, PhoneAuthCredential.CREATOR);
                IBinder readStrongBinder24 = parcel3.readStrongBinder();
                IBinder iBinder24 = readStrongBinder24;
                if (readStrongBinder24 == null) {
                    zzdu76 = null;
                } else {
                    IInterface queryLocalInterface24 = iBinder24.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface24 = queryLocalInterface24;
                    if (queryLocalInterface24 instanceof zzdu) {
                        zzdu76 = (zzdu) iInterface24;
                    } else {
                        zzdu76 = zzdu75;
                        new zzdw(iBinder24);
                    }
                }
                zza(readString28, phoneAuthCredential2, zzdu76);
                break;
            case 25:
                String readString29 = parcel3.readString();
                ActionCodeSettings actionCodeSettings = (ActionCodeSettings) zzd.zza(parcel3, ActionCodeSettings.CREATOR);
                IBinder readStrongBinder25 = parcel3.readStrongBinder();
                IBinder iBinder25 = readStrongBinder25;
                if (readStrongBinder25 == null) {
                    zzdu74 = null;
                } else {
                    IInterface queryLocalInterface25 = iBinder25.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface25 = queryLocalInterface25;
                    if (queryLocalInterface25 instanceof zzdu) {
                        zzdu74 = (zzdu) iInterface25;
                    } else {
                        zzdu74 = zzdu73;
                        new zzdw(iBinder25);
                    }
                }
                zza(readString29, actionCodeSettings, zzdu74);
                break;
            case 26:
                String readString30 = parcel3.readString();
                ActionCodeSettings actionCodeSettings2 = (ActionCodeSettings) zzd.zza(parcel3, ActionCodeSettings.CREATOR);
                IBinder readStrongBinder26 = parcel3.readStrongBinder();
                IBinder iBinder26 = readStrongBinder26;
                if (readStrongBinder26 == null) {
                    zzdu72 = null;
                } else {
                    IInterface queryLocalInterface26 = iBinder26.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface26 = queryLocalInterface26;
                    if (queryLocalInterface26 instanceof zzdu) {
                        zzdu72 = (zzdu) iInterface26;
                    } else {
                        zzdu72 = zzdu71;
                        new zzdw(iBinder26);
                    }
                }
                zzb(readString30, actionCodeSettings2, zzdu72);
                break;
            case 27:
                String readString31 = parcel3.readString();
                IBinder readStrongBinder27 = parcel3.readStrongBinder();
                IBinder iBinder27 = readStrongBinder27;
                if (readStrongBinder27 == null) {
                    zzdu70 = null;
                } else {
                    IInterface queryLocalInterface27 = iBinder27.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface27 = queryLocalInterface27;
                    if (queryLocalInterface27 instanceof zzdu) {
                        zzdu70 = (zzdu) iInterface27;
                    } else {
                        zzdu70 = zzdu69;
                        new zzdw(iBinder27);
                    }
                }
                zzk(readString31, zzdu70);
                break;
            case 28:
                String readString32 = parcel3.readString();
                ActionCodeSettings actionCodeSettings3 = (ActionCodeSettings) zzd.zza(parcel3, ActionCodeSettings.CREATOR);
                IBinder readStrongBinder28 = parcel3.readStrongBinder();
                IBinder iBinder28 = readStrongBinder28;
                if (readStrongBinder28 == null) {
                    zzdu68 = null;
                } else {
                    IInterface queryLocalInterface28 = iBinder28.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface28 = queryLocalInterface28;
                    if (queryLocalInterface28 instanceof zzdu) {
                        zzdu68 = (zzdu) iInterface28;
                    } else {
                        zzdu68 = zzdu67;
                        new zzdw(iBinder28);
                    }
                }
                zzc(readString32, actionCodeSettings3, zzdu68);
                break;
            case 29:
                EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zzd.zza(parcel3, EmailAuthCredential.CREATOR);
                IBinder readStrongBinder29 = parcel3.readStrongBinder();
                IBinder iBinder29 = readStrongBinder29;
                if (readStrongBinder29 == null) {
                    zzdu66 = null;
                } else {
                    IInterface queryLocalInterface29 = iBinder29.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface29 = queryLocalInterface29;
                    if (queryLocalInterface29 instanceof zzdu) {
                        zzdu66 = (zzdu) iInterface29;
                    } else {
                        zzdu66 = zzdu65;
                        new zzdw(iBinder29);
                    }
                }
                zza(emailAuthCredential, zzdu66);
                break;
            case 101:
                zzcf zzcf = (zzcf) zzd.zza(parcel3, zzcf.CREATOR);
                IBinder readStrongBinder30 = parcel3.readStrongBinder();
                IBinder iBinder30 = readStrongBinder30;
                if (readStrongBinder30 == null) {
                    zzdu64 = null;
                } else {
                    IInterface queryLocalInterface30 = iBinder30.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface30 = queryLocalInterface30;
                    if (queryLocalInterface30 instanceof zzdu) {
                        zzdu64 = (zzdu) iInterface30;
                    } else {
                        zzdu64 = zzdu63;
                        new zzdw(iBinder30);
                    }
                }
                zza(zzcf, zzdu64);
                break;
            case 102:
                zzdd zzdd = (zzdd) zzd.zza(parcel3, zzdd.CREATOR);
                IBinder readStrongBinder31 = parcel3.readStrongBinder();
                IBinder iBinder31 = readStrongBinder31;
                if (readStrongBinder31 == null) {
                    zzdu62 = null;
                } else {
                    IInterface queryLocalInterface31 = iBinder31.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface31 = queryLocalInterface31;
                    if (queryLocalInterface31 instanceof zzdu) {
                        zzdu62 = (zzdu) iInterface31;
                    } else {
                        zzdu62 = zzdu61;
                        new zzdw(iBinder31);
                    }
                }
                zza(zzdd, zzdu62);
                break;
            case 103:
                zzdb zzdb = (zzdb) zzd.zza(parcel3, zzdb.CREATOR);
                IBinder readStrongBinder32 = parcel3.readStrongBinder();
                IBinder iBinder32 = readStrongBinder32;
                if (readStrongBinder32 == null) {
                    zzdu60 = null;
                } else {
                    IInterface queryLocalInterface32 = iBinder32.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface32 = queryLocalInterface32;
                    if (queryLocalInterface32 instanceof zzdu) {
                        zzdu60 = (zzdu) iInterface32;
                    } else {
                        zzdu60 = zzdu59;
                        new zzdw(iBinder32);
                    }
                }
                zza(zzdb, zzdu60);
                break;
            case 104:
                zzdv zzdv = (zzdv) zzd.zza(parcel3, zzdv.CREATOR);
                IBinder readStrongBinder33 = parcel3.readStrongBinder();
                IBinder iBinder33 = readStrongBinder33;
                if (readStrongBinder33 == null) {
                    zzdu58 = null;
                } else {
                    IInterface queryLocalInterface33 = iBinder33.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface33 = queryLocalInterface33;
                    if (queryLocalInterface33 instanceof zzdu) {
                        zzdu58 = (zzdu) iInterface33;
                    } else {
                        zzdu58 = zzdu57;
                        new zzdw(iBinder33);
                    }
                }
                zza(zzdv, zzdu58);
                break;
            case 105:
                zzbp zzbp = (zzbp) zzd.zza(parcel3, zzbp.CREATOR);
                IBinder readStrongBinder34 = parcel3.readStrongBinder();
                IBinder iBinder34 = readStrongBinder34;
                if (readStrongBinder34 == null) {
                    zzdu56 = null;
                } else {
                    IInterface queryLocalInterface34 = iBinder34.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface34 = queryLocalInterface34;
                    if (queryLocalInterface34 instanceof zzdu) {
                        zzdu56 = (zzdu) iInterface34;
                    } else {
                        zzdu56 = zzdu55;
                        new zzdw(iBinder34);
                    }
                }
                zza(zzbp, zzdu56);
                break;
            case 106:
                zzbr zzbr = (zzbr) zzd.zza(parcel3, zzbr.CREATOR);
                IBinder readStrongBinder35 = parcel3.readStrongBinder();
                IBinder iBinder35 = readStrongBinder35;
                if (readStrongBinder35 == null) {
                    zzdu54 = null;
                } else {
                    IInterface queryLocalInterface35 = iBinder35.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface35 = queryLocalInterface35;
                    if (queryLocalInterface35 instanceof zzdu) {
                        zzdu54 = (zzdu) iInterface35;
                    } else {
                        zzdu54 = zzdu53;
                        new zzdw(iBinder35);
                    }
                }
                zza(zzbr, zzdu54);
                break;
            case 107:
                zzbx zzbx = (zzbx) zzd.zza(parcel3, zzbx.CREATOR);
                IBinder readStrongBinder36 = parcel3.readStrongBinder();
                IBinder iBinder36 = readStrongBinder36;
                if (readStrongBinder36 == null) {
                    zzdu52 = null;
                } else {
                    IInterface queryLocalInterface36 = iBinder36.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface36 = queryLocalInterface36;
                    if (queryLocalInterface36 instanceof zzdu) {
                        zzdu52 = (zzdu) iInterface36;
                    } else {
                        zzdu52 = zzdu51;
                        new zzdw(iBinder36);
                    }
                }
                zza(zzbx, zzdu52);
                break;
            case 108:
                zzdf zzdf = (zzdf) zzd.zza(parcel3, zzdf.CREATOR);
                IBinder readStrongBinder37 = parcel3.readStrongBinder();
                IBinder iBinder37 = readStrongBinder37;
                if (readStrongBinder37 == null) {
                    zzdu50 = null;
                } else {
                    IInterface queryLocalInterface37 = iBinder37.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface37 = queryLocalInterface37;
                    if (queryLocalInterface37 instanceof zzdu) {
                        zzdu50 = (zzdu) iInterface37;
                    } else {
                        zzdu50 = zzdu49;
                        new zzdw(iBinder37);
                    }
                }
                zza(zzdf, zzdu50);
                break;
            case 109:
                zzch zzch = (zzch) zzd.zza(parcel3, zzch.CREATOR);
                IBinder readStrongBinder38 = parcel3.readStrongBinder();
                IBinder iBinder38 = readStrongBinder38;
                if (readStrongBinder38 == null) {
                    zzdu48 = null;
                } else {
                    IInterface queryLocalInterface38 = iBinder38.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface38 = queryLocalInterface38;
                    if (queryLocalInterface38 instanceof zzdu) {
                        zzdu48 = (zzdu) iInterface38;
                    } else {
                        zzdu48 = zzdu47;
                        new zzdw(iBinder38);
                    }
                }
                zza(zzch, zzdu48);
                break;
            case 111:
                zzcj zzcj = (zzcj) zzd.zza(parcel3, zzcj.CREATOR);
                IBinder readStrongBinder39 = parcel3.readStrongBinder();
                IBinder iBinder39 = readStrongBinder39;
                if (readStrongBinder39 == null) {
                    zzdu46 = null;
                } else {
                    IInterface queryLocalInterface39 = iBinder39.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface39 = queryLocalInterface39;
                    if (queryLocalInterface39 instanceof zzdu) {
                        zzdu46 = (zzdu) iInterface39;
                    } else {
                        zzdu46 = zzdu45;
                        new zzdw(iBinder39);
                    }
                }
                zza(zzcj, zzdu46);
                break;
            case 112:
                zzcl zzcl = (zzcl) zzd.zza(parcel3, zzcl.CREATOR);
                IBinder readStrongBinder40 = parcel3.readStrongBinder();
                IBinder iBinder40 = readStrongBinder40;
                if (readStrongBinder40 == null) {
                    zzdu44 = null;
                } else {
                    IInterface queryLocalInterface40 = iBinder40.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface40 = queryLocalInterface40;
                    if (queryLocalInterface40 instanceof zzdu) {
                        zzdu44 = (zzdu) iInterface40;
                    } else {
                        zzdu44 = zzdu43;
                        new zzdw(iBinder40);
                    }
                }
                zza(zzcl, zzdu44);
                break;
            case 113:
                zzdr zzdr = (zzdr) zzd.zza(parcel3, zzdr.CREATOR);
                IBinder readStrongBinder41 = parcel3.readStrongBinder();
                IBinder iBinder41 = readStrongBinder41;
                if (readStrongBinder41 == null) {
                    zzdu42 = null;
                } else {
                    IInterface queryLocalInterface41 = iBinder41.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface41 = queryLocalInterface41;
                    if (queryLocalInterface41 instanceof zzdu) {
                        zzdu42 = (zzdu) iInterface41;
                    } else {
                        zzdu42 = zzdu41;
                        new zzdw(iBinder41);
                    }
                }
                zza(zzdr, zzdu42);
                break;
            case 114:
                zzdt zzdt = (zzdt) zzd.zza(parcel3, zzdt.CREATOR);
                IBinder readStrongBinder42 = parcel3.readStrongBinder();
                IBinder iBinder42 = readStrongBinder42;
                if (readStrongBinder42 == null) {
                    zzdu40 = null;
                } else {
                    IInterface queryLocalInterface42 = iBinder42.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface42 = queryLocalInterface42;
                    if (queryLocalInterface42 instanceof zzdu) {
                        zzdu40 = (zzdu) iInterface42;
                    } else {
                        zzdu40 = zzdu39;
                        new zzdw(iBinder42);
                    }
                }
                zza(zzdt, zzdu40);
                break;
            case 115:
                zzcp zzcp = (zzcp) zzd.zza(parcel3, zzcp.CREATOR);
                IBinder readStrongBinder43 = parcel3.readStrongBinder();
                IBinder iBinder43 = readStrongBinder43;
                if (readStrongBinder43 == null) {
                    zzdu38 = null;
                } else {
                    IInterface queryLocalInterface43 = iBinder43.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface43 = queryLocalInterface43;
                    if (queryLocalInterface43 instanceof zzdu) {
                        zzdu38 = (zzdu) iInterface43;
                    } else {
                        zzdu38 = zzdu37;
                        new zzdw(iBinder43);
                    }
                }
                zza(zzcp, zzdu38);
                break;
            case 116:
                zzcz zzcz = (zzcz) zzd.zza(parcel3, zzcz.CREATOR);
                IBinder readStrongBinder44 = parcel3.readStrongBinder();
                IBinder iBinder44 = readStrongBinder44;
                if (readStrongBinder44 == null) {
                    zzdu36 = null;
                } else {
                    IInterface queryLocalInterface44 = iBinder44.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface44 = queryLocalInterface44;
                    if (queryLocalInterface44 instanceof zzdu) {
                        zzdu36 = (zzdu) iInterface44;
                    } else {
                        zzdu36 = zzdu35;
                        new zzdw(iBinder44);
                    }
                }
                zza(zzcz, zzdu36);
                break;
            case 117:
                zzbz zzbz = (zzbz) zzd.zza(parcel3, zzbz.CREATOR);
                IBinder readStrongBinder45 = parcel3.readStrongBinder();
                IBinder iBinder45 = readStrongBinder45;
                if (readStrongBinder45 == null) {
                    zzdu34 = null;
                } else {
                    IInterface queryLocalInterface45 = iBinder45.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface45 = queryLocalInterface45;
                    if (queryLocalInterface45 instanceof zzdu) {
                        zzdu34 = (zzdu) iInterface45;
                    } else {
                        zzdu34 = zzdu33;
                        new zzdw(iBinder45);
                    }
                }
                zza(zzbz, zzdu34);
                break;
            case 119:
                zzbt zzbt = (zzbt) zzd.zza(parcel3, zzbt.CREATOR);
                IBinder readStrongBinder46 = parcel3.readStrongBinder();
                IBinder iBinder46 = readStrongBinder46;
                if (readStrongBinder46 == null) {
                    zzdu32 = null;
                } else {
                    IInterface queryLocalInterface46 = iBinder46.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface46 = queryLocalInterface46;
                    if (queryLocalInterface46 instanceof zzdu) {
                        zzdu32 = (zzdu) iInterface46;
                    } else {
                        zzdu32 = zzdu31;
                        new zzdw(iBinder46);
                    }
                }
                zza(zzbt, zzdu32);
                break;
            case 120:
                zzbn zzbn = (zzbn) zzd.zza(parcel3, zzbn.CREATOR);
                IBinder readStrongBinder47 = parcel3.readStrongBinder();
                IBinder iBinder47 = readStrongBinder47;
                if (readStrongBinder47 == null) {
                    zzdu30 = null;
                } else {
                    IInterface queryLocalInterface47 = iBinder47.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface47 = queryLocalInterface47;
                    if (queryLocalInterface47 instanceof zzdu) {
                        zzdu30 = (zzdu) iInterface47;
                    } else {
                        zzdu30 = zzdu29;
                        new zzdw(iBinder47);
                    }
                }
                zza(zzbn, zzdu30);
                break;
            case 121:
                zzbv zzbv = (zzbv) zzd.zza(parcel3, zzbv.CREATOR);
                IBinder readStrongBinder48 = parcel3.readStrongBinder();
                IBinder iBinder48 = readStrongBinder48;
                if (readStrongBinder48 == null) {
                    zzdu28 = null;
                } else {
                    IInterface queryLocalInterface48 = iBinder48.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface48 = queryLocalInterface48;
                    if (queryLocalInterface48 instanceof zzdu) {
                        zzdu28 = (zzdu) iInterface48;
                    } else {
                        zzdu28 = zzdu27;
                        new zzdw(iBinder48);
                    }
                }
                zza(zzbv, zzdu28);
                break;
            case 122:
                zzcv zzcv = (zzcv) zzd.zza(parcel3, zzcv.CREATOR);
                IBinder readStrongBinder49 = parcel3.readStrongBinder();
                IBinder iBinder49 = readStrongBinder49;
                if (readStrongBinder49 == null) {
                    zzdu26 = null;
                } else {
                    IInterface queryLocalInterface49 = iBinder49.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface49 = queryLocalInterface49;
                    if (queryLocalInterface49 instanceof zzdu) {
                        zzdu26 = (zzdu) iInterface49;
                    } else {
                        zzdu26 = zzdu25;
                        new zzdw(iBinder49);
                    }
                }
                zza(zzcv, zzdu26);
                break;
            case 123:
                zzdj zzdj = (zzdj) zzd.zza(parcel3, zzdj.CREATOR);
                IBinder readStrongBinder50 = parcel3.readStrongBinder();
                IBinder iBinder50 = readStrongBinder50;
                if (readStrongBinder50 == null) {
                    zzdu24 = null;
                } else {
                    IInterface queryLocalInterface50 = iBinder50.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface50 = queryLocalInterface50;
                    if (queryLocalInterface50 instanceof zzdu) {
                        zzdu24 = (zzdu) iInterface50;
                    } else {
                        zzdu24 = zzdu23;
                        new zzdw(iBinder50);
                    }
                }
                zza(zzdj, zzdu24);
                break;
            case 124:
                zzcn zzcn = (zzcn) zzd.zza(parcel3, zzcn.CREATOR);
                IBinder readStrongBinder51 = parcel3.readStrongBinder();
                IBinder iBinder51 = readStrongBinder51;
                if (readStrongBinder51 == null) {
                    zzdu22 = null;
                } else {
                    IInterface queryLocalInterface51 = iBinder51.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface51 = queryLocalInterface51;
                    if (queryLocalInterface51 instanceof zzdu) {
                        zzdu22 = (zzdu) iInterface51;
                    } else {
                        zzdu22 = zzdu21;
                        new zzdw(iBinder51);
                    }
                }
                zza(zzcn, zzdu22);
                break;
            case 126:
                zzcr zzcr = (zzcr) zzd.zza(parcel3, zzcr.CREATOR);
                IBinder readStrongBinder52 = parcel3.readStrongBinder();
                IBinder iBinder52 = readStrongBinder52;
                if (readStrongBinder52 == null) {
                    zzdu20 = null;
                } else {
                    IInterface queryLocalInterface52 = iBinder52.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface52 = queryLocalInterface52;
                    if (queryLocalInterface52 instanceof zzdu) {
                        zzdu20 = (zzdu) iInterface52;
                    } else {
                        zzdu20 = zzdu19;
                        new zzdw(iBinder52);
                    }
                }
                zza(zzcr, zzdu20);
                break;
            case 127:
                zzcx zzcx = (zzcx) zzd.zza(parcel3, zzcx.CREATOR);
                IBinder readStrongBinder53 = parcel3.readStrongBinder();
                IBinder iBinder53 = readStrongBinder53;
                if (readStrongBinder53 == null) {
                    zzdu18 = null;
                } else {
                    IInterface queryLocalInterface53 = iBinder53.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface53 = queryLocalInterface53;
                    if (queryLocalInterface53 instanceof zzdu) {
                        zzdu18 = (zzdu) iInterface53;
                    } else {
                        zzdu18 = zzdu17;
                        new zzdw(iBinder53);
                    }
                }
                zza(zzcx, zzdu18);
                break;
            case 128:
                zzct zzct = (zzct) zzd.zza(parcel3, zzct.CREATOR);
                IBinder readStrongBinder54 = parcel3.readStrongBinder();
                IBinder iBinder54 = readStrongBinder54;
                if (readStrongBinder54 == null) {
                    zzdu16 = null;
                } else {
                    IInterface queryLocalInterface54 = iBinder54.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface54 = queryLocalInterface54;
                    if (queryLocalInterface54 instanceof zzdu) {
                        zzdu16 = (zzdu) iInterface54;
                    } else {
                        zzdu16 = zzdu15;
                        new zzdw(iBinder54);
                    }
                }
                zza(zzct, zzdu16);
                break;
            case 129:
                zzdh zzdh = (zzdh) zzd.zza(parcel3, zzdh.CREATOR);
                IBinder readStrongBinder55 = parcel3.readStrongBinder();
                IBinder iBinder55 = readStrongBinder55;
                if (readStrongBinder55 == null) {
                    zzdu14 = null;
                } else {
                    IInterface queryLocalInterface55 = iBinder55.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface55 = queryLocalInterface55;
                    if (queryLocalInterface55 instanceof zzdu) {
                        zzdu14 = (zzdu) iInterface55;
                    } else {
                        zzdu14 = zzdu13;
                        new zzdw(iBinder55);
                    }
                }
                zza(zzdh, zzdu14);
                break;
            case 130:
                zzdl zzdl = (zzdl) zzd.zza(parcel3, zzdl.CREATOR);
                IBinder readStrongBinder56 = parcel3.readStrongBinder();
                IBinder iBinder56 = readStrongBinder56;
                if (readStrongBinder56 == null) {
                    zzdu12 = null;
                } else {
                    IInterface queryLocalInterface56 = iBinder56.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface56 = queryLocalInterface56;
                    if (queryLocalInterface56 instanceof zzdu) {
                        zzdu12 = (zzdu) iInterface56;
                    } else {
                        zzdu12 = zzdu11;
                        new zzdw(iBinder56);
                    }
                }
                zza(zzdl, zzdu12);
                break;
            case 131:
                zzdp zzdp = (zzdp) zzd.zza(parcel3, zzdp.CREATOR);
                IBinder readStrongBinder57 = parcel3.readStrongBinder();
                IBinder iBinder57 = readStrongBinder57;
                if (readStrongBinder57 == null) {
                    zzdu10 = null;
                } else {
                    IInterface queryLocalInterface57 = iBinder57.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface57 = queryLocalInterface57;
                    if (queryLocalInterface57 instanceof zzdu) {
                        zzdu10 = (zzdu) iInterface57;
                    } else {
                        zzdu10 = zzdu9;
                        new zzdw(iBinder57);
                    }
                }
                zza(zzdp, zzdu10);
                break;
            case 132:
                zzcb zzcb = (zzcb) zzd.zza(parcel3, zzcb.CREATOR);
                IBinder readStrongBinder58 = parcel3.readStrongBinder();
                IBinder iBinder58 = readStrongBinder58;
                if (readStrongBinder58 == null) {
                    zzdu8 = null;
                } else {
                    IInterface queryLocalInterface58 = iBinder58.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface58 = queryLocalInterface58;
                    if (queryLocalInterface58 instanceof zzdu) {
                        zzdu8 = (zzdu) iInterface58;
                    } else {
                        zzdu8 = zzdu7;
                        new zzdw(iBinder58);
                    }
                }
                zza(zzcb, zzdu8);
                break;
            case 133:
                zzdn zzdn = (zzdn) zzd.zza(parcel3, zzdn.CREATOR);
                IBinder readStrongBinder59 = parcel3.readStrongBinder();
                IBinder iBinder59 = readStrongBinder59;
                if (readStrongBinder59 == null) {
                    zzdu6 = null;
                } else {
                    IInterface queryLocalInterface59 = iBinder59.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface59 = queryLocalInterface59;
                    if (queryLocalInterface59 instanceof zzdu) {
                        zzdu6 = (zzdu) iInterface59;
                    } else {
                        zzdu6 = zzdu5;
                        new zzdw(iBinder59);
                    }
                }
                zza(zzdn, zzdu6);
                break;
            case 134:
                zzcd zzcd = (zzcd) zzd.zza(parcel3, zzcd.CREATOR);
                IBinder readStrongBinder60 = parcel3.readStrongBinder();
                IBinder iBinder60 = readStrongBinder60;
                if (readStrongBinder60 == null) {
                    zzdu4 = null;
                } else {
                    IInterface queryLocalInterface60 = iBinder60.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface60 = queryLocalInterface60;
                    if (queryLocalInterface60 instanceof zzdu) {
                        zzdu4 = (zzdu) iInterface60;
                    } else {
                        zzdu4 = zzdu3;
                        new zzdw(iBinder60);
                    }
                }
                zza(zzcd, zzdu4);
                break;
            case 135:
                zzdx zzdx = (zzdx) zzd.zza(parcel3, zzdx.CREATOR);
                IBinder readStrongBinder61 = parcel3.readStrongBinder();
                IBinder iBinder61 = readStrongBinder61;
                if (readStrongBinder61 == null) {
                    zzdu2 = null;
                } else {
                    IInterface queryLocalInterface61 = iBinder61.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    IInterface iInterface61 = queryLocalInterface61;
                    if (queryLocalInterface61 instanceof zzdu) {
                        zzdu2 = (zzdu) iInterface61;
                    } else {
                        zzdu2 = zzdu;
                        new zzdw(iBinder61);
                    }
                }
                zza(zzdx, zzdu2);
                break;
            default:
                return false;
        }
        parcel4.writeNoException();
        return true;
    }
}

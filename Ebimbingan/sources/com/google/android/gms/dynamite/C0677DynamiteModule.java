package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0595CrashUtils;
import com.google.android.gms.common.util.C0599DynamiteApi;
import com.google.android.gms.dynamic.C0661IObjectWrapper;
import com.google.android.gms.dynamic.C0663ObjectWrapper;
import com.microsoft.appcenter.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.dynamite.DynamiteModule */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0677DynamiteModule {
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION;
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING;
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION;
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final VersionPolicy PREFER_LOCAL;
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final VersionPolicy PREFER_REMOTE;
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING;
    @RecentlyNonNull
    public static final VersionPolicy zza;
    @GuardedBy("DynamiteModule.class")
    @Nullable
    private static Boolean zzb;
    @GuardedBy("DynamiteModule.class")
    @Nullable
    private static String zzc;
    @GuardedBy("DynamiteModule.class")
    private static int zzd = -1;
    private static final ThreadLocal<C0688zzk> zze;
    private static final ThreadLocal<Long> zzf;
    private static final C0690zzm zzg;
    @GuardedBy("DynamiteModule.class")
    @Nullable
    private static C0692zzo zzi;
    @GuardedBy("DynamiteModule.class")
    @Nullable
    private static C0693zzp zzj;
    private final Context zzh;

    @C0599DynamiteApi
    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        @RecentlyNullable
        public static ClassLoader sClassLoader;

        public DynamiteLoaderClassLoader() {
        }
    }

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$LoadingException */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class LoadingException extends Exception {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* synthetic */ LoadingException(String str, C0679zzb zzb) {
            super(str);
            C0679zzb zzb2 = zzb;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* synthetic */ LoadingException(String str, Throwable th, C0679zzb zzb) {
            super(str, th);
            C0679zzb zzb2 = zzb;
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$VersionPolicy */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface VersionPolicy {
        C0691zzn zza(Context context, String str, C0690zzm zzm) throws LoadingException;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r1 = -1
            zzd = r1
            java.lang.ThreadLocal r1 = new java.lang.ThreadLocal
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            zze = r1
            com.google.android.gms.dynamite.zzb r1 = new com.google.android.gms.dynamite.zzb
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            zzf = r1
            com.google.android.gms.dynamite.zzc r1 = new com.google.android.gms.dynamite.zzc
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            zzg = r1
            com.google.android.gms.dynamite.zzd r1 = new com.google.android.gms.dynamite.zzd
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            PREFER_REMOTE = r1
            com.google.android.gms.dynamite.zze r1 = new com.google.android.gms.dynamite.zze
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            PREFER_LOCAL = r1
            com.google.android.gms.dynamite.zzf r1 = new com.google.android.gms.dynamite.zzf
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            PREFER_REMOTE_VERSION_NO_FORCE_STAGING = r1
            com.google.android.gms.dynamite.zzg r1 = new com.google.android.gms.dynamite.zzg
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            PREFER_HIGHEST_OR_LOCAL_VERSION = r1
            com.google.android.gms.dynamite.zzh r1 = new com.google.android.gms.dynamite.zzh
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = r1
            com.google.android.gms.dynamite.zzi r1 = new com.google.android.gms.dynamite.zzi
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            PREFER_HIGHEST_OR_REMOTE_VERSION = r1
            com.google.android.gms.dynamite.zzj r1 = new com.google.android.gms.dynamite.zzj
            r0 = r1
            r1 = r0
            r1.<init>()
            r1 = r0
            zza = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.C0677DynamiteModule.<clinit>():void");
    }

    private C0677DynamiteModule(Context context) {
        Context context2 = context;
        Object checkNotNull = C0446Preconditions.checkNotNull(context2);
        this.zzh = context2;
    }

    @C0206KeepForSdk
    public static int getLocalVersion(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        String str2;
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        String str3 = str;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            new StringBuilder(String.valueOf(str3).length() + 61);
            StringBuilder append = sb2.append("com.google.android.gms.dynamite.descriptors.");
            StringBuilder append2 = sb2.append(str3);
            StringBuilder append3 = sb2.append(".");
            StringBuilder append4 = sb2.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C0444Objects.equal(declaredField.get((Object) null), str3)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str3).length());
            StringBuilder append5 = sb3.append("Module descriptor id '");
            StringBuilder append6 = sb3.append(valueOf);
            StringBuilder append7 = sb3.append("' didn't match expected id '");
            StringBuilder append8 = sb3.append(str3);
            StringBuilder append9 = sb3.append("'");
            int e = Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException e2) {
            new StringBuilder(String.valueOf(str3).length() + 45);
            StringBuilder append10 = sb.append("Local module descriptor class for ");
            StringBuilder append11 = sb.append(str3);
            StringBuilder append12 = sb.append(" not found.");
            int w = Log.w("DynamiteModule", sb.toString());
            return 0;
        } catch (Exception e3) {
            String valueOf2 = String.valueOf(e3.getMessage());
            String str4 = "Failed to load module descriptor class: ";
            if (valueOf2.length() != 0) {
                str2 = str4.concat(valueOf2);
            } else {
                new String(str4);
            }
            int e4 = Log.e("DynamiteModule", str2);
            return 0;
        }
    }

    @C0206KeepForSdk
    public static int getRemoteVersion(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return zza(context, str, false);
    }

    /* JADX INFO: finally extract failed */
    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0677DynamiteModule load(@RecentlyNonNull Context context, @RecentlyNonNull VersionPolicy versionPolicy, @RecentlyNonNull String str) throws LoadingException {
        C0688zzk zzk;
        StringBuilder sb;
        Throwable th;
        StringBuilder sb2;
        Throwable th2;
        StringBuilder sb3;
        String str2;
        String str3;
        Throwable th3;
        C0690zzm zzm;
        Class<C0677DynamiteModule> cls;
        Throwable th4;
        Throwable th5;
        Throwable th6;
        Boolean bool;
        StringBuilder sb4;
        C0661IObjectWrapper zze2;
        C0677DynamiteModule dynamiteModule;
        C0677DynamiteModule dynamiteModule2;
        Throwable th7;
        Throwable th8;
        Throwable th9;
        StringBuilder sb5;
        Class<C0677DynamiteModule> cls2;
        Throwable th10;
        C0693zzp zzp;
        Throwable th11;
        Class<C0677DynamiteModule> cls3;
        Throwable th12;
        boolean z;
        Boolean valueOf;
        C0661IObjectWrapper zze3;
        C0677DynamiteModule dynamiteModule3;
        Throwable th13;
        Throwable th14;
        Throwable th15;
        Context context2 = context;
        VersionPolicy versionPolicy2 = versionPolicy;
        String str4 = str;
        C0688zzk zzk2 = zze.get();
        new C0688zzk((C0679zzb) null);
        zze.set(zzk);
        long longValue = zzf.get().longValue();
        try {
            zzf.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C0691zzn zza2 = versionPolicy2.zza(context2, str4, zzg);
            int i = zza2.zza;
            int i2 = zza2.zzb;
            new StringBuilder(String.valueOf(str4).length() + 68 + String.valueOf(str4).length());
            StringBuilder append = sb.append("Considering local module ");
            StringBuilder append2 = sb.append(str4);
            StringBuilder append3 = sb.append(Constants.COMMON_SCHEMA_PREFIX_SEPARATOR);
            StringBuilder append4 = sb.append(i);
            StringBuilder append5 = sb.append(" and remote module ");
            StringBuilder append6 = sb.append(str4);
            StringBuilder append7 = sb.append(Constants.COMMON_SCHEMA_PREFIX_SEPARATOR);
            StringBuilder append8 = sb.append(i2);
            int i3 = Log.i("DynamiteModule", sb.toString());
            int i4 = zza2.zzc;
            if (i4 == 0 || ((i4 == -1 && zza2.zza == 0) || (i4 == 1 && zza2.zzb == 0))) {
                int i5 = zza2.zza;
                int i6 = zza2.zzb;
                new StringBuilder(91);
                StringBuilder append9 = sb2.append("No acceptable module found. Local version is ");
                StringBuilder append10 = sb2.append(i5);
                StringBuilder append11 = sb2.append(" and remote version is ");
                StringBuilder append12 = sb2.append(i6);
                StringBuilder append13 = sb2.append(".");
                new LoadingException(sb2.toString(), (C0679zzb) null);
                throw th;
            } else if (i4 == -1) {
                C0677DynamiteModule zzd2 = zzd(context2, str4);
                if (longValue == 0) {
                    zzf.remove();
                } else {
                    zzf.set(Long.valueOf(longValue));
                }
                Cursor cursor = zzk.zza;
                if (cursor != null) {
                    cursor.close();
                }
                zze.set(zzk2);
                return zzd2;
            } else if (i4 == 1) {
                try {
                    int i7 = zza2.zzb;
                    cls = C0677DynamiteModule.class;
                    synchronized (cls) {
                        bool = zzb;
                    }
                    if (bool == null) {
                        new LoadingException("Failed to determine which loading route to use.", (C0679zzb) null);
                        throw th15;
                    }
                    if (bool.booleanValue()) {
                        new StringBuilder(String.valueOf(str4).length() + 51);
                        StringBuilder append14 = sb5.append("Selected remote version of ");
                        StringBuilder append15 = sb5.append(str4);
                        StringBuilder append16 = sb5.append(", version >= ");
                        StringBuilder append17 = sb5.append(i7);
                        int i8 = Log.i("DynamiteModule", sb5.toString());
                        cls2 = C0677DynamiteModule.class;
                        synchronized (cls2) {
                            zzp = zzj;
                        }
                        if (zzp == null) {
                            new LoadingException("DynamiteLoaderV2 was not cached.", (C0679zzb) null);
                            throw th14;
                        }
                        C0688zzk zzk3 = zze.get();
                        if (zzk3 == null || zzk3.zza == null) {
                            new LoadingException("No result cursor", (C0679zzb) null);
                            throw th11;
                        }
                        Context applicationContext = context2.getApplicationContext();
                        Cursor cursor2 = zzk3.zza;
                        C0661IObjectWrapper wrap = C0663ObjectWrapper.wrap(null);
                        cls3 = C0677DynamiteModule.class;
                        synchronized (cls3) {
                            if (zzd >= 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            valueOf = Boolean.valueOf(z);
                        }
                        if (valueOf.booleanValue()) {
                            int v = Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                            zze3 = zzp.zzf(C0663ObjectWrapper.wrap(applicationContext), str4, i7, C0663ObjectWrapper.wrap(cursor2));
                        } else {
                            int w = Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                            zze3 = zzp.zze(C0663ObjectWrapper.wrap(applicationContext), str4, i7, C0663ObjectWrapper.wrap(cursor2));
                        }
                        Context context3 = (Context) C0663ObjectWrapper.unwrap(zze3);
                        if (context3 == null) {
                            new LoadingException("Failed to get module context", (C0679zzb) null);
                            throw th13;
                        }
                        new C0677DynamiteModule(context3);
                        dynamiteModule2 = dynamiteModule3;
                    } else {
                        new StringBuilder(String.valueOf(str4).length() + 51);
                        StringBuilder append18 = sb4.append("Selected remote version of ");
                        StringBuilder append19 = sb4.append(str4);
                        StringBuilder append20 = sb4.append(", version >= ");
                        StringBuilder append21 = sb4.append(i7);
                        int i9 = Log.i("DynamiteModule", sb4.toString());
                        C0692zzo zzf2 = zzf(context2);
                        if (zzf2 == null) {
                            new LoadingException("Failed to create IDynamiteLoader.", (C0679zzb) null);
                            throw th9;
                        }
                        int zzi2 = zzf2.zzi();
                        if (zzi2 >= 3) {
                            C0688zzk zzk4 = zze.get();
                            if (zzk4 == null) {
                                new LoadingException("No cached result cursor holder", (C0679zzb) null);
                                throw th8;
                            }
                            zze2 = zzf2.zzk(C0663ObjectWrapper.wrap(context2), str4, i7, C0663ObjectWrapper.wrap(zzk4.zza));
                        } else if (zzi2 == 2) {
                            int w2 = Log.w("DynamiteModule", "IDynamite loader version = 2");
                            zze2 = zzf2.zzg(C0663ObjectWrapper.wrap(context2), str4, i7);
                        } else {
                            int w3 = Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            zze2 = zzf2.zze(C0663ObjectWrapper.wrap(context2), str4, i7);
                        }
                        if (C0663ObjectWrapper.unwrap(zze2) == null) {
                            new LoadingException("Failed to load remote module.", (C0679zzb) null);
                            throw th7;
                        }
                        new C0677DynamiteModule((Context) C0663ObjectWrapper.unwrap(zze2));
                        dynamiteModule2 = dynamiteModule;
                    }
                    if (longValue == 0) {
                        zzf.remove();
                    } else {
                        zzf.set(Long.valueOf(longValue));
                    }
                    Cursor cursor3 = zzk.zza;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    zze.set(zzk2);
                    return dynamiteModule2;
                } catch (RemoteException e) {
                    new LoadingException("Failed to load remote module.", e, (C0679zzb) null);
                    throw th5;
                } catch (LoadingException e2) {
                    throw e2;
                } catch (LoadingException e3) {
                    LoadingException loadingException = e3;
                    String str5 = "DynamiteModule";
                    String str6 = "Failed to load remote module: ";
                    String valueOf2 = String.valueOf(loadingException.getMessage());
                    if (valueOf2.length() != 0) {
                        str3 = str6.concat(valueOf2);
                    } else {
                        new String(str6);
                        str3 = str2;
                    }
                    int w4 = Log.w(str5, str3);
                    int i10 = zza2.zza;
                    if (i10 != 0) {
                        new C0689zzl(i10, 0);
                        if (versionPolicy2.zza(context2, str4, zzm).zzc == -1) {
                            C0677DynamiteModule zzd3 = zzd(context2, str4);
                            if (longValue == 0) {
                                zzf.remove();
                            } else {
                                zzf.set(Long.valueOf(longValue));
                            }
                            Cursor cursor4 = zzk.zza;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            zze.set(zzk2);
                            return zzd3;
                        }
                    }
                    new LoadingException("Remote load failed. No local fallback found.", loadingException, (C0679zzb) null);
                    throw th3;
                } catch (Throwable th16) {
                    Throwable th17 = th16;
                    boolean addDynamiteErrorToDropBox = C0595CrashUtils.addDynamiteErrorToDropBox(context2, th17);
                    new LoadingException("Failed to load remote module.", th17, (C0679zzb) null);
                    throw th4;
                }
            } else {
                new StringBuilder(47);
                StringBuilder append22 = sb3.append("VersionPolicy returned invalid code:");
                StringBuilder append23 = sb3.append(0);
                new LoadingException(sb3.toString(), (C0679zzb) null);
                throw th2;
            }
        } catch (Throwable th18) {
            Throwable th19 = th18;
            if (longValue == 0) {
                zzf.remove();
            } else {
                zzf.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = zzk.zza;
            if (cursor5 != null) {
                cursor5.close();
            }
            zze.set(zzk2);
            throw th19;
        }
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static int zza(@androidx.annotation.RecentlyNonNull android.content.Context r16, @androidx.annotation.RecentlyNonNull java.lang.String r17, boolean r18) {
        /*
            r1 = r16
            r2 = r17
            r3 = r18
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.C0677DynamiteModule.class
            r5 = r10
            r10 = r5
            monitor-enter(r10)     // Catch:{ all -> 0x01b1 }
            java.lang.Boolean r10 = zzb     // Catch:{ all -> 0x01bb }
            r4 = r10
            r10 = r4
            if (r10 != 0) goto L_0x0051
            r10 = r1
            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x01c1, IllegalAccessException -> 0x0204, NoSuchFieldException -> 0x02ad }
            java.lang.ClassLoader r10 = r10.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x01c1, IllegalAccessException -> 0x0204, NoSuchFieldException -> 0x02ad }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r11 = com.google.android.gms.dynamite.C0677DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r11 = r11.getName()     // Catch:{ ClassNotFoundException -> 0x01c1, IllegalAccessException -> 0x0204, NoSuchFieldException -> 0x02ad }
            java.lang.Class r10 = r10.loadClass(r11)     // Catch:{ ClassNotFoundException -> 0x01c1, IllegalAccessException -> 0x0204, NoSuchFieldException -> 0x02ad }
            java.lang.String r11 = "sClassLoader"
            java.lang.reflect.Field r10 = r10.getDeclaredField(r11)     // Catch:{ ClassNotFoundException -> 0x01c1, IllegalAccessException -> 0x0204, NoSuchFieldException -> 0x02ad }
            r6 = r10
            r10 = r6
            java.lang.Class r10 = r10.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x01c1, IllegalAccessException -> 0x0204, NoSuchFieldException -> 0x02ad }
            r7 = r10
            r10 = r7
            monitor-enter(r10)     // Catch:{ ClassNotFoundException -> 0x01c1, IllegalAccessException -> 0x0204, NoSuchFieldException -> 0x02ad }
            r10 = r6
            r11 = 0
            java.lang.Object r10 = r10.get(r11)     // Catch:{ all -> 0x01fe }
            java.lang.ClassLoader r10 = (java.lang.ClassLoader) r10     // Catch:{ all -> 0x01fe }
            r4 = r10
            r10 = r4
            if (r10 == 0) goto L_0x0128
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x01fe }
            r6 = r10
            r10 = r4
            r11 = r6
            if (r10 != r11) goto L_0x011f
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01fe }
            r4 = r10
        L_0x004c:
            r10 = r7
            monitor-exit(r10)     // Catch:{ all -> 0x01fe }
        L_0x004e:
            r10 = r4
            zzb = r10     // Catch:{ all -> 0x01bb }
        L_0x0051:
            r10 = r5
            monitor-exit(r10)     // Catch:{ all -> 0x01bb }
            r10 = r4
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x01b1 }
            r4 = r10
            r10 = r4
            if (r10 == 0) goto L_0x0067
            r10 = r1
            r11 = r2
            r12 = r3
            int r10 = zzb(r10, r11, r12)     // Catch:{ LoadingException -> 0x0206 }
            r2 = r10
            r10 = r2
            r1 = r10
        L_0x0066:
            return r1
        L_0x0067:
            r10 = r1
            com.google.android.gms.dynamite.zzo r10 = zzf(r10)     // Catch:{ all -> 0x01b1 }
            r4 = r10
            r10 = r4
            if (r10 != 0) goto L_0x0075
            r10 = 0
            r2 = r10
        L_0x0072:
            r10 = r2
            r1 = r10
            goto L_0x0066
        L_0x0075:
            r10 = r4
            int r10 = r10.zzi()     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            r5 = r10
            r10 = r5
            r11 = 3
            if (r10 < r11) goto L_0x00e9
            r10 = r4
            r11 = r1
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.C0663ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            r12 = r2
            r13 = r3
            java.lang.ThreadLocal<java.lang.Long> r14 = zzf     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            java.lang.Object r14 = r14.get()     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            long r14 = r14.longValue()     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            com.google.android.gms.dynamic.IObjectWrapper r10 = r10.zzj(r11, r12, r13, r14)     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            java.lang.Object r10 = com.google.android.gms.dynamic.C0663ObjectWrapper.unwrap(r10)     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            r3 = r10
            r10 = r3
            if (r10 == 0) goto L_0x00aa
            r10 = r3
            boolean r10 = r10.moveToFirst()     // Catch:{ RemoteException -> 0x0278, all -> 0x027b }
            r2 = r10
            r10 = r2
            if (r10 != 0) goto L_0x00c1
        L_0x00aa:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = "Failed to retrieve remote module version."
            int r10 = android.util.Log.w(r10, r11)     // Catch:{ RemoteException -> 0x0278, all -> 0x027b }
            r10 = r3
            if (r10 == 0) goto L_0x00be
            r10 = r3
            r10.close()     // Catch:{ all -> 0x01b1 }
            r10 = 0
            r2 = r10
            goto L_0x0072
        L_0x00be:
            r10 = 0
            r2 = r10
            goto L_0x0072
        L_0x00c1:
            r10 = r3
            r11 = 0
            int r10 = r10.getInt(r11)     // Catch:{ RemoteException -> 0x0278, all -> 0x027b }
            r4 = r10
            r10 = r4
            if (r10 <= 0) goto L_0x00e6
            r10 = r3
            boolean r10 = zzc(r10)     // Catch:{ RemoteException -> 0x0278, all -> 0x027b }
            r2 = r10
            r10 = r2
            if (r10 == 0) goto L_0x00e3
            r10 = 0
            r2 = r10
        L_0x00d6:
            r10 = r2
            if (r10 == 0) goto L_0x00e0
            r10 = r2
            r10.close()     // Catch:{ all -> 0x01b1 }
            r10 = r4
            r2 = r10
            goto L_0x0072
        L_0x00e0:
            r10 = r4
            r2 = r10
            goto L_0x0072
        L_0x00e3:
            r10 = r3
            r2 = r10
            goto L_0x00d6
        L_0x00e6:
            r10 = r3
            r2 = r10
            goto L_0x00d6
        L_0x00e9:
            r10 = r5
            r11 = 2
            if (r10 != r11) goto L_0x0106
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = "IDynamite loader version = 2, no high precision latency measurement."
            int r10 = android.util.Log.w(r10, r11)     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            r10 = r4
            r11 = r1
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.C0663ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            r12 = r2
            r13 = r3
            int r10 = r10.zzh(r11, r12, r13)     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            r2 = r10
            goto L_0x0072
        L_0x0106:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            int r10 = android.util.Log.w(r10, r11)     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            r10 = r4
            r11 = r1
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.C0663ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            r12 = r2
            r13 = r3
            int r10 = r10.zzf(r11, r12, r13)     // Catch:{ RemoteException -> 0x0234, all -> 0x026b }
            r2 = r10
            goto L_0x0072
        L_0x011f:
            r10 = r4
            zze(r10)     // Catch:{ LoadingException -> 0x0280 }
        L_0x0123:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x01fe }
            r4 = r10
            goto L_0x004c
        L_0x0128:
            java.lang.String r10 = "com.google.android.gms"
            r11 = r1
            android.content.Context r11 = r11.getApplicationContext()     // Catch:{ all -> 0x01fe }
            java.lang.String r11 = r11.getPackageName()     // Catch:{ all -> 0x01fe }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x01fe }
            r4 = r10
            r10 = r4
            if (r10 == 0) goto L_0x014a
            r10 = r6
            r11 = 0
            java.lang.ClassLoader r12 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x01fe }
            r10.set(r11, r12)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01fe }
            r4 = r10
            goto L_0x004c
        L_0x014a:
            r10 = r1
            r11 = r2
            r12 = r3
            int r10 = zzb(r10, r11, r12)     // Catch:{ LoadingException -> 0x0283 }
            r8 = r10
            java.lang.String r10 = zzc     // Catch:{ LoadingException -> 0x0283 }
            r4 = r10
            r10 = r4
            if (r10 == 0) goto L_0x0162
            java.lang.String r10 = zzc     // Catch:{ LoadingException -> 0x0283 }
            boolean r10 = r10.isEmpty()     // Catch:{ LoadingException -> 0x0283 }
            r4 = r10
            r10 = r4
            if (r10 == 0) goto L_0x016a
        L_0x0162:
            r10 = r7
            monitor-exit(r10)     // Catch:{ all -> 0x01fe }
            r10 = r5
            monitor-exit(r10)     // Catch:{ all -> 0x01bb }
            r10 = r8
            r1 = r10
            goto L_0x0066
        L_0x016a:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x0283 }
            r4 = r10
            r10 = r4
            r11 = 29
            if (r10 < r11) goto L_0x019c
            dalvik.system.DelegateLastClassLoader r10 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x0283 }
            r4 = r10
            java.lang.String r10 = zzc     // Catch:{ LoadingException -> 0x0283 }
            r9 = r10
            r10 = r9
            java.lang.Object r10 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r10)     // Catch:{ LoadingException -> 0x0283 }
            r10 = r4
            r11 = r9
            java.lang.ClassLoader r12 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0283 }
            r10.<init>(r11, r12)     // Catch:{ LoadingException -> 0x0283 }
        L_0x0186:
            r10 = r4
            zze(r10)     // Catch:{ LoadingException -> 0x0283 }
            r10 = r6
            r11 = 0
            r12 = r4
            r10.set(r11, r12)     // Catch:{ LoadingException -> 0x0283 }
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x0283 }
            zzb = r10     // Catch:{ LoadingException -> 0x0283 }
            r10 = r7
            monitor-exit(r10)     // Catch:{ all -> 0x01fe }
            r10 = r5
            monitor-exit(r10)     // Catch:{ all -> 0x01bb }
            r10 = r8
            r1 = r10
            goto L_0x0066
        L_0x019c:
            com.google.android.gms.dynamite.zza r10 = new com.google.android.gms.dynamite.zza     // Catch:{ LoadingException -> 0x0283 }
            r4 = r10
            java.lang.String r10 = zzc     // Catch:{ LoadingException -> 0x0283 }
            r9 = r10
            r10 = r9
            java.lang.Object r10 = com.google.android.gms.common.internal.C0446Preconditions.checkNotNull(r10)     // Catch:{ LoadingException -> 0x0283 }
            r10 = r4
            r11 = r9
            java.lang.ClassLoader r12 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0283 }
            r10.<init>(r11, r12)     // Catch:{ LoadingException -> 0x0283 }
            goto L_0x0186
        L_0x01b1:
            r10 = move-exception
            r2 = r10
            r10 = r1
            r11 = r2
            boolean r10 = com.google.android.gms.common.util.C0595CrashUtils.addDynamiteErrorToDropBox(r10, r11)
            r10 = r2
            throw r10
        L_0x01bb:
            r10 = move-exception
            r2 = r10
            r10 = r5
            monitor-exit(r10)     // Catch:{ all -> 0x01bb }
            r10 = r2
            throw r10     // Catch:{ all -> 0x01b1 }
        L_0x01c1:
            r10 = move-exception
        L_0x01c2:
            r4 = r10
            java.lang.String r10 = "DynamiteModule"
            r6 = r10
            r10 = r4
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01bb }
            r4 = r10
            r10 = r4
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01bb }
            int r10 = r10.length()     // Catch:{ all -> 0x01bb }
            r7 = r10
            int r7 = r7 + 30
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bb }
            r8 = r10
            r10 = r8
            r11 = r7
            r10.<init>(r11)     // Catch:{ all -> 0x01bb }
            r10 = r8
            java.lang.String r11 = "Failed to load module via V2: "
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch:{ all -> 0x01bb }
            r10 = r8
            r11 = r4
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch:{ all -> 0x01bb }
            r10 = r6
            r11 = r8
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x01bb }
            int r10 = android.util.Log.w(r10, r11)     // Catch:{ all -> 0x01bb }
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01bb }
            r4 = r10
            goto L_0x004e
        L_0x01fe:
            r10 = move-exception
            r4 = r10
            r10 = r7
            monitor-exit(r10)     // Catch:{ all -> 0x01fe }
            r10 = r4
            throw r10     // Catch:{ ClassNotFoundException -> 0x01c1, IllegalAccessException -> 0x0204, NoSuchFieldException -> 0x02ad }
        L_0x0204:
            r10 = move-exception
            goto L_0x01c2
        L_0x0206:
            r10 = move-exception
            r2 = r10
            java.lang.String r10 = "DynamiteModule"
            r3 = r10
            java.lang.String r10 = "Failed to retrieve remote module version: "
            r4 = r10
            r10 = r2
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x01b1 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01b1 }
            r2 = r10
            r10 = r2
            int r10 = r10.length()     // Catch:{ all -> 0x01b1 }
            r5 = r10
            r10 = r5
            if (r10 == 0) goto L_0x0292
            r10 = r4
            r11 = r2
            java.lang.String r10 = r10.concat(r11)     // Catch:{ all -> 0x01b1 }
            r2 = r10
        L_0x022a:
            r10 = r3
            r11 = r2
            int r10 = android.util.Log.w(r10, r11)     // Catch:{ all -> 0x01b1 }
            r10 = 0
            r1 = r10
            goto L_0x0066
        L_0x0234:
            r10 = move-exception
            r2 = r10
            r10 = 0
            r3 = r10
        L_0x0238:
            java.lang.String r10 = "DynamiteModule"
            r4 = r10
            java.lang.String r10 = "Failed to retrieve remote module version: "
            r5 = r10
            r10 = r2
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x029b }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x029b }
            r2 = r10
            r10 = r2
            int r10 = r10.length()     // Catch:{ all -> 0x029b }
            r6 = r10
            r10 = r6
            if (r10 == 0) goto L_0x02a0
            r10 = r5
            r11 = r2
            java.lang.String r10 = r10.concat(r11)     // Catch:{ all -> 0x029b }
            r2 = r10
        L_0x025a:
            r10 = r4
            r11 = r2
            int r10 = android.util.Log.w(r10, r11)     // Catch:{ all -> 0x029b }
            r10 = r3
            if (r10 == 0) goto L_0x02a9
            r10 = r3
            r10.close()     // Catch:{ all -> 0x01b1 }
            r10 = 0
            r2 = r10
            goto L_0x0072
        L_0x026b:
            r10 = move-exception
            r2 = r10
            r10 = 0
            r4 = r10
        L_0x026f:
            r10 = r4
            if (r10 == 0) goto L_0x0276
            r10 = r4
            r10.close()     // Catch:{ all -> 0x01b1 }
        L_0x0276:
            r10 = r2
            throw r10     // Catch:{ all -> 0x01b1 }
        L_0x0278:
            r10 = move-exception
            r2 = r10
            goto L_0x0238
        L_0x027b:
            r10 = move-exception
            r2 = r10
            r10 = r3
            r4 = r10
            goto L_0x026f
        L_0x0280:
            r10 = move-exception
            goto L_0x0123
        L_0x0283:
            r10 = move-exception
            r10 = r6
            r11 = 0
            java.lang.ClassLoader r12 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x01fe }
            r10.set(r11, r12)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01fe }
            r4 = r10
            goto L_0x004c
        L_0x0292:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x01b1 }
            r2 = r10
            r10 = r2
            r11 = r4
            r10.<init>(r11)     // Catch:{ all -> 0x01b1 }
            goto L_0x022a
        L_0x029b:
            r10 = move-exception
            r2 = r10
            r10 = r3
            r4 = r10
            goto L_0x026f
        L_0x02a0:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x029b }
            r2 = r10
            r10 = r2
            r11 = r5
            r10.<init>(r11)     // Catch:{ all -> 0x029b }
            goto L_0x025a
        L_0x02a9:
            r10 = 0
            r2 = r10
            goto L_0x0072
        L_0x02ad:
            r10 = move-exception
            goto L_0x01c2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.C0677DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(android.content.Context r14, java.lang.String r15, boolean r16) throws com.google.android.gms.dynamite.C0677DynamiteModule.LoadingException {
        /*
            r1 = r14
            r2 = r15
            r3 = r16
            java.lang.ThreadLocal<java.lang.Long> r8 = zzf     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            java.lang.Object r8 = r8.get()     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            long r8 = r8.longValue()     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            r4 = r8
            r8 = r1
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            r6 = r8
            java.lang.String r8 = "api_force_staging"
            r1 = r8
            java.lang.String r8 = "api"
            r7 = r8
            r8 = 1
            r9 = r3
            if (r8 == r9) goto L_0x0025
            r8 = r7
            r1 = r8
        L_0x0025:
            android.net.Uri$Builder r8 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            r3 = r8
            r8 = r3
            r8.<init>()     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            r8 = r6
            r9 = r3
            java.lang.String r10 = "content"
            android.net.Uri$Builder r9 = r9.scheme(r10)     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            java.lang.String r10 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r9 = r9.authority(r10)     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            r10 = r1
            android.net.Uri$Builder r9 = r9.path(r10)     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            r10 = r2
            android.net.Uri$Builder r9 = r9.appendPath(r10)     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            java.lang.String r10 = "requestStartTime"
            r11 = r4
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r10, r11)     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            android.net.Uri r9 = r9.build()     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            android.database.Cursor r8 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00e2, all -> 0x00e7 }
            r2 = r8
            r8 = r2
            if (r8 == 0) goto L_0x006b
            r8 = r2
            boolean r8 = r8.moveToFirst()     // Catch:{ Exception -> 0x0082, all -> 0x00ec }
            r1 = r8
            r8 = r1
            if (r8 != 0) goto L_0x009a
        L_0x006b:
            java.lang.String r8 = "DynamiteModule"
            java.lang.String r9 = "Failed to retrieve remote module version."
            int r8 = android.util.Log.w(r8, r9)     // Catch:{ Exception -> 0x0082, all -> 0x00ec }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r8 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x0082, all -> 0x00ec }
            r1 = r8
            r8 = r1
            java.lang.String r9 = "Failed to connect to dynamite module ContentResolver."
            r10 = 0
            r8.<init>(r9, r10)     // Catch:{ Exception -> 0x0082, all -> 0x00ec }
            r8 = r1
            throw r8     // Catch:{ Exception -> 0x0082, all -> 0x00ec }
        L_0x0082:
            r8 = move-exception
            r1 = r8
        L_0x0084:
            r8 = r1
            boolean r8 = r8 instanceof com.google.android.gms.dynamite.C0677DynamiteModule.LoadingException     // Catch:{ all -> 0x008d }
            r3 = r8
            r8 = r3
            if (r8 == 0) goto L_0x00f7
            r8 = r1
            throw r8     // Catch:{ all -> 0x008d }
        L_0x008d:
            r8 = move-exception
            r1 = r8
            r8 = r2
            r3 = r8
        L_0x0091:
            r8 = r3
            if (r8 == 0) goto L_0x0098
            r8 = r3
            r8.close()
        L_0x0098:
            r8 = r1
            throw r8
        L_0x009a:
            r8 = r2
            r9 = 0
            int r8 = r8.getInt(r9)     // Catch:{ Exception -> 0x0082, all -> 0x00ec }
            r3 = r8
            r8 = r3
            if (r8 <= 0) goto L_0x00df
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r8 = com.google.android.gms.dynamite.C0677DynamiteModule.class
            r1 = r8
            r8 = r1
            monitor-enter(r8)     // Catch:{ Exception -> 0x0082, all -> 0x00ec }
            r8 = r2
            r9 = 2
            java.lang.String r8 = r8.getString(r9)     // Catch:{ all -> 0x00f1 }
            zzc = r8     // Catch:{ all -> 0x00f1 }
            r8 = r2
            java.lang.String r9 = "loaderVersion"
            int r8 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x00f1 }
            r6 = r8
            r8 = r6
            if (r8 < 0) goto L_0x00c5
            r8 = r2
            r9 = r6
            int r8 = r8.getInt(r9)     // Catch:{ all -> 0x00f1 }
            zzd = r8     // Catch:{ all -> 0x00f1 }
        L_0x00c5:
            r8 = r1
            monitor-exit(r8)     // Catch:{ all -> 0x00f1 }
            r8 = r2
            boolean r8 = zzc(r8)     // Catch:{ Exception -> 0x0082, all -> 0x00ec }
            r1 = r8
            r8 = r1
            if (r8 == 0) goto L_0x00dc
            r8 = 0
            r1 = r8
        L_0x00d2:
            r8 = r1
            if (r8 == 0) goto L_0x00d9
            r8 = r1
            r8.close()
        L_0x00d9:
            r8 = r3
            r1 = r8
            return r1
        L_0x00dc:
            r8 = r2
            r1 = r8
            goto L_0x00d2
        L_0x00df:
            r8 = r2
            r1 = r8
            goto L_0x00d2
        L_0x00e2:
            r8 = move-exception
            r1 = r8
            r8 = 0
            r2 = r8
            goto L_0x0084
        L_0x00e7:
            r8 = move-exception
            r1 = r8
            r8 = 0
            r3 = r8
            goto L_0x0091
        L_0x00ec:
            r8 = move-exception
            r1 = r8
            r8 = r2
            r3 = r8
            goto L_0x0091
        L_0x00f1:
            r8 = move-exception
            r3 = r8
            r8 = r1
            monitor-exit(r8)     // Catch:{ all -> 0x00f1 }
            r8 = r3
            throw r8     // Catch:{ Exception -> 0x0082, all -> 0x00ec }
        L_0x00f7:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r8 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x008d }
            r3 = r8
            r8 = r3
            java.lang.String r9 = "V2 version check failed"
            r10 = r1
            r11 = 0
            r8.<init>(r9, r10, r11)     // Catch:{ all -> 0x008d }
            r8 = r3
            throw r8     // Catch:{ all -> 0x008d }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.C0677DynamiteModule.zzb(android.content.Context, java.lang.String, boolean):int");
    }

    private static boolean zzc(Cursor cursor) {
        Cursor cursor2 = cursor;
        C0688zzk zzk = zze.get();
        if (zzk == null || zzk.zza != null) {
            return false;
        }
        zzk.zza = cursor2;
        return true;
    }

    private static C0677DynamiteModule zzd(Context context, String str) {
        String str2;
        C0677DynamiteModule dynamiteModule;
        Context context2 = context;
        String valueOf = String.valueOf(str);
        String str3 = "Selected local version of ";
        if (valueOf.length() != 0) {
            str2 = str3.concat(valueOf);
        } else {
            new String(str3);
        }
        int i = Log.i("DynamiteModule", str2);
        new C0677DynamiteModule(context2.getApplicationContext());
        return dynamiteModule;
    }

    @GuardedBy("DynamiteModule.class")
    private static void zze(ClassLoader classLoader) throws LoadingException {
        Throwable th;
        C0693zzp zzp;
        C0693zzp zzp2;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzp2 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C0693zzp) {
                    zzp2 = (C0693zzp) queryLocalInterface;
                } else {
                    new C0693zzp(iBinder);
                    zzp2 = zzp;
                }
            }
            zzj = zzp2;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            new LoadingException("Failed to instantiate dynamite loader", e, (C0679zzb) null);
            throw th;
        }
    }

    @Nullable
    private static C0692zzo zzf(Context context) {
        String str;
        C0692zzo zzo;
        C0692zzo zzo2;
        Context context2 = context;
        Class<C0677DynamiteModule> cls = C0677DynamiteModule.class;
        synchronized (cls) {
            try {
                if (zzi != null) {
                    C0692zzo zzo3 = zzi;
                    return zzo3;
                }
                IBinder iBinder = (IBinder) context2.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzo2 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof C0692zzo) {
                        zzo2 = (C0692zzo) queryLocalInterface;
                    } else {
                        new C0692zzo(iBinder);
                        zzo2 = zzo;
                    }
                }
                if (zzo2 != null) {
                    zzi = zzo2;
                    return zzo2;
                }
                return null;
            } catch (Exception e) {
                String str2 = "DynamiteModule";
                String str3 = "Failed to load IDynamiteLoader from GmsCore: ";
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str = str3.concat(valueOf);
                } else {
                    new String(str3);
                }
                int e2 = Log.e(str2, str);
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Class<C0677DynamiteModule> cls2 = cls;
                    throw th2;
                }
            }
        }
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public Context getModuleContext() {
        return this.zzh;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public IBinder instantiate(@RecentlyNonNull String str) throws LoadingException {
        String str2;
        LoadingException loadingException;
        String str3 = str;
        try {
            return (IBinder) this.zzh.getClassLoader().loadClass(str3).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            Throwable th = e;
            String valueOf = String.valueOf(str3);
            String str4 = "Failed to instantiate module class: ";
            if (valueOf.length() != 0) {
                str2 = str4.concat(valueOf);
            } else {
                new String(str4);
            }
            loadingException = new LoadingException(str2, th, (C0679zzb) null);
            throw r3;
        }
    }
}

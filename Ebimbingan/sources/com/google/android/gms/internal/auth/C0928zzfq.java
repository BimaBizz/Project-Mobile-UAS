package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzfq */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0928zzfq {
    private static final C0931zzft zza;
    private static final int zzb;

    /* renamed from: com.google.android.gms.internal.auth.zzfq$zza */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static final class zza extends C0931zzft {
        zza() {
        }

        public final void zza(Throwable th, Throwable th2) {
        }
    }

    public static void zza(Throwable th, Throwable th2) {
        zza.zza(th, th2);
    }

    private static Integer zza() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
    static {
        /*
            r4 = 0
            r1 = r4
            java.lang.Integer r4 = zza()     // Catch:{ Throwable -> 0x004a }
            r8 = r4
            r4 = r8
            r5 = r8
            r1 = r5
            if (r4 == 0) goto L_0x0028
            r4 = r1
            int r4 = r4.intValue()     // Catch:{ Throwable -> 0x004a }
            r5 = 19
            if (r4 < r5) goto L_0x0028
            com.google.android.gms.internal.auth.zzfw r4 = new com.google.android.gms.internal.auth.zzfw     // Catch:{ Throwable -> 0x004a }
            r8 = r4
            r4 = r8
            r5 = r8
            r5.<init>()     // Catch:{ Throwable -> 0x004a }
            r0 = r4
        L_0x001e:
            r4 = r0
            zza = r4
            r4 = r1
            if (r4 != 0) goto L_0x0099
            r4 = 1
        L_0x0025:
            zzb = r4
            return
        L_0x0028:
            java.lang.String r4 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r4 = java.lang.Boolean.getBoolean(r4)     // Catch:{ Throwable -> 0x004a }
            if (r4 != 0) goto L_0x003e
            r4 = 1
        L_0x0032:
            if (r4 == 0) goto L_0x0040
            com.google.android.gms.internal.auth.zzfu r4 = new com.google.android.gms.internal.auth.zzfu     // Catch:{ Throwable -> 0x004a }
            r8 = r4
            r4 = r8
            r5 = r8
            r5.<init>()     // Catch:{ Throwable -> 0x004a }
            r0 = r4
            goto L_0x001e
        L_0x003e:
            r4 = 0
            goto L_0x0032
        L_0x0040:
            com.google.android.gms.internal.auth.zzfq$zza r4 = new com.google.android.gms.internal.auth.zzfq$zza     // Catch:{ Throwable -> 0x004a }
            r8 = r4
            r4 = r8
            r5 = r8
            r5.<init>()     // Catch:{ Throwable -> 0x004a }
            r0 = r4
            goto L_0x001e
        L_0x004a:
            r4 = move-exception
            r2 = r4
            java.io.PrintStream r4 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.auth.zzfq$zza> r5 = com.google.android.gms.internal.auth.C0928zzfq.zza.class
            java.lang.String r5 = r5.getName()
            r3 = r5
            r5 = 133(0x85, float:1.86E-43)
            r6 = r3
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r6 = r6.length()
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = r5
            r9 = r6
            r5 = r9
            r6 = r8
            r7 = r9
            r8 = r6
            r9 = r7
            r6 = r9
            r7 = r8
            r6.<init>(r7)
            java.lang.String r6 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = r3
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "will be used. The error is: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.println(r5)
            r4 = r2
            java.io.PrintStream r5 = java.lang.System.err
            r4.printStackTrace(r5)
            com.google.android.gms.internal.auth.zzfq$zza r4 = new com.google.android.gms.internal.auth.zzfq$zza
            r8 = r4
            r4 = r8
            r5 = r8
            r5.<init>()
            r0 = r4
            goto L_0x001e
        L_0x0099:
            r4 = r1
            int r4 = r4.intValue()
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0928zzfq.<clinit>():void");
    }
}

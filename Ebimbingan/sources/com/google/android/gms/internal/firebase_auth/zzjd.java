package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

final class zzjd {
    static String zza(zzjc zzjc, String str) {
        StringBuilder sb;
        new StringBuilder();
        StringBuilder sb2 = sb;
        StringBuilder sb3 = sb2;
        StringBuilder append = sb2.append("# ").append(str);
        zza(zzjc, sb3, 0);
        return sb3.toString();
    }

    private static void zza(zzjc zzjc, StringBuilder sb, int i) {
        Map map;
        Map map2;
        Set set;
        Throwable th;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean booleanValue;
        boolean z;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        zzjc zzjc2 = zzjc;
        StringBuilder sb2 = sb;
        int i2 = i;
        new HashMap();
        Map map3 = map;
        new HashMap();
        Map map4 = map2;
        new TreeSet();
        Set<String> set2 = set;
        Method[] declaredMethods = zzjc2.getClass().getDeclaredMethods();
        Method[] methodArr = declaredMethods;
        int length = declaredMethods.length;
        for (int i3 = 0; i3 < length; i3++) {
            Method method = methodArr[i3];
            Object put = map4.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                Object put2 = map3.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    boolean add = set2.add(method.getName());
                }
            }
        }
        for (String str15 : set2) {
            String str16 = str15;
            String replaceFirst = str15.replaceFirst("get", "");
            String str17 = replaceFirst;
            if (replaceFirst.endsWith("List") && !str17.endsWith("OrBuilderList") && !str17.equals("List")) {
                String valueOf = String.valueOf(str17.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str17.substring(1, str17.length() - 4));
                String str18 = valueOf2;
                if (valueOf2.length() != 0) {
                    str14 = valueOf.concat(str18);
                } else {
                    String str19 = valueOf;
                    str14 = str13;
                    new String(str19);
                }
                String str20 = str14;
                Method method2 = (Method) map3.get(str16);
                Method method3 = method2;
                if (method2 != null && method3.getReturnType().equals(List.class)) {
                    zza(sb2, i2, zzdl(str20), zzhs.zza(method3, (Object) zzjc2, new Object[0]));
                }
            }
            if (str17.endsWith("Map") && !str17.equals("Map")) {
                String valueOf3 = String.valueOf(str17.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str17.substring(1, str17.length() - 3));
                String str21 = valueOf4;
                if (valueOf4.length() != 0) {
                    str12 = valueOf3.concat(str21);
                } else {
                    String str22 = valueOf3;
                    str12 = str11;
                    new String(str22);
                }
                String str23 = str12;
                Method method4 = (Method) map3.get(str16);
                Method method5 = method4;
                if (method4 != null && method5.getReturnType().equals(Map.class) && !method5.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method5.getModifiers())) {
                    zza(sb2, i2, zzdl(str23), zzhs.zza(method5, (Object) zzjc2, new Object[0]));
                }
            }
            Map map5 = map4;
            String valueOf5 = String.valueOf(str17);
            String str24 = valueOf5;
            if (valueOf5.length() != 0) {
                str2 = "set".concat(str24);
            } else {
                str2 = str;
                new String("set");
            }
            if (((Method) map5.get(str2)) != null) {
                if (str17.endsWith("Bytes")) {
                    Map map6 = map3;
                    String valueOf6 = String.valueOf(str17.substring(0, str17.length() - 5));
                    String str25 = valueOf6;
                    if (valueOf6.length() != 0) {
                        str10 = "get".concat(str25);
                    } else {
                        str10 = str9;
                        new String("get");
                    }
                    if (map6.containsKey(str10)) {
                    }
                }
                String valueOf7 = String.valueOf(str17.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(str17.substring(1));
                String str26 = valueOf8;
                if (valueOf8.length() != 0) {
                    str4 = valueOf7.concat(str26);
                } else {
                    String str27 = valueOf7;
                    str4 = str3;
                    new String(str27);
                }
                String str28 = str4;
                Map map7 = map3;
                String valueOf9 = String.valueOf(str17);
                String str29 = valueOf9;
                if (valueOf9.length() != 0) {
                    str6 = "get".concat(str29);
                } else {
                    str6 = str5;
                    new String("get");
                }
                Method method6 = (Method) map7.get(str6);
                Map map8 = map3;
                String valueOf10 = String.valueOf(str17);
                String str30 = valueOf10;
                if (valueOf10.length() != 0) {
                    str8 = "has".concat(str30);
                } else {
                    str8 = str7;
                    new String("has");
                }
                Method method7 = (Method) map8.get(str8);
                if (method6 != null) {
                    Object zza = zzhs.zza(method6, (Object) zzjc2, new Object[0]);
                    if (method7 == null) {
                        Object obj = zza;
                        Object obj2 = obj;
                        if (obj instanceof Boolean) {
                            z = !((Boolean) obj2).booleanValue();
                        } else if (obj2 instanceof Integer) {
                            z = ((Integer) obj2).intValue() == 0;
                        } else if (obj2 instanceof Float) {
                            z = ((Float) obj2).floatValue() == 0.0f;
                        } else if (obj2 instanceof Double) {
                            z = ((Double) obj2).doubleValue() == 0.0d;
                        } else if (obj2 instanceof String) {
                            z = obj2.equals("");
                        } else if (obj2 instanceof zzgf) {
                            z = obj2.equals(zzgf.zzvv);
                        } else if (obj2 instanceof zzjc) {
                            z = obj2 == ((zzjc) obj2).zzii();
                        } else if (obj2 instanceof Enum) {
                            z = ((Enum) obj2).ordinal() == 0;
                        } else {
                            z = false;
                        }
                        booleanValue = !z;
                    } else {
                        booleanValue = ((Boolean) zzhs.zza(method7, (Object) zzjc2, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        zza(sb2, i2, zzdl(str28), zza);
                    }
                }
            }
        }
        if (zzjc2 instanceof zzhs.zzb) {
            Iterator<Map.Entry<Object, Object>> it = ((zzhs.zzb) zzjc2).zzaam.iterator();
            Iterator<Map.Entry<Object, Object>> it2 = it;
            if (it.hasNext()) {
                Map.Entry next = it2.next();
                Map.Entry entry = next;
                Object key = next.getKey();
                Throwable th2 = th;
                new NoSuchMethodError();
                throw th2;
            }
        }
        if (((zzhs) zzjc2).zzaaj != null) {
            ((zzhs) zzjc2).zzaaj.zza(sb2, i2);
        }
    }

    static final void zza(StringBuilder sb, int i, String str, Object obj) {
        StringBuilder sb2 = sb;
        int i2 = i;
        String str2 = str;
        Object obj2 = obj;
        if (obj2 instanceof List) {
            for (Object zza : (List) obj2) {
                zza(sb2, i2, str2, zza);
            }
        } else if (obj2 instanceof Map) {
            for (Map.Entry zza2 : ((Map) obj2).entrySet()) {
                zza(sb2, i2, str2, zza2);
            }
        } else {
            StringBuilder append = sb2.append(10);
            for (int i3 = 0; i3 < i2; i3++) {
                StringBuilder append2 = sb2.append(' ');
            }
            StringBuilder append3 = sb2.append(str2);
            if (obj2 instanceof String) {
                StringBuilder append4 = sb2.append(": \"").append(zzkg.zzd(zzgf.zzdh((String) obj2))).append('\"');
            } else if (obj2 instanceof zzgf) {
                StringBuilder append5 = sb2.append(": \"").append(zzkg.zzd((zzgf) obj2)).append('\"');
            } else if (obj2 instanceof zzhs) {
                StringBuilder append6 = sb2.append(" {");
                zza((zzhs) obj2, sb2, i2 + 2);
                StringBuilder append7 = sb2.append("\n");
                for (int i4 = 0; i4 < i2; i4++) {
                    StringBuilder append8 = sb2.append(' ');
                }
                StringBuilder append9 = sb2.append("}");
            } else if (obj2 instanceof Map.Entry) {
                StringBuilder append10 = sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj2;
                zza(sb2, i2 + 2, "key", entry.getKey());
                zza(sb2, i2 + 2, CommonProperties.VALUE, entry.getValue());
                StringBuilder append11 = sb2.append("\n");
                for (int i5 = 0; i5 < i2; i5++) {
                    StringBuilder append12 = sb2.append(' ');
                }
                StringBuilder append13 = sb2.append("}");
            } else {
                StringBuilder append14 = sb2.append(": ").append(obj2.toString());
            }
        }
    }

    private static final String zzdl(String str) {
        StringBuilder sb;
        String str2 = str;
        new StringBuilder();
        StringBuilder sb2 = sb;
        for (int i = 0; i < str2.length(); i++) {
            char charAt = str2.charAt(i);
            char c = charAt;
            if (Character.isUpperCase(charAt)) {
                StringBuilder append = sb2.append("_");
            }
            StringBuilder append2 = sb2.append(Character.toLowerCase(c));
        }
        return sb2.toString();
    }
}

package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzfx;
import com.google.android.gms.internal.firebase_auth.zzga;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzfx<MessageType extends zzfx<MessageType, BuilderType>, BuilderType extends zzga<MessageType, BuilderType>> implements zzjc {
    private static boolean zzvn = false;
    protected int zzvm = 0;

    public zzfx() {
    }

    public final zzgf zzft() {
        Throwable th;
        StringBuilder sb;
        try {
            zzgn zzr = zzgf.zzr(zzik());
            zzb(zzr.zzgh());
            return zzr.zzgg();
        } catch (IOException e) {
            IOException iOException = e;
            Throwable th2 = th;
            String str = "ByteString";
            String name = getClass().getName();
            new StringBuilder(62 + String.valueOf(name).length() + String.valueOf(str).length());
            new RuntimeException(sb.append("Serializing ").append(name).append(" to a ").append(str).append(" threw an IOException (should never happen).").toString(), iOException);
            throw th2;
        }
    }

    public final byte[] toByteArray() {
        Throwable th;
        StringBuilder sb;
        try {
            byte[] bArr = new byte[zzik()];
            byte[] bArr2 = bArr;
            zzha zzc = zzha.zzc(bArr);
            zzb(zzc);
            zzc.zzhj();
            return bArr2;
        } catch (IOException e) {
            IOException iOException = e;
            Throwable th2 = th;
            String str = "byte array";
            String name = getClass().getName();
            new StringBuilder(62 + String.valueOf(name).length() + String.valueOf(str).length());
            new RuntimeException(sb.append("Serializing ").append(name).append(" to a ").append(str).append(" threw an IOException (should never happen).").toString(), iOException);
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public int zzfu() {
        Throwable th;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    /* access modifiers changed from: package-private */
    public void zzl(int i) {
        Throwable th;
        int i2 = i;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        StringBuilder sb;
        Throwable th;
        StringBuilder sb2;
        Throwable th2;
        List<? super T> list2 = list;
        Iterable<T> iterable2 = iterable;
        Iterable<T> iterable3 = iterable2;
        T checkNotNull = zzht.checkNotNull(iterable2);
        if (iterable3 instanceof zzij) {
            List<?> zzjd = ((zzij) iterable3).zzjd();
            zzij zzij = (zzij) list2;
            int size = list2.size();
            for (Object next : zzjd) {
                Object obj = next;
                if (next == null) {
                    int size2 = zzij.size() - size;
                    new StringBuilder(37);
                    String sb3 = sb2.append("Element at index ").append(size2).append(" is null.").toString();
                    for (int size3 = zzij.size() - 1; size3 >= size; size3--) {
                        Object remove = zzij.remove(size3);
                    }
                    Throwable th3 = th2;
                    new NullPointerException(sb3);
                    throw th3;
                } else if (obj instanceof zzgf) {
                    zzij.zzc((zzgf) obj);
                } else {
                    boolean add = zzij.add((String) obj);
                }
            }
        } else if (iterable3 instanceof zzjl) {
            boolean addAll = list2.addAll((Collection) iterable3);
        } else {
            List<? super T> list3 = list2;
            Iterable<T> iterable4 = iterable3;
            if ((list3 instanceof ArrayList) && (iterable4 instanceof Collection)) {
                ((ArrayList) list3).ensureCapacity(list3.size() + ((Collection) iterable4).size());
            }
            int size4 = list3.size();
            for (T next2 : iterable4) {
                T t = next2;
                if (next2 == null) {
                    int size5 = list3.size() - size4;
                    new StringBuilder(37);
                    String sb4 = sb.append("Element at index ").append(size5).append(" is null.").toString();
                    for (int size6 = list3.size() - 1; size6 >= size4; size6--) {
                        Object remove2 = list3.remove(size6);
                    }
                    Throwable th4 = th;
                    new NullPointerException(sb4);
                    throw th4;
                }
                boolean add2 = list3.add(t);
            }
        }
    }
}

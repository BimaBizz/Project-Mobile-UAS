package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import com.google.android.gms.common.server.response.C0558FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.server.response.zad */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0564zad implements C0569zai<Double> {
    C0564zad() {
    }

    @Nullable
    public final /* bridge */ /* synthetic */ Object zaa(C0558FastParser fastParser, BufferedReader bufferedReader) throws C0558FastParser.ParseException, IOException {
        return Double.valueOf(fastParser.zat(bufferedReader));
    }
}

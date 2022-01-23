package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zad implements zai<Double> {
    zad() {
    }

    @Nullable
    public final /* bridge */ /* synthetic */ Object zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return Double.valueOf(fastParser.zat(bufferedReader));
    }
}
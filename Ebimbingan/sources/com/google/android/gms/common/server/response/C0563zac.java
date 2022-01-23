package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import com.google.android.gms.common.server.response.C0558FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.server.response.zac */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0563zac implements C0569zai<Float> {
    C0563zac() {
    }

    @Nullable
    public final /* bridge */ /* synthetic */ Object zaa(C0558FastParser fastParser, BufferedReader bufferedReader) throws C0558FastParser.ParseException, IOException {
        return Float.valueOf(fastParser.zas(bufferedReader));
    }
}

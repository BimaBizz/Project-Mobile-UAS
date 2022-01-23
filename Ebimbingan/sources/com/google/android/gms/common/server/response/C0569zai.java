package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import com.google.android.gms.common.server.response.C0558FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.server.response.zai */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
interface C0569zai<O> {
    @Nullable
    O zaa(C0558FastParser fastParser, BufferedReader bufferedReader) throws C0558FastParser.ParseException, IOException;
}

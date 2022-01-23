package com.google.firebase.auth.api.internal;

import android.content.Context;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0211Api.ApiOptions;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.internal.C0265StatusExceptionMapper;

public final class zzak<O extends C0211Api.ApiOptions> extends C0220GoogleApi<O> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzak(Context context, C0211Api<O> api, O o, C0265StatusExceptionMapper statusExceptionMapper) {
        super(context, api, o, statusExceptionMapper);
    }
}

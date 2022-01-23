package com.google.android.gms.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.meta.TypeQualifierDefault;

@Documented
@Target({ElementType.TYPE, ElementType.PACKAGE})
@TypeQualifierDefault({ElementType.METHOD, ElementType.PARAMETER})
@C0206KeepForSdk
@Retention(RetentionPolicy.CLASS)
/* renamed from: com.google.android.gms.common.annotation.NonNullApi */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public @interface C0210NonNullApi {
}

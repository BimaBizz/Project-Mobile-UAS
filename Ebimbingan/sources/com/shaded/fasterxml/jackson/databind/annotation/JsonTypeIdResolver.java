package com.shaded.fasterxml.jackson.databind.annotation;

import com.shaded.fasterxml.jackson.annotation.JacksonAnnotation;
import com.shaded.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@JacksonAnnotation
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonTypeIdResolver {
    Class<? extends TypeIdResolver> value();
}

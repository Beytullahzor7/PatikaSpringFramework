package com.patika.aop.stereotype;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Stereotype
@Target({TYPE, METHOD})
@Retention(RUNTIME)
@Documented

@Named
@ApplicationScoped
public @interface MyStereotype {
}

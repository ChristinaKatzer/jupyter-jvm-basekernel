package io.github.spencerpark.jupyter.api.magic.registry;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CellMagic {
    String value() default "";

    String[] aliases() default {};
}
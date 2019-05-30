package com.zh.annatation.toolbar;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author : dayezi
 * data :2019/5/30
 * description:
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface ToolbarLeft {
    int menuId() default -1;
}

package com.zh.annatation.toolbar;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author : dayezi
 * data :2019/5/21
 * description:toolbar 标题
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface ToolbarTitle {

    String title() default "";

    int textSize() default 16;

    int textColorId() default -1;

    int viewId() default -1;
}

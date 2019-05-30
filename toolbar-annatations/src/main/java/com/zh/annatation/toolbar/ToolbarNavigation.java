package com.zh.annatation.toolbar;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author : dayezi
 * data :2019/5/21
 * description:toolbar 左边信息
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface ToolbarNavigation {
    String title() default "";

    int titleAppearanceId() default -1;

    int titleColorId() default -1;

    String subTitle() default "";

    int subTitleAppearanceId() default -1;

    int subTitleColorId() default -1;

    int iconId() default -1;

    boolean visibleNavigation() default true;

}

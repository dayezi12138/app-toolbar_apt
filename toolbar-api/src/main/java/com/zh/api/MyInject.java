package com.zh.api;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.zh.bean.ToolbarNavigationBean;
import com.zh.bean.ToolbarTitleBean;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * author : dayezi
 * data :2019/5/28
 * description:
 */
public class MyInject {
    private final static int DEFAULT_INT_ = -1;

    public static void init(Application application) {
        _MyInject.init(application);
    }

    public static Map<String, ToolbarNavigationBean> atlas = new HashMap<>();
    public static Map<String, ToolbarTitleBean> titleBeanMap = new HashMap<>();
    public static Map<String, Integer> leftImags = new HashMap<>();
    public static Map<String, String> navigationOnclicks = new HashMap<>();

    public synchronized static void inject(Activity activity, final Toolbar toolbar) {
        initToolbarNavigationBean(activity, toolbar);
        initToolbarTitleBean(activity, toolbar);
        initToolbarLeftBean(activity, toolbar);
        initNavigationClick(activity, toolbar);
    }

    private static void initNavigationClick(final Activity activity, Toolbar toolbar) {
        if (navigationOnclicks.containsKey(activity.getClass().getName())) {
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Method method = activity.getClass().getMethod(navigationOnclicks.get(activity.getClass().getName()));
                        method.invoke(activity);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }

    private static void initToolbarLeftBean(Activity activity, Toolbar toolbar) {
        if (leftImags.containsKey(activity.getClass().getName())) {
            int menuId = leftImags.get(activity.getClass().getName());
            if (menuId != DEFAULT_INT_) {
                toolbar.inflateMenu(menuId);
            }
        }
    }

    private static void initToolbarTitleBean(Activity activity, Toolbar toolbar) {
        if (titleBeanMap.containsKey(activity.getClass().getName())) {
            ToolbarTitleBean bean = titleBeanMap.get(activity.getClass().getName());
            if (bean.getViewId() == DEFAULT_INT_) {
                TextView textView = new TextView(activity);
                Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.MATCH_PARENT);
                layoutParams.gravity = Gravity.CENTER;
                textView.setLayoutParams(layoutParams);
                textView.setText(bean.getTitle());
                if (bean.getTextColorId() != DEFAULT_INT_)
                    textView.setTextColor(activity.getResources().getColor(bean.getTextColorId()));
                if (bean.getTextSize() != DEFAULT_INT_)
                    textView.setTextSize(sp2px(activity, bean.getTextSize()));
                toolbar.addView(textView);
            } else {
                View view = LayoutInflater.from(activity).inflate(bean.getViewId(), null);
                toolbar.addView(view);
            }
        }
    }

    private static int sp2px(Context context, float spValue) {
        return (int) (spValue * context.getResources().getDisplayMetrics().scaledDensity + 0.5F);
    }

    /**
     * 初始化toolbar右边
     *
     * @param activity
     * @param toolbar
     */
    private static void initToolbarNavigationBean(Activity activity, final Toolbar toolbar) {
        if (atlas.containsKey(activity.getClass().getName())) {
            ToolbarNavigationBean bean = atlas.get(activity.getClass().getName());
            toolbar.setTitle(bean.getTitle());
            if (bean.getTitleAppearanceId() != DEFAULT_INT_)
                toolbar.setTitleTextAppearance(activity, bean.getTitleAppearanceId());
            if (bean.getSubTitleColorId() != DEFAULT_INT_)
                toolbar.setTitleTextColor(activity.getResources().getColor(bean.getSubTitleColorId()));
            toolbar.setSubtitle(bean.getSubTitle());
            if (bean.getSubTitleAppearanceId() != DEFAULT_INT_)
                toolbar.setSubtitleTextAppearance(activity, bean.getSubTitleAppearanceId());
            if (bean.getSubTitleColorId() != DEFAULT_INT_)
                toolbar.setSubtitleTextColor(activity.getResources().getColor(bean.getSubTitleColorId()));
            if (bean.isVisibleNavigation() && bean.getIconId() != DEFAULT_INT_)
                toolbar.setNavigationIcon(bean.getIconId());
        }
    }
}

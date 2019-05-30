package com.zh.bean;

/**
 * author : dayezi
 * data :2019/5/23
 * description:
 */
public class ToolbarNavigationBean {
    private String title;
    private int titleAppearanceId;
    private int titleColorId;

    private String subTitle;
    private int subTitleAppearanceId;
    private int subTitleColorId;

    private int iconId;
    private boolean visibleNavigation;

    private ToolbarNavigationBean(String title, int titleAppearanceId, int titleColorId, String subTitle, int subTitleAppearanceId, int subTitleColorId, int iconId, boolean visibleNavigation) {
        this.title = title;
        this.titleAppearanceId = titleAppearanceId;
        this.titleColorId = titleColorId;
        this.subTitle = subTitle;
        this.subTitleAppearanceId = subTitleAppearanceId;
        this.subTitleColorId = subTitleColorId;
        this.iconId = iconId;
        this.visibleNavigation = visibleNavigation;
    }

    public static ToolbarNavigationBean build(String title, int titleAppearanceId, int titleColorId, String subTitle, int subTitleAppearanceId, int subTitleColorId, int iconId, boolean visibleNavigation) {
        return new ToolbarNavigationBean(title, titleAppearanceId, titleColorId, subTitle, subTitleAppearanceId, subTitleColorId, iconId, visibleNavigation);
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public int getIconId() {
        return iconId;
    }


    public boolean isVisibleNavigation() {
        return visibleNavigation;
    }

    public int getTitleAppearanceId() {
        return titleAppearanceId;
    }

    public int getTitleColorId() {
        return titleColorId;
    }

    public int getSubTitleAppearanceId() {
        return subTitleAppearanceId;
    }

    public int getSubTitleColorId() {
        return subTitleColorId;
    }
}
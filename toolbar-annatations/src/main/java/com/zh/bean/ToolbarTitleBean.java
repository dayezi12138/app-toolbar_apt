package com.zh.bean;

/**
 * author : dayezi
 * data :2019/5/30
 * description:
 */
public class ToolbarTitleBean {
    private String title;
    private int textSize;
    private int textColorId;
    private int viewId;

    private ToolbarTitleBean(String title, int textSize, int textColorId, int viewId) {
        this.title = title;
        this.textSize = textSize;
        this.textColorId = textColorId;
        this.viewId = viewId;
    }

    public static ToolbarTitleBean build(String title, int textSize, int textColorId, int viewId) {
        return new ToolbarTitleBean(title, textSize, textColorId, viewId);
    }

    public String getTitle() {
        return title;
    }

    public int getTextSize() {
        return textSize;
    }

    public int getTextColorId() {
        return textColorId;
    }

    public int getViewId() {
        return viewId;
    }
}
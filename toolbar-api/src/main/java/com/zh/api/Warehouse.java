package com.zh.api;

import com.zh.bean.ToolbarNavigationBean;

import java.util.HashMap;
import java.util.Map;

/**
 * author : dayezi
 * data :2019/5/28
 * description:
 */
public class Warehouse {

    private volatile Map<String, ToolbarNavigationBean> atlas = new HashMap<>();

    public void put(String key, ToolbarNavigationBean toolbarNavigationBean) {
        atlas.put(key, toolbarNavigationBean);
    }

    public Map<String, ToolbarNavigationBean> getAtlas() {
        return atlas;
    }
}

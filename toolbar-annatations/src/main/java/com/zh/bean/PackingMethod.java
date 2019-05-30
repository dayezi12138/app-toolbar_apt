package com.zh.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * author : dayezi
 * data :2019/5/24
 * description:
 */
public class PackingMethod {
    private String param;
    private String key;
    private List<String> paramList = new ArrayList<>(3);

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void addParams(String val) {
        paramList.add(val);
    }

    public List<String> getParamList() {
        return paramList;
    }
}

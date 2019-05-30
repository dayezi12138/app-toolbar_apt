package com.zh.fade;

import java.util.List;
import java.util.Map;

/**
 * author : dayezi
 * data :2019/5/30
 * description:
 */
public interface IOnMenuClick {

    void loadInfo(Map<String, List<Integer>> atlas);

    List<Integer> getList();
}

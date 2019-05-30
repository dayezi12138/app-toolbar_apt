package com.zh.api.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * author : dayezi
 * data :2019/5/30
 * description:
 */
public class ToolbarStrategyFactory {
    private static Map<String, Object> punishMap = new HashMap<>();

    //获取
    public static Object getPunish(String key) {
        if (!punishMap.containsKey(key)) return EMPTY.getInstance();
        Object result = punishMap.get(key);
        return result == null ? EMPTY.getInstance() : result;
    }

    public static void put(String key, Object punish) {
        punishMap.put(key, punish);
    }

    public static class EMPTY {
        private volatile static EMPTY instance;

        private EMPTY() {
        }

        public static EMPTY getInstance() {
            if (instance == null) {
                synchronized (EMPTY.class) {
                    if (instance == null) {
                        instance = new EMPTY();
                    }
                }
            }
            return instance;
        }
    }
}

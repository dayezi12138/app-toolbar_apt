package com.zh.api;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * author : dayezi
 * data :2019/5/30
 * description:
 */
final class _MyInject {
    private static Context mContext;
    private static ThreadPoolExecutor executor = DefaultPoolExecutor.getInstance();
    private static Handler mHandler;

    private _MyInject() {
    }

    protected static boolean init(Application application) {
        mContext = application;
        HandlerCenter.init(mContext, executor);
        mHandler = new Handler(Looper.getMainLooper());
        return true;
    }
}

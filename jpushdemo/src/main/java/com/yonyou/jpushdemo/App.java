package com.yonyou.jpushdemo;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by zj on 2017/4/19.
 * 邮箱：zjuan@yonyou.com
 * 描述：
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //设置极光推送debug模式
        JPushInterface.setDebugMode(true);
        //初始化极光推送
        JPushInterface.init(this);
    }
}

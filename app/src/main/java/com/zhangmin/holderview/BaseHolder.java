package com.zhangmin.holderview;

import android.view.View;

/**
 * @author: ZhangMin
 * @date: 2017/4/27 16:55
 * @desc:
 */
public abstract  class BaseHolder {
    private View contentView;

    public BaseHolder() {
        contentView = setContentView();
        init();
    }

    //把当前的view返回给父类
    public View getContentView() {
        return contentView;
    }

    //设置根视图
    public abstract View setContentView();

    //执行一些初始化的操作，非必须，所以空实现了，需要的话重写即可
    public void init() {
    }
}

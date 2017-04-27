package com.zhangmin.holderview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.zhangmin.holderview.utils.UIUtils;

/**
 * @author: ZhangMin
 * @date: 2017/4/27 16:56
 * @desc:
 */
public class Holder_HotRecommend extends BaseHolder {

    Context mContext;
    LayoutInflater mLayoutInflater;

    public Holder_HotRecommend(Context context,LayoutInflater layoutInflater) {
        mContext = context;
        mLayoutInflater = layoutInflater;
    }

    @Override
    public View setContentView() {
        View view = UIUtils.inflate(R.layout.item_hotrecom);
        return view;
    }
}

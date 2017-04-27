package com.zhangmin.holderview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.fr_carHead)
    FrameLayout frCarHead;
    @BindView(R.id.fr_carService)
    FrameLayout frCarService;
    @BindView(R.id.fr_authRegion)
    FrameLayout frAuthRegion;
    @BindView(R.id.fr_hotRecommend)
    FrameLayout frHotRecommend;
    @BindView(R.id.fr_buyGuide)
    FrameLayout frBuyGuide;
    @BindView(R.id.sv_root)
    ScrollView svRoot;
    @BindView(R.id.fr_searchbar)
    FrameLayout frSearchbar;
    @BindView(R.id.ll)
    LinearLayout ll;

    private Holder_HotRecommend holderHotRecommend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
        initData();
    }


    private void initView() {
        holderHotRecommend = new Holder_HotRecommend(this,getLayoutInflater());
        frSearchbar.addView(holderHotRecommend.getContentView());
//        frCarHead.addView(holderHotRecommend.getContentView());
//        frCarService.addView(holderHotRecommend.getContentView());
//        frAuthRegion.addView(holderHotRecommend.getContentView());
//        frHotRecommend.addView(holderHotRecommend.getContentView());
    }

    private void initData() {


    }
}

package com.xk.customview.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xk.customview.R;

/**
 * Created by xuekai on 2017/2/23.
 */

public class FoldingLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foldinglayout);
        getSupportActionBar().setTitle("有bug，放弃了");
//        FoldLayout v= (FoldLayout) findViewById(R.id.aaa);
//        v.setFactor(0.1f);
    }
}

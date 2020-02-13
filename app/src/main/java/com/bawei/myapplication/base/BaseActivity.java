package com.bawei.myapplication.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;


public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
protected P mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        mPresenter=Presenter();
        if (mPresenter != null) {
            mPresenter.aetView(this);
        }
        ButterKnife.bind(this);
        initView();
        initDate();
    }

    protected abstract int layoutId();

    protected abstract void initDate();

    protected abstract void initView();

    protected abstract P Presenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detView();
        }
    }
}

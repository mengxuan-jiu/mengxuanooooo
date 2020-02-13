package com.bawei.myapplication.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bawei.myapplication.R;
import com.bawei.myapplication.base.BaseActivity;
import com.bawei.myapplication.contract.IContractDan;
import com.bawei.myapplication.contract.IContractDlu;
import com.bawei.myapplication.presenter.PresenterDan;
import com.bawei.myapplication.presenter.bean.LogBean;
import com.bawei.myapplication.presenter.bean.RenBean;

public class MainActivity extends BaseActivity<PresenterDan> implements IContractDan.IViewLZ {


    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initDate() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected PresenterDan Presenter() {
        return null;
    }

    @Override
    public void ZcSuccess(RenBean bean) {

    }

    @Override
    public void ZcFailure(Throwable throwable) {

    }

    @Override
    public void LoSuccess(LogBean bean) {

    }

    @Override
    public void LoFailure(Throwable throwable) {

    }
}

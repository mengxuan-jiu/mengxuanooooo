package com.bawei.myapplication.model;

import com.bawei.myapplication.contract.IContractDan;
import com.bawei.myapplication.presenter.bean.LogBean;
import com.bawei.myapplication.presenter.bean.RenBean;
import com.bawei.myapplication.util.NetUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * *******************************************************************
 * @包名 com.bawei.myapplication.model
 * @mengxuan
 * @日期2020/2/13
 * @日期2020 : 02:13
 * @项目名mengxuanooooo
 * @类名ModelDan
 **/
public class ModelDan implements IContractDan.IModel {


    @Override
    public void ZcDate(String phone, String pwd, IZcViewLZ iZcViewLZ) {
        NetUtil.getInstance().getApi().reg(phone, pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RenBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RenBean bean) {
                        iZcViewLZ.ZcSuccess(bean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iZcViewLZ.ZcFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void DlDate(String phone, String pwd, IDlViewLZ iDlModel) {
        NetUtil.getInstance().getApi().log(phone, pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LogBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LogBean bean) {
                        iDlModel.LoSuccess(bean);
                    }

                    @Override
                    public void onError(Throwable e) {
                      iDlModel.LoFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

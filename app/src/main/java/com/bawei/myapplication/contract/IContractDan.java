package com.bawei.myapplication.contract;

import com.bawei.myapplication.presenter.bean.LogBean;
import com.bawei.myapplication.presenter.bean.RenBean;

/**
 * @包名 com.bawei.myapplication.contract
 * @mengxuan
 * @日期2020/2/13
 * @日期2020 : 02:13
 * @项目名mengxuanooooo
 * @类名IContractDlu
 * 登录 失败
 **/
public interface IContractDan {
    interface IViewLZ{
        void ZcSuccess(RenBean bean);
        void ZcFailure(Throwable throwable);

        void LoSuccess(LogBean bean);
        void LoFailure(Throwable throwable);
    }

    interface IPresenter{

        void ZcDate(String phone,String pwd);

        void DlDate(String phone,String pwd);
    }

    interface IModel{

        void ZcDate(String phone,String pwd,IZcViewLZ iZcViewLZ);
        interface IZcViewLZ{
            void ZcSuccess(RenBean bean);
            void ZcFailure(Throwable throwable);


        }

        void DlDate(String phone,String pwd,IDlViewLZ iDlModel);
        interface IDlViewLZ{


            void LoSuccess(LogBean bean);
            void LoFailure(Throwable throwable);
        }
    }

}

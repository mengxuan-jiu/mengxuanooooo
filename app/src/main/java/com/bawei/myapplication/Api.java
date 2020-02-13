package com.bawei.myapplication;

import com.bawei.myapplication.presenter.bean.LogBean;
import com.bawei.myapplication.presenter.bean.RenBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * @包名 com.bawei.myapplication
 * @mengxuan
 * @日期2020/2/13
 * @日期2020 : 02:13
 * @项目名mengxuanooooo
 * @类名Api
 * http://mobile.bwstudent.com/small/user/v1/register
 * http://mobile.bwstudent.com/small/user/v1/login
 * http://mobile.bwstudent.com/small/order/verify/v1/findOrderListByStatus
 **/
public interface Api {
    @FormUrlEncoded
    @POST("small/user/v1/register")
    Observable<RenBean> reg(@Field("phone") String phone, @Field("pwd") String pwd);
    @FormUrlEncoded
    @POST("small/user/v1/login")
    Observable<LogBean> log(@Field("phone") String phone,@Field("pwd") String pwd);
    @GET("small/order/verify/v1/findOrderListByStatus")
    Observable<LogBean> Dan(@Header("userId") int userId, @Header("sessionId") String sessionId, @Header("status") int status, @Header("page")int page, @Header("count")int count);
}

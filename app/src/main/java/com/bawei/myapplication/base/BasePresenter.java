package com.bawei.myapplication.base;


public abstract class BasePresenter<V> {
    protected V view;

    public BasePresenter() {
        initModel();
    }

    public void aetView(V view) {
        this.view = view;
    }
    public void detView() {
      view=null;
    }

    protected abstract void initModel();
}

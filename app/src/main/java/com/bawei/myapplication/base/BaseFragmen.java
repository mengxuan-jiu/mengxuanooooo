package com.bawei.myapplication.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;


public abstract class BaseFragmen<P extends BasePresenter> extends Fragment {
    protected P mPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(layoutId(), container, false);
        mPresenter = protectedPresenter();
        if (mPresenter != null) {
            mPresenter.aetView(this);
        }
        ButterKnife.bind(this,view);
        initView(view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initDate();
    }

    protected abstract int layoutId();

    protected abstract void initDate();

    protected abstract void initView(View view);

    protected abstract P protectedPresenter();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null) {
            mPresenter.detView();
        }
    }
}

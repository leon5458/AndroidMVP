package com.hly.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/3/18~~~~~~
 * ~~~~~~更改时间:2019/3/18~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public abstract class BaseActivity <T extends BasePresenter, E extends BaseModel> extends AppCompatActivity implements BaseView {
    /**
     * Presenter
     **/
    public T mPresenter;
    /**
     * mModel
     **/
    public E mModel;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
    }
    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
    }
    @Override
    public void setContentView(View view) {
        super.setContentView(view);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        initPresenter();
        int layId = getLayout();
        if (layId!= 0) {
            setContentView(layId);
        }
        findByid();
        initView();
        setListener();
        initData();
    }

    protected abstract int getLayout();

    protected abstract void findByid();

    protected abstract void setListener();

    protected abstract void initView();//初始化控件

    protected abstract void initData();//初始化数据

    //简单页面无需mvp就不用管此方法即可,完美兼容各种实际场景的变通
    public abstract void initPresenter();


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void showLoading(String title) {
        Log.e("hly",title);
        //showdialog
    }

    @Override
    public void stopLoading() {
        //hidedialog
    }

    @Override
    public void showErrorTip(String msg) {
        //toast
    }
}

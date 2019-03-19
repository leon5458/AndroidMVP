package com.hly.base;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/3/18~~~~~~
 * ~~~~~~更改时间:2019/3/18~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public abstract class BasePresenter<T,E> {
    public E mModel;
    public T mView;

    public void setVM(T v, E m) {
        this.mView = v;
        this.mModel = m;
    }

    public void onDestroy() {
        mModel = null;
        mView = null;
    }
}

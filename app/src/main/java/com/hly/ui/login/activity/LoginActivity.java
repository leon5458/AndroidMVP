package com.hly.ui.login.activity;
import com.hly.R;
import com.hly.base.BaseActivity;
import com.hly.ui.login.model.LoginModel;
import com.hly.ui.login.presenter.LoginPresenter;
import com.hly.ui.login.view.LoginView;
/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/3/18~~~~~~
 * ~~~~~~更改时间:2019/3/18~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public class LoginActivity extends BaseActivity<LoginPresenter, LoginModel> implements LoginView {
    @Override
    protected int getLayout(){
        return R.layout.login_activity_layout;
    }
    @Override
    protected void findByid(){
    }
    @Override
    protected void setListener(){
    }
    @Override
    protected void initView(){
        mPresenter.getLoign("111","222"); //请求
    }

    @Override
    protected void initData() {

    }

    @Override
    public void initPresenter() {
        mPresenter = new LoginPresenter();
        mModel = new LoginModel();
        mPresenter.setVM(this, mModel);
    }
    @Override
    public void setLogin(String s) {
    }

}

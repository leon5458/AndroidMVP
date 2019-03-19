package com.hly.ui.login.presenter;
import com.hly.base.BasePresenter;
import com.hly.base.PresentCallBack;
import com.hly.ui.login.model.LoginModel;
import com.hly.ui.login.view.LoginView;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/3/18~~~~~~
 * ~~~~~~更改时间:2019/3/18~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public class LoginPresenter extends BasePresenter<LoginView, LoginModel> {

    public void getLoign(String account,String pwd){
        mModel.getLogin(account, pwd, new PresentCallBack<String>() {
            @Override
            public void onBack(String s) {
             if (mView !=null && s !=null){
                 mView.setLogin(s);
             }
            }

            @Override
            public void onError(String error) {
                if (mView != null) {
                    mView.showErrorTip(error);
                }
            }

            @Override
            public void onFinish() {
                if (mView != null) {
                    mView.stopLoading();
                }
            }
        });
    }

}

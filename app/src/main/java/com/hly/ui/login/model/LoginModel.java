package com.hly.ui.login.model;
import android.support.v4.util.ArrayMap;
import com.hly.base.BaseModel;
import com.hly.base.PresentCallBack;
import java.util.Map;
/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/3/18~~~~~~
 * ~~~~~~更改时间:2019/3/18~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public class LoginModel implements BaseModel {
    public void getLogin(String account, String pwd, PresentCallBack<String> callBack) {
        Map<String, String> map = new ArrayMap<>();
        map.put("account", account);
        map.put("pwd",pwd);

    }
}

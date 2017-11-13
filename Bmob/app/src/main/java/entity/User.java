package entity;

import cn.bmob.v3.BmobUser;

/**
 * Created by 潘硕 on 2017/11/13.
 */

public class User extends BmobUser {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


}

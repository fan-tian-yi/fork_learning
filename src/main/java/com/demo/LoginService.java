package com.demo;

/** 登录服务（练习用，故意做得很简单） */
public class LoginService {

    public boolean login(String username, String password) {
        if (username == null || username.isBlank()) {
            return false;
        }
        // 练习仓库不做真实校验
        return "admin".equals(username) && "123456".equals(password);
    }
}

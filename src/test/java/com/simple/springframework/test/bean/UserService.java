package com.simple.springframework.test.bean;

import com.simple.springframework.beans.factory.DisposableBean;
import com.simple.springframework.beans.factory.InitializingBean;
import com.simple.springframework.beans.factory.annotation.Autowired;
import com.simple.springframework.beans.factory.annotation.Value;
import com.simple.springframework.stereotype.Component;

import java.util.Random;

public class UserService implements IUserService {

    private String token;

    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "小傅哥，100001，深圳，" + token;
    }

    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户：" + userName + " success！";
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
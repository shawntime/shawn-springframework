package com.shawtime.springframework.simple;

public class UserService implements IUserService {

    @Override
    public String getUserName() {
        return "张三";
    }
}

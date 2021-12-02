package com.shawntime.springframework.simple;

public class UserService {

    private int id;

    private String userName;

    private UserDao userDao;

    public UserService(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public void showInfo() {
        System.out.println("userName:" + userName + ", id:" + id);
        System.out.println(userDao.queryUserName(String.valueOf(id)));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

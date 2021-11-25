package com.shawntime.springframework.simple;

public class UserService implements IUserService {

    private User user;

    private int age;

    private String userName;

    public UserService() {
        super();
    }

    public UserService(User user) {
        this.user = user;
    }

    public UserService(int age, String userName) {
        this.age = age;
        this.userName = userName;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public boolean addUser(String userName, int age) {
        User user = new User(age, userName);
        System.out.println(user);
        return true;
    }

    @Override
    public boolean addUser(User user) {
        System.out.println(user);
        return true;
    }
}

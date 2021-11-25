package com.shawntime.springframework.simple;

public interface IUserService {

    String getUserName();

    User getUser();

    boolean addUser(String userName, int age);

    boolean addUser(User user);
}

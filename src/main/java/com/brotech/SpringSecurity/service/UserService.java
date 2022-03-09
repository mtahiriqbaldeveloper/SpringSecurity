package com.brotech.SpringSecurity.service;

import com.brotech.SpringSecurity.domain.Role;
import com.brotech.SpringSecurity.domain.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String userName, String roleName);
    User getUser(String userName);
    List<User> getUser();
}

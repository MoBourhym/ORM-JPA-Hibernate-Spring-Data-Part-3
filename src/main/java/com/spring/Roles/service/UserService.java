package com.spring.Roles.service;

import com.spring.Roles.entities.Role;
import com.spring.Roles.entities.User;

public interface UserService {
    User addNewUser(User user);

    Role addNewRole(Role role);

    User fetchUserByUsername(String userName);

    Role fetchRoleByRoleName(String roleName);

    void addRoleToUser(String username, String roleName);

    User authenticate(String username, String password);
}

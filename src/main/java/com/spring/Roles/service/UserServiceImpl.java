package com.spring.Roles.service;

import com.spring.Roles.entities.Role;
import com.spring.Roles.entities.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    public User addNewUser(User user) {
        return null;
    }

    @Override
    public Role addNewRole(Role role) {
        return null;
    }

    @Override
    public User fetchUserByUsername(String userName) {
        return null;
    }

    @Override
    public Role fetchRoleByRoleName(String roleName) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }
}

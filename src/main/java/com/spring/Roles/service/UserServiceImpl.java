package com.spring.Roles.service;

import com.spring.Roles.entities.Role;
import com.spring.Roles.entities.User;
import com.spring.Roles.repositories.RoleRepository;
import com.spring.Roles.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;


    @Override
    public User addNewUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
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

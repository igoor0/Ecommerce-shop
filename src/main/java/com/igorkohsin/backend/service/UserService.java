package com.igorkohsin.backend.service;

import com.igorkohsin.backend.model.user.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public void updateUser(User user);
    public List<User> getAllUsers();
    public void deleteUser(String id);
    public User getUserById(String id);
    public User getUserByEmail(String email);
    public void deleteAllUsers();
}

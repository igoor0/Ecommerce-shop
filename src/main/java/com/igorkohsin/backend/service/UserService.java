package com.igorkohsin.backend.service;

import com.igorkohsin.backend.exception.UserIdNotFoundException;
import com.igorkohsin.backend.model.User;
import com.igorkohsin.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void addUser(User user) {
        userRepository.insert(user);
    }
    public void updateUser(User user) {
        User savedUser = userRepository.findById(user.getId())
                .orElseThrow(() -> new UserIdNotFoundException(user.getId()));
        savedUser.setFirstName(user.getFirstName());
        savedUser.setLastName(user.getLastName());
        savedUser.setEmail(user.getEmail());
        savedUser.setPassword(user.getEmail());
        savedUser.setUserRole(user.getUserRole());
        savedUser.setExpired(user.isExpired());
        savedUser.setEnabled(user.isEnabled());

    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
    public User getUserByEmail(String id) {
        return userRepository.findById(id).orElseThrow(() -> new UserIdNotFoundException(id));
    }
    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new UserIdNotFoundException(id));
    }
}

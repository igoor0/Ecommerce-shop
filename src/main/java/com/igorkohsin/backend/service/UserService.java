package com.igorkohsin.backend.service;

import com.igorkohsin.backend.exception.UserIdNotFoundException;
import com.igorkohsin.backend.model.user.User;
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
        User savedUser = userRepository.findById(user.getUserId())
                .orElseThrow(() -> new UserIdNotFoundException(user.getUserId()));
        savedUser.setFirstName(user.getFirstName());
        savedUser.setLastName(user.getLastName());
        savedUser.setEmail(user.getEmail());
        savedUser.setAddress(user.getAddress());
        savedUser.setCity(user.getCity());
        savedUser.setZipCode(user.getZipCode());
        savedUser.setPassword(user.getPassword());
        savedUser.setPhoneNumber(user.getPhoneNumber());
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

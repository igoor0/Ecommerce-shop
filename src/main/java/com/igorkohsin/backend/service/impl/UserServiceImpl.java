package com.igorkohsin.backend.service.impl;

import com.igorkohsin.backend.exception.UserEmailNotFoundException;
import com.igorkohsin.backend.exception.UserIdNotFoundException;
import com.igorkohsin.backend.model.user.User;
import com.igorkohsin.backend.repository.UserRepository;
import com.igorkohsin.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.insert(user);
    }
    public void updateUser(User user) {
        User savedUser = userRepository.findById(user.getId())
                .orElseThrow(() -> new UserIdNotFoundException(user.getId()));
        //savedUser.setFirstName(user.getFirstName());
        //savedUser.setLastName(user.getLastName());
        savedUser.setEmail(user.getEmail());
        //savedUser.setAddress(user.getAddress());
        //savedUser.setCity(user.getCity());
        //savedUser.setZipCode(user.getZipCode());
        savedUser.setPassword(user.getPassword());
        //savedUser.setPhoneNumber(user.getPhoneNumber());
        savedUser.setRoles(user.getRoles());
        //savedUser.setExpired(user.isExpired());
        //savedUser.setEnabled(user.isEnabled());
        //savedUser.setConfirmed(user.isConfirmed());
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
    //public User getUserByEmail(String id) {return userRepository.findBy(id).orElseThrow(() -> new UserIdNotFoundException(id));}
    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new UserIdNotFoundException(id));
    }
    public User getUserByEmail(String email) {
        return (User) userRepository.getUserByEmail(email).orElseThrow(() -> new UserEmailNotFoundException(email));
    }
    public void deleteAllUsers() { userRepository.deleteAll();
    }
}

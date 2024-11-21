package com.summer.winter.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.summer.winter.model.User;
import com.summer.winter.Repository.UserRepository;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        Optional<User> OptionalUser = userRepository.findById(user.getId());
        if (OptionalUser.isPresent()) {
            User updateUser = new User();
            updateUser.id= user.id;
            updateUser.setFullName(User.getFullName);
            updateUser.setEmail(User.getEmail);
            updateUser.setPassword(User.getPassword);
            return userRepository.save(updateUser);
        }else {
            throw new RuntimeException("User not found");
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}

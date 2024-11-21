package com.summer.winter.Service;

import java.util.List;
import com.summer.winter.model.User;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    List<User> getAllUsers();
}

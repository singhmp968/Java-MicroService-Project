package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {
    // user operation
    // create operation
    User saveUser(User user);
    List<User> getAllUser();
    User getUser(String userId);
//    TODO:Delete

//    TODO:Update
    User updateUser(User user);

}

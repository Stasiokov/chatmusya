package com.stasio.chatmusya.service;

import com.stasio.chatmusya.entity.Login;
import com.stasio.chatmusya.entity.User;

public interface UserService {
    void register(User user);
    User validateUser(Login login);
}

package com.stasio.chatmusya.dao;

import com.stasio.chatmusya.entity.Login;
import com.stasio.chatmusya.entity.User;

public interface UserDao {
    void register(User user);
    User validateUser(Login login);
}

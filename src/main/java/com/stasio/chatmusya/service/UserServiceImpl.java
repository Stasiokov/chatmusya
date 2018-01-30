package com.stasio.chatmusya.service;

import com.stasio.chatmusya.dao.UserDao;
import com.stasio.chatmusya.entity.Login;
import com.stasio.chatmusya.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void register(User user) {
        userDao.register(user);
    }

    @Override
    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }
}

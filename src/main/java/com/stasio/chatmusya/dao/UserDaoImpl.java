package com.stasio.chatmusya.dao;

import com.stasio.chatmusya.entity.Login;
import com.stasio.chatmusya.entity.User;
import com.stasio.chatmusya.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void register(User user) {
        String sql = "insert into users values(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[] {
                user.getUsername(), user.getPassword(), user.getFirstname(),user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });
    }

    public User validateUser(Login login) {
        String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()+ "'";
        List<User> users = jdbcTemplate.query(sql, new UserMapper());
        return users.size() > 0 ? users.get(0) : null;
    }
}

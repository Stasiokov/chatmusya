package com.stasio.chatmusya.dao;

import com.stasio.chatmusya.entity.Message;
import com.stasio.chatmusya.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessageDaoImpl implements MessageDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void save(Message message) {
        String sql ="INSERT INTO message(msg) VALUES (?)";
        jdbcTemplate.update(sql, message.getMsg());

    }

    @Override
    public List<Message> findAll() {
        String sql = "SELECT * FROM message";
        return jdbcTemplate.query(sql, new MessageMapper());
    }

    @Override
    public List<Message> findLastFivesMsg() {
        String sql = "";
        return null;
    }
}

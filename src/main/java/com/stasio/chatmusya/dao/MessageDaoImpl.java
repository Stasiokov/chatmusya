package com.stasio.chatmusya.dao;

import com.stasio.chatmusya.entity.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessageDaoImpl implements MessageDao {
    @Override
    public void save(Message message) {

    }

    @Override
    public List<Message> findAll() {
        return null;
    }

    @Override
    public List<Message> findLastFivesMsg() {
        return null;
    }
}

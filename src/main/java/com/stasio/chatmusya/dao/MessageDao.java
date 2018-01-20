package com.stasio.chatmusya.dao;

import com.stasio.chatmusya.entity.Message;

import java.util.List;

public interface MessageDao {
    void save(Message message);
    List<Message>findAll();

}

package com.stasio.chatmusya.service;

import com.stasio.chatmusya.entity.Message;

import java.util.List;

public interface MessageService {

    void save(Message message);
    List<Message>findAll();

}

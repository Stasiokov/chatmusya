package com.stasio.chatmusya.service;

import com.stasio.chatmusya.dao.MessageDao;
import com.stasio.chatmusya.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageDao messageDao;

    @Override
    public void save(Message message) {
        messageDao.save(message);
    }

    @Override
    public List<Message> findAll() {
        return messageDao.findAll();
    }
}

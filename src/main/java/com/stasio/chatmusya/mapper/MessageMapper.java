package com.stasio.chatmusya.mapper;

import com.stasio.chatmusya.entity.Message;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageMapper implements RowMapper<Message> {


    @Override
    public Message mapRow(ResultSet resultSet, int i) throws SQLException {
        Message message = new Message();
        message.setId(resultSet.getInt("id"));
        message.setMsg(resultSet.getString("msg"));
        return message;
    }
}

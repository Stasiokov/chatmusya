package com.stasio.chatmusya.entity;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int id;
    private String msg;

    public Message() {
    }

    public Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

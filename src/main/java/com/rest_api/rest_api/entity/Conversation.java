package com.rest_api.rest_api.entity;

import javax.persistence.*;

@Entity
@Table(name="Conversation")
public class Conversation {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;

    @Column(name = "user_sender")
    Integer userSender;
    @Column(name = "user_receiving")
    Integer userReceiving;

    String status;
    @Column(name = "message_id")
    Integer messageId;

    public Conversation() {
        super();
    }

    public Conversation(Integer id, Integer userSender,Integer userReceiving, String status, Integer messageId) {
        super();
        this.id = id;
        this.userSender = userSender;
        this.userReceiving = userReceiving;
        this.status = status;
        this.messageId = messageId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserSender() {
        return userSender;
    }

    public void setUserSender(Integer userSender) {
        this.userSender = userSender;
    }

    public Integer getUserReceiving() {
        return userReceiving;
    }

    public void setUserReceiving(Integer userReceiving) {
        this.userReceiving = userReceiving;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }
}

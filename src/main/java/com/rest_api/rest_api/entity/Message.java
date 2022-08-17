package com.rest_api.rest_api.entity;

import javax.persistence.*;

@Entity
@Table(name="Message")
public class Message {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;

    String text;

    public Message() {
        super();
    }

    public Message(Integer id, String text) {
        super();
        this.id = id;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

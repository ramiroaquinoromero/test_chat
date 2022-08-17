package com.rest_api.rest_api.entity;

import javax.persistence.*;

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
    String name;
    @Column(name = "last_name")
    String lastName;
    String mail;
    String username;
    String password;

    public User() {
        super();
    }

    public User(Integer id, String name, String lastName, String mail, String username, String password) {
        super();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

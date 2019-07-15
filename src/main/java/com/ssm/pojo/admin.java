package com.ssm.pojo;

import java.io.Serializable;

public class admin implements Serializable {
    private int id;
    private String users;
    private String pwd;
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "admin{" +
                "id=" + id +
                ", users='" + users + '\'' +
                ", pwd='" + pwd + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}

package com.example.carhatt.models;

public class User {
    String ID_num,name, cell,email,password;
    public User(String name, String ID_num, String cell, String email,String password){
        ID_num = this.ID_num;
        name = this.name;
        email = this.email;
        cell = this.cell;
        password = this.password;
    }
    public User(){}
}

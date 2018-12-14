package com.matritel.kedua.entity;

import javax.xml.bind.annotation.*;
import javax.persistence.*;

//@Entity


public class Person {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    @Column(name = "ID")
    private Integer ID;
//    @Column(name = "FIRSTNAME")
    private String firstname;
//    @Column(name = "LASTNAME")
    private String lastname;
//    @Column(name = "BIRTHDAY")
    private String birthday;
//    @Column(name = "NICKNAME")
    private String nickname;

    public Integer getID() {
        return this.ID;
    }
    public void setID(int id){
        this.ID = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public Person() {
    }

    public Person(Integer ID, String firstname, String lastname, String birthday, String nickname) {
        this.ID = ID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}

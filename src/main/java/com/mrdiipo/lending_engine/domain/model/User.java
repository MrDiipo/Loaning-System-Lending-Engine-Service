package com.mrdiipo.lending_engine.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@ToString
@EqualsAndHashCode
@Getter
@Setter
@Entity
public final class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "username", nullable = false)
    private String username;

    private  String firstName;
    private  String lastName;
    private  int age;
    private  String occupation;

    public User(String username, String firstName, String lastName, int age, String occupation) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    public User() {
    }
}

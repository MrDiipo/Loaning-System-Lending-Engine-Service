package com.mrdiipo.profile.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@EqualsAndHashCode
@Getter
@Setter
public class User {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String occupation;

    public User(String firstName, String lastName, int age, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

}

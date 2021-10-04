package com.mrdiipo.profile.domain.exception;

public class UserNotFound extends RuntimeException{

    public UserNotFound(long userId) {
        super("User with id: " + userId + " not found");
    }
}

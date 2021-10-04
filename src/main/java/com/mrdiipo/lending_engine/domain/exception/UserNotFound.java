package com.mrdiipo.lending_engine.domain.exception;

public class UserNotFound extends RuntimeException{

    public UserNotFound(long userId) {
        super("User with id: " + userId + " not found");
    }

    public UserNotFound(String message) {
        super("User with id: " + message + " not found");
    }
}

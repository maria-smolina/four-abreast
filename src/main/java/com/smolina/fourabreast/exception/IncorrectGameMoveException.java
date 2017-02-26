package com.smolina.fourabreast.exception;

public class IncorrectGameMoveException extends Exception {
    public IncorrectGameMoveException() {}

    public IncorrectGameMoveException(String message) {
        super(message);
    }
}

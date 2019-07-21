package org.opticstore.view;

public enum UserMessages {

    WELCOME("Welcome to our WebOpticStore"),
    ENTER_LOGIN("Enter Login number:"),
    LOGIN_FAILED("Login failed, try again");

    // -----------------------------------------------------------------------------------------------------------------

    private String message;

    // -----------------------------------------------------------------------------------------------------------------

    UserMessages(String message) {
        this.message = message;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public String getMessage() {
        return message;
    }
}

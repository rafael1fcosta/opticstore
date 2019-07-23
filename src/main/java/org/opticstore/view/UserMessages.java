package org.opticstore.view;

public enum UserMessages {

    WELCOME("Welcome to our WebOpticStore"),
    ENTER_LOGIN("Enter Login number:"),
    LOGIN_FAILED("Login failed, try again"),
    SETTING_PRESCRIPTION("Let's set your prescription"),
    ENTER_SPHERE("Enter sphere:"),
    ENTER_CIL("Enter cil:"),
    ENTER_AXIS("Enter axis");

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

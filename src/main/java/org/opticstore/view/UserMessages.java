package org.opticstore.view;

public enum UserMessages {

    WELCOME("Welcome to our WebOpticStore"),
    ENTER_LOGIN("Enter Login number:"),
    LOGIN_FAILED("Login failed, try again"),
    SETTING_PRESCRIPTION("Let's set your prescription"),
    SPHERE("Enter sphere:"),
    CIL("Enter cil:"),
    AXIS("Enter axis"),
    CHOOSE_EYEWEAR("Choose EyeWear:"),
    INVALID_VALUE("That value is not valid.");

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

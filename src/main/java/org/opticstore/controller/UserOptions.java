package org.opticstore.controller;

public enum UserOptions {

    GLASSES(1, " - GLASSES"),
    CONTACT_LENS(2, " - CONTACT LENS");

    // -----------------------------------------------------------------------------------------------------------------

    private double option;
    private String message;

    // -----------------------------------------------------------------------------------------------------------------

    UserOptions(double option, String message) {
        this.option = option;
        this.message = message;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public double getOption() {
        return option;
    }

    public String getMessage() {
        return message;
    }

    public static UserOptions getUserOption(double choice) throws IllegalArgumentException {

        for (UserOptions option : UserOptions.values()) {
            if (choice == option.getOption()) {
                return option;
            }
        }

        throw new IllegalArgumentException();
    }
}

package org.opticstore.view;

import org.opticstore.controller.UserOptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GenericView implements View {


    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public void display(UserMessages message) {

        System.out.println(message.getMessage());
    }

    @Override
    public void display(UserOptions message) {

        System.out.println( (int) message.getOption() + message.getMessage());
    }

    @Override
    public Double getCustomerInput() {

        Scanner input = new Scanner(System.in);
        Double number;

        try {
            number = input.nextDouble();

        } catch (InputMismatchException e) {
            System.err.println("Not a number. Try again");
            number = getCustomerInput();
        }

        System.out.println(number);

        return number;
    }
}

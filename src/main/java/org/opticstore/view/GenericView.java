package org.opticstore.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GenericView implements View {


    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public void display(UserMessages message) {

        System.out.println(message.getMessage());
    }

    @Override
    public Double getCustomerOption() {

        Scanner input = new Scanner(System.in);
        Double number;

        try {
            number = input.nextDouble();

        } catch (InputMismatchException e) {
            System.err.println("Not a number. Try again");
            number = getCustomerOption();
        }

        System.out.println(number);

        return number;
    }
}

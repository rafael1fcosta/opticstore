package org.opticstore.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenericView implements View {


    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public void display(String message) {

        System.out.println(message);
    }

    @Override
    public String getCustomerOption() {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            return bufferedReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        throw new IllegalArgumentException();
    }
}

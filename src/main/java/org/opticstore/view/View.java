package org.opticstore.view;


import org.opticstore.controller.UserOptions;

public interface View {

    void display(UserMessages message);

    void display(UserOptions message);

    Double getCustomerInput();
}

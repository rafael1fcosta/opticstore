package org.opticstore.controller;

import org.opticstore.service.Service;
import org.opticstore.view.UserMessages;
import org.opticstore.view.View;

public class ControllerImpl extends AbstractController {


    // -----------------------------------------------------------------------------------------------------------------

    public ControllerImpl(View view, Service service) {
        super(view, service);
    }

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public void init() {
        view.display(UserMessages.WELCOME.getMessage());
        view.display(UserMessages.ENTER_LOGIN.getMessage());

        String input = view.getCustomerOption();

        if(!service.authenticate(input)) {
            view.display(UserMessages.LOGIN_FAILED.getMessage());
            init();
            return;
        }



    }

}

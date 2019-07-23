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

        view.display(UserMessages.WELCOME);
        view.display(UserMessages.ENTER_LOGIN);

        Double input = view.getCustomerOption();

        System.out.println(input + " on controller");

        if(!service.authenticate(input)) {
            view.display(UserMessages.LOGIN_FAILED);
            init();
            return;
        }

        if (!service.getClientPrescription()) {
            setPrescription();
        }



    }

    private void setPrescription() {

        view.display(UserMessages.SETTING_PRESCRIPTION);

        Double sphere = displayAndGetInput(UserMessages.ENTER_SPHERE);
        Double cil = displayAndGetInput(UserMessages.ENTER_CIL);
        Double axis = displayAndGetInput(UserMessages.ENTER_AXIS);

        service.setClientPrescription(sphere, cil, axis);
    }

    private Double displayAndGetInput(UserMessages message) {
        view.display(message);
        return view.getCustomerOption();
    }
}

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

        if (!authenticate()){
            init();
            return;
        }

        System.out.println("-------------------");

        setPrescription();

        System.out.println("-------------------");

        chooseEyeWear();

        System.out.println("-------------------");
    }

    // -----------------------------------------------------------------------------------------------------------------

    private boolean authenticate() {
        view.display(UserMessages.WELCOME);
        view.display(UserMessages.ENTER_LOGIN);

        Double clientId = view.getCustomerInput();

        if(!service.authenticate(clientId)) {
            view.display(UserMessages.LOGIN_FAILED);
            return false;
        }
        return true;
    }

    private void setPrescription() {

        if (service.getClientPrescription()) {
            return;
        }

        view.display(UserMessages.SETTING_PRESCRIPTION);

        Double sphere = displayAndGetInput(UserMessages.SPHERE);
        Double cil = displayAndGetInput(UserMessages.CIL);
        Double axis = displayAndGetInput(UserMessages.AXIS);

        service.setClientPrescription(sphere, cil, axis);
    }

    private Double displayAndGetInput(UserMessages option) {

        view.display(option);

        Double input = view.getCustomerInput();

        if (!PrescriptionRestrictions.isInLimit(option, input)) {
            view.display(UserMessages.INVALID_VALUE);
            return displayAndGetInput(option);
        }

        return input;
    }

    private void chooseEyeWear() {

        view.display(UserMessages.CHOOSE_EYEWEAR);
        view.display(UserOptions.GLASSES);
        view.display(UserOptions.CONTACT_LENS);

        Double choice = view.getCustomerInput();

        try {
            handleEyeWearChoice(choice);

        } catch (IllegalArgumentException e) {
            System.err.println("Not a valid option.");
            chooseEyeWear();
        }
    }

    private void handleEyeWearChoice(Double choice) throws IllegalArgumentException {

        UserOptions userOption = UserOptions.getUserOption(choice);

        switch (userOption) {

            case GLASSES:

                break;

            case CONTACT_LENS:

                break;
        }
    }
}

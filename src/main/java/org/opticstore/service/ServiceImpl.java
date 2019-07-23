package org.opticstore.service;

import org.opticstore.dao.Dao;
import org.opticstore.model.Customer;
import org.opticstore.model.Prescription;
import org.opticstore.model.PrescriptionImpl;

public class ServiceImpl implements Service {

    private Dao dao;
    private Customer loggedInCustomer;

    // -----------------------------------------------------------------------------------------------------------------

    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public boolean authenticate(Double id) {

        Customer customer = dao.findCustomer(id.intValue());
        loggedInCustomer = customer;

        return customer != null;
    }

    @Override
    public boolean getClientPrescription() {

        if (loggedInCustomer.getPrescription() != null) {
            return true;
        }

        return false;
    }

    @Override
    public void setClientPrescription(Double sphere, Double cil, Double axis) {

        //Prescription prescription = new PrescriptionImpl(sphere, cil, axis); //TODO: client input in double..?

        //loggedInCustomer.setPrescription(prescription);
    }

}

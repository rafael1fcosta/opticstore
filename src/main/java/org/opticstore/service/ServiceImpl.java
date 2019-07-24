package org.opticstore.service;

import org.opticstore.dao.Dao;
import org.opticstore.model.Customer;
import org.opticstore.model.Prescription;
import org.opticstore.model.PrescriptionImpl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

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

        return loggedInCustomer.getPrescription() != null;

    }

    @Override
    public void setClientPrescription(Double sphere, Double cil, Double axis) {

        Prescription prescription = new PrescriptionImpl(sphere, cil, axis);

        loggedInCustomer.setPrescription(prescription);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");


        System.out.println("sphere " + decimalFormat.format(prescription.getSphere()));
        System.out.println("cil " + prescription.getCil());
        System.out.println("axis " + prescription.getAxis());
    }

}

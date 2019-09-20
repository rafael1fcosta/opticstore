package org.opticstore.service;

import org.opticstore.dao.AbstractDao;
import org.opticstore.model.costumer.Customer;
import org.opticstore.model.costumer.Prescription;

import java.text.DecimalFormat;

public class ServiceImpl implements Service {

    private AbstractDao<Customer> customerDao;
    private AbstractDao<Prescription> prescriptionDao;

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public boolean authenticate(Double id) {

        Customer customer = customerDao.find(id.intValue());

        prescriptionDao.setLoggedInCustomer(customer);
        customerDao.setLoggedInCustomer(customer);

        return customer != null;
    }

    @Override
    public boolean clientHasPrescription() {

        return !customerDao.getLoggedInCustomer().getPrescriptionMap().isEmpty();

    }

    @Override
    public void setClientPrescription(Double sphere, Double cil, Double axis) {

        Prescription prescription = new Prescription(sphere, cil, axis);

        prescriptionDao.add(prescription);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.println("sphere " + decimalFormat.format(prescription.getSphere()));
        System.out.println("cil " + prescription.getCil());
        System.out.println("axis " + prescription.getAxis());
    }

    @Override
    public void setCustomerDao(AbstractDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void setPrescriptionDao(AbstractDao prescriptionDao) {
        this.prescriptionDao = prescriptionDao;
    }

}

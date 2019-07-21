package org.opticstore.dao;

import org.opticstore.model.Customer;
import org.opticstore.model.Prescription;

public interface Dao {

    void addCustomer(Customer customer);

    void addPrescription(Integer customerId, Prescription prescription);

    Customer findCustomer(Integer id);
}

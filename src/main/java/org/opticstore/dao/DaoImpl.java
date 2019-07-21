package org.opticstore.dao;

import org.opticstore.model.Customer;
import org.opticstore.model.Prescription;

import java.util.Map;

public class DaoImpl implements Dao {

    private Map<Integer, Customer> customerMap;

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public void addCustomer(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public void addPrescription(Integer customerId, Prescription prescription) {
        customerMap.get(customerId).setPrescription(prescription);
    }

    @Override
    public Customer findCustomer(Integer id) {
        return null;
    }
}

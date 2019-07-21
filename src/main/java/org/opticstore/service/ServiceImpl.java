package org.opticstore.service;

import org.opticstore.dao.Dao;
import org.opticstore.model.Customer;

public class ServiceImpl implements Service {

    private Dao dao;
    private Customer loggedInCustomer;

    // -----------------------------------------------------------------------------------------------------------------

    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public boolean authenticate(String id) {

        Customer customer = dao.findCustomer(Integer.valueOf(id));
        loggedInCustomer = customer;

        return customer != null;
    }

}

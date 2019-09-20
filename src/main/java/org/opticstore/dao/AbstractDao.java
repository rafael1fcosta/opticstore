package org.opticstore.dao;

import org.opticstore.model.costumer.Customer;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDao<T> implements Dao<T> {

    private Customer loggedInCustomer;

    private static Map<Integer, Customer> customerMap = new HashMap<>();


    public Map<Integer, Customer> getCustomerMap() {
        return customerMap;
    }

    public Customer getLoggedInCustomer() {
        return loggedInCustomer;
    }

    public void setLoggedInCustomer(Customer loggedInCustomer) {
        this.loggedInCustomer = loggedInCustomer;
    }

}

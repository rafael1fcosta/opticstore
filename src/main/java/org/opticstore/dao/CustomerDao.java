package org.opticstore.dao;

import org.opticstore.model.costumer.Customer;

public class CustomerDao extends AbstractDao<Customer>  {

    @Override
    public void add(Customer customer) {
        getCustomerMap().put(customer.getId(), customer);
    }


    @Override
    public Customer find(Integer id) {
        return getCustomerMap().get(id);
    }
}

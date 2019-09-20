package org.opticstore;

import org.opticstore.controller.Controller;
import org.opticstore.controller.ControllerImpl;
import org.opticstore.dao.AbstractDao;
import org.opticstore.dao.CustomerDao;
import org.opticstore.dao.PrescriptionDao;
import org.opticstore.model.costumer.Customer;
import org.opticstore.model.costumer.Prescription;
import org.opticstore.service.Service;
import org.opticstore.service.ServiceImpl;
import org.opticstore.view.GenericView;
import org.opticstore.view.View;

public class Main {

    public static void main(String[] args) {

        //for test
        View view = new GenericView();
        AbstractDao<Customer> customerDao = new CustomerDao();
        AbstractDao<Prescription> prescriptionDao = new PrescriptionDao();

        customerDao.add( new Customer("Rafa"));

        Service service = new ServiceImpl();
        service.setCustomerDao(customerDao);
        service.setPrescriptionDao(prescriptionDao);

        Controller controller = new ControllerImpl(view, service);

        controller.init();
    }
}

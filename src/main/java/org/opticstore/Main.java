package org.opticstore;

import org.opticstore.controller.Controller;
import org.opticstore.controller.ControllerImpl;
import org.opticstore.dao.Dao;
import org.opticstore.dao.DaoImpl;
import org.opticstore.model.CustomerImpl;
import org.opticstore.service.Service;
import org.opticstore.service.ServiceImpl;
import org.opticstore.view.GenericView;
import org.opticstore.view.View;

public class Main {

    public static void main(String[] args) {

        //for test
        View view = new GenericView();
        Dao dao = new DaoImpl();

        dao.addCustomer(new CustomerImpl("rafa", 1));

        Service service = new ServiceImpl(dao);

        Controller controller = new ControllerImpl(view, service);

        controller.init();

    }
}

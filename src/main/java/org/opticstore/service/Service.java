package org.opticstore.service;

import org.opticstore.dao.AbstractDao;

public interface Service {

    boolean authenticate(Double id);

    boolean clientHasPrescription();

    void setClientPrescription(Double sphere, Double cil, Double axis);

    void setCustomerDao(AbstractDao customerDao);

    void setPrescriptionDao(AbstractDao prescriptionDao);
}

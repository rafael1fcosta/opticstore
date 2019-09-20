package org.opticstore.dao;

import org.opticstore.model.costumer.Prescription;

public class PrescriptionDao extends AbstractDao<Prescription> {

    @Override
    public void add(Prescription prescription) {
        getLoggedInCustomer().getPrescriptionMap().put(prescription.getId(), prescription);
    }

    @Override
    public Prescription find(Integer id) {
        return getLoggedInCustomer().getPrescriptionMap().get(id);
    }

}

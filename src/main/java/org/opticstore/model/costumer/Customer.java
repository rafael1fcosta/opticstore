package org.opticstore.model.costumer;

import org.opticstore.model.AbstractModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer extends AbstractModel {

    private static Integer customerCounter = 0;

    private String name;
    private Map<Integer, Prescription> prescriptionMap;

    public Customer(String name) {
        super.setId(++customerCounter);
        this.name = name;
        this.prescriptionMap = new HashMap<>();
    }

    public Map<Integer, Prescription> getPrescriptionMap() {
        return prescriptionMap;
    }
}

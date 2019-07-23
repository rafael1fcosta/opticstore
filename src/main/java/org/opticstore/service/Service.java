package org.opticstore.service;

public interface Service {

    boolean authenticate(Double id);

    boolean getClientPrescription();

    void setClientPrescription(Double sphere, Double cil, Double axis);
}

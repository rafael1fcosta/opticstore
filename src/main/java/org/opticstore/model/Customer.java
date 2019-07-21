package org.opticstore.model;

public interface Customer {

    String getName();

    Integer getId();

    Prescription getPrescription();

    String getEmail();

    Integer getNumberOfPurchases();

    void setPrescription(Prescription prescription);

    void setEmail(String email);

    void setNumberOfPurchases(Integer numberOfPurchases);
}

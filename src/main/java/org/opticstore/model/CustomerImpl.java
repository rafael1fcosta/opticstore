package org.opticstore.model;

public class CustomerImpl implements Customer {

    private String name;
    private Integer id;
    private Prescription prescription;
    private String email;
    private Integer numberOfPurchases;

    // -----------------------------------------------------------------------------------------------------------------

    public CustomerImpl(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Prescription getPrescription() {
        return prescription;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public Integer getNumberOfPurchases() {
        return numberOfPurchases;
    }

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setNumberOfPurchases(Integer numberOfPurchases) {
        this.numberOfPurchases = numberOfPurchases;
    }
}

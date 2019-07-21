package org.opticstore.model;

public class PrescriptionImpl implements Prescription {

    private double sphere;
    private double cil;
    private double axis;

    // -----------------------------------------------------------------------------------------------------------------

    public PrescriptionImpl(double sphere, double cil, double axis) {
        this.sphere = sphere;
        this.cil = cil;
        this.axis = axis;
    }

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public double getSphere() {
        return sphere;
    }

    @Override
    public double getCil() {
        return cil;
    }

    @Override
    public double getAxis() {
        return axis;
    }
}

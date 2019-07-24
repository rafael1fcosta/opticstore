package org.opticstore.model;

import java.text.DecimalFormat;

public class PrescriptionImpl implements Prescription {

    private double sphere;
    private double cil;
    private double axis;

    private final DecimalFormat decimalFormat = new DecimalFormat("#.00");

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

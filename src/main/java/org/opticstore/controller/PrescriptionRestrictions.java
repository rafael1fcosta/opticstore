package org.opticstore.controller;

import org.opticstore.view.UserMessages;

public enum PrescriptionRestrictions {

    SPHERE_LIMIT(20, -20),
    CIL_LIMIT(8, -8),
    AXIS_LIMIT(180, 0);

    // -----------------------------------------------------------------------------------------------------------------

    private Double maxLimit;
    private Double minLimit;

    // -----------------------------------------------------------------------------------------------------------------

    PrescriptionRestrictions(double maxLimit, double minLimit) {
        this.maxLimit = maxLimit;
        this.minLimit = minLimit;
    }

    public static boolean isInLimit(UserMessages option, Double value) {

        switch (option) {
            case SPHERE:
                return value <= SPHERE_LIMIT.maxLimit && value >= SPHERE_LIMIT.minLimit;
            case CIL:
                return value <= CIL_LIMIT.maxLimit && value >= CIL_LIMIT.minLimit;
            case AXIS:
                return value <= AXIS_LIMIT.maxLimit && value >= CIL_LIMIT.minLimit;
        }
        throw new IllegalStateException("Problem in restrictions.");
    }


}

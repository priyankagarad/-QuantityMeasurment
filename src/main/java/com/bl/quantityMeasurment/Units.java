package com.bl.quantityMeasurment;
public enum  Units {
    INCH(1.0),FEET(1*12.0),YARD(1*36.0),CM_TO_INCH(1/2.5);

    final double unit;
    Units(double unit)
    {
        this.unit=unit;
    }
}

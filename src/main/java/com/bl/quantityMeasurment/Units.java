package com.bl.quantityMeasurment;
public enum  Units {
    INCH(1/12.0),FEET(1*12.0);
    final double unit;

    Units(double unit)
    {
        this.unit=unit;
    }
}

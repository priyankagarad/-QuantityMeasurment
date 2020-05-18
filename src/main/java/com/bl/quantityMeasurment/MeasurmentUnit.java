package com.bl.quantityMeasurment;
public enum MeasurmentUnit {
    /** Enum For Inch */
    INCH(1.0),

    /** Enum For Feet */
    FEET(1*12.0),

    /** Enum For Yard */
    YARD(1*36.0),

    /** Enum For CM to inch */
    CM_TO_INCH(1/2.5),

    /** Enum For Litre */
    LITRE(1.0),

    /** Enum For Gallon to Litre */
    GALLON_TO_LITRE(1*3.78),

    /** Enum For milliliter too litre */
    MILLILITER_TO_LITRE(1.0/1000),

    /** Enum For tonne to kg */
    TONNE_TO_KG(1.0),

    /** Enum For grams to kg */
    GRAMS_TO_KG(1.0/1000),

    /** Enum For celsius */
    CELSIUS(1.0*2.12),

    /** Enum For Fahrenheit to celsius */
    FAHRENHEIT_TO_CELSIUS(1.0);

    public final double measurmentUnit;
    MeasurmentUnit(double unit)
    {
        this.measurmentUnit=unit;
    }
}

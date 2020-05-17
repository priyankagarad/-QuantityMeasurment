package com.bl.quantityMeasurment;
public class QuantityMeasurment
{
    private double feet;
    private  double inch;

    public double getFeetValue(double feet){
        return feet;
    }

    public double getInchValue(double inch) {
        return inch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurment that =(QuantityMeasurment) o;
        return Double.compare(that.feet, feet) == 0;
    }
}

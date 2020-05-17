package com.bl.quantityMeasurment;
public class QuantityMeasurment {
    public double unitConversion(Units units, double value) {
        return value * units.unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (this==obj)return true;
        if (this.getClass()==obj.getClass())return true;
        return super.equals(obj);
    }
}
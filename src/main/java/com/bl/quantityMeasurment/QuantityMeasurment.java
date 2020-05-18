/*****************************************************************************************************************
 * @purpose:Quantity Measurment Class is used for Convert value in different Unit and Calculate Result
 * @Author:Priyanka
 * @Date:-18/5/2020
 ****************************************************************************************************************/
package com.bl.quantityMeasurment;
public class QuantityMeasurment
{
    /**
     * @purpose:Override: Method Used For Check Equality of Object
     * @param obj:Reference Object
     * @return:return Result True or False
     */
    @Override
    public boolean equals(Object obj) {
        if (obj==null)
            return false;

        if (this==obj)
            return true;

        if (this.getClass()==obj.getClass())
            return true;

        return super.equals(obj);
    }

    /**
     * @Purpose:UnitComparator Method Pass The Different Unit and Value,and Calculated Result
     * @param units:Units is variable that Pass Different Type of Unit in Method
     * @param value:Value is variable
     * @return:Return result depend On UnitType
     */
    public double UnitComparator(MeasurmentUnit units, double value) {
        return value * units.measurmentUnit;
    }
}
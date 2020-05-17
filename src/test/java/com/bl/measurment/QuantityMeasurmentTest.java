package com.bl.measurment;
import com.bl.quantityMeasurment.QuantityMeasurment;
import com.bl.quantityMeasurment.Units;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class QuantityMeasurmentTest {
    QuantityMeasurment quantityMeasurment;

    @Before
    public void setUp(){
        quantityMeasurment=new QuantityMeasurment();
    }

    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ThenShouldReturnTrue()
    {
        double feetValue1=quantityMeasurment.unitConversion(Units.FEET,0.0);
        double feetValue2=quantityMeasurment.unitConversion(Units.FEET,0.0);
        Assert.assertEquals(feetValue1,feetValue2,0.0);
    }

    @Test
    public void givenFeetValue_WhenNull_ThenShouldReturnFalse()
    {
        boolean checkNullValue=quantityMeasurment.equals(null);
        Assert.assertEquals(false,checkNullValue);
    }

    @Test
    public void givenRefrenceObject_WhenEqual_ShouldReturnTrue()
    {
        QuantityMeasurment referenceCheck=new QuantityMeasurment();
        Assert.assertEquals(quantityMeasurment,referenceCheck);
    }

    @Test
    public void givenSameTypeValue_WhenCompare_ShouldReturnTrue() {
        double type1=quantityMeasurment.unitConversion(Units.FEET,10.0);
        double type2=quantityMeasurment.unitConversion(Units.FEET,10.0);
        Assert.assertEquals(type1,type2,0.0);
    }

    @Test
    public void givenTwoDifferentFeetValues_WhenNotEqual_ShouldReturnFalse() {
        double result1 = quantityMeasurment.unitConversion(Units.FEET,10.5);
        double result2 = quantityMeasurment.unitConversion(Units.FEET,12.0);
        Assert.assertNotEquals(result1,result2, 0.0);
    }

    @Test
    public void givenInchValue_WhenNull_ThenShouldReturnFalse()
    {
        boolean checkNullValue1=quantityMeasurment.equals(null);
        Assert.assertEquals(false,checkNullValue1);
    }

    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ThenShouldReturnTrue()
    {
        double value1=quantityMeasurment.unitConversion(Units.FEET,0.0);
        double value2=quantityMeasurment.unitConversion(Units.FEET,0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenRefrenceObjectForInch_WhenEqual_ThenShouldReturnTrue()
    {
        QuantityMeasurment referanceValue=new QuantityMeasurment();
        Assert.assertEquals(quantityMeasurment,referanceValue);
    }

    @Test
    public void givenDiffrentTypeCheckObjectInch_WhenEqual_ThenShouldReturnFalse()
    {
        Object object=new Object();
        Assert.assertFalse(quantityMeasurment.equals(object));
    }

    @Test
    public void givenTwoEqualInchValue_WhenEqual_ThenShouldReturnTrue()
    {
        double value1=quantityMeasurment.unitConversion(Units.FEET,5.0);
        double value2=quantityMeasurment.unitConversion(Units.FEET,5.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenTwoDifferentInchValues_WhenNotEqual_ShouldReturnFalse() {
        double result1 = quantityMeasurment.unitConversion(Units.FEET,10.5);
        double result2 = quantityMeasurment.unitConversion(Units.FEET,12.0);
        Assert.assertNotEquals(result1,result2, 0.0);
    }
    @Test
    public void givenZeroFeetAndZeroInchValue_WhenEqual_ThenShouldReturnTrue()
    {
        double value1=quantityMeasurment.unitConversion(Units.FEET,0.0);
        double value2=quantityMeasurment.unitConversion(Units.INCH,0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

}

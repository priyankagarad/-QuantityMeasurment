package com.bl.measurment;
import com.bl.quantityMeasurment.QuantityMeasurment;
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
        double value1=quantityMeasurment.getFeetValue(0.0);
        double value2=quantityMeasurment.getFeetValue(0.0);
        Assert.assertEquals(value1,value2,0.0);
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
    public void givenSameTypeWhenCompare_ShouldReturnTrue() {
        double type1=quantityMeasurment.getFeetValue(10.0);
        double type2=quantityMeasurment.getFeetValue(10.0);
        Assert.assertEquals(type1,type2,0.0);
    }

}

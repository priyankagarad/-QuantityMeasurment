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
}

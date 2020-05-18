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
    public void givenZeroFeetAndZeroInchValue_WhenEqual_shouldReturnTrue()
    {
        double value1=quantityMeasurment.unitConversion(Units.FEET,0.0);
        double value2=quantityMeasurment.unitConversion(Units.INCH,0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenOneFeetAndOneInchValue_WhenNotEqual_ShouldReturnFalse()
    {
        double value1=quantityMeasurment.unitConversion(Units.FEET,1.0);
        double value2=quantityMeasurment.unitConversion(Units.INCH,1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    @Test
    public void givenOneInchAndOneFeetValue_WhenNotEqual_ShouldReturnFalse()
    {
        double value2=quantityMeasurment.unitConversion(Units.INCH,1.0);
        double value1=quantityMeasurment.unitConversion(Units.FEET,1.0);
        Assert.assertNotEquals(value2,value1,0.0);
    }

    @Test
    public void givenOneFeetAndTwelveFeetValue_WhenNotEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurment.unitConversion(Units.FEET,1.0);
        double value2=quantityMeasurment.unitConversion(Units.INCH,12.0);
        Assert.assertEquals(value2,value1,0.0);
    }

    @Test
    public void givenTwelveFeetAndOneFeetValue_WhenNotEqual_ShouldReturnFalse()
    {
        double value1=quantityMeasurment.unitConversion(Units.FEET,12.0);
        double value2=quantityMeasurment.unitConversion(Units.INCH,1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    @Test
    public void givenThreeFeetAndOneYardValue_WhenEqual_ShouldReturnTrue()
    {
        double feetValue=quantityMeasurment.unitConversion(Units.FEET,3.0);
        double yardValue=quantityMeasurment.unitConversion(Units.YARD,1.0);
        Assert.assertEquals(yardValue,feetValue,0.0);
    }

    @Test
    public void givenOneFeetAndOneYardValue_WhenNotEqual_ShouldReturnFalse()
    {
        double feetValue=quantityMeasurment.unitConversion(Units.FEET,1.0);
        double yardValue=quantityMeasurment.unitConversion(Units.YARD,3.0);
        Assert.assertNotEquals(yardValue,feetValue,0.0);
    }

    @Test
    public void givenOneInchAndOneYardValue_WhenNotEqual_ShouldReturnFalse()
    {
        double feetValue=quantityMeasurment.unitConversion(Units.FEET,1.0);
        double yardValue=quantityMeasurment.unitConversion(Units.YARD,3.0);
        Assert.assertNotEquals(feetValue,yardValue,0.0);
    }

    @Test
    public void givenOneYardAndThirtySixInchValue_WhenEqual_ShouldReturnTrue()
    {
        double yardValue=quantityMeasurment.unitConversion(Units.YARD,1.0);
        double inchValue=quantityMeasurment.unitConversion(Units.INCH,36.0);
        Assert.assertEquals(yardValue,inchValue,0.0);
    }

    @Test
    public void givenOneInchAndThirtySixYardValue_WhenEqual_ShouldReturnTrue()
    {
        double inchValue=quantityMeasurment.unitConversion(Units.INCH,1.0);
        double yardValue=quantityMeasurment.unitConversion(Units.YARD,36.0);
        Assert.assertEquals(inchValue,yardValue,0.0);
    }

    @Test
    public void givenOneYardAndThreeFeetValue_WhenEqual_ShouldReturnTrue()
    {
        double yardValue=quantityMeasurment.unitConversion(Units.YARD,1.0);
        double feetValue=quantityMeasurment.unitConversion(Units.FEET,3.0);
        Assert.assertEquals(yardValue,feetValue,0.0);
    }

    @Test
    public void givenTwoInchAndFiveCmValue_WhenEqual_ShouldReturnCorrectResult()
    {
        double inchValue=quantityMeasurment.unitConversion(Units.INCH,2.0);
        double cmValue=quantityMeasurment.unitConversion(Units.CM_TO_INCH,5);
        Assert.assertEquals(inchValue,cmValue,0.0);
    }

    @Test
    public void givenTwoInchAndTwoInchValue_WhenAdd_ShouldReturnFour()
    {
        double inchValue1=quantityMeasurment.unitConversion(Units.INCH,2.0);
        double inchValue2=quantityMeasurment.unitConversion(Units.INCH,2.0);
        double result=inchValue1+inchValue2;
        Assert.assertEquals(4,result,0.0);
    }

    @Test
    public void givenOneFeetAndTwoInchValue_WhenAdd_ShouldReturnForty()
    {
        double feetValue1=quantityMeasurment.unitConversion(Units.FEET,1.0);
        double inchValue2=quantityMeasurment.unitConversion(Units.INCH,2.0);
        Assert.assertEquals(14,feetValue1+inchValue2,0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenAdded_ShouldReturnTwentyFourInch()
    {
        double feetValue1=quantityMeasurment.unitConversion(Units.FEET,1.0);
        double feetValue2=quantityMeasurment.unitConversion(Units.FEET,1.0);
        Assert.assertEquals(24,feetValue1+feetValue2,0.0);
    }

    @Test
    public void givenTwoInchAndTwoPointFiveCm_WhenAdded_ShouldReturnThreeInch()
    {
        double inchValue1=quantityMeasurment.unitConversion(Units.INCH,2.0);
        double feetValue2=quantityMeasurment.unitConversion(Units.CM_TO_INCH,2.5);
        Assert.assertEquals(3,inchValue1+feetValue2,0.0);
    }

    @Test
    public void givenOneGallonAndThreePointSevenEightLit_WhenEqual_ShouldReturnTrue()
    {
        double gallonValue=quantityMeasurment.unitConversion(Units.GALLON_TO_LITRE,1.0);
        double litreValue=quantityMeasurment.unitConversion(Units.LITRE,3.78);
        Assert.assertEquals(7.56,gallonValue+litreValue,0.0);
    }

    @Test
    public void givenOneLitreAndOneThousandMilliLitre_WhenEqual_ShouldReturnTwoLitres()
    {
        double litreValue=quantityMeasurment.unitConversion(Units.LITRE,1.0);
        double milliLitreValue=quantityMeasurment.unitConversion(Units.MILLILITER_TO_LITRE,1000);
        Assert.assertEquals(2,litreValue+milliLitreValue,0.0);
    }
}

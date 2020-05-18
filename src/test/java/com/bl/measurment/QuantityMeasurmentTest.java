package com.bl.measurment;
import com.bl.quantityMeasurment.QuantityMeasurment;
import com.bl.quantityMeasurment.MeasurmentUnit;
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
        double feetValue1=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,0.0);
        double feetValue2=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,0.0);
        Assert.assertEquals(feetValue1,feetValue2,0.0);
    }

    @Test
    public void givenFeetValue_WhenNull_ThenShouldReturnFalse()
    {
        boolean checkNullValue=quantityMeasurment.equals(null);
        Assert.assertEquals(false,checkNullValue);
    }

    @Test
    public void givenRefrenceObject_WhenEqual_shouldReturnTrue()
    {
        QuantityMeasurment referenceCheck=new QuantityMeasurment();
        Assert.assertEquals(quantityMeasurment,referenceCheck);
    }

    @Test
    public void givenSameTypeValue_WhenCompare_shouldReturnTrue() {
        double type1=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,10.0);
        double type2=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,10.0);
        Assert.assertEquals(type1,type2,0.0);
    }

    @Test
    public void givenTwoDifferentFeetValues_WhenNotEqual_shouldReturnFalse() {
        double result1 = quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,10.5);
        double result2 = quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,12.0);
        Assert.assertNotEquals(result1,result2, 0.0);
    }

    @Test
    public void givenInchValue_WhenNull_ShouldReturnFalse()
    {
        boolean checkNullValue1=quantityMeasurment.equals(null);
        Assert.assertEquals(false,checkNullValue1);
    }

    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_shouldReturnTrue()
    {
        double value1=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,0.0);
        double value2=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenRefrenceObjectForInch_WhenEqual_shouldReturnTrue()
    {
        QuantityMeasurment referanceValue=new QuantityMeasurment();
        Assert.assertEquals(quantityMeasurment,referanceValue);
    }

    @Test
    public void givenDiffrentTypeCheckObjectInch_WhenEqual_shouldReturnFalse()
    {
        Object object=new Object();
        Assert.assertFalse(quantityMeasurment.equals(object));
    }

    @Test
    public void givenTwoEqualInchValue_WhenEqual_shouldReturnTrue()
    {
        double value1=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,5.0);
        double value2=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,5.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenTwoDifferentInchValues_WhenNotEqual_shouldReturnFalse() {
        double result1 = quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,10.5);
        double result2 = quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,12.0);
        Assert.assertNotEquals(result1,result2, 0.0);
    }
    @Test
    public void givenZeroFeetAndZeroInchValue_WhenEqual_shouldReturnTrue()
    {
        double value1=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,0.0);
        double value2=quantityMeasurment.UnitComparator(MeasurmentUnit.INCH,0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenOneFeetAndOneInchValue_WhenNotEqual_shouldReturnFalse()
    {
        double value1=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,1.0);
        double value2=quantityMeasurment.UnitComparator(MeasurmentUnit.INCH,1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    @Test
    public void givenOneInchAndOneFeetValue_WhenNotEqual_ShouldReturnFalse()
    {
        double value2=quantityMeasurment.UnitComparator(MeasurmentUnit.INCH,1.0);
        double value1=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,1.0);
        Assert.assertNotEquals(value2,value1,0.0);
    }

    @Test
    public void givenOneFeetAndTwelveFeetValue_WhenNotEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,1.0);
        double value2=quantityMeasurment.UnitComparator(MeasurmentUnit.INCH,12.0);
        Assert.assertEquals(value2,value1,0.0);
    }

    @Test
    public void givenTwelveFeetAndOneFeetValue_WhenNotEqual_shouldReturnFalse()
    {
        double value1=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,12.0);
        double value2=quantityMeasurment.UnitComparator(MeasurmentUnit.INCH,1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    @Test
    public void givenThreeFeetAndOneYardValue_WhenEqual_shouldReturnTrue()
    {
        double feetValue=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,3.0);
        double yardValue=quantityMeasurment.UnitComparator(MeasurmentUnit.YARD,1.0);
        Assert.assertEquals(yardValue,feetValue,0.0);
    }

    @Test
    public void givenOneFeetAndOneYardValue_WhenNotEqual_shouldReturnFalse()
    {
        double feetValue=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,1.0);
        double yardValue=quantityMeasurment.UnitComparator(MeasurmentUnit.YARD,3.0);
        Assert.assertNotEquals(yardValue,feetValue,0.0);
    }

    @Test
    public void givenOneInchAndOneYardValue_WhenNotEqual_shouldReturnFalse()
    {
        double feetValue=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,1.0);
        double yardValue=quantityMeasurment.UnitComparator(MeasurmentUnit.YARD,3.0);
        Assert.assertNotEquals(feetValue,yardValue,0.0);
    }

    @Test
    public void givenOneYardAndThirtySixInchValue_WhenEqual_shouldReturnTrue()
    {
        double yardValue=quantityMeasurment.UnitComparator(MeasurmentUnit.YARD,1.0);
        double inchValue=quantityMeasurment.UnitComparator(MeasurmentUnit.INCH,36.0);
        Assert.assertEquals(yardValue,inchValue,0.0);
    }

    @Test
    public void givenOneInchAndThirtySixYardValue_WhenEqual_shouldReturnTrue()
    {
        double inchValue=quantityMeasurment.UnitComparator(MeasurmentUnit.INCH,1.0);
        double yardValue=quantityMeasurment.UnitComparator(MeasurmentUnit.YARD,36.0);
        Assert.assertNotEquals(inchValue,yardValue,0.0);
    }

    @Test
    public void givenOneYardAndThreeFeetValue_WhenEqual_shouldReturnTrue()
    {
        double yardValue=quantityMeasurment.UnitComparator(MeasurmentUnit.YARD,1.0);
        double feetValue=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,3.0);
        Assert.assertEquals(yardValue,feetValue,0.0);
    }

    @Test
    public void givenTwoInchAndFiveCmValue_WhenEqual_shouldReturnCorrectResult()
    {
        double inchValue=quantityMeasurment.UnitComparator(MeasurmentUnit.INCH,2.0);
        double cmValue=quantityMeasurment.UnitComparator(MeasurmentUnit.CM_TO_INCH,5);
        Assert.assertEquals(inchValue,cmValue,0.0);
    }

    @Test
    public void givenTwoInchAndTwoInchValue_WhenAdd_shouldReturnFour()
    {
        double inchValue1=quantityMeasurment.UnitComparator(MeasurmentUnit.INCH,2.0);
        double inchValue2=quantityMeasurment.UnitComparator(MeasurmentUnit.INCH,2.0);
        double result=inchValue1+inchValue2;
        Assert.assertEquals(4,result,0.0);
    }

    @Test
    public void givenOneFeetAndTwoInchValue_WhenAdd_shouldReturnForty()
    {
        double feetValue1=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,1.0);
        double inchValue2=quantityMeasurment.UnitComparator(MeasurmentUnit.INCH,2.0);
        Assert.assertEquals(14,feetValue1+inchValue2,0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenAdded_shouldReturnTwentyFourInch()
    {
        double feetValue1=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,1.0);
        double feetValue2=quantityMeasurment.UnitComparator(MeasurmentUnit.FEET,1.0);
        Assert.assertEquals(24,feetValue1+feetValue2,0.0);
    }

    @Test
    public void givenTwoInchAndTwoPointFiveCm_WhenAdded_shouldReturnThreeInch()
    {
        double inchValue1=quantityMeasurment.UnitComparator(MeasurmentUnit.INCH,2.0);
        double feetValue2=quantityMeasurment.UnitComparator(MeasurmentUnit.CM_TO_INCH,2.5);
        Assert.assertEquals(3,inchValue1+feetValue2,0.0);
    }

    @Test
    public void givenOneGallonAndThreePointSevenEightLit_WhenEqual_shouldReturnTrue()
    {
        double gallonValue=quantityMeasurment.UnitComparator(MeasurmentUnit.GALLON_TO_LITRE,1.0);
        double litreValue=quantityMeasurment.UnitComparator(MeasurmentUnit.LITRE,3.78);
        Assert.assertEquals(7.56,gallonValue+litreValue,0.0);
    }

    @Test
    public void givenOneLitreAndOneThousandMilliLitre_WhenEqual_shouldReturnTwoLitres()
    {
        double litreValue=quantityMeasurment.UnitComparator(MeasurmentUnit.LITRE,1.0);
        double milliLitreValue=quantityMeasurment.UnitComparator(MeasurmentUnit.MILLILITER_TO_LITRE,1000);
        Assert.assertEquals(2,litreValue+milliLitreValue,0.0);
    }

    @Test
    public void givenOneTonneAndOneThousandGrams_WhenAdded_shouldReturnOneThousandOneKg()
    {
        double TonneValue=quantityMeasurment.UnitComparator(MeasurmentUnit.TONNE_TO_KG,1.0);
        double gramValue=quantityMeasurment.UnitComparator(MeasurmentUnit.GRAMS_TO_KG,1000.0);
        Assert.assertEquals(1001.0,TonneValue+gramValue,0.0);
    }

    @Test
    public void givenTwoHundredTwelveFahrenheitAndHundredCelsius_WhenEqual_shouldReturnHundredDegCelsius()
    {
        double fahrenheitValue=quantityMeasurment.UnitComparator(MeasurmentUnit.FAHRENHEIT_TO_CELSIUS,212);
        double celciusValue=quantityMeasurment.UnitComparator(MeasurmentUnit.CELSIUS,100);
        Assert.assertEquals(fahrenheitValue,celciusValue,0.0);
    }

}

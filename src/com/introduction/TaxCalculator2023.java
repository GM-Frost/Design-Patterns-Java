package com.introduction;

public class TaxCalculator2023 implements TaxCalculator{
    @Override
    public float calculateTax() {
        return 1;
    }
    //Change of class will not impact the main method
    public float calculateInsurance(){
        return 0;
    }
}

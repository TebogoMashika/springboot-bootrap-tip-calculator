package com.tipcalculator.service;


import org.springframework.stereotype.Service;

@Service
public class TipService
{
  public double calcTipAmount(String billAmount, String percentage, String numPeople){

    Double intBillAmount = Double.parseDouble(billAmount);
    Double intPercentage = Double.parseDouble(percentage);
    Double intNumPeople = Double.parseDouble(numPeople);



    // calc % of the tip
    Double tipPercentage = intBillAmount * intPercentage / 100 ;

    // cal tip amount
    double tipAmount = tipPercentage * intNumPeople;

    return tipAmount;

  }
  public double tipToTal(String billAmount, double tipAmount){

    Double intBillAmount = Double.parseDouble(billAmount);

    double total = intBillAmount + tipAmount;

    return total;

  }


}

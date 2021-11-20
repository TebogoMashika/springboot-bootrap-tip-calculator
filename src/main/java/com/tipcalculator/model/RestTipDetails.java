package com.tipcalculator.model;

public class RestTipDetails
{
  private String billAmount;
  private String percentage;
  private String numPeople;

  public RestTipDetails(String billAmount, String percentage, String numPeople)
  {
    this.billAmount = billAmount;
    this.percentage = percentage;
    this.numPeople = numPeople;
  }

  public String getBillAmount()
  {
    return billAmount;
  }

  public void setBillAmount(String billAmount)
  {
    this.billAmount = billAmount;
  }

  public String getPercentage()
  {
    return percentage;
  }

  public void setPercentage(String percentage)
  {
    this.percentage = percentage;
  }

  public String getNumPeople()
  {
    return numPeople;
  }

  public void setNumPeople(String numPeople)
  {
    this.numPeople = numPeople;
  }
}

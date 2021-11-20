package com.tipcalculator.model;

public class TipDetails
{

  private String tipAmount;
  private String total;

  public TipDetails(String tipAmount, String total)
  {
    this.tipAmount = tipAmount;
    this.total = total;
  }

  public String getTipAmount()
  {
    return tipAmount;
  }

  public void setTipAmount(String tipAmount)
  {
    this.tipAmount = tipAmount;
  }

  public String getTotal()
  {
    return total;
  }

  public void setTotal(String total)
  {
    this.total = total;
  }


}

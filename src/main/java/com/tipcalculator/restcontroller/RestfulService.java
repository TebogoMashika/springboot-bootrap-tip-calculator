package com.tipcalculator.restcontroller;


import com.tipcalculator.model.RestTipDetails;
import com.tipcalculator.model.TipDetails;
import com.tipcalculator.service.TipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestfulService.BASE_URL)
public class RestfulService
{
  public static final String BASE_URL = "restful-service/";
  public static final String CALC_TIP = "/CalcTip";

  @Autowired
  private TipService tipService;

  // delete customer
  @PostMapping(CALC_TIP)
  public TipDetails deleteCustomer(@RequestBody RestTipDetails restTipDetails){

    double tipAmount = tipService.calcTipAmount(restTipDetails.getBillAmount(), restTipDetails.getPercentage(), restTipDetails.getNumPeople());

    double tipTotal = tipService.tipToTal(restTipDetails.getBillAmount(), tipAmount);

    // convert to string
    String showTip = String.valueOf(tipAmount);
    String showTotal = String.valueOf(tipTotal);

    TipDetails tipDetails = new TipDetails(showTip, showTotal);


    return tipDetails;
  }
}


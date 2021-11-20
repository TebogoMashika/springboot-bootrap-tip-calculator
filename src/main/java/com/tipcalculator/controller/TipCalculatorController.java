package com.tipcalculator.controller;

import com.tipcalculator.model.TipDetails;
import com.tipcalculator.service.TipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TipCalculatorController
{

  @Autowired
  private TipService tipService;

  //request homepage
  @RequestMapping(name = "/")
  public String requestPage(){

    return "/index.html";
  }


  @RequestMapping("/CalcTip")
  public String receiveGameName(@RequestParam(value = "billAmount", required = false) String billAmount,
                                @RequestParam(value = "percentage", required = false) String percentage,
                                @RequestParam(value = "numPeople", required = false) String numPeople,
                                Model model){

    // pending task - validate game pin

    double tipAmount = tipService.calcTipAmount(billAmount, percentage, numPeople);

    double tipTotal = tipService.tipToTal(billAmount, tipAmount);

    // convert to string

    String showTip = String.valueOf(tipAmount);
    String showTotal = String.valueOf(tipTotal);

    TipDetails tipDetails = new TipDetails(showTip, showTotal);

    model.addAttribute("tipAmount", tipDetails);



    return "/index.html";


  }




}

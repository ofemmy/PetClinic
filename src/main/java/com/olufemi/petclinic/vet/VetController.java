package com.olufemi.petclinic.vet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

  @RequestMapping("/vets")
  public String vetsList() {
    return "vets/index";
  }

}

package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class InitialController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {       
        model.remove("listaProductos");
        return "welcome";
    }
 
 
 
}
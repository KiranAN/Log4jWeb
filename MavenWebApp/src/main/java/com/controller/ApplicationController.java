package com.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.ControllerService;

@Controller
@RequestMapping("/")
public class ApplicationController {
 
   @Autowired
   ControllerService service;
   
   @RequestMapping(value="/Test", method = RequestMethod.GET)
   public String welcome(ModelMap model) {
      model.addAttribute("msgArgument", "Maven Java Web Application Project: Success!");
 
      return "index";
   }
 
   @RequestMapping(value="/Print/{arg}", method = RequestMethod.GET)
   public String welcomeName(@PathVariable String arg, ModelMap model) {
      model.addAttribute("msgArgument", "Maven Java Web Application Project, input variable: " + arg);
 
      return "index";
   }
   
   @RequestMapping(value="/Book", method=RequestMethod.GET)
   public String book(ModelMap model) {
	   model.addAttribute("msgArgument", "Maven Java Web Application Project, input variable: " + service.getAllBooks().toString());
	   return "index";
   }
}
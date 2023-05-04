package com.spingboot.docker.spingbootwithdocker.controllers;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "students")
public class StudentController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(ModelMap modelMap) {
        return "Hello world. How are you ?";
    }

}
package com.assessmentadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AsessmentAdminController {

    @RequestMapping("home")
    public String getHome(){
        System.out.println("home.jsp");
        return "home.jsp";
    }


}

package com.radik.spring_security.lesson3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getAllEmployeesInfo(){
        return "view-for-all-employees3";
    }
    @GetMapping("/hr_only3")
    public String getInfoOnlyHR(){
        return "only-hr-view3";
    }
    @GetMapping("/managers_only3")
    public String getInfoOnlyManager(){
        return "only-managers-view3";
    }
}

package com.radik.spring_security.lesson2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getAllEmployeesInfo(){
        return "view-for-all-employees2";
    }
    @GetMapping("/hr_only2")
    public String getHRInfo(){
        return "only-hr-view2";
    }
    @GetMapping("/managers_only2")
    public String getManagerInfo(){
        return "only-managers-view2";
    }
}

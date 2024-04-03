package com.radik.spring_security.lesson1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getViewFaoAllEmployees(){
        return "view-for-all-employees";
    }
    @GetMapping("/hr_only")
    public String getInfoOnlyHR(){
        return "only-hr-view";
    }
    @GetMapping("/managers_only")
    public String getInfoOnlyManagers(){
        return "only-managers-view";
    }
}

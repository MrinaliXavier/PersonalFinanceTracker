package com.example.personalFinanceTracker.controller;


import com.example.personalFinanceTracker.entity.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aboutUs")
public class AboutUs {
    public String getAbout() {


        return "aboutUs";  // Corresponds to the Thymeleaf template name (dashboard.html)
    }

}

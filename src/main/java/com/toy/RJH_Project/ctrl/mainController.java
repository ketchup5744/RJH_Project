package com.toy.RJH_Project.ctrl;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {

    @RequestMapping("/")
    public String main() {
        return "index";
    }

}

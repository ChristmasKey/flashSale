package com.djn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class DefaultController {

    @RequestMapping("merchant")
    public String GoTo() {
        System.out.println("中国");
        return "merchant";
    }
}

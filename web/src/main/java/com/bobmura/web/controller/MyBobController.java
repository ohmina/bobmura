package com.bobmura.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/mybob")
public class MyBobController {
    @GetMapping
    public String mybob(Principal principal, ModelMap modelMap) {
//        modelMap.addAttribute("username", principal.getName());

        return "/mybob/mybob";
    }
}

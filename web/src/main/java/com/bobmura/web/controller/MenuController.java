package com.bobmura.web.controller;

import com.bobmura.web.domain.BobMenu;
import com.bobmura.web.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @GetMapping
    public String menu(ModelMap modelMap){

        List<BobMenu> menus = menuService.getMenus();

        modelMap.addAttribute("menus1", menus);
        modelMap.addAttribute("menus2", menus);
        return "menu/menu";
    }
}

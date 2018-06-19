package com.bobmura.web.controller;

import com.bobmura.web.domain.BobMenu;
import com.bobmura.web.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuApiController {

    @Autowired
    MenuService menuService;

    @GetMapping(path = "/{id}")
    public BobMenu getMenu(@PathVariable(name = "id") Long id){

        return menuService.getMenu(id);
    }

    @GetMapping(path = "/ALL")
    public List<BobMenu> getMenus(){
        return menuService.getMenus();
    }
}

package com.bobmura.web.controller;

import com.bobmura.web.domain.BobMenu;
import com.bobmura.web.domain.BobShop;
import com.bobmura.web.domain.BobSpoon;
import com.bobmura.web.domain.BobTheme;
import com.bobmura.web.service.*;
import com.bobmura.web.service.impl.ShopSerivceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mybob")
public class MyBobController {

    @Autowired
    MenuService menuService;

    @Autowired
    SpoonService spoonService;

    @Autowired
    TagService tagService;

    @Autowired
    ThemeService themeService;

    @Autowired
    ShopService shopService;

    @GetMapping
    public String mybob( ModelMap modelMap) {
        //
//        modelMap.addAttribute("username", principal.getName());

        List<BobMenu> menus = new ArrayList<>();
        List<BobTheme> themes = new ArrayList<>();
        List<BobShop> shops = new ArrayList<>();

//        Long userId = Long.parseLong(principal.getName());
        Long userId = new Long(1);

        // get menu price


        List<BobSpoon> spoons = spoonService.GetByUserId(userId);
        for(int i = 0; i< spoons.size(); i++) {
            menus.add(spoons.get(i).getBobMenu());
            themes.addAll(spoons.get(i).getBobMenu().getBobThemes());
            shops.add(spoons.get(i).getBobMenu().getBobShop());
        }

        Long averagePrice = menuService.getPriceAverage(menus);

        // get spoon count
        Long spoonCount = new Long(spoons.size());

        // get tag count
        Long tagCount = tagService.CountByUserId(userId);

        // get top 3 theme
        List<String> topThemes = themeService.GetTopThemes(themes, 3);

        // get top 3 shop
        List<String> topShops = shopService.GetTopShops(shops, 3);

        modelMap.addAttribute("name", "userName + 님");
        modelMap.addAttribute("spoonCount", spoonCount.toString() + "개");
        modelMap.addAttribute("tagCount", tagCount.toString() + "개");
        modelMap.addAttribute("averagePrice", averagePrice.toString() +"원");
        modelMap.addAttribute("topThemes", topThemes.toString());
        modelMap.addAttribute("topShops", topShops.toString());

        return "mybob/mybob";
    }
}

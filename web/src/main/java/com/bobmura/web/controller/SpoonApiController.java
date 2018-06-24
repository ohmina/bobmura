package com.bobmura.web.controller;

import com.bobmura.web.service.MenuService;
import com.bobmura.web.service.SpoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/spoon")
public class SpoonApiController {

    @Autowired
    SpoonService spoonService;



}

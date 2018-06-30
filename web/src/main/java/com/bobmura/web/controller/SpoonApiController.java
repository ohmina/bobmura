package com.bobmura.web.controller;

import com.bobmura.web.domain.BobSpoon;
import com.bobmura.web.domain.BobSpoonApiParam;
import com.bobmura.web.service.SpoonService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/spoon")
public class SpoonApiController {

    @Autowired
    SpoonService spoonService;

    @PostMapping
    public void AddSpoon(@RequestBody BobSpoonApiParam request){

        // 왜 안될까....
        spoonService.AddSpoon(request.getMenuId(), request.getUserId());
    }

    @GetMapping(path = "/menu/{id}")
    public Long CountByMenuId(@PathVariable(name = "id") Long id){
        Long result = spoonService.CountByMenuId(id);

        return result;
    }

    @GetMapping(path = "/user/{id}")
    public Long CountByUserId(@PathVariable(name = "id") Long id){
        Long result = spoonService.CountByUserId(id);

        return result;
    }

}

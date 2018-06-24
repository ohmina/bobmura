package com.bobmura.web.service.impl;

import com.bobmura.web.repository.BobMenuRepository;
import com.bobmura.web.repository.BobSpoonRepository;
import com.bobmura.web.service.SpoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpoonServiceImpl implements SpoonService {

    @Autowired
    BobSpoonRepository spoonRepository;


    @Override
    public void AddSpoon(Long userId, Long menuId) {


    }

    @Override
    @Transactional(readOnly = true)
    public Long CountSpoon(Long menuId) {
        return null;
    }
}

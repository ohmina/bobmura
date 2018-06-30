package com.bobmura.web.service.impl;

import com.bobmura.web.domain.BobMenu;
import com.bobmura.web.domain.BobSpoon;
import com.bobmura.web.domain.BobUser;
import com.bobmura.web.repository.BobMenuRepository;
import com.bobmura.web.repository.BobSpoonRepository;
import com.bobmura.web.service.SpoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class SpoonServiceImpl implements SpoonService {

    @Autowired
    BobSpoonRepository spoonRepository;

    @Override
    public Long CountByMenuId(Long menuId) {
        Long count = spoonRepository.CountByMenuId(menuId);
        return count;
    }

    @Override
    public Long CountByUserId(Long userId) {
        Long count = spoonRepository.CountByUserId(userId);
        return count;
    }

    @Override
    public List<BobSpoon> GetByUserId(Long userId) {

        List<BobSpoon> spoons = new ArrayList<>();

        spoons = spoonRepository.GetByUserId(userId);

        return spoons;
    }

    @Override
    public List<BobSpoon> GetByUserEmail(String userEmail) {

        List<BobSpoon> spoons = new ArrayList<>();

        spoons = spoonRepository.GetByEmail(userEmail);

        return spoons;
    }

    @Override
    @Transactional
    public void AddSpoon(Long menuId, Long userId) {

        BobSpoon spoon = new BobSpoon();
        BobMenu menu = new BobMenu();
        BobUser user = new BobUser();
        menu.setMenuId(menuId);
        user.setUserId(userId);
        spoon.setBobMenu(menu);
        spoon.setBobUser(user);
        spoon.setRegId(userId.toString());
        spoon.setRegDate(LocalDateTime.now());
        spoonRepository.save(spoon);

        //spoonRepository.AddSpoon(menuId, userId, userId, LocalDateTime.now());
    }

}

package com.bobmura.web.service;

import com.bobmura.web.domain.BobMenu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuService {

    BobMenu getMenu(Long id);

    List<BobMenu> getMenus();
}

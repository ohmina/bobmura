package com.bobmura.web.service.impl;

import com.bobmura.web.domain.BobMenu;
import com.bobmura.web.repository.BobMenuRepository;
import com.bobmura.web.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    BobMenuRepository menuRepository;

    @Transactional(readOnly = true)
    @Override
    public BobMenu getMenu(Long id) {

        return menuRepository.getMenu(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<BobMenu> getMenus() {

        return menuRepository.getMenus();
    }

    public Long getPriceAverage(List<BobMenu> bobMenus){
        Long result = new Long(0);
        Long sum = new Long(0);
        for(int i=0; i<bobMenus.size(); i++)
            sum += bobMenus.get(i).getMenuPrice();

        if(bobMenus != null && bobMenus.size() > 0 && sum > 0)
            result = sum / bobMenus.size();

        return result;
    }
}

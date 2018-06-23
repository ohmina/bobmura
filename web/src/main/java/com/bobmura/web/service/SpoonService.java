package com.bobmura.web.service;

import org.springframework.stereotype.Service;

@Service
public interface SpoonService {

    void AddSpoon(Long userId, Long menuId);

    Long CountSpoon(Long menuId);
}

package com.bobmura.web.service;

import com.bobmura.web.domain.BobSpoon;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpoonService {

    void AddSpoon(Long menuId, Long userId);

    Long CountByMenuId(Long menuId);

    Long CountByUserId(Long userId);

    List<BobSpoon> GetByUserId(Long userId);

    List<BobSpoon> GetByUserEmail(String userEmail);
}

package com.bobmura.web.service;

import com.bobmura.web.domain.BobShop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShopService {
    List<String> GetTopShops(List<BobShop> shops, int topN);
}

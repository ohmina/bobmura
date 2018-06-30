package com.bobmura.web.service.impl;

import com.bobmura.web.domain.BobShop;
import com.bobmura.web.service.ShopService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ShopSerivceImpl implements ShopService {
    @Override
    public List<String> GetTopShops(List<BobShop> shops, int topN) {
        List<String> result = new ArrayList<>();
        List<nameCountEntity> nameCount = new ArrayList<>();
        shops.sort(Comparator.comparing(BobShop::getShopName));

        String lastName = "";
        for(int i = 0; i < shops.size(); i++ ) {
            if(!shops.get(i).getShopName().equals(lastName)){
                lastName = shops.get(i).getShopName();
                nameCountEntity one = new nameCountEntity();
                one.setShopName(lastName);
                one.setCount(CountOccurences(shops, lastName));
                nameCount.add(one);
            }
        }

        nameCount.sort(Comparator.comparingInt(nameCountEntity::getCount).reversed());

        if(topN <= nameCount.size()) {
            for(int j =0; j< topN; j++)
                result.add(nameCount.get(j).getShopName());
        }
        else {
            for(int j =0; j< nameCount.size(); j++)
                result.add(nameCount.get(j).getShopName());
        }
        return result;
    }

    private int CountOccurences(List<BobShop> shops, String name){

        int result = 0;

        for(int i = 0; i< shops.size(); i++){
            if(shops.get(i).getShopName().equals(name))
                result++;
        }

        return result;
    }

    @Getter
    @Setter
    private class nameCountEntity{
        private String shopName;
        private int count;
    }
}

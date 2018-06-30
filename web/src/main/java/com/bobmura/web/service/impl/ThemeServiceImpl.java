package com.bobmura.web.service.impl;

import com.bobmura.web.domain.BobTheme;
import com.bobmura.web.repository.BobThemeRepository;
import com.bobmura.web.service.ThemeService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ThemeServiceImpl implements ThemeService {

    @Autowired
    BobThemeRepository themeRepository;

    @Override
    public List<Integer> GetTopThemes(List<BobTheme> themes, int topN) {

        List<Integer> result = new ArrayList<>();
        List<TypeCountEntity> typeCount = new ArrayList<>();
        themes.sort(Comparator.comparingInt(BobTheme::getThemeType));

        int lastType = -1;
        for(int i = 0; i < themes.size(); i++ ) {
            if(themes.get(i).getThemeType() != lastType){
                lastType = themes.get(i).getThemeType();
                TypeCountEntity one = new TypeCountEntity();
                one.setThemeType(lastType);
                one.setCount(CountOccurences(themes, lastType));
                typeCount.add(one);
            }
        }

        typeCount.sort(Comparator.comparingInt(TypeCountEntity::getCount).reversed());

        if(topN <= typeCount.size()) {
            for(int j =0; j< topN; j++)
                result.add(typeCount.get(j).getThemeType());
        }
        else {
            for(int j =0; j< typeCount.size(); j++)
                result.add(typeCount.get(j).getThemeType());
        }
        return result;
    }

    private int CountOccurences(List<BobTheme> themes, int type){

        int result = 0;

        for(int i = 0; i< themes.size(); i++){
            if(themes.get(i).getThemeType() == type)
                result++;
        }

        return result;
    }

    @Getter
    @Setter
    private class TypeCountEntity{
        private int themeType;
        private int count;
    }
}

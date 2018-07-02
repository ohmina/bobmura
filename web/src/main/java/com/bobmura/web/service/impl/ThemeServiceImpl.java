package com.bobmura.web.service.impl;

import com.bobmura.web.domain.BobTheme;
import com.bobmura.web.repository.BobThemeRepository;
import com.bobmura.web.service.ThemeService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ThemeServiceImpl implements ThemeService {

    @Autowired
    BobThemeRepository themeRepository;

    @Override
    public List<String> GetTopThemes(List<BobTheme> themes, int topN) {

        List<String> result = new ArrayList<>();
        List<Integer> typeResult = new ArrayList<>();
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
                typeResult.add(typeCount.get(j).getThemeType());
        }
        else {
            for(int j =0; j< typeCount.size(); j++)
                typeResult.add(typeCount.get(j).getThemeType());
        }

        result = ConvertTypeToString(typeResult);

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

    private List<String> ConvertTypeToString(List<Integer> types) {

        List<String> result = new ArrayList<>();

        if(types == null || types.size() == 0) return result;
        for(int i=0; i<types.size(); i++) {
            result.add(ThemeTypeEnum.values()[types.get(i)].toString());
        }

        return result;
    }

    @Getter
    @Setter
    private class TypeCountEntity{
        private int themeType;
        private int count;
    }

    private enum ThemeTypeEnum{
        기타,
        한식,
        양식,
        중식,
        일식
    }

}

package com.bobmura.web.service;

import com.bobmura.web.domain.BobTheme;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ThemeService {

    List<Integer> GetTopThemes(List<BobTheme> themes, int topN);

}

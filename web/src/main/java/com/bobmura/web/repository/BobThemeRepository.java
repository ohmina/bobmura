package com.bobmura.web.repository;

import com.bobmura.web.domain.BobTheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BobThemeRepository extends JpaRepository<BobTheme, Long> {

    // add bob theme

    @Query("SELECT b from BobTheme b where b.themeType = :themeType")
    List<BobTheme> GetByThemeType(@Param("themeType")int themeType);

    @Query("SELECT b from BobTheme b where b.bobMenu.menuId = :menuId")
    List<BobTheme> GetByMenuId(@Param("menuId")Long menuId);
}

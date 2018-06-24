package com.bobmura.web.repository;

import com.bobmura.web.domain.BobMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BobMenuRepository extends JpaRepository<BobMenu, Long> {

    @Query("select m from BobMenu m where m.menuId = :id")
    BobMenu getMenu(@Param("id") Long id);

    @Query("select m from BobMenu m")
    List<BobMenu> getMenus();
}

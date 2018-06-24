package com.bobmura.web.repository;

import com.bobmura.web.domain.BobSpoon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BobSpoonRepository extends JpaRepository<BobSpoon, Long> {

//    @Query("insert BobSpoon values ")
//    void addSpoon(@Param("userId") Long userId, @Param("menuId") Long menuId);

//    @Query("select m from BobSpoon m")
//    Long countSpoon(@Param("menuId") Long menuId);


}

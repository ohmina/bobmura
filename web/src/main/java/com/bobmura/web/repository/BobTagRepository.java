package com.bobmura.web.repository;

import com.bobmura.web.domain.BobTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BobTagRepository extends JpaRepository<BobTag, Long> {

    //add tag

    @Query("SELECT count(b) from BobTag b where b.bobUser.userId = :userId")
    Long CountByUserId(@Param("userId")Long userId);

    @Query("SELECT b from BobTag b where b.bobMenu.menuId = :menuId")
    List<BobTag> GetByMenuId(@Param("menuId")Long menuId);
}

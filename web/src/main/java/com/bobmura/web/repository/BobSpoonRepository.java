package com.bobmura.web.repository;

import com.bobmura.web.domain.BobSpoon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface BobSpoonRepository extends JpaRepository<BobSpoon, Long> {

    @Modifying
    @Query(value = "INSERT INTO BobSpoon(menuId, userId, regId, regDate) VALUES(:menuId, :userId, :regId, :regDate)", nativeQuery = true)
    void AddSpoon(@Param("menuId")Long menuId, @Param("userId")Long userId, @Param("regId")Long regId, @Param("regDate")LocalDateTime regDate);

    @Query("SELECT COUNT(b) FROM BobSpoon b WHERE b.bobMenu.menuId = :menuId")
    Long CountByMenuId(@Param("menuId") Long menuId);

    @Query("SELECT COUNT(b) FROM BobSpoon b WHERE b.bobUser.userId = :userId")
    Long CountByUserId(@Param("userId") Long userId);

    @Query("SELECT b FROM BobSpoon b WHERE b.bobUser.userId = :userId")
    List<BobSpoon> GetByUserId(@Param("userId") Long userId);

    @Query("SELECT b FROM BobSpoon b WHERE b.bobUser.userEmail = :userEmail")
    List<BobSpoon> GetByEmail(@Param("userEmail") String userEmail);
}

package com.bobmura.web.repository;

import com.bobmura.web.domain.BobMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BobMenuService extends JpaRepository<BobMenu, Long> {
}

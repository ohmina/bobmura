package com.bobmura.web.repository;

import com.bobmura.web.domain.BobTheme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BobThemeService extends JpaRepository<BobTheme, Long> {
}

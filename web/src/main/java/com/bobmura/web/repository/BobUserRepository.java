package com.bobmura.web.repository;

import com.bobmura.web.domain.BobUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BobUserRepository extends JpaRepository<BobUser, Long> {
}

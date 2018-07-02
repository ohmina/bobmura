package com.bobmura.web.repository;

import com.bobmura.web.domain.BobUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BobUserRepository extends JpaRepository<BobUser, Long> {
    Optional<BobUser> findByUserEmail(String userEmail);
}

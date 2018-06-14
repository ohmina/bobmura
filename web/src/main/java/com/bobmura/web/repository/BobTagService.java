package com.bobmura.web.repository;

import com.bobmura.web.domain.BobTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BobTagService extends JpaRepository<BobTag, Long> {
}

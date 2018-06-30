package com.bobmura.web.service.impl;

import com.bobmura.web.repository.BobTagRepository;
import com.bobmura.web.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    BobTagRepository tagRepository;

    @Override
    public Long CountByUserId(Long userId) {
        return tagRepository.CountByUserId(userId);
    }

    @Override
    public Long CountByUserEmail(String userEmail) {
        return tagRepository.CountByUserEmail(userEmail);
    }
}

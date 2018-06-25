package com.bobmura.web.service;

import org.springframework.stereotype.Service;

@Service
public interface TagService {

    //void AddTag()

    Long CountByUserId(Long userId);

}

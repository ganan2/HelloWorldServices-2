package com.helloworld.services.service;

import com.helloworld.services.domain.About;

import java.util.Optional;

public interface AboutService {
    About saveAbout(About about);
    Optional<About> findByMongoId(String mongoId);
}

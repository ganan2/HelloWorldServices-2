package com.helloworld.services.service.serviceImpl;

import com.helloworld.services.domain.About;
import com.helloworld.services.repository.AboutRepository;
import com.helloworld.services.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AboutServiceImpl implements AboutService {

    @Autowired
    private AboutRepository aboutRepository;

    public About saveAbout(About about) {
        return aboutRepository.save(about);
    }

    @Override
    public Optional<About> findByMongoId(String mongoId) {
        return aboutRepository.findById(mongoId);
    }
}

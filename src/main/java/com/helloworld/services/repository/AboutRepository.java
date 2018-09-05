package com.helloworld.services.repository;


import com.helloworld.services.domain.About;
import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AboutRepository extends PagingAndSortingRepository<About, String> {
    About save(About about);
    Optional<About> findByMongoId(ObjectId mongoId);
}



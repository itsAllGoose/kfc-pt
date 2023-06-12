package com.kfkaproject.kfka.repository;

import com.kfkaproject.kfka.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends CrudRepository<User, Long> {
    
}
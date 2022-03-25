package com.example.demo.repository;

import com.example.demo.entity.SuperPower;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SuperPowerRepository extends CrudRepository<SuperPower, Long> {
    
}

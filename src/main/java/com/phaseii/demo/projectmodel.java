package com.phaseii.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel="projectback",path="projectback")
public interface projectmodel extends JpaRepository<database,String>{

}

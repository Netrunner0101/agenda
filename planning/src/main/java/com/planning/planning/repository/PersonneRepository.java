package com.planning.planning.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.planning.planning.entity.PersonneEntity;

@Repository
public interface PersonneRepository extends CrudRepository<PersonneEntity, Long>{

}

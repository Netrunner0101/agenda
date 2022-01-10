package com.planning.planning.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.planning.planning.entity.AgendaEntity;

@Repository
public interface AgendaRepository extends CrudRepository<AgendaEntity,Long>{

}

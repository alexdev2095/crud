package com.proyecto.crud.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.crud.models.entities.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}

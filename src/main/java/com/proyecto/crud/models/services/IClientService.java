package com.proyecto.crud.models.services;

import java.util.List;

import com.proyecto.crud.models.entities.Client;

public interface IClientService {

    public List<Client> listAll();

    public void save(Client client);

    public Client show(Long id);

    public void delete(Long id);
}

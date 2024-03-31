package com.proyecto.crud.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.crud.models.entities.Client;
import com.proyecto.crud.models.repository.ClientRepository;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> listAll() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public void save(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client show(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

}

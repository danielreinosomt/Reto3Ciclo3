package com.usa.ciclo3.ciclo3.repository;

import java.util.List;
import java.util.Optional;

import com.usa.ciclo3.ciclo3.model.Client;
import com.usa.ciclo3.ciclo3.repository.crud.ClientCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class ClientRepository {

    @Autowired
        private ClientCrudRepository clientCrudRepository;
        public List<Client> getAll(){
            return (List<Client>)clientCrudRepository.findAll();
        }
        public Optional<Client> getClient(int id){
            return clientCrudRepository.findById(id);
        } 

        public Client save(Client d){
            return clientCrudRepository.save(d);
        }
        public void delete(Client client){
            clientCrudRepository.delete(client);

        }
    
}

package service;

import model.entity.Client;

import java.util.List;

public interface ClientService {

    void save(Client client);
    Client getById(int id);
    List<Client> getAll();
    void update(Client client);
    void deleteById(int id);
}

package repository;

import model.entity.Client;

import java.util.List;

public interface ClientRepository {
    void save(Client client);
    Client findById(int id);
    List<Client> findAll();
    void update(Client client);
    void deleteById(int id);
    List<Client> findMatchList(int clientId);
}

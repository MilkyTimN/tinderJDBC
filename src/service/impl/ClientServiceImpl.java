package service.impl;

import model.entity.Client;
import repository.ClientRepository;
import repository.impl.ClientRepositoryImpl;
import service.ClientService;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    private ClientRepository repository = new ClientRepositoryImpl();
    @Override
    public void save(Client client) {

    }

    @Override
    public Client getById(int id) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void deleteById(int id) {

    }

    public List<Client> getMatchList(int clientId) {
        return repository.findMatchList(clientId);
    }
}

package service.impl;

import model.entity.Client;
import model.enums.Country;
import model.enums.FamilyStatus;
import model.enums.Gender;
import model.enums.Zodiac;
import model.response.MainListClientResponse;
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

    public List<MainListClientResponse> getClientByFilter(String name, int age, Gender gender,
                                                          FamilyStatus familyStatus, Zodiac zodiac,
                                                          Country country, String city, String email) {

        return repository.findClientByFilter(name, age, gender, familyStatus, zodiac, country, city, email);
    }


}

package repository;

import model.entity.Client;
import model.enums.Country;
import model.enums.FamilyStatus;
import model.enums.Gender;
import model.enums.Zodiac;
import model.response.MainListClientResponse;

import java.util.List;

public interface ClientRepository {
    void save(Client client);
    Client findById(int id);
    List<Client> findAll();
    void update(Client client);
    void deleteById(int id);
    List<Client> findMatchList(int clientId);
    List<MainListClientResponse> findClientByFilter(String name, int age, Gender gender,
                                                   FamilyStatus familyStatus, Zodiac zodiac,
                                                   Country country, String city, String email);
}

package repository.impl;

import model.entity.Client;
import model.entity.Order;
import model.enums.Country;
import model.enums.FamilyStatus;
import model.enums.Gender;
import model.enums.Zodiac;
import model.response.MainListClientResponse;
import repository.ClientRepository;
import repository.DbHelper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClientRepositoryImpl implements ClientRepository {

    private DbHelper dbHelper = new DbHelperImpl();

    @Override
    public void save(Client client) {
        try (PreparedStatement preparedStatement = dbHelper.getPreparedStatement
                ("INSERT INTO tb_client(status, created_date, update_date, email, full_name, age, gender, family_status, country, city, about, zodiac, birth_date) " +
                        "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)")) {
            preparedStatement.setString(1, client.getStatus().toString());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Client findById(int id) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<Client> findMatchList(int clientId) {
        List<Client> clientList = new ArrayList<>();

        try (PreparedStatement preparedStatement = dbHelper.getPreparedStatement
                ("SELECT * FROM tb_client c INNER JOIN tb_order o ON c.id = o.sender_id OR c.id = o.recipient_id" +
                        " WHERE (sender_id = ? OR recipient_id = ?) AND status = ACCEPTED")) {
            preparedStatement.setInt(1, clientId);
            preparedStatement.setInt(2, clientId);

            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()) {
                Client client = new Client();
          // many Data
                clientList.add(client);
            }
            return clientList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    //TODO не работате entityManager
    @Override
    public List<MainListClientResponse> findClientByFilter(String name, int age, Gender gender,
                                                           FamilyStatus familyStatus, Zodiac zodiac,
                                                           Country country, String city, String email) {

        StringBuilder sql = new StringBuilder("SELECT c.id, c.full_name, c.age, c.about, c.city FROM tb_client c WHERE c.status = 'ACTIVE' ");

        if (Objects.nonNull(name)) {
            sql.append("AND c.name LIKE '%" + name + "%' ");
        }
        if (age > 0) {
            sql.append(" AND c.age = " + age);
        }
        if (Objects.nonNull(gender)) {
            sql.append(" AND c.gender = '" + gender + "'");
        }
        if (Objects.nonNull(familyStatus)) {
            sql.append(" AND c.family_status = '" + familyStatus + "'");
        }
        if (Objects.nonNull(zodiac)) {
            sql.append(" AND c.zodiac = '" + zodiac + "'");
        }
        if (Objects.nonNull(country)) {
            sql.append(" AND c.country = '" + country + "'");
        }
        if (Objects.nonNull(city)) {
            sql.append(" AND c.city = '" + city + "'");
        }
        if (Objects.nonNull(email)) {
            sql.append(" AND c.city LIKE '%" + email + "%' ");
        }

        List<MainListClientResponse> result = new ArrayList<>();

//        try {
//            result = entityManager.exexuteQuery(sql, MainListClientResponse);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        return result;





    }
}

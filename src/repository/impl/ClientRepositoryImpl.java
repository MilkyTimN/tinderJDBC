package repository.impl;

import model.entity.Client;
import model.entity.Order;
import repository.ClientRepository;
import repository.DbHelper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
}

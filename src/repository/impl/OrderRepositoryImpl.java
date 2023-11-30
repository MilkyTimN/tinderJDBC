package repository.impl;

import model.entity.Client;
import model.entity.Order;
import model.enums.OrderStatus;
import repository.DbHelper;
import repository.OrderRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {

    private DbHelper dbHelper = new DbHelperImpl();

    @Override
    public void save(Order order) {
        try (PreparedStatement preparedStatement = dbHelper.getPreparedStatement
                ("INSERT INTO tb_order(status, created_date, update_date, sender_id, recipient_id) " +
                        "VALUES(?,?,?,?,?)")) {
            preparedStatement.setString(1, order.getStatus().toString());
            preparedStatement.setTimestamp(2, Timestamp.valueOf(order.getCreatedDate()));
            preparedStatement.setTimestamp(3, Timestamp.valueOf(order.getUpdateDate()));
            preparedStatement.setInt(4, order.getSender());
            preparedStatement.setInt(5, order.getRecipient());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Order findById(int id) {
        try (PreparedStatement preparedStatement = dbHelper.getPreparedStatement
                ("SELECT * FROM tb_order WHERE id = ?")) {
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getResultSet();

            Order order = new Order();
            order.setId(resultSet.getInt("id"));
            order.setCreatedDate(resultSet.getTimestamp("created_date").toLocalDateTime());
            order.setUpdateDate(resultSet.getTimestamp("updated_date").toLocalDateTime());
            order.setId(resultSet.getInt("id"));
            order.setId(resultSet.getInt("id"));

            return order;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Order order) {
        try (PreparedStatement preparedStatement = dbHelper.getPreparedStatement
                ("UPDATE tb_order SET status = ?, updated_date = ?")) {
            preparedStatement.setString(1, order.getStatus().toString());
            preparedStatement.setTimestamp(2, Timestamp.valueOf(order.getUpdateDate()));

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Order> findBySenderId(int sender, OrderStatus status) {

        List<Order> orderList = new ArrayList<>();

        try (PreparedStatement preparedStatement = dbHelper.getPreparedStatement
                ("SELECT * FROM tb_order WHERE sender_id = ? AND status = ?")) {
            preparedStatement.setInt(1, sender);
            preparedStatement.setString(2, status.toString());

            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()) {
                Order order = new Order();
                order.setId(resultSet.getInt("id"));
                order.setCreatedDate(resultSet.getTimestamp("created_date").toLocalDateTime());
                order.setUpdateDate(resultSet.getTimestamp("updated_date").toLocalDateTime());
                order.setId(resultSet.getInt("id"));
                order.setId(resultSet.getInt("id"));
                orderList.add(order);
            }
            return orderList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Order> findByRecipientId(int recipientId, OrderStatus status) {
        List<Order> orderList = new ArrayList<>();

        try (PreparedStatement preparedStatement = dbHelper.getPreparedStatement
                ("SELECT * FROM tb_order WHERE recipient_id = ? AND status = ?")) {
            preparedStatement.setInt(1, recipientId);
            preparedStatement.setString(2, status.toString());

            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()) {
                Order order = new Order();
                order.setId(resultSet.getInt("id"));
                order.setCreatedDate(resultSet.getTimestamp("created_date").toLocalDateTime());
                order.setUpdateDate(resultSet.getTimestamp("updated_date").toLocalDateTime());
                order.setId(resultSet.getInt("id"));
                order.setId(resultSet.getInt("id"));
                orderList.add(order);
            }
            return orderList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

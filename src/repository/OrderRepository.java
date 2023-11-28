package repository;

import model.entity.Order;
import model.enums.OrderStatus;

import java.util.List;

public interface OrderRepository {

    void save(Order order);
    Order findById(int id);
    void update(Order order);
    List<Order> findBySenderId(int sender, OrderStatus status);
}

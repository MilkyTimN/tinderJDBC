package service.impl;

import model.entity.Order;
import model.enums.OrderStatus;
import repository.OrderRepository;
import repository.impl.OrderRepositoryImpl;
import service.ClientService;

import java.time.LocalDateTime;
import java.util.List;

public class OrderServiceImpl {

    private OrderRepository repository = new OrderRepositoryImpl();
    private ClientService clientService = new ClientServiceImpl();

    public void sendOrder(int senderId, int recipientId) {
        Order order = new Order();
        order.setCreatedDate(LocalDateTime.now());
        order.setUpdateDate(LocalDateTime.now());
        order.setStatus(OrderStatus.PENDING);
        order.setSender(senderId);
        order.setRecipient(recipientId);

        repository.save(order);
    }



    public Order getById(int id) {
        return repository.findById(id);
    }

    public void update(Order order){
        order.setUpdateDate(LocalDateTime.now());
        repository.update(order);
    }



    public void changeOrderStatus(int orderId, OrderStatus status) {
        Order order = getById(orderId);

        switch (status) {
            case PENDING -> order.setStatus(OrderStatus.PENDING);
            case ACCEPTED -> order.setStatus(OrderStatus.ACCEPTED);
            case CANCELED -> order.setStatus(OrderStatus.CANCELED);
            case REJECTED -> order.setStatus(OrderStatus.REJECTED);
        }
        update(order);
    }

    /**
     * Посмотреть список заявки по статусу
     */
    public List<Order> getOrderByStatus(int sender, OrderStatus status) {
        return repository.findBySenderId(sender, status);
    }


    /**
     * Посмотреть полученные заявки
     */
    public List<Order> getReceivedOrder(int recipientId, OrderStatus status) {
        return repository.findByRecipientId(recipientId, status);
    }

}

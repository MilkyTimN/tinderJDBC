package model.entity;

import jdk.incubator.foreign.CLinker;
import model.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
    private Integer id;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
    private OrderStatus status;
    private int sender;
    private int recipient;

    public Order(Integer id, LocalDateTime createdDate, LocalDateTime updateDate, OrderStatus status, int sender, int recipient) {
        this.id = id;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
        this.status = status;
        this.sender = sender;
        this.recipient = recipient;
    }

    public Order(LocalDateTime createdDate, LocalDateTime updateDate, OrderStatus status, int sender, int recipient) {
        this.createdDate = createdDate;
        this.updateDate = updateDate;
        this.status = status;
        this.sender = sender;
        this.recipient = recipient;
    }

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public int getSender() {
        return sender;
    }

    public void setSender(int sender) {
        this.sender = sender;
    }

    public int getRecipient() {
        return recipient;
    }

    public void setRecipient(int recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createdDate=" + createdDate +
                ", updateDate=" + updateDate +
                ", status=" + status +
                ", sender=" + sender +
                ", recipient=" + recipient +
                '}';
    }
}

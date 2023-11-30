package model.entity;

import model.enums.MessageStatus;

import java.time.LocalDateTime;

public class Message {
    private int id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private MessageStatus status;
    private String message;
    private int senderId;
    private int recipientId;
    private int chatId;
}

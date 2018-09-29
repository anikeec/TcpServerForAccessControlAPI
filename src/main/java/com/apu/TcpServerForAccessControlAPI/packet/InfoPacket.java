package com.apu.TcpServerForAccessControlAPI.packet;

import com.google.gson.annotations.Expose;

public class InfoPacket extends RawPacket {
    
    private static final long serialVersionUID = 1L;
    @Expose
    private MessageType messageType = MessageType.INFO;
    @Expose
    private String      cardNumber;
    @Expose
    private Integer     userId;       
    @Expose
    private EventType   eventType;
    @Expose
    private Integer     eventId;
    @Expose
    private String      info;    
    
    public InfoPacket() {
        super();
    }
    public InfoPacket(String info) {
        super();
        this.info = info;
    }
    public MessageType getMessageType() {
        return messageType;
    }
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public EventType getEventType() {
        return eventType;
    }
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
    public Integer getEventId() {
        return eventId;
    }
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    
    
}

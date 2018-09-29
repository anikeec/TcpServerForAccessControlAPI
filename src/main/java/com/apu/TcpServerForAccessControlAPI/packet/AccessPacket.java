package com.apu.TcpServerForAccessControlAPI.packet;

import com.google.gson.annotations.Expose;

public class AccessPacket extends RawPacket {
    
    private static final long serialVersionUID = 1L;
    @Expose
    private MessageType messageType = MessageType.ACCESS;
    @Expose
    private String      cardNumber;
    @Expose
    private EventType   eventType;
    @Expose
    private Integer     eventId;
    
    
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
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
}

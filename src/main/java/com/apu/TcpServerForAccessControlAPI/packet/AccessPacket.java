package com.apu.TcpServerForAccessControlAPI.packet;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("accessPacket")
public class AccessPacket extends RawPacket {
    
    private static final long serialVersionUID = 1L;
    private MessageType messageType = MessageType.ACCESS;
    private String      cardNumber;
    private EventType   eventType;
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

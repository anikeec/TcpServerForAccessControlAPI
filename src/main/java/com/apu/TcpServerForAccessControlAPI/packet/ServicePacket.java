package com.apu.TcpServerForAccessControlAPI.packet;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("servicePacket")
public class ServicePacket extends RawPacket {
    
    private static final long serialVersionUID = 1L;
    private MessageType messageType = MessageType.SERVICE;
    private EventType   eventType;
    private Integer     eventId;
    private String      info;
    
    public MessageType getMessageType() {
        return messageType;
    }
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
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

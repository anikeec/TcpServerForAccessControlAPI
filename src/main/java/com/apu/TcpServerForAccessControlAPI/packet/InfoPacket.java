package com.apu.TcpServerForAccessControlAPI.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InfoPacket extends RawPacket {
    
    private static final long serialVersionUID = 1L;
    @Expose
	@SerializedName("mt")
    private MessageType messageType = MessageType.INFO;
    @Expose
	@SerializedName("cn")
    private String      cardNumber;
    @Expose
	@SerializedName("ui")
    private Integer     userId;       
    @Expose
	@SerializedName("et")
    private EventType   eventType;
    @Expose
	@SerializedName("ei")
    private Integer     eventId;
    @Expose
	@SerializedName("i")
    private String      info;    
    
    public InfoPacket() {
        super();
    }
    public InfoPacket(Integer deviceNumber, Integer packetNumber, String info) {
        super();
        this.setDeviceNumber(deviceNumber);
        this.setPacketNumber(packetNumber);
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

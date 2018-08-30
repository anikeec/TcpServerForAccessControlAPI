package com.apu.TcpServerForAccessControlAPI.packet;

import java.io.Serializable;
import java.util.Date;

public class RawPacket implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Integer     deviceId;
    private Integer     packetNumber;
    private MessageType messageType;    
    private Date        time;
    
    public Integer getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }
    public Integer getPacketNumber() {
        return packetNumber;
    }
    public void setPacketNumber(Integer packetNumber) {
        this.packetNumber = packetNumber;
    }
    public MessageType getMessageType() {
        return messageType;
    }
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }  
    
}

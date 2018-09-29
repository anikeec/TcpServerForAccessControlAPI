package com.apu.TcpServerForAccessControlAPI.packet;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.Expose;

public class RawPacket implements Serializable {
    
    private static final long serialVersionUID = 1L;
//    @Expose (serialize = false, deserialize = false)
    private MessageType messageType;    
    @Expose
    private Integer     deviceNumber;
    @Expose
    private Integer     packetNumber;    
    @Expose
    private Date        time;
    
    public Integer getDeviceNumber() {
        return deviceNumber;
    }
    public void setDeviceNumber(Integer deviceNumber) {
        this.deviceNumber = deviceNumber;
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

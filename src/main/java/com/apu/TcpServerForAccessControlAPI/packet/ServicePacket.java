package com.apu.TcpServerForAccessControlAPI.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

public class ServicePacket extends RawPacket {
    
    @Getter
    private static final long serialVersionUID = 1L;
    
    @Expose
	@SerializedName("mt")
    @Getter @Setter
    private MessageType messageType = MessageType.SERVICE;
    
    @Expose
	@SerializedName("et")
    @Getter @Setter
    private EventType   eventType;
    
    @Expose
	@SerializedName("ei")
    @Getter @Setter
    private Integer     eventId;
    
    @Expose
	@SerializedName("i")
    @Getter @Setter
    private String      info;
    
}

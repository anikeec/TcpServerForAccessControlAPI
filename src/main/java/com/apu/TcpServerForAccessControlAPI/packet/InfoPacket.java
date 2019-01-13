package com.apu.TcpServerForAccessControlAPI.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class InfoPacket extends RawPacket {
    
    @Getter
    private static final long serialVersionUID = 1L;
    
    @Expose
	@SerializedName("mt")
    @Getter @Setter
    private MessageType messageType = MessageType.INFO;
    
    @Expose
	@SerializedName("cn")
    @Getter @Setter
    private String      cardNumber;
    
    @Expose
	@SerializedName("ui")
    @Getter @Setter
    private Integer     userId;
    
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
    
    public InfoPacket(Integer deviceNumber, Integer packetNumber, String info) {
        super();
        this.setDeviceNumber(deviceNumber);
        this.setPacketNumber(packetNumber);
        this.info = info;
    }   
    
}

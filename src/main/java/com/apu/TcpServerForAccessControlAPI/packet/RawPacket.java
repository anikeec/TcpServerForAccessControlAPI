package com.apu.TcpServerForAccessControlAPI.packet;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

public class RawPacket implements Serializable {
    
    @Getter
    private static final long serialVersionUID = 1L;
    
    @Getter @Setter
    private MessageType messageType;
    
    @Expose
    @SerializedName("dn")
    @Getter @Setter
    private Integer     deviceNumber;
    
    @Expose
    @SerializedName("pn")
    @Getter @Setter
    private Integer     packetNumber;
    
    @Expose
    @SerializedName("t")
    @Getter @Setter
    private Date        time;
    
}

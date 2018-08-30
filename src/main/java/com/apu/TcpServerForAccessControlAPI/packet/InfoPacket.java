package com.apu.TcpServerForAccessControlAPI.packet;

public class InfoPacket extends RawPacket {
    
    MessageType messageType = MessageType.INFO;
    String      cardNumber;
    Integer     userId;       
    EventType   eventType;
    Integer     eventId;
    String      info;
    
}

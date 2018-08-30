package com.apu.TcpServerForAccessControlAPI.packet;

public class ServicePacket extends RawPacket {
    
    MessageType messageType = MessageType.SERVICE;
    EventType   eventType;
    Integer     eventId;
    String      info;
    
}

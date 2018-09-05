package com.apu.TcpServerForAccessControlAPI.packet;

public enum EventType {
    ACCESS_ALLOW,
    ACCESS_DENIED,
    ENTER_QUERY,
    EXIT_QUERY;
    
    public int getIndex() { return ordinal() + 1; }
}

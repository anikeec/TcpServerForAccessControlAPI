package com.apu.TcpServerForAccessControlAPI.rest;

public interface ActivatableEntity extends AccessControlEntity {
    
    Boolean getActive();

    void setActive(Boolean active);
    
}

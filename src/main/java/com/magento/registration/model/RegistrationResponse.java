package com.magento.registration.model;

import java.io.Serializable;

public class RegistrationResponse implements Serializable{

    private static final long serialVersionUID = -9080264612957681611L;

    public String registrationResponse;

    public RegistrationResponse(){};

    public String getRegistrationResponse() {
        return registrationResponse;
    }

    public void setRegistrationResponse(String registrationResponse) {
        this.registrationResponse = registrationResponse;
    }
}

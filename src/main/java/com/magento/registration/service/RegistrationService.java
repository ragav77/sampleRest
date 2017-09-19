package com.magento.registration.service;

import com.magento.registration.model.NewCustomerAccountRequest;
import com.magento.registration.model.RegistrationResponse;


public interface RegistrationService {

    RegistrationResponse registerNewAccount(NewCustomerAccountRequest newCustomerAccountRequest);

}

package com.magento.registration.controller;

import com.magento.registration.model.NewCustomerAccountRequest;
import com.magento.registration.model.RegistrationResponse;
import com.magento.registration.service.RegistrationService;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class RegistrationController {

    private final Log logger = LogFactory.getLog(RegistrationController.class);

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(value = "/customer/account/createpost", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    public RegistrationResponse registerNewAccount(@RequestBody NewCustomerAccountRequest newCustomerAccountRequest)
    {
       RegistrationResponse registrationResponse = registrationService.registerNewAccount(newCustomerAccountRequest);
       return registrationResponse;
    }

}

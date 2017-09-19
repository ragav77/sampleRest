package com.magento.registration.service.impl;

import com.magento.registration.config.AppConfig;
import com.magento.registration.model.NewCustomerAccountRequest;
import com.magento.registration.model.RegistrationResponse;
import com.magento.registration.service.RegistrationService;
import com.magento.registration.utils.RequestBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

@Service
public class RegistrationServiceImpl implements RegistrationService{

    Log logger = LogFactory.getLog(RegistrationServiceImpl.class);

    @Resource
    RequestBuilder requestBuilder;

    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private AppConfig appConfig;

    @Override
    public RegistrationResponse registerNewAccount(NewCustomerAccountRequest newCustomerAccountRequest)
    {
        HttpHeaders httpHeaders = requestBuilder.buildHttpHeaders();
        RegistrationResponse registrationResponse = null;


        try {
            URI uri = requestBuilder.buildURI(appConfig.getMagentoRegistrationEndpoint());
            HttpEntity<NewCustomerAccountRequest> requestEntity = new HttpEntity(newCustomerAccountRequest,httpHeaders);


            //ResponseEntity<Map> rawResponse = restTemplate.exchange(uri, HttpMethod.POST,requestEntity,Map.class);
            ResponseEntity<String> st = restTemplate.exchange(uri, HttpMethod.POST, requestEntity, String.class);

             registrationResponse = new RegistrationResponse();
            logger.error("rawresponse--->"+st.getStatusCode());
            logger.error("rawresponse body--->"+st.getBody());
            if(st.getStatusCode().is2xxSuccessful())
                registrationResponse.setRegistrationResponse("Successful Registration");
            else
                registrationResponse.setRegistrationResponse("Registration failed");

        }
        catch(HttpClientErrorException | HttpServerErrorException | URISyntaxException e)
        {
            logger.error("Error occured"+e.toString());
        }
        return registrationResponse;
    }

}

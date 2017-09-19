package com.magento.registration.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;


@Component
public class RequestBuilder {

    Log logger = LogFactory.getLog(RequestBuilder.class);

    public URI buildURI(String endPoint) throws URISyntaxException {
        URI uri = null;
        try {
            uri = new URI(endPoint);
        }
        catch(URISyntaxException e) {
            logger.error("URISyntax Exception in requestBuilder");
            throw e;
        }
        return uri;
    }

    public HttpHeaders buildHttpHeaders(){

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        headers.set("Content-Type","application/json");
        headers.add(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");

        return headers;
    }

}

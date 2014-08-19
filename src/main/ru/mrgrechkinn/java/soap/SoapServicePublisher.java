package ru.mrgrechkinn.java.soap;

import javax.xml.ws.Endpoint;

import com.endrysan.business.fr.soap.SoapServiceImpl;


public class SoapServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1717/forgeReports/soap/message", new SoapServiceImpl());
     }
}

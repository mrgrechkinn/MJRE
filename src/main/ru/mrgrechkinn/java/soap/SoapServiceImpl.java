package ru.mrgrechkinn.java.soap;

import javax.jws.WebService;

import com.endrysan.business.fr.soap.SoapServiceInterface;

@WebService(endpointInterface = "com.endrysan.business.fr.soap.SoapServiceInterface")
public class SoapServiceImpl implements SoapServiceInterface {

    @Override
    public String printMessage() {
        return "Hello world of JAX-WS";
    }
}

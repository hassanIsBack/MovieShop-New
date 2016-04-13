
package com.bankingpayment.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;



@WebServiceClient(name = "BankingService", targetNamespace = "http://service.bank.com/", wsdlLocation = "http://localhost:8080/Bank/BankingService?WSDL")
public class BankingService_Service
    extends Service
{

    private final static URL BANKINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException BANKINGSERVICE_EXCEPTION;
    private final static QName BANKINGSERVICE_QNAME = new QName("http://service.bank.com/", "BankingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Bank/BankingService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKINGSERVICE_WSDL_LOCATION = url;
        BANKINGSERVICE_EXCEPTION = e;
    }

    public BankingService_Service() {
        super(__getWsdlLocation(), BANKINGSERVICE_QNAME);
    }

    public BankingService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKINGSERVICE_QNAME, features);
    }

    public BankingService_Service(URL wsdlLocation) {
        super(wsdlLocation, BANKINGSERVICE_QNAME);
    }

    public BankingService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKINGSERVICE_QNAME, features);
    }

    public BankingService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankingService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankingService
     */
    @WebEndpoint(name = "BankingServicePort")
    public BankingService getBankingServicePort() {
        return super.getPort(new QName("http://service.bank.com/", "BankingServicePort"), BankingService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankingService
     */
    @WebEndpoint(name = "BankingServicePort")
    public BankingService getBankingServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.bank.com/", "BankingServicePort"), BankingService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKINGSERVICE_EXCEPTION!= null) {
            throw BANKINGSERVICE_EXCEPTION;
        }
        return BANKINGSERVICE_WSDL_LOCATION;
    }

}

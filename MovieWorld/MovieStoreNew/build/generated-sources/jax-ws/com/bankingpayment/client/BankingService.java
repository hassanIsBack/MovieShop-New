
package com.bankingpayment.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankingService", targetNamespace = "http://service.bank.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankingService {


    /**
     * 
     * @param price
     * @param buyerAccountNumber
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "orderPayment", targetNamespace = "http://service.bank.com/", className = "com.bankingpayment.client.OrderPayment")
    @ResponseWrapper(localName = "orderPaymentResponse", targetNamespace = "http://service.bank.com/", className = "com.bankingpayment.client.OrderPaymentResponse")
    @Action(input = "http://service.bank.com/BankingService/orderPaymentRequest", output = "http://service.bank.com/BankingService/orderPaymentResponse")
    public String orderPayment(
        @WebParam(name = "buyerAccountNumber", targetNamespace = "")
        long buyerAccountNumber,
        @WebParam(name = "price", targetNamespace = "")
        int price);

}

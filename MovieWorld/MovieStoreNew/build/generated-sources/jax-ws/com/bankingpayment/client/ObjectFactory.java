
package com.bankingpayment.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bankingpayment.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderPayment_QNAME = new QName("http://service.bank.com/", "orderPayment");
    private final static QName _OrderPaymentResponse_QNAME = new QName("http://service.bank.com/", "orderPaymentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bankingpayment.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderPayment }
     * 
     */
    public OrderPayment createOrderPayment() {
        return new OrderPayment();
    }

    /**
     * Create an instance of {@link OrderPaymentResponse }
     * 
     */
    public OrderPaymentResponse createOrderPaymentResponse() {
        return new OrderPaymentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bank.com/", name = "orderPayment")
    public JAXBElement<OrderPayment> createOrderPayment(OrderPayment value) {
        return new JAXBElement<OrderPayment>(_OrderPayment_QNAME, OrderPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bank.com/", name = "orderPaymentResponse")
    public JAXBElement<OrderPaymentResponse> createOrderPaymentResponse(OrderPaymentResponse value) {
        return new JAXBElement<OrderPaymentResponse>(_OrderPaymentResponse_QNAME, OrderPaymentResponse.class, null, value);
    }

}

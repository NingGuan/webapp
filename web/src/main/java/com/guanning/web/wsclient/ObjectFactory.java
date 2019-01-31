
package com.guanning.web.wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.guanning.web.wsclient package. 
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

    private final static QName _SayHelloResponse_QNAME = new QName("http://webservice.leftso.com/", "sayHelloResponse");
    private final static QName _SayCXF_QNAME = new QName("http://webservice.leftso.com/", "sayCXF");
    private final static QName _SayCXFResponse_QNAME = new QName("http://webservice.leftso.com/", "sayCXFResponse");
    private final static QName _SayHello_QNAME = new QName("http://webservice.leftso.com/", "sayHello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.guanning.web.wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayCXFResponse }
     * 
     */
    public SayCXFResponse createSayCXFResponse() {
        return new SayCXFResponse();
    }

    /**
     * Create an instance of {@link SayCXF }
     * 
     */
    public SayCXF createSayCXF() {
        return new SayCXF();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.leftso.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayCXF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.leftso.com/", name = "sayCXF")
    public JAXBElement<SayCXF> createSayCXF(SayCXF value) {
        return new JAXBElement<SayCXF>(_SayCXF_QNAME, SayCXF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayCXFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.leftso.com/", name = "sayCXFResponse")
    public JAXBElement<SayCXFResponse> createSayCXFResponse(SayCXFResponse value) {
        return new JAXBElement<SayCXFResponse>(_SayCXFResponse_QNAME, SayCXFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.leftso.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

}

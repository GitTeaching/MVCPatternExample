
package org.soa.ws.tp2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soa.ws.tp2 package. 
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

    private final static QName _GetMontantResponse_QNAME = new QName("http://tp2.ws.soa.org/", "getMontantResponse");
    private final static QName _NameHelloResponse_QNAME = new QName("http://tp2.ws.soa.org/", "nameHelloResponse");
    private final static QName _SimpleHello_QNAME = new QName("http://tp2.ws.soa.org/", "simpleHello");
    private final static QName _SimpleHelloResponse_QNAME = new QName("http://tp2.ws.soa.org/", "simpleHelloResponse");
    private final static QName _GetMontant_QNAME = new QName("http://tp2.ws.soa.org/", "getMontant");
    private final static QName _NameHello_QNAME = new QName("http://tp2.ws.soa.org/", "nameHello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soa.ws.tp2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMontant }
     * 
     */
    public GetMontant createGetMontant() {
        return new GetMontant();
    }

    /**
     * Create an instance of {@link SimpleHelloResponse }
     * 
     */
    public SimpleHelloResponse createSimpleHelloResponse() {
        return new SimpleHelloResponse();
    }

    /**
     * Create an instance of {@link SimpleHello }
     * 
     */
    public SimpleHello createSimpleHello() {
        return new SimpleHello();
    }

    /**
     * Create an instance of {@link NameHelloResponse }
     * 
     */
    public NameHelloResponse createNameHelloResponse() {
        return new NameHelloResponse();
    }

    /**
     * Create an instance of {@link GetMontantResponse }
     * 
     */
    public GetMontantResponse createGetMontantResponse() {
        return new GetMontantResponse();
    }

    /**
     * Create an instance of {@link NameHello }
     * 
     */
    public NameHello createNameHello() {
        return new NameHello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMontantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2.ws.soa.org/", name = "getMontantResponse")
    public JAXBElement<GetMontantResponse> createGetMontantResponse(GetMontantResponse value) {
        return new JAXBElement<GetMontantResponse>(_GetMontantResponse_QNAME, GetMontantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2.ws.soa.org/", name = "nameHelloResponse")
    public JAXBElement<NameHelloResponse> createNameHelloResponse(NameHelloResponse value) {
        return new JAXBElement<NameHelloResponse>(_NameHelloResponse_QNAME, NameHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2.ws.soa.org/", name = "simpleHello")
    public JAXBElement<SimpleHello> createSimpleHello(SimpleHello value) {
        return new JAXBElement<SimpleHello>(_SimpleHello_QNAME, SimpleHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2.ws.soa.org/", name = "simpleHelloResponse")
    public JAXBElement<SimpleHelloResponse> createSimpleHelloResponse(SimpleHelloResponse value) {
        return new JAXBElement<SimpleHelloResponse>(_SimpleHelloResponse_QNAME, SimpleHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMontant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2.ws.soa.org/", name = "getMontant")
    public JAXBElement<GetMontant> createGetMontant(GetMontant value) {
        return new JAXBElement<GetMontant>(_GetMontant_QNAME, GetMontant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2.ws.soa.org/", name = "nameHello")
    public JAXBElement<NameHello> createNameHello(NameHello value) {
        return new JAXBElement<NameHello>(_NameHello_QNAME, NameHello.class, null, value);
    }

}

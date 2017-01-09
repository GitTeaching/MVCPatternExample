
package org.soa.ws.tp4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soa.ws.tp4 package. 
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

    private final static QName _AddProduct_QNAME = new QName("http://tp4.ws.soa.org/", "addProduct");
    private final static QName _GetProductById_QNAME = new QName("http://tp4.ws.soa.org/", "getProductById");
    private final static QName _GetProductByIdResponse_QNAME = new QName("http://tp4.ws.soa.org/", "getProductByIdResponse");
    private final static QName _TousLesProduits_QNAME = new QName("http://tp4.ws.soa.org/", "tousLesProduits");
    private final static QName _AddProductResponse_QNAME = new QName("http://tp4.ws.soa.org/", "addProductResponse");
    private final static QName _TousLesProduitsResponse_QNAME = new QName("http://tp4.ws.soa.org/", "tousLesProduitsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soa.ws.tp4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link GetProductById }
     * 
     */
    public GetProductById createGetProductById() {
        return new GetProductById();
    }

    /**
     * Create an instance of {@link GetProductByIdResponse }
     * 
     */
    public GetProductByIdResponse createGetProductByIdResponse() {
        return new GetProductByIdResponse();
    }

    /**
     * Create an instance of {@link TousLesProduits }
     * 
     */
    public TousLesProduits createTousLesProduits() {
        return new TousLesProduits();
    }

    /**
     * Create an instance of {@link TousLesProduitsResponse }
     * 
     */
    public TousLesProduitsResponse createTousLesProduitsResponse() {
        return new TousLesProduitsResponse();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp4.ws.soa.org/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp4.ws.soa.org/", name = "getProductById")
    public JAXBElement<GetProductById> createGetProductById(GetProductById value) {
        return new JAXBElement<GetProductById>(_GetProductById_QNAME, GetProductById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp4.ws.soa.org/", name = "getProductByIdResponse")
    public JAXBElement<GetProductByIdResponse> createGetProductByIdResponse(GetProductByIdResponse value) {
        return new JAXBElement<GetProductByIdResponse>(_GetProductByIdResponse_QNAME, GetProductByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TousLesProduits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp4.ws.soa.org/", name = "tousLesProduits")
    public JAXBElement<TousLesProduits> createTousLesProduits(TousLesProduits value) {
        return new JAXBElement<TousLesProduits>(_TousLesProduits_QNAME, TousLesProduits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp4.ws.soa.org/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TousLesProduitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp4.ws.soa.org/", name = "tousLesProduitsResponse")
    public JAXBElement<TousLesProduitsResponse> createTousLesProduitsResponse(TousLesProduitsResponse value) {
        return new JAXBElement<TousLesProduitsResponse>(_TousLesProduitsResponse_QNAME, TousLesProduitsResponse.class, null, value);
    }

}

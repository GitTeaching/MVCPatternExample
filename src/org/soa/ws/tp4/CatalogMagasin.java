
package org.soa.ws.tp4;

import java.util.List;
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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CatalogMagasin", targetNamespace = "http://tp4.ws.soa.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CatalogMagasin {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProduct", targetNamespace = "http://tp4.ws.soa.org/", className = "org.soa.ws.tp4.AddProduct")
    @ResponseWrapper(localName = "addProductResponse", targetNamespace = "http://tp4.ws.soa.org/", className = "org.soa.ws.tp4.AddProductResponse")
    @Action(input = "http://tp4.ws.soa.org/CatalogMagasin/addProductRequest", output = "http://tp4.ws.soa.org/CatalogMagasin/addProductResponse")
    public boolean addProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        double arg2);

    /**
     * 
     * @return
     *     returns java.util.List<org.soa.ws.tp4.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "tousLesProduits", targetNamespace = "http://tp4.ws.soa.org/", className = "org.soa.ws.tp4.TousLesProduits")
    @ResponseWrapper(localName = "tousLesProduitsResponse", targetNamespace = "http://tp4.ws.soa.org/", className = "org.soa.ws.tp4.TousLesProduitsResponse")
    @Action(input = "http://tp4.ws.soa.org/CatalogMagasin/tousLesProduitsRequest", output = "http://tp4.ws.soa.org/CatalogMagasin/tousLesProduitsResponse")
    public List<Product> tousLesProduits();

    /**
     * 
     * @param produitID
     * @return
     *     returns org.soa.ws.tp4.Product
     */
    @WebMethod
    @WebResult(name = "produitRetourn\u00e9", targetNamespace = "")
    @RequestWrapper(localName = "getProductById", targetNamespace = "http://tp4.ws.soa.org/", className = "org.soa.ws.tp4.GetProductById")
    @ResponseWrapper(localName = "getProductByIdResponse", targetNamespace = "http://tp4.ws.soa.org/", className = "org.soa.ws.tp4.GetProductByIdResponse")
    @Action(input = "http://tp4.ws.soa.org/CatalogMagasin/getProductByIdRequest", output = "http://tp4.ws.soa.org/CatalogMagasin/getProductByIdResponse")
    public Product getProductById(
        @WebParam(name = "produitID", targetNamespace = "")
        String produitID);

}

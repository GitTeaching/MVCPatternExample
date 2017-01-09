
package org.soa.ws.tp4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProductByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProductByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produitRetourné" type="{http://tp4.ws.soa.org/}product" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductByIdResponse", propOrder = {
    "produitRetourn\u00e9"
})
public class GetProductByIdResponse {

    protected Product produitRetourné;

    /**
     * Gets the value of the produitRetourné property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduitRetourné() {
        return produitRetourné;
    }

    /**
     * Sets the value of the produitRetourné property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduitRetourné(Product value) {
        this.produitRetourné = value;
    }

}

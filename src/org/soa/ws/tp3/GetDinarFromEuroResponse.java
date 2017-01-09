
package org.soa.ws.tp3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDinarFromEuroResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDinarFromEuroResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montantDinar" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDinarFromEuroResponse", propOrder = {
    "montantDinar"
})
public class GetDinarFromEuroResponse {

    protected double montantDinar;

    /**
     * Gets the value of the montantDinar property.
     * 
     */
    public double getMontantDinar() {
        return montantDinar;
    }

    /**
     * Sets the value of the montantDinar property.
     * 
     */
    public void setMontantDinar(double value) {
        this.montantDinar = value;
    }

}


package org.soa.ws.tp3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDinarFromEuro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDinarFromEuro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montantEuro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDinarFromEuro", propOrder = {
    "montantEuro"
})
public class GetDinarFromEuro {

    protected double montantEuro;

    /**
     * Gets the value of the montantEuro property.
     * 
     */
    public double getMontantEuro() {
        return montantEuro;
    }

    /**
     * Sets the value of the montantEuro property.
     * 
     */
    public void setMontantEuro(double value) {
        this.montantEuro = value;
    }

}

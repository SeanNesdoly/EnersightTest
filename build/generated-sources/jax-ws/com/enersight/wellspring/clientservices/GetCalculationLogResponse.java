
package com.enersight.wellspring.clientservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetCalculationLogResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCalculationLogResult"
})
@XmlRootElement(name = "GetCalculationLogResponse")
public class GetCalculationLogResponse {

    @XmlElement(name = "GetCalculationLogResult")
    protected String getCalculationLogResult;

    /**
     * Gets the value of the getCalculationLogResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCalculationLogResult() {
        return getCalculationLogResult;
    }

    /**
     * Sets the value of the getCalculationLogResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCalculationLogResult(String value) {
        this.getCalculationLogResult = value;
    }

}

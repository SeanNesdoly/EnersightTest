
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
 *         &lt;element name="GetLoginLogResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getLoginLogResult"
})
@XmlRootElement(name = "GetLoginLogResponse")
public class GetLoginLogResponse {

    @XmlElement(name = "GetLoginLogResult")
    protected String getLoginLogResult;

    /**
     * Gets the value of the getLoginLogResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetLoginLogResult() {
        return getLoginLogResult;
    }

    /**
     * Sets the value of the getLoginLogResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetLoginLogResult(String value) {
        this.getLoginLogResult = value;
    }

}

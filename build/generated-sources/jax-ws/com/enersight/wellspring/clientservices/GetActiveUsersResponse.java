
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
 *         &lt;element name="GetActiveUsersResult" type="{http://enersight.com/WellSpring/ClientServices}ArrayOfString" minOccurs="0"/>
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
    "getActiveUsersResult"
})
@XmlRootElement(name = "GetActiveUsersResponse")
public class GetActiveUsersResponse {

    @XmlElement(name = "GetActiveUsersResult")
    protected ArrayOfString getActiveUsersResult;

    /**
     * Gets the value of the getActiveUsersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetActiveUsersResult() {
        return getActiveUsersResult;
    }

    /**
     * Sets the value of the getActiveUsersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetActiveUsersResult(ArrayOfString value) {
        this.getActiveUsersResult = value;
    }

}


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
 *         &lt;element name="IsActiveUserSessionResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isActiveUserSessionResult"
})
@XmlRootElement(name = "IsActiveUserSessionResponse")
public class IsActiveUserSessionResponse {

    @XmlElement(name = "IsActiveUserSessionResult")
    protected boolean isActiveUserSessionResult;

    /**
     * Gets the value of the isActiveUserSessionResult property.
     * 
     */
    public boolean isIsActiveUserSessionResult() {
        return isActiveUserSessionResult;
    }

    /**
     * Sets the value of the isActiveUserSessionResult property.
     * 
     */
    public void setIsActiveUserSessionResult(boolean value) {
        this.isActiveUserSessionResult = value;
    }

}

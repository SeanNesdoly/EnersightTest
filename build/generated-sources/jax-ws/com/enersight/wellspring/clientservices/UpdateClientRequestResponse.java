
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
 *         &lt;element name="UpdateClientRequestResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateClientRequestResult"
})
@XmlRootElement(name = "UpdateClientRequestResponse")
public class UpdateClientRequestResponse {

    @XmlElement(name = "UpdateClientRequestResult")
    protected boolean updateClientRequestResult;

    /**
     * Gets the value of the updateClientRequestResult property.
     * 
     */
    public boolean isUpdateClientRequestResult() {
        return updateClientRequestResult;
    }

    /**
     * Sets the value of the updateClientRequestResult property.
     * 
     */
    public void setUpdateClientRequestResult(boolean value) {
        this.updateClientRequestResult = value;
    }

}

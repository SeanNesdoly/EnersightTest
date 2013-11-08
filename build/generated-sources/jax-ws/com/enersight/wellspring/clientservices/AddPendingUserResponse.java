
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
 *         &lt;element name="AddPendingUserResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addPendingUserResult"
})
@XmlRootElement(name = "AddPendingUserResponse")
public class AddPendingUserResponse {

    @XmlElement(name = "AddPendingUserResult")
    protected boolean addPendingUserResult;

    /**
     * Gets the value of the addPendingUserResult property.
     * 
     */
    public boolean isAddPendingUserResult() {
        return addPendingUserResult;
    }

    /**
     * Sets the value of the addPendingUserResult property.
     * 
     */
    public void setAddPendingUserResult(boolean value) {
        this.addPendingUserResult = value;
    }

}

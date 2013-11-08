
package com.enersight.wellspring.clientservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstRequestedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="addToMailingList" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isDeniedAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lastRequestedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="requestAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "key",
    "eMailAddress",
    "firstRequestedOn",
    "addToMailingList",
    "isDeniedAccess",
    "lastRequestedOn",
    "requestAttempts"
})
@XmlRootElement(name = "UpdateClientRequest")
public class UpdateClientRequest {

    protected String key;
    protected String eMailAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstRequestedOn;
    protected boolean addToMailingList;
    protected boolean isDeniedAccess;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRequestedOn;
    protected int requestAttempts;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the eMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailAddress() {
        return eMailAddress;
    }

    /**
     * Sets the value of the eMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailAddress(String value) {
        this.eMailAddress = value;
    }

    /**
     * Gets the value of the firstRequestedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstRequestedOn() {
        return firstRequestedOn;
    }

    /**
     * Sets the value of the firstRequestedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstRequestedOn(XMLGregorianCalendar value) {
        this.firstRequestedOn = value;
    }

    /**
     * Gets the value of the addToMailingList property.
     * 
     */
    public boolean isAddToMailingList() {
        return addToMailingList;
    }

    /**
     * Sets the value of the addToMailingList property.
     * 
     */
    public void setAddToMailingList(boolean value) {
        this.addToMailingList = value;
    }

    /**
     * Gets the value of the isDeniedAccess property.
     * 
     */
    public boolean isIsDeniedAccess() {
        return isDeniedAccess;
    }

    /**
     * Sets the value of the isDeniedAccess property.
     * 
     */
    public void setIsDeniedAccess(boolean value) {
        this.isDeniedAccess = value;
    }

    /**
     * Gets the value of the lastRequestedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRequestedOn() {
        return lastRequestedOn;
    }

    /**
     * Sets the value of the lastRequestedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRequestedOn(XMLGregorianCalendar value) {
        this.lastRequestedOn = value;
    }

    /**
     * Gets the value of the requestAttempts property.
     * 
     */
    public int getRequestAttempts() {
        return requestAttempts;
    }

    /**
     * Sets the value of the requestAttempts property.
     * 
     */
    public void setRequestAttempts(int value) {
        this.requestAttempts = value;
    }

}

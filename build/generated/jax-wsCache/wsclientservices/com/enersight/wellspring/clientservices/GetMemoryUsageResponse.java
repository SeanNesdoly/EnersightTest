
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
 *         &lt;element name="GetMemoryUsageResult" type="{http://enersight.com/WellSpring/ClientServices}ArrayOfString" minOccurs="0"/>
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
    "getMemoryUsageResult"
})
@XmlRootElement(name = "GetMemoryUsageResponse")
public class GetMemoryUsageResponse {

    @XmlElement(name = "GetMemoryUsageResult")
    protected ArrayOfString getMemoryUsageResult;

    /**
     * Gets the value of the getMemoryUsageResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetMemoryUsageResult() {
        return getMemoryUsageResult;
    }

    /**
     * Sets the value of the getMemoryUsageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetMemoryUsageResult(ArrayOfString value) {
        this.getMemoryUsageResult = value;
    }

}

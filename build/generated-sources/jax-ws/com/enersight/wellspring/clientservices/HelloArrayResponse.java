
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
 *         &lt;element name="HelloArrayResult" type="{http://enersight.com/WellSpring/ClientServices}ArrayOfDouble" minOccurs="0"/>
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
    "helloArrayResult"
})
@XmlRootElement(name = "HelloArrayResponse")
public class HelloArrayResponse {

    @XmlElement(name = "HelloArrayResult")
    protected ArrayOfDouble helloArrayResult;

    /**
     * Gets the value of the helloArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDouble }
     *     
     */
    public ArrayOfDouble getHelloArrayResult() {
        return helloArrayResult;
    }

    /**
     * Sets the value of the helloArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDouble }
     *     
     */
    public void setHelloArrayResult(ArrayOfDouble value) {
        this.helloArrayResult = value;
    }

}

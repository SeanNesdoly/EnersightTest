
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
 *         &lt;element name="GetMemoryUsage2Result" type="{http://enersight.com/WellSpring/ClientServices}InstanceInfo"/>
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
    "getMemoryUsage2Result"
})
@XmlRootElement(name = "GetMemoryUsage2Response")
public class GetMemoryUsage2Response {

    @XmlElement(name = "GetMemoryUsage2Result", required = true)
    protected InstanceInfo getMemoryUsage2Result;

    /**
     * Gets the value of the getMemoryUsage2Result property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceInfo }
     *     
     */
    public InstanceInfo getGetMemoryUsage2Result() {
        return getMemoryUsage2Result;
    }

    /**
     * Sets the value of the getMemoryUsage2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceInfo }
     *     
     */
    public void setGetMemoryUsage2Result(InstanceInfo value) {
        this.getMemoryUsage2Result = value;
    }

}

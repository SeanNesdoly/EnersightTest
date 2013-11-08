
package com.enersight.wellspring.clientservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstanceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstancePID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InstanceMemory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceInfo", propOrder = {
    "instancePID",
    "instanceMemory"
})
public class InstanceInfo {

    @XmlElement(name = "InstancePID")
    protected int instancePID;
    @XmlElement(name = "InstanceMemory")
    protected long instanceMemory;

    /**
     * Gets the value of the instancePID property.
     * 
     */
    public int getInstancePID() {
        return instancePID;
    }

    /**
     * Sets the value of the instancePID property.
     * 
     */
    public void setInstancePID(int value) {
        this.instancePID = value;
    }

    /**
     * Gets the value of the instanceMemory property.
     * 
     */
    public long getInstanceMemory() {
        return instanceMemory;
    }

    /**
     * Sets the value of the instanceMemory property.
     * 
     */
    public void setInstanceMemory(long value) {
        this.instanceMemory = value;
    }

}

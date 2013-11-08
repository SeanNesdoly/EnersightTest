
package com.enersight.wellspring.clientservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForwardXmlDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForwardXmlDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationOffline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForwardXmlDocument", propOrder = {
    "application",
    "applicationOffline",
    "test",
    "testDescription"
})
public class ForwardXmlDocument {

    @XmlElement(name = "Application")
    protected String application;
    @XmlElement(name = "ApplicationOffline")
    protected String applicationOffline;
    @XmlElement(name = "Test")
    protected String test;
    @XmlElement(name = "TestDescription")
    protected String testDescription;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the applicationOffline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationOffline() {
        return applicationOffline;
    }

    /**
     * Sets the value of the applicationOffline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationOffline(String value) {
        this.applicationOffline = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTest(String value) {
        this.test = value;
    }

    /**
     * Gets the value of the testDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestDescription() {
        return testDescription;
    }

    /**
     * Sets the value of the testDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestDescription(String value) {
        this.testDescription = value;
    }

}

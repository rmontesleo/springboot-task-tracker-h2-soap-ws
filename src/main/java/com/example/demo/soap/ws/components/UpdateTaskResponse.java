//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.25 at 01:13:16 PM CST 
//


package com.example.demo.soap.ws.components;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="updatedTask" type="{http://www.soap.demo.example.com/api/taskTracker}TaskInfo" minOccurs="0"/>
 *         &lt;element name="serviceStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "updatedTask",
    "serviceStatus"
})
@XmlRootElement(name = "updateTaskResponse")
public class UpdateTaskResponse {

    protected TaskInfo updatedTask;
    protected int serviceStatus;

    /**
     * Gets the value of the updatedTask property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfo }
     *     
     */
    public TaskInfo getUpdatedTask() {
        return updatedTask;
    }

    /**
     * Sets the value of the updatedTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfo }
     *     
     */
    public void setUpdatedTask(TaskInfo value) {
        this.updatedTask = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     */
    public int getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     */
    public void setServiceStatus(int value) {
        this.serviceStatus = value;
    }

}

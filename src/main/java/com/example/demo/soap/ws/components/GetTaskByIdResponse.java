//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.25 at 01:13:16 PM CST 
//


package com.example.demo.soap.ws.components;

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
 *         &lt;element name="taskInfo" type="{http://www.soap.demo.example.com/api/taskTracker}TaskInfo"/>
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
    "taskInfo",
    "serviceStatus"
})
@XmlRootElement(name = "getTaskByIdResponse")
public class GetTaskByIdResponse {

    @XmlElement(required = true)
    protected TaskInfo taskInfo;
    protected int serviceStatus;

    /**
     * Gets the value of the taskInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfo }
     *     
     */
    public TaskInfo getTaskInfo() {
        return taskInfo;
    }

    /**
     * Sets the value of the taskInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfo }
     *     
     */
    public void setTaskInfo(TaskInfo value) {
        this.taskInfo = value;
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
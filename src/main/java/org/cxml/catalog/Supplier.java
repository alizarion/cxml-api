//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.06 at 12:45:09 AM EDT 
//


package org.cxml.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "comments",
    "supplierID",
    "supplierLocation"
})
@XmlRootElement(name = "Supplier")
public class Supplier {

    @XmlAttribute(name = "corporateURL")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String corporateURL;
    @XmlAttribute(name = "storeFrontURL")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String storeFrontURL;
    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "Comments")
    protected Comments comments;
    @XmlElement(name = "SupplierID", required = true)
    protected List<SupplierID> supplierID;
    @XmlElement(name = "SupplierLocation")
    protected List<SupplierLocation> supplierLocation;

    /**
     * Gets the value of the corporateURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateURL() {
        return corporateURL;
    }

    /**
     * Sets the value of the corporateURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateURL(String value) {
        this.corporateURL = value;
    }

    /**
     * Gets the value of the storeFrontURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreFrontURL() {
        return storeFrontURL;
    }

    /**
     * Sets the value of the storeFrontURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreFrontURL(String value) {
        this.storeFrontURL = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link Comments }
     *     
     */
    public Comments getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comments }
     *     
     */
    public void setComments(Comments value) {
        this.comments = value;
    }

    /**
     * Gets the value of the supplierID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierID }
     * 
     * 
     */
    public List<SupplierID> getSupplierID() {
        if (supplierID == null) {
            supplierID = new ArrayList<SupplierID>();
        }
        return this.supplierID;
    }

    /**
     * Gets the value of the supplierLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierLocation }
     * 
     * 
     */
    public List<SupplierLocation> getSupplierLocation() {
        if (supplierLocation == null) {
            supplierLocation = new ArrayList<SupplierLocation>();
        }
        return this.supplierLocation;
    }

}
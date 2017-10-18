//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.25 at 08:37:51 PM EDT 
//


package org.restsql.core.sqlresource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Table complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Table">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *		 &lt;sequence>
 *			&lt;element name="columns" type="{http://restsql.org/schema}Column" maxOccurs="unbounded"></element>
 *		 &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rowAlias" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rowSetAlias" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="role" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Parent"/>
 *             &lt;enumeration value="ParentExtension"/>
 *             &lt;enumeration value="Child"/>
 *             &lt;enumeration value="ChildExtension"/>
 *             &lt;enumeration value="Join"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Table", propOrder = {
	    "columns"
	})
public class Table {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "alias")
    protected String alias;
    @XmlAttribute(name = "rowAlias")
    protected String rowAlias;
    @XmlAttribute(name = "rowSetAlias")
    protected String rowSetAlias;
    @XmlAttribute(name = "role", required = true)
    protected String role;
    
    @XmlElement(name = "columndef")
    protected List<Column> columns;
    
    
    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the rowAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowAlias() {
        return rowAlias;
    }

    /**
     * Sets the value of the rowAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowAlias(String value) {
        this.rowAlias = value;
    }

    /**
     * Gets the value of the rowSetAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowSetAlias() {
        return rowSetAlias;
    }

    /**
     * Sets the value of the rowSetAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowSetAlias(String value) {
        this.rowSetAlias = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Column }
     * 
     * 
     */
	public List<Column> getColumns() {
		if (this.columns == null) {
			this.columns = new ArrayList<Column>();
		}
		return this.columns;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Table [name=" + name + ", alias=" + alias + ", rowAlias=" + rowAlias + ", rowSetAlias="
				+ rowSetAlias + ", role=" + role + ", columns=" + columns + "]";
	}


}

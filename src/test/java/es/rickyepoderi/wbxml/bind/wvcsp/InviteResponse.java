//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.25 at 05:48:09 PM CEST 
//


package es.rickyepoderi.wbxml.bind.wvcsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inviteID",
    "acceptance",
    "sender",
    "responseNote"
})
@XmlRootElement(name = "Invite-Response")
public class InviteResponse {

    @XmlElement(name = "InviteID", required = true)
    protected String inviteID;
    @XmlElement(name = "Acceptance", required = true)
    protected String acceptance;
    @XmlElement(name = "Sender", required = true)
    protected Sender sender;
    @XmlElement(name = "ResponseNote")
    protected String responseNote;

    /**
     * Gets the value of the inviteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteID() {
        return inviteID;
    }

    /**
     * Sets the value of the inviteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteID(String value) {
        this.inviteID = value;
    }

    /**
     * Gets the value of the acceptance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptance() {
        return acceptance;
    }

    /**
     * Sets the value of the acceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptance(String value) {
        this.acceptance = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the responseNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseNote() {
        return responseNote;
    }

    /**
     * Sets the value of the responseNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseNote(String value) {
        this.responseNote = value;
    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.02 a las 11:32:51 AM COT 
//


package com.spring.boot.credibanco.soapWs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para certificates complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="certificates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acceptInternationalCards" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="certificateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificatePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="commerceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="commerceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="commerceTerminalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificates", propOrder = {
    "acceptInternationalCards",
    "certificateName",
    "certificatePassword",
    "commerceCode",
    "commerceName",
    "commerceTerminalCode",
    "id"
})
public class Certificates {

    protected boolean acceptInternationalCards;
    protected String certificateName;
    protected String certificatePassword;
    protected String commerceCode;
    protected String commerceName;
    protected String commerceTerminalCode;
    protected long id;

    /**
     * Obtiene el valor de la propiedad acceptInternationalCards.
     * 
     */
    public boolean isAcceptInternationalCards() {
        return acceptInternationalCards;
    }

    /**
     * Define el valor de la propiedad acceptInternationalCards.
     * 
     */
    public void setAcceptInternationalCards(boolean value) {
        this.acceptInternationalCards = value;
    }

    /**
     * Obtiene el valor de la propiedad certificateName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * Define el valor de la propiedad certificateName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateName(String value) {
        this.certificateName = value;
    }

    /**
     * Obtiene el valor de la propiedad certificatePassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificatePassword() {
        return certificatePassword;
    }

    /**
     * Define el valor de la propiedad certificatePassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificatePassword(String value) {
        this.certificatePassword = value;
    }

    /**
     * Obtiene el valor de la propiedad commerceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceCode() {
        return commerceCode;
    }

    /**
     * Define el valor de la propiedad commerceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceCode(String value) {
        this.commerceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad commerceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceName() {
        return commerceName;
    }

    /**
     * Define el valor de la propiedad commerceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceName(String value) {
        this.commerceName = value;
    }

    /**
     * Obtiene el valor de la propiedad commerceTerminalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceTerminalCode() {
        return commerceTerminalCode;
    }

    /**
     * Define el valor de la propiedad commerceTerminalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceTerminalCode(String value) {
        this.commerceTerminalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

}

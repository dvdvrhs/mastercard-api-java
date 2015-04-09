//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.03 at 10:39:37 AM CST 
//


package com.mastercard.api.partnerwallet.domain.switchapi;

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
 *         &lt;element name="MerchantCheckoutId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OauthToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrecheckoutTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ConsumerWalletId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MerchantParameterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ShippingAddressId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RewardProgramId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="WalletId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "merchantCheckoutId",
    "oauthToken",
    "currencyCode",
    "orderAmount",
    "precheckoutTransactionId",
    "consumerWalletId",
    "merchantParameterId",
    "cardId",
    "shippingAddressId",
    "rewardProgramId",
    "walletId"
})
@XmlRootElement(name = "WalletExpressCheckoutRequest")
public class WalletExpressCheckoutRequest {

    @XmlElement(name = "MerchantCheckoutId", required = true)
    protected String merchantCheckoutId;
    @XmlElement(name = "OauthToken", required = true)
    protected String oauthToken;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "OrderAmount")
    protected double orderAmount;
    @XmlElement(name = "PrecheckoutTransactionId")
    protected String precheckoutTransactionId;
    @XmlElement(name = "ConsumerWalletId")
    protected String consumerWalletId;
    @XmlElement(name = "MerchantParameterId", required = true)
    protected String merchantParameterId;
    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "ShippingAddressId")
    protected String shippingAddressId;
    @XmlElement(name = "RewardProgramId")
    protected String rewardProgramId;
    @XmlElement(name = "WalletId")
    protected String walletId;

    /**
     * Gets the value of the merchantCheckoutId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCheckoutId() {
        return merchantCheckoutId;
    }

    /**
     * Sets the value of the merchantCheckoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCheckoutId(String value) {
        this.merchantCheckoutId = value;
    }

    /**
     * Gets the value of the oauthToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthToken() {
        return oauthToken;
    }

    /**
     * Sets the value of the oauthToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthToken(String value) {
        this.oauthToken = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the orderAmount property.
     * 
     */
    public double getOrderAmount() {
        return orderAmount;
    }

    /**
     * Sets the value of the orderAmount property.
     * 
     */
    public void setOrderAmount(double value) {
        this.orderAmount = value;
    }

    /**
     * Gets the value of the precheckoutTransactionId property.
     * 
     */
    public String getPrecheckoutTransactionId() {
        return precheckoutTransactionId;
    }

    /**
     * Sets the value of the precheckoutTransactionId property.
     * 
     */
    public void setPrecheckoutTransactionId(String value) {
        this.precheckoutTransactionId = value;
    }

    /**
     * Gets the value of the consumerWalletId property.
     * 
     */
    public String getConsumerWalletId() {
        return consumerWalletId;
    }

    /**
     * Sets the value of the consumerWalletId property.
     * 
     */
    public void setConsumerWalletId(String value) {
        this.consumerWalletId = value;
    }

    /**
     * Gets the value of the merchantParameterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantParameterId() {
        return merchantParameterId;
    }

    /**
     * Sets the value of the merchantParameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantParameterId(String value) {
        this.merchantParameterId = value;
    }

    /**
     * Gets the value of the cardId property.
     * 
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the shippingAddressId property.
     * 
     */
    public String getShippingAddressId() {
        return shippingAddressId;
    }

    /**
     * Sets the value of the shippingAddressId property.
     * 
     */
    public void setShippingAddressId(String value) {
        this.shippingAddressId = value;
    }

    /**
     * Gets the value of the rewardProgramId property.
     * 
     */
    public String getRewardProgramId() {
        return rewardProgramId;
    }

    /**
     * Sets the value of the rewardProgramId property.
     * 
     */
    public void setRewardProgramId(String value) {
        this.rewardProgramId = value;
    }

    /**
     * Gets the value of the walletId property.
     * 
     */
    public String getWalletId() {
        return walletId;
    }

    /**
     * Sets the value of the walletId property.
     * 
     */
    public void setWalletId(String value) {
        this.walletId = value;
    }

}

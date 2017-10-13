/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.Card;
import SecureNetRestApiSDK.Api.Models.Encryption;
import SecureNetRestApiSDK.Api.Models.ExtendedInformation;


public class InquiryRequest extends SecureNetRestApiSDK.Api.Requests.SecureNetRequest 
{
     /**
    * Credit-card-specific data. In the case of a card-present transaction, track data from a swiped transaction is the most commonly used property. Required for credit card charges.
    */
    private Card card;
    public Card getCard() {
        return card;
    }

    public void setCard(Card value) {
        card = value;
    }
    
    /**
    * Encryption mode for the transaction. Required when using device-based encryption.
    */
    private Encryption encryption;
    public Encryption getEncryption() {
        return encryption;
    }

    public void setEncryption(Encryption value) {
        encryption = value;
    }
    
    
    private ExtendedInformation extendedInformation;
    public ExtendedInformation getExtendedInformation() {
        return extendedInformation;
    }

    public void setExtendedInformation(ExtendedInformation value) {
        extendedInformation = value;
    }

    public String getUri() throws Exception {
        return "api/Accounts/Inquiry";
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.POST;
    }
}

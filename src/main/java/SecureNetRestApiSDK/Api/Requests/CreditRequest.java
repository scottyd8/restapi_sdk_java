//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.Card;
import SecureNetRestApiSDK.Api.Models.ExtendedInformation;

public class CreditRequest  extends SecureNetRequest 
{
    private double amount;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double value) {
        amount = value;
    }

    private Card card;
    public Card getCard() {
        return card;
    }

    public void setCard(Card value) {
        card = value;
    }

    
	/**
     * Additional data to assist in reporting, ecommerce or moto transactions,
     * and level 2 or level 3 processing. Includes user-defined fields and
     * invoice-related information.
     */
    private ExtendedInformation extendedInformation;
    public ExtendedInformation getExtendedInformation(){
        return extendedInformation;
    }

    public void setExtendedInformation(ExtendedInformation value) {
        extendedInformation = value;
    }
    
    public String getUri() throws Exception {
        return "api/Payments/Credit";
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.POST;
    }
    
    private String authorizationcode = new String();
    public String getAuthorizationCode() {
               return authorizationcode;
    }

    public void setAuthorizationCode(String value) {
            authorizationcode = value;
    }

}



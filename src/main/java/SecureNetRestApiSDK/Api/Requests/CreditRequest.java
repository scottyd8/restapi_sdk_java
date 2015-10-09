//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.Card;

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

    
    public String getUri() throws Exception {
        return "api/Payments/Credit";
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.POST;
    }

}



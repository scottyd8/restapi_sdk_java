//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.Card;

public class TokenCardRequest  extends SecureNetRequest 
{
    private String publicKey = new String();
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String value) {
        publicKey = value;
    }

    private Card card;
    public Card getCard() {
        return card;
    }

    public void setCard(Card value) {
        card = value;
    }

    public String getUri() throws Exception {
        return "api/PreVault/Card";
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.POST;
    }

}



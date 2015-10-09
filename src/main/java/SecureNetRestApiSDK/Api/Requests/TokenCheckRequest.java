//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.Card;
import SecureNetRestApiSDK.Api.Models.Check;

public class TokenCheckRequest  extends SecureNetRequest 
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

    private Check check;
    public Check getCheck() {
        return check;
    }

    public void setCheck(Check value) {
        check = value;
    }

    public String getUri() throws Exception {
        return "api/PreVault/Check";
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.POST;
    }

}



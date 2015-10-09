//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Responses;

import SecureNetRestApiSDK.Api.Responses.SecureNetResponse;

public class TokenCardResponse  extends SecureNetResponse 
{
    private String token = new String();
    public String getToken() {
        return token;
    }

    public void setToken(String value) {
        token = value;
    }

}



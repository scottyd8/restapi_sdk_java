//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SecureNetRestApiSDK.Api.Requests.SecureNetRequest;
import SNET.Core.HttpMethodEnum;

public class RetrieveCustomerRequest  extends SecureNetRequest 
{
    private String customerId ;
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        customerId = value;
    }

    public String getUri() throws Exception {
        return String.format("api/Customers/%s", getCustomerId());
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.GET;
    }

}



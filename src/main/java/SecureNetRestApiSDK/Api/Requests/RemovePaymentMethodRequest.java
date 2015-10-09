//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;

public class RemovePaymentMethodRequest  extends SecureNetRequest 
{
    private String customerId = new String();
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        customerId = value;
    }

    private String paymentMethodId = new String();
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String value) {
        paymentMethodId = value;
    }

    public String getUri() throws Exception {
        return String.format("api/Customers/%s/PaymentMethod/%s", getCustomerId(), getPaymentMethodId());
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.DELETE;
    }

}



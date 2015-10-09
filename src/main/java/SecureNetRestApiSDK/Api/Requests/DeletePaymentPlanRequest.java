//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;

public class DeletePaymentPlanRequest  extends SecureNetRequest 
{
    private String customerId = new String();
    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        customerId = value;
    }

    private String planId = new String();
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String value) {
        planId = value;
    }

    public String getUri() throws Exception {
        return String.format("api/Customers/%s/PaymentSchedules/%s", getCustomerId(), getPlanId());
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.DELETE;
    }

}



//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.VariablePaymentPlan;

public class AddVariablePaymentPlanRequest  extends SecureNetRequest 
{
    private String customerId = new String();
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        customerId = value;
    }

    private VariablePaymentPlan plan;
    public VariablePaymentPlan getPlan() {
        return plan;
    }

    public void setPlan(VariablePaymentPlan value) {
        plan = value;
    }


    public String getUri() throws Exception {
        return String.format("api/Customers/%s/PaymentSchedules/Variable", getCustomerId());
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.POST;
    }

}



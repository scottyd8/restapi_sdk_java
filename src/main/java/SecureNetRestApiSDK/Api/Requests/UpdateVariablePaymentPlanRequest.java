//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;
import SecureNetRestApiSDK.Api.Models.VariablePaymentPlan;

import SNET.Core.HttpMethodEnum;

public class UpdateVariablePaymentPlanRequest  extends SecureNetRequest 
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

    private VariablePaymentPlan plan = new VariablePaymentPlan();
    public VariablePaymentPlan getPlan() {
        return plan;
    }

    public void setPlan(VariablePaymentPlan value) {
        plan = value;
    }

    public String getUri() throws Exception {
        return String.format("api/Customers/%s/PaymentSchedules/variable/%s", getCustomerId(), getPlanId().toString());
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.PUT;
    }

}



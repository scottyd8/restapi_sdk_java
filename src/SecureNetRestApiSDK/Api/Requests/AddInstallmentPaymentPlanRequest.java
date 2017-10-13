//
//  9/17/2015 1:32:19 PM
//

package SecureNetRestApiSDK.Api.Requests;

import SNET.Core.HttpMethodEnum;
import SecureNetRestApiSDK.Api.Models.InstallmentPaymentPlan;

public class AddInstallmentPaymentPlanRequest  extends SecureNetRequest 
{
    private String customerId = new String();
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        customerId = value;
    }

    private InstallmentPaymentPlan plan;
    public InstallmentPaymentPlan getPlan() {
        return plan;
    }

    public void setPlan(InstallmentPaymentPlan value) {
        plan = value;
    }

    public String getUri() throws Exception {
        return String.format("api/Customers/%s/PaymentSchedules/Installment", getCustomerId());
    }

    public HttpMethodEnum getMethod() throws Exception {
        return HttpMethodEnum.POST;
    }

}


